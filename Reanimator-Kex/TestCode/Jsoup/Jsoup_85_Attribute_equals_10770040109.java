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

public class Attribute_equals_10770040109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154260;
     Object term154295;
     Object term154306;
     Object term154307;

    public Attribute_equals_10770040109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154260 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154295 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term154306 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154306, term154306.getClass(), "key", null);
        setField(term154306, term154306.getClass(), "val", null);
        setField(term154306, term154306.getClass(), "parent", null);
        term154307 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term154307, term154307.getClass(), "key", null);
        setField(term154307, term154307.getClass(), "val", null);
        setField(term154307, term154307.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term154295;
        Object retValue = callMethod(klass, "equals", argTypes, term154260, args);
        assertTrue(recursiveEquals(term154260, term154306));
        assertTrue(recursiveEquals(term154295, term154307));
        assertTrue(recursiveEquals(retValue, true));
    }

};


