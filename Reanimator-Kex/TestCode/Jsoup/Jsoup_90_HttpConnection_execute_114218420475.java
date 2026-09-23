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

public class HttpConnection_execute_114218420475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7893;

    public HttpConnection_execute_114218420475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7898 = new ArrayList();
        Class<? extends Object> term35874 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term35873 = ((Class) term35874).getDeclaredField((String) "GET");
        ((Field) term35873).setAccessible(true);
        Object enum104 = ((Field) term35873).get((Object) null);
        LinkedHashMap term7943 = new LinkedHashMap();
        LinkedHashMap term7959 = new LinkedHashMap();
        LinkedHashMap term7970 = new LinkedHashMap();
        LinkedHashMap term7976 = new LinkedHashMap();
        term7893 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term7894 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term7904 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term7905 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term7910 = (Object[]) newArray("java.lang.String", 1);
        Object term7911 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term7915 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7919 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term7921 = (Object[]) newArray("java.lang.Object", 0);
        Object term7924 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term7965 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term7894, term7894.getClass(), "proxy", null);
        setIntField(term7894, term7894.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term7894, term7894.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term7894, term7894.getClass(), "followRedirects", true);
        setField(term7894, term7894.getClass(), "data", term7898);
        setField(term7894, term7894.getClass(), "body", null);
        setBooleanField(term7894, term7894.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term7894, term7894.getClass(), "ignoreContentType", false);
        setField(term7905, term7905.getClass(), "state", null);
        setField(term7905, term7905.getClass(), "originalState", null);
        setBooleanField(term7905, term7905.getClass(), "baseUriSetFromDoc", false);
        setField(term7905, term7905.getClass(), "headElement", null);
        setField(term7905, term7905.getClass(), "formElement", null);
        setField(term7905, term7905.getClass(), "contextElement", null);
        setField(term7905, term7905.getClass(), "formattingElements", null);
        setField(term7905, term7905.getClass(), "pendingTableCharacters", null);
        setField(term7905, term7905.getClass(), "emptyEnd", null);
        setBooleanField(term7905, term7905.getClass(), "framesetOk", false);
        setBooleanField(term7905, term7905.getClass(), "fosterInserts", false);
        setBooleanField(term7905, term7905.getClass(), "fragmentParsing", false);
        setField(term7905, term7905.getClass(), "specificScopeTarget", term7910);
        setField(term7905, term7905.getClass(), "parser", null);
        setField(term7905, term7905.getClass(), "reader", null);
        setField(term7905, term7905.getClass(), "tokeniser", null);
        setField(term7905, term7905.getClass(), "doc", null);
        setField(term7905, term7905.getClass(), "stack", null);
        setField(term7905, term7905.getClass(), "baseUri", null);
        setField(term7905, term7905.getClass(), "currentToken", null);
        setField(term7905, term7905.getClass(), "settings", null);
        setField(term7911, term7911.getClass(), "tagName", null);
        setField(term7911, term7911.getClass(), "normalName", null);
        setField(term7911, term7911.getClass(), "pendingAttributeName", null);
        setField(term7911, term7911.getClass(), "pendingAttributeValue", null);
        setField(term7911, term7911.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7911, term7911.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7911, term7911.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7911, term7911.getClass(), "selfClosing", false);
        setField(term7911, term7911.getClass(), "attributes", null);
        setField(term7911, term7911.getClass(), "type", null);
        setField(term7905, term7905.getClass(), "start", term7911);
        setField(term7915, term7915.getClass(), "tagName", null);
        setField(term7915, term7915.getClass(), "normalName", null);
        setField(term7915, term7915.getClass(), "pendingAttributeName", null);
        setField(term7915, term7915.getClass(), "pendingAttributeValue", null);
        setField(term7915, term7915.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7915, term7915.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7915, term7915.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7915, term7915.getClass(), "selfClosing", false);
        setField(term7915, term7915.getClass(), "attributes", null);
        setField(term7915, term7915.getClass(), "type", null);
        setField(term7905, term7905.getClass(), "end", term7915);
        setField(term7904, term7904.getClass(), "treeBuilder", term7905);
        setIntField(term7919, term7919.getClass(), "maxSize", 0);
        setField(term7919, term7919.getClass(), "elementData", term7921);
        setIntField(term7919, term7919.getClass(), "size", 0);
        setIntField(term7919, term7919.getClass(), "modCount", 0);
        setField(term7904, term7904.getClass(), "errors", term7919);
        setBooleanField(term7924, term7924.getClass(), "preserveTagCase", false);
        setBooleanField(term7924, term7924.getClass(), "preserveAttributeCase", false);
        setField(term7904, term7904.getClass(), "settings", term7924);
        setField(term7894, term7894.getClass(), "parser", term7904);
        setBooleanField(term7894, term7894.getClass(), "parserDefined", false);
        setField(term7894, term7894.getClass(), "postDataCharset", "UTF-8");
        setField(term7894, term7894.getClass(), "sslSocketFactory", null);
        setField(term7894, term7894.getClass(), "url", null);
        setField(term7894, term7894.getClass(), "method", enum104);
        setField(term7894, term7894.getClass(), "headers", term7943);
        setField(term7894, term7894.getClass(), "cookies", term7959);
        setField(term7893, term7893.getClass(), "req", term7894);
        setIntField(term7965, term7965.getClass(), "statusCode", 0);
        setField(term7965, term7965.getClass(), "statusMessage", null);
        setField(term7965, term7965.getClass(), "byteData", null);
        setField(term7965, term7965.getClass(), "bodyStream", null);
        setField(term7965, term7965.getClass(), "conn", null);
        setField(term7965, term7965.getClass(), "charset", null);
        setField(term7965, term7965.getClass(), "contentType", null);
        setBooleanField(term7965, term7965.getClass(), "executed", false);
        setBooleanField(term7965, term7965.getClass(), "inputStreamRead", false);
        setIntField(term7965, term7965.getClass(), "numRedirects", 0);
        setField(term7965, term7965.getClass(), "req", null);
        setField(term7965, term7965.getClass(), "url", null);
        setField(term7965, term7965.getClass(), "method", null);
        setField(term7965, term7965.getClass(), "headers", term7970);
        setField(term7965, term7965.getClass(), "cookies", term7976);
        setField(term7893, term7893.getClass(), "res", term7965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "execute", argTypes, term7893, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


