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

public class Attributes_put_28062925300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2326521;
     Object term5257529;
     Object term5257524;

    public Attributes_put_28062925300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2326521 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2325818 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term2326521, term2326521.getClass(), "size", 11);
        setField(term2326521, term2326521.getClass(), "keys", term2325818);
        term5257529 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5257530 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term5257529, term5257529.getClass(), "size", 11);
        setField(term5257529, term5257529.getClass(), "keys", term5257530);
        setField(term5257529, term5257529.getClass(), "vals", null);
        term5257524 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5257526 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term5257524, term5257524.getClass(), "size", 11);
        setField(term5257524, term5257524.getClass(), "keys", term5257526);
        setField(term5257524, term5257524.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term2326521, args);
        assertTrue(recursiveEquals(term2326521, term5257529));
        assertTrue(recursiveEquals(retValue, term5257524));
    }

};


