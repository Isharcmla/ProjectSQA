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

public class JSType_safeResolve_2136838325309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46390;
     Object term46503;
     Object term46499;

    public JSType_safeResolve_2136838325309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term46486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term46390, term46390.getClass(), "resolved", true);
        setField(term46390, term46390.getClass(), "resolveResult", term46486);
        term46503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term46504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term46503, term46503.getClass(), "call", null);
        setField(term46503, term46503.getClass(), "prototypeSlot", null);
        setField(term46503, term46503.getClass(), "kind", null);
        setField(term46503, term46503.getClass(), "typeOfThis", null);
        setField(term46503, term46503.getClass(), "source", null);
        setField(term46503, term46503.getClass(), "implementedInterfaces", null);
        setField(term46503, term46503.getClass(), "extendedInterfaces", null);
        setField(term46503, term46503.getClass(), "subTypes", null);
        setField(term46503, term46503.getClass(), "templateTypeNames", null);
        setField(term46503, term46503.getClass(), "className", null);
        setField(term46503, term46503.getClass(), "properties", null);
        setBooleanField(term46503, term46503.getClass(), "nativeType", false);
        setField(term46503, term46503.getClass(), "implicitPrototypeFallback", null);
        setField(term46503, term46503.getClass(), "ownerFunction", null);
        setBooleanField(term46503, term46503.getClass(), "prettyPrint", false);
        setBooleanField(term46503, term46503.getClass(), "visited", false);
        setField(term46503, term46503.getClass(), "docInfo", null);
        setBooleanField(term46503, term46503.getClass(), "unknown", false);
        setBooleanField(term46503, term46503.getClass(), "resolved", true);
        setBooleanField(term46504, term46504.getClass(), "resolved", false);
        setField(term46504, term46504.getClass(), "resolveResult", null);
        setBooleanField(term46504, term46504.getClass(), "inTemplatedCheckVisit", false);
        setField(term46504, term46504.getClass(), "registry", null);
        setField(term46503, term46503.getClass(), "resolveResult", term46504);
        setBooleanField(term46503, term46503.getClass(), "inTemplatedCheckVisit", false);
        setField(term46503, term46503.getClass(), "registry", null);
        term46499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term46499, term46499.getClass(), "resolved", false);
        setField(term46499, term46499.getClass(), "resolveResult", null);
        setBooleanField(term46499, term46499.getClass(), "inTemplatedCheckVisit", false);
        setField(term46499, term46499.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term46390;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term46390, term46503));
        assertTrue(recursiveEquals(retValue, term46499));
    }

};


