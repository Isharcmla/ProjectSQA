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

public class XmlTreeBuilder_init_134601202414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87897;

    public XmlTreeBuilder_init_134601202414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87930 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term87929 = ((Class) term87930).getDeclaredField((String) "StartTag");
        ((Field) term87929).setAccessible(true);
        Object enum130 = ((Field) term87929).get((Object) null);
        Class<? extends Object> term88137 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term88136 = ((Class) term88137).getDeclaredField((String) "EndTag");
        ((Field) term88136).setAccessible(true);
        Object enum131 = ((Field) term88136).get((Object) null);
        term87897 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term87898 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term87899 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term87900 = (byte[]) newByteArray(16);
        Object term87901 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term87902 = (Object[]) newArray("java.lang.String", 0);
        Object[] term87903 = (Object[]) newArray("java.lang.String", 0);
        Object term87907 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term87908 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term87909 = (byte[]) newByteArray(16);
        setField(term87897, term87897.getClass(), "parser", null);
        setField(term87897, term87897.getClass(), "reader", null);
        setField(term87897, term87897.getClass(), "tokeniser", null);
        setField(term87897, term87897.getClass(), "doc", null);
        setField(term87897, term87897.getClass(), "stack", null);
        setField(term87897, term87897.getClass(), "baseUri", null);
        setField(term87897, term87897.getClass(), "currentToken", null);
        setField(term87897, term87897.getClass(), "settings", null);
        setField(term87898, term87898.getClass(), "tagName", null);
        setField(term87898, term87898.getClass(), "normalName", null);
        setField(term87898, term87898.getClass(), "pendingAttributeName", null);
        setField(term87899, term87899.getClass(), "value", term87900);
        setByteField(term87899, term87899.getClass(), "coder", (byte) 0);
        setIntField(term87899, term87899.getClass(), "count", 0);
        setField(term87898, term87898.getClass(), "pendingAttributeValue", term87899);
        setField(term87898, term87898.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term87898, term87898.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term87898, term87898.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term87898, term87898.getClass(), "selfClosing", false);
        setIntField(term87901, term87901.getClass(), "size", 0);
        setField(term87901, term87901.getClass(), "keys", term87902);
        setField(term87901, term87901.getClass(), "vals", term87903);
        setField(term87898, term87898.getClass(), "attributes", term87901);
        setField(term87898, term87898.getClass(), "type", enum130);
        setField(term87897, term87897.getClass(), "start", term87898);
        setField(term87907, term87907.getClass(), "tagName", null);
        setField(term87907, term87907.getClass(), "normalName", null);
        setField(term87907, term87907.getClass(), "pendingAttributeName", null);
        setField(term87908, term87908.getClass(), "value", term87909);
        setByteField(term87908, term87908.getClass(), "coder", (byte) 0);
        setIntField(term87908, term87908.getClass(), "count", 0);
        setField(term87907, term87907.getClass(), "pendingAttributeValue", term87908);
        setField(term87907, term87907.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term87907, term87907.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term87907, term87907.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term87907, term87907.getClass(), "selfClosing", false);
        setField(term87907, term87907.getClass(), "attributes", null);
        setField(term87907, term87907.getClass(), "type", enum131);
        setField(term87897, term87897.getClass(), "end", term87907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87897));
    }

};


