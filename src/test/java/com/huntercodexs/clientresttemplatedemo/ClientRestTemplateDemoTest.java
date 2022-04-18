package com.huntercodexs.clientresttemplatedemo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientRestTemplateDemoTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    /**
     * Confirm Device Sms and Mail
     */

    @Test
    public void whenRequestToConfirmDeviceButNoBodyRequest_RetrieveMissingBodyRequest_400() throws Exception {
        badRequestByHttpPost(
                props.getProperty("test.post-confirm-device-uri-base"),
                props.getProperty("test.post-confirm-device-username"),
                props.getProperty("test.post-confirm-device-no-body"));
    }

    @Test
    public void whenRequestToConfirmDeviceButNoUsername_RetrieveMissingUsername_400() throws Exception {
        badRequestByHttpPost(
                props.getProperty("test.post-confirm-device-uri-base"),
                "", /*id = username*/
                props.getProperty("test.post-confirm-device-no-body-data"));
    }

    @Test
    public void whenRequestToConfirmDeviceButNoType_RetrieveMissingType_400() throws Exception {
        badRequestByHttpPost(
                props.getProperty("test.post-confirm-device-uri-base"),
                props.getProperty("test.post-confirm-device-username"),
                props.getProperty("test.post-confirm-device-no-type"));
    }

    @Test
    public void whenRequestToConfirmDeviceButUserNotFound_RetrieveUserNotFound_404() throws Exception {
        notFoundByHttpPost(
                props.getProperty("test.post-confirm-device-uri-base"),
                props.getProperty("test.post-confirm-device-username-not-found"),
                props.getProperty("test.post-confirm-device-no-type-not-found"));
    }

    @Test
    public void whenRequestToConfirmDeviceButServerError_RetrieveServerError_500() throws Exception {
        serverErrorByHttpPost(
                props.getProperty("test.post-confirm-device-uri-base"),
                props.getProperty("test.post-confirm-device-username"),
                props.getProperty("test.post-confirm-device-server-error"));
    }

}
