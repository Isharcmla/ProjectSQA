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

public class RecordType_isEquivalentTo_948167372200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65770;
     Object term65908;
     Object term66125;
     Object term66127;

    public RecordType_isEquivalentTo_948167372200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term65810 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term65770, term65770.getClass(), "properties", term65810);
        term65908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term66020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term65908, term65908.getClass(), "referencedType", term66020);
        term66125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term66126 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term66126, term66126.getClass(), "comparator", null);
        setField(term66126, term66126.getClass(), "root", null);
        setIntField(term66126, term66126.getClass(), "size", 0);
        setIntField(term66126, term66126.getClass(), "modCount", 0);
        setField(term66126, term66126.getClass(), "entrySet", null);
        setField(term66126, term66126.getClass(), "navigableKeySet", null);
        setField(term66126, term66126.getClass(), "descendingMap", null);
        setField(term66126, term66126.getClass(), "keySet", null);
        setField(term66126, term66126.getClass(), "values", null);
        setField(term66125, term66125.getClass(), "properties", term66126);
        setBooleanField(term66125, term66125.getClass(), "isFrozen", false);
        setField(term66125, term66125.getClass(), "className", null);
        setField(term66125, term66125.getClass(), "properties", null);
        setBooleanField(term66125, term66125.getClass(), "nativeType", false);
        setField(term66125, term66125.getClass(), "implicitPrototypeFallback", null);
        setField(term66125, term66125.getClass(), "ownerFunction", null);
        setBooleanField(term66125, term66125.getClass(), "prettyPrint", false);
        setBooleanField(term66125, term66125.getClass(), "visited", false);
        setField(term66125, term66125.getClass(), "docInfo", null);
        setBooleanField(term66125, term66125.getClass(), "unknown", false);
        setBooleanField(term66125, term66125.getClass(), "resolved", false);
        setField(term66125, term66125.getClass(), "resolveResult", null);
        setField(term66125, term66125.getClass(), "registry", null);
        term66127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term66128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term66127, term66127.getClass(), "indexType", null);
        setField(term66128, term66128.getClass(), "constructor", null);
        setField(term66128, term66128.getClass(), "className", null);
        setField(term66128, term66128.getClass(), "properties", null);
        setBooleanField(term66128, term66128.getClass(), "nativeType", false);
        setField(term66128, term66128.getClass(), "implicitPrototypeFallback", null);
        setField(term66128, term66128.getClass(), "ownerFunction", null);
        setBooleanField(term66128, term66128.getClass(), "prettyPrint", false);
        setBooleanField(term66128, term66128.getClass(), "visited", false);
        setField(term66128, term66128.getClass(), "docInfo", null);
        setBooleanField(term66128, term66128.getClass(), "unknown", false);
        setBooleanField(term66128, term66128.getClass(), "resolved", false);
        setField(term66128, term66128.getClass(), "resolveResult", null);
        setField(term66128, term66128.getClass(), "registry", null);
        setField(term66127, term66127.getClass(), "referencedType", term66128);
        setField(term66127, term66127.getClass(), "referencedObjType", null);
        setBooleanField(term66127, term66127.getClass(), "visited", false);
        setField(term66127, term66127.getClass(), "docInfo", null);
        setBooleanField(term66127, term66127.getClass(), "unknown", false);
        setBooleanField(term66127, term66127.getClass(), "resolved", false);
        setField(term66127, term66127.getClass(), "resolveResult", null);
        setField(term66127, term66127.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term65908;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term65770, args);
        assertTrue(recursiveEquals(term65770, term66125));
        assertTrue(recursiveEquals(term65908, term66127));
        assertTrue(recursiveEquals(retValue, false));
    }

};


