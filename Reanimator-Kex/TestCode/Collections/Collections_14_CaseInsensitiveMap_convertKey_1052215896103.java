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

public class CaseInsensitiveMap_convertKey_1052215896103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18187;
     Object term18273;
     Object term18336;
     Object term18337;

    public CaseInsensitiveMap_convertKey_1052215896103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18187 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term18273 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        term18336 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term18336, term18336.getClass(), "loadFactor", 0.0F);
        setIntField(term18336, term18336.getClass(), "size", 0);
        setField(term18336, term18336.getClass(), "data", null);
        setIntField(term18336, term18336.getClass(), "threshold", 0);
        setIntField(term18336, term18336.getClass(), "modCount", 0);
        setField(term18336, term18336.getClass(), "entrySet", null);
        setField(term18336, term18336.getClass(), "keySet", null);
        setField(term18336, term18336.getClass(), "values", null);
        setField(term18336, term18336.getClass(), "keySet", null);
        setField(term18336, term18336.getClass(), "values", null);
        term18337 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        setBooleanField(term18337, term18337.getClass(), "closeRequested", false);
        setLongField(term18337, term18337.getClass(), "pos", 0L);
        setLongField(term18337, term18337.getClass(), "rem", 0L);
        setLongField(term18337, term18337.getClass(), "size", 0L);
        setField(term18337, term18337.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18273;
        Object retValue = callMethod(klass, "convertKey", argTypes, term18187, args);
        assertTrue(recursiveEquals(term18187, term18336));
        assertTrue(recursiveEquals(term18273, term18337));
        assertTrue(recursiveEquals(retValue, "java.util.zip.zipfile$zipfileinputstream@4a36bb7b"));
    }

};


