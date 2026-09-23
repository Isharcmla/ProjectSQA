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

public class Attributes_checkCapacity_1404490313135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72151;
     Object term72446;

    public Attributes_checkCapacity_1404490313135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72151 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term72059 = (Object[]) newArray("java.lang.String", 0);
        Object[] term72062 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term72151, term72151.getClass(), "size", 1);
        setField(term72151, term72151.getClass(), "keys", term72059);
        setField(term72151, term72151.getClass(), "vals", term72062);
        term72446 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term72447 = (Object[]) newArray("java.lang.String", 4);
        Object[] term72448 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term72446, term72446.getClass(), "size", 1);
        setField(term72446, term72446.getClass(), "keys", term72447);
        setField(term72446, term72446.getClass(), "vals", term72448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        callMethod(klass, "checkCapacity", argTypes, term72151, args);
        assertTrue(recursiveEquals(term72151, term72446));
    }

};


