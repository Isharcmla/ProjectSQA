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

public class HttpConnection_init_161263972143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14753;

    public HttpConnection_init_161263972143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14755 = new ArrayList();
        Class<? extends Object> term14787 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term14786 = ((Class) term14787).getDeclaredField((String) "GET");
        ((Field) term14786).setAccessible(true);
        Object enum35 = ((Field) term14786).get((Object) null);
        LinkedHashMap term14770 = new LinkedHashMap();
        LinkedHashMap term14777 = new LinkedHashMap();
        LinkedHashMap term14779 = new LinkedHashMap();
        LinkedHashMap term14780 = new LinkedHashMap();
        term14753 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term14754 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term14757 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term14758 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term14759 = (Object[]) newArray("java.lang.String", 1);
        Object term14760 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term14761 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term14762 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object[] term14763 = (Object[]) newArray("java.lang.Object", 0);
        Object term14764 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term14778 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setField(term14754, term14754.getClass(), "proxy", null);
        setIntField(term14754, term14754.getClass(), "timeoutMilliseconds", 30000);
        setIntField(term14754, term14754.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term14754, term14754.getClass(), "followRedirects", true);
        setField(term14754, term14754.getClass(), "data", term14755);
        setField(term14754, term14754.getClass(), "body", null);
        setBooleanField(term14754, term14754.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term14754, term14754.getClass(), "ignoreContentType", false);
        setField(term14758, term14758.getClass(), "state", null);
        setField(term14758, term14758.getClass(), "originalState", null);
        setBooleanField(term14758, term14758.getClass(), "baseUriSetFromDoc", false);
        setField(term14758, term14758.getClass(), "headElement", null);
        setField(term14758, term14758.getClass(), "formElement", null);
        setField(term14758, term14758.getClass(), "contextElement", null);
        setField(term14758, term14758.getClass(), "formattingElements", null);
        setField(term14758, term14758.getClass(), "pendingTableCharacters", null);
        setField(term14758, term14758.getClass(), "emptyEnd", null);
        setBooleanField(term14758, term14758.getClass(), "framesetOk", false);
        setBooleanField(term14758, term14758.getClass(), "fosterInserts", false);
        setBooleanField(term14758, term14758.getClass(), "fragmentParsing", false);
        setField(term14758, term14758.getClass(), "specificScopeTarget", term14759);
        setField(term14758, term14758.getClass(), "parser", null);
        setField(term14758, term14758.getClass(), "reader", null);
        setField(term14758, term14758.getClass(), "tokeniser", null);
        setField(term14758, term14758.getClass(), "doc", null);
        setField(term14758, term14758.getClass(), "stack", null);
        setField(term14758, term14758.getClass(), "baseUri", null);
        setField(term14758, term14758.getClass(), "currentToken", null);
        setField(term14758, term14758.getClass(), "settings", null);
        setField(term14760, term14760.getClass(), "tagName", null);
        setField(term14760, term14760.getClass(), "normalName", null);
        setField(term14760, term14760.getClass(), "pendingAttributeName", null);
        setField(term14760, term14760.getClass(), "pendingAttributeValue", null);
        setField(term14760, term14760.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term14760, term14760.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term14760, term14760.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term14760, term14760.getClass(), "selfClosing", false);
        setField(term14760, term14760.getClass(), "attributes", null);
        setField(term14760, term14760.getClass(), "type", null);
        setField(term14758, term14758.getClass(), "start", term14760);
        setField(term14761, term14761.getClass(), "tagName", null);
        setField(term14761, term14761.getClass(), "normalName", null);
        setField(term14761, term14761.getClass(), "pendingAttributeName", null);
        setField(term14761, term14761.getClass(), "pendingAttributeValue", null);
        setField(term14761, term14761.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term14761, term14761.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term14761, term14761.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term14761, term14761.getClass(), "selfClosing", false);
        setField(term14761, term14761.getClass(), "attributes", null);
        setField(term14761, term14761.getClass(), "type", null);
        setField(term14758, term14758.getClass(), "end", term14761);
        setField(term14757, term14757.getClass(), "treeBuilder", term14758);
        setIntField(term14762, term14762.getClass(), "maxSize", 0);
        setField(term14762, term14762.getClass(), "elementData", term14763);
        setIntField(term14762, term14762.getClass(), "size", 0);
        setIntField(term14762, term14762.getClass(), "modCount", 0);
        setField(term14757, term14757.getClass(), "errors", term14762);
        setBooleanField(term14764, term14764.getClass(), "preserveTagCase", false);
        setBooleanField(term14764, term14764.getClass(), "preserveAttributeCase", false);
        setField(term14757, term14757.getClass(), "settings", term14764);
        setField(term14754, term14754.getClass(), "parser", term14757);
        setBooleanField(term14754, term14754.getClass(), "parserDefined", false);
        setField(term14754, term14754.getClass(), "postDataCharset", "UTF-8");
        setField(term14754, term14754.getClass(), "sslSocketFactory", null);
        setField(term14754, term14754.getClass(), "url", null);
        setField(term14754, term14754.getClass(), "method", enum35);
        setField(term14754, term14754.getClass(), "headers", term14770);
        setField(term14754, term14754.getClass(), "cookies", term14777);
        setField(term14753, term14753.getClass(), "req", term14754);
        setIntField(term14778, term14778.getClass(), "statusCode", 0);
        setField(term14778, term14778.getClass(), "statusMessage", null);
        setField(term14778, term14778.getClass(), "byteData", null);
        setField(term14778, term14778.getClass(), "bodyStream", null);
        setField(term14778, term14778.getClass(), "conn", null);
        setField(term14778, term14778.getClass(), "charset", null);
        setField(term14778, term14778.getClass(), "contentType", null);
        setBooleanField(term14778, term14778.getClass(), "executed", false);
        setBooleanField(term14778, term14778.getClass(), "inputStreamRead", false);
        setIntField(term14778, term14778.getClass(), "numRedirects", 0);
        setField(term14778, term14778.getClass(), "req", null);
        setField(term14778, term14778.getClass(), "url", null);
        setField(term14778, term14778.getClass(), "method", null);
        setField(term14778, term14778.getClass(), "headers", term14779);
        setField(term14778, term14778.getClass(), "cookies", term14780);
        setField(term14753, term14753.getClass(), "res", term14778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14753));
    }

};


