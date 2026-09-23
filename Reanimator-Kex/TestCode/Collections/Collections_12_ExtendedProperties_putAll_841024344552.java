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

public class ExtendedProperties_putAll_841024344552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437891;
     Object term437944;
     Object term437947;

    public ExtendedProperties_putAll_841024344552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term437917 = new ArrayList();
        term437891 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term437891, term437891.getClass(), "keysAsListed", term437917);
        ArrayList term437945 = new ArrayList();
        term437944 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term437944, term437944.getClass(), "defaults", null);
        setField(term437944, term437944.getClass(), "file", null);
        setField(term437944, term437944.getClass(), "basePath", null);
        setField(term437944, term437944.getClass(), "fileSeparator", null);
        setBooleanField(term437944, term437944.getClass(), "isInitialized", false);
        setField(term437944, term437944.getClass(), "includePropertyName", null);
        setField(term437944, term437944.getClass(), "keysAsListed", term437945);
        setField(term437944, term437944.getClass(), "table", null);
        setIntField(term437944, term437944.getClass(), "count", 0);
        setIntField(term437944, term437944.getClass(), "threshold", 0);
        setFloatField(term437944, term437944.getClass(), "loadFactor", 0.0F);
        setIntField(term437944, term437944.getClass(), "modCount", 0);
        setField(term437944, term437944.getClass(), "keySet", null);
        setField(term437944, term437944.getClass(), "entrySet", null);
        setField(term437944, term437944.getClass(), "values", null);
        ArrayList term437948 = new ArrayList();
        term437947 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term437947, term437947.getClass(), "defaults", null);
        setField(term437947, term437947.getClass(), "file", null);
        setField(term437947, term437947.getClass(), "basePath", null);
        setField(term437947, term437947.getClass(), "fileSeparator", null);
        setBooleanField(term437947, term437947.getClass(), "isInitialized", false);
        setField(term437947, term437947.getClass(), "includePropertyName", null);
        setField(term437947, term437947.getClass(), "keysAsListed", term437948);
        setField(term437947, term437947.getClass(), "table", null);
        setIntField(term437947, term437947.getClass(), "count", 0);
        setIntField(term437947, term437947.getClass(), "threshold", 0);
        setFloatField(term437947, term437947.getClass(), "loadFactor", 0.0F);
        setIntField(term437947, term437947.getClass(), "modCount", 0);
        setField(term437947, term437947.getClass(), "keySet", null);
        setField(term437947, term437947.getClass(), "entrySet", null);
        setField(term437947, term437947.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term437891;
        callMethod(klass, "putAll", argTypes, term437891, args);
        assertTrue(recursiveEquals(term437891, term437944));
        assertTrue(recursiveEquals(term437891, term437947));
    }

};


