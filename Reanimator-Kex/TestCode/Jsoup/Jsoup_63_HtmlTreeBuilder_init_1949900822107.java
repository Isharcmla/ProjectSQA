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

public class HtmlTreeBuilder_init_1949900822107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102631;

    public HtmlTreeBuilder_init_1949900822107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102663 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term102662 = ((Class) term102663).getDeclaredField((String) "StartTag");
        ((Field) term102662).setAccessible(true);
        Object enum301 = ((Field) term102662).get((Object) null);
        Class<? extends Object> term102870 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term102869 = ((Class) term102870).getDeclaredField((String) "EndTag");
        ((Field) term102869).setAccessible(true);
        Object enum302 = ((Field) term102869).get((Object) null);
        term102631 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term102632 = (Object[]) newArray("java.lang.String", 1);
        Object term102633 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term102634 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term102635 = (byte[]) newByteArray(16);
        Object term102636 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term102640 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term102641 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term102642 = (byte[]) newByteArray(16);
        setField(term102631, term102631.getClass(), "state", null);
        setField(term102631, term102631.getClass(), "originalState", null);
        setBooleanField(term102631, term102631.getClass(), "baseUriSetFromDoc", false);
        setField(term102631, term102631.getClass(), "headElement", null);
        setField(term102631, term102631.getClass(), "formElement", null);
        setField(term102631, term102631.getClass(), "contextElement", null);
        setField(term102631, term102631.getClass(), "formattingElements", null);
        setField(term102631, term102631.getClass(), "pendingTableCharacters", null);
        setField(term102631, term102631.getClass(), "emptyEnd", null);
        setBooleanField(term102631, term102631.getClass(), "framesetOk", false);
        setBooleanField(term102631, term102631.getClass(), "fosterInserts", false);
        setBooleanField(term102631, term102631.getClass(), "fragmentParsing", false);
        setField(term102631, term102631.getClass(), "specificScopeTarget", term102632);
        setField(term102631, term102631.getClass(), "reader", null);
        setField(term102631, term102631.getClass(), "tokeniser", null);
        setField(term102631, term102631.getClass(), "doc", null);
        setField(term102631, term102631.getClass(), "stack", null);
        setField(term102631, term102631.getClass(), "baseUri", null);
        setField(term102631, term102631.getClass(), "currentToken", null);
        setField(term102631, term102631.getClass(), "errors", null);
        setField(term102631, term102631.getClass(), "settings", null);
        setField(term102633, term102633.getClass(), "tagName", null);
        setField(term102633, term102633.getClass(), "normalName", null);
        setField(term102633, term102633.getClass(), "pendingAttributeName", null);
        setField(term102634, term102634.getClass(), "value", term102635);
        setByteField(term102634, term102634.getClass(), "coder", (byte) 0);
        setIntField(term102634, term102634.getClass(), "count", 0);
        setField(term102633, term102633.getClass(), "pendingAttributeValue", term102634);
        setField(term102633, term102633.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term102633, term102633.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term102633, term102633.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term102633, term102633.getClass(), "selfClosing", false);
        setField(term102636, term102636.getClass(), "attributes", null);
        setField(term102633, term102633.getClass(), "attributes", term102636);
        setField(term102633, term102633.getClass(), "type", enum301);
        setField(term102631, term102631.getClass(), "start", term102633);
        setField(term102640, term102640.getClass(), "tagName", null);
        setField(term102640, term102640.getClass(), "normalName", null);
        setField(term102640, term102640.getClass(), "pendingAttributeName", null);
        setField(term102641, term102641.getClass(), "value", term102642);
        setByteField(term102641, term102641.getClass(), "coder", (byte) 0);
        setIntField(term102641, term102641.getClass(), "count", 0);
        setField(term102640, term102640.getClass(), "pendingAttributeValue", term102641);
        setField(term102640, term102640.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term102640, term102640.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term102640, term102640.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term102640, term102640.getClass(), "selfClosing", false);
        setField(term102640, term102640.getClass(), "attributes", null);
        setField(term102640, term102640.getClass(), "type", enum302);
        setField(term102631, term102631.getClass(), "end", term102640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term102631));
    }

};


