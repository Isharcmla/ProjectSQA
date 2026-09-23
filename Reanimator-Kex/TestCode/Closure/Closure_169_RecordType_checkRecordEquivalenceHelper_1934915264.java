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

public class RecordType_checkRecordEquivalenceHelper_1934915264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13952;
     Object term14088;
     Object term14159;
     Object term14162;

    public RecordType_checkRecordEquivalenceHelper_1934915264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term13992 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13952, term13952.getClass(), "properties", term13992);
        term14088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14128 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14088, term14088.getClass(), "properties", term14128);
        term14159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14160 = newInstance(Class.forName("java.util.TreeMap"));
        Object term14161 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14160, term14160.getClass(), "comparator", null);
        setField(term14160, term14160.getClass(), "root", null);
        setIntField(term14160, term14160.getClass(), "size", 0);
        setIntField(term14160, term14160.getClass(), "modCount", 0);
        setField(term14160, term14160.getClass(), "entrySet", null);
        setField(term14161, term14161.getClass(), "m", term14160);
        setField(term14160, term14160.getClass(), "navigableKeySet", term14161);
        setField(term14160, term14160.getClass(), "descendingMap", null);
        setField(term14160, term14160.getClass(), "keySet", null);
        setField(term14160, term14160.getClass(), "values", null);
        setField(term14159, term14159.getClass(), "properties", term14160);
        setBooleanField(term14159, term14159.getClass(), "declared", false);
        setBooleanField(term14159, term14159.getClass(), "isFrozen", false);
        setField(term14159, term14159.getClass(), "className", null);
        setField(term14159, term14159.getClass(), "properties", null);
        setBooleanField(term14159, term14159.getClass(), "nativeType", false);
        setField(term14159, term14159.getClass(), "implicitPrototypeFallback", null);
        setField(term14159, term14159.getClass(), "ownerFunction", null);
        setBooleanField(term14159, term14159.getClass(), "prettyPrint", false);
        setBooleanField(term14159, term14159.getClass(), "visited", false);
        setField(term14159, term14159.getClass(), "docInfo", null);
        setBooleanField(term14159, term14159.getClass(), "unknown", false);
        setBooleanField(term14159, term14159.getClass(), "resolved", false);
        setField(term14159, term14159.getClass(), "resolveResult", null);
        setBooleanField(term14159, term14159.getClass(), "inTemplatedCheckVisit", false);
        setField(term14159, term14159.getClass(), "registry", null);
        term14162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14163 = newInstance(Class.forName("java.util.TreeMap"));
        Object term14164 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14163, term14163.getClass(), "comparator", null);
        setField(term14163, term14163.getClass(), "root", null);
        setIntField(term14163, term14163.getClass(), "size", 0);
        setIntField(term14163, term14163.getClass(), "modCount", 0);
        setField(term14163, term14163.getClass(), "entrySet", null);
        setField(term14164, term14164.getClass(), "m", term14163);
        setField(term14163, term14163.getClass(), "navigableKeySet", term14164);
        setField(term14163, term14163.getClass(), "descendingMap", null);
        setField(term14163, term14163.getClass(), "keySet", null);
        setField(term14163, term14163.getClass(), "values", null);
        setField(term14162, term14162.getClass(), "properties", term14163);
        setBooleanField(term14162, term14162.getClass(), "declared", false);
        setBooleanField(term14162, term14162.getClass(), "isFrozen", false);
        setField(term14162, term14162.getClass(), "className", null);
        setField(term14162, term14162.getClass(), "properties", null);
        setBooleanField(term14162, term14162.getClass(), "nativeType", false);
        setField(term14162, term14162.getClass(), "implicitPrototypeFallback", null);
        setField(term14162, term14162.getClass(), "ownerFunction", null);
        setBooleanField(term14162, term14162.getClass(), "prettyPrint", false);
        setBooleanField(term14162, term14162.getClass(), "visited", false);
        setField(term14162, term14162.getClass(), "docInfo", null);
        setBooleanField(term14162, term14162.getClass(), "unknown", false);
        setBooleanField(term14162, term14162.getClass(), "resolved", false);
        setField(term14162, term14162.getClass(), "resolveResult", null);
        setBooleanField(term14162, term14162.getClass(), "inTemplatedCheckVisit", false);
        setField(term14162, term14162.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term14088;
        args[1] = false;
        Object retValue = callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term13952, args);
        assertTrue(recursiveEquals(term13952, term14159));
        assertTrue(recursiveEquals(term14088, term14162));
        assertTrue(recursiveEquals(retValue, true));
    }

};


