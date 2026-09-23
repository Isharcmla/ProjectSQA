package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;

public class CaseInsensitiveMap_convertKey_1052215896139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25504;
     Object term25590;
     Object term25653;
     Object term25654;

    public CaseInsensitiveMap_convertKey_1052215896139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25504 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term25590 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        term25653 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term25653, term25653.getClass(), "loadFactor", 0.0F);
        setIntField(term25653, term25653.getClass(), "size", 0);
        setField(term25653, term25653.getClass(), "data", null);
        setIntField(term25653, term25653.getClass(), "threshold", 0);
        setIntField(term25653, term25653.getClass(), "modCount", 0);
        setField(term25653, term25653.getClass(), "entrySet", null);
        setField(term25653, term25653.getClass(), "keySet", null);
        setField(term25653, term25653.getClass(), "values", null);
        setField(term25653, term25653.getClass(), "keySet", null);
        setField(term25653, term25653.getClass(), "values", null);
        term25654 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        setBooleanField(term25654, term25654.getClass(), "closeRequested", false);
        setLongField(term25654, term25654.getClass(), "pos", 0L);
        setLongField(term25654, term25654.getClass(), "rem", 0L);
        setLongField(term25654, term25654.getClass(), "size", 0L);
        setField(term25654, term25654.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25590;
        Object retValue = callMethod(klass, "convertKey", argTypes, term25504, args);
        assertTrue(recursiveEquals(term25504, term25653));
        assertTrue(recursiveEquals(term25590, term25654));
        assertTrue(recursiveEquals(retValue, "java.util.zip.zipfile$zipfileinputstream@205d72e1"));
    }

};


