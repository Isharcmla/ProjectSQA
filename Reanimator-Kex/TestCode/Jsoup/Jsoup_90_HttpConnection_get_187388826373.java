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

public class HttpConnection_get_187388826373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7403;

    public HttpConnection_get_187388826373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7408 = new ArrayList();
        Class<? extends Object> term34723 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term34722 = ((Class) term34723).getDeclaredField((String) "GET");
        ((Field) term34722).setAccessible(true);
        Object enum102 = ((Field) term34722).get((Object) null);
        LinkedHashMap term7453 = new LinkedHashMap();
        LinkedHashMap term7469 = new LinkedHashMap();
        LinkedHashMap term7480 = new LinkedHashMap();
        LinkedHashMap term7486 = new LinkedHashMap();
        term7403 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term7404 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term7414 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term7415 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term7420 = (Object[]) newArray("java.lang.String", 1);
        Object term7421 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term7425 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7429 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term7431 = (Object[]) newArray("java.lang.Object", 0);
        Object term7434 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term7475 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term7404, term7404.getClass(), "proxy", null);
        setIntField(term7404, term7404.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term7404, term7404.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term7404, term7404.getClass(), "followRedirects", true);
        setField(term7404, term7404.getClass(), "data", term7408);
        setField(term7404, term7404.getClass(), "body", null);
        setBooleanField(term7404, term7404.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term7404, term7404.getClass(), "ignoreContentType", false);
        setField(term7415, term7415.getClass(), "state", null);
        setField(term7415, term7415.getClass(), "originalState", null);
        setBooleanField(term7415, term7415.getClass(), "baseUriSetFromDoc", false);
        setField(term7415, term7415.getClass(), "headElement", null);
        setField(term7415, term7415.getClass(), "formElement", null);
        setField(term7415, term7415.getClass(), "contextElement", null);
        setField(term7415, term7415.getClass(), "formattingElements", null);
        setField(term7415, term7415.getClass(), "pendingTableCharacters", null);
        setField(term7415, term7415.getClass(), "emptyEnd", null);
        setBooleanField(term7415, term7415.getClass(), "framesetOk", false);
        setBooleanField(term7415, term7415.getClass(), "fosterInserts", false);
        setBooleanField(term7415, term7415.getClass(), "fragmentParsing", false);
        setField(term7415, term7415.getClass(), "specificScopeTarget", term7420);
        setField(term7415, term7415.getClass(), "parser", null);
        setField(term7415, term7415.getClass(), "reader", null);
        setField(term7415, term7415.getClass(), "tokeniser", null);
        setField(term7415, term7415.getClass(), "doc", null);
        setField(term7415, term7415.getClass(), "stack", null);
        setField(term7415, term7415.getClass(), "baseUri", null);
        setField(term7415, term7415.getClass(), "currentToken", null);
        setField(term7415, term7415.getClass(), "settings", null);
        setField(term7421, term7421.getClass(), "tagName", null);
        setField(term7421, term7421.getClass(), "normalName", null);
        setField(term7421, term7421.getClass(), "pendingAttributeName", null);
        setField(term7421, term7421.getClass(), "pendingAttributeValue", null);
        setField(term7421, term7421.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7421, term7421.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7421, term7421.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7421, term7421.getClass(), "selfClosing", false);
        setField(term7421, term7421.getClass(), "attributes", null);
        setField(term7421, term7421.getClass(), "type", null);
        setField(term7415, term7415.getClass(), "start", term7421);
        setField(term7425, term7425.getClass(), "tagName", null);
        setField(term7425, term7425.getClass(), "normalName", null);
        setField(term7425, term7425.getClass(), "pendingAttributeName", null);
        setField(term7425, term7425.getClass(), "pendingAttributeValue", null);
        setField(term7425, term7425.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7425, term7425.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7425, term7425.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7425, term7425.getClass(), "selfClosing", false);
        setField(term7425, term7425.getClass(), "attributes", null);
        setField(term7425, term7425.getClass(), "type", null);
        setField(term7415, term7415.getClass(), "end", term7425);
        setField(term7414, term7414.getClass(), "treeBuilder", term7415);
        setIntField(term7429, term7429.getClass(), "maxSize", 0);
        setField(term7429, term7429.getClass(), "elementData", term7431);
        setIntField(term7429, term7429.getClass(), "size", 0);
        setIntField(term7429, term7429.getClass(), "modCount", 0);
        setField(term7414, term7414.getClass(), "errors", term7429);
        setBooleanField(term7434, term7434.getClass(), "preserveTagCase", false);
        setBooleanField(term7434, term7434.getClass(), "preserveAttributeCase", false);
        setField(term7414, term7414.getClass(), "settings", term7434);
        setField(term7404, term7404.getClass(), "parser", term7414);
        setBooleanField(term7404, term7404.getClass(), "parserDefined", false);
        setField(term7404, term7404.getClass(), "postDataCharset", "UTF-8");
        setField(term7404, term7404.getClass(), "sslSocketFactory", null);
        setField(term7404, term7404.getClass(), "url", null);
        setField(term7404, term7404.getClass(), "method", enum102);
        setField(term7404, term7404.getClass(), "headers", term7453);
        setField(term7404, term7404.getClass(), "cookies", term7469);
        setField(term7403, term7403.getClass(), "req", term7404);
        setIntField(term7475, term7475.getClass(), "statusCode", 0);
        setField(term7475, term7475.getClass(), "statusMessage", null);
        setField(term7475, term7475.getClass(), "byteData", null);
        setField(term7475, term7475.getClass(), "bodyStream", null);
        setField(term7475, term7475.getClass(), "conn", null);
        setField(term7475, term7475.getClass(), "charset", null);
        setField(term7475, term7475.getClass(), "contentType", null);
        setBooleanField(term7475, term7475.getClass(), "executed", false);
        setBooleanField(term7475, term7475.getClass(), "inputStreamRead", false);
        setIntField(term7475, term7475.getClass(), "numRedirects", 0);
        setField(term7475, term7475.getClass(), "req", null);
        setField(term7475, term7475.getClass(), "url", null);
        setField(term7475, term7475.getClass(), "method", null);
        setField(term7475, term7475.getClass(), "headers", term7480);
        setField(term7475, term7475.getClass(), "cookies", term7486);
        setField(term7403, term7403.getClass(), "res", term7475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "get", argTypes, term7403, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


