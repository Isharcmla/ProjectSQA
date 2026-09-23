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

public class Attribute_equals_10770040116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155441;
     Object term155505;
     Object term155810;
     Object term155811;

    public Attribute_equals_10770040116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155441 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term155505 = newInstance(Class.forName("java.lang.CharacterDataLatin1"));
        term155810 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155810, term155810.getClass(), "key", null);
        setField(term155810, term155810.getClass(), "val", null);
        setField(term155810, term155810.getClass(), "parent", null);
        term155811 = newInstance(Class.forName("java.lang.CharacterDataLatin1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155505;
        Object retValue = callMethod(klass, "equals", argTypes, term155441, args);
        assertTrue(recursiveEquals(term155441, term155810));
        assertTrue(recursiveEquals(term155505, term155811));
        assertTrue(recursiveEquals(retValue, false));
    }

};


