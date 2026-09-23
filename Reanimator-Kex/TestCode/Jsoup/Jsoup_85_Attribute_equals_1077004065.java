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
import java.lang.Integer;

public class Attribute_equals_1077004065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140850;
     Object term140898;
     Object term140907;
     Object term140908;

    public Attribute_equals_1077004065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140850 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term140898 = new Integer(0);
        term140907 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term140907, term140907.getClass(), "key", null);
        setField(term140907, term140907.getClass(), "val", null);
        setField(term140907, term140907.getClass(), "parent", null);
        term140908 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140898;
        Object retValue = callMethod(klass, "equals", argTypes, term140850, args);
        assertTrue(recursiveEquals(term140850, term140907));
        assertTrue(recursiveEquals(term140898, term140908));
        assertTrue(recursiveEquals(retValue, false));
    }

};


