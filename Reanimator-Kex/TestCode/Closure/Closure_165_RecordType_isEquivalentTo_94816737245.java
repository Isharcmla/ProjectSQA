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

public class RecordType_isEquivalentTo_94816737245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6970;
     Object term7074;
     Object term7092;
     Object term7093;

    public RecordType_isEquivalentTo_94816737245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term7074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term7092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term7092, term7092.getClass(), "properties", null);
        setBooleanField(term7092, term7092.getClass(), "isFrozen", false);
        setField(term7092, term7092.getClass(), "className", null);
        setField(term7092, term7092.getClass(), "properties", null);
        setBooleanField(term7092, term7092.getClass(), "nativeType", false);
        setField(term7092, term7092.getClass(), "implicitPrototypeFallback", null);
        setField(term7092, term7092.getClass(), "ownerFunction", null);
        setBooleanField(term7092, term7092.getClass(), "prettyPrint", false);
        setBooleanField(term7092, term7092.getClass(), "visited", false);
        setField(term7092, term7092.getClass(), "docInfo", null);
        setBooleanField(term7092, term7092.getClass(), "unknown", false);
        setBooleanField(term7092, term7092.getClass(), "resolved", false);
        setField(term7092, term7092.getClass(), "resolveResult", null);
        setField(term7092, term7092.getClass(), "registry", null);
        term7093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term7093, term7093.getClass(), "call", null);
        setField(term7093, term7093.getClass(), "prototypeSlot", null);
        setField(term7093, term7093.getClass(), "kind", null);
        setField(term7093, term7093.getClass(), "typeOfThis", null);
        setField(term7093, term7093.getClass(), "source", null);
        setField(term7093, term7093.getClass(), "implementedInterfaces", null);
        setField(term7093, term7093.getClass(), "extendedInterfaces", null);
        setField(term7093, term7093.getClass(), "subTypes", null);
        setField(term7093, term7093.getClass(), "templateTypeName", null);
        setField(term7093, term7093.getClass(), "className", null);
        setField(term7093, term7093.getClass(), "properties", null);
        setBooleanField(term7093, term7093.getClass(), "nativeType", false);
        setField(term7093, term7093.getClass(), "implicitPrototypeFallback", null);
        setField(term7093, term7093.getClass(), "ownerFunction", null);
        setBooleanField(term7093, term7093.getClass(), "prettyPrint", false);
        setBooleanField(term7093, term7093.getClass(), "visited", false);
        setField(term7093, term7093.getClass(), "docInfo", null);
        setBooleanField(term7093, term7093.getClass(), "unknown", false);
        setBooleanField(term7093, term7093.getClass(), "resolved", false);
        setField(term7093, term7093.getClass(), "resolveResult", null);
        setField(term7093, term7093.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term7074;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term6970, args);
        assertTrue(recursiveEquals(term6970, term7092));
        assertTrue(recursiveEquals(term7074, term7093));
        assertTrue(recursiveEquals(retValue, false));
    }

};


