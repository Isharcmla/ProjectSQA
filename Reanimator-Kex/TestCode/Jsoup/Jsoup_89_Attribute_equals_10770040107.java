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

public class Attribute_equals_10770040107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153665;
     Object term153781;
     Object term153942;
     Object term153943;

    public Attribute_equals_10770040107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153665 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term153781 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.CollectionIntrinsics"));
        term153942 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term153942, term153942.getClass(), "key", null);
        setField(term153942, term153942.getClass(), "val", null);
        setField(term153942, term153942.getClass(), "parent", null);
        term153943 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.CollectionIntrinsics"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term153781;
        Object retValue = callMethod(klass, "equals", argTypes, term153665, args);
        assertTrue(recursiveEquals(term153665, term153942));
        assertTrue(recursiveEquals(term153781, term153943));
        assertTrue(recursiveEquals(retValue, false));
    }

};


