package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class RecordType_isSubtype_1383543061191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61812;
     Object term61948;
     Object term63918;
     Object term63921;

    public RecordType_isSubtype_1383543061191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term61852 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term61812, term61812.getClass(), "properties", term61852);
        term61948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term61988 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term61948, term61948.getClass(), "unknown", false);
        setField(term61948, term61948.getClass(), "properties", term61988);
        term63918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term63919 = newInstance(Class.forName("java.util.TreeMap"));
        Object term63920 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term63919, term63919.getClass(), "comparator", null);
        setField(term63919, term63919.getClass(), "root", null);
        setIntField(term63919, term63919.getClass(), "size", 0);
        setIntField(term63919, term63919.getClass(), "modCount", 0);
        setField(term63919, term63919.getClass(), "entrySet", null);
        setField(term63920, term63920.getClass(), "m", term63919);
        setField(term63919, term63919.getClass(), "navigableKeySet", term63920);
        setField(term63919, term63919.getClass(), "descendingMap", null);
        setField(term63919, term63919.getClass(), "keySet", null);
        setField(term63919, term63919.getClass(), "values", null);
        setField(term63918, term63918.getClass(), "properties", term63919);
        setBooleanField(term63918, term63918.getClass(), "isFrozen", false);
        setField(term63918, term63918.getClass(), "className", null);
        setField(term63918, term63918.getClass(), "properties", null);
        setBooleanField(term63918, term63918.getClass(), "nativeType", false);
        setField(term63918, term63918.getClass(), "implicitPrototypeFallback", null);
        setField(term63918, term63918.getClass(), "ownerFunction", null);
        setBooleanField(term63918, term63918.getClass(), "prettyPrint", false);
        setBooleanField(term63918, term63918.getClass(), "visited", false);
        setField(term63918, term63918.getClass(), "docInfo", null);
        setBooleanField(term63918, term63918.getClass(), "unknown", false);
        setBooleanField(term63918, term63918.getClass(), "resolved", false);
        setField(term63918, term63918.getClass(), "resolveResult", null);
        setField(term63918, term63918.getClass(), "registry", null);
        term63921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term63922 = newInstance(Class.forName("java.util.TreeMap"));
        Object term63923 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term63922, term63922.getClass(), "comparator", null);
        setField(term63922, term63922.getClass(), "root", null);
        setIntField(term63922, term63922.getClass(), "size", 0);
        setIntField(term63922, term63922.getClass(), "modCount", 0);
        setField(term63922, term63922.getClass(), "entrySet", null);
        setField(term63923, term63923.getClass(), "m", term63922);
        setField(term63922, term63922.getClass(), "navigableKeySet", term63923);
        setField(term63922, term63922.getClass(), "descendingMap", null);
        setField(term63922, term63922.getClass(), "keySet", null);
        setField(term63922, term63922.getClass(), "values", null);
        setField(term63921, term63921.getClass(), "properties", term63922);
        setBooleanField(term63921, term63921.getClass(), "isFrozen", false);
        setField(term63921, term63921.getClass(), "className", null);
        setField(term63921, term63921.getClass(), "properties", null);
        setBooleanField(term63921, term63921.getClass(), "nativeType", false);
        setField(term63921, term63921.getClass(), "implicitPrototypeFallback", null);
        setField(term63921, term63921.getClass(), "ownerFunction", null);
        setBooleanField(term63921, term63921.getClass(), "prettyPrint", false);
        setBooleanField(term63921, term63921.getClass(), "visited", false);
        setField(term63921, term63921.getClass(), "docInfo", null);
        setBooleanField(term63921, term63921.getClass(), "unknown", false);
        setBooleanField(term63921, term63921.getClass(), "resolved", false);
        setField(term63921, term63921.getClass(), "resolveResult", null);
        setField(term63921, term63921.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term61948;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term61812, args);
        assertTrue(recursiveEquals(term61812, term63918));
        assertTrue(recursiveEquals(term61948, term63921));
        assertTrue(recursiveEquals(retValue, true));
    }

};


