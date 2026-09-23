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

public class XmlTreeBuilder_init_13460120249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12773;

    public XmlTreeBuilder_init_13460120249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12773 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term12773, term12773.getClass(), "reader", null);
        setField(term12773, term12773.getClass(), "tokeniser", null);
        setField(term12773, term12773.getClass(), "doc", null);
        setField(term12773, term12773.getClass(), "stack", null);
        setField(term12773, term12773.getClass(), "baseUri", null);
        setField(term12773, term12773.getClass(), "currentToken", null);
        setField(term12773, term12773.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12773));
    }

};


