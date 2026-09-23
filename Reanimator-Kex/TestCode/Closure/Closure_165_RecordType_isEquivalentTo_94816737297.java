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

public class RecordType_isEquivalentTo_94816737297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24758;
     Object term24894;
     Object term24964;
     Object term24967;

    public RecordType_isEquivalentTo_94816737297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term24798 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term24758, term24758.getClass(), "properties", term24798);
        term24894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term24934 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term24894, term24894.getClass(), "properties", term24934);
        term24964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term24965 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24966 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term24965, term24965.getClass(), "comparator", null);
        setField(term24965, term24965.getClass(), "root", null);
        setIntField(term24965, term24965.getClass(), "size", 0);
        setIntField(term24965, term24965.getClass(), "modCount", 0);
        setField(term24965, term24965.getClass(), "entrySet", null);
        setField(term24966, term24966.getClass(), "m", term24965);
        setField(term24965, term24965.getClass(), "navigableKeySet", term24966);
        setField(term24965, term24965.getClass(), "descendingMap", null);
        setField(term24965, term24965.getClass(), "keySet", null);
        setField(term24965, term24965.getClass(), "values", null);
        setField(term24964, term24964.getClass(), "properties", term24965);
        setBooleanField(term24964, term24964.getClass(), "isFrozen", false);
        setField(term24964, term24964.getClass(), "className", null);
        setField(term24964, term24964.getClass(), "properties", null);
        setBooleanField(term24964, term24964.getClass(), "nativeType", false);
        setField(term24964, term24964.getClass(), "implicitPrototypeFallback", null);
        setField(term24964, term24964.getClass(), "ownerFunction", null);
        setBooleanField(term24964, term24964.getClass(), "prettyPrint", false);
        setBooleanField(term24964, term24964.getClass(), "visited", false);
        setField(term24964, term24964.getClass(), "docInfo", null);
        setBooleanField(term24964, term24964.getClass(), "unknown", false);
        setBooleanField(term24964, term24964.getClass(), "resolved", false);
        setField(term24964, term24964.getClass(), "resolveResult", null);
        setField(term24964, term24964.getClass(), "registry", null);
        term24967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term24968 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24969 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term24968, term24968.getClass(), "comparator", null);
        setField(term24968, term24968.getClass(), "root", null);
        setIntField(term24968, term24968.getClass(), "size", 0);
        setIntField(term24968, term24968.getClass(), "modCount", 0);
        setField(term24968, term24968.getClass(), "entrySet", null);
        setField(term24969, term24969.getClass(), "m", term24968);
        setField(term24968, term24968.getClass(), "navigableKeySet", term24969);
        setField(term24968, term24968.getClass(), "descendingMap", null);
        setField(term24968, term24968.getClass(), "keySet", null);
        setField(term24968, term24968.getClass(), "values", null);
        setField(term24967, term24967.getClass(), "properties", term24968);
        setBooleanField(term24967, term24967.getClass(), "isFrozen", false);
        setField(term24967, term24967.getClass(), "className", null);
        setField(term24967, term24967.getClass(), "properties", null);
        setBooleanField(term24967, term24967.getClass(), "nativeType", false);
        setField(term24967, term24967.getClass(), "implicitPrototypeFallback", null);
        setField(term24967, term24967.getClass(), "ownerFunction", null);
        setBooleanField(term24967, term24967.getClass(), "prettyPrint", false);
        setBooleanField(term24967, term24967.getClass(), "visited", false);
        setField(term24967, term24967.getClass(), "docInfo", null);
        setBooleanField(term24967, term24967.getClass(), "unknown", false);
        setBooleanField(term24967, term24967.getClass(), "resolved", false);
        setField(term24967, term24967.getClass(), "resolveResult", null);
        setField(term24967, term24967.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term24894;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term24758, args);
        assertTrue(recursiveEquals(term24758, term24964));
        assertTrue(recursiveEquals(term24894, term24967));
        assertTrue(recursiveEquals(retValue, true));
    }

};


