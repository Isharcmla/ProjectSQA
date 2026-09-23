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

public class FunctionType_addRelatedExtendedInterfaces_1452940821241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243592;
     Object term243702;
     Object term243718;
     Object term243719;

    public FunctionType_addRelatedExtendedInterfaces_1452940821241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term243702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term243718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term243718, term243718.getClass(), "call", null);
        setField(term243718, term243718.getClass(), "prototypeSlot", null);
        setField(term243718, term243718.getClass(), "kind", null);
        setField(term243718, term243718.getClass(), "propAccess", null);
        setField(term243718, term243718.getClass(), "typeOfThis", null);
        setField(term243718, term243718.getClass(), "source", null);
        setField(term243718, term243718.getClass(), "implementedInterfaces", null);
        setField(term243718, term243718.getClass(), "extendedInterfaces", null);
        setField(term243718, term243718.getClass(), "subTypes", null);
        setField(term243718, term243718.getClass(), "templateTypeNames", null);
        setField(term243718, term243718.getClass(), "className", null);
        setField(term243718, term243718.getClass(), "properties", null);
        setBooleanField(term243718, term243718.getClass(), "nativeType", false);
        setField(term243718, term243718.getClass(), "implicitPrototypeFallback", null);
        setField(term243718, term243718.getClass(), "ownerFunction", null);
        setBooleanField(term243718, term243718.getClass(), "prettyPrint", false);
        setBooleanField(term243718, term243718.getClass(), "visited", false);
        setField(term243718, term243718.getClass(), "docInfo", null);
        setBooleanField(term243718, term243718.getClass(), "unknown", false);
        setBooleanField(term243718, term243718.getClass(), "resolved", false);
        setField(term243718, term243718.getClass(), "resolveResult", null);
        setBooleanField(term243718, term243718.getClass(), "inTemplatedCheckVisit", false);
        setField(term243718, term243718.getClass(), "registry", null);
        term243719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term243719, term243719.getClass(), "call", null);
        setField(term243719, term243719.getClass(), "prototypeSlot", null);
        setField(term243719, term243719.getClass(), "kind", null);
        setField(term243719, term243719.getClass(), "propAccess", null);
        setField(term243719, term243719.getClass(), "typeOfThis", null);
        setField(term243719, term243719.getClass(), "source", null);
        setField(term243719, term243719.getClass(), "implementedInterfaces", null);
        setField(term243719, term243719.getClass(), "extendedInterfaces", null);
        setField(term243719, term243719.getClass(), "subTypes", null);
        setField(term243719, term243719.getClass(), "templateTypeNames", null);
        setField(term243719, term243719.getClass(), "className", null);
        setField(term243719, term243719.getClass(), "properties", null);
        setBooleanField(term243719, term243719.getClass(), "nativeType", false);
        setField(term243719, term243719.getClass(), "implicitPrototypeFallback", null);
        setField(term243719, term243719.getClass(), "ownerFunction", null);
        setBooleanField(term243719, term243719.getClass(), "prettyPrint", false);
        setBooleanField(term243719, term243719.getClass(), "visited", false);
        setField(term243719, term243719.getClass(), "docInfo", null);
        setBooleanField(term243719, term243719.getClass(), "unknown", false);
        setBooleanField(term243719, term243719.getClass(), "resolved", false);
        setField(term243719, term243719.getClass(), "resolveResult", null);
        setBooleanField(term243719, term243719.getClass(), "inTemplatedCheckVisit", false);
        setField(term243719, term243719.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term243702;
        args[1] = null;
        callMethod(klass, "addRelatedExtendedInterfaces", argTypes, term243592, args);
        assertTrue(recursiveEquals(term243592, term243718));
        assertTrue(recursiveEquals(term243702, term243719));
    }

};


