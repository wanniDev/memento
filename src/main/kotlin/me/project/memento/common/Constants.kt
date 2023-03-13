package me.project.memento.common

import java.math.BigInteger

// API
const val API_VERSION = "v1"
const val API_URI_PREFIX = "/api/" + API_VERSION
const val ATTACH_API_URI_PREFIX = "${API_URI_PREFIX}/attach"
const val TOKEN_PREFIX = "Bearer "
const val HEADER_AUTHORIZATION = "Authorization"

// REST DOC
const val URI_SCHEME = "http"
const val URI_HOST = "127.0.0.1"
const val URI_PORT = 8080

// ETHEREUM
val GAS_PRICE: BigInteger = BigInteger.valueOf(800_000_000_000L)
val GAS_LIMIT: BigInteger = BigInteger.valueOf(5_000_000L)
val DEPLOY_GAS_LIMIT: BigInteger = GAS_LIMIT * BigInteger.valueOf(3L)
const val DEFAULT_GAS_PRICE = 300L
const val MIN_GAS_FEE = 100_000_000L
const val TX_END_CHECK_DURATION = 1000L
const val TX_END_CHECK_RETRY = 10
const val CHAIN_ID = 11L
// ETHEREUM 성공여부
const val RECEIPT_OK = "0x1"
const val RECEIPT_FAIL = "0x0"