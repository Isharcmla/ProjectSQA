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

public class Attribute_equals_10770040105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153263;
     Object term153303;
     Object term153310;
     Object term153311;

    public Attribute_equals_10770040105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153263 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term153303 = newInstance(Class.forName("java.lang.Class$3"));
        term153310 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term153310, term153310.getClass(), "key", null);
        setField(term153310, term153310.getClass(), "val", null);
        setField(term153310, term153310.getClass(), "parent", null);
        term153311 = newInstance(Class.forName("java.lang.Class$3"));
        setField(term153311, term153311.getClass(), "val$values", null);
        setField(term153311, term153311.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term153303;
        Object retValue = callMethod(klass, "equals", argTypes, term153263, args);
        assertTrue(recursiveEquals(term153263, term153310));
        assertTrue(recursiveEquals(term153303, term153311));
        assertTrue(recursiveEquals(retValue, false));
    }

};


