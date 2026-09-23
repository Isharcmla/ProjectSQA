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
     Object term155567;
     Object term155640;
     Object term155719;
     Object term155722;

    public Attribute_equals_10770040107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155567 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155567, term155567.getClass(), "key", "java.lang.Class");
        term155640 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term155719 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155719, term155719.getClass(), "key", "java.lang.Class");
        setField(term155719, term155719.getClass(), "val", null);
        setField(term155719, term155719.getClass(), "parent", null);
        term155722 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155722, term155722.getClass(), "key", null);
        setField(term155722, term155722.getClass(), "val", null);
        setField(term155722, term155722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155640;
        Object retValue = callMethod(klass, "equals", argTypes, term155567, args);
        assertTrue(recursiveEquals(term155567, term155719));
        assertTrue(recursiveEquals(term155640, term155722));
        assertTrue(recursiveEquals(retValue, false));
    }

};


