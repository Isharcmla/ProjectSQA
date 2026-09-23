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

public class NamedType_finishPropertyContinuations_167806891299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94976;
     Object term145183;

    public NamedType_finishPropertyContinuations_167806891299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term95076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term95170 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setBooleanField(term95076, term95076.getClass(), "unknown", true);
        setField(term95076, term95076.getClass(), "implicitPrototypeFallback", null);
        setField(term95076, term95076.getClass(), "ownerFunction", null);
        setField(term94976, term94976.getClass(), "referencedObjType", term95076);
        setField(term94976, term94976.getClass(), "propertyContinuations", term95170);
        term145183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term145184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term145183, term145183.getClass(), "reference", null);
        setField(term145183, term145183.getClass(), "sourceName", null);
        setIntField(term145183, term145183.getClass(), "lineno", 0);
        setIntField(term145183, term145183.getClass(), "charno", 0);
        setField(term145183, term145183.getClass(), "validator", null);
        setField(term145183, term145183.getClass(), "propertyContinuations", null);
        setField(term145183, term145183.getClass(), "referencedType", null);
        setField(term145184, term145184.getClass(), "call", null);
        setField(term145184, term145184.getClass(), "prototypeSlot", null);
        setField(term145184, term145184.getClass(), "kind", null);
        setField(term145184, term145184.getClass(), "propAccess", null);
        setField(term145184, term145184.getClass(), "typeOfThis", null);
        setField(term145184, term145184.getClass(), "source", null);
        setField(term145184, term145184.getClass(), "implementedInterfaces", null);
        setField(term145184, term145184.getClass(), "extendedInterfaces", null);
        setField(term145184, term145184.getClass(), "subTypes", null);
        setField(term145184, term145184.getClass(), "className", null);
        setField(term145184, term145184.getClass(), "properties", null);
        setBooleanField(term145184, term145184.getClass(), "nativeType", false);
        setField(term145184, term145184.getClass(), "implicitPrototypeFallback", null);
        setField(term145184, term145184.getClass(), "ownerFunction", null);
        setBooleanField(term145184, term145184.getClass(), "prettyPrint", false);
        setBooleanField(term145184, term145184.getClass(), "visited", false);
        setField(term145184, term145184.getClass(), "docInfo", null);
        setBooleanField(term145184, term145184.getClass(), "unknown", false);
        setBooleanField(term145184, term145184.getClass(), "resolved", false);
        setField(term145184, term145184.getClass(), "resolveResult", null);
        setField(term145184, term145184.getClass(), "templateKeys", null);
        setField(term145184, term145184.getClass(), "templatizedTypes", null);
        setBooleanField(term145184, term145184.getClass(), "inTemplatedCheckVisit", false);
        setField(term145184, term145184.getClass(), "registry", null);
        setField(term145183, term145183.getClass(), "referencedObjType", term145184);
        setBooleanField(term145183, term145183.getClass(), "visited", false);
        setField(term145183, term145183.getClass(), "docInfo", null);
        setBooleanField(term145183, term145183.getClass(), "unknown", false);
        setBooleanField(term145183, term145183.getClass(), "resolved", false);
        setField(term145183, term145183.getClass(), "resolveResult", null);
        setField(term145183, term145183.getClass(), "templateKeys", null);
        setField(term145183, term145183.getClass(), "templatizedTypes", null);
        setBooleanField(term145183, term145183.getClass(), "inTemplatedCheckVisit", false);
        setField(term145183, term145183.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term94976, args);
        assertTrue(recursiveEquals(term94976, term145183));
    }

};


