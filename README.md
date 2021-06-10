# product-service
The product service is use to interact with the product database use in the coffee shop app

This main branch should stay empty,  
Code from a feature branch Code 
Deploy will be deploy from the branch. This service is use for live coding demo of a Quarkus project

The product service is generated using (Quarkus)[https://quarkus.io/]

Generate the quarkus project.

mvn io.quarkus:quarkus-maven-plugin:1.13.6.Final:create \
-DprojectGroupId=com.thecat \
-DprojectArtifactId=product-service \
-DclassName="com.thecat.product.endpoint.ProductResources" \
-Dpath="/product"

Track changes with git

git init -b <feature_branch_name>

Add the remote repository
git remote add origin https://github.com/froberge/product-service.git


Push to remote repository
git push -u origin <feature_branch_name>

