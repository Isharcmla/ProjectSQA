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

public class Attribute_equals_10770040100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154031;
     Object term154066;
     Object term154403;
     Object term154404;

    public Attribute_equals_10770040100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154031 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154066 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154403 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154403, term154403.getClass(), "key", null);
        setField(term154403, term154403.getClass(), "val", null);
        setField(term154403, term154403.getClass(), "parent", null);
        term154404 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154404, term154404.getClass(), "key", null);
        setField(term154404, term154404.getClass(), "val", null);
        setField(term154404, term154404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154066;
        Object retValue = callMethod(klass, "equals", argTypes, term154031, args);
        assertTrue(recursiveEquals(term154031, term154403));
        assertTrue(recursiveEquals(term154066, term154404));
        assertTrue(recursiveEquals(retValue, true));
    }

};


