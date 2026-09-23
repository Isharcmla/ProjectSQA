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

public class Attributes_put_28062925581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15623274;
     Object term15623381;
     Object term15623370;

    public Attributes_put_28062925581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15623274 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15622909 = (Object[]) newArray("java.lang.String", 14);
        Object[] term15622922 = (Object[]) newArray("java.lang.String", 496);
        setIntField(term15623274, term15623274.getClass(), "size", 7);
        setElement(term15622909, 6, "");
        setField(term15623274, term15623274.getClass(), "keys", term15622909);
        setField(term15623274, term15623274.getClass(), "vals", term15622922);
        term15623381 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15623382 = (Object[]) newArray("java.lang.String", 14);
        Object[] term15623383 = (Object[]) newArray("java.lang.String", 496);
        setIntField(term15623381, term15623381.getClass(), "size", 6);
        setField(term15623381, term15623381.getClass(), "keys", term15623382);
        setField(term15623381, term15623381.getClass(), "vals", term15623383);
        term15623370 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15623372 = (Object[]) newArray("java.lang.String", 14);
        Object[] term15623373 = (Object[]) newArray("java.lang.String", 496);
        setIntField(term15623370, term15623370.getClass(), "size", 6);
        setField(term15623370, term15623370.getClass(), "keys", term15623372);
        setField(term15623370, term15623370.getClass(), "vals", term15623373);
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
        Object retValue = callMethod(klass, "put", argTypes, term15623274, args);
        assertTrue(recursiveEquals(term15623274, term15623381));
        assertTrue(recursiveEquals(retValue, term15623370));
    }

};


