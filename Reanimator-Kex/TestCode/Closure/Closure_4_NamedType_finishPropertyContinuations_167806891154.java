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

public class NamedType_finishPropertyContinuations_167806891154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33007;
     Object term35471;

    public NamedType_finishPropertyContinuations_167806891154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term33107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term33007, term33007.getClass(), "referencedObjType", term33107);
        term35471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term35472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term35471, term35471.getClass(), "reference", null);
        setField(term35471, term35471.getClass(), "sourceName", null);
        setIntField(term35471, term35471.getClass(), "lineno", 0);
        setIntField(term35471, term35471.getClass(), "charno", 0);
        setField(term35471, term35471.getClass(), "validator", null);
        setField(term35471, term35471.getClass(), "propertyContinuations", null);
        setField(term35471, term35471.getClass(), "referencedType", null);
        setField(term35472, term35472.getClass(), "call", null);
        setField(term35472, term35472.getClass(), "prototypeSlot", null);
        setField(term35472, term35472.getClass(), "kind", null);
        setField(term35472, term35472.getClass(), "propAccess", null);
        setField(term35472, term35472.getClass(), "typeOfThis", null);
        setField(term35472, term35472.getClass(), "source", null);
        setField(term35472, term35472.getClass(), "implementedInterfaces", null);
        setField(term35472, term35472.getClass(), "extendedInterfaces", null);
        setField(term35472, term35472.getClass(), "subTypes", null);
        setField(term35472, term35472.getClass(), "className", null);
        setField(term35472, term35472.getClass(), "properties", null);
        setBooleanField(term35472, term35472.getClass(), "nativeType", false);
        setField(term35472, term35472.getClass(), "implicitPrototypeFallback", null);
        setField(term35472, term35472.getClass(), "ownerFunction", null);
        setBooleanField(term35472, term35472.getClass(), "prettyPrint", false);
        setBooleanField(term35472, term35472.getClass(), "visited", false);
        setField(term35472, term35472.getClass(), "docInfo", null);
        setBooleanField(term35472, term35472.getClass(), "unknown", false);
        setBooleanField(term35472, term35472.getClass(), "resolved", false);
        setField(term35472, term35472.getClass(), "resolveResult", null);
        setField(term35472, term35472.getClass(), "templateKeys", null);
        setField(term35472, term35472.getClass(), "templatizedTypes", null);
        setBooleanField(term35472, term35472.getClass(), "inTemplatedCheckVisit", false);
        setField(term35472, term35472.getClass(), "registry", null);
        setField(term35471, term35471.getClass(), "referencedObjType", term35472);
        setBooleanField(term35471, term35471.getClass(), "visited", false);
        setField(term35471, term35471.getClass(), "docInfo", null);
        setBooleanField(term35471, term35471.getClass(), "unknown", false);
        setBooleanField(term35471, term35471.getClass(), "resolved", false);
        setField(term35471, term35471.getClass(), "resolveResult", null);
        setField(term35471, term35471.getClass(), "templateKeys", null);
        setField(term35471, term35471.getClass(), "templatizedTypes", null);
        setBooleanField(term35471, term35471.getClass(), "inTemplatedCheckVisit", false);
        setField(term35471, term35471.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term33007, args);
        assertTrue(recursiveEquals(term33007, term35471));
    }

};


