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

public class Attribute_equals_1077004099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150308;
     Object term150408;
     Object term150416;
     Object term150417;

    public Attribute_equals_1077004099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150308 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term150408 = newInstance(Class.forName("java.nio.channels.ShutdownChannelGroupException"));
        term150416 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term150416, term150416.getClass(), "key", null);
        setField(term150416, term150416.getClass(), "val", null);
        setField(term150416, term150416.getClass(), "parent", null);
        term150417 = newInstance(Class.forName("java.nio.channels.ShutdownChannelGroupException"));
        setField(term150417, term150417.getClass(), "backtrace", null);
        setField(term150417, term150417.getClass(), "detailMessage", null);
        setField(term150417, term150417.getClass(), "cause", null);
        setField(term150417, term150417.getClass(), "stackTrace", null);
        setIntField(term150417, term150417.getClass(), "depth", 0);
        setField(term150417, term150417.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term150408;
        Object retValue = callMethod(klass, "equals", argTypes, term150308, args);
        assertTrue(recursiveEquals(term150308, term150416));
        assertTrue(recursiveEquals(term150408, term150417));
        assertTrue(recursiveEquals(retValue, false));
    }

};


