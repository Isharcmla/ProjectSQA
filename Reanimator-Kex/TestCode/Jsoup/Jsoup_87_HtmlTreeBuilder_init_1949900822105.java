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
     Object term106577;

    public HtmlTreeBuilder_init_1949900822105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106611 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term106610 = ((Class) term106611).getDeclaredField((String) "StartTag");
        ((Field) term106610).setAccessible(true);
        Object enum305 = ((Field) term106610).get((Object) null);
        Class<? extends Object> term106818 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term106817 = ((Class) term106818).getDeclaredField((String) "EndTag");
        ((Field) term106817).setAccessible(true);
        Object enum306 = ((Field) term106817).get((Object) null);
        term106577 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term106578 = (Object[]) newArray("java.lang.String", 1);
        Object term106579 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term106580 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term106581 = (byte[]) newByteArray(16);
        Object term106582 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term106583 = (Object[]) newArray("java.lang.String", 0);
        Object[] term106584 = (Object[]) newArray("java.lang.String", 0);
        Object term106588 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term106589 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term106590 = (byte[]) newByteArray(16);
        setField(term106577, term106577.getClass(), "state", null);
        setField(term106577, term106577.getClass(), "originalState", null);
        setBooleanField(term106577, term106577.getClass(), "baseUriSetFromDoc", false);
        setField(term106577, term106577.getClass(), "headElement", null);
        setField(term106577, term106577.getClass(), "formElement", null);
        setField(term106577, term106577.getClass(), "contextElement", null);
        setField(term106577, term106577.getClass(), "formattingElements", null);
        setField(term106577, term106577.getClass(), "pendingTableCharacters", null);
        setField(term106577, term106577.getClass(), "emptyEnd", null);
        setBooleanField(term106577, term106577.getClass(), "framesetOk", false);
        setBooleanField(term106577, term106577.getClass(), "fosterInserts", false);
        setBooleanField(term106577, term106577.getClass(), "fragmentParsing", false);
        setField(term106577, term106577.getClass(), "specificScopeTarget", term106578);
        setField(term106577, term106577.getClass(), "parser", null);
        setField(term106577, term106577.getClass(), "reader", null);
        setField(term106577, term106577.getClass(), "tokeniser", null);
        setField(term106577, term106577.getClass(), "doc", null);
        setField(term106577, term106577.getClass(), "stack", null);
        setField(term106577, term106577.getClass(), "baseUri", null);
        setField(term106577, term106577.getClass(), "currentToken", null);
        setField(term106577, term106577.getClass(), "settings", null);
        setField(term106579, term106579.getClass(), "tagName", null);
        setField(term106579, term106579.getClass(), "normalName", null);
        setField(term106579, term106579.getClass(), "pendingAttributeName", null);
        setField(term106580, term106580.getClass(), "value", term106581);
        setByteField(term106580, term106580.getClass(), "coder", (byte) 0);
        setIntField(term106580, term106580.getClass(), "count", 0);
        setField(term106579, term106579.getClass(), "pendingAttributeValue", term106580);
        setField(term106579, term106579.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term106579, term106579.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term106579, term106579.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term106579, term106579.getClass(), "selfClosing", false);
        setIntField(term106582, term106582.getClass(), "size", 0);
        setField(term106582, term106582.getClass(), "keys", term106583);
        setField(term106582, term106582.getClass(), "vals", term106584);
        setField(term106579, term106579.getClass(), "attributes", term106582);
        setField(term106579, term106579.getClass(), "type", enum305);
        setField(term106577, term106577.getClass(), "start", term106579);
        setField(term106588, term106588.getClass(), "tagName", null);
        setField(term106588, term106588.getClass(), "normalName", null);
        setField(term106588, term106588.getClass(), "pendingAttributeName", null);
        setField(term106589, term106589.getClass(), "value", term106590);
        setByteField(term106589, term106589.getClass(), "coder", (byte) 0);
        setIntField(term106589, term106589.getClass(), "count", 0);
        setField(term106588, term106588.getClass(), "pendingAttributeValue", term106589);
        setField(term106588, term106588.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term106588, term106588.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term106588, term106588.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term106588, term106588.getClass(), "selfClosing", false);
        setField(term106588, term106588.getClass(), "attributes", null);
        setField(term106588, term106588.getClass(), "type", enum306);
        setField(term106577, term106577.getClass(), "end", term106588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106577));
    }

};


