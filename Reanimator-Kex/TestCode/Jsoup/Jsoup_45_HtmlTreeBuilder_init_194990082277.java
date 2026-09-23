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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilder_init_194990082277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245538;

    public HtmlTreeBuilder_init_194990082277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term245539 = new ArrayList();
        ArrayList term245541 = new ArrayList();
        Class<? extends Object> term245577 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term245576 = ((Class) term245577).getDeclaredField((String) "EndTag");
        ((Field) term245576).setAccessible(true);
        Object enum739 = ((Field) term245576).get((Object) null);
        Class<? extends Object> term245778 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term245777 = ((Class) term245778).getDeclaredField((String) "StartTag");
        ((Field) term245777).setAccessible(true);
        Object enum740 = ((Field) term245777).get((Object) null);
        term245538 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term245543 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term245544 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245545 = (byte[]) newByteArray(16);
        Object[] term245549 = (Object[]) newArray("java.lang.String", 1);
        Object term245550 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term245551 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245552 = (byte[]) newByteArray(16);
        Object term245553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term245557 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term245558 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245559 = (byte[]) newByteArray(16);
        setField(term245538, term245538.getClass(), "state", null);
        setField(term245538, term245538.getClass(), "originalState", null);
        setBooleanField(term245538, term245538.getClass(), "baseUriSetFromDoc", false);
        setField(term245538, term245538.getClass(), "headElement", null);
        setField(term245538, term245538.getClass(), "formElement", null);
        setField(term245538, term245538.getClass(), "contextElement", null);
        setField(term245538, term245538.getClass(), "formattingElements", term245539);
        setField(term245538, term245538.getClass(), "pendingTableCharacters", term245541);
        setField(term245543, term245543.getClass(), "tagName", null);
        setField(term245543, term245543.getClass(), "pendingAttributeName", null);
        setField(term245544, term245544.getClass(), "value", term245545);
        setByteField(term245544, term245544.getClass(), "coder", (byte) 0);
        setIntField(term245544, term245544.getClass(), "count", 0);
        setField(term245543, term245543.getClass(), "pendingAttributeValue", term245544);
        setBooleanField(term245543, term245543.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term245543, term245543.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term245543, term245543.getClass(), "selfClosing", false);
        setField(term245543, term245543.getClass(), "attributes", null);
        setField(term245543, term245543.getClass(), "type", enum739);
        setField(term245538, term245538.getClass(), "emptyEnd", term245543);
        setBooleanField(term245538, term245538.getClass(), "framesetOk", true);
        setBooleanField(term245538, term245538.getClass(), "fosterInserts", false);
        setBooleanField(term245538, term245538.getClass(), "fragmentParsing", false);
        setField(term245538, term245538.getClass(), "specificScopeTarget", term245549);
        setField(term245538, term245538.getClass(), "reader", null);
        setField(term245538, term245538.getClass(), "tokeniser", null);
        setField(term245538, term245538.getClass(), "doc", null);
        setField(term245538, term245538.getClass(), "stack", null);
        setField(term245538, term245538.getClass(), "baseUri", null);
        setField(term245538, term245538.getClass(), "currentToken", null);
        setField(term245538, term245538.getClass(), "errors", null);
        setField(term245550, term245550.getClass(), "tagName", null);
        setField(term245550, term245550.getClass(), "pendingAttributeName", null);
        setField(term245551, term245551.getClass(), "value", term245552);
        setByteField(term245551, term245551.getClass(), "coder", (byte) 0);
        setIntField(term245551, term245551.getClass(), "count", 0);
        setField(term245550, term245550.getClass(), "pendingAttributeValue", term245551);
        setBooleanField(term245550, term245550.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term245550, term245550.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term245550, term245550.getClass(), "selfClosing", false);
        setField(term245553, term245553.getClass(), "attributes", null);
        setField(term245550, term245550.getClass(), "attributes", term245553);
        setField(term245550, term245550.getClass(), "type", enum740);
        setField(term245538, term245538.getClass(), "start", term245550);
        setField(term245557, term245557.getClass(), "tagName", null);
        setField(term245557, term245557.getClass(), "pendingAttributeName", null);
        setField(term245558, term245558.getClass(), "value", term245559);
        setByteField(term245558, term245558.getClass(), "coder", (byte) 0);
        setIntField(term245558, term245558.getClass(), "count", 0);
        setField(term245557, term245557.getClass(), "pendingAttributeValue", term245558);
        setBooleanField(term245557, term245557.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term245557, term245557.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term245557, term245557.getClass(), "selfClosing", false);
        setField(term245557, term245557.getClass(), "attributes", null);
        setField(term245557, term245557.getClass(), "type", enum739);
        setField(term245538, term245538.getClass(), "end", term245557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term245538));
    }

};


