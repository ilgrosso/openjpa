/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openjpa.persistence.pudefaults;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/*
 * An entity which has a sequence where the sequence defines a schema,
 * as such the schema in the sequence annotation should take precedence over
 * the persistence-unit-default schema (see pudefaults-orm.xml file).
 */
@Entity
public class PUSchemaInSequenceAnnotationEntity implements Serializable {

    private static final long serialVersionUID = 2472845479260320080L;

    @Id
    @SequenceGenerator(name = "Seq_4AnnoSequenceSchema", sequenceName = "SeqName_4AnnoSequenceSchema",
                       schema = "schemaInSequenceAnnotation")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Seq_4AnnoSequenceSchema")
    @Column(name = "ID")
    private long id;

    public long getId() { return id; }
}
