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

public class RecordType_isEquivalentTo_94816737274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13346;
     Object term13446;
     Object term13464;
     Object term13465;

    public RecordType_isEquivalentTo_94816737274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term13446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term13464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term13464, term13464.getClass(), "properties", null);
        setBooleanField(term13464, term13464.getClass(), "isFrozen", false);
        setField(term13464, term13464.getClass(), "className", null);
        setField(term13464, term13464.getClass(), "properties", null);
        setBooleanField(term13464, term13464.getClass(), "nativeType", false);
        setField(term13464, term13464.getClass(), "implicitPrototypeFallback", null);
        setField(term13464, term13464.getClass(), "ownerFunction", null);
        setBooleanField(term13464, term13464.getClass(), "prettyPrint", false);
        setBooleanField(term13464, term13464.getClass(), "visited", false);
        setField(term13464, term13464.getClass(), "docInfo", null);
        setBooleanField(term13464, term13464.getClass(), "unknown", false);
        setBooleanField(term13464, term13464.getClass(), "resolved", false);
        setField(term13464, term13464.getClass(), "resolveResult", null);
        setField(term13464, term13464.getClass(), "registry", null);
        term13465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term13465, term13465.getClass(), "call", null);
        setField(term13465, term13465.getClass(), "prototypeSlot", null);
        setField(term13465, term13465.getClass(), "kind", null);
        setField(term13465, term13465.getClass(), "typeOfThis", null);
        setField(term13465, term13465.getClass(), "source", null);
        setField(term13465, term13465.getClass(), "implementedInterfaces", null);
        setField(term13465, term13465.getClass(), "extendedInterfaces", null);
        setField(term13465, term13465.getClass(), "subTypes", null);
        setField(term13465, term13465.getClass(), "templateTypeName", null);
        setField(term13465, term13465.getClass(), "className", null);
        setField(term13465, term13465.getClass(), "properties", null);
        setBooleanField(term13465, term13465.getClass(), "nativeType", false);
        setField(term13465, term13465.getClass(), "implicitPrototypeFallback", null);
        setField(term13465, term13465.getClass(), "ownerFunction", null);
        setBooleanField(term13465, term13465.getClass(), "prettyPrint", false);
        setBooleanField(term13465, term13465.getClass(), "visited", false);
        setField(term13465, term13465.getClass(), "docInfo", null);
        setBooleanField(term13465, term13465.getClass(), "unknown", false);
        setBooleanField(term13465, term13465.getClass(), "resolved", false);
        setField(term13465, term13465.getClass(), "resolveResult", null);
        setField(term13465, term13465.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term13446;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term13346, args);
        assertTrue(recursiveEquals(term13346, term13464));
        assertTrue(recursiveEquals(term13446, term13465));
        assertTrue(recursiveEquals(retValue, false));
    }

};


