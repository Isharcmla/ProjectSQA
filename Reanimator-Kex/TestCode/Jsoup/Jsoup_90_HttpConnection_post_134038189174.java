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

public class HttpConnection_post_134038189174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7648;

    public HttpConnection_post_134038189174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7653 = new ArrayList();
        Class<? extends Object> term35343 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term35342 = ((Class) term35343).getDeclaredField((String) "GET");
        ((Field) term35342).setAccessible(true);
        Object enum103 = ((Field) term35342).get((Object) null);
        LinkedHashMap term7698 = new LinkedHashMap();
        LinkedHashMap term7714 = new LinkedHashMap();
        LinkedHashMap term7725 = new LinkedHashMap();
        LinkedHashMap term7731 = new LinkedHashMap();
        term7648 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term7649 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term7659 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term7660 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term7665 = (Object[]) newArray("java.lang.String", 1);
        Object term7666 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term7670 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7674 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term7676 = (Object[]) newArray("java.lang.Object", 0);
        Object term7679 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term7720 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term7649, term7649.getClass(), "proxy", null);
        setIntField(term7649, term7649.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term7649, term7649.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term7649, term7649.getClass(), "followRedirects", true);
        setField(term7649, term7649.getClass(), "data", term7653);
        setField(term7649, term7649.getClass(), "body", null);
        setBooleanField(term7649, term7649.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term7649, term7649.getClass(), "ignoreContentType", false);
        setField(term7660, term7660.getClass(), "state", null);
        setField(term7660, term7660.getClass(), "originalState", null);
        setBooleanField(term7660, term7660.getClass(), "baseUriSetFromDoc", false);
        setField(term7660, term7660.getClass(), "headElement", null);
        setField(term7660, term7660.getClass(), "formElement", null);
        setField(term7660, term7660.getClass(), "contextElement", null);
        setField(term7660, term7660.getClass(), "formattingElements", null);
        setField(term7660, term7660.getClass(), "pendingTableCharacters", null);
        setField(term7660, term7660.getClass(), "emptyEnd", null);
        setBooleanField(term7660, term7660.getClass(), "framesetOk", false);
        setBooleanField(term7660, term7660.getClass(), "fosterInserts", false);
        setBooleanField(term7660, term7660.getClass(), "fragmentParsing", false);
        setField(term7660, term7660.getClass(), "specificScopeTarget", term7665);
        setField(term7660, term7660.getClass(), "parser", null);
        setField(term7660, term7660.getClass(), "reader", null);
        setField(term7660, term7660.getClass(), "tokeniser", null);
        setField(term7660, term7660.getClass(), "doc", null);
        setField(term7660, term7660.getClass(), "stack", null);
        setField(term7660, term7660.getClass(), "baseUri", null);
        setField(term7660, term7660.getClass(), "currentToken", null);
        setField(term7660, term7660.getClass(), "settings", null);
        setField(term7666, term7666.getClass(), "tagName", null);
        setField(term7666, term7666.getClass(), "normalName", null);
        setField(term7666, term7666.getClass(), "pendingAttributeName", null);
        setField(term7666, term7666.getClass(), "pendingAttributeValue", null);
        setField(term7666, term7666.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7666, term7666.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7666, term7666.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7666, term7666.getClass(), "selfClosing", false);
        setField(term7666, term7666.getClass(), "attributes", null);
        setField(term7666, term7666.getClass(), "type", null);
        setField(term7660, term7660.getClass(), "start", term7666);
        setField(term7670, term7670.getClass(), "tagName", null);
        setField(term7670, term7670.getClass(), "normalName", null);
        setField(term7670, term7670.getClass(), "pendingAttributeName", null);
        setField(term7670, term7670.getClass(), "pendingAttributeValue", null);
        setField(term7670, term7670.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7670, term7670.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7670, term7670.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7670, term7670.getClass(), "selfClosing", false);
        setField(term7670, term7670.getClass(), "attributes", null);
        setField(term7670, term7670.getClass(), "type", null);
        setField(term7660, term7660.getClass(), "end", term7670);
        setField(term7659, term7659.getClass(), "treeBuilder", term7660);
        setIntField(term7674, term7674.getClass(), "maxSize", 0);
        setField(term7674, term7674.getClass(), "elementData", term7676);
        setIntField(term7674, term7674.getClass(), "size", 0);
        setIntField(term7674, term7674.getClass(), "modCount", 0);
        setField(term7659, term7659.getClass(), "errors", term7674);
        setBooleanField(term7679, term7679.getClass(), "preserveTagCase", false);
        setBooleanField(term7679, term7679.getClass(), "preserveAttributeCase", false);
        setField(term7659, term7659.getClass(), "settings", term7679);
        setField(term7649, term7649.getClass(), "parser", term7659);
        setBooleanField(term7649, term7649.getClass(), "parserDefined", false);
        setField(term7649, term7649.getClass(), "postDataCharset", "UTF-8");
        setField(term7649, term7649.getClass(), "sslSocketFactory", null);
        setField(term7649, term7649.getClass(), "url", null);
        setField(term7649, term7649.getClass(), "method", enum103);
        setField(term7649, term7649.getClass(), "headers", term7698);
        setField(term7649, term7649.getClass(), "cookies", term7714);
        setField(term7648, term7648.getClass(), "req", term7649);
        setIntField(term7720, term7720.getClass(), "statusCode", 0);
        setField(term7720, term7720.getClass(), "statusMessage", null);
        setField(term7720, term7720.getClass(), "byteData", null);
        setField(term7720, term7720.getClass(), "bodyStream", null);
        setField(term7720, term7720.getClass(), "conn", null);
        setField(term7720, term7720.getClass(), "charset", null);
        setField(term7720, term7720.getClass(), "contentType", null);
        setBooleanField(term7720, term7720.getClass(), "executed", false);
        setBooleanField(term7720, term7720.getClass(), "inputStreamRead", false);
        setIntField(term7720, term7720.getClass(), "numRedirects", 0);
        setField(term7720, term7720.getClass(), "req", null);
        setField(term7720, term7720.getClass(), "url", null);
        setField(term7720, term7720.getClass(), "method", null);
        setField(term7720, term7720.getClass(), "headers", term7725);
        setField(term7720, term7720.getClass(), "cookies", term7731);
        setField(term7648, term7648.getClass(), "res", term7720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "post", argTypes, term7648, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


