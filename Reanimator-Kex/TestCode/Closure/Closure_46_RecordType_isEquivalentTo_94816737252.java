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

public class RecordType_isEquivalentTo_94816737252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9626;
     Object term9736;
     Object term9754;
     Object term9755;

    public RecordType_isEquivalentTo_94816737252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term9736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term9754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term9754, term9754.getClass(), "properties", null);
        setBooleanField(term9754, term9754.getClass(), "isFrozen", false);
        setField(term9754, term9754.getClass(), "className", null);
        setField(term9754, term9754.getClass(), "properties", null);
        setBooleanField(term9754, term9754.getClass(), "nativeType", false);
        setField(term9754, term9754.getClass(), "implicitPrototypeFallback", null);
        setField(term9754, term9754.getClass(), "ownerFunction", null);
        setBooleanField(term9754, term9754.getClass(), "prettyPrint", false);
        setBooleanField(term9754, term9754.getClass(), "visited", false);
        setField(term9754, term9754.getClass(), "docInfo", null);
        setBooleanField(term9754, term9754.getClass(), "unknown", false);
        setBooleanField(term9754, term9754.getClass(), "resolved", false);
        setField(term9754, term9754.getClass(), "resolveResult", null);
        setField(term9754, term9754.getClass(), "registry", null);
        term9755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term9755, term9755.getClass(), "call", null);
        setField(term9755, term9755.getClass(), "prototypeSlot", null);
        setField(term9755, term9755.getClass(), "kind", null);
        setField(term9755, term9755.getClass(), "typeOfThis", null);
        setField(term9755, term9755.getClass(), "source", null);
        setField(term9755, term9755.getClass(), "implementedInterfaces", null);
        setField(term9755, term9755.getClass(), "extendedInterfaces", null);
        setField(term9755, term9755.getClass(), "subTypes", null);
        setField(term9755, term9755.getClass(), "templateTypeName", null);
        setField(term9755, term9755.getClass(), "className", null);
        setField(term9755, term9755.getClass(), "properties", null);
        setBooleanField(term9755, term9755.getClass(), "nativeType", false);
        setField(term9755, term9755.getClass(), "implicitPrototypeFallback", null);
        setField(term9755, term9755.getClass(), "ownerFunction", null);
        setBooleanField(term9755, term9755.getClass(), "prettyPrint", false);
        setBooleanField(term9755, term9755.getClass(), "visited", false);
        setField(term9755, term9755.getClass(), "docInfo", null);
        setBooleanField(term9755, term9755.getClass(), "unknown", false);
        setBooleanField(term9755, term9755.getClass(), "resolved", false);
        setField(term9755, term9755.getClass(), "resolveResult", null);
        setField(term9755, term9755.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term9736;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term9626, args);
        assertTrue(recursiveEquals(term9626, term9754));
        assertTrue(recursiveEquals(term9736, term9755));
        assertTrue(recursiveEquals(retValue, false));
    }

};


