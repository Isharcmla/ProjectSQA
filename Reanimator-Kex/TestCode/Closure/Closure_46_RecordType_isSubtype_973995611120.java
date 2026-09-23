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

public class RecordType_isSubtype_973995611120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30407;
     Object term30461;

    public RecordType_isSubtype_973995611120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term30447 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term30407, term30407.getClass(), "properties", term30447);
        term30461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term30462 = newInstance(Class.forName("java.util.TreeMap"));
        Object term30463 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term30462, term30462.getClass(), "comparator", null);
        setField(term30462, term30462.getClass(), "root", null);
        setIntField(term30462, term30462.getClass(), "size", 0);
        setIntField(term30462, term30462.getClass(), "modCount", 0);
        setField(term30462, term30462.getClass(), "entrySet", null);
        setField(term30463, term30463.getClass(), "m", term30462);
        setField(term30462, term30462.getClass(), "navigableKeySet", term30463);
        setField(term30462, term30462.getClass(), "descendingMap", null);
        setField(term30462, term30462.getClass(), "keySet", null);
        setField(term30462, term30462.getClass(), "values", null);
        setField(term30461, term30461.getClass(), "properties", term30462);
        setBooleanField(term30461, term30461.getClass(), "isFrozen", false);
        setField(term30461, term30461.getClass(), "className", null);
        setField(term30461, term30461.getClass(), "properties", null);
        setBooleanField(term30461, term30461.getClass(), "nativeType", false);
        setField(term30461, term30461.getClass(), "implicitPrototypeFallback", null);
        setField(term30461, term30461.getClass(), "ownerFunction", null);
        setBooleanField(term30461, term30461.getClass(), "prettyPrint", false);
        setBooleanField(term30461, term30461.getClass(), "visited", false);
        setField(term30461, term30461.getClass(), "docInfo", null);
        setBooleanField(term30461, term30461.getClass(), "unknown", false);
        setBooleanField(term30461, term30461.getClass(), "resolved", false);
        setField(term30461, term30461.getClass(), "resolveResult", null);
        setField(term30461, term30461.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30407;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term30407, term30461));
        assertTrue(recursiveEquals(retValue, true));
    }

};


