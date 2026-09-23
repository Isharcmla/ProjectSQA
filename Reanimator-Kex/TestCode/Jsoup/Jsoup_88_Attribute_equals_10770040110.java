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

public class Attribute_equals_10770040110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156038;
     Object term156086;
     Object term156422;
     Object term156423;

    public Attribute_equals_10770040110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156038 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term156086 = newInstance(Class.forName("java.lang.WeakPairMap"));
        term156422 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term156422, term156422.getClass(), "key", null);
        setField(term156422, term156422.getClass(), "val", null);
        setField(term156422, term156422.getClass(), "parent", null);
        term156423 = newInstance(Class.forName("java.lang.WeakPairMap"));
        setField(term156423, term156423.getClass(), "map", null);
        setField(term156423, term156423.getClass(), "queue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156086;
        Object retValue = callMethod(klass, "equals", argTypes, term156038, args);
        assertTrue(recursiveEquals(term156038, term156422));
        assertTrue(recursiveEquals(term156086, term156423));
        assertTrue(recursiveEquals(retValue, false));
    }

};


