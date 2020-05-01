package com.testapp.controller

import com.testapp.controller.JasperDTO

class JasperReportController {

	def jasperDTOService
	
	/*this method shows the records listing page*/
    def index() {
		def jasperDTOList = jasperDTOService.loadAllJasperDTO(20)
		render(view:"index", model:[jasperDTOList:jasperDTOList])
		return false
	}
	
	/*this method serves the report document for download*/
	def generateReport() {
		def jasperDTOList = jasperDTOService.loadAllJasperDTO(120)
		params.title = "Hello World !"
		params.reportId = "220/B, Baker Street, London"
		params.operationTime = new Date()
		chain(controller:'jasper', action:'index', model:[data:jasperDTOList], params:params)
		return false
	}
	
}
