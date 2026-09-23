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

public class RecordType_isSubtype_1383543061168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53047;
     Object term53183;
     Object term53260;
     Object term53263;

    public RecordType_isSubtype_1383543061168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term53087 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term53047, term53047.getClass(), "properties", term53087);
        term53183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term53223 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term53183, term53183.getClass(), "unknown", false);
        setField(term53183, term53183.getClass(), "properties", term53223);
        term53260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term53261 = newInstance(Class.forName("java.util.TreeMap"));
        Object term53262 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term53261, term53261.getClass(), "comparator", null);
        setField(term53261, term53261.getClass(), "root", null);
        setIntField(term53261, term53261.getClass(), "size", 0);
        setIntField(term53261, term53261.getClass(), "modCount", 0);
        setField(term53261, term53261.getClass(), "entrySet", null);
        setField(term53262, term53262.getClass(), "m", term53261);
        setField(term53261, term53261.getClass(), "navigableKeySet", term53262);
        setField(term53261, term53261.getClass(), "descendingMap", null);
        setField(term53261, term53261.getClass(), "keySet", null);
        setField(term53261, term53261.getClass(), "values", null);
        setField(term53260, term53260.getClass(), "properties", term53261);
        setBooleanField(term53260, term53260.getClass(), "isFrozen", false);
        setField(term53260, term53260.getClass(), "className", null);
        setField(term53260, term53260.getClass(), "properties", null);
        setBooleanField(term53260, term53260.getClass(), "nativeType", false);
        setField(term53260, term53260.getClass(), "implicitPrototypeFallback", null);
        setField(term53260, term53260.getClass(), "ownerFunction", null);
        setBooleanField(term53260, term53260.getClass(), "prettyPrint", false);
        setBooleanField(term53260, term53260.getClass(), "visited", false);
        setField(term53260, term53260.getClass(), "docInfo", null);
        setBooleanField(term53260, term53260.getClass(), "unknown", false);
        setBooleanField(term53260, term53260.getClass(), "resolved", false);
        setField(term53260, term53260.getClass(), "resolveResult", null);
        setField(term53260, term53260.getClass(), "registry", null);
        term53263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term53264 = newInstance(Class.forName("java.util.TreeMap"));
        Object term53265 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term53264, term53264.getClass(), "comparator", null);
        setField(term53264, term53264.getClass(), "root", null);
        setIntField(term53264, term53264.getClass(), "size", 0);
        setIntField(term53264, term53264.getClass(), "modCount", 0);
        setField(term53264, term53264.getClass(), "entrySet", null);
        setField(term53265, term53265.getClass(), "m", term53264);
        setField(term53264, term53264.getClass(), "navigableKeySet", term53265);
        setField(term53264, term53264.getClass(), "descendingMap", null);
        setField(term53264, term53264.getClass(), "keySet", null);
        setField(term53264, term53264.getClass(), "values", null);
        setField(term53263, term53263.getClass(), "properties", term53264);
        setBooleanField(term53263, term53263.getClass(), "isFrozen", false);
        setField(term53263, term53263.getClass(), "className", null);
        setField(term53263, term53263.getClass(), "properties", null);
        setBooleanField(term53263, term53263.getClass(), "nativeType", false);
        setField(term53263, term53263.getClass(), "implicitPrototypeFallback", null);
        setField(term53263, term53263.getClass(), "ownerFunction", null);
        setBooleanField(term53263, term53263.getClass(), "prettyPrint", false);
        setBooleanField(term53263, term53263.getClass(), "visited", false);
        setField(term53263, term53263.getClass(), "docInfo", null);
        setBooleanField(term53263, term53263.getClass(), "unknown", false);
        setBooleanField(term53263, term53263.getClass(), "resolved", false);
        setField(term53263, term53263.getClass(), "resolveResult", null);
        setField(term53263, term53263.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term53183;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term53047, args);
        assertTrue(recursiveEquals(term53047, term53260));
        assertTrue(recursiveEquals(term53183, term53263));
        assertTrue(recursiveEquals(retValue, true));
    }

};


