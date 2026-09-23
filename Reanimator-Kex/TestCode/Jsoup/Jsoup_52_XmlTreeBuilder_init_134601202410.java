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

public class XmlTreeBuilder_init_134601202410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20316;

    public XmlTreeBuilder_init_134601202410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20347 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term20346 = ((Class) term20347).getDeclaredField((String) "StartTag");
        ((Field) term20346).setAccessible(true);
        Object enum56 = ((Field) term20346).get((Object) null);
        Class<? extends Object> term20554 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term20553 = ((Class) term20554).getDeclaredField((String) "EndTag");
        ((Field) term20553).setAccessible(true);
        Object enum57 = ((Field) term20553).get((Object) null);
        term20316 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term20317 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term20318 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20319 = (byte[]) newByteArray(16);
        Object term20320 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term20324 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term20325 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20326 = (byte[]) newByteArray(16);
        setField(term20316, term20316.getClass(), "reader", null);
        setField(term20316, term20316.getClass(), "tokeniser", null);
        setField(term20316, term20316.getClass(), "doc", null);
        setField(term20316, term20316.getClass(), "stack", null);
        setField(term20316, term20316.getClass(), "baseUri", null);
        setField(term20316, term20316.getClass(), "currentToken", null);
        setField(term20316, term20316.getClass(), "errors", null);
        setField(term20317, term20317.getClass(), "tagName", null);
        setField(term20317, term20317.getClass(), "pendingAttributeName", null);
        setField(term20318, term20318.getClass(), "value", term20319);
        setByteField(term20318, term20318.getClass(), "coder", (byte) 0);
        setIntField(term20318, term20318.getClass(), "count", 0);
        setField(term20317, term20317.getClass(), "pendingAttributeValue", term20318);
        setField(term20317, term20317.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term20317, term20317.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term20317, term20317.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term20317, term20317.getClass(), "selfClosing", false);
        setField(term20320, term20320.getClass(), "attributes", null);
        setField(term20317, term20317.getClass(), "attributes", term20320);
        setField(term20317, term20317.getClass(), "type", enum56);
        setField(term20316, term20316.getClass(), "start", term20317);
        setField(term20324, term20324.getClass(), "tagName", null);
        setField(term20324, term20324.getClass(), "pendingAttributeName", null);
        setField(term20325, term20325.getClass(), "value", term20326);
        setByteField(term20325, term20325.getClass(), "coder", (byte) 0);
        setIntField(term20325, term20325.getClass(), "count", 0);
        setField(term20324, term20324.getClass(), "pendingAttributeValue", term20325);
        setField(term20324, term20324.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term20324, term20324.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term20324, term20324.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term20324, term20324.getClass(), "selfClosing", false);
        setField(term20324, term20324.getClass(), "attributes", null);
        setField(term20324, term20324.getClass(), "type", enum57);
        setField(term20316, term20316.getClass(), "end", term20324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20316));
    }

};


