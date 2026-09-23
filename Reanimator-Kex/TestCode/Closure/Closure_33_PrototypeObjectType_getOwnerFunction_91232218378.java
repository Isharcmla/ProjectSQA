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

public class PrototypeObjectType_getOwnerFunction_91232218378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;
     Object term9692;
     Object term9529;

    public PrototypeObjectType_getOwnerFunction_91232218378() {
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
        HashMap term9695 = new HashMap();
        term9692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9697 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9692, term9692.getClass(), "className", "WBAOTqErtm");
        setField(term9692, term9692.getClass(), "properties", term9695);
        setBooleanField(term9692, term9692.getClass(), "nativeType", true);
        setField(term9692, term9692.getClass(), "implicitPrototypeFallback", null);
        setField(term9696, term9696.getClass(), "call", null);
        setField(term9696, term9696.getClass(), "prototypeSlot", null);
        setField(term9696, term9696.getClass(), "kind", null);
        setField(term9696, term9696.getClass(), "typeOfThis", null);
        setField(term9696, term9696.getClass(), "source", null);
        setField(term9696, term9696.getClass(), "implementedInterfaces", null);
        setField(term9696, term9696.getClass(), "extendedInterfaces", null);
        setField(term9696, term9696.getClass(), "subTypes", null);
        setField(term9696, term9696.getClass(), "templateTypeName", null);
        setField(term9696, term9696.getClass(), "className", null);
        setField(term9696, term9696.getClass(), "properties", null);
        setBooleanField(term9696, term9696.getClass(), "nativeType", false);
        setField(term9696, term9696.getClass(), "implicitPrototypeFallback", null);
        setField(term9696, term9696.getClass(), "ownerFunction", null);
        setBooleanField(term9696, term9696.getClass(), "prettyPrint", false);
        setBooleanField(term9696, term9696.getClass(), "visited", false);
        setField(term9696, term9696.getClass(), "docInfo", null);
        setBooleanField(term9696, term9696.getClass(), "unknown", false);
        setBooleanField(term9696, term9696.getClass(), "resolved", false);
        setField(term9696, term9696.getClass(), "resolveResult", null);
        setField(term9696, term9696.getClass(), "registry", null);
        setField(term9692, term9692.getClass(), "ownerFunction", term9696);
        setBooleanField(term9692, term9692.getClass(), "prettyPrint", false);
        setBooleanField(term9692, term9692.getClass(), "visited", true);
        setField(term9697, term9697.getClass(), "info", null);
        setField(term9697, term9697.getClass(), "documentation", null);
        setField(term9697, term9697.getClass(), "associatedNode", null);
        setField(term9697, term9697.getClass(), "visibility", null);
        setIntField(term9697, term9697.getClass(), "bitset", 0);
        setField(term9697, term9697.getClass(), "type", null);
        setField(term9697, term9697.getClass(), "thisType", null);
        setBooleanField(term9697, term9697.getClass(), "includeDocumentation", false);
        setField(term9692, term9692.getClass(), "docInfo", term9697);
        setBooleanField(term9692, term9692.getClass(), "unknown", true);
        setBooleanField(term9692, term9692.getClass(), "resolved", true);
        setField(term9692, term9692.getClass(), "resolveResult", null);
        setField(term9692, term9692.getClass(), "registry", null);
        term9529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term9529, term9529.getClass(), "call", null);
        setField(term9529, term9529.getClass(), "prototypeSlot", null);
        setField(term9529, term9529.getClass(), "kind", null);
        setField(term9529, term9529.getClass(), "typeOfThis", null);
        setField(term9529, term9529.getClass(), "source", null);
        setField(term9529, term9529.getClass(), "implementedInterfaces", null);
        setField(term9529, term9529.getClass(), "extendedInterfaces", null);
        setField(term9529, term9529.getClass(), "subTypes", null);
        setField(term9529, term9529.getClass(), "templateTypeName", null);
        setField(term9529, term9529.getClass(), "className", null);
        setField(term9529, term9529.getClass(), "properties", null);
        setBooleanField(term9529, term9529.getClass(), "nativeType", false);
        setField(term9529, term9529.getClass(), "implicitPrototypeFallback", null);
        setField(term9529, term9529.getClass(), "ownerFunction", null);
        setBooleanField(term9529, term9529.getClass(), "prettyPrint", false);
        setBooleanField(term9529, term9529.getClass(), "visited", false);
        setField(term9529, term9529.getClass(), "docInfo", null);
        setBooleanField(term9529, term9529.getClass(), "unknown", false);
        setBooleanField(term9529, term9529.getClass(), "resolved", false);
        setField(term9529, term9529.getClass(), "resolveResult", null);
        setField(term9529, term9529.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOwnerFunction", argTypes, term3157, args);
        assertTrue(recursiveEquals(term3157, term9692));
        assertTrue(recursiveEquals(retValue, term9529));
    }

};


