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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_getOwnerFunction_91232218377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;
     Object term9644;
     Object term9612;

    public PrototypeObjectType_getOwnerFunction_91232218377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3170 = new HashMap();
        term3157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3190 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3157, term3157.getClass(), "className", "WBAOTqErtm");
        setField(term3157, term3157.getClass(), "properties", term3170);
        setBooleanField(term3157, term3157.getClass(), "nativeType", true);
        setField(term3157, term3157.getClass(), "implicitPrototypeFallback", null);
        setField(term3182, term3182.getClass(), "call", null);
        setField(term3182, term3182.getClass(), "prototypeSlot", null);
        setField(term3182, term3182.getClass(), "kind", null);
        setField(term3182, term3182.getClass(), "typeOfThis", null);
        setField(term3182, term3182.getClass(), "source", null);
        setField(term3182, term3182.getClass(), "implementedInterfaces", null);
        setField(term3182, term3182.getClass(), "extendedInterfaces", null);
        setField(term3182, term3182.getClass(), "subTypes", null);
        setField(term3182, term3182.getClass(), "templateTypeName", null);
        setField(term3182, term3182.getClass(), "className", null);
        setField(term3182, term3182.getClass(), "properties", null);
        setBooleanField(term3182, term3182.getClass(), "nativeType", false);
        setField(term3182, term3182.getClass(), "implicitPrototypeFallback", null);
        setField(term3182, term3182.getClass(), "ownerFunction", null);
        setBooleanField(term3182, term3182.getClass(), "prettyPrint", false);
        setBooleanField(term3182, term3182.getClass(), "visited", false);
        setField(term3182, term3182.getClass(), "docInfo", null);
        setBooleanField(term3182, term3182.getClass(), "unknown", false);
        setBooleanField(term3182, term3182.getClass(), "resolved", false);
        setField(term3182, term3182.getClass(), "resolveResult", null);
        setField(term3182, term3182.getClass(), "registry", null);
        setField(term3157, term3157.getClass(), "ownerFunction", term3182);
        setBooleanField(term3157, term3157.getClass(), "prettyPrint", false);
        setBooleanField(term3157, term3157.getClass(), "visited", true);
        setField(term3190, term3190.getClass(), "info", null);
        setField(term3190, term3190.getClass(), "documentation", null);
        setField(term3190, term3190.getClass(), "associatedNode", null);
        setField(term3190, term3190.getClass(), "visibility", null);
        setIntField(term3190, term3190.getClass(), "bitset", 0);
        setField(term3190, term3190.getClass(), "type", null);
        setField(term3190, term3190.getClass(), "thisType", null);
        setBooleanField(term3190, term3190.getClass(), "includeDocumentation", false);
        setField(term3157, term3157.getClass(), "docInfo", term3190);
        setBooleanField(term3157, term3157.getClass(), "unknown", true);
        setBooleanField(term3157, term3157.getClass(), "resolved", true);
        setField(term3157, term3157.getClass(), "resolveResult", null);
        setField(term3157, term3157.getClass(), "registry", null);
        HashMap term9647 = new HashMap();
        term9644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9649 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9644, term9644.getClass(), "className", "WBAOTqErtm");
        setField(term9644, term9644.getClass(), "properties", term9647);
        setBooleanField(term9644, term9644.getClass(), "nativeType", true);
        setField(term9644, term9644.getClass(), "implicitPrototypeFallback", null);
        setField(term9648, term9648.getClass(), "call", null);
        setField(term9648, term9648.getClass(), "prototypeSlot", null);
        setField(term9648, term9648.getClass(), "kind", null);
        setField(term9648, term9648.getClass(), "typeOfThis", null);
        setField(term9648, term9648.getClass(), "source", null);
        setField(term9648, term9648.getClass(), "implementedInterfaces", null);
        setField(term9648, term9648.getClass(), "extendedInterfaces", null);
        setField(term9648, term9648.getClass(), "subTypes", null);
        setField(term9648, term9648.getClass(), "templateTypeName", null);
        setField(term9648, term9648.getClass(), "className", null);
        setField(term9648, term9648.getClass(), "properties", null);
        setBooleanField(term9648, term9648.getClass(), "nativeType", false);
        setField(term9648, term9648.getClass(), "implicitPrototypeFallback", null);
        setField(term9648, term9648.getClass(), "ownerFunction", null);
        setBooleanField(term9648, term9648.getClass(), "prettyPrint", false);
        setBooleanField(term9648, term9648.getClass(), "visited", false);
        setField(term9648, term9648.getClass(), "docInfo", null);
        setBooleanField(term9648, term9648.getClass(), "unknown", false);
        setBooleanField(term9648, term9648.getClass(), "resolved", false);
        setField(term9648, term9648.getClass(), "resolveResult", null);
        setField(term9648, term9648.getClass(), "registry", null);
        setField(term9644, term9644.getClass(), "ownerFunction", term9648);
        setBooleanField(term9644, term9644.getClass(), "prettyPrint", false);
        setBooleanField(term9644, term9644.getClass(), "visited", true);
        setField(term9649, term9649.getClass(), "info", null);
        setField(term9649, term9649.getClass(), "documentation", null);
        setField(term9649, term9649.getClass(), "associatedNode", null);
        setField(term9649, term9649.getClass(), "visibility", null);
        setIntField(term9649, term9649.getClass(), "bitset", 0);
        setField(term9649, term9649.getClass(), "type", null);
        setField(term9649, term9649.getClass(), "thisType", null);
        setBooleanField(term9649, term9649.getClass(), "includeDocumentation", false);
        setField(term9644, term9644.getClass(), "docInfo", term9649);
        setBooleanField(term9644, term9644.getClass(), "unknown", true);
        setBooleanField(term9644, term9644.getClass(), "resolved", true);
        setField(term9644, term9644.getClass(), "resolveResult", null);
        setField(term9644, term9644.getClass(), "registry", null);
        term9612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term9612, term9612.getClass(), "call", null);
        setField(term9612, term9612.getClass(), "prototypeSlot", null);
        setField(term9612, term9612.getClass(), "kind", null);
        setField(term9612, term9612.getClass(), "typeOfThis", null);
        setField(term9612, term9612.getClass(), "source", null);
        setField(term9612, term9612.getClass(), "implementedInterfaces", null);
        setField(term9612, term9612.getClass(), "extendedInterfaces", null);
        setField(term9612, term9612.getClass(), "subTypes", null);
        setField(term9612, term9612.getClass(), "templateTypeName", null);
        setField(term9612, term9612.getClass(), "className", null);
        setField(term9612, term9612.getClass(), "properties", null);
        setBooleanField(term9612, term9612.getClass(), "nativeType", false);
        setField(term9612, term9612.getClass(), "implicitPrototypeFallback", null);
        setField(term9612, term9612.getClass(), "ownerFunction", null);
        setBooleanField(term9612, term9612.getClass(), "prettyPrint", false);
        setBooleanField(term9612, term9612.getClass(), "visited", false);
        setField(term9612, term9612.getClass(), "docInfo", null);
        setBooleanField(term9612, term9612.getClass(), "unknown", false);
        setBooleanField(term9612, term9612.getClass(), "resolved", false);
        setField(term9612, term9612.getClass(), "resolveResult", null);
        setField(term9612, term9612.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOwnerFunction", argTypes, term3157, args);
        assertTrue(recursiveEquals(term3157, term9644));
        assertTrue(recursiveEquals(retValue, term9612));
    }

};


