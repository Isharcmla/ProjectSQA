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

public class Attribute_equals_1077004093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149970;
     Object term150070;
     Object term150098;
     Object term150099;

    public Attribute_equals_1077004093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149970 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term150070 = newInstance(Class.forName("java.nio.channels.ShutdownChannelGroupException"));
        term150098 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term150098, term150098.getClass(), "key", null);
        setField(term150098, term150098.getClass(), "val", null);
        setField(term150098, term150098.getClass(), "parent", null);
        term150099 = newInstance(Class.forName("java.nio.channels.ShutdownChannelGroupException"));
        setField(term150099, term150099.getClass(), "backtrace", null);
        setField(term150099, term150099.getClass(), "detailMessage", null);
        setField(term150099, term150099.getClass(), "cause", null);
        setField(term150099, term150099.getClass(), "stackTrace", null);
        setIntField(term150099, term150099.getClass(), "depth", 0);
        setField(term150099, term150099.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term150070;
        Object retValue = callMethod(klass, "equals", argTypes, term149970, args);
        assertTrue(recursiveEquals(term149970, term150098));
        assertTrue(recursiveEquals(term150070, term150099));
        assertTrue(recursiveEquals(retValue, false));
    }

};


