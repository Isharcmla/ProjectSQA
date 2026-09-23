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

public class RecordType_isEquivalentTo_948167372119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32855;
     Object term32953;
     Object term33069;
     Object term33070;

    public RecordType_isEquivalentTo_948167372119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term32953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term33049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term32953, term32953.getClass(), "referencedType", term33049);
        term33069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term33069, term33069.getClass(), "properties", null);
        setBooleanField(term33069, term33069.getClass(), "isFrozen", false);
        setField(term33069, term33069.getClass(), "className", null);
        setField(term33069, term33069.getClass(), "properties", null);
        setBooleanField(term33069, term33069.getClass(), "nativeType", false);
        setField(term33069, term33069.getClass(), "implicitPrototypeFallback", null);
        setField(term33069, term33069.getClass(), "ownerFunction", null);
        setBooleanField(term33069, term33069.getClass(), "prettyPrint", false);
        setBooleanField(term33069, term33069.getClass(), "visited", false);
        setField(term33069, term33069.getClass(), "docInfo", null);
        setBooleanField(term33069, term33069.getClass(), "unknown", false);
        setBooleanField(term33069, term33069.getClass(), "resolved", false);
        setField(term33069, term33069.getClass(), "resolveResult", null);
        setField(term33069, term33069.getClass(), "registry", null);
        term33070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term33071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term33070, term33070.getClass(), "indexType", null);
        setBooleanField(term33071, term33071.getClass(), "resolved", false);
        setField(term33071, term33071.getClass(), "resolveResult", null);
        setField(term33071, term33071.getClass(), "registry", null);
        setField(term33070, term33070.getClass(), "referencedType", term33071);
        setField(term33070, term33070.getClass(), "referencedObjType", null);
        setBooleanField(term33070, term33070.getClass(), "visited", false);
        setField(term33070, term33070.getClass(), "docInfo", null);
        setBooleanField(term33070, term33070.getClass(), "unknown", false);
        setBooleanField(term33070, term33070.getClass(), "resolved", false);
        setField(term33070, term33070.getClass(), "resolveResult", null);
        setField(term33070, term33070.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term32953;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term32855, args);
        assertTrue(recursiveEquals(term32855, term33069));
        assertTrue(recursiveEquals(term32953, term33070));
        assertTrue(recursiveEquals(retValue, false));
    }

};


