package com.box.boxjavalibv2.requests;

import com.box.boxjavalibv2.IBoxConfig;
import com.box.boxjavalibv2.jsonparsing.IBoxJSONParser;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;
import com.box.restclientv2.requestsbase.BoxDefaultRequestObject;
import com.box.restclientv2.requestsbase.DefaultBoxRequest;

public class GetFileMetadataRequest extends DefaultBoxRequest{
  
  public static final String URI = "/files/%s/metadata/global/properties";
  
  /**
   * Constructor.
   * 
   * @param config
   *            config
   * @param parser
   *            json parser
   * @param fileId
   *            id of the file
   * @param requestObject
   *            object that goes into request.
   * @throws BoxRestException
   *             exception
   */
  public GetFileMetadataRequest(IBoxConfig config, IBoxJSONParser jsonParser,
      String fileId, BoxDefaultRequestObject requestObject) throws BoxRestException {
    super(config, jsonParser, getUri(fileId), RestMethod.GET, requestObject);
  }
  
  /**
   * Get uri.
   * 
   * @param fileId
   *            id of the file
   * @return uri
   */
  public static String getUri(final String fileId) {
      return String.format(URI, fileId);
  }
}
