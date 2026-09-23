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

public class FunctionType_hasImplementedInterfaces_1135786392183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94444;
     Object term215922;

    public FunctionType_hasImplementedInterfaces_1135786392183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term94496 = new ArrayList();
        term94444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term94444, term94444.getClass(), "implementedInterfaces", term94496);
        ArrayList term215923 = new ArrayList();
        term215922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term215922, term215922.getClass(), "call", null);
        setField(term215922, term215922.getClass(), "prototypeSlot", null);
        setField(term215922, term215922.getClass(), "kind", null);
        setField(term215922, term215922.getClass(), "propAccess", null);
        setField(term215922, term215922.getClass(), "typeOfThis", null);
        setField(term215922, term215922.getClass(), "source", null);
        setField(term215922, term215922.getClass(), "implementedInterfaces", term215923);
        setField(term215922, term215922.getClass(), "extendedInterfaces", null);
        setField(term215922, term215922.getClass(), "subTypes", null);
        setField(term215922, term215922.getClass(), "templateTypeNames", null);
        setField(term215922, term215922.getClass(), "className", null);
        setField(term215922, term215922.getClass(), "properties", null);
        setBooleanField(term215922, term215922.getClass(), "nativeType", false);
        setField(term215922, term215922.getClass(), "implicitPrototypeFallback", null);
        setField(term215922, term215922.getClass(), "ownerFunction", null);
        setBooleanField(term215922, term215922.getClass(), "prettyPrint", false);
        setBooleanField(term215922, term215922.getClass(), "visited", false);
        setField(term215922, term215922.getClass(), "docInfo", null);
        setBooleanField(term215922, term215922.getClass(), "unknown", false);
        setBooleanField(term215922, term215922.getClass(), "resolved", false);
        setField(term215922, term215922.getClass(), "resolveResult", null);
        setBooleanField(term215922, term215922.getClass(), "inTemplatedCheckVisit", false);
        setField(term215922, term215922.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasImplementedInterfaces", argTypes, term94444, args);
        assertTrue(recursiveEquals(term94444, term215922));
        assertTrue(recursiveEquals(retValue, false));
    }

};


