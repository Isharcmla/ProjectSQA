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

public class JSType_safeResolve_2136838325242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29850;
     Object term30230;
     Object term30209;

    public JSType_safeResolve_2136838325242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term30230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term30230, term30230.getClass(), "call", null);
        setField(term30230, term30230.getClass(), "prototypeSlot", null);
        setField(term30230, term30230.getClass(), "kind", null);
        setField(term30230, term30230.getClass(), "propAccess", null);
        setField(term30230, term30230.getClass(), "typeOfThis", null);
        setField(term30230, term30230.getClass(), "source", null);
        setField(term30230, term30230.getClass(), "implementedInterfaces", null);
        setField(term30230, term30230.getClass(), "extendedInterfaces", null);
        setField(term30230, term30230.getClass(), "subTypes", null);
        setField(term30230, term30230.getClass(), "templateTypeNames", null);
        setField(term30230, term30230.getClass(), "className", null);
        setField(term30230, term30230.getClass(), "properties", null);
        setBooleanField(term30230, term30230.getClass(), "nativeType", false);
        setField(term30230, term30230.getClass(), "implicitPrototypeFallback", null);
        setField(term30230, term30230.getClass(), "ownerFunction", null);
        setBooleanField(term30230, term30230.getClass(), "prettyPrint", false);
        setBooleanField(term30230, term30230.getClass(), "visited", false);
        setField(term30230, term30230.getClass(), "docInfo", null);
        setBooleanField(term30230, term30230.getClass(), "unknown", false);
        setBooleanField(term30230, term30230.getClass(), "resolved", true);
        setField(term30230, term30230.getClass(), "resolveResult", term30230);
        setBooleanField(term30230, term30230.getClass(), "inTemplatedCheckVisit", false);
        setField(term30230, term30230.getClass(), "registry", null);
        term30209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term30209, term30209.getClass(), "call", null);
        setField(term30209, term30209.getClass(), "prototypeSlot", null);
        setField(term30209, term30209.getClass(), "kind", null);
        setField(term30209, term30209.getClass(), "propAccess", null);
        setField(term30209, term30209.getClass(), "typeOfThis", null);
        setField(term30209, term30209.getClass(), "source", null);
        setField(term30209, term30209.getClass(), "implementedInterfaces", null);
        setField(term30209, term30209.getClass(), "extendedInterfaces", null);
        setField(term30209, term30209.getClass(), "subTypes", null);
        setField(term30209, term30209.getClass(), "templateTypeNames", null);
        setField(term30209, term30209.getClass(), "className", null);
        setField(term30209, term30209.getClass(), "properties", null);
        setBooleanField(term30209, term30209.getClass(), "nativeType", false);
        setField(term30209, term30209.getClass(), "implicitPrototypeFallback", null);
        setField(term30209, term30209.getClass(), "ownerFunction", null);
        setBooleanField(term30209, term30209.getClass(), "prettyPrint", false);
        setBooleanField(term30209, term30209.getClass(), "visited", false);
        setField(term30209, term30209.getClass(), "docInfo", null);
        setBooleanField(term30209, term30209.getClass(), "unknown", false);
        setBooleanField(term30209, term30209.getClass(), "resolved", true);
        setField(term30209, term30209.getClass(), "resolveResult", term30209);
        setBooleanField(term30209, term30209.getClass(), "inTemplatedCheckVisit", false);
        setField(term30209, term30209.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term29850;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term29850, term30230));
        assertTrue(recursiveEquals(retValue, term30209));
    }

};


