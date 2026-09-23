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

public class RecordType_isEquivalentTo_94816737275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14357;
     Object term14509;
     Object term14570;
     Object term14572;

    public RecordType_isEquivalentTo_94816737275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14397 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14357, term14357.getClass(), "properties", term14397);
        term14509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        term14570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14571 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14571, term14571.getClass(), "comparator", null);
        setField(term14571, term14571.getClass(), "root", null);
        setIntField(term14571, term14571.getClass(), "size", 0);
        setIntField(term14571, term14571.getClass(), "modCount", 0);
        setField(term14571, term14571.getClass(), "entrySet", null);
        setField(term14571, term14571.getClass(), "navigableKeySet", null);
        setField(term14571, term14571.getClass(), "descendingMap", null);
        setField(term14571, term14571.getClass(), "keySet", null);
        setField(term14571, term14571.getClass(), "values", null);
        setField(term14570, term14570.getClass(), "properties", term14571);
        setBooleanField(term14570, term14570.getClass(), "isFrozen", false);
        setField(term14570, term14570.getClass(), "className", null);
        setField(term14570, term14570.getClass(), "properties", null);
        setBooleanField(term14570, term14570.getClass(), "nativeType", false);
        setField(term14570, term14570.getClass(), "implicitPrototypeFallback", null);
        setField(term14570, term14570.getClass(), "ownerFunction", null);
        setBooleanField(term14570, term14570.getClass(), "prettyPrint", false);
        setBooleanField(term14570, term14570.getClass(), "visited", false);
        setField(term14570, term14570.getClass(), "docInfo", null);
        setBooleanField(term14570, term14570.getClass(), "unknown", false);
        setBooleanField(term14570, term14570.getClass(), "resolved", false);
        setField(term14570, term14570.getClass(), "resolveResult", null);
        setField(term14570, term14570.getClass(), "registry", null);
        term14572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term14572, term14572.getClass(), "constructor", null);
        setField(term14572, term14572.getClass(), "className", null);
        setField(term14572, term14572.getClass(), "properties", null);
        setBooleanField(term14572, term14572.getClass(), "nativeType", false);
        setField(term14572, term14572.getClass(), "implicitPrototypeFallback", null);
        setField(term14572, term14572.getClass(), "ownerFunction", null);
        setBooleanField(term14572, term14572.getClass(), "prettyPrint", false);
        setBooleanField(term14572, term14572.getClass(), "visited", false);
        setField(term14572, term14572.getClass(), "docInfo", null);
        setBooleanField(term14572, term14572.getClass(), "unknown", false);
        setBooleanField(term14572, term14572.getClass(), "resolved", false);
        setField(term14572, term14572.getClass(), "resolveResult", null);
        setField(term14572, term14572.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term14509;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term14357, args);
        assertTrue(recursiveEquals(term14357, term14570));
        assertTrue(recursiveEquals(term14509, term14572));
        assertTrue(recursiveEquals(retValue, false));
    }

};


