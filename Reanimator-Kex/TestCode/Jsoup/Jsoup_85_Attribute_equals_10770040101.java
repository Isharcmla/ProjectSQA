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

public class Attribute_equals_10770040101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151777;
     Object term151850;
     Object term151926;
     Object term151929;

    public Attribute_equals_10770040101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151777 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151777, term151777.getClass(), "key", null);
        setField(term151777, term151777.getClass(), "val", "org.jsoup.nodes.BooleanAttribute");
        term151850 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151850, term151850.getClass(), "key", null);
        term151926 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151926, term151926.getClass(), "key", null);
        setField(term151926, term151926.getClass(), "val", "org.jsoup.nodes.BooleanAttribute");
        setField(term151926, term151926.getClass(), "parent", null);
        term151929 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term151929, term151929.getClass(), "key", null);
        setField(term151929, term151929.getClass(), "val", null);
        setField(term151929, term151929.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151850;
        Object retValue = callMethod(klass, "equals", argTypes, term151777, args);
        assertTrue(recursiveEquals(term151777, term151926));
        assertTrue(recursiveEquals(term151850, term151929));
        assertTrue(recursiveEquals(retValue, false));
    }

};


