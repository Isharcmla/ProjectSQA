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

public class RecordType_isSubtype_97399561171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13450;
     Object term13504;

    public RecordType_isSubtype_97399561171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term13490 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13450, term13450.getClass(), "properties", term13490);
        term13504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term13505 = newInstance(Class.forName("java.util.TreeMap"));
        Object term13506 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term13505, term13505.getClass(), "comparator", null);
        setField(term13505, term13505.getClass(), "root", null);
        setIntField(term13505, term13505.getClass(), "size", 0);
        setIntField(term13505, term13505.getClass(), "modCount", 0);
        setField(term13505, term13505.getClass(), "entrySet", null);
        setField(term13506, term13506.getClass(), "m", term13505);
        setField(term13505, term13505.getClass(), "navigableKeySet", term13506);
        setField(term13505, term13505.getClass(), "descendingMap", null);
        setField(term13505, term13505.getClass(), "keySet", null);
        setField(term13505, term13505.getClass(), "values", null);
        setField(term13504, term13504.getClass(), "properties", term13505);
        setBooleanField(term13504, term13504.getClass(), "isFrozen", false);
        setField(term13504, term13504.getClass(), "className", null);
        setField(term13504, term13504.getClass(), "properties", null);
        setBooleanField(term13504, term13504.getClass(), "nativeType", false);
        setField(term13504, term13504.getClass(), "implicitPrototypeFallback", null);
        setField(term13504, term13504.getClass(), "ownerFunction", null);
        setBooleanField(term13504, term13504.getClass(), "prettyPrint", false);
        setBooleanField(term13504, term13504.getClass(), "visited", false);
        setField(term13504, term13504.getClass(), "docInfo", null);
        setBooleanField(term13504, term13504.getClass(), "unknown", false);
        setBooleanField(term13504, term13504.getClass(), "resolved", false);
        setField(term13504, term13504.getClass(), "resolveResult", null);
        setField(term13504, term13504.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13450;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term13450, term13504));
        assertTrue(recursiveEquals(retValue, true));
    }

};


