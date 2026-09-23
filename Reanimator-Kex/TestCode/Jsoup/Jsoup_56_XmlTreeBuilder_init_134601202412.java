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

public class XmlTreeBuilder_init_134601202412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26219;

    public XmlTreeBuilder_init_134601202412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26250 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term26249 = ((Class) term26250).getDeclaredField((String) "StartTag");
        ((Field) term26249).setAccessible(true);
        Object enum72 = ((Field) term26249).get((Object) null);
        Class<? extends Object> term26457 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term26456 = ((Class) term26457).getDeclaredField((String) "EndTag");
        ((Field) term26456).setAccessible(true);
        Object enum73 = ((Field) term26456).get((Object) null);
        term26219 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term26220 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term26221 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26222 = (byte[]) newByteArray(16);
        Object term26223 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term26227 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term26228 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26229 = (byte[]) newByteArray(16);
        setField(term26219, term26219.getClass(), "reader", null);
        setField(term26219, term26219.getClass(), "tokeniser", null);
        setField(term26219, term26219.getClass(), "doc", null);
        setField(term26219, term26219.getClass(), "stack", null);
        setField(term26219, term26219.getClass(), "baseUri", null);
        setField(term26219, term26219.getClass(), "currentToken", null);
        setField(term26219, term26219.getClass(), "errors", null);
        setField(term26219, term26219.getClass(), "settings", null);
        setField(term26220, term26220.getClass(), "tagName", null);
        setField(term26220, term26220.getClass(), "normalName", null);
        setField(term26220, term26220.getClass(), "pendingAttributeName", null);
        setField(term26221, term26221.getClass(), "value", term26222);
        setByteField(term26221, term26221.getClass(), "coder", (byte) 0);
        setIntField(term26221, term26221.getClass(), "count", 0);
        setField(term26220, term26220.getClass(), "pendingAttributeValue", term26221);
        setField(term26220, term26220.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term26220, term26220.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term26220, term26220.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term26220, term26220.getClass(), "selfClosing", false);
        setField(term26223, term26223.getClass(), "attributes", null);
        setField(term26220, term26220.getClass(), "attributes", term26223);
        setField(term26220, term26220.getClass(), "type", enum72);
        setField(term26219, term26219.getClass(), "start", term26220);
        setField(term26227, term26227.getClass(), "tagName", null);
        setField(term26227, term26227.getClass(), "normalName", null);
        setField(term26227, term26227.getClass(), "pendingAttributeName", null);
        setField(term26228, term26228.getClass(), "value", term26229);
        setByteField(term26228, term26228.getClass(), "coder", (byte) 0);
        setIntField(term26228, term26228.getClass(), "count", 0);
        setField(term26227, term26227.getClass(), "pendingAttributeValue", term26228);
        setField(term26227, term26227.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term26227, term26227.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term26227, term26227.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term26227, term26227.getClass(), "selfClosing", false);
        setField(term26227, term26227.getClass(), "attributes", null);
        setField(term26227, term26227.getClass(), "type", enum73);
        setField(term26219, term26219.getClass(), "end", term26227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26219));
    }

};


