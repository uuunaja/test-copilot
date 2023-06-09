package yu.test.copilot

class DataClass {
}

//parse below this to data model
//{
//components: {
//securitySchemes: {
//app-level0: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/app-level0"
//},
//app-level3: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/app-level3"
//},
//nhs-cis2-aal1: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/nhs-cis2-aal1"
//},
//nhs-cis2-aal3: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/nhs-cis2-aal3"
//},
//nhs-login-p0: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/nhs-login-p0"
//},
//nhs-login-p5: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/nhs-login-p5"
//},
//nhs-login-p9: {
//$ref: "https://proxygen.ptl.api.platform.nhs.uk/components/securitySchemes/nhs-login-p9"
//}
//}
//},
//info: {
//contact: {
//email: "api.management@nhs.net",
//name: "API Management Support"
//},
//description: "## Overview
//Use this API alongside our  [tutorials](https://digital.nhs.uk/developer/guides-and-documentation/tutorials) to teach yourself how to connect to our RESTful APIs.
//You can:
// - get a response from an open-access endpoint, where the calling application and the end users are not authenticated
// - get a response from an application-restricted endpoint, where the calling application is authenticated but the end user is not authenticated
// - get a response from a user-restricted endpoint, where the calling application and the end user are authenticated
//
// For further details, see the 'Security and authorisation' section below.
//
//## Who can use this API
//This API can only be used to help support the delivery of health and social care.
//
//## Related APIs
//None
//
//## API status and roadmap
//This API is [in production](https://digital.nhs.uk/developer/guides-and-documentation/reference-guide#statuses).
//To see our roadmap, or to suggest, comment or vote on features for this API, see our [interactive product backlog](https://nhs-digital-api-management.featureupvote.com/?order=popular&filter=allexceptdone&tag=make-learning-easier#controls).
//
//If you have any other queries, please [contact us](https://digital.nhs.uk/developer/help-and-support).
//
//## Service level
//This API is a bronze service, meaning it is operational and supported only during business hours (8am to 6pm), Monday to Friday excluding bank holidays.
//For more details, see [service levels](https://digital.nhs.uk/developer/guides-and-documentation/reference-guide#service-levels).
//
//## Technology
//This API is [RESTful](https://digital.nhs.uk/developer/guides-and-documentation/api-technologies-at-nhs-digital#basic-rest-apis).
//
//## Network access
//This API is available on the internet and, indirectly, on the [Health and Social Care Network (HSCN)](https://digital.nhs.uk/services/health-and-social-care-network). To use this API with [NHS smartcards](https://digital.nhs.uk/services/registration-authorities-and-smartcards), the end user needs an HSCN connection, although internet-facing alternatives are available.
//For more details see [Network access for APIs](https://digital.nhs.uk/developer/guides-and-documentation/network-access-for-apis).
//
//## Security and authorisation
//This API demonstrates the different authentication methods used in our APIs.
//
//### Open-access authentication
//Use the hello world endpoint to get a response from an open-access API. Some of our APIs are [open-access](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation#open-access-apis), which means:
// - we do not authenticate or authorise the calling application
// - we do not authenticate or authorise the end user - they might not even be present
//
//We generally use open-access APIs for public data, where security is not a concern.
//Our open-access APIs are generally RESTful APIs. For more details on how to access them, see our [open-access REST API tutorial](https://digital.nhs.uk/developer/guides-and-documentation/tutorials/open-access-rest-api-tutorial).
//
//### Application-restricted authentication
//Use the hello application endpoint to get a response from an application-restricted API. This access mode is [application-restricted](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation#application-restricted-apis), meaning we authenticate the calling application but not the end user.
//You can use this access mode as follows:
// - attended (end user present) - in which case, you must ensure the end user is authenticated and suitably authorised locally by the calling application
//
//To use this access mode, use one of the following security patterns:
// - [Application-restricted RESTful APIs - API key authentication](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation/application-restricted-restful-apis-api-key-authentication)
// - [Application-restricted RESTful APIs - signed JWT authentication](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation/application-restricted-restful-apis-signed-jwt-authentication)
//
//### User-restricted authentication
//Use the hello user endpoint to get a response from a user-restricted API. Some of our APIs are [user-restricted](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation#user-restricted-apis), which means:
// - we authenticate and authorise the calling application
// - we authenticate, but do not authorise, the end user
//
//Although we do not authorise the end user, we do generally require the calling application to do it locally.
//We only support authentication of healthcare workers.
//
//## Environments and testing
//
//| Environment                                    | Base URL                                                     |
//| -----------------------------------------------|--------------------------------------------------------------|
//| Sandbox                                        | https://sandbox.api.service.nhs.uk/hello-world      |
//### Sandbox testing
//This API is for learning purposes and is only available in our sandbox environment. Our [sandbox environment](https://digital.nhs.uk/developer/guides-and-documentation/testing#sandbox-testing):
//  - is for early developer testing
//  - only covers a limited set of scenarios
//  - is stateless, so it does not actually persist any updates
//
// For more details on sandbox testing, or to try out the sandbox using our \"Try this API\" feature, see the documentation for each endpoint.
//Alternatively, you can try out the sandbox using our Postman collection:
//[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/426d37cb9cfe17b8b96d)
//
//## Onboarding
//This API is available to all and there is no onboarding process or assurance required.
//
//## Errors
//We use standard HTTP status codes to show whether an API request succeeded or not. They are usually in the range:
//
//* 200 to 299 if it succeeded, including code 202 if it was accepted by an API that needs to wait for further action
//* 400 to 499 if it failed because of a client error by your application
//* 500 to 599 if it failed because of an error on our server
//
//Errors specific to each API are shown in the Endpoints section, under Response. See our [reference guide](https://digital.nhs.uk/developer/guides-and-documentation/reference-guide#http-status-codes) for more on errors.
//
//",
//title: "Hello World API",
//version: "0.0.1"
//},
//openapi: "3.0.3",
//paths: {
///hello/application: {
//get: {
//description: "## Overview
//This endpoint is application-restricted and requires authorisation using one of the following security patterns:
//- [Application-restricted RESTful APIs - API key authentication](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation/application-restricted-restful-apis-api-key-authentication)
//- [Application-restricted RESTful APIs - signed JWT authentication](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation/application-restricted-restful-apis-signed-jwt-authentication)
//",
//operationId: "getHelloApiKey",
//parameters: [
//{
//description: "Required only for API key authentication. An [Apigee Api key](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation#application-restricted-apis).
//This must be a real API key subscribed to Hello World Sandbox
//",
//in: "header",
//name: "apikey",
//required: false,
//schema: {
//example: "IEYRtW2cb7A5Gs54A1wKElECBL65GVls",
//type: "string"
//}
//},
//{
//description: "Required only for signed JWT authentication. An [OAuth 2.0 bearer token](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation#application-restricted-apis).
//This must be a real Bearer token authenticated with an app subscribed to Hello World Sandbox
//",
//in: "header",
//name: "Authorization",
//required: false,
//schema: {
//example: "Bearer g1112R_ccQ1Ebbb4gtHBP1aaaNM",
//format: "^Bearer\ [[:ascii:]]+$",
//type: "string"
//}
//}
//],
//responses: {
//200: {
//content: {
//application/json: {
//example: {
//message: "Hello application!"
//},
//schema: {
//properties: {
//message: {
//example: "Hello application!",
//type: "string"
//}
//},
//type: "object"
//}
//}
//},
//description: "Successful response"
//},
//401: {
//description: "API Key or access token is missing or invalid."
//}
//},
//security: [
//{
//app-level0: [ ]
//},
//{
//app-level3: [ ]
//}
//],
//summary: "Get a "Hello application!" response from an application-restricted endpoint"
//}
//},
///hello/user: {
//get: {
//description: "## Overview
//Use this endpoint alongside our [user-restricted REST API tutorial](https://digital.nhs.uk/developer/guides-and-documentation/tutorials/user-restricted-rest-api-tutorial) to learn how to connect to our APIs.
//",
//operationId: "getHelloToken",
//parameters: [
//{
//description: "An [OAuth 2.0 bearer token](https://digital.nhs.uk/developer/guides-and-documentation/security-and-authorisation#user-restricted-apis).
//This must be a real Bearer token authenticated with an app subscribed to Hello World Sandbox
//",
//in: "header",
//name: "Authorization",
//required: true,
//schema: {
//example: "Bearer g1112R_ccQ1Ebbb4gtHBP1aaaNM",
//format: "^Bearer\ [[:ascii:]]+$",
//type: "string"
//}
//}
//],
//responses: {
//200: {
//content: {
//application/json: {
//example: {
//message: "Hello user!"
//},
//schema: {
//properties: {
//message: {
//example: "Hello user!",
//type: "string"
//}
//},
//type: "object"
//}
//}
//},
//description: "Successful response"
//},
//401: {
//content: {
//application/json: {
//example: {
//message: "Invalid access token"
//}
//}
//},
//description: "Missing or invalid OAuth 2.0 Access Token"
//}
//},
//security: [
//{
//nhs-login-p0: [ ]
//},
//{
//nhs-cis2-aal3: [ ]
//}
//],
//summary: "Get a "Hello user!" response from a user-restricted endpoint"
//}
//},
///hello/world: {
//get: {
//description: "## Overview
//Use this endpoint alongside our [open-access REST API tutorial](https://digital.nhs.uk/developer/guides-and-documentation/tutorials/open-access-rest-api-tutorial) to learn how to connect to our APIs.
//",
//operationId: "getHello",
//responses: {
//200: {
//content: {
//application/json: {
//example: {
//message: "Hello world!"
//},
//schema: {
//properties: {
//message: {
//example: "Hello world!",
//type: "string"
//}
//},
//type: "object"
//}
//}
//},
//description: "Successful response."
//}
//},
//security: [ ],
//summary: "Get a "Hello world!" response from an open-access endpoint"
//}
//}
//},
//servers: [
//{
//description: "Sandbox environment.",
//url: "https://sandbox.api.service.nhs.uk/specification/hello-world"
//}
//]
//}