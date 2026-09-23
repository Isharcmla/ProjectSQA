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
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200571;
     Object term200639;
     Object term200937;
     Object term200938;

    public XmlTreeBuilder_process_14292257555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200571 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term200944 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200943 = ((Class) term200944).getDeclaredField((String) "EOF");
        ((Field) term200943).setAccessible(true);
        Object enum231 = ((Field) term200943).get((Object) null);
        term200639 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term200639, term200639.getClass(), "type", enum231);
        term200937 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term200937, term200937.getClass(), "reader", null);
        setField(term200937, term200937.getClass(), "tokeniser", null);
        setField(term200937, term200937.getClass(), "doc", null);
        setField(term200937, term200937.getClass(), "stack", null);
        setField(term200937, term200937.getClass(), "baseUri", null);
        setField(term200937, term200937.getClass(), "currentToken", null);
        setField(term200937, term200937.getClass(), "errors", null);
        setField(term200937, term200937.getClass(), "settings", null);
        setField(term200937, term200937.getClass(), "start", null);
        setField(term200937, term200937.getClass(), "end", null);
        Class<? extends Object> term201120 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term201119 = ((Class) term201120).getDeclaredField((String) "EOF");
        ((Field) term201119).setAccessible(true);
        Object enum232 = ((Field) term201119).get((Object) null);
        term200938 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term200938, term200938.getClass(), "tagName", null);
        setField(term200938, term200938.getClass(), "normalName", null);
        setField(term200938, term200938.getClass(), "pendingAttributeName", null);
        setField(term200938, term200938.getClass(), "pendingAttributeValue", null);
        setField(term200938, term200938.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term200938, term200938.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term200938, term200938.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term200938, term200938.getClass(), "selfClosing", false);
        setField(term200938, term200938.getClass(), "attributes", null);
        setField(term200938, term200938.getClass(), "type", enum232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term200639;
        Object retValue = callMethod(klass, "process", argTypes, term200571, args);
        assertTrue(recursiveEquals(term200571, term200937));
        assertTrue(recursiveEquals(term200639, term200938));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


