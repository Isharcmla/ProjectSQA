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

public class RecordType_isEquivalentTo_948167372121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33324;
     Object term33276;
     Object term33369;
     Object term33370;

    public RecordType_isEquivalentTo_948167372121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term33276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term33276, term33276.getClass(), "referencedType", term33324);
        term33369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term33369, term33369.getClass(), "properties", null);
        setBooleanField(term33369, term33369.getClass(), "isFrozen", false);
        setField(term33369, term33369.getClass(), "className", null);
        setField(term33369, term33369.getClass(), "properties", null);
        setBooleanField(term33369, term33369.getClass(), "nativeType", false);
        setField(term33369, term33369.getClass(), "implicitPrototypeFallback", null);
        setField(term33369, term33369.getClass(), "ownerFunction", null);
        setBooleanField(term33369, term33369.getClass(), "prettyPrint", false);
        setBooleanField(term33369, term33369.getClass(), "visited", false);
        setField(term33369, term33369.getClass(), "docInfo", null);
        setBooleanField(term33369, term33369.getClass(), "unknown", false);
        setBooleanField(term33369, term33369.getClass(), "resolved", false);
        setField(term33369, term33369.getClass(), "resolveResult", null);
        setField(term33369, term33369.getClass(), "registry", null);
        term33370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term33371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term33370, term33370.getClass(), "indexType", null);
        setField(term33371, term33371.getClass(), "properties", null);
        setBooleanField(term33371, term33371.getClass(), "isFrozen", false);
        setField(term33371, term33371.getClass(), "className", null);
        setField(term33371, term33371.getClass(), "properties", null);
        setBooleanField(term33371, term33371.getClass(), "nativeType", false);
        setField(term33371, term33371.getClass(), "implicitPrototypeFallback", null);
        setField(term33371, term33371.getClass(), "ownerFunction", null);
        setBooleanField(term33371, term33371.getClass(), "prettyPrint", false);
        setBooleanField(term33371, term33371.getClass(), "visited", false);
        setField(term33371, term33371.getClass(), "docInfo", null);
        setBooleanField(term33371, term33371.getClass(), "unknown", false);
        setBooleanField(term33371, term33371.getClass(), "resolved", false);
        setField(term33371, term33371.getClass(), "resolveResult", null);
        setField(term33371, term33371.getClass(), "registry", null);
        setField(term33370, term33370.getClass(), "referencedType", term33371);
        setField(term33370, term33370.getClass(), "referencedObjType", null);
        setBooleanField(term33370, term33370.getClass(), "visited", false);
        setField(term33370, term33370.getClass(), "docInfo", null);
        setBooleanField(term33370, term33370.getClass(), "unknown", false);
        setBooleanField(term33370, term33370.getClass(), "resolved", false);
        setField(term33370, term33370.getClass(), "resolveResult", null);
        setField(term33370, term33370.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term33276;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term33324, args);
        assertTrue(recursiveEquals(term33324, term33369));
        assertTrue(recursiveEquals(term33276, term33370));
        assertTrue(recursiveEquals(retValue, true));
    }

};


