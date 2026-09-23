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

public class JSType_toMaybeTemplateType_1021752839225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27397;
     Object term28089;

    public JSType_toMaybeTemplateType_1021752839225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term28089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term28089, term28089.getClass(), "call", null);
        setField(term28089, term28089.getClass(), "prototypeSlot", null);
        setField(term28089, term28089.getClass(), "kind", null);
        setField(term28089, term28089.getClass(), "propAccess", null);
        setField(term28089, term28089.getClass(), "typeOfThis", null);
        setField(term28089, term28089.getClass(), "source", null);
        setField(term28089, term28089.getClass(), "implementedInterfaces", null);
        setField(term28089, term28089.getClass(), "extendedInterfaces", null);
        setField(term28089, term28089.getClass(), "subTypes", null);
        setField(term28089, term28089.getClass(), "templateTypeNames", null);
        setField(term28089, term28089.getClass(), "className", null);
        setField(term28089, term28089.getClass(), "properties", null);
        setBooleanField(term28089, term28089.getClass(), "nativeType", false);
        setField(term28089, term28089.getClass(), "implicitPrototypeFallback", null);
        setField(term28089, term28089.getClass(), "ownerFunction", null);
        setBooleanField(term28089, term28089.getClass(), "prettyPrint", false);
        setBooleanField(term28089, term28089.getClass(), "visited", false);
        setField(term28089, term28089.getClass(), "docInfo", null);
        setBooleanField(term28089, term28089.getClass(), "unknown", false);
        setBooleanField(term28089, term28089.getClass(), "resolved", false);
        setField(term28089, term28089.getClass(), "resolveResult", null);
        setBooleanField(term28089, term28089.getClass(), "inTemplatedCheckVisit", false);
        setField(term28089, term28089.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term27397;
        Object retValue = callMethod(klass, "toMaybeTemplateType", argTypes, null, args);
        assertTrue(recursiveEquals(term27397, term28089));
        assertTrue(recursiveEquals(retValue, null));
    }

};


