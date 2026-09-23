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

public class Attributes_put_28062925447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9883505;
     Object term9884643;
     Object term9884634;

    public Attributes_put_28062925447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9883505 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9880538 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term9883505, term9883505.getClass(), "size", 15);
        setElement(term9880538, 3, "");
        setElement(term9880538, 4, "");
        setField(term9883505, term9883505.getClass(), "keys", term9880538);
        term9884643 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9884644 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term9884643, term9884643.getClass(), "size", 15);
        setElement(term9884644, 3, "");
        setElement(term9884644, 4, "");
        setField(term9884643, term9884643.getClass(), "keys", term9884644);
        setField(term9884643, term9884643.getClass(), "vals", null);
        term9884634 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9884636 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term9884634, term9884634.getClass(), "size", 15);
        setElement(term9884636, 3, "");
        setElement(term9884636, 4, "");
        setField(term9884634, term9884634.getClass(), "keys", term9884636);
        setField(term9884634, term9884634.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "   \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term9883505, args);
        assertTrue(recursiveEquals(term9883505, term9884643));
        assertTrue(recursiveEquals(retValue, term9884634));
    }

};


