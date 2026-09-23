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

public class HttpConnection_execute_114218420460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6115;

    public HttpConnection_execute_114218420460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6120 = new ArrayList();
        ArrayList term6129 = new ArrayList();
        ArrayList term6132 = new ArrayList();
        Class<? extends Object> term26694 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term26693 = ((Class) term26694).getDeclaredField((String) "GET");
        ((Field) term26693).setAccessible(true);
        Object enum85 = ((Field) term26693).get((Object) null);
        LinkedHashMap term6169 = new LinkedHashMap();
        LinkedHashMap term6180 = new LinkedHashMap();
        LinkedHashMap term6190 = new LinkedHashMap();
        LinkedHashMap term6196 = new LinkedHashMap();
        term6115 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term6116 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term6126 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term6127 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term6135 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term6142 = (Object[]) newArray("java.lang.String", 1);
        Object term6143 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term6147 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term6186 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term6116, term6116.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term6116, term6116.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term6116, term6116.getClass(), "followRedirects", true);
        setField(term6116, term6116.getClass(), "data", term6120);
        setBooleanField(term6116, term6116.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term6116, term6116.getClass(), "ignoreContentType", false);
        setField(term6127, term6127.getClass(), "state", null);
        setField(term6127, term6127.getClass(), "originalState", null);
        setBooleanField(term6127, term6127.getClass(), "baseUriSetFromDoc", false);
        setField(term6127, term6127.getClass(), "headElement", null);
        setField(term6127, term6127.getClass(), "formElement", null);
        setField(term6127, term6127.getClass(), "contextElement", null);
        setField(term6127, term6127.getClass(), "formattingElements", term6129);
        setField(term6127, term6127.getClass(), "pendingTableCharacters", term6132);
        setField(term6135, term6135.getClass(), "tagName", null);
        setField(term6135, term6135.getClass(), "pendingAttributeName", null);
        setField(term6135, term6135.getClass(), "pendingAttributeValue", null);
        setBooleanField(term6135, term6135.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6135, term6135.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6135, term6135.getClass(), "selfClosing", false);
        setField(term6135, term6135.getClass(), "attributes", null);
        setField(term6135, term6135.getClass(), "type", null);
        setField(term6127, term6127.getClass(), "emptyEnd", term6135);
        setBooleanField(term6127, term6127.getClass(), "framesetOk", true);
        setBooleanField(term6127, term6127.getClass(), "fosterInserts", false);
        setBooleanField(term6127, term6127.getClass(), "fragmentParsing", false);
        setField(term6127, term6127.getClass(), "specificScopeTarget", term6142);
        setField(term6127, term6127.getClass(), "reader", null);
        setField(term6127, term6127.getClass(), "tokeniser", null);
        setField(term6127, term6127.getClass(), "doc", null);
        setField(term6127, term6127.getClass(), "stack", null);
        setField(term6127, term6127.getClass(), "baseUri", null);
        setField(term6127, term6127.getClass(), "currentToken", null);
        setField(term6127, term6127.getClass(), "errors", null);
        setField(term6143, term6143.getClass(), "tagName", null);
        setField(term6143, term6143.getClass(), "pendingAttributeName", null);
        setField(term6143, term6143.getClass(), "pendingAttributeValue", null);
        setBooleanField(term6143, term6143.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6143, term6143.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6143, term6143.getClass(), "selfClosing", false);
        setField(term6143, term6143.getClass(), "attributes", null);
        setField(term6143, term6143.getClass(), "type", null);
        setField(term6127, term6127.getClass(), "start", term6143);
        setField(term6147, term6147.getClass(), "tagName", null);
        setField(term6147, term6147.getClass(), "pendingAttributeName", null);
        setField(term6147, term6147.getClass(), "pendingAttributeValue", null);
        setBooleanField(term6147, term6147.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6147, term6147.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6147, term6147.getClass(), "selfClosing", false);
        setField(term6147, term6147.getClass(), "attributes", null);
        setField(term6147, term6147.getClass(), "type", null);
        setField(term6127, term6127.getClass(), "end", term6147);
        setField(term6126, term6126.getClass(), "treeBuilder", term6127);
        setIntField(term6126, term6126.getClass(), "maxErrors", 0);
        setField(term6126, term6126.getClass(), "errors", null);
        setField(term6116, term6116.getClass(), "parser", term6126);
        setBooleanField(term6116, term6116.getClass(), "parserDefined", false);
        setBooleanField(term6116, term6116.getClass(), "validateTSLCertificates", true);
        setField(term6116, term6116.getClass(), "postDataCharset", "UTF-8");
        setField(term6116, term6116.getClass(), "url", null);
        setField(term6116, term6116.getClass(), "method", enum85);
        setField(term6116, term6116.getClass(), "headers", term6169);
        setField(term6116, term6116.getClass(), "cookies", term6180);
        setField(term6115, term6115.getClass(), "req", term6116);
        setIntField(term6186, term6186.getClass(), "statusCode", 0);
        setField(term6186, term6186.getClass(), "statusMessage", null);
        setField(term6186, term6186.getClass(), "byteData", null);
        setField(term6186, term6186.getClass(), "charset", null);
        setField(term6186, term6186.getClass(), "contentType", null);
        setBooleanField(term6186, term6186.getClass(), "executed", false);
        setIntField(term6186, term6186.getClass(), "numRedirects", 0);
        setField(term6186, term6186.getClass(), "req", null);
        setField(term6186, term6186.getClass(), "url", null);
        setField(term6186, term6186.getClass(), "method", null);
        setField(term6186, term6186.getClass(), "headers", term6190);
        setField(term6186, term6186.getClass(), "cookies", term6196);
        setField(term6115, term6115.getClass(), "res", term6186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "execute", argTypes, term6115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


