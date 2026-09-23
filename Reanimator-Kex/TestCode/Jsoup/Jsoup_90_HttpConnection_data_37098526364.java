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

public class HttpConnection_data_37098526364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5064;
     Object term5153;

    public HttpConnection_data_37098526364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5069 = new ArrayList();
        Class<? extends Object> term29029 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term29028 = ((Class) term29029).getDeclaredField((String) "GET");
        ((Field) term29028).setAccessible(true);
        Object enum83 = ((Field) term29028).get((Object) null);
        LinkedHashMap term5114 = new LinkedHashMap();
        LinkedHashMap term5130 = new LinkedHashMap();
        LinkedHashMap term5141 = new LinkedHashMap();
        LinkedHashMap term5147 = new LinkedHashMap();
        term5064 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term5065 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term5075 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term5076 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term5081 = (Object[]) newArray("java.lang.String", 1);
        Object term5082 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term5086 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term5090 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term5092 = (Object[]) newArray("java.lang.Object", 0);
        Object term5095 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term5136 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term5065, term5065.getClass(), "proxy", null);
        setIntField(term5065, term5065.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term5065, term5065.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term5065, term5065.getClass(), "followRedirects", true);
        setField(term5065, term5065.getClass(), "data", term5069);
        setField(term5065, term5065.getClass(), "body", null);
        setBooleanField(term5065, term5065.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term5065, term5065.getClass(), "ignoreContentType", false);
        setField(term5076, term5076.getClass(), "state", null);
        setField(term5076, term5076.getClass(), "originalState", null);
        setBooleanField(term5076, term5076.getClass(), "baseUriSetFromDoc", false);
        setField(term5076, term5076.getClass(), "headElement", null);
        setField(term5076, term5076.getClass(), "formElement", null);
        setField(term5076, term5076.getClass(), "contextElement", null);
        setField(term5076, term5076.getClass(), "formattingElements", null);
        setField(term5076, term5076.getClass(), "pendingTableCharacters", null);
        setField(term5076, term5076.getClass(), "emptyEnd", null);
        setBooleanField(term5076, term5076.getClass(), "framesetOk", false);
        setBooleanField(term5076, term5076.getClass(), "fosterInserts", false);
        setBooleanField(term5076, term5076.getClass(), "fragmentParsing", false);
        setField(term5076, term5076.getClass(), "specificScopeTarget", term5081);
        setField(term5076, term5076.getClass(), "parser", null);
        setField(term5076, term5076.getClass(), "reader", null);
        setField(term5076, term5076.getClass(), "tokeniser", null);
        setField(term5076, term5076.getClass(), "doc", null);
        setField(term5076, term5076.getClass(), "stack", null);
        setField(term5076, term5076.getClass(), "baseUri", null);
        setField(term5076, term5076.getClass(), "currentToken", null);
        setField(term5076, term5076.getClass(), "settings", null);
        setField(term5082, term5082.getClass(), "tagName", null);
        setField(term5082, term5082.getClass(), "normalName", null);
        setField(term5082, term5082.getClass(), "pendingAttributeName", null);
        setField(term5082, term5082.getClass(), "pendingAttributeValue", null);
        setField(term5082, term5082.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term5082, term5082.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5082, term5082.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5082, term5082.getClass(), "selfClosing", false);
        setField(term5082, term5082.getClass(), "attributes", null);
        setField(term5082, term5082.getClass(), "type", null);
        setField(term5076, term5076.getClass(), "start", term5082);
        setField(term5086, term5086.getClass(), "tagName", null);
        setField(term5086, term5086.getClass(), "normalName", null);
        setField(term5086, term5086.getClass(), "pendingAttributeName", null);
        setField(term5086, term5086.getClass(), "pendingAttributeValue", null);
        setField(term5086, term5086.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term5086, term5086.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5086, term5086.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5086, term5086.getClass(), "selfClosing", false);
        setField(term5086, term5086.getClass(), "attributes", null);
        setField(term5086, term5086.getClass(), "type", null);
        setField(term5076, term5076.getClass(), "end", term5086);
        setField(term5075, term5075.getClass(), "treeBuilder", term5076);
        setIntField(term5090, term5090.getClass(), "maxSize", 0);
        setField(term5090, term5090.getClass(), "elementData", term5092);
        setIntField(term5090, term5090.getClass(), "size", 0);
        setIntField(term5090, term5090.getClass(), "modCount", 0);
        setField(term5075, term5075.getClass(), "errors", term5090);
        setBooleanField(term5095, term5095.getClass(), "preserveTagCase", false);
        setBooleanField(term5095, term5095.getClass(), "preserveAttributeCase", false);
        setField(term5075, term5075.getClass(), "settings", term5095);
        setField(term5065, term5065.getClass(), "parser", term5075);
        setBooleanField(term5065, term5065.getClass(), "parserDefined", false);
        setField(term5065, term5065.getClass(), "postDataCharset", "UTF-8");
        setField(term5065, term5065.getClass(), "sslSocketFactory", null);
        setField(term5065, term5065.getClass(), "url", null);
        setField(term5065, term5065.getClass(), "method", enum83);
        setField(term5065, term5065.getClass(), "headers", term5114);
        setField(term5065, term5065.getClass(), "cookies", term5130);
        setField(term5064, term5064.getClass(), "req", term5065);
        setIntField(term5136, term5136.getClass(), "statusCode", 0);
        setField(term5136, term5136.getClass(), "statusMessage", null);
        setField(term5136, term5136.getClass(), "byteData", null);
        setField(term5136, term5136.getClass(), "bodyStream", null);
        setField(term5136, term5136.getClass(), "conn", null);
        setField(term5136, term5136.getClass(), "charset", null);
        setField(term5136, term5136.getClass(), "contentType", null);
        setBooleanField(term5136, term5136.getClass(), "executed", false);
        setBooleanField(term5136, term5136.getClass(), "inputStreamRead", false);
        setIntField(term5136, term5136.getClass(), "numRedirects", 0);
        setField(term5136, term5136.getClass(), "req", null);
        setField(term5136, term5136.getClass(), "url", null);
        setField(term5136, term5136.getClass(), "method", null);
        setField(term5136, term5136.getClass(), "headers", term5141);
        setField(term5136, term5136.getClass(), "cookies", term5147);
        setField(term5064, term5064.getClass(), "res", term5136);
        term5153 = (Object[]) newArray("java.lang.String", 9);
        setElement(term5153, 0, "BYqFIqCKAV");
        setElement(term5153, 1, "vrQLuWIDJX");
        setElement(term5153, 2, "flxyYxBRtu");
        setElement(term5153, 3, "OclPbYPkcH");
        setElement(term5153, 4, "IoAlmYsBwc");
        setElement(term5153, 5, "TEParAifyi");
        setElement(term5153, 6, "OWDIEULEFu");
        setElement(term5153, 7, "dWRymuLBtr");
        setElement(term5153, 8, "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5153;
        try {
            callMethod(klass, "data", argTypes, term5064, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


