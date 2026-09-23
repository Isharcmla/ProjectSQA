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
     Object term151581;
     Object term151616;
     Object term152349;
     Object term152350;

    public Attribute_equals_10770040103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151581 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151581, term151581.getClass(), "key", null);
        term151616 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151616, term151616.getClass(), "key", "byte[]");
        term152349 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term152349, term152349.getClass(), "key", null);
        setField(term152349, term152349.getClass(), "val", null);
        setField(term152349, term152349.getClass(), "parent", null);
        term152350 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term152350, term152350.getClass(), "key", "byte[]");
        setField(term152350, term152350.getClass(), "val", null);
        setField(term152350, term152350.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151616;
        Object retValue = callMethod(klass, "equals", argTypes, term151581, args);
        assertTrue(recursiveEquals(term151581, term152349));
        assertTrue(recursiveEquals(term151616, term152350));
        assertTrue(recursiveEquals(retValue, false));
    }

};


