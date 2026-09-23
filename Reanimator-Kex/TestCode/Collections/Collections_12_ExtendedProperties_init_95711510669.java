package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_init_95711510669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31530;

    public ExtendedProperties_init_95711510669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31533 = new ArrayList();
        term31530 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term31535 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term31530, term31530.getClass(), "defaults", null);
        setField(term31530, term31530.getClass(), "file", null);
        setField(term31530, term31530.getClass(), "basePath", null);
        setField(term31530, term31530.getClass(), "fileSeparator", "/");
        setBooleanField(term31530, term31530.getClass(), "isInitialized", false);
        setField(term31530, term31530.getClass(), "includePropertyName", null);
        setField(term31530, term31530.getClass(), "keysAsListed", term31533);
        setField(term31530, term31530.getClass(), "table", term31535);
        setIntField(term31530, term31530.getClass(), "count", 0);
        setIntField(term31530, term31530.getClass(), "threshold", 8);
        setFloatField(term31530, term31530.getClass(), "loadFactor", 0.75F);
        setIntField(term31530, term31530.getClass(), "modCount", 0);
        setField(term31530, term31530.getClass(), "keySet", null);
        setField(term31530, term31530.getClass(), "entrySet", null);
        setField(term31530, term31530.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31530));
    }

};


