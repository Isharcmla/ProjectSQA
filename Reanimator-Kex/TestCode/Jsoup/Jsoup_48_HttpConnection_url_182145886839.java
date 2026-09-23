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

public class HttpConnection_url_182145886839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;

    public HttpConnection_url_182145886839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term517 = new ArrayList();
        ArrayList term526 = new ArrayList();
        ArrayList term529 = new ArrayList();
        Class<? extends Object> term12153 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term12152 = ((Class) term12153).getDeclaredField((String) "GET");
        ((Field) term12152).setAccessible(true);
        Object enum33 = ((Field) term12152).get((Object) null);
        LinkedHashMap term566 = new LinkedHashMap();
        LinkedHashMap term577 = new LinkedHashMap();
        LinkedHashMap term587 = new LinkedHashMap();
        LinkedHashMap term593 = new LinkedHashMap();
        term512 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term513 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term523 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term524 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term532 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term539 = (Object[]) newArray("java.lang.String", 1);
        Object term540 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term544 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term583 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term513, term513.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term513, term513.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term513, term513.getClass(), "followRedirects", true);
        setField(term513, term513.getClass(), "data", term517);
        setBooleanField(term513, term513.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term513, term513.getClass(), "ignoreContentType", false);
        setField(term524, term524.getClass(), "state", null);
        setField(term524, term524.getClass(), "originalState", null);
        setBooleanField(term524, term524.getClass(), "baseUriSetFromDoc", false);
        setField(term524, term524.getClass(), "headElement", null);
        setField(term524, term524.getClass(), "formElement", null);
        setField(term524, term524.getClass(), "contextElement", null);
        setField(term524, term524.getClass(), "formattingElements", term526);
        setField(term524, term524.getClass(), "pendingTableCharacters", term529);
        setField(term532, term532.getClass(), "tagName", null);
        setField(term532, term532.getClass(), "pendingAttributeName", null);
        setField(term532, term532.getClass(), "pendingAttributeValue", null);
        setBooleanField(term532, term532.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term532, term532.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term532, term532.getClass(), "selfClosing", false);
        setField(term532, term532.getClass(), "attributes", null);
        setField(term532, term532.getClass(), "type", null);
        setField(term524, term524.getClass(), "emptyEnd", term532);
        setBooleanField(term524, term524.getClass(), "framesetOk", true);
        setBooleanField(term524, term524.getClass(), "fosterInserts", false);
        setBooleanField(term524, term524.getClass(), "fragmentParsing", false);
        setField(term524, term524.getClass(), "specificScopeTarget", term539);
        setField(term524, term524.getClass(), "reader", null);
        setField(term524, term524.getClass(), "tokeniser", null);
        setField(term524, term524.getClass(), "doc", null);
        setField(term524, term524.getClass(), "stack", null);
        setField(term524, term524.getClass(), "baseUri", null);
        setField(term524, term524.getClass(), "currentToken", null);
        setField(term524, term524.getClass(), "errors", null);
        setField(term540, term540.getClass(), "tagName", null);
        setField(term540, term540.getClass(), "pendingAttributeName", null);
        setField(term540, term540.getClass(), "pendingAttributeValue", null);
        setBooleanField(term540, term540.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term540, term540.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term540, term540.getClass(), "selfClosing", false);
        setField(term540, term540.getClass(), "attributes", null);
        setField(term540, term540.getClass(), "type", null);
        setField(term524, term524.getClass(), "start", term540);
        setField(term544, term544.getClass(), "tagName", null);
        setField(term544, term544.getClass(), "pendingAttributeName", null);
        setField(term544, term544.getClass(), "pendingAttributeValue", null);
        setBooleanField(term544, term544.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term544, term544.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term544, term544.getClass(), "selfClosing", false);
        setField(term544, term544.getClass(), "attributes", null);
        setField(term544, term544.getClass(), "type", null);
        setField(term524, term524.getClass(), "end", term544);
        setField(term523, term523.getClass(), "treeBuilder", term524);
        setIntField(term523, term523.getClass(), "maxErrors", 0);
        setField(term523, term523.getClass(), "errors", null);
        setField(term513, term513.getClass(), "parser", term523);
        setBooleanField(term513, term513.getClass(), "parserDefined", false);
        setBooleanField(term513, term513.getClass(), "validateTSLCertificates", true);
        setField(term513, term513.getClass(), "postDataCharset", "UTF-8");
        setField(term513, term513.getClass(), "url", null);
        setField(term513, term513.getClass(), "method", enum33);
        setField(term513, term513.getClass(), "headers", term566);
        setField(term513, term513.getClass(), "cookies", term577);
        setField(term512, term512.getClass(), "req", term513);
        setIntField(term583, term583.getClass(), "statusCode", 0);
        setField(term583, term583.getClass(), "statusMessage", null);
        setField(term583, term583.getClass(), "byteData", null);
        setField(term583, term583.getClass(), "charset", null);
        setField(term583, term583.getClass(), "contentType", null);
        setBooleanField(term583, term583.getClass(), "executed", false);
        setIntField(term583, term583.getClass(), "numRedirects", 0);
        setField(term583, term583.getClass(), "req", null);
        setField(term583, term583.getClass(), "url", null);
        setField(term583, term583.getClass(), "method", null);
        setField(term583, term583.getClass(), "headers", term587);
        setField(term583, term583.getClass(), "cookies", term593);
        setField(term512, term512.getClass(), "res", term583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        try {
            callMethod(klass, "url", argTypes, term512, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


