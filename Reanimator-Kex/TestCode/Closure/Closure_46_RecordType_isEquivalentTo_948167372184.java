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

public class RecordType_isEquivalentTo_948167372184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61360;
     Object term61496;
     Object term61566;
     Object term61569;

    public RecordType_isEquivalentTo_948167372184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term61400 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term61360, term61360.getClass(), "properties", term61400);
        term61496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term61536 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term61496, term61496.getClass(), "properties", term61536);
        term61566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term61567 = newInstance(Class.forName("java.util.TreeMap"));
        Object term61568 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term61567, term61567.getClass(), "comparator", null);
        setField(term61567, term61567.getClass(), "root", null);
        setIntField(term61567, term61567.getClass(), "size", 0);
        setIntField(term61567, term61567.getClass(), "modCount", 0);
        setField(term61567, term61567.getClass(), "entrySet", null);
        setField(term61568, term61568.getClass(), "m", term61567);
        setField(term61567, term61567.getClass(), "navigableKeySet", term61568);
        setField(term61567, term61567.getClass(), "descendingMap", null);
        setField(term61567, term61567.getClass(), "keySet", null);
        setField(term61567, term61567.getClass(), "values", null);
        setField(term61566, term61566.getClass(), "properties", term61567);
        setBooleanField(term61566, term61566.getClass(), "isFrozen", false);
        setField(term61566, term61566.getClass(), "className", null);
        setField(term61566, term61566.getClass(), "properties", null);
        setBooleanField(term61566, term61566.getClass(), "nativeType", false);
        setField(term61566, term61566.getClass(), "implicitPrototypeFallback", null);
        setField(term61566, term61566.getClass(), "ownerFunction", null);
        setBooleanField(term61566, term61566.getClass(), "prettyPrint", false);
        setBooleanField(term61566, term61566.getClass(), "visited", false);
        setField(term61566, term61566.getClass(), "docInfo", null);
        setBooleanField(term61566, term61566.getClass(), "unknown", false);
        setBooleanField(term61566, term61566.getClass(), "resolved", false);
        setField(term61566, term61566.getClass(), "resolveResult", null);
        setField(term61566, term61566.getClass(), "registry", null);
        term61569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term61570 = newInstance(Class.forName("java.util.TreeMap"));
        Object term61571 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term61570, term61570.getClass(), "comparator", null);
        setField(term61570, term61570.getClass(), "root", null);
        setIntField(term61570, term61570.getClass(), "size", 0);
        setIntField(term61570, term61570.getClass(), "modCount", 0);
        setField(term61570, term61570.getClass(), "entrySet", null);
        setField(term61571, term61571.getClass(), "m", term61570);
        setField(term61570, term61570.getClass(), "navigableKeySet", term61571);
        setField(term61570, term61570.getClass(), "descendingMap", null);
        setField(term61570, term61570.getClass(), "keySet", null);
        setField(term61570, term61570.getClass(), "values", null);
        setField(term61569, term61569.getClass(), "properties", term61570);
        setBooleanField(term61569, term61569.getClass(), "isFrozen", false);
        setField(term61569, term61569.getClass(), "className", null);
        setField(term61569, term61569.getClass(), "properties", null);
        setBooleanField(term61569, term61569.getClass(), "nativeType", false);
        setField(term61569, term61569.getClass(), "implicitPrototypeFallback", null);
        setField(term61569, term61569.getClass(), "ownerFunction", null);
        setBooleanField(term61569, term61569.getClass(), "prettyPrint", false);
        setBooleanField(term61569, term61569.getClass(), "visited", false);
        setField(term61569, term61569.getClass(), "docInfo", null);
        setBooleanField(term61569, term61569.getClass(), "unknown", false);
        setBooleanField(term61569, term61569.getClass(), "resolved", false);
        setField(term61569, term61569.getClass(), "resolveResult", null);
        setField(term61569, term61569.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term61496;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term61360, args);
        assertTrue(recursiveEquals(term61360, term61566));
        assertTrue(recursiveEquals(term61496, term61569));
        assertTrue(recursiveEquals(retValue, true));
    }

};


