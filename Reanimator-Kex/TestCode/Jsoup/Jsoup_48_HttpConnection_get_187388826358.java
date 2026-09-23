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

public class HttpConnection_get_187388826358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5629;

    public HttpConnection_get_187388826358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5634 = new ArrayList();
        ArrayList term5643 = new ArrayList();
        ArrayList term5646 = new ArrayList();
        Class<? extends Object> term25594 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term25593 = ((Class) term25594).getDeclaredField((String) "GET");
        ((Field) term25593).setAccessible(true);
        Object enum83 = ((Field) term25593).get((Object) null);
        LinkedHashMap term5683 = new LinkedHashMap();
        LinkedHashMap term5694 = new LinkedHashMap();
        LinkedHashMap term5704 = new LinkedHashMap();
        LinkedHashMap term5710 = new LinkedHashMap();
        term5629 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term5630 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term5640 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term5641 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term5649 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term5656 = (Object[]) newArray("java.lang.String", 1);
        Object term5657 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term5661 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term5700 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term5630, term5630.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term5630, term5630.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term5630, term5630.getClass(), "followRedirects", true);
        setField(term5630, term5630.getClass(), "data", term5634);
        setBooleanField(term5630, term5630.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term5630, term5630.getClass(), "ignoreContentType", false);
        setField(term5641, term5641.getClass(), "state", null);
        setField(term5641, term5641.getClass(), "originalState", null);
        setBooleanField(term5641, term5641.getClass(), "baseUriSetFromDoc", false);
        setField(term5641, term5641.getClass(), "headElement", null);
        setField(term5641, term5641.getClass(), "formElement", null);
        setField(term5641, term5641.getClass(), "contextElement", null);
        setField(term5641, term5641.getClass(), "formattingElements", term5643);
        setField(term5641, term5641.getClass(), "pendingTableCharacters", term5646);
        setField(term5649, term5649.getClass(), "tagName", null);
        setField(term5649, term5649.getClass(), "pendingAttributeName", null);
        setField(term5649, term5649.getClass(), "pendingAttributeValue", null);
        setBooleanField(term5649, term5649.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5649, term5649.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5649, term5649.getClass(), "selfClosing", false);
        setField(term5649, term5649.getClass(), "attributes", null);
        setField(term5649, term5649.getClass(), "type", null);
        setField(term5641, term5641.getClass(), "emptyEnd", term5649);
        setBooleanField(term5641, term5641.getClass(), "framesetOk", true);
        setBooleanField(term5641, term5641.getClass(), "fosterInserts", false);
        setBooleanField(term5641, term5641.getClass(), "fragmentParsing", false);
        setField(term5641, term5641.getClass(), "specificScopeTarget", term5656);
        setField(term5641, term5641.getClass(), "reader", null);
        setField(term5641, term5641.getClass(), "tokeniser", null);
        setField(term5641, term5641.getClass(), "doc", null);
        setField(term5641, term5641.getClass(), "stack", null);
        setField(term5641, term5641.getClass(), "baseUri", null);
        setField(term5641, term5641.getClass(), "currentToken", null);
        setField(term5641, term5641.getClass(), "errors", null);
        setField(term5657, term5657.getClass(), "tagName", null);
        setField(term5657, term5657.getClass(), "pendingAttributeName", null);
        setField(term5657, term5657.getClass(), "pendingAttributeValue", null);
        setBooleanField(term5657, term5657.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5657, term5657.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5657, term5657.getClass(), "selfClosing", false);
        setField(term5657, term5657.getClass(), "attributes", null);
        setField(term5657, term5657.getClass(), "type", null);
        setField(term5641, term5641.getClass(), "start", term5657);
        setField(term5661, term5661.getClass(), "tagName", null);
        setField(term5661, term5661.getClass(), "pendingAttributeName", null);
        setField(term5661, term5661.getClass(), "pendingAttributeValue", null);
        setBooleanField(term5661, term5661.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term5661, term5661.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5661, term5661.getClass(), "selfClosing", false);
        setField(term5661, term5661.getClass(), "attributes", null);
        setField(term5661, term5661.getClass(), "type", null);
        setField(term5641, term5641.getClass(), "end", term5661);
        setField(term5640, term5640.getClass(), "treeBuilder", term5641);
        setIntField(term5640, term5640.getClass(), "maxErrors", 0);
        setField(term5640, term5640.getClass(), "errors", null);
        setField(term5630, term5630.getClass(), "parser", term5640);
        setBooleanField(term5630, term5630.getClass(), "parserDefined", false);
        setBooleanField(term5630, term5630.getClass(), "validateTSLCertificates", true);
        setField(term5630, term5630.getClass(), "postDataCharset", "UTF-8");
        setField(term5630, term5630.getClass(), "url", null);
        setField(term5630, term5630.getClass(), "method", enum83);
        setField(term5630, term5630.getClass(), "headers", term5683);
        setField(term5630, term5630.getClass(), "cookies", term5694);
        setField(term5629, term5629.getClass(), "req", term5630);
        setIntField(term5700, term5700.getClass(), "statusCode", 0);
        setField(term5700, term5700.getClass(), "statusMessage", null);
        setField(term5700, term5700.getClass(), "byteData", null);
        setField(term5700, term5700.getClass(), "charset", null);
        setField(term5700, term5700.getClass(), "contentType", null);
        setBooleanField(term5700, term5700.getClass(), "executed", false);
        setIntField(term5700, term5700.getClass(), "numRedirects", 0);
        setField(term5700, term5700.getClass(), "req", null);
        setField(term5700, term5700.getClass(), "url", null);
        setField(term5700, term5700.getClass(), "method", null);
        setField(term5700, term5700.getClass(), "headers", term5704);
        setField(term5700, term5700.getClass(), "cookies", term5710);
        setField(term5629, term5629.getClass(), "res", term5700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "get", argTypes, term5629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


