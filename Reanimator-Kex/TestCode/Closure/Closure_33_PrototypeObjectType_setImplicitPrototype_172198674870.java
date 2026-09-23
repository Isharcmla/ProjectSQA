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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_setImplicitPrototype_172198674870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2383;

    public PrototypeObjectType_setImplicitPrototype_172198674870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2396 = new HashMap();
        term2383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2416 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2383, term2383.getClass(), "className", "CFyoseFGLF");
        setField(term2383, term2383.getClass(), "properties", term2396);
        setBooleanField(term2383, term2383.getClass(), "nativeType", false);
        setField(term2383, term2383.getClass(), "implicitPrototypeFallback", null);
        setField(term2408, term2408.getClass(), "call", null);
        setField(term2408, term2408.getClass(), "prototypeSlot", null);
        setField(term2408, term2408.getClass(), "kind", null);
        setField(term2408, term2408.getClass(), "typeOfThis", null);
        setField(term2408, term2408.getClass(), "source", null);
        setField(term2408, term2408.getClass(), "implementedInterfaces", null);
        setField(term2408, term2408.getClass(), "extendedInterfaces", null);
        setField(term2408, term2408.getClass(), "subTypes", null);
        setField(term2408, term2408.getClass(), "templateTypeName", null);
        setField(term2408, term2408.getClass(), "className", null);
        setField(term2408, term2408.getClass(), "properties", null);
        setBooleanField(term2408, term2408.getClass(), "nativeType", false);
        setField(term2408, term2408.getClass(), "implicitPrototypeFallback", null);
        setField(term2408, term2408.getClass(), "ownerFunction", null);
        setBooleanField(term2408, term2408.getClass(), "prettyPrint", false);
        setBooleanField(term2408, term2408.getClass(), "visited", false);
        setField(term2408, term2408.getClass(), "docInfo", null);
        setBooleanField(term2408, term2408.getClass(), "unknown", false);
        setBooleanField(term2408, term2408.getClass(), "resolved", false);
        setField(term2408, term2408.getClass(), "resolveResult", null);
        setField(term2408, term2408.getClass(), "registry", null);
        setField(term2383, term2383.getClass(), "ownerFunction", term2408);
        setBooleanField(term2383, term2383.getClass(), "prettyPrint", true);
        setBooleanField(term2383, term2383.getClass(), "visited", false);
        setField(term2416, term2416.getClass(), "info", null);
        setField(term2416, term2416.getClass(), "documentation", null);
        setField(term2416, term2416.getClass(), "associatedNode", null);
        setField(term2416, term2416.getClass(), "visibility", null);
        setIntField(term2416, term2416.getClass(), "bitset", 0);
        setField(term2416, term2416.getClass(), "type", null);
        setField(term2416, term2416.getClass(), "thisType", null);
        setBooleanField(term2416, term2416.getClass(), "includeDocumentation", false);
        setField(term2383, term2383.getClass(), "docInfo", term2416);
        setBooleanField(term2383, term2383.getClass(), "unknown", false);
        setBooleanField(term2383, term2383.getClass(), "resolved", true);
        setField(term2383, term2383.getClass(), "resolveResult", null);
        setField(term2383, term2383.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setImplicitPrototype", argTypes, term2383, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


