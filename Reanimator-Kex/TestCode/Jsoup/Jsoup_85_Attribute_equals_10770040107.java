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
     Object term153821;
     Object term153885;
     Object term153893;
     Object term153894;

    public Attribute_equals_10770040107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153821 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term153885 = newInstance(Class.forName("java.nio.InvalidMarkException"));
        term153893 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term153893, term153893.getClass(), "key", null);
        setField(term153893, term153893.getClass(), "val", null);
        setField(term153893, term153893.getClass(), "parent", null);
        term153894 = newInstance(Class.forName("java.nio.InvalidMarkException"));
        setField(term153894, term153894.getClass(), "backtrace", null);
        setField(term153894, term153894.getClass(), "detailMessage", null);
        setField(term153894, term153894.getClass(), "cause", null);
        setField(term153894, term153894.getClass(), "stackTrace", null);
        setIntField(term153894, term153894.getClass(), "depth", 0);
        setField(term153894, term153894.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term153885;
        Object retValue = callMethod(klass, "equals", argTypes, term153821, args);
        assertTrue(recursiveEquals(term153821, term153893));
        assertTrue(recursiveEquals(term153885, term153894));
        assertTrue(recursiveEquals(retValue, false));
    }

};


