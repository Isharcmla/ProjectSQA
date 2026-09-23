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

public class Attribute_equals_10770040161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316599;
     Object term316634;
     Object term316645;
     Object term316646;

    public Attribute_equals_10770040161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316599 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term316634 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term316645 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term316645, term316645.getClass(), "key", null);
        setField(term316645, term316645.getClass(), "val", null);
        setField(term316645, term316645.getClass(), "parent", null);
        term316646 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term316646, term316646.getClass(), "key", null);
        setField(term316646, term316646.getClass(), "val", null);
        setField(term316646, term316646.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term316634;
        Object retValue = callMethod(klass, "equals", argTypes, term316599, args);
        assertTrue(recursiveEquals(term316599, term316645));
        assertTrue(recursiveEquals(term316634, term316646));
        assertTrue(recursiveEquals(retValue, true));
    }

};


