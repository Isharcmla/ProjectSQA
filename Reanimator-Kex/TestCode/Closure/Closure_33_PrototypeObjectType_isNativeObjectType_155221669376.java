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

public class PrototypeObjectType_isNativeObjectType_155221669376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2671;
     Object term9072;

    public PrototypeObjectType_isNativeObjectType_155221669376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2684 = new HashMap();
        term2671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2671, term2671.getClass(), "className", "MHGKyEnwKc");
        setField(term2671, term2671.getClass(), "properties", term2684);
        setBooleanField(term2671, term2671.getClass(), "nativeType", true);
        setField(term2671, term2671.getClass(), "implicitPrototypeFallback", null);
        setField(term2696, term2696.getClass(), "call", null);
        setField(term2696, term2696.getClass(), "prototypeSlot", null);
        setField(term2696, term2696.getClass(), "kind", null);
        setField(term2696, term2696.getClass(), "typeOfThis", null);
        setField(term2696, term2696.getClass(), "source", null);
        setField(term2696, term2696.getClass(), "implementedInterfaces", null);
        setField(term2696, term2696.getClass(), "extendedInterfaces", null);
        setField(term2696, term2696.getClass(), "subTypes", null);
        setField(term2696, term2696.getClass(), "templateTypeName", null);
        setField(term2696, term2696.getClass(), "className", null);
        setField(term2696, term2696.getClass(), "properties", null);
        setBooleanField(term2696, term2696.getClass(), "nativeType", false);
        setField(term2696, term2696.getClass(), "implicitPrototypeFallback", null);
        setField(term2696, term2696.getClass(), "ownerFunction", null);
        setBooleanField(term2696, term2696.getClass(), "prettyPrint", false);
        setBooleanField(term2696, term2696.getClass(), "visited", false);
        setField(term2696, term2696.getClass(), "docInfo", null);
        setBooleanField(term2696, term2696.getClass(), "unknown", false);
        setBooleanField(term2696, term2696.getClass(), "resolved", false);
        setField(term2696, term2696.getClass(), "resolveResult", null);
        setField(term2696, term2696.getClass(), "registry", null);
        setField(term2671, term2671.getClass(), "ownerFunction", term2696);
        setBooleanField(term2671, term2671.getClass(), "prettyPrint", true);
        setBooleanField(term2671, term2671.getClass(), "visited", false);
        setField(term2704, term2704.getClass(), "info", null);
        setField(term2704, term2704.getClass(), "documentation", null);
        setField(term2704, term2704.getClass(), "associatedNode", null);
        setField(term2704, term2704.getClass(), "visibility", null);
        setIntField(term2704, term2704.getClass(), "bitset", 0);
        setField(term2704, term2704.getClass(), "type", null);
        setField(term2704, term2704.getClass(), "thisType", null);
        setBooleanField(term2704, term2704.getClass(), "includeDocumentation", false);
        setField(term2671, term2671.getClass(), "docInfo", term2704);
        setBooleanField(term2671, term2671.getClass(), "unknown", false);
        setBooleanField(term2671, term2671.getClass(), "resolved", false);
        setField(term2671, term2671.getClass(), "resolveResult", null);
        setField(term2671, term2671.getClass(), "registry", null);
        HashMap term9075 = new HashMap();
        term9072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9077 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9072, term9072.getClass(), "className", "MHGKyEnwKc");
        setField(term9072, term9072.getClass(), "properties", term9075);
        setBooleanField(term9072, term9072.getClass(), "nativeType", true);
        setField(term9072, term9072.getClass(), "implicitPrototypeFallback", null);
        setField(term9076, term9076.getClass(), "call", null);
        setField(term9076, term9076.getClass(), "prototypeSlot", null);
        setField(term9076, term9076.getClass(), "kind", null);
        setField(term9076, term9076.getClass(), "typeOfThis", null);
        setField(term9076, term9076.getClass(), "source", null);
        setField(term9076, term9076.getClass(), "implementedInterfaces", null);
        setField(term9076, term9076.getClass(), "extendedInterfaces", null);
        setField(term9076, term9076.getClass(), "subTypes", null);
        setField(term9076, term9076.getClass(), "templateTypeName", null);
        setField(term9076, term9076.getClass(), "className", null);
        setField(term9076, term9076.getClass(), "properties", null);
        setBooleanField(term9076, term9076.getClass(), "nativeType", false);
        setField(term9076, term9076.getClass(), "implicitPrototypeFallback", null);
        setField(term9076, term9076.getClass(), "ownerFunction", null);
        setBooleanField(term9076, term9076.getClass(), "prettyPrint", false);
        setBooleanField(term9076, term9076.getClass(), "visited", false);
        setField(term9076, term9076.getClass(), "docInfo", null);
        setBooleanField(term9076, term9076.getClass(), "unknown", false);
        setBooleanField(term9076, term9076.getClass(), "resolved", false);
        setField(term9076, term9076.getClass(), "resolveResult", null);
        setField(term9076, term9076.getClass(), "registry", null);
        setField(term9072, term9072.getClass(), "ownerFunction", term9076);
        setBooleanField(term9072, term9072.getClass(), "prettyPrint", true);
        setBooleanField(term9072, term9072.getClass(), "visited", false);
        setField(term9077, term9077.getClass(), "info", null);
        setField(term9077, term9077.getClass(), "documentation", null);
        setField(term9077, term9077.getClass(), "associatedNode", null);
        setField(term9077, term9077.getClass(), "visibility", null);
        setIntField(term9077, term9077.getClass(), "bitset", 0);
        setField(term9077, term9077.getClass(), "type", null);
        setField(term9077, term9077.getClass(), "thisType", null);
        setBooleanField(term9077, term9077.getClass(), "includeDocumentation", false);
        setField(term9072, term9072.getClass(), "docInfo", term9077);
        setBooleanField(term9072, term9072.getClass(), "unknown", false);
        setBooleanField(term9072, term9072.getClass(), "resolved", false);
        setField(term9072, term9072.getClass(), "resolveResult", null);
        setField(term9072, term9072.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNativeObjectType", argTypes, term2671, args);
        assertTrue(recursiveEquals(term2671, term9072));
    }

};


