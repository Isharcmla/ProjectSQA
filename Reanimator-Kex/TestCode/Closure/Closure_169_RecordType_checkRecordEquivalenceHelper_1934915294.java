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

public class RecordType_checkRecordEquivalenceHelper_1934915294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29500;
     Object term29636;
     Object term29707;
     Object term29710;

    public RecordType_checkRecordEquivalenceHelper_1934915294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29540 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29500, term29500.getClass(), "properties", term29540);
        term29636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29676 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29636, term29636.getClass(), "properties", term29676);
        term29707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29708 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29709 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29708, term29708.getClass(), "comparator", null);
        setField(term29708, term29708.getClass(), "root", null);
        setIntField(term29708, term29708.getClass(), "size", 0);
        setIntField(term29708, term29708.getClass(), "modCount", 0);
        setField(term29708, term29708.getClass(), "entrySet", null);
        setField(term29709, term29709.getClass(), "m", term29708);
        setField(term29708, term29708.getClass(), "navigableKeySet", term29709);
        setField(term29708, term29708.getClass(), "descendingMap", null);
        setField(term29708, term29708.getClass(), "keySet", null);
        setField(term29708, term29708.getClass(), "values", null);
        setField(term29707, term29707.getClass(), "properties", term29708);
        setBooleanField(term29707, term29707.getClass(), "declared", false);
        setBooleanField(term29707, term29707.getClass(), "isFrozen", false);
        setField(term29707, term29707.getClass(), "className", null);
        setField(term29707, term29707.getClass(), "properties", null);
        setBooleanField(term29707, term29707.getClass(), "nativeType", false);
        setField(term29707, term29707.getClass(), "implicitPrototypeFallback", null);
        setField(term29707, term29707.getClass(), "ownerFunction", null);
        setBooleanField(term29707, term29707.getClass(), "prettyPrint", false);
        setBooleanField(term29707, term29707.getClass(), "visited", false);
        setField(term29707, term29707.getClass(), "docInfo", null);
        setBooleanField(term29707, term29707.getClass(), "unknown", false);
        setBooleanField(term29707, term29707.getClass(), "resolved", false);
        setField(term29707, term29707.getClass(), "resolveResult", null);
        setBooleanField(term29707, term29707.getClass(), "inTemplatedCheckVisit", false);
        setField(term29707, term29707.getClass(), "registry", null);
        term29710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29711 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29712 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29711, term29711.getClass(), "comparator", null);
        setField(term29711, term29711.getClass(), "root", null);
        setIntField(term29711, term29711.getClass(), "size", 0);
        setIntField(term29711, term29711.getClass(), "modCount", 0);
        setField(term29711, term29711.getClass(), "entrySet", null);
        setField(term29712, term29712.getClass(), "m", term29711);
        setField(term29711, term29711.getClass(), "navigableKeySet", term29712);
        setField(term29711, term29711.getClass(), "descendingMap", null);
        setField(term29711, term29711.getClass(), "keySet", null);
        setField(term29711, term29711.getClass(), "values", null);
        setField(term29710, term29710.getClass(), "properties", term29711);
        setBooleanField(term29710, term29710.getClass(), "declared", false);
        setBooleanField(term29710, term29710.getClass(), "isFrozen", false);
        setField(term29710, term29710.getClass(), "className", null);
        setField(term29710, term29710.getClass(), "properties", null);
        setBooleanField(term29710, term29710.getClass(), "nativeType", false);
        setField(term29710, term29710.getClass(), "implicitPrototypeFallback", null);
        setField(term29710, term29710.getClass(), "ownerFunction", null);
        setBooleanField(term29710, term29710.getClass(), "prettyPrint", false);
        setBooleanField(term29710, term29710.getClass(), "visited", false);
        setField(term29710, term29710.getClass(), "docInfo", null);
        setBooleanField(term29710, term29710.getClass(), "unknown", false);
        setBooleanField(term29710, term29710.getClass(), "resolved", false);
        setField(term29710, term29710.getClass(), "resolveResult", null);
        setBooleanField(term29710, term29710.getClass(), "inTemplatedCheckVisit", false);
        setField(term29710, term29710.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29636;
        args[1] = false;
        Object retValue = callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term29500, args);
        assertTrue(recursiveEquals(term29500, term29707));
        assertTrue(recursiveEquals(term29636, term29710));
        assertTrue(recursiveEquals(retValue, true));
    }

};


