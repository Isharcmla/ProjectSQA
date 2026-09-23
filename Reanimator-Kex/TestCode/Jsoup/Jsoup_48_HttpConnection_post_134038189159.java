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
import java.lang.NullPointerException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;

public class HttpConnection_post_134038189159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5872;

    public HttpConnection_post_134038189159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5877 = new ArrayList();
        ArrayList term5886 = new ArrayList();
        ArrayList term5889 = new ArrayList();
        Class<? extends Object> term26189 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term26188 = ((Class) term26189).getDeclaredField((String) "GET");
        ((Field) term26188).setAccessible(true);
        Object enum84 = ((Field) term26188).get((Object) null);
        LinkedHashMap term5926 = new LinkedHashMap();
        LinkedHashMap term5937 = new LinkedHashMap();
        LinkedHashMap term5947 = new LinkedHashMap();
        LinkedHashMap term5953 = new LinkedHashMap();
        term5872 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term5873 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term5883 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term5884 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term5892 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term5899 = (Object[]) newArray("java.lang.String", 1);
        Object term5900 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term5904 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term5943 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term5873, term5873.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term5873, term5873.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term5873, term5873.getClass(), "followRedirects", true);
        setField(term5873, term5873.getClass(), "data", term5877);
        setBooleanField(term5873, term5873.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term5873, term5873.getClass(), "ignoreContentType", false);
        setField(term5884, term5884.getClass(), "state", null);
        setField(term5884, term5884.getClass(), "originalState", null);
        setBooleanField(term5884, term5884.getClass(), "baseUriSetFromDoc", false);
        setField(term5884, term5884.getClass(), "headElement", null);
        setField(term5884, term5884.getClass(), "formElement", null);
        setField(term5884, term5884.getClass(), "contextElement", null);
        setField(term5884, term5884.getClass(), "formattingElements", term5886);
        setField(term5884, term5884.getClass(), "pendingTableCharacters", term5889);
        setField(term5892, term5892.getClass(), "tagName", null);
        setField(term5892, term5892.getClass(), "pendingAttributeName", null);
        setField(term5892, term5892.getClass(), "pendingAttributeValue", null);
        setBooleanField(term5892, term5892.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5892, term5892.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5892, term5892.getClass(), "selfClosing", false);
        setField(term5892, term5892.getClass(), "attributes", null);
        setField(term5892, term5892.getClass(), "type", null);
        setField(term5884, term5884.getClass(), "emptyEnd", term5892);
        setBooleanField(term5884, term5884.getClass(), "framesetOk", true);
        setBooleanField(term5884, term5884.getClass(), "fosterInserts", false);
        setBooleanField(term5884, term5884.getClass(), "fragmentParsing", false);
        setField(term5884, term5884.getClass(), "specificScopeTarget", term5899);
        setField(term5884, term5884.getClass(), "reader", null);
        setField(term5884, term5884.getClass(), "tokeniser", null);
        setField(term5884, term5884.getClass(), "doc", null);
        setField(term5884, term5884.getClass(), "stack", null);
        setField(term5884, term5884.getClass(), "baseUri", null);
        setField(term5884, term5884.getClass(), "currentToken", null);
        setField(term5884, term5884.getClass(), "errors", null);
        setField(term5900, term5900.getClass(), "tagName", null);
        setField(term5900, term5900.getClass(), "pendingAttributeName", null);
        setField(term5900, term5900.getClass(), "pendingAttributeValue", null);
        setBooleanField(term5900, term5900.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5900, term5900.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5900, term5900.getClass(), "selfClosing", false);
        setField(term5900, term5900.getClass(), "attributes", null);
        setField(term5900, term5900.getClass(), "type", null);
        setField(term5884, term5884.getClass(), "start", term5900);
        setField(term5904, term5904.getClass(), "tagName", null);
        setField(term5904, term5904.getClass(), "pendingAttributeName", null);
        setField(term5904, term5904.getClass(), "pendingAttributeValue", null);
        setBooleanField(term5904, term5904.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5904, term5904.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5904, term5904.getClass(), "selfClosing", false);
        setField(term5904, term5904.getClass(), "attributes", null);
        setField(term5904, term5904.getClass(), "type", null);
        setField(term5884, term5884.getClass(), "end", term5904);
        setField(term5883, term5883.getClass(), "treeBuilder", term5884);
        setIntField(term5883, term5883.getClass(), "maxErrors", 0);
        setField(term5883, term5883.getClass(), "errors", null);
        setField(term5873, term5873.getClass(), "parser", term5883);
        setBooleanField(term5873, term5873.getClass(), "parserDefined", false);
        setBooleanField(term5873, term5873.getClass(), "validateTSLCertificates", true);
        setField(term5873, term5873.getClass(), "postDataCharset", "UTF-8");
        setField(term5873, term5873.getClass(), "url", null);
        setField(term5873, term5873.getClass(), "method", enum84);
        setField(term5873, term5873.getClass(), "headers", term5926);
        setField(term5873, term5873.getClass(), "cookies", term5937);
        setField(term5872, term5872.getClass(), "req", term5873);
        setIntField(term5943, term5943.getClass(), "statusCode", 0);
        setField(term5943, term5943.getClass(), "statusMessage", null);
        setField(term5943, term5943.getClass(), "byteData", null);
        setField(term5943, term5943.getClass(), "charset", null);
        setField(term5943, term5943.getClass(), "contentType", null);
        setBooleanField(term5943, term5943.getClass(), "executed", false);
        setIntField(term5943, term5943.getClass(), "numRedirects", 0);
        setField(term5943, term5943.getClass(), "req", null);
        setField(term5943, term5943.getClass(), "url", null);
        setField(term5943, term5943.getClass(), "method", null);
        setField(term5943, term5943.getClass(), "headers", term5947);
        setField(term5943, term5943.getClass(), "cookies", term5953);
        setField(term5872, term5872.getClass(), "res", term5943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "post", argTypes, term5872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


