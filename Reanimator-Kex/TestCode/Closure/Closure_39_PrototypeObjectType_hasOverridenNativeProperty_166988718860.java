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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_hasOverridenNativeProperty_166988718860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1925;

    public PrototypeObjectType_hasOverridenNativeProperty_166988718860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1938 = new HashMap();
        term1925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1958 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1925, term1925.getClass(), "className", "lFRJFUMVbx");
        setField(term1925, term1925.getClass(), "properties", term1938);
        setBooleanField(term1925, term1925.getClass(), "nativeType", false);
        setField(term1925, term1925.getClass(), "implicitPrototypeFallback", null);
        setField(term1950, term1950.getClass(), "call", null);
        setField(term1950, term1950.getClass(), "prototypeSlot", null);
        setField(term1950, term1950.getClass(), "kind", null);
        setField(term1950, term1950.getClass(), "typeOfThis", null);
        setField(term1950, term1950.getClass(), "source", null);
        setField(term1950, term1950.getClass(), "implementedInterfaces", null);
        setField(term1950, term1950.getClass(), "extendedInterfaces", null);
        setField(term1950, term1950.getClass(), "subTypes", null);
        setField(term1950, term1950.getClass(), "templateTypeName", null);
        setField(term1950, term1950.getClass(), "className", null);
        setField(term1950, term1950.getClass(), "properties", null);
        setBooleanField(term1950, term1950.getClass(), "nativeType", false);
        setField(term1950, term1950.getClass(), "implicitPrototypeFallback", null);
        setField(term1950, term1950.getClass(), "ownerFunction", null);
        setBooleanField(term1950, term1950.getClass(), "prettyPrint", false);
        setBooleanField(term1950, term1950.getClass(), "visited", false);
        setField(term1950, term1950.getClass(), "docInfo", null);
        setBooleanField(term1950, term1950.getClass(), "unknown", false);
        setBooleanField(term1950, term1950.getClass(), "resolved", false);
        setField(term1950, term1950.getClass(), "resolveResult", null);
        setField(term1950, term1950.getClass(), "registry", null);
        setField(term1925, term1925.getClass(), "ownerFunction", term1950);
        setBooleanField(term1925, term1925.getClass(), "prettyPrint", false);
        setBooleanField(term1925, term1925.getClass(), "visited", true);
        setField(term1958, term1958.getClass(), "info", null);
        setField(term1958, term1958.getClass(), "documentation", null);
        setField(term1958, term1958.getClass(), "associatedNode", null);
        setField(term1958, term1958.getClass(), "visibility", null);
        setIntField(term1958, term1958.getClass(), "bitset", 0);
        setField(term1958, term1958.getClass(), "type", null);
        setField(term1958, term1958.getClass(), "thisType", null);
        setBooleanField(term1958, term1958.getClass(), "includeDocumentation", false);
        setField(term1925, term1925.getClass(), "docInfo", term1958);
        setBooleanField(term1925, term1925.getClass(), "unknown", false);
        setBooleanField(term1925, term1925.getClass(), "resolved", false);
        setField(term1925, term1925.getClass(), "resolveResult", null);
        setField(term1925, term1925.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tRxZafjqIx";
        try {
            callMethod(klass, "hasOverridenNativeProperty", argTypes, term1925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


