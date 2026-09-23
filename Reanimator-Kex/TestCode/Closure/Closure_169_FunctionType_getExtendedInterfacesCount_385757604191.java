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
import java.util.ArrayList;

public class FunctionType_getExtendedInterfacesCount_385757604191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98658;
     Object term219804;

    public FunctionType_getExtendedInterfacesCount_385757604191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term98710 = new ArrayList();
        term98658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term98658, term98658.getClass(), "extendedInterfaces", term98710);
        ArrayList term219805 = new ArrayList();
        term219804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term219804, term219804.getClass(), "call", null);
        setField(term219804, term219804.getClass(), "prototypeSlot", null);
        setField(term219804, term219804.getClass(), "kind", null);
        setField(term219804, term219804.getClass(), "propAccess", null);
        setField(term219804, term219804.getClass(), "typeOfThis", null);
        setField(term219804, term219804.getClass(), "source", null);
        setField(term219804, term219804.getClass(), "implementedInterfaces", null);
        setField(term219804, term219804.getClass(), "extendedInterfaces", term219805);
        setField(term219804, term219804.getClass(), "subTypes", null);
        setField(term219804, term219804.getClass(), "templateTypeNames", null);
        setField(term219804, term219804.getClass(), "className", null);
        setField(term219804, term219804.getClass(), "properties", null);
        setBooleanField(term219804, term219804.getClass(), "nativeType", false);
        setField(term219804, term219804.getClass(), "implicitPrototypeFallback", null);
        setField(term219804, term219804.getClass(), "ownerFunction", null);
        setBooleanField(term219804, term219804.getClass(), "prettyPrint", false);
        setBooleanField(term219804, term219804.getClass(), "visited", false);
        setField(term219804, term219804.getClass(), "docInfo", null);
        setBooleanField(term219804, term219804.getClass(), "unknown", false);
        setBooleanField(term219804, term219804.getClass(), "resolved", false);
        setField(term219804, term219804.getClass(), "resolveResult", null);
        setBooleanField(term219804, term219804.getClass(), "inTemplatedCheckVisit", false);
        setField(term219804, term219804.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getExtendedInterfacesCount", argTypes, term98658, args);
        assertTrue(recursiveEquals(term98658, term219804));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


