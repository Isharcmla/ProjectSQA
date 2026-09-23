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

public class PrototypeObjectType_isSubtype_157693573173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2527;

    public PrototypeObjectType_isSubtype_157693573173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2540 = new HashMap();
        term2527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2560 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2527, term2527.getClass(), "className", "TwfWVQGiIj");
        setField(term2527, term2527.getClass(), "properties", term2540);
        setBooleanField(term2527, term2527.getClass(), "nativeType", false);
        setField(term2527, term2527.getClass(), "implicitPrototypeFallback", null);
        setField(term2552, term2552.getClass(), "call", null);
        setField(term2552, term2552.getClass(), "prototypeSlot", null);
        setField(term2552, term2552.getClass(), "kind", null);
        setField(term2552, term2552.getClass(), "typeOfThis", null);
        setField(term2552, term2552.getClass(), "source", null);
        setField(term2552, term2552.getClass(), "implementedInterfaces", null);
        setField(term2552, term2552.getClass(), "extendedInterfaces", null);
        setField(term2552, term2552.getClass(), "subTypes", null);
        setField(term2552, term2552.getClass(), "templateTypeName", null);
        setField(term2552, term2552.getClass(), "className", null);
        setField(term2552, term2552.getClass(), "properties", null);
        setBooleanField(term2552, term2552.getClass(), "nativeType", false);
        setField(term2552, term2552.getClass(), "implicitPrototypeFallback", null);
        setField(term2552, term2552.getClass(), "ownerFunction", null);
        setBooleanField(term2552, term2552.getClass(), "prettyPrint", false);
        setBooleanField(term2552, term2552.getClass(), "visited", false);
        setField(term2552, term2552.getClass(), "docInfo", null);
        setBooleanField(term2552, term2552.getClass(), "unknown", false);
        setBooleanField(term2552, term2552.getClass(), "resolved", false);
        setField(term2552, term2552.getClass(), "resolveResult", null);
        setField(term2552, term2552.getClass(), "registry", null);
        setField(term2527, term2527.getClass(), "ownerFunction", term2552);
        setBooleanField(term2527, term2527.getClass(), "prettyPrint", true);
        setBooleanField(term2527, term2527.getClass(), "visited", true);
        setField(term2560, term2560.getClass(), "info", null);
        setField(term2560, term2560.getClass(), "documentation", null);
        setField(term2560, term2560.getClass(), "associatedNode", null);
        setField(term2560, term2560.getClass(), "visibility", null);
        setIntField(term2560, term2560.getClass(), "bitset", 0);
        setField(term2560, term2560.getClass(), "type", null);
        setField(term2560, term2560.getClass(), "thisType", null);
        setBooleanField(term2560, term2560.getClass(), "includeDocumentation", false);
        setField(term2527, term2527.getClass(), "docInfo", term2560);
        setBooleanField(term2527, term2527.getClass(), "unknown", false);
        setBooleanField(term2527, term2527.getClass(), "resolved", true);
        setField(term2527, term2527.getClass(), "resolveResult", null);
        setField(term2527, term2527.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term2527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


