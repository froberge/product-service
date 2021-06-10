# Product Service
The product service interact with the product schema in the coffeeshop database.

#### :warning: Warning
The main branch contain only this README file. This repository is use as a placeholder for live coding sessions with [Quarkus](https://quarkus.io/). Find the step below to create the services

#### Prerequisites
* Your favorite IDE
* JDK 8 or 11+ 
* Maven 3.6.2+

#### Build Step
1. Generate the quarkus project.
```
mvn io.quarkus:quarkus-maven-plugin:1.13.6.Final:create \
-DprojectGroupId=com.thecat \
-DprojectArtifactId=product-service \
-DclassName="com.thecat.product.endpoint.ProductResources" \
-Dpath="/product"
```

2. Track changes with git 
```
git init -b <feature_branch_name>
```

3. Add the remote repository to the new generated project
```
git remote add origin https://github.com/froberge/product-service.git
```
4. Push changes to the remote repositoty
```
git push -u origin <feature_branch_name>
```


