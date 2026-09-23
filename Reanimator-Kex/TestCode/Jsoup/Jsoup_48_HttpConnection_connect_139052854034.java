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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;

public class HttpConnection_connect_139052854034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term9508;
     Object term9199;

    public HttpConnection_connect_139052854034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("java.net.URL"));
        Object term67 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term23, term23.getClass(), "protocol", "http");
        setField(term23, term23.getClass(), "host", "www.oracle.com");
        setIntField(term23, term23.getClass(), "port", -1);
        setField(term23, term23.getClass(), "file", "");
        setField(term23, term23.getClass(), "query", null);
        setField(term23, term23.getClass(), "authority", "www.oracle.com");
        setField(term23, term23.getClass(), "path", "");
        setField(term23, term23.getClass(), "userInfo", null);
        setField(term23, term23.getClass(), "ref", null);
        setField(term23, term23.getClass(), "hostAddress", null);
        setField(term67, term67.getClass(), "proxy", null);
        setIntField(term67, term67.getClass(), "proxyPort", -1);
        setField(term23, term23.getClass(), "handler", term67);
        setField(term23, term23.getClass(), "tempState", null);
        term9508 = newInstance(Class.forName("java.net.URL"));
        Object term9519 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term9508, term9508.getClass(), "protocol", "http");
        setField(term9508, term9508.getClass(), "host", "www.oracle.com");
        setIntField(term9508, term9508.getClass(), "port", -1);
        setField(term9508, term9508.getClass(), "file", "");
        setField(term9508, term9508.getClass(), "query", null);
        setField(term9508, term9508.getClass(), "authority", "www.oracle.com");
        setField(term9508, term9508.getClass(), "path", "");
        setField(term9508, term9508.getClass(), "userInfo", null);
        setField(term9508, term9508.getClass(), "ref", null);
        setField(term9508, term9508.getClass(), "hostAddress", null);
        setField(term9519, term9519.getClass(), "proxy", null);
        setIntField(term9519, term9519.getClass(), "proxyPort", -1);
        setField(term9508, term9508.getClass(), "handler", term9519);
        setField(term9508, term9508.getClass(), "tempState", null);
        ArrayList term9204 = new ArrayList();
        ArrayList term9213 = new ArrayList();
        ArrayList term9216 = new ArrayList();
        Class<? extends Object> term9622 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term9621 = ((Class) term9622).getDeclaredField((String) "GET");
        ((Field) term9621).setAccessible(true);
        Object enum28 = ((Field) term9621).get((Object) null);
        LinkedHashMap term9299 = new LinkedHashMap();
        LinkedHashMap term9310 = new LinkedHashMap();
        LinkedHashMap term9320 = new LinkedHashMap();
        LinkedHashMap term9326 = new LinkedHashMap();
        term9199 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term9200 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term9210 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term9211 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term9219 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term9226 = (Object[]) newArray("java.lang.String", 1);
        Object term9227 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term9231 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term9245 = newInstance(Class.forName("java.net.URL"));
        Object term9289 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        Object term9316 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term9200, term9200.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term9200, term9200.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term9200, term9200.getClass(), "followRedirects", true);
        setField(term9200, term9200.getClass(), "data", term9204);
        setBooleanField(term9200, term9200.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term9200, term9200.getClass(), "ignoreContentType", false);
        setField(term9211, term9211.getClass(), "state", null);
        setField(term9211, term9211.getClass(), "originalState", null);
        setBooleanField(term9211, term9211.getClass(), "baseUriSetFromDoc", false);
        setField(term9211, term9211.getClass(), "headElement", null);
        setField(term9211, term9211.getClass(), "formElement", null);
        setField(term9211, term9211.getClass(), "contextElement", null);
        setField(term9211, term9211.getClass(), "formattingElements", term9213);
        setField(term9211, term9211.getClass(), "pendingTableCharacters", term9216);
        setField(term9219, term9219.getClass(), "tagName", null);
        setField(term9219, term9219.getClass(), "pendingAttributeName", null);
        setField(term9219, term9219.getClass(), "pendingAttributeValue", null);
        setBooleanField(term9219, term9219.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9219, term9219.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term9219, term9219.getClass(), "selfClosing", false);
        setField(term9219, term9219.getClass(), "attributes", null);
        setField(term9219, term9219.getClass(), "type", null);
        setField(term9211, term9211.getClass(), "emptyEnd", term9219);
        setBooleanField(term9211, term9211.getClass(), "framesetOk", true);
        setBooleanField(term9211, term9211.getClass(), "fosterInserts", false);
        setBooleanField(term9211, term9211.getClass(), "fragmentParsing", false);
        setField(term9211, term9211.getClass(), "specificScopeTarget", term9226);
        setField(term9211, term9211.getClass(), "reader", null);
        setField(term9211, term9211.getClass(), "tokeniser", null);
        setField(term9211, term9211.getClass(), "doc", null);
        setField(term9211, term9211.getClass(), "stack", null);
        setField(term9211, term9211.getClass(), "baseUri", null);
        setField(term9211, term9211.getClass(), "currentToken", null);
        setField(term9211, term9211.getClass(), "errors", null);
        setField(term9227, term9227.getClass(), "tagName", null);
        setField(term9227, term9227.getClass(), "pendingAttributeName", null);
        setField(term9227, term9227.getClass(), "pendingAttributeValue", null);
        setBooleanField(term9227, term9227.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9227, term9227.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term9227, term9227.getClass(), "selfClosing", false);
        setField(term9227, term9227.getClass(), "attributes", null);
        setField(term9227, term9227.getClass(), "type", null);
        setField(term9211, term9211.getClass(), "start", term9227);
        setField(term9231, term9231.getClass(), "tagName", null);
        setField(term9231, term9231.getClass(), "pendingAttributeName", null);
        setField(term9231, term9231.getClass(), "pendingAttributeValue", null);
        setBooleanField(term9231, term9231.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9231, term9231.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term9231, term9231.getClass(), "selfClosing", false);
        setField(term9231, term9231.getClass(), "attributes", null);
        setField(term9231, term9231.getClass(), "type", null);
        setField(term9211, term9211.getClass(), "end", term9231);
        setField(term9210, term9210.getClass(), "treeBuilder", term9211);
        setIntField(term9210, term9210.getClass(), "maxErrors", 0);
        setField(term9210, term9210.getClass(), "errors", null);
        setField(term9200, term9200.getClass(), "parser", term9210);
        setBooleanField(term9200, term9200.getClass(), "parserDefined", false);
        setBooleanField(term9200, term9200.getClass(), "validateTSLCertificates", true);
        setField(term9200, term9200.getClass(), "postDataCharset", "UTF-8");
        setField(term9245, term9245.getClass(), "protocol", "http");
        setField(term9245, term9245.getClass(), "host", "www.oracle.com");
        setIntField(term9245, term9245.getClass(), "port", -1);
        setField(term9245, term9245.getClass(), "file", "");
        setField(term9245, term9245.getClass(), "query", null);
        setField(term9245, term9245.getClass(), "authority", "www.oracle.com");
        setField(term9245, term9245.getClass(), "path", "");
        setField(term9245, term9245.getClass(), "userInfo", null);
        setField(term9245, term9245.getClass(), "ref", null);
        setField(term9245, term9245.getClass(), "hostAddress", null);
        setField(term9289, term9289.getClass(), "proxy", null);
        setIntField(term9289, term9289.getClass(), "proxyPort", -1);
        setField(term9245, term9245.getClass(), "handler", term9289);
        setField(term9245, term9245.getClass(), "tempState", null);
        setField(term9200, term9200.getClass(), "url", term9245);
        setField(term9200, term9200.getClass(), "method", enum28);
        setField(term9200, term9200.getClass(), "headers", term9299);
        setField(term9200, term9200.getClass(), "cookies", term9310);
        setField(term9199, term9199.getClass(), "req", term9200);
        setIntField(term9316, term9316.getClass(), "statusCode", 0);
        setField(term9316, term9316.getClass(), "statusMessage", null);
        setField(term9316, term9316.getClass(), "byteData", null);
        setField(term9316, term9316.getClass(), "charset", null);
        setField(term9316, term9316.getClass(), "contentType", null);
        setBooleanField(term9316, term9316.getClass(), "executed", false);
        setIntField(term9316, term9316.getClass(), "numRedirects", 0);
        setField(term9316, term9316.getClass(), "req", null);
        setField(term9316, term9316.getClass(), "url", null);
        setField(term9316, term9316.getClass(), "method", null);
        setField(term9316, term9316.getClass(), "headers", term9320);
        setField(term9316, term9316.getClass(), "cookies", term9326);
        setField(term9199, term9199.getClass(), "res", term9316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term23;
        Object retValue = callMethod(klass, "connect", argTypes, null, args);
        assertTrue(recursiveEquals(term23, term9508));
        assertTrue(recursiveEquals(retValue, term9199));
    }

};


