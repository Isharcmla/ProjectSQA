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

public class HttpConnection_request_108401088977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8383;
     Object term36299;
     Object term36103;

    public HttpConnection_request_108401088977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8388 = new ArrayList();
        Class<? extends Object> term36345 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term36344 = ((Class) term36345).getDeclaredField((String) "GET");
        ((Field) term36344).setAccessible(true);
        Object enum107 = ((Field) term36344).get((Object) null);
        LinkedHashMap term8433 = new LinkedHashMap();
        LinkedHashMap term8449 = new LinkedHashMap();
        LinkedHashMap term8460 = new LinkedHashMap();
        LinkedHashMap term8466 = new LinkedHashMap();
        term8383 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term8384 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term8394 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term8395 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term8400 = (Object[]) newArray("java.lang.String", 1);
        Object term8401 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term8405 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term8409 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term8411 = (Object[]) newArray("java.lang.Object", 0);
        Object term8414 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term8455 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term8384, term8384.getClass(), "proxy", null);
        setIntField(term8384, term8384.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term8384, term8384.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term8384, term8384.getClass(), "followRedirects", true);
        setField(term8384, term8384.getClass(), "data", term8388);
        setField(term8384, term8384.getClass(), "body", null);
        setBooleanField(term8384, term8384.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term8384, term8384.getClass(), "ignoreContentType", false);
        setField(term8395, term8395.getClass(), "state", null);
        setField(term8395, term8395.getClass(), "originalState", null);
        setBooleanField(term8395, term8395.getClass(), "baseUriSetFromDoc", false);
        setField(term8395, term8395.getClass(), "headElement", null);
        setField(term8395, term8395.getClass(), "formElement", null);
        setField(term8395, term8395.getClass(), "contextElement", null);
        setField(term8395, term8395.getClass(), "formattingElements", null);
        setField(term8395, term8395.getClass(), "pendingTableCharacters", null);
        setField(term8395, term8395.getClass(), "emptyEnd", null);
        setBooleanField(term8395, term8395.getClass(), "framesetOk", false);
        setBooleanField(term8395, term8395.getClass(), "fosterInserts", false);
        setBooleanField(term8395, term8395.getClass(), "fragmentParsing", false);
        setField(term8395, term8395.getClass(), "specificScopeTarget", term8400);
        setField(term8395, term8395.getClass(), "parser", null);
        setField(term8395, term8395.getClass(), "reader", null);
        setField(term8395, term8395.getClass(), "tokeniser", null);
        setField(term8395, term8395.getClass(), "doc", null);
        setField(term8395, term8395.getClass(), "stack", null);
        setField(term8395, term8395.getClass(), "baseUri", null);
        setField(term8395, term8395.getClass(), "currentToken", null);
        setField(term8395, term8395.getClass(), "settings", null);
        setField(term8401, term8401.getClass(), "tagName", null);
        setField(term8401, term8401.getClass(), "normalName", null);
        setField(term8401, term8401.getClass(), "pendingAttributeName", null);
        setField(term8401, term8401.getClass(), "pendingAttributeValue", null);
        setField(term8401, term8401.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term8401, term8401.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term8401, term8401.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term8401, term8401.getClass(), "selfClosing", false);
        setField(term8401, term8401.getClass(), "attributes", null);
        setField(term8401, term8401.getClass(), "type", null);
        setField(term8395, term8395.getClass(), "start", term8401);
        setField(term8405, term8405.getClass(), "tagName", null);
        setField(term8405, term8405.getClass(), "normalName", null);
        setField(term8405, term8405.getClass(), "pendingAttributeName", null);
        setField(term8405, term8405.getClass(), "pendingAttributeValue", null);
        setField(term8405, term8405.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term8405, term8405.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term8405, term8405.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term8405, term8405.getClass(), "selfClosing", false);
        setField(term8405, term8405.getClass(), "attributes", null);
        setField(term8405, term8405.getClass(), "type", null);
        setField(term8395, term8395.getClass(), "end", term8405);
        setField(term8394, term8394.getClass(), "treeBuilder", term8395);
        setIntField(term8409, term8409.getClass(), "maxSize", 0);
        setField(term8409, term8409.getClass(), "elementData", term8411);
        setIntField(term8409, term8409.getClass(), "size", 0);
        setIntField(term8409, term8409.getClass(), "modCount", 0);
        setField(term8394, term8394.getClass(), "errors", term8409);
        setBooleanField(term8414, term8414.getClass(), "preserveTagCase", false);
        setBooleanField(term8414, term8414.getClass(), "preserveAttributeCase", false);
        setField(term8394, term8394.getClass(), "settings", term8414);
        setField(term8384, term8384.getClass(), "parser", term8394);
        setBooleanField(term8384, term8384.getClass(), "parserDefined", false);
        setField(term8384, term8384.getClass(), "postDataCharset", "UTF-8");
        setField(term8384, term8384.getClass(), "sslSocketFactory", null);
        setField(term8384, term8384.getClass(), "url", null);
        setField(term8384, term8384.getClass(), "method", enum107);
        setField(term8384, term8384.getClass(), "headers", term8433);
        setField(term8384, term8384.getClass(), "cookies", term8449);
        setField(term8383, term8383.getClass(), "req", term8384);
        setIntField(term8455, term8455.getClass(), "statusCode", 0);
        setField(term8455, term8455.getClass(), "statusMessage", null);
        setField(term8455, term8455.getClass(), "byteData", null);
        setField(term8455, term8455.getClass(), "bodyStream", null);
        setField(term8455, term8455.getClass(), "conn", null);
        setField(term8455, term8455.getClass(), "charset", null);
        setField(term8455, term8455.getClass(), "contentType", null);
        setBooleanField(term8455, term8455.getClass(), "executed", false);
        setBooleanField(term8455, term8455.getClass(), "inputStreamRead", false);
        setIntField(term8455, term8455.getClass(), "numRedirects", 0);
        setField(term8455, term8455.getClass(), "req", null);
        setField(term8455, term8455.getClass(), "url", null);
        setField(term8455, term8455.getClass(), "method", null);
        setField(term8455, term8455.getClass(), "headers", term8460);
        setField(term8455, term8455.getClass(), "cookies", term8466);
        setField(term8383, term8383.getClass(), "res", term8455);
        LinkedHashMap term36301 = new LinkedHashMap();
        LinkedHashMap term36302 = new LinkedHashMap();
        term36299 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term36300 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term36299, term36299.getClass(), "req", null);
        setIntField(term36300, term36300.getClass(), "statusCode", 0);
        setField(term36300, term36300.getClass(), "statusMessage", null);
        setField(term36300, term36300.getClass(), "byteData", null);
        setField(term36300, term36300.getClass(), "bodyStream", null);
        setField(term36300, term36300.getClass(), "conn", null);
        setField(term36300, term36300.getClass(), "charset", null);
        setField(term36300, term36300.getClass(), "contentType", null);
        setBooleanField(term36300, term36300.getClass(), "executed", false);
        setBooleanField(term36300, term36300.getClass(), "inputStreamRead", false);
        setIntField(term36300, term36300.getClass(), "numRedirects", 0);
        setField(term36300, term36300.getClass(), "req", null);
        setField(term36300, term36300.getClass(), "url", null);
        setField(term36300, term36300.getClass(), "method", null);
        setField(term36300, term36300.getClass(), "headers", term36301);
        setField(term36300, term36300.getClass(), "cookies", term36302);
        setField(term36299, term36299.getClass(), "res", term36300);
        LinkedHashMap term36109 = new LinkedHashMap();
        LinkedHashMap term36115 = new LinkedHashMap();
        term36103 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term36104 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term36103, term36103.getClass(), "req", null);
        setIntField(term36104, term36104.getClass(), "statusCode", 0);
        setField(term36104, term36104.getClass(), "statusMessage", null);
        setField(term36104, term36104.getClass(), "byteData", null);
        setField(term36104, term36104.getClass(), "bodyStream", null);
        setField(term36104, term36104.getClass(), "conn", null);
        setField(term36104, term36104.getClass(), "charset", null);
        setField(term36104, term36104.getClass(), "contentType", null);
        setBooleanField(term36104, term36104.getClass(), "executed", false);
        setBooleanField(term36104, term36104.getClass(), "inputStreamRead", false);
        setIntField(term36104, term36104.getClass(), "numRedirects", 0);
        setField(term36104, term36104.getClass(), "req", null);
        setField(term36104, term36104.getClass(), "url", null);
        setField(term36104, term36104.getClass(), "method", null);
        setField(term36104, term36104.getClass(), "headers", term36109);
        setField(term36104, term36104.getClass(), "cookies", term36115);
        setField(term36103, term36103.getClass(), "res", term36104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.Connection$Request");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "request", argTypes, term8383, args);
        assertTrue(recursiveEquals(term8383, term36299));
        assertTrue(recursiveEquals(retValue, term36103));
    }

};


