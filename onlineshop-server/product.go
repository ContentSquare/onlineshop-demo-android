package main

type Product struct{
	Id string			`json:"id"`
	Name string			`json:"name"`
	Desc string			`json:"description"`
	FreeDelivery bool	`json:"free_delivery"`
	Price float32		`json:"price"`
	Stock uint32 		`json:"stock"`
	Images []string		`json:"images"`
	Colors []Color		`json:"colors"`
	Sizes []string		`json:"sizes"`
}