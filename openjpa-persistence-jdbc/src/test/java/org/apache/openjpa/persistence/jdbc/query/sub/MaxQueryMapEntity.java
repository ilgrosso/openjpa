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
package org.apache.openjpa.persistence.jdbc.query.sub;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OPENJPA_MAXQUERY_MAPENTITY")
public class MaxQueryMapEntity {

    public MaxQueryMapEntity(int id, int revision, String selectCriteria) {
        this.id = id;
        this.revision = revision;
        this.selectCriteria = selectCriteria;
    }

    public MaxQueryMapEntity() {
    }

    @Id
    private int id;

    private int revision;

    @ManyToOne
    @JoinColumn(name = "refEntity")
    private MaxQueryEntity refEntity;

    private String selectCriteria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public MaxQueryEntity getRefEntity() {
        return refEntity;
    }

    public void setRefEntity(MaxQueryEntity refEntity) {
        this.refEntity = refEntity;
    }

    public String getSelectCriteria() {
        return selectCriteria;
    }

    public void setSelectCriteria(String selectCriteria) {
        this.selectCriteria = selectCriteria;
    }

}
