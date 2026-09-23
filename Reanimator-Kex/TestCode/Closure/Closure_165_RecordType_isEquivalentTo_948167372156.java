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

public class RecordType_isEquivalentTo_948167372156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48433;
     Object term48569;
     Object term48639;
     Object term48642;

    public RecordType_isEquivalentTo_948167372156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term48473 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term48433, term48433.getClass(), "properties", term48473);
        term48569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term48609 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term48569, term48569.getClass(), "properties", term48609);
        term48639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term48640 = newInstance(Class.forName("java.util.TreeMap"));
        Object term48641 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term48640, term48640.getClass(), "comparator", null);
        setField(term48640, term48640.getClass(), "root", null);
        setIntField(term48640, term48640.getClass(), "size", 0);
        setIntField(term48640, term48640.getClass(), "modCount", 0);
        setField(term48640, term48640.getClass(), "entrySet", null);
        setField(term48641, term48641.getClass(), "m", term48640);
        setField(term48640, term48640.getClass(), "navigableKeySet", term48641);
        setField(term48640, term48640.getClass(), "descendingMap", null);
        setField(term48640, term48640.getClass(), "keySet", null);
        setField(term48640, term48640.getClass(), "values", null);
        setField(term48639, term48639.getClass(), "properties", term48640);
        setBooleanField(term48639, term48639.getClass(), "isFrozen", false);
        setField(term48639, term48639.getClass(), "className", null);
        setField(term48639, term48639.getClass(), "properties", null);
        setBooleanField(term48639, term48639.getClass(), "nativeType", false);
        setField(term48639, term48639.getClass(), "implicitPrototypeFallback", null);
        setField(term48639, term48639.getClass(), "ownerFunction", null);
        setBooleanField(term48639, term48639.getClass(), "prettyPrint", false);
        setBooleanField(term48639, term48639.getClass(), "visited", false);
        setField(term48639, term48639.getClass(), "docInfo", null);
        setBooleanField(term48639, term48639.getClass(), "unknown", false);
        setBooleanField(term48639, term48639.getClass(), "resolved", false);
        setField(term48639, term48639.getClass(), "resolveResult", null);
        setField(term48639, term48639.getClass(), "registry", null);
        term48642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term48643 = newInstance(Class.forName("java.util.TreeMap"));
        Object term48644 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term48643, term48643.getClass(), "comparator", null);
        setField(term48643, term48643.getClass(), "root", null);
        setIntField(term48643, term48643.getClass(), "size", 0);
        setIntField(term48643, term48643.getClass(), "modCount", 0);
        setField(term48643, term48643.getClass(), "entrySet", null);
        setField(term48644, term48644.getClass(), "m", term48643);
        setField(term48643, term48643.getClass(), "navigableKeySet", term48644);
        setField(term48643, term48643.getClass(), "descendingMap", null);
        setField(term48643, term48643.getClass(), "keySet", null);
        setField(term48643, term48643.getClass(), "values", null);
        setField(term48642, term48642.getClass(), "properties", term48643);
        setBooleanField(term48642, term48642.getClass(), "isFrozen", false);
        setField(term48642, term48642.getClass(), "className", null);
        setField(term48642, term48642.getClass(), "properties", null);
        setBooleanField(term48642, term48642.getClass(), "nativeType", false);
        setField(term48642, term48642.getClass(), "implicitPrototypeFallback", null);
        setField(term48642, term48642.getClass(), "ownerFunction", null);
        setBooleanField(term48642, term48642.getClass(), "prettyPrint", false);
        setBooleanField(term48642, term48642.getClass(), "visited", false);
        setField(term48642, term48642.getClass(), "docInfo", null);
        setBooleanField(term48642, term48642.getClass(), "unknown", false);
        setBooleanField(term48642, term48642.getClass(), "resolved", false);
        setField(term48642, term48642.getClass(), "resolveResult", null);
        setField(term48642, term48642.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term48569;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term48433, args);
        assertTrue(recursiveEquals(term48433, term48639));
        assertTrue(recursiveEquals(term48569, term48642));
        assertTrue(recursiveEquals(retValue, true));
    }

};


