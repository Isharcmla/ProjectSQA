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

public class ExtendedProperties_putAll_841024344818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4597907;
     Object term4598344;
     Object term4598347;

    public ExtendedProperties_putAll_841024344818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4597933 = new ArrayList();
        term4597907 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term4597907, term4597907.getClass(), "keysAsListed", term4597933);
        ArrayList term4598345 = new ArrayList();
        term4598344 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term4598344, term4598344.getClass(), "defaults", null);
        setField(term4598344, term4598344.getClass(), "file", null);
        setField(term4598344, term4598344.getClass(), "basePath", null);
        setField(term4598344, term4598344.getClass(), "fileSeparator", null);
        setBooleanField(term4598344, term4598344.getClass(), "isInitialized", false);
        setField(term4598344, term4598344.getClass(), "includePropertyName", null);
        setField(term4598344, term4598344.getClass(), "keysAsListed", term4598345);
        setField(term4598344, term4598344.getClass(), "table", null);
        setIntField(term4598344, term4598344.getClass(), "count", 0);
        setIntField(term4598344, term4598344.getClass(), "threshold", 0);
        setFloatField(term4598344, term4598344.getClass(), "loadFactor", 0.0F);
        setIntField(term4598344, term4598344.getClass(), "modCount", 0);
        setField(term4598344, term4598344.getClass(), "keySet", null);
        setField(term4598344, term4598344.getClass(), "entrySet", null);
        setField(term4598344, term4598344.getClass(), "values", null);
        ArrayList term4598348 = new ArrayList();
        term4598347 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term4598347, term4598347.getClass(), "defaults", null);
        setField(term4598347, term4598347.getClass(), "file", null);
        setField(term4598347, term4598347.getClass(), "basePath", null);
        setField(term4598347, term4598347.getClass(), "fileSeparator", null);
        setBooleanField(term4598347, term4598347.getClass(), "isInitialized", false);
        setField(term4598347, term4598347.getClass(), "includePropertyName", null);
        setField(term4598347, term4598347.getClass(), "keysAsListed", term4598348);
        setField(term4598347, term4598347.getClass(), "table", null);
        setIntField(term4598347, term4598347.getClass(), "count", 0);
        setIntField(term4598347, term4598347.getClass(), "threshold", 0);
        setFloatField(term4598347, term4598347.getClass(), "loadFactor", 0.0F);
        setIntField(term4598347, term4598347.getClass(), "modCount", 0);
        setField(term4598347, term4598347.getClass(), "keySet", null);
        setField(term4598347, term4598347.getClass(), "entrySet", null);
        setField(term4598347, term4598347.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4597907;
        callMethod(klass, "putAll", argTypes, term4597907, args);
        assertTrue(recursiveEquals(term4597907, term4598344));
        assertTrue(recursiveEquals(term4597907, term4598347));
    }

};


