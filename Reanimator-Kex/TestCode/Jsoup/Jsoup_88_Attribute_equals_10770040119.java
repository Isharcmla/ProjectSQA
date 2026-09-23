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

public class Attribute_equals_10770040119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158088;
     Object term158154;
     Object term158672;
     Object term158673;

    public Attribute_equals_10770040119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158088 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term158154 = newInstance(Class.forName("java.lang.module.FindException"));
        term158672 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term158672, term158672.getClass(), "key", null);
        setField(term158672, term158672.getClass(), "val", null);
        setField(term158672, term158672.getClass(), "parent", null);
        term158673 = newInstance(Class.forName("java.lang.module.FindException"));
        setField(term158673, term158673.getClass(), "backtrace", null);
        setField(term158673, term158673.getClass(), "detailMessage", null);
        setField(term158673, term158673.getClass(), "cause", null);
        setField(term158673, term158673.getClass(), "stackTrace", null);
        setIntField(term158673, term158673.getClass(), "depth", 0);
        setField(term158673, term158673.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term158154;
        Object retValue = callMethod(klass, "equals", argTypes, term158088, args);
        assertTrue(recursiveEquals(term158088, term158672));
        assertTrue(recursiveEquals(term158154, term158673));
        assertTrue(recursiveEquals(retValue, false));
    }

};


