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

public class RecordType_isSubtype_1383543061128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32310;
     Object term32446;
     Object term32523;
     Object term32526;

    public RecordType_isSubtype_1383543061128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term32350 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term32310, term32310.getClass(), "properties", term32350);
        term32446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term32486 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term32446, term32446.getClass(), "unknown", false);
        setField(term32446, term32446.getClass(), "properties", term32486);
        term32523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term32524 = newInstance(Class.forName("java.util.TreeMap"));
        Object term32525 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term32524, term32524.getClass(), "comparator", null);
        setField(term32524, term32524.getClass(), "root", null);
        setIntField(term32524, term32524.getClass(), "size", 0);
        setIntField(term32524, term32524.getClass(), "modCount", 0);
        setField(term32524, term32524.getClass(), "entrySet", null);
        setField(term32525, term32525.getClass(), "m", term32524);
        setField(term32524, term32524.getClass(), "navigableKeySet", term32525);
        setField(term32524, term32524.getClass(), "descendingMap", null);
        setField(term32524, term32524.getClass(), "keySet", null);
        setField(term32524, term32524.getClass(), "values", null);
        setField(term32523, term32523.getClass(), "properties", term32524);
        setBooleanField(term32523, term32523.getClass(), "isFrozen", false);
        setField(term32523, term32523.getClass(), "className", null);
        setField(term32523, term32523.getClass(), "properties", null);
        setBooleanField(term32523, term32523.getClass(), "nativeType", false);
        setField(term32523, term32523.getClass(), "implicitPrototypeFallback", null);
        setField(term32523, term32523.getClass(), "ownerFunction", null);
        setBooleanField(term32523, term32523.getClass(), "prettyPrint", false);
        setBooleanField(term32523, term32523.getClass(), "visited", false);
        setField(term32523, term32523.getClass(), "docInfo", null);
        setBooleanField(term32523, term32523.getClass(), "unknown", false);
        setBooleanField(term32523, term32523.getClass(), "resolved", false);
        setField(term32523, term32523.getClass(), "resolveResult", null);
        setField(term32523, term32523.getClass(), "registry", null);
        term32526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term32527 = newInstance(Class.forName("java.util.TreeMap"));
        Object term32528 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term32527, term32527.getClass(), "comparator", null);
        setField(term32527, term32527.getClass(), "root", null);
        setIntField(term32527, term32527.getClass(), "size", 0);
        setIntField(term32527, term32527.getClass(), "modCount", 0);
        setField(term32527, term32527.getClass(), "entrySet", null);
        setField(term32528, term32528.getClass(), "m", term32527);
        setField(term32527, term32527.getClass(), "navigableKeySet", term32528);
        setField(term32527, term32527.getClass(), "descendingMap", null);
        setField(term32527, term32527.getClass(), "keySet", null);
        setField(term32527, term32527.getClass(), "values", null);
        setField(term32526, term32526.getClass(), "properties", term32527);
        setBooleanField(term32526, term32526.getClass(), "isFrozen", false);
        setField(term32526, term32526.getClass(), "className", null);
        setField(term32526, term32526.getClass(), "properties", null);
        setBooleanField(term32526, term32526.getClass(), "nativeType", false);
        setField(term32526, term32526.getClass(), "implicitPrototypeFallback", null);
        setField(term32526, term32526.getClass(), "ownerFunction", null);
        setBooleanField(term32526, term32526.getClass(), "prettyPrint", false);
        setBooleanField(term32526, term32526.getClass(), "visited", false);
        setField(term32526, term32526.getClass(), "docInfo", null);
        setBooleanField(term32526, term32526.getClass(), "unknown", false);
        setBooleanField(term32526, term32526.getClass(), "resolved", false);
        setField(term32526, term32526.getClass(), "resolveResult", null);
        setField(term32526, term32526.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term32446;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term32310, args);
        assertTrue(recursiveEquals(term32310, term32523));
        assertTrue(recursiveEquals(term32446, term32526));
        assertTrue(recursiveEquals(retValue, true));
    }

};


