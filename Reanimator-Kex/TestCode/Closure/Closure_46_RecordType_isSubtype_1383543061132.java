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

public class RecordType_isSubtype_1383543061132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34787;
     Object term34925;
     Object term34986;
     Object term34988;

    public RecordType_isSubtype_1383543061132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term34827 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term34787, term34787.getClass(), "properties", term34827);
        term34925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term34925, term34925.getClass(), "unknown", false);
        term34986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term34987 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term34987, term34987.getClass(), "comparator", null);
        setField(term34987, term34987.getClass(), "root", null);
        setIntField(term34987, term34987.getClass(), "size", 0);
        setIntField(term34987, term34987.getClass(), "modCount", 0);
        setField(term34987, term34987.getClass(), "entrySet", null);
        setField(term34987, term34987.getClass(), "navigableKeySet", null);
        setField(term34987, term34987.getClass(), "descendingMap", null);
        setField(term34987, term34987.getClass(), "keySet", null);
        setField(term34987, term34987.getClass(), "values", null);
        setField(term34986, term34986.getClass(), "properties", term34987);
        setBooleanField(term34986, term34986.getClass(), "isFrozen", false);
        setField(term34986, term34986.getClass(), "className", null);
        setField(term34986, term34986.getClass(), "properties", null);
        setBooleanField(term34986, term34986.getClass(), "nativeType", false);
        setField(term34986, term34986.getClass(), "implicitPrototypeFallback", null);
        setField(term34986, term34986.getClass(), "ownerFunction", null);
        setBooleanField(term34986, term34986.getClass(), "prettyPrint", false);
        setBooleanField(term34986, term34986.getClass(), "visited", false);
        setField(term34986, term34986.getClass(), "docInfo", null);
        setBooleanField(term34986, term34986.getClass(), "unknown", false);
        setBooleanField(term34986, term34986.getClass(), "resolved", false);
        setField(term34986, term34986.getClass(), "resolveResult", null);
        setField(term34986, term34986.getClass(), "registry", null);
        term34988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term34988, term34988.getClass(), "isChecked", false);
        setBooleanField(term34988, term34988.getClass(), "visited", false);
        setField(term34988, term34988.getClass(), "docInfo", null);
        setBooleanField(term34988, term34988.getClass(), "unknown", false);
        setBooleanField(term34988, term34988.getClass(), "resolved", false);
        setField(term34988, term34988.getClass(), "resolveResult", null);
        setField(term34988, term34988.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term34925;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term34787, args);
        assertTrue(recursiveEquals(term34787, term34986));
        assertTrue(recursiveEquals(term34925, term34988));
        assertTrue(recursiveEquals(retValue, true));
    }

};


