        {
        "startsDate": "2023/01/0716:12:23.229+0530",
        "endDate": "2023/02/0816:12:23.229+0530",
        "organizationEntity": "cloudofgoods"
        }

     [
       {
          "campaignDescription":"bla bla bla",
          "campaignName":"campaignOne",
          "createdDate":"15-Oct-2022 11:22:11",
          "creator":"CreaterOne",
          "endDateTime":"15-Oct-2023 11:22:11",
          "organizationEntity":"CloudOfGoods",
          "segments":[
             {
                "abTest":true,
                "abTestEndDateTime":"15-Oct-2023 11:22:11",
                "abTestTraffic":0,
        "content": {
          "contentType": "string",
          "image": "string",
          "status": "string",
          "title": "string"
        },
                "fact":{
                   "children":[
                      {
                         "factName":"age",
                         "operator":".equals",
                         "value":"22"
                      },
                      {
                         "children":[
                            {
                               "factName":"religion",
                               "operator":".equals",
                               "value":"Hindu"
                            }
                         ],
                         "conj":"OR",
                         "factName":"country",
                         "operator":".equals",
                         "value":"USA"
                      }
                   ],
                   "conj":"OR"
                },
                "priority":6,
                "segmentName":"SegmentID_Thsreesqs",
                "segmentRuleString":"((\"ADMIN2\")(contains(userData.get(\"roles\"))) || \"Mexicos\".equals(userData.get(\"country\"))) || (1 < (userData.get(\"age\")))",
                "segmentationDescription":"bla bla bla",
                "variant":"Varient_ID_ONE"
             }
          ],
          "slotId":"Slot1",
          "priority":4,
          "startDateTime":"15-Oct-2022 11:22:11",
          "updater":"string"
       }
    ]



# Xenia USER GUIDE 🎉

### Technology stack 💎💎

#### Frameworks and Libs

