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

public class Attribute_equals_1077004071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146198;
     Object term146280;
     Object term146288;
     Object term146289;

    public Attribute_equals_1077004071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146198 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term146280 = newInstance(Class.forName("java.lang.UnsupportedClassVersionError"));
        term146288 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term146288, term146288.getClass(), "key", null);
        setField(term146288, term146288.getClass(), "val", null);
        setField(term146288, term146288.getClass(), "parent", null);
        term146289 = newInstance(Class.forName("java.lang.UnsupportedClassVersionError"));
        setField(term146289, term146289.getClass(), "backtrace", null);
        setField(term146289, term146289.getClass(), "detailMessage", null);
        setField(term146289, term146289.getClass(), "cause", null);
        setField(term146289, term146289.getClass(), "stackTrace", null);
        setIntField(term146289, term146289.getClass(), "depth", 0);
        setField(term146289, term146289.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146280;
        Object retValue = callMethod(klass, "equals", argTypes, term146198, args);
        assertTrue(recursiveEquals(term146198, term146288));
        assertTrue(recursiveEquals(term146280, term146289));
        assertTrue(recursiveEquals(retValue, false));
    }

};


