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

public class Attributes_checkCapacity_1404490313419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7536207;
     Object term8503252;

    public Attributes_checkCapacity_1404490313419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7536207 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7536132 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term7536207, term7536207.getClass(), "size", -2147483647);
        setField(term7536207, term7536207.getClass(), "keys", term7536132);
        term8503252 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8503253 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term8503252, term8503252.getClass(), "size", -2147483647);
        setField(term8503252, term8503252.getClass(), "keys", term8503253);
        setField(term8503252, term8503252.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -2147483647;
        callMethod(klass, "checkCapacity", argTypes, term7536207, args);
        assertTrue(recursiveEquals(term7536207, term8503252));
    }

};


