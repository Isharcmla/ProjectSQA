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
import java.lang.Integer;

public class Attribute_equals_1077004083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146344;
     Object term146392;
     Object term146401;
     Object term146402;

    public Attribute_equals_1077004083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146344 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term146392 = new Integer(0);
        term146401 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term146401, term146401.getClass(), "key", null);
        setField(term146401, term146401.getClass(), "val", null);
        setField(term146401, term146401.getClass(), "parent", null);
        term146402 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146392;
        Object retValue = callMethod(klass, "equals", argTypes, term146344, args);
        assertTrue(recursiveEquals(term146344, term146401));
        assertTrue(recursiveEquals(term146392, term146402));
        assertTrue(recursiveEquals(retValue, false));
    }

};


