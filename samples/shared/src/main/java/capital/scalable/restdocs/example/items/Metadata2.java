/*-
 * #%L
 * Spring Auto REST Docs Shared POJOs Example Project
 * %%
 * Copyright (C) 2015 - 2021 Scalable Capital GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package capital.scalable.restdocs.example.items;

import capital.scalable.restdocs.jackson.RestdocsNotExpanded;

public class Metadata2 extends Metadata {
    /**
     * Order attribute.
     */
    private Integer order;

    /**
     * Sub metadata (recursive). Not expanded as client should not see it.
     */
    @RestdocsNotExpanded
    private Metadata2 sub;

    Metadata2() {
    }

    public Metadata2(String type, Integer order) {
        super(type);
        this.order = order;
    }
}
