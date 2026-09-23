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

public class JSType_safeResolve_2136838325305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45768;
     Object term45792;
     Object term45771;

    public JSType_safeResolve_2136838325305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term45792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term45792, term45792.getClass(), "call", null);
        setField(term45792, term45792.getClass(), "prototypeSlot", null);
        setField(term45792, term45792.getClass(), "kind", null);
        setField(term45792, term45792.getClass(), "typeOfThis", null);
        setField(term45792, term45792.getClass(), "source", null);
        setField(term45792, term45792.getClass(), "implementedInterfaces", null);
        setField(term45792, term45792.getClass(), "extendedInterfaces", null);
        setField(term45792, term45792.getClass(), "subTypes", null);
        setField(term45792, term45792.getClass(), "templateTypeNames", null);
        setField(term45792, term45792.getClass(), "className", null);
        setField(term45792, term45792.getClass(), "properties", null);
        setBooleanField(term45792, term45792.getClass(), "nativeType", false);
        setField(term45792, term45792.getClass(), "implicitPrototypeFallback", null);
        setField(term45792, term45792.getClass(), "ownerFunction", null);
        setBooleanField(term45792, term45792.getClass(), "prettyPrint", false);
        setBooleanField(term45792, term45792.getClass(), "visited", false);
        setField(term45792, term45792.getClass(), "docInfo", null);
        setBooleanField(term45792, term45792.getClass(), "unknown", false);
        setBooleanField(term45792, term45792.getClass(), "resolved", true);
        setField(term45792, term45792.getClass(), "resolveResult", term45792);
        setBooleanField(term45792, term45792.getClass(), "inTemplatedCheckVisit", false);
        setField(term45792, term45792.getClass(), "registry", null);
        term45771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term45771, term45771.getClass(), "call", null);
        setField(term45771, term45771.getClass(), "prototypeSlot", null);
        setField(term45771, term45771.getClass(), "kind", null);
        setField(term45771, term45771.getClass(), "typeOfThis", null);
        setField(term45771, term45771.getClass(), "source", null);
        setField(term45771, term45771.getClass(), "implementedInterfaces", null);
        setField(term45771, term45771.getClass(), "extendedInterfaces", null);
        setField(term45771, term45771.getClass(), "subTypes", null);
        setField(term45771, term45771.getClass(), "templateTypeNames", null);
        setField(term45771, term45771.getClass(), "className", null);
        setField(term45771, term45771.getClass(), "properties", null);
        setBooleanField(term45771, term45771.getClass(), "nativeType", false);
        setField(term45771, term45771.getClass(), "implicitPrototypeFallback", null);
        setField(term45771, term45771.getClass(), "ownerFunction", null);
        setBooleanField(term45771, term45771.getClass(), "prettyPrint", false);
        setBooleanField(term45771, term45771.getClass(), "visited", false);
        setField(term45771, term45771.getClass(), "docInfo", null);
        setBooleanField(term45771, term45771.getClass(), "unknown", false);
        setBooleanField(term45771, term45771.getClass(), "resolved", true);
        setField(term45771, term45771.getClass(), "resolveResult", term45771);
        setBooleanField(term45771, term45771.getClass(), "inTemplatedCheckVisit", false);
        setField(term45771, term45771.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term45768;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term45768, term45792));
        assertTrue(recursiveEquals(retValue, term45771));
    }

};


