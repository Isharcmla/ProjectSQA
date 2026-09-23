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

public class HttpConnection_init_161263972137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10390;

    public HttpConnection_init_161263972137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10392 = new ArrayList();
        ArrayList term10396 = new ArrayList();
        ArrayList term10397 = new ArrayList();
        Class<? extends Object> term10422 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term10421 = ((Class) term10422).getDeclaredField((String) "GET");
        ((Field) term10421).setAccessible(true);
        Object enum29 = ((Field) term10421).get((Object) null);
        LinkedHashMap term10407 = new LinkedHashMap();
        LinkedHashMap term10412 = new LinkedHashMap();
        LinkedHashMap term10414 = new LinkedHashMap();
        LinkedHashMap term10415 = new LinkedHashMap();
        term10390 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term10391 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term10394 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term10395 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term10398 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term10399 = (Object[]) newArray("java.lang.String", 1);
        Object term10400 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term10401 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term10413 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term10391, term10391.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term10391, term10391.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term10391, term10391.getClass(), "followRedirects", true);
        setField(term10391, term10391.getClass(), "data", term10392);
        setBooleanField(term10391, term10391.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term10391, term10391.getClass(), "ignoreContentType", false);
        setField(term10395, term10395.getClass(), "state", null);
        setField(term10395, term10395.getClass(), "originalState", null);
        setBooleanField(term10395, term10395.getClass(), "baseUriSetFromDoc", false);
        setField(term10395, term10395.getClass(), "headElement", null);
        setField(term10395, term10395.getClass(), "formElement", null);
        setField(term10395, term10395.getClass(), "contextElement", null);
        setField(term10395, term10395.getClass(), "formattingElements", term10396);
        setField(term10395, term10395.getClass(), "pendingTableCharacters", term10397);
        setField(term10398, term10398.getClass(), "tagName", null);
        setField(term10398, term10398.getClass(), "pendingAttributeName", null);
        setField(term10398, term10398.getClass(), "pendingAttributeValue", null);
        setBooleanField(term10398, term10398.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term10398, term10398.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term10398, term10398.getClass(), "selfClosing", false);
        setField(term10398, term10398.getClass(), "attributes", null);
        setField(term10398, term10398.getClass(), "type", null);
        setField(term10395, term10395.getClass(), "emptyEnd", term10398);
        setBooleanField(term10395, term10395.getClass(), "framesetOk", true);
        setBooleanField(term10395, term10395.getClass(), "fosterInserts", false);
        setBooleanField(term10395, term10395.getClass(), "fragmentParsing", false);
        setField(term10395, term10395.getClass(), "specificScopeTarget", term10399);
        setField(term10395, term10395.getClass(), "reader", null);
        setField(term10395, term10395.getClass(), "tokeniser", null);
        setField(term10395, term10395.getClass(), "doc", null);
        setField(term10395, term10395.getClass(), "stack", null);
        setField(term10395, term10395.getClass(), "baseUri", null);
        setField(term10395, term10395.getClass(), "currentToken", null);
        setField(term10395, term10395.getClass(), "errors", null);
        setField(term10400, term10400.getClass(), "tagName", null);
        setField(term10400, term10400.getClass(), "pendingAttributeName", null);
        setField(term10400, term10400.getClass(), "pendingAttributeValue", null);
        setBooleanField(term10400, term10400.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term10400, term10400.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term10400, term10400.getClass(), "selfClosing", false);
        setField(term10400, term10400.getClass(), "attributes", null);
        setField(term10400, term10400.getClass(), "type", null);
        setField(term10395, term10395.getClass(), "start", term10400);
        setField(term10401, term10401.getClass(), "tagName", null);
        setField(term10401, term10401.getClass(), "pendingAttributeName", null);
        setField(term10401, term10401.getClass(), "pendingAttributeValue", null);
        setBooleanField(term10401, term10401.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term10401, term10401.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term10401, term10401.getClass(), "selfClosing", false);
        setField(term10401, term10401.getClass(), "attributes", null);
        setField(term10401, term10401.getClass(), "type", null);
        setField(term10395, term10395.getClass(), "end", term10401);
        setField(term10394, term10394.getClass(), "treeBuilder", term10395);
        setIntField(term10394, term10394.getClass(), "maxErrors", 0);
        setField(term10394, term10394.getClass(), "errors", null);
        setField(term10391, term10391.getClass(), "parser", term10394);
        setBooleanField(term10391, term10391.getClass(), "parserDefined", false);
        setBooleanField(term10391, term10391.getClass(), "validateTSLCertificates", true);
        setField(term10391, term10391.getClass(), "postDataCharset", "UTF-8");
        setField(term10391, term10391.getClass(), "url", null);
        setField(term10391, term10391.getClass(), "method", enum29);
        setField(term10391, term10391.getClass(), "headers", term10407);
        setField(term10391, term10391.getClass(), "cookies", term10412);
        setField(term10390, term10390.getClass(), "req", term10391);
        setIntField(term10413, term10413.getClass(), "statusCode", 0);
        setField(term10413, term10413.getClass(), "statusMessage", null);
        setField(term10413, term10413.getClass(), "byteData", null);
        setField(term10413, term10413.getClass(), "charset", null);
        setField(term10413, term10413.getClass(), "contentType", null);
        setBooleanField(term10413, term10413.getClass(), "executed", false);
        setIntField(term10413, term10413.getClass(), "numRedirects", 0);
        setField(term10413, term10413.getClass(), "req", null);
        setField(term10413, term10413.getClass(), "url", null);
        setField(term10413, term10413.getClass(), "method", null);
        setField(term10413, term10413.getClass(), "headers", term10414);
        setField(term10413, term10413.getClass(), "cookies", term10415);
        setField(term10390, term10390.getClass(), "res", term10413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10390));
    }

};


