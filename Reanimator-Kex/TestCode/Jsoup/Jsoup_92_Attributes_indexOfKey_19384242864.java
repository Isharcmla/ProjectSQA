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

public class Attributes_indexOfKey_19384242864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76122;
     Object term76250;

    public Attributes_indexOfKey_19384242864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76122 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term76050 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term76122, term76122.getClass(), "size", 1);
        setField(term76122, term76122.getClass(), "keys", term76050);
        term76250 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term76251 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term76250, term76250.getClass(), "size", 1);
        setField(term76250, term76250.getClass(), "keys", term76251);
        setField(term76250, term76250.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term76122, args);
        assertTrue(recursiveEquals(term76122, term76250));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


