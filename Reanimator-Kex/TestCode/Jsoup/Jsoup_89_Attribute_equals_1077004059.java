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

public class Attribute_equals_1077004059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138066;
     Object term138094;
     Object term138105;
     Object term138106;

    public Attribute_equals_1077004059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138066 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term138094 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term138105 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term138105, term138105.getClass(), "key", null);
        setField(term138105, term138105.getClass(), "val", null);
        setField(term138105, term138105.getClass(), "parent", null);
        term138106 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term138106, term138106.getClass(), "key", null);
        setField(term138106, term138106.getClass(), "val", null);
        setField(term138106, term138106.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term138094;
        Object retValue = callMethod(klass, "equals", argTypes, term138066, args);
        assertTrue(recursiveEquals(term138066, term138105));
        assertTrue(recursiveEquals(term138094, term138106));
        assertTrue(recursiveEquals(retValue, true));
    }

};


