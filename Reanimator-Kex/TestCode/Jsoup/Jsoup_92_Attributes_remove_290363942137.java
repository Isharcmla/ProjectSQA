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
import java.lang.Object;

public class Attributes_remove_290363942137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88689;
     Object term88739;

    public Attributes_remove_290363942137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88689 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term88617 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term88689, term88689.getClass(), "size", 1);
        setField(term88689, term88689.getClass(), "keys", term88617);
        term88739 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term88740 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term88739, term88739.getClass(), "size", 1);
        setField(term88739, term88739.getClass(), "keys", term88740);
        setField(term88739, term88739.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term88689, args);
        assertTrue(recursiveEquals(term88689, term88739));
    }

};


