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
import java.util.ArrayList;

public class NamedType_finishPropertyContinuations_167806891107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22356;
     Object term22574;

    public NamedType_finishPropertyContinuations_167806891107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22508 = new ArrayList();
        term22356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term22456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term22456, term22456.getClass(), "unknown", false);
        setField(term22356, term22356.getClass(), "referencedObjType", term22456);
        setField(term22356, term22356.getClass(), "propertyContinuations", term22508);
        term22574 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term22575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term22574, term22574.getClass(), "reference", null);
        setField(term22574, term22574.getClass(), "sourceName", null);
        setIntField(term22574, term22574.getClass(), "lineno", 0);
        setIntField(term22574, term22574.getClass(), "charno", 0);
        setField(term22574, term22574.getClass(), "validator", null);
        setField(term22574, term22574.getClass(), "propertyContinuations", null);
        setField(term22574, term22574.getClass(), "referencedType", null);
        setField(term22575, term22575.getClass(), "call", null);
        setField(term22575, term22575.getClass(), "prototypeSlot", null);
        setField(term22575, term22575.getClass(), "kind", null);
        setField(term22575, term22575.getClass(), "propAccess", null);
        setField(term22575, term22575.getClass(), "typeOfThis", null);
        setField(term22575, term22575.getClass(), "source", null);
        setField(term22575, term22575.getClass(), "implementedInterfaces", null);
        setField(term22575, term22575.getClass(), "extendedInterfaces", null);
        setField(term22575, term22575.getClass(), "subTypes", null);
        setField(term22575, term22575.getClass(), "className", null);
        setField(term22575, term22575.getClass(), "properties", null);
        setBooleanField(term22575, term22575.getClass(), "nativeType", false);
        setField(term22575, term22575.getClass(), "implicitPrototypeFallback", null);
        setField(term22575, term22575.getClass(), "ownerFunction", null);
        setBooleanField(term22575, term22575.getClass(), "prettyPrint", false);
        setBooleanField(term22575, term22575.getClass(), "visited", false);
        setField(term22575, term22575.getClass(), "docInfo", null);
        setBooleanField(term22575, term22575.getClass(), "unknown", false);
        setBooleanField(term22575, term22575.getClass(), "resolved", false);
        setField(term22575, term22575.getClass(), "resolveResult", null);
        setField(term22575, term22575.getClass(), "templateKeys", null);
        setField(term22575, term22575.getClass(), "templatizedTypes", null);
        setBooleanField(term22575, term22575.getClass(), "inTemplatedCheckVisit", false);
        setField(term22575, term22575.getClass(), "registry", null);
        setField(term22574, term22574.getClass(), "referencedObjType", term22575);
        setBooleanField(term22574, term22574.getClass(), "visited", false);
        setField(term22574, term22574.getClass(), "docInfo", null);
        setBooleanField(term22574, term22574.getClass(), "unknown", false);
        setBooleanField(term22574, term22574.getClass(), "resolved", false);
        setField(term22574, term22574.getClass(), "resolveResult", null);
        setField(term22574, term22574.getClass(), "templateKeys", null);
        setField(term22574, term22574.getClass(), "templatizedTypes", null);
        setBooleanField(term22574, term22574.getClass(), "inTemplatedCheckVisit", false);
        setField(term22574, term22574.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term22356, args);
        assertTrue(recursiveEquals(term22356, term22574));
    }

};


