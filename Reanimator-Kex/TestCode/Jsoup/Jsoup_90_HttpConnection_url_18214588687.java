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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;

public class HttpConnection_url_18214588687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;

    public HttpConnection_url_18214588687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term624 = new ArrayList();
        Class<? extends Object> term726 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term725 = ((Class) term726).getDeclaredField((String) "GET");
        ((Field) term725).setAccessible(true);
        Object enum1 = ((Field) term725).get((Object) null);
        LinkedHashMap term669 = new LinkedHashMap();
        LinkedHashMap term685 = new LinkedHashMap();
        LinkedHashMap term696 = new LinkedHashMap();
        LinkedHashMap term702 = new LinkedHashMap();
        term619 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term620 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term630 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term631 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term636 = (Object[]) newArray("java.lang.String", 1);
        Object term637 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term641 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term645 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term647 = (Object[]) newArray("java.lang.Object", 0);
        Object term650 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term691 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term620, term620.getClass(), "proxy", null);
        setIntField(term620, term620.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term620, term620.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term620, term620.getClass(), "followRedirects", true);
        setField(term620, term620.getClass(), "data", term624);
        setField(term620, term620.getClass(), "body", null);
        setBooleanField(term620, term620.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term620, term620.getClass(), "ignoreContentType", false);
        setField(term631, term631.getClass(), "state", null);
        setField(term631, term631.getClass(), "originalState", null);
        setBooleanField(term631, term631.getClass(), "baseUriSetFromDoc", false);
        setField(term631, term631.getClass(), "headElement", null);
        setField(term631, term631.getClass(), "formElement", null);
        setField(term631, term631.getClass(), "contextElement", null);
        setField(term631, term631.getClass(), "formattingElements", null);
        setField(term631, term631.getClass(), "pendingTableCharacters", null);
        setField(term631, term631.getClass(), "emptyEnd", null);
        setBooleanField(term631, term631.getClass(), "framesetOk", false);
        setBooleanField(term631, term631.getClass(), "fosterInserts", false);
        setBooleanField(term631, term631.getClass(), "fragmentParsing", false);
        setField(term631, term631.getClass(), "specificScopeTarget", term636);
        setField(term631, term631.getClass(), "parser", null);
        setField(term631, term631.getClass(), "reader", null);
        setField(term631, term631.getClass(), "tokeniser", null);
        setField(term631, term631.getClass(), "doc", null);
        setField(term631, term631.getClass(), "stack", null);
        setField(term631, term631.getClass(), "baseUri", null);
        setField(term631, term631.getClass(), "currentToken", null);
        setField(term631, term631.getClass(), "settings", null);
        setField(term637, term637.getClass(), "tagName", null);
        setField(term637, term637.getClass(), "normalName", null);
        setField(term637, term637.getClass(), "pendingAttributeName", null);
        setField(term637, term637.getClass(), "pendingAttributeValue", null);
        setField(term637, term637.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term637, term637.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term637, term637.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term637, term637.getClass(), "selfClosing", false);
        setField(term637, term637.getClass(), "attributes", null);
        setField(term637, term637.getClass(), "type", null);
        setField(term631, term631.getClass(), "start", term637);
        setField(term641, term641.getClass(), "tagName", null);
        setField(term641, term641.getClass(), "normalName", null);
        setField(term641, term641.getClass(), "pendingAttributeName", null);
        setField(term641, term641.getClass(), "pendingAttributeValue", null);
        setField(term641, term641.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term641, term641.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term641, term641.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term641, term641.getClass(), "selfClosing", false);
        setField(term641, term641.getClass(), "attributes", null);
        setField(term641, term641.getClass(), "type", null);
        setField(term631, term631.getClass(), "end", term641);
        setField(term630, term630.getClass(), "treeBuilder", term631);
        setIntField(term645, term645.getClass(), "maxSize", 0);
        setField(term645, term645.getClass(), "elementData", term647);
        setIntField(term645, term645.getClass(), "size", 0);
        setIntField(term645, term645.getClass(), "modCount", 0);
        setField(term630, term630.getClass(), "errors", term645);
        setBooleanField(term650, term650.getClass(), "preserveTagCase", false);
        setBooleanField(term650, term650.getClass(), "preserveAttributeCase", false);
        setField(term630, term630.getClass(), "settings", term650);
        setField(term620, term620.getClass(), "parser", term630);
        setBooleanField(term620, term620.getClass(), "parserDefined", false);
        setField(term620, term620.getClass(), "postDataCharset", "UTF-8");
        setField(term620, term620.getClass(), "sslSocketFactory", null);
        setField(term620, term620.getClass(), "url", null);
        setField(term620, term620.getClass(), "method", enum1);
        setField(term620, term620.getClass(), "headers", term669);
        setField(term620, term620.getClass(), "cookies", term685);
        setField(term619, term619.getClass(), "req", term620);
        setIntField(term691, term691.getClass(), "statusCode", 0);
        setField(term691, term691.getClass(), "statusMessage", null);
        setField(term691, term691.getClass(), "byteData", null);
        setField(term691, term691.getClass(), "bodyStream", null);
        setField(term691, term691.getClass(), "conn", null);
        setField(term691, term691.getClass(), "charset", null);
        setField(term691, term691.getClass(), "contentType", null);
        setBooleanField(term691, term691.getClass(), "executed", false);
        setBooleanField(term691, term691.getClass(), "inputStreamRead", false);
        setIntField(term691, term691.getClass(), "numRedirects", 0);
        setField(term691, term691.getClass(), "req", null);
        setField(term691, term691.getClass(), "url", null);
        setField(term691, term691.getClass(), "method", null);
        setField(term691, term691.getClass(), "headers", term696);
        setField(term691, term691.getClass(), "cookies", term702);
        setField(term619, term619.getClass(), "res", term691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "url", argTypes, term619, args);
    }

};


