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

public class RecordType_isEquivalentTo_94816737288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18122;
     Object term18270;
     Object term18331;
     Object term18333;

    public RecordType_isEquivalentTo_94816737288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term18162 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term18122, term18122.getClass(), "properties", term18162);
        term18270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term18331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term18332 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term18332, term18332.getClass(), "comparator", null);
        setField(term18332, term18332.getClass(), "root", null);
        setIntField(term18332, term18332.getClass(), "size", 0);
        setIntField(term18332, term18332.getClass(), "modCount", 0);
        setField(term18332, term18332.getClass(), "entrySet", null);
        setField(term18332, term18332.getClass(), "navigableKeySet", null);
        setField(term18332, term18332.getClass(), "descendingMap", null);
        setField(term18332, term18332.getClass(), "keySet", null);
        setField(term18332, term18332.getClass(), "values", null);
        setField(term18331, term18331.getClass(), "properties", term18332);
        setBooleanField(term18331, term18331.getClass(), "isFrozen", false);
        setField(term18331, term18331.getClass(), "className", null);
        setField(term18331, term18331.getClass(), "properties", null);
        setBooleanField(term18331, term18331.getClass(), "nativeType", false);
        setField(term18331, term18331.getClass(), "implicitPrototypeFallback", null);
        setField(term18331, term18331.getClass(), "ownerFunction", null);
        setBooleanField(term18331, term18331.getClass(), "prettyPrint", false);
        setBooleanField(term18331, term18331.getClass(), "visited", false);
        setField(term18331, term18331.getClass(), "docInfo", null);
        setBooleanField(term18331, term18331.getClass(), "unknown", false);
        setBooleanField(term18331, term18331.getClass(), "resolved", false);
        setField(term18331, term18331.getClass(), "resolveResult", null);
        setField(term18331, term18331.getClass(), "registry", null);
        term18333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term18333, term18333.getClass(), "this$0", null);
        setField(term18333, term18333.getClass(), "call", null);
        setField(term18333, term18333.getClass(), "prototypeSlot", null);
        setField(term18333, term18333.getClass(), "kind", null);
        setField(term18333, term18333.getClass(), "typeOfThis", null);
        setField(term18333, term18333.getClass(), "source", null);
        setField(term18333, term18333.getClass(), "implementedInterfaces", null);
        setField(term18333, term18333.getClass(), "extendedInterfaces", null);
        setField(term18333, term18333.getClass(), "subTypes", null);
        setField(term18333, term18333.getClass(), "templateTypeName", null);
        setField(term18333, term18333.getClass(), "className", null);
        setField(term18333, term18333.getClass(), "properties", null);
        setBooleanField(term18333, term18333.getClass(), "nativeType", false);
        setField(term18333, term18333.getClass(), "implicitPrototypeFallback", null);
        setField(term18333, term18333.getClass(), "ownerFunction", null);
        setBooleanField(term18333, term18333.getClass(), "prettyPrint", false);
        setBooleanField(term18333, term18333.getClass(), "visited", false);
        setField(term18333, term18333.getClass(), "docInfo", null);
        setBooleanField(term18333, term18333.getClass(), "unknown", false);
        setBooleanField(term18333, term18333.getClass(), "resolved", false);
        setField(term18333, term18333.getClass(), "resolveResult", null);
        setField(term18333, term18333.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term18270;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term18122, args);
        assertTrue(recursiveEquals(term18122, term18331));
        assertTrue(recursiveEquals(term18270, term18333));
        assertTrue(recursiveEquals(retValue, false));
    }

};


