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

public class FunctionType_getTypeOfThis_433401205231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237743;
     Object term237867;
     Object term237853;

    public FunctionType_getTypeOfThis_433401205231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term237843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term237743, term237743.getClass(), "typeOfThis", term237843);
        term237867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term237868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term237867, term237867.getClass(), "call", null);
        setField(term237867, term237867.getClass(), "prototypeSlot", null);
        setField(term237867, term237867.getClass(), "kind", null);
        setField(term237867, term237867.getClass(), "propAccess", null);
        setField(term237868, term237868.getClass(), "call", null);
        setField(term237868, term237868.getClass(), "prototypeSlot", null);
        setField(term237868, term237868.getClass(), "kind", null);
        setField(term237868, term237868.getClass(), "propAccess", null);
        setField(term237868, term237868.getClass(), "typeOfThis", null);
        setField(term237868, term237868.getClass(), "source", null);
        setField(term237868, term237868.getClass(), "implementedInterfaces", null);
        setField(term237868, term237868.getClass(), "extendedInterfaces", null);
        setField(term237868, term237868.getClass(), "subTypes", null);
        setField(term237868, term237868.getClass(), "templateTypeNames", null);
        setField(term237868, term237868.getClass(), "className", null);
        setField(term237868, term237868.getClass(), "properties", null);
        setBooleanField(term237868, term237868.getClass(), "nativeType", false);
        setField(term237868, term237868.getClass(), "implicitPrototypeFallback", null);
        setField(term237868, term237868.getClass(), "ownerFunction", null);
        setBooleanField(term237868, term237868.getClass(), "prettyPrint", false);
        setBooleanField(term237868, term237868.getClass(), "visited", false);
        setField(term237868, term237868.getClass(), "docInfo", null);
        setBooleanField(term237868, term237868.getClass(), "unknown", false);
        setBooleanField(term237868, term237868.getClass(), "resolved", false);
        setField(term237868, term237868.getClass(), "resolveResult", null);
        setBooleanField(term237868, term237868.getClass(), "inTemplatedCheckVisit", false);
        setField(term237868, term237868.getClass(), "registry", null);
        setField(term237867, term237867.getClass(), "typeOfThis", term237868);
        setField(term237867, term237867.getClass(), "source", null);
        setField(term237867, term237867.getClass(), "implementedInterfaces", null);
        setField(term237867, term237867.getClass(), "extendedInterfaces", null);
        setField(term237867, term237867.getClass(), "subTypes", null);
        setField(term237867, term237867.getClass(), "templateTypeNames", null);
        setField(term237867, term237867.getClass(), "className", null);
        setField(term237867, term237867.getClass(), "properties", null);
        setBooleanField(term237867, term237867.getClass(), "nativeType", false);
        setField(term237867, term237867.getClass(), "implicitPrototypeFallback", null);
        setField(term237867, term237867.getClass(), "ownerFunction", null);
        setBooleanField(term237867, term237867.getClass(), "prettyPrint", false);
        setBooleanField(term237867, term237867.getClass(), "visited", false);
        setField(term237867, term237867.getClass(), "docInfo", null);
        setBooleanField(term237867, term237867.getClass(), "unknown", false);
        setBooleanField(term237867, term237867.getClass(), "resolved", false);
        setField(term237867, term237867.getClass(), "resolveResult", null);
        setBooleanField(term237867, term237867.getClass(), "inTemplatedCheckVisit", false);
        setField(term237867, term237867.getClass(), "registry", null);
        term237853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term237853, term237853.getClass(), "call", null);
        setField(term237853, term237853.getClass(), "prototypeSlot", null);
        setField(term237853, term237853.getClass(), "kind", null);
        setField(term237853, term237853.getClass(), "propAccess", null);
        setField(term237853, term237853.getClass(), "typeOfThis", null);
        setField(term237853, term237853.getClass(), "source", null);
        setField(term237853, term237853.getClass(), "implementedInterfaces", null);
        setField(term237853, term237853.getClass(), "extendedInterfaces", null);
        setField(term237853, term237853.getClass(), "subTypes", null);
        setField(term237853, term237853.getClass(), "templateTypeNames", null);
        setField(term237853, term237853.getClass(), "className", null);
        setField(term237853, term237853.getClass(), "properties", null);
        setBooleanField(term237853, term237853.getClass(), "nativeType", false);
        setField(term237853, term237853.getClass(), "implicitPrototypeFallback", null);
        setField(term237853, term237853.getClass(), "ownerFunction", null);
        setBooleanField(term237853, term237853.getClass(), "prettyPrint", false);
        setBooleanField(term237853, term237853.getClass(), "visited", false);
        setField(term237853, term237853.getClass(), "docInfo", null);
        setBooleanField(term237853, term237853.getClass(), "unknown", false);
        setBooleanField(term237853, term237853.getClass(), "resolved", false);
        setField(term237853, term237853.getClass(), "resolveResult", null);
        setBooleanField(term237853, term237853.getClass(), "inTemplatedCheckVisit", false);
        setField(term237853, term237853.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term237743, args);
        assertTrue(recursiveEquals(term237743, term237867));
        assertTrue(recursiveEquals(retValue, term237853));
    }

};


