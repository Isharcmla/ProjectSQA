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

public class Attribute_equals_1077004055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136199;
     Object term136271;
     Object term136327;
     Object term136328;

    public Attribute_equals_1077004055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136199 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term136271 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        term136327 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term136327, term136327.getClass(), "key", null);
        setField(term136327, term136327.getClass(), "val", null);
        setField(term136327, term136327.getClass(), "parent", null);
        term136328 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        setField(term136328, term136328.getClass(), "this$0", null);
        setIntField(term136328, term136328.getClass(), "index", 0);
        setField(term136328, term136328.getClass(), "entry", null);
        setField(term136328, term136328.getClass(), "lastReturned", null);
        setIntField(term136328, term136328.getClass(), "expectedModCount", 0);
        setField(term136328, term136328.getClass(), "nextKey", null);
        setField(term136328, term136328.getClass(), "currentKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term136271;
        Object retValue = callMethod(klass, "equals", argTypes, term136199, args);
        assertTrue(recursiveEquals(term136199, term136327));
        assertTrue(recursiveEquals(term136271, term136328));
        assertTrue(recursiveEquals(retValue, false));
    }

};


