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

public class Attribute_equals_10770040101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154322;
     Object term154392;
     Object term154541;
     Object term154542;

    public Attribute_equals_10770040101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154322 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154392 = newInstance(Class.forName("java.io.StreamCorruptedException"));
        term154541 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154541, term154541.getClass(), "key", null);
        setField(term154541, term154541.getClass(), "val", null);
        setField(term154541, term154541.getClass(), "parent", null);
        term154542 = newInstance(Class.forName("java.io.StreamCorruptedException"));
        setField(term154542, term154542.getClass(), "backtrace", null);
        setField(term154542, term154542.getClass(), "detailMessage", null);
        setField(term154542, term154542.getClass(), "cause", null);
        setField(term154542, term154542.getClass(), "stackTrace", null);
        setIntField(term154542, term154542.getClass(), "depth", 0);
        setField(term154542, term154542.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154392;
        Object retValue = callMethod(klass, "equals", argTypes, term154322, args);
        assertTrue(recursiveEquals(term154322, term154541));
        assertTrue(recursiveEquals(term154392, term154542));
        assertTrue(recursiveEquals(retValue, false));
    }

};


