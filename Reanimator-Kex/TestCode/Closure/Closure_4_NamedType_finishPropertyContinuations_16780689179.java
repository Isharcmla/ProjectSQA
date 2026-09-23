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

public class NamedType_finishPropertyContinuations_16780689179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14561;
     Object term14695;

    public NamedType_finishPropertyContinuations_16780689179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term14661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term14561, term14561.getClass(), "referencedObjType", term14661);
        term14695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term14696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term14695, term14695.getClass(), "reference", null);
        setField(term14695, term14695.getClass(), "sourceName", null);
        setIntField(term14695, term14695.getClass(), "lineno", 0);
        setIntField(term14695, term14695.getClass(), "charno", 0);
        setField(term14695, term14695.getClass(), "validator", null);
        setField(term14695, term14695.getClass(), "propertyContinuations", null);
        setField(term14695, term14695.getClass(), "referencedType", null);
        setField(term14696, term14696.getClass(), "call", null);
        setField(term14696, term14696.getClass(), "prototypeSlot", null);
        setField(term14696, term14696.getClass(), "kind", null);
        setField(term14696, term14696.getClass(), "propAccess", null);
        setField(term14696, term14696.getClass(), "typeOfThis", null);
        setField(term14696, term14696.getClass(), "source", null);
        setField(term14696, term14696.getClass(), "implementedInterfaces", null);
        setField(term14696, term14696.getClass(), "extendedInterfaces", null);
        setField(term14696, term14696.getClass(), "subTypes", null);
        setField(term14696, term14696.getClass(), "className", null);
        setField(term14696, term14696.getClass(), "properties", null);
        setBooleanField(term14696, term14696.getClass(), "nativeType", false);
        setField(term14696, term14696.getClass(), "implicitPrototypeFallback", null);
        setField(term14696, term14696.getClass(), "ownerFunction", null);
        setBooleanField(term14696, term14696.getClass(), "prettyPrint", false);
        setBooleanField(term14696, term14696.getClass(), "visited", false);
        setField(term14696, term14696.getClass(), "docInfo", null);
        setBooleanField(term14696, term14696.getClass(), "unknown", false);
        setBooleanField(term14696, term14696.getClass(), "resolved", false);
        setField(term14696, term14696.getClass(), "resolveResult", null);
        setField(term14696, term14696.getClass(), "templateKeys", null);
        setField(term14696, term14696.getClass(), "templatizedTypes", null);
        setBooleanField(term14696, term14696.getClass(), "inTemplatedCheckVisit", false);
        setField(term14696, term14696.getClass(), "registry", null);
        setField(term14695, term14695.getClass(), "referencedObjType", term14696);
        setBooleanField(term14695, term14695.getClass(), "visited", false);
        setField(term14695, term14695.getClass(), "docInfo", null);
        setBooleanField(term14695, term14695.getClass(), "unknown", false);
        setBooleanField(term14695, term14695.getClass(), "resolved", false);
        setField(term14695, term14695.getClass(), "resolveResult", null);
        setField(term14695, term14695.getClass(), "templateKeys", null);
        setField(term14695, term14695.getClass(), "templatizedTypes", null);
        setBooleanField(term14695, term14695.getClass(), "inTemplatedCheckVisit", false);
        setField(term14695, term14695.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term14561, args);
        assertTrue(recursiveEquals(term14561, term14695));
    }

};


