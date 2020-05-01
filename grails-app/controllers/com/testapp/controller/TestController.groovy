package com.testapp.controller

class TestController {

    def index() {
		log.info("I am here ---> ")
		redirect(uri:"/")
		return
		log.info("I am here too ---> ")
	}
	
	def divideTwoNums() {
		def num1 = params.num1.toLong()
		def num2 = params.num2.toLong()
		render num1/num2
	}
}
