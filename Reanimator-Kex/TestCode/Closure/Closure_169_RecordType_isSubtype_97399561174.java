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

public class RecordType_isSubtype_97399561174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15969;
     Object term16281;

    public RecordType_isSubtype_97399561174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term16009 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15969, term15969.getClass(), "properties", term16009);
        term16281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term16282 = newInstance(Class.forName("java.util.TreeMap"));
        Object term16283 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term16282, term16282.getClass(), "comparator", null);
        setField(term16282, term16282.getClass(), "root", null);
        setIntField(term16282, term16282.getClass(), "size", 0);
        setIntField(term16282, term16282.getClass(), "modCount", 0);
        setField(term16282, term16282.getClass(), "entrySet", null);
        setField(term16283, term16283.getClass(), "m", term16282);
        setField(term16282, term16282.getClass(), "navigableKeySet", term16283);
        setField(term16282, term16282.getClass(), "descendingMap", null);
        setField(term16282, term16282.getClass(), "keySet", null);
        setField(term16282, term16282.getClass(), "values", null);
        setField(term16281, term16281.getClass(), "properties", term16282);
        setBooleanField(term16281, term16281.getClass(), "declared", false);
        setBooleanField(term16281, term16281.getClass(), "isFrozen", false);
        setField(term16281, term16281.getClass(), "className", null);
        setField(term16281, term16281.getClass(), "properties", null);
        setBooleanField(term16281, term16281.getClass(), "nativeType", false);
        setField(term16281, term16281.getClass(), "implicitPrototypeFallback", null);
        setField(term16281, term16281.getClass(), "ownerFunction", null);
        setBooleanField(term16281, term16281.getClass(), "prettyPrint", false);
        setBooleanField(term16281, term16281.getClass(), "visited", false);
        setField(term16281, term16281.getClass(), "docInfo", null);
        setBooleanField(term16281, term16281.getClass(), "unknown", false);
        setBooleanField(term16281, term16281.getClass(), "resolved", false);
        setField(term16281, term16281.getClass(), "resolveResult", null);
        setBooleanField(term16281, term16281.getClass(), "inTemplatedCheckVisit", false);
        setField(term16281, term16281.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15969;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term15969, term16281));
        assertTrue(recursiveEquals(retValue, true));
    }

};


