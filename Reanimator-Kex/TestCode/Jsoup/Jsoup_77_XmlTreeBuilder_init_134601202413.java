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

public class XmlTreeBuilder_init_134601202413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77469;

    public XmlTreeBuilder_init_134601202413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77502 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term77501 = ((Class) term77502).getDeclaredField((String) "StartTag");
        ((Field) term77501).setAccessible(true);
        Object enum100 = ((Field) term77501).get((Object) null);
        Class<? extends Object> term77709 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term77708 = ((Class) term77709).getDeclaredField((String) "EndTag");
        ((Field) term77708).setAccessible(true);
        Object enum101 = ((Field) term77708).get((Object) null);
        term77469 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term77470 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term77471 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term77472 = (byte[]) newByteArray(16);
        Object term77473 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term77474 = (Object[]) newArray("java.lang.String", 0);
        Object[] term77475 = (Object[]) newArray("java.lang.String", 0);
        Object term77479 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term77480 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term77481 = (byte[]) newByteArray(16);
        setField(term77469, term77469.getClass(), "reader", null);
        setField(term77469, term77469.getClass(), "tokeniser", null);
        setField(term77469, term77469.getClass(), "doc", null);
        setField(term77469, term77469.getClass(), "stack", null);
        setField(term77469, term77469.getClass(), "baseUri", null);
        setField(term77469, term77469.getClass(), "currentToken", null);
        setField(term77469, term77469.getClass(), "errors", null);
        setField(term77469, term77469.getClass(), "settings", null);
        setField(term77470, term77470.getClass(), "tagName", null);
        setField(term77470, term77470.getClass(), "normalName", null);
        setField(term77470, term77470.getClass(), "pendingAttributeName", null);
        setField(term77471, term77471.getClass(), "value", term77472);
        setByteField(term77471, term77471.getClass(), "coder", (byte) 0);
        setIntField(term77471, term77471.getClass(), "count", 0);
        setField(term77470, term77470.getClass(), "pendingAttributeValue", term77471);
        setField(term77470, term77470.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term77470, term77470.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term77470, term77470.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term77470, term77470.getClass(), "selfClosing", false);
        setIntField(term77473, term77473.getClass(), "size", 0);
        setField(term77473, term77473.getClass(), "keys", term77474);
        setField(term77473, term77473.getClass(), "vals", term77475);
        setField(term77470, term77470.getClass(), "attributes", term77473);
        setField(term77470, term77470.getClass(), "type", enum100);
        setField(term77469, term77469.getClass(), "start", term77470);
        setField(term77479, term77479.getClass(), "tagName", null);
        setField(term77479, term77479.getClass(), "normalName", null);
        setField(term77479, term77479.getClass(), "pendingAttributeName", null);
        setField(term77480, term77480.getClass(), "value", term77481);
        setByteField(term77480, term77480.getClass(), "coder", (byte) 0);
        setIntField(term77480, term77480.getClass(), "count", 0);
        setField(term77479, term77479.getClass(), "pendingAttributeValue", term77480);
        setField(term77479, term77479.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term77479, term77479.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term77479, term77479.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term77479, term77479.getClass(), "selfClosing", false);
        setField(term77479, term77479.getClass(), "attributes", null);
        setField(term77479, term77479.getClass(), "type", enum101);
        setField(term77469, term77469.getClass(), "end", term77479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term77469));
    }

};


