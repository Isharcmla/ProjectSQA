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

public class Attributes_put_28062925117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84240;
     Object term84289;
     Object term84285;

    public Attributes_put_28062925117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84240 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term84240, term84240.getClass(), "size", 0);
        term84289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term84289, term84289.getClass(), "size", 0);
        setField(term84289, term84289.getClass(), "keys", null);
        setField(term84289, term84289.getClass(), "vals", null);
        term84285 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term84285, term84285.getClass(), "size", 0);
        setField(term84285, term84285.getClass(), "keys", null);
        setField(term84285, term84285.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term84240, args);
        assertTrue(recursiveEquals(term84240, term84289));
        assertTrue(recursiveEquals(retValue, term84285));
    }

};


