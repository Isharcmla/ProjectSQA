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

public class Attributes_put_28062925500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12494294;
     Object term12750190;
     Object term12737843;

    public Attributes_put_28062925500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12494294 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12492269 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term12494294, term12494294.getClass(), "size", 12);
        setElement(term12492269, 10, "                \u0001\u0001");
        setField(term12494294, term12494294.getClass(), "keys", term12492269);
        term12750190 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12750285 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term12750190, term12750190.getClass(), "size", 12);
        setElement(term12750285, 10, "                \u0001\u0001");
        setField(term12750190, term12750190.getClass(), "keys", term12750285);
        setField(term12750190, term12750190.getClass(), "vals", null);
        term12737843 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12737845 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term12737843, term12737843.getClass(), "size", 12);
        setElement(term12737845, 10, "                \u0001\u0001");
        setField(term12737843, term12737843.getClass(), "keys", term12737845);
        setField(term12737843, term12737843.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term12494294, args);
        assertTrue(recursiveEquals(term12494294, term12750190));
        assertTrue(recursiveEquals(retValue, term12737843));
    }

};


