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

public class Attributes_checkCapacity_140449031365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76239;
     Object term76262;

    public Attributes_checkCapacity_140449031365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76239 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term76164 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term76239, term76239.getClass(), "size", -2147483647);
        setField(term76239, term76239.getClass(), "keys", term76164);
        term76262 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term76263 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term76262, term76262.getClass(), "size", -2147483647);
        setField(term76262, term76262.getClass(), "keys", term76263);
        setField(term76262, term76262.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -2147483647;
        callMethod(klass, "checkCapacity", argTypes, term76239, args);
        assertTrue(recursiveEquals(term76239, term76262));
    }

};


