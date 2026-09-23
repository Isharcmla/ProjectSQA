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

public class Attributes_put_28062925495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11604814;
     Object term13307176;
     Object term13307151;

    public Attributes_put_28062925495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11604814 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11602789 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term11604814, term11604814.getClass(), "size", 12);
        setElement(term11602789, 10, "                \u0001\u0001");
        setField(term11604814, term11604814.getClass(), "keys", term11602789);
        term13307176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13307177 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term13307176, term13307176.getClass(), "size", 12);
        setElement(term13307177, 10, "                \u0001\u0001");
        setField(term13307176, term13307176.getClass(), "keys", term13307177);
        setField(term13307176, term13307176.getClass(), "vals", null);
        term13307151 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13307153 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term13307151, term13307151.getClass(), "size", 12);
        setElement(term13307153, 10, "                \u0001\u0001");
        setField(term13307151, term13307151.getClass(), "keys", term13307153);
        setField(term13307151, term13307151.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                \u0001\u0001\u0001\u0001";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term11604814, args);
        assertTrue(recursiveEquals(term11604814, term13307176));
        assertTrue(recursiveEquals(retValue, term13307151));
    }

};


