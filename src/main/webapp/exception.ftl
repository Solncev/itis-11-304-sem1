<html lang="en">

<#include "base.ftl">

<#macro title>
    Exception details
</#macro>

<#macro content>
    <h1>exception details:</h1>
    <strong>Request uri: ${uri}</strong><br>
    <strong>Status code: ${statusCode}</strong><br>
    <#if message??><strong>${message}</strong></#if>
</#macro>


</html>