package com.box.boxjavalibv2.requests;

import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.Test;

import com.box.boxjavalibv2.exceptions.AuthFatalFailureException;
import com.box.boxjavalibv2.testutils.TestUtils;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;

public class GetMetadataRequestTest extends RequestTestBase {

    @Test
    public void testUri() {
        Assert.assertEquals("/metadata/123/metadata/global/properties", GetFileMetadataRequest.getUri("123"));
    }

    @Test
    public void testRequestIsWellFormed() throws BoxRestException, AuthFatalFailureException {
        String id = "testid123";
        
        GetFileMetadataRequest request = new GetFileMetadataRequest(CONFIG, JSON_PARSER, id, null);

        testRequestIsWellFormed(request, TestUtils.getConfig().getApiUrlAuthority(),
            TestUtils.getConfig().getApiUrlPath().concat(GetFileMetadataRequest.getUri(id)), HttpStatus.SC_OK, RestMethod.GET);
    }


}
