package main

import (
	"encoding/json"
	"io/ioutil"
	"fmt"
	"net/http"
	"github.com/gorilla/mux"
)

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintln(w, "Welcome")
}

func CategoryIndex(w http.ResponseWriter, r *http.Request){
	categoriesData, err := ioutil.ReadFile("./data/json/categories.json")
	if err!=nil {
		panic(err)
	}
	var categories []Category
	json.Unmarshal([]byte(categoriesData), &categories)
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
	if err := json.NewEncoder(w).Encode(categories); err != nil {
		panic(err)
	}	
}

func ProductsIndex(w http.ResponseWriter, r *http.Request){
	vars := mux.Vars(r)
	categoryId := vars["categoryId"]
	jsonPath := "./data/json/product_categories_"+categoryId+".json"
	productsData, err := ioutil.ReadFile(jsonPath)
	if err!=nil {
		panic(err)
	}
	var products []Product
	json.Unmarshal([]byte(productsData), &products)
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.WriteHeader(http.StatusOK)
	if err := json.NewEncoder(w).Encode(products); err != nil {
		panic(err)
	}	
}

