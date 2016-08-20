<pre style='color:#000000;background:#ffffff;'>Json Parsing Using Jackson
Jackson provides three different ways to process JSON −

Streaming API − It reads and writes JSON content as discrete events<span style='color:#008c00; '>.</span> JsonParser reads the data, whereas JsonGenerator writes the data<span style='color:#008c00; '>.</span>

It is the most powerful approach among the three<span style='color:#008c00; '>.</span>
It has the lowest overhead and it provides the fastest way to perform read/write operations<span style='color:#008c00; '>.</span>
It is analogous to Stax parser for XML<span style='color:#008c00; '>.</span>
Tree Model − It prepares an in-memory tree representation of the JSON document<span style='color:#008c00; '>.</span> 
ObjectMapper (object) build tree of JsonNode (object)nodes<span style='color:#008c00; '>.</span> 
It is most flexible approach<span style='color:#008c00; '>.</span> 
It is analogous to DOM parser for XML<span style='color:#008c00; '>.</span>
Data Binding − It converts JSON to and from Plain Old Java Object (POJO) using property accessor or using annotations<span style='color:#008c00; '>.</span> 
ObjectMapper reads/writes JSON for both types of data bindings<span style='color:#008c00; '>.</span> 
Data binding is analogous to JAXB parser for XML<span style='color:#008c00; '>.</span> 
Data binding is of two types −
Simple Data Binding − It converts JSON to and from Java Maps, Lists, Strings, Numbers, Booleans, and null objects<span style='color:#008c00; '>.</span>
Full Data Binding − It converts JSON to and from any Java type<span style='color:#008c00; '>.</span>

The following library you need if you want to implement jackson in your project<span style='color:#008c00; '>.</span>

There is three different artifact<span style='color:#008c00; '>.</span>
Jackson-core
jackson-databinding
jackson-annotation
Jackson-databinding has compilation dependents on jackson-core &amp; jackson-annonation<span style='color:#008c00; '>.</span> 

**Jackson-core  is for basic JSON streaming API implementation
**Jackson-databinding is for General data-binding functionality for Jackson: works on core streaming API
**Jackson-annonation is for value types, used by Jackson data binding package

In Testing we need lot of classes from jackson-databinding package<span style='color:#008c00; '>.</span> Since it has compilation dependency of other two, we have to include all three artifacts
in our POM file<span style='color:#008c00; '>.</span>
In MAVEN Central repository you will see the same jackson framework with the groupid name org<span style='color:#008c00; '>.</span>codehaus<span style='color:#008c00; '>.</span>jackson<span style='color:#008c00; '>.</span> This is old version of Jackson<span style='color:#008c00; '>.</span> Use com<span style='color:#008c00; '>.</span>fasterxml<span style='color:#008c00; '>.</span>jackson<span style='color:#008c00; '>.</span>core
</pre>
