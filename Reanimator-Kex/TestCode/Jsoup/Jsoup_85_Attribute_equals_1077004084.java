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

public class Attribute_equals_1077004084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147769;
     Object term147825;
     Object term147941;
     Object term147942;

    public Attribute_equals_1077004084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147769 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term147825 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term147941 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term147941, term147941.getClass(), "key", null);
        setField(term147941, term147941.getClass(), "val", null);
        setField(term147941, term147941.getClass(), "parent", null);
        term147942 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term147942, term147942.getClass(), "key", null);
        setField(term147942, term147942.getClass(), "val", null);
        setField(term147942, term147942.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term147825;
        Object retValue = callMethod(klass, "equals", argTypes, term147769, args);
        assertTrue(recursiveEquals(term147769, term147941));
        assertTrue(recursiveEquals(term147825, term147942));
        assertTrue(recursiveEquals(retValue, false));
    }

};


