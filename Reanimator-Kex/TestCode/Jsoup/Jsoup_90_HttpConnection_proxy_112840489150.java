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
import java.lang.Integer;

public class HttpConnection_proxy_112840489150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;
     Object term1249;

    public HttpConnection_proxy_112840489150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1153 = new ArrayList();
        Class<? extends Object> term18076 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term18075 = ((Class) term18076).getDeclaredField((String) "GET");
        ((Field) term18075).setAccessible(true);
        Object enum42 = ((Field) term18075).get((Object) null);
        LinkedHashMap term1198 = new LinkedHashMap();
        LinkedHashMap term1214 = new LinkedHashMap();
        LinkedHashMap term1225 = new LinkedHashMap();
        LinkedHashMap term1231 = new LinkedHashMap();
        term1148 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term1149 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term1159 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1160 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term1165 = (Object[]) newArray("java.lang.String", 1);
        Object term1166 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term1170 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term1174 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term1176 = (Object[]) newArray("java.lang.Object", 0);
        Object term1179 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term1220 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term1149, term1149.getClass(), "proxy", null);
        setIntField(term1149, term1149.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term1149, term1149.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term1149, term1149.getClass(), "followRedirects", true);
        setField(term1149, term1149.getClass(), "data", term1153);
        setField(term1149, term1149.getClass(), "body", null);
        setBooleanField(term1149, term1149.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term1149, term1149.getClass(), "ignoreContentType", false);
        setField(term1160, term1160.getClass(), "state", null);
        setField(term1160, term1160.getClass(), "originalState", null);
        setBooleanField(term1160, term1160.getClass(), "baseUriSetFromDoc", false);
        setField(term1160, term1160.getClass(), "headElement", null);
        setField(term1160, term1160.getClass(), "formElement", null);
        setField(term1160, term1160.getClass(), "contextElement", null);
        setField(term1160, term1160.getClass(), "formattingElements", null);
        setField(term1160, term1160.getClass(), "pendingTableCharacters", null);
        setField(term1160, term1160.getClass(), "emptyEnd", null);
        setBooleanField(term1160, term1160.getClass(), "framesetOk", false);
        setBooleanField(term1160, term1160.getClass(), "fosterInserts", false);
        setBooleanField(term1160, term1160.getClass(), "fragmentParsing", false);
        setField(term1160, term1160.getClass(), "specificScopeTarget", term1165);
        setField(term1160, term1160.getClass(), "parser", null);
        setField(term1160, term1160.getClass(), "reader", null);
        setField(term1160, term1160.getClass(), "tokeniser", null);
        setField(term1160, term1160.getClass(), "doc", null);
        setField(term1160, term1160.getClass(), "stack", null);
        setField(term1160, term1160.getClass(), "baseUri", null);
        setField(term1160, term1160.getClass(), "currentToken", null);
        setField(term1160, term1160.getClass(), "settings", null);
        setField(term1166, term1166.getClass(), "tagName", null);
        setField(term1166, term1166.getClass(), "normalName", null);
        setField(term1166, term1166.getClass(), "pendingAttributeName", null);
        setField(term1166, term1166.getClass(), "pendingAttributeValue", null);
        setField(term1166, term1166.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term1166, term1166.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term1166, term1166.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term1166, term1166.getClass(), "selfClosing", false);
        setField(term1166, term1166.getClass(), "attributes", null);
        setField(term1166, term1166.getClass(), "type", null);
        setField(term1160, term1160.getClass(), "start", term1166);
        setField(term1170, term1170.getClass(), "tagName", null);
        setField(term1170, term1170.getClass(), "normalName", null);
        setField(term1170, term1170.getClass(), "pendingAttributeName", null);
        setField(term1170, term1170.getClass(), "pendingAttributeValue", null);
        setField(term1170, term1170.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term1170, term1170.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term1170, term1170.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term1170, term1170.getClass(), "selfClosing", false);
        setField(term1170, term1170.getClass(), "attributes", null);
        setField(term1170, term1170.getClass(), "type", null);
        setField(term1160, term1160.getClass(), "end", term1170);
        setField(term1159, term1159.getClass(), "treeBuilder", term1160);
        setIntField(term1174, term1174.getClass(), "maxSize", 0);
        setField(term1174, term1174.getClass(), "elementData", term1176);
        setIntField(term1174, term1174.getClass(), "size", 0);
        setIntField(term1174, term1174.getClass(), "modCount", 0);
        setField(term1159, term1159.getClass(), "errors", term1174);
        setBooleanField(term1179, term1179.getClass(), "preserveTagCase", false);
        setBooleanField(term1179, term1179.getClass(), "preserveAttributeCase", false);
        setField(term1159, term1159.getClass(), "settings", term1179);
        setField(term1149, term1149.getClass(), "parser", term1159);
        setBooleanField(term1149, term1149.getClass(), "parserDefined", false);
        setField(term1149, term1149.getClass(), "postDataCharset", "UTF-8");
        setField(term1149, term1149.getClass(), "sslSocketFactory", null);
        setField(term1149, term1149.getClass(), "url", null);
        setField(term1149, term1149.getClass(), "method", enum42);
        setField(term1149, term1149.getClass(), "headers", term1198);
        setField(term1149, term1149.getClass(), "cookies", term1214);
        setField(term1148, term1148.getClass(), "req", term1149);
        setIntField(term1220, term1220.getClass(), "statusCode", 0);
        setField(term1220, term1220.getClass(), "statusMessage", null);
        setField(term1220, term1220.getClass(), "byteData", null);
        setField(term1220, term1220.getClass(), "bodyStream", null);
        setField(term1220, term1220.getClass(), "conn", null);
        setField(term1220, term1220.getClass(), "charset", null);
        setField(term1220, term1220.getClass(), "contentType", null);
        setBooleanField(term1220, term1220.getClass(), "executed", false);
        setBooleanField(term1220, term1220.getClass(), "inputStreamRead", false);
        setIntField(term1220, term1220.getClass(), "numRedirects", 0);
        setField(term1220, term1220.getClass(), "req", null);
        setField(term1220, term1220.getClass(), "url", null);
        setField(term1220, term1220.getClass(), "method", null);
        setField(term1220, term1220.getClass(), "headers", term1225);
        setField(term1220, term1220.getClass(), "cookies", term1231);
        setField(term1148, term1148.getClass(), "res", term1220);
        term1249 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term1249;
        try {
            callMethod(klass, "proxy", argTypes, term1148, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


