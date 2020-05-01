package com.testapp.service

import com.testapp.controller.JasperDTO

class JasperDTOService {

    def loadAllJasperDTO(int counts) {
		def jasperDTOList = []
		def jasperDTO
		for(int i = 1; i <= counts; i++) {
			jasperDTO = new JasperDTO(name: "name" + i, age: i, gender:"male", address:"address" + i)
			jasperDTOList.add(jasperDTO)
		}
		return jasperDTOList
    }
}
