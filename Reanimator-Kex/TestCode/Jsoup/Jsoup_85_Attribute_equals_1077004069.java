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

public class Attribute_equals_1077004069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142757;
     Object term142827;
     Object term142834;
     Object term142835;

    public Attribute_equals_1077004069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142757 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term142827 = newInstance(Class.forName("java.util.concurrent.Executors$2"));
        term142834 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term142834, term142834.getClass(), "key", null);
        setField(term142834, term142834.getClass(), "val", null);
        setField(term142834, term142834.getClass(), "parent", null);
        term142835 = newInstance(Class.forName("java.util.concurrent.Executors$2"));
        setField(term142835, term142835.getClass(), "val$action", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term142827;
        Object retValue = callMethod(klass, "equals", argTypes, term142757, args);
        assertTrue(recursiveEquals(term142757, term142834));
        assertTrue(recursiveEquals(term142827, term142835));
        assertTrue(recursiveEquals(retValue, false));
    }

};