![Spring](https://img.shields.io/badge/Framework-Spring-darkgreen)
![JPAHibernate](https://img.shields.io/badge/Framework-Reactive-darkgreen)

#### Databases and servers

![Mysql](https://img.shields.io/badge/Database-Mongo-orange)
![Jetty](https://img.shields.io/badge/Server-Jetty-orange)

#### Tools and Technologies Databases and servers

![Spring Boot](https://img.shields.io/badge/Technology-SpringBoot-blue)
![maven](https://img.shields.io/badge/Tool-maven-blue)
![postman](https://img.shields.io/badge/Tool-Postman-blue)


------------------------------------------------------------
------------------------------------------------------------
## Rule Controller
------------------------------------------------------------
------------------------------------------------------------

## Save/Update Segments

Save or update Segments API. If You send It with campaign ID it Will Update. all Segments Under that
Campaign.

### http://localhost:8990/v1/d6n/segment/multiple/save?channelList=WEB&statusEnum=ACTIVE&template=true

###### Type : Post

###### channelList :: WEB

###### statusEnum :: Active

###### template :: true (Save all Segments as Template)

     [
            {
                "campaignDescription":"bla bla bla",
                "campaignName":"campaignOne",
                "createdDate":"15-Oct-2022 11:22:11",
                "creator":"CreaterOne",
                "endDateTime":"15-Oct-2023 11:22:11",
                "organizationEntity":"CloudOfGoods",
                "segments":[
                    {
                        "abTest":true,
                        "abTestEndDateTime":"15-Oct-2023 11:22:11",
                        "abTestTraffic":0,
                        "fact": {
                        "children": [
                        {
                            "factName": "age",
                            "operator": ".equals",
                            "value": "22"
                        },
                        {
                                    "children": [
                                                    {
                                                        "factName": "maritalStatus",
                                                        "operator": ".equals",
                                                        "value": "Married"
                                                    }
                                                 ],
                                            "conj": "OR",
                                            "factName": "country",
                                            "operator": ".equals",
                                            "value": "Mexico"
                                             }
                                            ],
                                        "conj": "OR"
                                    },
                                "priority":1,
                                "segmentName":"SegmentID_ONE",
                                "segmentRuleString":"(\"Married\".equals(userData.get(\"maritalStatus\")) || \"Mexico\".equals(userData.get(\"country\"))) || (\"22\".equals(userData.get(\"age\")))",
                                "segmentationDescription":"bla bla bla",
                                "variant":"Varient_ID_Two"
                                }
                            ],
                "slotId":"Slot2",
                "priority":1,
                "startDateTime":"15-Oct-2022 11:22:11",
                "updater":"string"
            },
            {
                "campaignDescription":"bla bla bla",
                "campaignName":"campaignOne",
                "createdDate":"15-Oct-2022 11:22:11",
                "creator":"CreaterOne",
                "endDateTime":"15-Oct-2023 11:22:11",
                "organizationEntity":"CloudOfGoods",
                "segments":[
                    {
                        "abTest":true,
                        "abTestEndDateTime":"15-Oct-2023 11:22:11",
                        "abTestTraffic":0,
                        "fact": {
                        "children": [
                        {
                            "factName": "age",
                            "operator": ".equals",
                            "value": "55"
                        },
                        {
                                    "children": [
                                                    {
                                                        "factName": "city",
                                                        "operator": ".equals",
                                                        "value": "New York"
                                                    }
                                                 ],
                                            "conj": "OR",
                                            "factName": "country",
                                            "operator": ".equals",
                                            "value": "Mexico"
                                             }
                                            ],
                                        "conj": "OR"
                                    },
                                "priority":2,
                                "segmentName":"SegmentID_TWO",
                                "segmentRuleString":"(\"New York\".equals(userData.get(\"city\")) || \"Mexico\".equals(userData.get(\"country\"))) || (\"55\".equals(userData.get(\"age\")))",
                                "segmentationDescription":"bla bla bla",
                                "variant":"Varient_ID_THREE"
                                }
                            ],
                "slotId":"Slot1",
                "priority":1,
                "startDateTime":"15-Oct-2022 11:22:11",
                "updater":"string"
            },

            {
                "campaignDescription":"bla bla bla",
                "campaignName":"campaignOne",
                "createdDate":"15-Oct-2022 11:22:11",
                "creator":"CreaterOne",
                "endDateTime":"15-Oct-2023 11:22:11",
                "organizationEntity":"CloudOfGoods",
                "segments":[
                    {
                        "abTest":true,
                        "abTestEndDateTime":"15-Oct-2023 11:22:11",
                        "abTestTraffic":0,
                        "fact": {
                        "children": [
                        {
                            "factName": "age",
                            "operator": ".equals",
                            "value": "22"
                        },
                        {
                                    "children": [
                                                    {
                                                        "factName": "religion",
                                                        "operator": ".equals",
                                                        "value": "Hindu"
                                                    }
                                                 ],
                                            "conj": "OR",
                                            "factName": "country",
                                            "operator": ".equals",
                                            "value": "USA"
                                             }
                                            ],
                                        "conj": "OR"
                                    },
                                "priority":6,
                                "segmentName":"SegmentID_Three",
                                "segmentRuleString":"(\"Hindu\".equals(userData.get(\"religion\")) || \"USA\".equals(userData.get(\"country\"))) || (\"22\".equals(userData.get(\"age\")))",
                                "segmentationDescription":"bla bla bla",
                                "variant":"Varient_ID_ONE"
                                }
                            ],
                "slotId":"Slot1",
                "priority":4,
                "startDateTime":"15-Oct-2022 11:22:11",
                "updater":"string"
            }
        ]


Response body

        [
          {
            "id": "638c259c7f59705453ac1352",
            "campaignName": "campaignOne",
            "creator": "CreaterOne",
            "status": "ACTIVE",
            "createdDate": "2022-12-04T04:44:12.841+00:00",
            "updater": null,
            "startDateTime": "2022-10-15T11:22:11.000+00:00",
            "endDateTime": "2023-10-15T11:22:11.000+00:00",
            "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentID_Three\"\n    salience 4.6\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( (\"Hindu\".equals(userData.get(\"religion\")) || \"USA\".equals(userData.get(\"country\"))) || (\"22\".equals(userData.get(\"age\"))) )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(4.6,\"Slot1\",\"Varient_ID_ONE\");\n\nend\n\n\n",
            "organizationEntity": "CloudOfGoods",
            "slotId": "Slot1",
            "campaignDescription": "bla bla bla",
            "segments": [
              {
                "segmentRuleString": "(\"Hindu\".equals(userData.get(\"religion\")) || \"USA\".equals(userData.get(\"country\"))) || (\"22\".equals(userData.get(\"age\")))",
                "priority": 4.6,
                "segmentName": "SegmentID_Three",
                "variant": "Varient_ID_ONE",
                "abTest": true,
                "abTestEndDateTime": "2023-10-15T11:22:11.000+00:00",
                "endDateTime": "2023-10-15T11:22:11.000+00:00",
                "startDateTime": "2022-10-15T11:22:11.000+00:00",
                "segmentationDescription": "bla bla bla",
                "abTestTraffic": 0,
                "slotId": "Slot1",
                "organizationEntity": "CloudOfGoods",
                "channel": [
                  "WEB"
                ],
                "fact": {
                  "conj": "OR",
                  "children": [
                    {
                      "factName": "age",
                      "operator": ".equals",
                      "value": "22"
                    },
                    {
                      "factName": "country",
                      "operator": ".equals",
                      "value": "USA",
                      "conj": "OR",
                      "children": [
                        {
                          "factName": "religion",
                          "operator": ".equals",
                          "value": "Hindu"
                        }
                      ]
                    }
                  ]
                }
              }
            ],
            "priority": 4
          },
          {
            "id": "638c259e7f59705453ac1353",
            "campaignName": "campaignOne",
            "creator": "CreaterOne",
            "status": "ACTIVE",
            "createdDate": "2022-12-04T04:44:13.943+00:00",
            "updater": null,
            "startDateTime": "2022-10-15T11:22:11.000+00:00",
            "endDateTime": "2023-10-15T11:22:11.000+00:00",
            "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentID_TWO\"\n    salience 1.2\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( (\"New York\".equals(userData.get(\"city\")) || \"Mexico\".equals(userData.get(\"country\"))) || (\"55\".equals(userData.get(\"age\"))) )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1.2,\"Slot1\",\"Varient_ID_ONE\");\n\nend\n\n\n",
            "organizationEntity": "CloudOfGoods",
            "slotId": "Slot1",
            "campaignDescription": "bla bla bla",
            "segments": [
              {
                "segmentRuleString": "(\"New York\".equals(userData.get(\"city\")) || \"Mexico\".equals(userData.get(\"country\"))) || (\"55\".equals(userData.get(\"age\")))",
                "priority": 1.2,
                "segmentName": "SegmentID_TWO",
                "variant": "Varient_ID_ONE",
                "abTest": true,
                "abTestEndDateTime": "2023-10-15T11:22:11.000+00:00",
                "endDateTime": "2023-10-15T11:22:11.000+00:00",
                "startDateTime": "2022-10-15T11:22:11.000+00:00",
                "segmentationDescription": "bla bla bla",
                "abTestTraffic": 0,
                "slotId": "Slot1",
                "organizationEntity": "CloudOfGoods",
                "channel": [
                  "WEB"
                ],
                "fact": {
                  "conj": "OR",
                  "children": [
                    {
                      "factName": "age",
                      "operator": ".equals",
                      "value": "55"
                    },
                    {
                      "factName": "country",
                      "operator": ".equals",
                      "value": "Mexico",
                      "conj": "OR",
                      "children": [
                        {
                          "factName": "city",
                          "operator": ".equals",
                          "value": "New York"
                        }
                      ]
                    }
                  ]
                }
              }
            ],
            "priority": 1
          },
          {
            "id": "638c259e7f59705453ac1354",
            "campaignName": "campaignOne",
            "creator": "CreaterOne",
            "status": "ACTIVE",
            "createdDate": "2022-12-04T04:44:14.199+00:00",
            "updater": null,
            "startDateTime": "2022-10-15T11:22:11.000+00:00",
            "endDateTime": "2023-10-15T11:22:11.000+00:00",
            "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentID_ONE\"\n    salience 1.1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( (\"Married\".equals(userData.get(\"maritalStatus\")) || \"Mexico\".equals(userData.get(\"country\"))) || (\"22\".equals(userData.get(\"age\"))) )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot2\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1.1,\"Slot2\",\"Varient_ID_Two\");\n\nend\n\n\n",
            "organizationEntity": "CloudOfGoods",
            "slotId": "Slot2",
            "campaignDescription": "bla bla bla",
            "segments": [
              {
                "segmentRuleString": "(\"Married\".equals(userData.get(\"maritalStatus\")) || \"Mexico\".equals(userData.get(\"country\"))) || (\"22\".equals(userData.get(\"age\")))",
                "priority": 1.1,
                "segmentName": "SegmentID_ONE",
                "variant": "Varient_ID_Two",
                "abTest": true,
                "abTestEndDateTime": "2023-10-15T11:22:11.000+00:00",
                "endDateTime": "2023-10-15T11:22:11.000+00:00",
                "startDateTime": "2022-10-15T11:22:11.000+00:00",
                "segmentationDescription": "bla bla bla",
                "abTestTraffic": 0,
                "slotId": "Slot2",
                "organizationEntity": "CloudOfGoods",
                "channel": [
                  "WEB"
                ],
                "fact": {
                  "conj": "OR",
                  "children": [
                    {
                      "factName": "age",
                      "operator": ".equals",
                      "value": "22"
                    },
                    {
                      "factName": "country",
                      "operator": ".equals",
                      "value": "Mexico",
                      "conj": "OR",
                      "children": [
                        {
                          "factName": "maritalStatus",
                          "operator": ".equals",
                          "value": "Married"
                        }
                      ]
                    }
                  ]
                }
              }
            ],
            "priority": 1
          }
        ]

---------------

### http://localhost:8990/v1/d6n/segment/multiple/save?channelList=WEB&statusEnum=ACTIVE&template=true

###### Type : Post (Update)

###### channelList :: WEB

###### statusEnum :: Active

###### template :: true (Save all Segments as Template)

##### Change ID According to your Previous Response

         {
            "id": "6376017b22b84076031a3f08",
            "campaignDescription": "bla bla bla",
            "campaignName": "campaignOne",
            "createdDate": "15-Oct-2022 11:22:11",
            "creator": "CreaterOne",
            "endDateTime": "15-Oct-2023 11:22:11",
            "fact": {
                "children": [
                    {
                        "factName": "age",
                        "operator": ".equals",
                        "value": "22"
                    },
                    {
                    "children": [
                            {
                                "factName": "city",
                                "operator": ".equals",
                                "value": "New York"
                            }
                        ],
                        "conj": "OR",
                        "factName": "country",
                        "operator": ".equals",
                        "value": "USA"
                    }
                ],
                 "conj": "AND"
            },
            "organizationEntity": "CloudOfGoods",
            "segments": [
                        {
                            "abTest": true,
                            "abTestEndDateTime": "15-Oct-2023 11:22:11",
                            "abTestTraffic": 0,
                            "priority": 1,
                            "segmentName": "SegmentOne",
                            "segmentRuleString":"(\"New York\".equals(userData.get(\"city\")) && \"USA\".equals(userData.get(\"country\"))) && (\"22\".equals(userData.get(\"age\")))",
                            "segmentationDescription": "bla bla bla",
                            "variant": "VarientOne"
                        }
                    ],
             "slotId": "Slot1",
             "startDateTime": "15-Oct-2022 11:22:11",
             "updater": "string"
        }

Response body

        {
                "id": "6376167102abd84526b775ff",
                "campaignName": "campaignOne",
                "creator": "CreaterOne",
                "status": "ACTIVE",
                "createdDate": "2022-11-17T11:09:37.063+00:00",
                "updater": null,
                "startDateTime": "2022-10-15T11:22:11.000+00:00",
                "endDateTime": "2023-10-15T11:22:11.000+00:00",
                "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmenteTwo\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( (\"New York\".equals(userData.get(\"city\")) && \"USA\".equals(userData.get(\"country\"))) && (\"22\".equals(userData.get(\"age\"))) )  \n    $meta : MetaData( startDate > \"15-Oct-2022 11:22:11\" && endDate < \"15-Oct-2023 11:22:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientTwo\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods",
                "slotId": "Slot1",
                "campaignDescription": "bla bla bla",
                "segments": [
                    {
                        "segmentRuleString": "(\"New York\".equals(userData.get(\"city\")) && \"USA\".equals(userData.get(\"country\"))) && (\"22\".equals(userData.get(\"age\")))",
                        "priority": 1,
                        "segmentName": "SegmenteTwo",
                        "variant": "VarientTwo",
                        "abTest": true,
                        "abTestEndDateTime": "2023-10-15T11:22:11.000+00:00",
                        "endDateTime": "2023-10-15T11:22:11.000+00:00",
                        "startDateTime": "2022-10-15T11:22:11.000+00:00",
                        "segmentationDescription": "bla bla bla",
                        "abTestTraffic": 0,
                        "slotId": "Slot1",
                        "organizationEntity": "CloudOfGoods",
                                "channel": [
                                "WEB"
                                ],
                                    "fact": {
                                        "conj": "AND",
                                        "children": [
                                            {
                                                "factName": "age",
                                                "operator": ".equals",
                                                "value": "22"
                                            },
                                            {
                                                "factName": "country",
                                                "operator": ".equals",
                                                "value": "USA",
                                                "conj": "OR",
                                                "children": [
                                                    {
                                                        "factName": "city",
                                                        "operator": ".equals",
                                                        "value": "New York"
                                                    }
                                                 ]
                                             }
                                        ]
                                 }
                    }
                ]
        }

## Get Segments Without Pagination

### http://localhost:8990/v1/d6n/segment/get/all

###### Type : GET (all)

Response body

    [
        {
            "id": "6376017b22b84076031a3f08",
            "campaignName": "campaignOne",
            "creator": "CreaterOne",
            "status": "ACTIVE",
            "createdDate": "2022-11-17T09:40:10.995+00:00",
            "updater": null,
            "startDateTime": "2022-10-15T11:22:11.000+00:00",
            "endDateTime": "2023-10-15T11:22:11.000+00:00",
            "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentOne\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( (\"New York\".equals(userData.get(\"city\")) && \"USA\".equals(userData.get(\"country\"))) && (\"22\".equals(userData.get(\"age\"))) )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
            "organizationEntity": "CloudOfGoods",
            "slotId": "Slot1",
            "campaignDescription": "bla bla bla",
                "segments": [
                    {
                    "segmentRuleString": "(\"New York\".equals(userData.get(\"city\")) && \"USA\".equals(userData.get(\"country\"))) && (\"22\".equals(userData.get(\"age\")))",
                    "priority": 1,
                    "segmentName": "SegmentOne",
                    "variant": "VarientOne",
                    "abTest": true,
                    "abTestEndDateTime": "2023-10-15T11:22:11.000+00:00",
                    "endDateTime": "2023-10-15T11:22:11.000+00:00",
                    "startDateTime": "2022-10-15T11:22:11.000+00:00",
                    "segmentationDescription": "bla bla bla",
                    "abTestTraffic": 0,
                    "slotId": "Slot1",
                    "organizationEntity": "CloudOfGoods",
                        "channel": [
                         "WEB"
                        ]
                    }
                ],
            "fact": {
            "conj": "AND",
                    "children": [
                        {
                            "factName": "age",
                            "operator": ".equals",
                            "value": "22"
                        },
                        {
                            "factName": "country",
                            "operator": ".equals",
                            "value": "USA",
                            "conj": "OR",
                            "children": [
                                {
                                    "factName": "city",
                                    "operator": ".equals",
                                    "value": "New York"
                                }
                            ]
                        }
                    ]
            }
        }
    ]

---------------------------
---------------------------

## Add Another Campaign

## Save/Update Segments

Save or update Segments API. If You send It with campaign ID it Will Update. all Segments Under that
Campaign.

### http://localhost:8990/v1/d6n/segment/multiple/save?channelList=WEB&statusEnum=ACTIVE&template=true

###### Type : Post

###### channelList :: WEB

###### statusEnum :: Active

###### template :: true (Save all Segments as Template)

    {
        "campaignDescription": "bla bla bla",
        "campaignName": "campaignTwo",
        "creator": "CreaterOne",
        "endDateTime": "15-Oct-2023 11:22:11",
        "organizationEntity": "CloudOfGoods",
            "segments": [
                {
                    "abTest": true,
                    "abTestEndDateTime": "15-Oct-2022 11:22:11",
                    "abTestTraffic": 6,
                    "priority": 1,
                    "segmentName": "SegmentTwo",
                    "segmentRuleString": "\"Amal\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\")",
                    "segmentationDescription": "bla bla bla",
                    "variant": "VarientOne"
                }
            ],
        "slotId": "Slot1",
        "startDateTime": "15-Oct-2022 11:22:11",
        "updater": "string"
    }

Response body

            {
            "id": "636b2cc97296a141880d9c2a",
            "campaignName": "campaignTwo",
            "creator": "CreaterOne",
            "updater": null,
            "startDateTime": "2022-10-15T11:22:11.000+00:00",
            "endDateTime": "2023-10-15T11:22:11.000+00:00",
            "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentTwo\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Amal\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
            "organizationEntity": "CloudOfGoods",
            "slotId": "Slot1",
            "status": "ACTIVE",  
            "campaignDescription": "bla bla bla",
                "segments": [
                    {
                        
                        "segmentRuleString": "\"Amal\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\")",
                        "priority": 1,
                        "segmentName": "SegmentTwo",
                        "variant": "VarientOne",
                        "abTest": true,
                        "abTestEndDateTime": "2022-10-15T11:22:11.000+00:00",
                        "endDateTime": "2023-10-15T11:22:11.000+00:00",
                        "startDateTime": "2022-10-15T11:22:11.000+00:00",
                        "segmentationDescription": "bla bla bla",
                        "abTestTraffic": 6,
                        "slotId": "Slot1",
                        "organizationEntity": "CloudOfGoods",
                        "channel": [
                            "WEB"
                        ]
                    }
                ]
            }

---------------------------------------------------------
---------------------------------------------------------

## Delete Campaign From ID

### http://localhost:8990/v1/d6n/segment/delete/

###### Type : DELETE

###### campaignId : 636b2cc97296a141880d9c2a

---------------------------------------------------------
---------------------------------------------------------

## Get Campaign From ID (Try To Get Deleted One and Existing one)

### http://localhost:8990/v1/d6n/segment/campaign/get/636b2cc97296a141880d9c2a

###### Type : GET

###### campaignId : 636b2cc97296a141880d9c2a

Response
if Exists

        {
            "id": "636b2b627296a141880d9c27",
            "campaignName": "campaignOne",
            "creator": "CreaterOne",
            "updater": "string",
            "startDateTime": "2022-10-15T11:22:11.000+00:00",
            "endDateTime": "2023-10-15T11:22:11.000+00:00",
            "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentOne2\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
            "organizationEntity": "CloudOfGoods",
            "slotId": "Slot1",
            "status": "ACTIVE",  
            "campaignDescription": "bla bla bla",
            "segments": [
                {
                
                "segmentRuleString": "\"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\")",
                "priority": 1,
                "segmentName": "SegmentOne2",
                "variant": "VarientOne",
                "abTest": true,
                "abTestEndDateTime": "2022-10-15T11:22:11.000+00:00",
                "endDateTime": "2023-10-15T11:22:11.000+00:00",
                "startDateTime": "2022-10-15T11:22:11.000+00:00",
                "segmentationDescription": "bla bla bla",
                "abTestTraffic": 0,
                "slotId": "Slot1",
                "organizationEntity": "CloudOfGoods",
                    "channel": [
                        "WEB"
                    ]
                }
            ]
        }

If Not Exists

           connection: keep-alive
           content-length: 0
           date: Wed09 Nov 2022 04:33:53 GMT
           keep-alive: timeout=60
           vary: OriginAccess-Control-Request-MethodAccess-Control-Request-Headers

-----------------------------------------------------------------
------------------------

# Template Controller

-----------------------------------------------------------------
-------------------------------

## Get Template With Pagination

### http://localhost:8990/v1/d6n/template/get/pagination

###### Type : GET (all)

###### page : 0

###### size : 1

Response

        [
            {
                "name": "SegmentOne##$$$##138872606422300072",
                "drlString": " \n\nrule \"SegmentOne\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            }
        ]

------------------------
------------------------

## Get all Template Without Pagination

### http://localhost:8990/v1/d6n/template/all/get

###### Type : GET (all)

###### method Name : getAllTemplates

Response

        [
            {
                "name": "SegmentOne##$$$##138872606422300072",
                "drlString": " \n\nrule \"SegmentOne\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            },
            {
                "name": "SegmentOne2##$$$##138872607701230073",
                "drlString": " \n\nrule \"SegmentOne2\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            },
            {
                "name": "SegmentTwo##$$$##138872610018180074",
                "drlString": " \n\nrule \"SegmentTwo\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Amal\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            }
        ]

------------------------
------------------------

## Get all Template With Organization

### http://localhost:8990/v1/d6n/template/organizationEntity/get/all

###### Type : GET (all)

###### organizationEntity : CloudOfGoods

###### method Name : getAllTemplateInOrganization

Response

        [
            {
                "name": "SegmentOne##$$$##138872606422300072",
                "drlString": " \n\nrule \"SegmentOne\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            },
            {
                "name": "SegmentOne2##$$$##138872607701230073",
                "drlString": " \n\nrule \"SegmentOne2\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            },
            {
                "name": "SegmentTwo##$$$##138872610018180074",
                "drlString": " \n\nrule \"SegmentTwo\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Amal\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            }
        ]

-------------------------
------------------------

## Get all Template With Template ID and Organization

## If You Enter 'S' for name. It will Return All Templates Starting With 'S'

### http://localhost:8990/v1/d6n/template/get/{name}/{organizationEntity}

###### Type : GET One Or More

###### organizationEntity : CloudOfGoods

###### name : SegmentTwo

###### method Name : getTemplateByIdAndOrganization

Response

        [
            {
                "name": "SegmentTwo##$$$##138872610018180074",
                "drlString": " \n\nrule \"SegmentTwo\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Amal\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods"
            }
        ]

---------------------------------------------------------
---------------------------------------------------------

## Delete Template From ID

### http://localhost:8990/v1/d6n/template/delete/

###### Type : DELETE

###### templateId : 636b2b627296a141880d9c26

---------------------------------------------------------
---------------------------------------------------------

## Save Template (Only Template) / Update With ID

### http://localhost:8990/v1/d6n/template/save/

###### Type : POST

###### TemplateModel :

        {
            "abTest": true,
            "abTestEndDateTime": "22-OCT-2023 02:22:22",
            "abTestTraffic": 1,
            "status": "ACTIVE",
                "channel": [
                  "WEB"
                ],
            "endDateTime": "22-OCT-2023 02:22:22",
            "organizationEntity": "CloudOfGoods",
            "priority": 1,
            "segmentName": "SegmentTen",
            "segmentRuleString":"\"Amal\".equals(userData.get(\"name\")) && 77 > userData.get(\"age\")",
            "segmentationDescription": "bla bla bla",
            "slotId": "SlotTen",
            "startDateTime": "22-OCT-2022 02:22:22",
            "variant": "VarientOne",
            "fact": {
            "children": [
            {
            "factName": "age",
            "operator": ".equals",
            "value": "22"
            },
            {
            "children": [
            {
            "factName": "city",
            "operator": ".equals",
            "value": "New York"
            }
            ],
            "conj": "AND",
            "factName": "country",
            "operator": ".equals",
            "value": "USA"
            }
            ],
            "conj": "AND"
            }
            }
        }

Response

        {
            "id": "636b34d39171fd0f9f9ab3c5",
            "name": "SegmentTen##$$$##138872630594220247",
            "drlString": " \n\nrule \"SegmentTen\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Amal\".equals(userData.get(\"name\")) && 77 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"22-Oct-2022 07:52:22\" && endDate < \"22-Oct-2023 07:52:22\" && contextId.contains(\"SlotTen\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"SlotTen\",\"VarientOne\");\n\nend\n\n\n",
            "organizationEntity": null
        }

----------------------------------------------------------------
----------------------------------------------------------------
# InitialPageController
----------------------------------------------------------------
----------------------------------------------------------------
------------------------
------------------------

## Get Segments With Pagination

### http://localhost:8990/v1/d6n/initial/get/campaigns?page=0&size=2

###### Type : GET (all)

Response

        [
            {
            "t1": {
                "id": "636b2b627296a141880d9c27",
                "campaignName": "campaignOne",
                "creator": "CreaterOne",
                "updater": "string",
                "startDateTime": "2022-10-15T11:22:11.000+00:00",
                "endDateTime": "2023-10-15T11:22:11.000+00:00",
                "fullDroolString": "package com.d6n.engine \n\nimport com.d6n.engine.model.User\nimport org.springframework.util.CollectionUtils\nimport com.d6n.engine.model.MetaData\n\nglobal com.d6n.engine.model.D6nResponse response\n\n \n\nrule \"SegmentOne2\"\n    salience 1\n    agenda-group \"CloudOfGoods\"\nwhen\n    $user : User( \"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\") )  \n    $meta : MetaData( startDate > \"15-Oct-2022 16:52:11\" && endDate < \"15-Oct-2023 16:52:11\" && contextId.contains(\"Slot1\") && (channelEntity.contains(\"WEB\")) )  \nthen\nresponse.addToResponse(1,\"Slot1\",\"VarientOne\");\n\nend\n\n\n",
                "organizationEntity": "CloudOfGoods",
                "status": "ACTIVE",  
                "slotId": "Slot1",
                "campaignDescription": "bla bla bla",
                "segments": [
                    {

                    "segmentRuleString": "\"Rivindu\".equals(userData.get(\"name\")) && 12 > userData.get(\"age\")",
                    "priority": 1,
                    "segmentName": "SegmentOne2",
                    "variant": "VarientOne",
                    "abTest": true,
                    "abTestEndDateTime": "2022-10-15T11:22:11.000+00:00",
                    "endDateTime": "2023-10-15T11:22:11.000+00:00",
                    "startDateTime": "2022-10-15T11:22:11.000+00:00",
                    "segmentationDescription": "bla bla bla",
                    "abTestTraffic": 0,
                    "slotId": "Slot1",
                    "organizationEntity": "CloudOfGoods",
                        "channel": [
                            "WEB"
                        ]
                        }
                    ]
            },
            "t2": 1
            }
        ]

--------------------------------------------
--------------------------------------------------

## Class Name D6nController

### method name makeDecision

Create This API For makeDecision (Personalise)

### http://localhost:8990/v1/d6n/personalise

###### Type : Post

###### channelList :: WEB

###### slot :: Slot1

###### organizationEntity :: CloudOfGoods

###### Object ::

        {
            "name" : "Rivindu" ,"age" : "11"
        }

Response

        {
            "slotId": "Slot1",
            "variant": "VarientOne",
            "priority": 1
        }

---------------------------------------------------------
------------------

## Update Multiple Rules ( Remove One )

---------------------------------------------------------------
---------------------------------------------------------

## Get Personalise Content After Update ( Remove Rule )

---------------------------------------------------------
------------------

## Update Multiple Rules ( Remove One )

       {
            "abTest": true,
            "abTestEndDateTime": "22-OCT-2023 02:22:22",
            "abTestTraffic": 1,
            "status": "ACTIVE",
                "channel": [
                  "WEB"
                ],
            "endDateTime": "22-OCT-2023 02:22:22",
            "organizationEntity": "CloudOfGoods",
            "priority": 1,
            "segmentName": "SegmentTen",
             "segmentRuleString":"(\"New York\".equals(userData.get(\"city\")) && \"USA\".equals(userData.get(\"country\"))) && (\"22\".equals(userData.get(\"age\")))",
            "segmentationDescription": "bla bla bla",
            "slotId": "SlotTen",
            "startDateTime": "22-OCT-2022 02:22:22",
            "variant": "VarientOne",





        {
            "fact":{
                    "children":[
                        {
                            "factName":"age",
                            "operator":".equals",
                            "value":"22"
                        },
                        {
                        "children":[
                                {
                                    "factName":"city",
                                    "operator":".equals",
                                    "value":"New York"
                                }
                            ],
                                "conj":"AND",
                                "factName":"country",
                                "operator":".equals",
                                "value":"USA"
                            }
                        ],
                    "conj":"AND"
                    },
            "segmentName":"string",
            "segmentationDescription":"strissssng"
        }




