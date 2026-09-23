package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attribute_equals_10770040159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230206;
     Object term230241;
     Object term230252;
     Object term230253;

    public Attribute_equals_10770040159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230206 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term230206, term230206.getClass(), "key", null);
        setField(term230206, term230206.getClass(), "val", null);
        term230241 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term230241, term230241.getClass(), "key", null);
        setField(term230241, term230241.getClass(), "val", null);
        term230252 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term230252, term230252.getClass(), "key", null);
        setField(term230252, term230252.getClass(), "val", null);
        setField(term230252, term230252.getClass(), "parent", null);
        term230253 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term230253, term230253.getClass(), "key", null);
        setField(term230253, term230253.getClass(), "val", null);
        setField(term230253, term230253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term230241;
        Object retValue = callMethod(klass, "equals", argTypes, term230206, args);
        assertTrue(recursiveEquals(term230206, term230252));
        assertTrue(recursiveEquals(term230241, term230253));
        assertTrue(recursiveEquals(retValue, true));
    }

};


