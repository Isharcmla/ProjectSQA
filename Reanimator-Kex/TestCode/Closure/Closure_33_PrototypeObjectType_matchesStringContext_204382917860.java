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

public class PrototypeObjectType_matchesStringContext_204382917860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1877;

    public PrototypeObjectType_matchesStringContext_204382917860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1890 = new HashMap();
        term1877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1910 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1877, term1877.getClass(), "className", "iljANwuEjk");
        setField(term1877, term1877.getClass(), "properties", term1890);
        setBooleanField(term1877, term1877.getClass(), "nativeType", false);
        setField(term1877, term1877.getClass(), "implicitPrototypeFallback", null);
        setField(term1902, term1902.getClass(), "call", null);
        setField(term1902, term1902.getClass(), "prototypeSlot", null);
        setField(term1902, term1902.getClass(), "kind", null);
        setField(term1902, term1902.getClass(), "typeOfThis", null);
        setField(term1902, term1902.getClass(), "source", null);
        setField(term1902, term1902.getClass(), "implementedInterfaces", null);
        setField(term1902, term1902.getClass(), "extendedInterfaces", null);
        setField(term1902, term1902.getClass(), "subTypes", null);
        setField(term1902, term1902.getClass(), "templateTypeName", null);
        setField(term1902, term1902.getClass(), "className", null);
        setField(term1902, term1902.getClass(), "properties", null);
        setBooleanField(term1902, term1902.getClass(), "nativeType", false);
        setField(term1902, term1902.getClass(), "implicitPrototypeFallback", null);
        setField(term1902, term1902.getClass(), "ownerFunction", null);
        setBooleanField(term1902, term1902.getClass(), "prettyPrint", false);
        setBooleanField(term1902, term1902.getClass(), "visited", false);
        setField(term1902, term1902.getClass(), "docInfo", null);
        setBooleanField(term1902, term1902.getClass(), "unknown", false);
        setBooleanField(term1902, term1902.getClass(), "resolved", false);
        setField(term1902, term1902.getClass(), "resolveResult", null);
        setField(term1902, term1902.getClass(), "registry", null);
        setField(term1877, term1877.getClass(), "ownerFunction", term1902);
        setBooleanField(term1877, term1877.getClass(), "prettyPrint", false);
        setBooleanField(term1877, term1877.getClass(), "visited", false);
        setField(term1910, term1910.getClass(), "info", null);
        setField(term1910, term1910.getClass(), "documentation", null);
        setField(term1910, term1910.getClass(), "associatedNode", null);
        setField(term1910, term1910.getClass(), "visibility", null);
        setIntField(term1910, term1910.getClass(), "bitset", 0);
        setField(term1910, term1910.getClass(), "type", null);
        setField(term1910, term1910.getClass(), "thisType", null);
        setBooleanField(term1910, term1910.getClass(), "includeDocumentation", false);
        setField(term1877, term1877.getClass(), "docInfo", term1910);
        setBooleanField(term1877, term1877.getClass(), "unknown", false);
        setBooleanField(term1877, term1877.getClass(), "resolved", false);
        setField(term1877, term1877.getClass(), "resolveResult", null);
        setField(term1877, term1877.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesStringContext", argTypes, term1877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


