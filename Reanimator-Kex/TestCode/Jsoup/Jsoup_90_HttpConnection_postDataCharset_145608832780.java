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
import java.nio.charset.IllegalCharsetNameException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;

public class HttpConnection_postDataCharset_145608832780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9118;

    public HttpConnection_postDataCharset_145608832780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9123 = new ArrayList();
        Class<? extends Object> term38049 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term38048 = ((Class) term38049).getDeclaredField((String) "GET");
        ((Field) term38048).setAccessible(true);
        Object enum114 = ((Field) term38048).get((Object) null);
        LinkedHashMap term9168 = new LinkedHashMap();
        LinkedHashMap term9184 = new LinkedHashMap();
        LinkedHashMap term9195 = new LinkedHashMap();
        LinkedHashMap term9201 = new LinkedHashMap();
        term9118 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term9119 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term9129 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term9130 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term9135 = (Object[]) newArray("java.lang.String", 1);
        Object term9136 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term9140 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term9144 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term9146 = (Object[]) newArray("java.lang.Object", 0);
        Object term9149 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term9190 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term9119, term9119.getClass(), "proxy", null);
        setIntField(term9119, term9119.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term9119, term9119.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term9119, term9119.getClass(), "followRedirects", true);
        setField(term9119, term9119.getClass(), "data", term9123);
        setField(term9119, term9119.getClass(), "body", null);
        setBooleanField(term9119, term9119.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term9119, term9119.getClass(), "ignoreContentType", false);
        setField(term9130, term9130.getClass(), "state", null);
        setField(term9130, term9130.getClass(), "originalState", null);
        setBooleanField(term9130, term9130.getClass(), "baseUriSetFromDoc", false);
        setField(term9130, term9130.getClass(), "headElement", null);
        setField(term9130, term9130.getClass(), "formElement", null);
        setField(term9130, term9130.getClass(), "contextElement", null);
        setField(term9130, term9130.getClass(), "formattingElements", null);
        setField(term9130, term9130.getClass(), "pendingTableCharacters", null);
        setField(term9130, term9130.getClass(), "emptyEnd", null);
        setBooleanField(term9130, term9130.getClass(), "framesetOk", false);
        setBooleanField(term9130, term9130.getClass(), "fosterInserts", false);
        setBooleanField(term9130, term9130.getClass(), "fragmentParsing", false);
        setField(term9130, term9130.getClass(), "specificScopeTarget", term9135);
        setField(term9130, term9130.getClass(), "parser", null);
        setField(term9130, term9130.getClass(), "reader", null);
        setField(term9130, term9130.getClass(), "tokeniser", null);
        setField(term9130, term9130.getClass(), "doc", null);
        setField(term9130, term9130.getClass(), "stack", null);
        setField(term9130, term9130.getClass(), "baseUri", null);
        setField(term9130, term9130.getClass(), "currentToken", null);
        setField(term9130, term9130.getClass(), "settings", null);
        setField(term9136, term9136.getClass(), "tagName", null);
        setField(term9136, term9136.getClass(), "normalName", null);
        setField(term9136, term9136.getClass(), "pendingAttributeName", null);
        setField(term9136, term9136.getClass(), "pendingAttributeValue", null);
        setField(term9136, term9136.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term9136, term9136.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9136, term9136.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term9136, term9136.getClass(), "selfClosing", false);
        setField(term9136, term9136.getClass(), "attributes", null);
        setField(term9136, term9136.getClass(), "type", null);
        setField(term9130, term9130.getClass(), "start", term9136);
        setField(term9140, term9140.getClass(), "tagName", null);
        setField(term9140, term9140.getClass(), "normalName", null);
        setField(term9140, term9140.getClass(), "pendingAttributeName", null);
        setField(term9140, term9140.getClass(), "pendingAttributeValue", null);
        setField(term9140, term9140.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term9140, term9140.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9140, term9140.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term9140, term9140.getClass(), "selfClosing", false);
        setField(term9140, term9140.getClass(), "attributes", null);
        setField(term9140, term9140.getClass(), "type", null);
        setField(term9130, term9130.getClass(), "end", term9140);
        setField(term9129, term9129.getClass(), "treeBuilder", term9130);
        setIntField(term9144, term9144.getClass(), "maxSize", 0);
        setField(term9144, term9144.getClass(), "elementData", term9146);
        setIntField(term9144, term9144.getClass(), "size", 0);
        setIntField(term9144, term9144.getClass(), "modCount", 0);
        setField(term9129, term9129.getClass(), "errors", term9144);
        setBooleanField(term9149, term9149.getClass(), "preserveTagCase", false);
        setBooleanField(term9149, term9149.getClass(), "preserveAttributeCase", false);
        setField(term9129, term9129.getClass(), "settings", term9149);
        setField(term9119, term9119.getClass(), "parser", term9129);
        setBooleanField(term9119, term9119.getClass(), "parserDefined", false);
        setField(term9119, term9119.getClass(), "postDataCharset", "UTF-8");
        setField(term9119, term9119.getClass(), "sslSocketFactory", null);
        setField(term9119, term9119.getClass(), "url", null);
        setField(term9119, term9119.getClass(), "method", enum114);
        setField(term9119, term9119.getClass(), "headers", term9168);
        setField(term9119, term9119.getClass(), "cookies", term9184);
        setField(term9118, term9118.getClass(), "req", term9119);
        setIntField(term9190, term9190.getClass(), "statusCode", 0);
        setField(term9190, term9190.getClass(), "statusMessage", null);
        setField(term9190, term9190.getClass(), "byteData", null);
        setField(term9190, term9190.getClass(), "bodyStream", null);
        setField(term9190, term9190.getClass(), "conn", null);
        setField(term9190, term9190.getClass(), "charset", null);
        setField(term9190, term9190.getClass(), "contentType", null);
        setBooleanField(term9190, term9190.getClass(), "executed", false);
        setBooleanField(term9190, term9190.getClass(), "inputStreamRead", false);
        setIntField(term9190, term9190.getClass(), "numRedirects", 0);
        setField(term9190, term9190.getClass(), "req", null);
        setField(term9190, term9190.getClass(), "url", null);
        setField(term9190, term9190.getClass(), "method", null);
        setField(term9190, term9190.getClass(), "headers", term9195);
        setField(term9190, term9190.getClass(), "cookies", term9201);
        setField(term9118, term9118.getClass(), "res", term9190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        try {
            callMethod(klass, "postDataCharset", argTypes, term9118, args);
            assertTrue(false);
        }
        catch (IllegalCharsetNameException e) {
        }

    }

};


