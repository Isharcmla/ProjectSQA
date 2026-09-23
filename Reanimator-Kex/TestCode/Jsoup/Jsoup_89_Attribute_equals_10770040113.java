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

public class Attribute_equals_10770040113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155033;
     Object term155106;
     Object term155150;
     Object term155153;

    public Attribute_equals_10770040113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155033 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155033, term155033.getClass(), "key", null);
        setField(term155033, term155033.getClass(), "val", "java.lang.Object");
        term155106 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155106, term155106.getClass(), "key", null);
        term155150 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155150, term155150.getClass(), "key", null);
        setField(term155150, term155150.getClass(), "val", "java.lang.Object");
        setField(term155150, term155150.getClass(), "parent", null);
        term155153 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155153, term155153.getClass(), "key", null);
        setField(term155153, term155153.getClass(), "val", null);
        setField(term155153, term155153.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155106;
        Object retValue = callMethod(klass, "equals", argTypes, term155033, args);
        assertTrue(recursiveEquals(term155033, term155150));
        assertTrue(recursiveEquals(term155106, term155153));
        assertTrue(recursiveEquals(retValue, false));
    }

};


