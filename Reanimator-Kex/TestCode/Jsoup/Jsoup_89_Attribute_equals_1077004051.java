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

public class Attribute_equals_1077004051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135840;
     Object term135844;
     Object term135845;

    public Attribute_equals_1077004051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135840 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term135844 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term135844, term135844.getClass(), "key", null);
        setField(term135844, term135844.getClass(), "val", null);
        setField(term135844, term135844.getClass(), "parent", null);
        term135845 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term135845, term135845.getClass(), "key", null);
        setField(term135845, term135845.getClass(), "val", null);
        setField(term135845, term135845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135840;
        Object retValue = callMethod(klass, "equals", argTypes, term135840, args);
        assertTrue(recursiveEquals(term135840, term135844));
        assertTrue(recursiveEquals(term135840, term135845));
        assertTrue(recursiveEquals(retValue, true));
    }

};


