package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilder_init_1949900822105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110460;

    public HtmlTreeBuilder_init_1949900822105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110494 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term110493 = ((Class) term110494).getDeclaredField((String) "StartTag");
        ((Field) term110493).setAccessible(true);
        Object enum305 = ((Field) term110493).get((Object) null);
        Class<? extends Object> term110701 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term110700 = ((Class) term110701).getDeclaredField((String) "EndTag");
        ((Field) term110700).setAccessible(true);
        Object enum306 = ((Field) term110700).get((Object) null);
        term110460 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term110461 = (Object[]) newArray("java.lang.String", 1);
        Object term110462 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term110463 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term110464 = (byte[]) newByteArray(16);
        Object term110465 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term110466 = (Object[]) newArray("java.lang.String", 0);
        Object[] term110467 = (Object[]) newArray("java.lang.String", 0);
        Object term110471 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term110472 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term110473 = (byte[]) newByteArray(16);
        setField(term110460, term110460.getClass(), "state", null);
        setField(term110460, term110460.getClass(), "originalState", null);
        setBooleanField(term110460, term110460.getClass(), "baseUriSetFromDoc", false);
        setField(term110460, term110460.getClass(), "headElement", null);
        setField(term110460, term110460.getClass(), "formElement", null);
        setField(term110460, term110460.getClass(), "contextElement", null);
        setField(term110460, term110460.getClass(), "formattingElements", null);
        setField(term110460, term110460.getClass(), "pendingTableCharacters", null);
        setField(term110460, term110460.getClass(), "emptyEnd", null);
        setBooleanField(term110460, term110460.getClass(), "framesetOk", false);
        setBooleanField(term110460, term110460.getClass(), "fosterInserts", false);
        setBooleanField(term110460, term110460.getClass(), "fragmentParsing", false);
        setField(term110460, term110460.getClass(), "specificScopeTarget", term110461);
        setField(term110460, term110460.getClass(), "parser", null);
        setField(term110460, term110460.getClass(), "reader", null);
        setField(term110460, term110460.getClass(), "tokeniser", null);
        setField(term110460, term110460.getClass(), "doc", null);
        setField(term110460, term110460.getClass(), "stack", null);
        setField(term110460, term110460.getClass(), "baseUri", null);
        setField(term110460, term110460.getClass(), "currentToken", null);
        setField(term110460, term110460.getClass(), "settings", null);
        setField(term110462, term110462.getClass(), "tagName", null);
        setField(term110462, term110462.getClass(), "normalName", null);
        setField(term110462, term110462.getClass(), "pendingAttributeName", null);
        setField(term110463, term110463.getClass(), "value", term110464);
        setByteField(term110463, term110463.getClass(), "coder", (byte) 0);
        setIntField(term110463, term110463.getClass(), "count", 0);
        setField(term110462, term110462.getClass(), "pendingAttributeValue", term110463);
        setField(term110462, term110462.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term110462, term110462.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term110462, term110462.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term110462, term110462.getClass(), "selfClosing", false);
        setIntField(term110465, term110465.getClass(), "size", 0);
        setField(term110465, term110465.getClass(), "keys", term110466);
        setField(term110465, term110465.getClass(), "vals", term110467);
        setField(term110462, term110462.getClass(), "attributes", term110465);
        setField(term110462, term110462.getClass(), "type", enum305);
        setField(term110460, term110460.getClass(), "start", term110462);
        setField(term110471, term110471.getClass(), "tagName", null);
        setField(term110471, term110471.getClass(), "normalName", null);
        setField(term110471, term110471.getClass(), "pendingAttributeName", null);
        setField(term110472, term110472.getClass(), "value", term110473);
        setByteField(term110472, term110472.getClass(), "coder", (byte) 0);
        setIntField(term110472, term110472.getClass(), "count", 0);
        setField(term110471, term110471.getClass(), "pendingAttributeValue", term110472);
        setField(term110471, term110471.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term110471, term110471.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term110471, term110471.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term110471, term110471.getClass(), "selfClosing", false);
        setField(term110471, term110471.getClass(), "attributes", null);
        setField(term110471, term110471.getClass(), "type", enum306);
        setField(term110460, term110460.getClass(), "end", term110471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term110460));
    }

};


