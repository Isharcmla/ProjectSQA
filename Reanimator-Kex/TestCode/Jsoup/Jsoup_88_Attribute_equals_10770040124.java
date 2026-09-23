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

public class Attribute_equals_10770040124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160393;
     Object term160428;
     Object term160801;
     Object term160802;

    public Attribute_equals_10770040124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160393 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160393, term160393.getClass(), "key", null);
        term160428 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160428, term160428.getClass(), "key", "byte[]");
        term160801 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160801, term160801.getClass(), "key", null);
        setField(term160801, term160801.getClass(), "val", null);
        setField(term160801, term160801.getClass(), "parent", null);
        term160802 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term160802, term160802.getClass(), "key", "byte[]");
        setField(term160802, term160802.getClass(), "val", null);
        setField(term160802, term160802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term160428;
        Object retValue = callMethod(klass, "equals", argTypes, term160393, args);
        assertTrue(recursiveEquals(term160393, term160801));
        assertTrue(recursiveEquals(term160428, term160802));
        assertTrue(recursiveEquals(retValue, false));
    }

};


