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

public class HttpConnection_request_108401088962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6601;
     Object term27437;
     Object term27420;

    public HttpConnection_request_108401088962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6606 = new ArrayList();
        ArrayList term6615 = new ArrayList();
        ArrayList term6618 = new ArrayList();
        Class<? extends Object> term27447 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term27446 = ((Class) term27447).getDeclaredField((String) "GET");
        ((Field) term27446).setAccessible(true);
        Object enum89 = ((Field) term27446).get((Object) null);
        LinkedHashMap term6655 = new LinkedHashMap();
        LinkedHashMap term6666 = new LinkedHashMap();
        LinkedHashMap term6676 = new LinkedHashMap();
        LinkedHashMap term6682 = new LinkedHashMap();
        term6601 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term6602 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term6612 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term6613 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term6621 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term6628 = (Object[]) newArray("java.lang.String", 1);
        Object term6629 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term6633 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term6672 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term6602, term6602.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term6602, term6602.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term6602, term6602.getClass(), "followRedirects", true);
        setField(term6602, term6602.getClass(), "data", term6606);
        setBooleanField(term6602, term6602.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term6602, term6602.getClass(), "ignoreContentType", false);
        setField(term6613, term6613.getClass(), "state", null);
        setField(term6613, term6613.getClass(), "originalState", null);
        setBooleanField(term6613, term6613.getClass(), "baseUriSetFromDoc", false);
        setField(term6613, term6613.getClass(), "headElement", null);
        setField(term6613, term6613.getClass(), "formElement", null);
        setField(term6613, term6613.getClass(), "contextElement", null);
        setField(term6613, term6613.getClass(), "formattingElements", term6615);
        setField(term6613, term6613.getClass(), "pendingTableCharacters", term6618);
        setField(term6621, term6621.getClass(), "tagName", null);
        setField(term6621, term6621.getClass(), "pendingAttributeName", null);
        setField(term6621, term6621.getClass(), "pendingAttributeValue", null);
        setBooleanField(term6621, term6621.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6621, term6621.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6621, term6621.getClass(), "selfClosing", false);
        setField(term6621, term6621.getClass(), "attributes", null);
        setField(term6621, term6621.getClass(), "type", null);
        setField(term6613, term6613.getClass(), "emptyEnd", term6621);
        setBooleanField(term6613, term6613.getClass(), "framesetOk", true);
        setBooleanField(term6613, term6613.getClass(), "fosterInserts", false);
        setBooleanField(term6613, term6613.getClass(), "fragmentParsing", false);
        setField(term6613, term6613.getClass(), "specificScopeTarget", term6628);
        setField(term6613, term6613.getClass(), "reader", null);
        setField(term6613, term6613.getClass(), "tokeniser", null);
        setField(term6613, term6613.getClass(), "doc", null);
        setField(term6613, term6613.getClass(), "stack", null);
        setField(term6613, term6613.getClass(), "baseUri", null);
        setField(term6613, term6613.getClass(), "currentToken", null);
        setField(term6613, term6613.getClass(), "errors", null);
        setField(term6629, term6629.getClass(), "tagName", null);
        setField(term6629, term6629.getClass(), "pendingAttributeName", null);
        setField(term6629, term6629.getClass(), "pendingAttributeValue", null);
        setBooleanField(term6629, term6629.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6629, term6629.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6629, term6629.getClass(), "selfClosing", false);
        setField(term6629, term6629.getClass(), "attributes", null);
        setField(term6629, term6629.getClass(), "type", null);
        setField(term6613, term6613.getClass(), "start", term6629);
        setField(term6633, term6633.getClass(), "tagName", null);
        setField(term6633, term6633.getClass(), "pendingAttributeName", null);
        setField(term6633, term6633.getClass(), "pendingAttributeValue", null);
        setBooleanField(term6633, term6633.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6633, term6633.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6633, term6633.getClass(), "selfClosing", false);
        setField(term6633, term6633.getClass(), "attributes", null);
        setField(term6633, term6633.getClass(), "type", null);
        setField(term6613, term6613.getClass(), "end", term6633);
        setField(term6612, term6612.getClass(), "treeBuilder", term6613);
        setIntField(term6612, term6612.getClass(), "maxErrors", 0);
        setField(term6612, term6612.getClass(), "errors", null);
        setField(term6602, term6602.getClass(), "parser", term6612);
        setBooleanField(term6602, term6602.getClass(), "parserDefined", false);
        setBooleanField(term6602, term6602.getClass(), "validateTSLCertificates", true);
        setField(term6602, term6602.getClass(), "postDataCharset", "UTF-8");
        setField(term6602, term6602.getClass(), "url", null);
        setField(term6602, term6602.getClass(), "method", enum89);
        setField(term6602, term6602.getClass(), "headers", term6655);
        setField(term6602, term6602.getClass(), "cookies", term6666);
        setField(term6601, term6601.getClass(), "req", term6602);
        setIntField(term6672, term6672.getClass(), "statusCode", 0);
        setField(term6672, term6672.getClass(), "statusMessage", null);
        setField(term6672, term6672.getClass(), "byteData", null);
        setField(term6672, term6672.getClass(), "charset", null);
        setField(term6672, term6672.getClass(), "contentType", null);
        setBooleanField(term6672, term6672.getClass(), "executed", false);
        setIntField(term6672, term6672.getClass(), "numRedirects", 0);
        setField(term6672, term6672.getClass(), "req", null);
        setField(term6672, term6672.getClass(), "url", null);
        setField(term6672, term6672.getClass(), "method", null);
        setField(term6672, term6672.getClass(), "headers", term6676);
        setField(term6672, term6672.getClass(), "cookies", term6682);
        setField(term6601, term6601.getClass(), "res", term6672);
        LinkedHashMap term27439 = new LinkedHashMap();
        LinkedHashMap term27440 = new LinkedHashMap();
        term27437 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term27438 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term27437, term27437.getClass(), "req", null);
        setIntField(term27438, term27438.getClass(), "statusCode", 0);
        setField(term27438, term27438.getClass(), "statusMessage", null);
        setField(term27438, term27438.getClass(), "byteData", null);
        setField(term27438, term27438.getClass(), "charset", null);
        setField(term27438, term27438.getClass(), "contentType", null);
        setBooleanField(term27438, term27438.getClass(), "executed", false);
        setIntField(term27438, term27438.getClass(), "numRedirects", 0);
        setField(term27438, term27438.getClass(), "req", null);
        setField(term27438, term27438.getClass(), "url", null);
        setField(term27438, term27438.getClass(), "method", null);
        setField(term27438, term27438.getClass(), "headers", term27439);
        setField(term27438, term27438.getClass(), "cookies", term27440);
        setField(term27437, term27437.getClass(), "res", term27438);
        LinkedHashMap term27425 = new LinkedHashMap();
        LinkedHashMap term27431 = new LinkedHashMap();
        term27420 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term27421 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term27420, term27420.getClass(), "req", null);
        setIntField(term27421, term27421.getClass(), "statusCode", 0);
        setField(term27421, term27421.getClass(), "statusMessage", null);
        setField(term27421, term27421.getClass(), "byteData", null);
        setField(term27421, term27421.getClass(), "charset", null);
        setField(term27421, term27421.getClass(), "contentType", null);
        setBooleanField(term27421, term27421.getClass(), "executed", false);
        setIntField(term27421, term27421.getClass(), "numRedirects", 0);
        setField(term27421, term27421.getClass(), "req", null);
        setField(term27421, term27421.getClass(), "url", null);
        setField(term27421, term27421.getClass(), "method", null);
        setField(term27421, term27421.getClass(), "headers", term27425);
        setField(term27421, term27421.getClass(), "cookies", term27431);
        setField(term27420, term27420.getClass(), "res", term27421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.Connection$Request");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "request", argTypes, term6601, args);
        assertTrue(recursiveEquals(term6601, term27437));
        assertTrue(recursiveEquals(retValue, term27420));
    }

};


