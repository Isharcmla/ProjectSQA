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

public class RecordType_isEquivalentTo_94816737277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14819;
     Object term14955;
     Object term15025;
     Object term15028;

    public RecordType_isEquivalentTo_94816737277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14859 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14819, term14819.getClass(), "properties", term14859);
        term14955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14995 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14955, term14955.getClass(), "properties", term14995);
        term15025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term15026 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15027 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15026, term15026.getClass(), "comparator", null);
        setField(term15026, term15026.getClass(), "root", null);
        setIntField(term15026, term15026.getClass(), "size", 0);
        setIntField(term15026, term15026.getClass(), "modCount", 0);
        setField(term15026, term15026.getClass(), "entrySet", null);
        setField(term15027, term15027.getClass(), "m", term15026);
        setField(term15026, term15026.getClass(), "navigableKeySet", term15027);
        setField(term15026, term15026.getClass(), "descendingMap", null);
        setField(term15026, term15026.getClass(), "keySet", null);
        setField(term15026, term15026.getClass(), "values", null);
        setField(term15025, term15025.getClass(), "properties", term15026);
        setBooleanField(term15025, term15025.getClass(), "isFrozen", false);
        setField(term15025, term15025.getClass(), "className", null);
        setField(term15025, term15025.getClass(), "properties", null);
        setBooleanField(term15025, term15025.getClass(), "nativeType", false);
        setField(term15025, term15025.getClass(), "implicitPrototypeFallback", null);
        setField(term15025, term15025.getClass(), "ownerFunction", null);
        setBooleanField(term15025, term15025.getClass(), "prettyPrint", false);
        setBooleanField(term15025, term15025.getClass(), "visited", false);
        setField(term15025, term15025.getClass(), "docInfo", null);
        setBooleanField(term15025, term15025.getClass(), "unknown", false);
        setBooleanField(term15025, term15025.getClass(), "resolved", false);
        setField(term15025, term15025.getClass(), "resolveResult", null);
        setField(term15025, term15025.getClass(), "registry", null);
        term15028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term15029 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15030 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15029, term15029.getClass(), "comparator", null);
        setField(term15029, term15029.getClass(), "root", null);
        setIntField(term15029, term15029.getClass(), "size", 0);
        setIntField(term15029, term15029.getClass(), "modCount", 0);
        setField(term15029, term15029.getClass(), "entrySet", null);
        setField(term15030, term15030.getClass(), "m", term15029);
        setField(term15029, term15029.getClass(), "navigableKeySet", term15030);
        setField(term15029, term15029.getClass(), "descendingMap", null);
        setField(term15029, term15029.getClass(), "keySet", null);
        setField(term15029, term15029.getClass(), "values", null);
        setField(term15028, term15028.getClass(), "properties", term15029);
        setBooleanField(term15028, term15028.getClass(), "isFrozen", false);
        setField(term15028, term15028.getClass(), "className", null);
        setField(term15028, term15028.getClass(), "properties", null);
        setBooleanField(term15028, term15028.getClass(), "nativeType", false);
        setField(term15028, term15028.getClass(), "implicitPrototypeFallback", null);
        setField(term15028, term15028.getClass(), "ownerFunction", null);
        setBooleanField(term15028, term15028.getClass(), "prettyPrint", false);
        setBooleanField(term15028, term15028.getClass(), "visited", false);
        setField(term15028, term15028.getClass(), "docInfo", null);
        setBooleanField(term15028, term15028.getClass(), "unknown", false);
        setBooleanField(term15028, term15028.getClass(), "resolved", false);
        setField(term15028, term15028.getClass(), "resolveResult", null);
        setField(term15028, term15028.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term14955;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term14819, args);
        assertTrue(recursiveEquals(term14819, term15025));
        assertTrue(recursiveEquals(term14955, term15028));
        assertTrue(recursiveEquals(retValue, true));
    }

};


