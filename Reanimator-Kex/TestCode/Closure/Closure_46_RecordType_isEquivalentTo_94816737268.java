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

public class RecordType_isEquivalentTo_94816737268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12426;
     Object term12530;
     Object term12548;
     Object term12549;

    public RecordType_isEquivalentTo_94816737268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term12530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term12548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term12548, term12548.getClass(), "properties", null);
        setBooleanField(term12548, term12548.getClass(), "isFrozen", false);
        setField(term12548, term12548.getClass(), "className", null);
        setField(term12548, term12548.getClass(), "properties", null);
        setBooleanField(term12548, term12548.getClass(), "nativeType", false);
        setField(term12548, term12548.getClass(), "implicitPrototypeFallback", null);
        setField(term12548, term12548.getClass(), "ownerFunction", null);
        setBooleanField(term12548, term12548.getClass(), "prettyPrint", false);
        setBooleanField(term12548, term12548.getClass(), "visited", false);
        setField(term12548, term12548.getClass(), "docInfo", null);
        setBooleanField(term12548, term12548.getClass(), "unknown", false);
        setBooleanField(term12548, term12548.getClass(), "resolved", false);
        setField(term12548, term12548.getClass(), "resolveResult", null);
        setField(term12548, term12548.getClass(), "registry", null);
        term12549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term12549, term12549.getClass(), "call", null);
        setField(term12549, term12549.getClass(), "prototypeSlot", null);
        setField(term12549, term12549.getClass(), "kind", null);
        setField(term12549, term12549.getClass(), "typeOfThis", null);
        setField(term12549, term12549.getClass(), "source", null);
        setField(term12549, term12549.getClass(), "implementedInterfaces", null);
        setField(term12549, term12549.getClass(), "extendedInterfaces", null);
        setField(term12549, term12549.getClass(), "subTypes", null);
        setField(term12549, term12549.getClass(), "templateTypeName", null);
        setField(term12549, term12549.getClass(), "className", null);
        setField(term12549, term12549.getClass(), "properties", null);
        setBooleanField(term12549, term12549.getClass(), "nativeType", false);
        setField(term12549, term12549.getClass(), "implicitPrototypeFallback", null);
        setField(term12549, term12549.getClass(), "ownerFunction", null);
        setBooleanField(term12549, term12549.getClass(), "prettyPrint", false);
        setBooleanField(term12549, term12549.getClass(), "visited", false);
        setField(term12549, term12549.getClass(), "docInfo", null);
        setBooleanField(term12549, term12549.getClass(), "unknown", false);
        setBooleanField(term12549, term12549.getClass(), "resolved", false);
        setField(term12549, term12549.getClass(), "resolveResult", null);
        setField(term12549, term12549.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term12530;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term12426, args);
        assertTrue(recursiveEquals(term12426, term12548));
        assertTrue(recursiveEquals(term12530, term12549));
        assertTrue(recursiveEquals(retValue, false));
    }

};


