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

public class JSType_safeResolve_2136838325214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26133;
     Object term26979;
     Object term26958;

    public JSType_safeResolve_2136838325214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term26979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term26979, term26979.getClass(), "call", null);
        setField(term26979, term26979.getClass(), "prototypeSlot", null);
        setField(term26979, term26979.getClass(), "kind", null);
        setField(term26979, term26979.getClass(), "typeOfThis", null);
        setField(term26979, term26979.getClass(), "source", null);
        setField(term26979, term26979.getClass(), "implementedInterfaces", null);
        setField(term26979, term26979.getClass(), "extendedInterfaces", null);
        setField(term26979, term26979.getClass(), "subTypes", null);
        setField(term26979, term26979.getClass(), "templateTypeNames", null);
        setField(term26979, term26979.getClass(), "className", null);
        setField(term26979, term26979.getClass(), "properties", null);
        setBooleanField(term26979, term26979.getClass(), "nativeType", false);
        setField(term26979, term26979.getClass(), "implicitPrototypeFallback", null);
        setField(term26979, term26979.getClass(), "ownerFunction", null);
        setBooleanField(term26979, term26979.getClass(), "prettyPrint", false);
        setBooleanField(term26979, term26979.getClass(), "visited", false);
        setField(term26979, term26979.getClass(), "docInfo", null);
        setBooleanField(term26979, term26979.getClass(), "unknown", false);
        setBooleanField(term26979, term26979.getClass(), "resolved", true);
        setField(term26979, term26979.getClass(), "resolveResult", term26979);
        setBooleanField(term26979, term26979.getClass(), "inTemplatedCheckVisit", false);
        setField(term26979, term26979.getClass(), "registry", null);
        term26958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term26958, term26958.getClass(), "call", null);
        setField(term26958, term26958.getClass(), "prototypeSlot", null);
        setField(term26958, term26958.getClass(), "kind", null);
        setField(term26958, term26958.getClass(), "typeOfThis", null);
        setField(term26958, term26958.getClass(), "source", null);
        setField(term26958, term26958.getClass(), "implementedInterfaces", null);
        setField(term26958, term26958.getClass(), "extendedInterfaces", null);
        setField(term26958, term26958.getClass(), "subTypes", null);
        setField(term26958, term26958.getClass(), "templateTypeNames", null);
        setField(term26958, term26958.getClass(), "className", null);
        setField(term26958, term26958.getClass(), "properties", null);
        setBooleanField(term26958, term26958.getClass(), "nativeType", false);
        setField(term26958, term26958.getClass(), "implicitPrototypeFallback", null);
        setField(term26958, term26958.getClass(), "ownerFunction", null);
        setBooleanField(term26958, term26958.getClass(), "prettyPrint", false);
        setBooleanField(term26958, term26958.getClass(), "visited", false);
        setField(term26958, term26958.getClass(), "docInfo", null);
        setBooleanField(term26958, term26958.getClass(), "unknown", false);
        setBooleanField(term26958, term26958.getClass(), "resolved", true);
        setField(term26958, term26958.getClass(), "resolveResult", term26958);
        setBooleanField(term26958, term26958.getClass(), "inTemplatedCheckVisit", false);
        setField(term26958, term26958.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term26133;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term26133, term26979));
        assertTrue(recursiveEquals(retValue, term26958));
    }

};


