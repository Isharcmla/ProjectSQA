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

public class RecordType_isEquivalentTo_948167372188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62128;
     Object term62264;
     Object term62334;
     Object term62337;

    public RecordType_isEquivalentTo_948167372188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term62168 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term62128, term62128.getClass(), "properties", term62168);
        term62264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term62304 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term62264, term62264.getClass(), "properties", term62304);
        term62334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term62335 = newInstance(Class.forName("java.util.TreeMap"));
        Object term62336 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term62335, term62335.getClass(), "comparator", null);
        setField(term62335, term62335.getClass(), "root", null);
        setIntField(term62335, term62335.getClass(), "size", 0);
        setIntField(term62335, term62335.getClass(), "modCount", 0);
        setField(term62335, term62335.getClass(), "entrySet", null);
        setField(term62336, term62336.getClass(), "m", term62335);
        setField(term62335, term62335.getClass(), "navigableKeySet", term62336);
        setField(term62335, term62335.getClass(), "descendingMap", null);
        setField(term62335, term62335.getClass(), "keySet", null);
        setField(term62335, term62335.getClass(), "values", null);
        setField(term62334, term62334.getClass(), "properties", term62335);
        setBooleanField(term62334, term62334.getClass(), "isFrozen", false);
        setField(term62334, term62334.getClass(), "className", null);
        setField(term62334, term62334.getClass(), "properties", null);
        setBooleanField(term62334, term62334.getClass(), "nativeType", false);
        setField(term62334, term62334.getClass(), "implicitPrototypeFallback", null);
        setField(term62334, term62334.getClass(), "ownerFunction", null);
        setBooleanField(term62334, term62334.getClass(), "prettyPrint", false);
        setBooleanField(term62334, term62334.getClass(), "visited", false);
        setField(term62334, term62334.getClass(), "docInfo", null);
        setBooleanField(term62334, term62334.getClass(), "unknown", false);
        setBooleanField(term62334, term62334.getClass(), "resolved", false);
        setField(term62334, term62334.getClass(), "resolveResult", null);
        setField(term62334, term62334.getClass(), "registry", null);
        term62337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term62338 = newInstance(Class.forName("java.util.TreeMap"));
        Object term62339 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term62338, term62338.getClass(), "comparator", null);
        setField(term62338, term62338.getClass(), "root", null);
        setIntField(term62338, term62338.getClass(), "size", 0);
        setIntField(term62338, term62338.getClass(), "modCount", 0);
        setField(term62338, term62338.getClass(), "entrySet", null);
        setField(term62339, term62339.getClass(), "m", term62338);
        setField(term62338, term62338.getClass(), "navigableKeySet", term62339);
        setField(term62338, term62338.getClass(), "descendingMap", null);
        setField(term62338, term62338.getClass(), "keySet", null);
        setField(term62338, term62338.getClass(), "values", null);
        setField(term62337, term62337.getClass(), "properties", term62338);
        setBooleanField(term62337, term62337.getClass(), "isFrozen", false);
        setField(term62337, term62337.getClass(), "className", null);
        setField(term62337, term62337.getClass(), "properties", null);
        setBooleanField(term62337, term62337.getClass(), "nativeType", false);
        setField(term62337, term62337.getClass(), "implicitPrototypeFallback", null);
        setField(term62337, term62337.getClass(), "ownerFunction", null);
        setBooleanField(term62337, term62337.getClass(), "prettyPrint", false);
        setBooleanField(term62337, term62337.getClass(), "visited", false);
        setField(term62337, term62337.getClass(), "docInfo", null);
        setBooleanField(term62337, term62337.getClass(), "unknown", false);
        setBooleanField(term62337, term62337.getClass(), "resolved", false);
        setField(term62337, term62337.getClass(), "resolveResult", null);
        setField(term62337, term62337.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term62264;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term62128, args);
        assertTrue(recursiveEquals(term62128, term62334));
        assertTrue(recursiveEquals(term62264, term62337));
        assertTrue(recursiveEquals(retValue, true));
    }

};


