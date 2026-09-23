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

public class Attribute_equals_10770040103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152362;
     Object term152397;
     Object term152458;
     Object term152459;

    public Attribute_equals_10770040103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152362 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term152362, term152362.getClass(), "key", null);
        term152397 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term152397, term152397.getClass(), "key", "byte[]");
        term152458 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term152458, term152458.getClass(), "key", null);
        setField(term152458, term152458.getClass(), "val", null);
        setField(term152458, term152458.getClass(), "parent", null);
        term152459 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term152459, term152459.getClass(), "key", "byte[]");
        setField(term152459, term152459.getClass(), "val", null);
        setField(term152459, term152459.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term152397;
        Object retValue = callMethod(klass, "equals", argTypes, term152362, args);
        assertTrue(recursiveEquals(term152362, term152458));
        assertTrue(recursiveEquals(term152397, term152459));
        assertTrue(recursiveEquals(retValue, false));
    }

};


