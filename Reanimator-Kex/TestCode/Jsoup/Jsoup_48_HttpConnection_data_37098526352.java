package org.jsoup.helper;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;

public class HttpConnection_data_37098526352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4087;
     Object term4174;

    public HttpConnection_data_37098526352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4092 = new ArrayList();
        ArrayList term4101 = new ArrayList();
        ArrayList term4104 = new ArrayList();
        Class<? extends Object> term21733 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term21732 = ((Class) term21733).getDeclaredField((String) "GET");
        ((Field) term21732).setAccessible(true);
        Object enum71 = ((Field) term21732).get((Object) null);
        LinkedHashMap term4141 = new LinkedHashMap();
        LinkedHashMap term4152 = new LinkedHashMap();
        LinkedHashMap term4162 = new LinkedHashMap();
        LinkedHashMap term4168 = new LinkedHashMap();
        term4087 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term4088 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term4098 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term4099 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term4107 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term4114 = (Object[]) newArray("java.lang.String", 1);
        Object term4115 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term4119 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term4158 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term4088, term4088.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term4088, term4088.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term4088, term4088.getClass(), "followRedirects", true);
        setField(term4088, term4088.getClass(), "data", term4092);
        setBooleanField(term4088, term4088.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term4088, term4088.getClass(), "ignoreContentType", false);
        setField(term4099, term4099.getClass(), "state", null);
        setField(term4099, term4099.getClass(), "originalState", null);
        setBooleanField(term4099, term4099.getClass(), "baseUriSetFromDoc", false);
        setField(term4099, term4099.getClass(), "headElement", null);
        setField(term4099, term4099.getClass(), "formElement", null);
        setField(term4099, term4099.getClass(), "contextElement", null);
        setField(term4099, term4099.getClass(), "formattingElements", term4101);
        setField(term4099, term4099.getClass(), "pendingTableCharacters", term4104);
        setField(term4107, term4107.getClass(), "tagName", null);
        setField(term4107, term4107.getClass(), "pendingAttributeName", null);
        setField(term4107, term4107.getClass(), "pendingAttributeValue", null);
        setBooleanField(term4107, term4107.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term4107, term4107.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term4107, term4107.getClass(), "selfClosing", false);
        setField(term4107, term4107.getClass(), "attributes", null);
        setField(term4107, term4107.getClass(), "type", null);
        setField(term4099, term4099.getClass(), "emptyEnd", term4107);
        setBooleanField(term4099, term4099.getClass(), "framesetOk", true);
        setBooleanField(term4099, term4099.getClass(), "fosterInserts", false);
        setBooleanField(term4099, term4099.getClass(), "fragmentParsing", false);
        setField(term4099, term4099.getClass(), "specificScopeTarget", term4114);
        setField(term4099, term4099.getClass(), "reader", null);
        setField(term4099, term4099.getClass(), "tokeniser", null);
        setField(term4099, term4099.getClass(), "doc", null);
        setField(term4099, term4099.getClass(), "stack", null);
        setField(term4099, term4099.getClass(), "baseUri", null);
        setField(term4099, term4099.getClass(), "currentToken", null);
        setField(term4099, term4099.getClass(), "errors", null);
        setField(term4115, term4115.getClass(), "tagName", null);
        setField(term4115, term4115.getClass(), "pendingAttributeName", null);
        setField(term4115, term4115.getClass(), "pendingAttributeValue", null);
        setBooleanField(term4115, term4115.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term4115, term4115.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term4115, term4115.getClass(), "selfClosing", false);
        setField(term4115, term4115.getClass(), "attributes", null);
        setField(term4115, term4115.getClass(), "type", null);
        setField(term4099, term4099.getClass(), "start", term4115);
        setField(term4119, term4119.getClass(), "tagName", null);
        setField(term4119, term4119.getClass(), "pendingAttributeName", null);
        setField(term4119, term4119.getClass(), "pendingAttributeValue", null);
        setBooleanField(term4119, term4119.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term4119, term4119.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term4119, term4119.getClass(), "selfClosing", false);
        setField(term4119, term4119.getClass(), "attributes", null);
        setField(term4119, term4119.getClass(), "type", null);
        setField(term4099, term4099.getClass(), "end", term4119);
        setField(term4098, term4098.getClass(), "treeBuilder", term4099);
        setIntField(term4098, term4098.getClass(), "maxErrors", 0);
        setField(term4098, term4098.getClass(), "errors", null);
        setField(term4088, term4088.getClass(), "parser", term4098);
        setBooleanField(term4088, term4088.getClass(), "parserDefined", false);
        setBooleanField(term4088, term4088.getClass(), "validateTSLCertificates", true);
        setField(term4088, term4088.getClass(), "postDataCharset", "UTF-8");
        setField(term4088, term4088.getClass(), "url", null);
        setField(term4088, term4088.getClass(), "method", enum71);
        setField(term4088, term4088.getClass(), "headers", term4141);
        setField(term4088, term4088.getClass(), "cookies", term4152);
        setField(term4087, term4087.getClass(), "req", term4088);
        setIntField(term4158, term4158.getClass(), "statusCode", 0);
        setField(term4158, term4158.getClass(), "statusMessage", null);
        setField(term4158, term4158.getClass(), "byteData", null);
        setField(term4158, term4158.getClass(), "charset", null);
        setField(term4158, term4158.getClass(), "contentType", null);
        setBooleanField(term4158, term4158.getClass(), "executed", false);
        setIntField(term4158, term4158.getClass(), "numRedirects", 0);
        setField(term4158, term4158.getClass(), "req", null);
        setField(term4158, term4158.getClass(), "url", null);
        setField(term4158, term4158.getClass(), "method", null);
        setField(term4158, term4158.getClass(), "headers", term4162);
        setField(term4158, term4158.getClass(), "cookies", term4168);
        setField(term4087, term4087.getClass(), "res", term4158);
        term4174 = (Object[]) newArray("java.lang.String", 9);
        setElement(term4174, 0, "hNxWaHcfhY");
        setElement(term4174, 1, "RkybSrpybU");
        setElement(term4174, 2, "xOEqzGAmDU");
        setElement(term4174, 3, "eZFUvlxvGV");
        setElement(term4174, 4, "BYqFIqCKAV");
        setElement(term4174, 5, "vrQLuWIDJX");
        setElement(term4174, 6, "flxyYxBRtu");
        setElement(term4174, 7, "OclPbYPkcH");
        setElement(term4174, 8, "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4174;
        try {
            callMethod(klass, "data", argTypes, term4087, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


