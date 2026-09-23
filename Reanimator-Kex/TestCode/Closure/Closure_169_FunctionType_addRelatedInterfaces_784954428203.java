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

public class FunctionType_addRelatedInterfaces_784954428203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103960;
     Object term104060;
     Object term225746;
     Object term225747;

    public FunctionType_addRelatedInterfaces_784954428203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term104060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term225746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term225746, term225746.getClass(), "call", null);
        setField(term225746, term225746.getClass(), "prototypeSlot", null);
        setField(term225746, term225746.getClass(), "kind", null);
        setField(term225746, term225746.getClass(), "propAccess", null);
        setField(term225746, term225746.getClass(), "typeOfThis", null);
        setField(term225746, term225746.getClass(), "source", null);
        setField(term225746, term225746.getClass(), "implementedInterfaces", null);
        setField(term225746, term225746.getClass(), "extendedInterfaces", null);
        setField(term225746, term225746.getClass(), "subTypes", null);
        setField(term225746, term225746.getClass(), "templateTypeNames", null);
        setField(term225746, term225746.getClass(), "className", null);
        setField(term225746, term225746.getClass(), "properties", null);
        setBooleanField(term225746, term225746.getClass(), "nativeType", false);
        setField(term225746, term225746.getClass(), "implicitPrototypeFallback", null);
        setField(term225746, term225746.getClass(), "ownerFunction", null);
        setBooleanField(term225746, term225746.getClass(), "prettyPrint", false);
        setBooleanField(term225746, term225746.getClass(), "visited", false);
        setField(term225746, term225746.getClass(), "docInfo", null);
        setBooleanField(term225746, term225746.getClass(), "unknown", false);
        setBooleanField(term225746, term225746.getClass(), "resolved", false);
        setField(term225746, term225746.getClass(), "resolveResult", null);
        setBooleanField(term225746, term225746.getClass(), "inTemplatedCheckVisit", false);
        setField(term225746, term225746.getClass(), "registry", null);
        term225747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term225747, term225747.getClass(), "call", null);
        setField(term225747, term225747.getClass(), "prototypeSlot", null);
        setField(term225747, term225747.getClass(), "kind", null);
        setField(term225747, term225747.getClass(), "propAccess", null);
        setField(term225747, term225747.getClass(), "typeOfThis", null);
        setField(term225747, term225747.getClass(), "source", null);
        setField(term225747, term225747.getClass(), "implementedInterfaces", null);
        setField(term225747, term225747.getClass(), "extendedInterfaces", null);
        setField(term225747, term225747.getClass(), "subTypes", null);
        setField(term225747, term225747.getClass(), "templateTypeNames", null);
        setField(term225747, term225747.getClass(), "className", null);
        setField(term225747, term225747.getClass(), "properties", null);
        setBooleanField(term225747, term225747.getClass(), "nativeType", false);
        setField(term225747, term225747.getClass(), "implicitPrototypeFallback", null);
        setField(term225747, term225747.getClass(), "ownerFunction", null);
        setBooleanField(term225747, term225747.getClass(), "prettyPrint", false);
        setBooleanField(term225747, term225747.getClass(), "visited", false);
        setField(term225747, term225747.getClass(), "docInfo", null);
        setBooleanField(term225747, term225747.getClass(), "unknown", false);
        setBooleanField(term225747, term225747.getClass(), "resolved", false);
        setField(term225747, term225747.getClass(), "resolveResult", null);
        setBooleanField(term225747, term225747.getClass(), "inTemplatedCheckVisit", false);
        setField(term225747, term225747.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term104060;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term103960, args);
        assertTrue(recursiveEquals(term103960, term225746));
        assertTrue(recursiveEquals(term104060, term225747));
    }

};


