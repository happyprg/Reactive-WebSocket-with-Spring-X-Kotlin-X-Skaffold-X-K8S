/*
 * Copyright (c) 2019 http://happyprg.com all rights reserved. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.happyprg.blockchain.monitor.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "monitor")
data class MonitoringConfig(
    var staticWebSocketHost: String? = null,
    var onDemandWebSocketHost: String? = null,
    var showingEventCnt: String? = null,
    var showingBlockCnt: String? = null,
    var showingTxCnt: String? = null
)
