/*
 * Copyright 2018 PayPal Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paypal.gimel.common.gimelservices.payload

import spray.json._

// @todo remove after Null Handling
// https://groups.google.com/forum/#!topic/spray-user/HmKoNv6IrgU
// https://github.com/spray/spray-json/blob/304cd5e236580686a614eebb7fecb225380ea6fc/src/main/scala/spray/json/ProductFormats.scala#L532

/**
  * Extending the DefaultJsonProtocol to Support the Services Payload for PCatalog
  */
object GimelJsonProtocol extends DefaultJsonProtocol {
  implicit val clusterInfo: RootJsonFormat[ClusterInfo] = jsonFormat4(ClusterInfo)
  implicit val rawObjectAttributeValue: RootJsonFormat[ObjectAttributeValue] = jsonFormat3(ObjectAttributeValue)
  implicit val schema: RootJsonFormat[ObjectSchema] = jsonFormat3(ObjectSchema)
  implicit val objectSchemaInfo: RootJsonFormat[ObjectSchemaMapUpload] = jsonFormat7(ObjectSchemaMapUpload)
  implicit val objectSchema: RootJsonFormat[AutoRegisterObject] = jsonFormat9(AutoRegisterObject)
  implicit val objectDeploymentStatus: RootJsonFormat[ObjectSchemaChangeDeploymentStatus] = jsonFormat2(ObjectSchemaChangeDeploymentStatus)
  implicit val objectSchemaChangeLog: RootJsonFormat[ObjectSchemaChangeLog] = jsonFormat14(ObjectSchemaChangeLog)
  implicit val storage: RootJsonFormat[Storage] = jsonFormat4(Storage)
  implicit val storageType: RootJsonFormat[StorageType] = jsonFormat4(StorageType)
  implicit val storageSystem: RootJsonFormat[StorageSystem] = jsonFormat5(StorageSystem)
  implicit val containerObject: RootJsonFormat[ContainerObject] = jsonFormat6(ContainerObject)
  implicit val userObject: RootJsonFormat[User] = jsonFormat3(User)
  implicit val storageTypeAttributeKey: RootJsonFormat[StorageTypeAttributeKey] = jsonFormat5(StorageTypeAttributeKey)
  implicit val datasetAttributeValue: RootJsonFormat[DatasetAttributeValue] = jsonFormat3(DatasetAttributeValue)
  implicit val datasetObject: RootJsonFormat[Dataset] = jsonFormat9(Dataset)
  implicit val rawObjectSchemaMap: RootJsonFormat[RawObjectSchemaMap] = jsonFormat7(RawObjectSchemaMap)
  implicit val rawStorageSystemAttributeValue: RootJsonFormat[StorageSystemAttributeValue] = jsonFormat5(StorageSystemAttributeValue)
  implicit val rawStorageSystemContainer: RootJsonFormat[StorageSystemContainer] = jsonFormat6(StorageSystemContainer)
  implicit val rawContainerSubset: RootJsonFormat[ContainerSubset] = jsonFormat3(ContainerSubset)

}
