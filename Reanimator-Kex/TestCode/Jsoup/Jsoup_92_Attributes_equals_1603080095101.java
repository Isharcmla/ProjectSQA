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

public class Attributes_equals_1603080095101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82021;
     Object term82026;
     Object term82027;

    public Attributes_equals_1603080095101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82021 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term82026 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term82026, term82026.getClass(), "size", 0);
        setField(term82026, term82026.getClass(), "keys", null);
        setField(term82026, term82026.getClass(), "vals", null);
        term82027 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term82027, term82027.getClass(), "size", 0);
        setField(term82027, term82027.getClass(), "keys", null);
        setField(term82027, term82027.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82021;
        Object retValue = callMethod(klass, "equals", argTypes, term82021, args);
        assertTrue(recursiveEquals(term82021, term82026));
        assertTrue(recursiveEquals(term82021, term82027));
        assertTrue(recursiveEquals(retValue, true));
    }

};


