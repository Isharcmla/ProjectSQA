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

public class ExtendedProperties_putAll_841024344695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318871;
     Object term319177;
     Object term319180;

    public ExtendedProperties_putAll_841024344695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318897 = new ArrayList();
        term318871 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term318871, term318871.getClass(), "keysAsListed", term318897);
        ArrayList term319178 = new ArrayList();
        term319177 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term319177, term319177.getClass(), "defaults", null);
        setField(term319177, term319177.getClass(), "file", null);
        setField(term319177, term319177.getClass(), "basePath", null);
        setField(term319177, term319177.getClass(), "fileSeparator", null);
        setBooleanField(term319177, term319177.getClass(), "isInitialized", false);
        setField(term319177, term319177.getClass(), "includePropertyName", null);
        setField(term319177, term319177.getClass(), "keysAsListed", term319178);
        setField(term319177, term319177.getClass(), "table", null);
        setIntField(term319177, term319177.getClass(), "count", 0);
        setIntField(term319177, term319177.getClass(), "threshold", 0);
        setFloatField(term319177, term319177.getClass(), "loadFactor", 0.0F);
        setIntField(term319177, term319177.getClass(), "modCount", 0);
        setField(term319177, term319177.getClass(), "keySet", null);
        setField(term319177, term319177.getClass(), "entrySet", null);
        setField(term319177, term319177.getClass(), "values", null);
        ArrayList term319181 = new ArrayList();
        term319180 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term319180, term319180.getClass(), "defaults", null);
        setField(term319180, term319180.getClass(), "file", null);
        setField(term319180, term319180.getClass(), "basePath", null);
        setField(term319180, term319180.getClass(), "fileSeparator", null);
        setBooleanField(term319180, term319180.getClass(), "isInitialized", false);
        setField(term319180, term319180.getClass(), "includePropertyName", null);
        setField(term319180, term319180.getClass(), "keysAsListed", term319181);
        setField(term319180, term319180.getClass(), "table", null);
        setIntField(term319180, term319180.getClass(), "count", 0);
        setIntField(term319180, term319180.getClass(), "threshold", 0);
        setFloatField(term319180, term319180.getClass(), "loadFactor", 0.0F);
        setIntField(term319180, term319180.getClass(), "modCount", 0);
        setField(term319180, term319180.getClass(), "keySet", null);
        setField(term319180, term319180.getClass(), "entrySet", null);
        setField(term319180, term319180.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term318871;
        callMethod(klass, "putAll", argTypes, term318871, args);
        assertTrue(recursiveEquals(term318871, term319177));
        assertTrue(recursiveEquals(term318871, term319180));
    }

};


