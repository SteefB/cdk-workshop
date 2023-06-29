# Serverless event manager

This is a serverless event manager built with AWS Lambda, API Gatewayand  DynamoDB. It allows users to create, update, and delete events.

## Deploy the application

Before deploying the application you need to install the CDK CLI

```bash
npm install -g aws-cdk
```

## Login to AWS on the jfl-plg account 
    
```bash
saml2aws login --force
```
select the jfl-plg account (736364145277)

In order to deploy the application run the following commands:

```bash
cd cdk
cdk deploy CdkWorkshopStack
```
