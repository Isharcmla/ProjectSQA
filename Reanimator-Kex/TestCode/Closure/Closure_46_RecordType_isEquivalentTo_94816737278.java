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

public class RecordType_isEquivalentTo_94816737278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14342;
     Object term14478;
     Object term14548;
     Object term14551;

    public RecordType_isEquivalentTo_94816737278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14382 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14342, term14342.getClass(), "properties", term14382);
        term14478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14518 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14478, term14478.getClass(), "properties", term14518);
        term14548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14549 = newInstance(Class.forName("java.util.TreeMap"));
        Object term14550 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14549, term14549.getClass(), "comparator", null);
        setField(term14549, term14549.getClass(), "root", null);
        setIntField(term14549, term14549.getClass(), "size", 0);
        setIntField(term14549, term14549.getClass(), "modCount", 0);
        setField(term14549, term14549.getClass(), "entrySet", null);
        setField(term14550, term14550.getClass(), "m", term14549);
        setField(term14549, term14549.getClass(), "navigableKeySet", term14550);
        setField(term14549, term14549.getClass(), "descendingMap", null);
        setField(term14549, term14549.getClass(), "keySet", null);
        setField(term14549, term14549.getClass(), "values", null);
        setField(term14548, term14548.getClass(), "properties", term14549);
        setBooleanField(term14548, term14548.getClass(), "isFrozen", false);
        setField(term14548, term14548.getClass(), "className", null);
        setField(term14548, term14548.getClass(), "properties", null);
        setBooleanField(term14548, term14548.getClass(), "nativeType", false);
        setField(term14548, term14548.getClass(), "implicitPrototypeFallback", null);
        setField(term14548, term14548.getClass(), "ownerFunction", null);
        setBooleanField(term14548, term14548.getClass(), "prettyPrint", false);
        setBooleanField(term14548, term14548.getClass(), "visited", false);
        setField(term14548, term14548.getClass(), "docInfo", null);
        setBooleanField(term14548, term14548.getClass(), "unknown", false);
        setBooleanField(term14548, term14548.getClass(), "resolved", false);
        setField(term14548, term14548.getClass(), "resolveResult", null);
        setField(term14548, term14548.getClass(), "registry", null);
        term14551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14552 = newInstance(Class.forName("java.util.TreeMap"));
        Object term14553 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14552, term14552.getClass(), "comparator", null);
        setField(term14552, term14552.getClass(), "root", null);
        setIntField(term14552, term14552.getClass(), "size", 0);
        setIntField(term14552, term14552.getClass(), "modCount", 0);
        setField(term14552, term14552.getClass(), "entrySet", null);
        setField(term14553, term14553.getClass(), "m", term14552);
        setField(term14552, term14552.getClass(), "navigableKeySet", term14553);
        setField(term14552, term14552.getClass(), "descendingMap", null);
        setField(term14552, term14552.getClass(), "keySet", null);
        setField(term14552, term14552.getClass(), "values", null);
        setField(term14551, term14551.getClass(), "properties", term14552);
        setBooleanField(term14551, term14551.getClass(), "isFrozen", false);
        setField(term14551, term14551.getClass(), "className", null);
        setField(term14551, term14551.getClass(), "properties", null);
        setBooleanField(term14551, term14551.getClass(), "nativeType", false);
        setField(term14551, term14551.getClass(), "implicitPrototypeFallback", null);
        setField(term14551, term14551.getClass(), "ownerFunction", null);
        setBooleanField(term14551, term14551.getClass(), "prettyPrint", false);
        setBooleanField(term14551, term14551.getClass(), "visited", false);
        setField(term14551, term14551.getClass(), "docInfo", null);
        setBooleanField(term14551, term14551.getClass(), "unknown", false);
        setBooleanField(term14551, term14551.getClass(), "resolved", false);
        setField(term14551, term14551.getClass(), "resolveResult", null);
        setField(term14551, term14551.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term14478;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term14342, args);
        assertTrue(recursiveEquals(term14342, term14548));
        assertTrue(recursiveEquals(term14478, term14551));
        assertTrue(recursiveEquals(retValue, true));
    }

};


