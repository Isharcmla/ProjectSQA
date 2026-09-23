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

public class RecordType_isSubtype_973995611109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29047;
     Object term29353;

    public RecordType_isSubtype_973995611109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29087 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29047, term29047.getClass(), "properties", term29087);
        term29353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29354 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29355 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29354, term29354.getClass(), "comparator", null);
        setField(term29354, term29354.getClass(), "root", null);
        setIntField(term29354, term29354.getClass(), "size", 0);
        setIntField(term29354, term29354.getClass(), "modCount", 0);
        setField(term29354, term29354.getClass(), "entrySet", null);
        setField(term29355, term29355.getClass(), "m", term29354);
        setField(term29354, term29354.getClass(), "navigableKeySet", term29355);
        setField(term29354, term29354.getClass(), "descendingMap", null);
        setField(term29354, term29354.getClass(), "keySet", null);
        setField(term29354, term29354.getClass(), "values", null);
        setField(term29353, term29353.getClass(), "properties", term29354);
        setBooleanField(term29353, term29353.getClass(), "isFrozen", false);
        setField(term29353, term29353.getClass(), "className", null);
        setField(term29353, term29353.getClass(), "properties", null);
        setBooleanField(term29353, term29353.getClass(), "nativeType", false);
        setField(term29353, term29353.getClass(), "implicitPrototypeFallback", null);
        setField(term29353, term29353.getClass(), "ownerFunction", null);
        setBooleanField(term29353, term29353.getClass(), "prettyPrint", false);
        setBooleanField(term29353, term29353.getClass(), "visited", false);
        setField(term29353, term29353.getClass(), "docInfo", null);
        setBooleanField(term29353, term29353.getClass(), "unknown", false);
        setBooleanField(term29353, term29353.getClass(), "resolved", false);
        setField(term29353, term29353.getClass(), "resolveResult", null);
        setField(term29353, term29353.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29047;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term29047, term29353));
        assertTrue(recursiveEquals(retValue, true));
    }

};


