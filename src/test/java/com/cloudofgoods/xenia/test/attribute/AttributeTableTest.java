//package com.cloudofgoods.xenia.test.attribute;
//
//import com.cloudofgoods.xenia.attributetable.DTO.AttributeTableDTO;
//import com.cloudofgoods.xenia.attributetable.DTO.AttributeTableGetSingleDTO;
//import com.cloudofgoods.xenia.attributetable.DTO.AttributeTableRequestDTO;
//import com.cloudofgoods.xenia.dto.response.ServiceGetResponseDTO;
//import com.cloudofgoods.xenia.dto.response.ServiceResponseDTO;
//import com.cloudofgoods.xenia.attributetable.service.AttributesTableService;
//import com.cloudofgoods.xenia.test.ApplicationTest;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static com.cloudofgoods.xenia.util.Utils.STATUS_SUCCESS;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@Slf4j
//public class AttributeTableTest extends ApplicationTest {
//    private final String organizationUuid = "COG";
//    private final String table = "Table";
//    @Autowired
//    private AttributesTableService attributesTableService;
//
//    @Test
//    void  saveOrUpdateAttributeTable(){
//        AttributeTableDTO attributeTableDTO = new AttributeTableDTO();
//        attributeTableDTO.setTableName(table + "One");
//        attributeTableDTO.setDisplayName(table + "One");
//        attributeTableDTO.setOrganizationUuid(organizationUuid);
//        attributeTableDTO.setStatus(false);
//        ServiceResponseDTO serviceResponseDTO = attributesTableService.saveOrUpdateAttributeTable(attributeTableDTO);
//        getSingleAttributeTable();
//        assertEquals(STATUS_SUCCESS, serviceResponseDTO.getMessage());
//    }
//    void getSingleAttributeTable() {
//        AttributeTableGetSingleDTO attributeGetSingleDTO = new AttributeTableGetSingleDTO();
//        attributeGetSingleDTO.setAttributeTableName("TableOne");
//        attributeGetSingleDTO.setOrganizationUuid(organizationUuid);
//        ServiceGetResponseDTO singleAttribute = attributesTableService.getSingleAttributeTable(attributeGetSingleDTO);
//        log.info("\n Get Single Attribute Table : " + singleAttribute + " \n");
//        assertEquals(STATUS_SUCCESS, singleAttribute.getMessage());
//    }
//    @Test
//    void  activeInactiveAttributeTable(){
//        ServiceResponseDTO serviceResponseDTO1 = attributesTableService.activeInactiveAttributeTable(table + "One", organizationUuid, true);
//        ServiceResponseDTO serviceResponseDTO = attributesTableService.activeInactiveAttributeTable(table + "One", organizationUuid, false);
//        assertEquals(STATUS_SUCCESS, serviceResponseDTO.getMessage());
//        assertEquals(STATUS_SUCCESS, serviceResponseDTO1.getMessage());
//    }
//    @Test
//    void getAttributesTables(){
//        AttributeTableRequestDTO attributeTableRequestDTO = new AttributeTableRequestDTO();
//        attributeTableRequestDTO.setName(table);
//        attributeTableRequestDTO.setPage(0);
//        attributeTableRequestDTO.setSize(10);
//        attributeTableRequestDTO.setPagination(false);
//        ServiceGetResponseDTO attributesTables = attributesTableService.getAttributesTables(attributeTableRequestDTO);
//        assertEquals(STATUS_SUCCESS, attributesTables.getMessage());
//    }
//}
