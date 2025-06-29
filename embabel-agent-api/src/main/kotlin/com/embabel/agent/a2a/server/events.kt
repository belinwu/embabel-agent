/*
 * Copyright 2024-2025 Embabel Software, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.embabel.agent.a2a.server

import com.embabel.agent.a2a.spec.JSONRPCRequest
import com.embabel.agent.a2a.spec.JSONRPCResponse
import com.embabel.agent.core.AgentPlatform
import com.embabel.agent.event.AgentPlatformEvent
import java.time.Instant

data class A2ARequestEvent(
    override val agentPlatform: AgentPlatform,
    val request: JSONRPCRequest,
) : AgentPlatformEvent {
    override val timestamp: Instant = Instant.now()
}

data class A2AResponseEvent(
    override val agentPlatform: AgentPlatform,
    val response: JSONRPCResponse,
) : AgentPlatformEvent {
    override val timestamp: Instant = Instant.now()
}
