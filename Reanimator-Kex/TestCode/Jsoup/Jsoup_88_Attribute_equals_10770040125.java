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

public class Attribute_equals_10770040125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160695;
     Object term160768;
     Object term160854;
     Object term160857;

    public Attribute_equals_10770040125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160695 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160695, term160695.getClass(), "key", null);
        setField(term160695, term160695.getClass(), "val", "java.lang.Object");
        term160768 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160768, term160768.getClass(), "key", null);
        term160854 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160854, term160854.getClass(), "key", null);
        setField(term160854, term160854.getClass(), "val", "java.lang.Object");
        setField(term160854, term160854.getClass(), "parent", null);
        term160857 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160857, term160857.getClass(), "key", null);
        setField(term160857, term160857.getClass(), "val", null);
        setField(term160857, term160857.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term160768;
        Object retValue = callMethod(klass, "equals", argTypes, term160695, args);
        assertTrue(recursiveEquals(term160695, term160854));
        assertTrue(recursiveEquals(term160768, term160857));
        assertTrue(recursiveEquals(retValue, false));
    }

};


