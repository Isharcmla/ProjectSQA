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

public class Attribute_equals_10770040167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274740;
     Object term274775;
     Object term274782;
     Object term274783;

    public Attribute_equals_10770040167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274740 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term274775 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term274782 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term274782, term274782.getClass(), "key", null);
        setField(term274782, term274782.getClass(), "val", null);
        setField(term274782, term274782.getClass(), "parent", null);
        term274783 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term274783, term274783.getClass(), "key", null);
        setField(term274783, term274783.getClass(), "val", null);
        setField(term274783, term274783.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term274775;
        Object retValue = callMethod(klass, "equals", argTypes, term274740, args);
        assertTrue(recursiveEquals(term274740, term274782));
        assertTrue(recursiveEquals(term274775, term274783));
        assertTrue(recursiveEquals(retValue, false));
    }

};


