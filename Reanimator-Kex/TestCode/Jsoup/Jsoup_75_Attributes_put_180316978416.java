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

public class Attributes_put_180316978416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7535182;
     Object term8502530;
     Object term8502285;

    public Attributes_put_180316978416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7535182 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7535044 = (Object[]) newArray("java.lang.String", 2);
        Object[] term7535049 = (Object[]) newArray("java.lang.String", 48);
        setIntField(term7535182, term7535182.getClass(), "size", 2);
        setField(term7535182, term7535182.getClass(), "keys", term7535044);
        setField(term7535182, term7535182.getClass(), "vals", term7535049);
        term8502530 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8502531 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8502534 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term8502530, term8502530.getClass(), "size", 3);
        setElement(term8502531, 2, "");
        setField(term8502530, term8502530.getClass(), "keys", term8502531);
        setField(term8502530, term8502530.getClass(), "vals", term8502534);
        term8502285 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8502287 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8502290 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term8502285, term8502285.getClass(), "size", 3);
        setElement(term8502287, 2, "");
        setField(term8502285, term8502285.getClass(), "keys", term8502287);
        setField(term8502285, term8502285.getClass(), "vals", term8502290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term7535182, args);
        assertTrue(recursiveEquals(term7535182, term8502530));
        assertTrue(recursiveEquals(retValue, term8502285));
    }

};


