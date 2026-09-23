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

public class PrototypeObjectType_getPropertiesCount_124241641745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;
     Object term4750;

    public PrototypeObjectType_getPropertiesCount_124241641745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term299 = new HashMap();
        term286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term319 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term286, term286.getClass(), "className", "BKLfkLiZTH");
        setField(term286, term286.getClass(), "properties", term299);
        setBooleanField(term286, term286.getClass(), "nativeType", false);
        setField(term286, term286.getClass(), "implicitPrototypeFallback", null);
        setField(term311, term311.getClass(), "call", null);
        setField(term311, term311.getClass(), "prototypeSlot", null);
        setField(term311, term311.getClass(), "kind", null);
        setField(term311, term311.getClass(), "typeOfThis", null);
        setField(term311, term311.getClass(), "source", null);
        setField(term311, term311.getClass(), "implementedInterfaces", null);
        setField(term311, term311.getClass(), "extendedInterfaces", null);
        setField(term311, term311.getClass(), "subTypes", null);
        setField(term311, term311.getClass(), "templateTypeName", null);
        setField(term311, term311.getClass(), "className", null);
        setField(term311, term311.getClass(), "properties", null);
        setBooleanField(term311, term311.getClass(), "nativeType", false);
        setField(term311, term311.getClass(), "implicitPrototypeFallback", null);
        setField(term311, term311.getClass(), "ownerFunction", null);
        setBooleanField(term311, term311.getClass(), "prettyPrint", false);
        setBooleanField(term311, term311.getClass(), "visited", false);
        setField(term311, term311.getClass(), "docInfo", null);
        setBooleanField(term311, term311.getClass(), "unknown", false);
        setBooleanField(term311, term311.getClass(), "resolved", false);
        setField(term311, term311.getClass(), "resolveResult", null);
        setField(term311, term311.getClass(), "registry", null);
        setField(term286, term286.getClass(), "ownerFunction", term311);
        setBooleanField(term286, term286.getClass(), "prettyPrint", false);
        setBooleanField(term286, term286.getClass(), "visited", true);
        setField(term319, term319.getClass(), "info", null);
        setField(term319, term319.getClass(), "documentation", null);
        setField(term319, term319.getClass(), "associatedNode", null);
        setField(term319, term319.getClass(), "visibility", null);
        setIntField(term319, term319.getClass(), "bitset", 0);
        setField(term319, term319.getClass(), "type", null);
        setField(term319, term319.getClass(), "thisType", null);
        setBooleanField(term319, term319.getClass(), "includeDocumentation", false);
        setField(term286, term286.getClass(), "docInfo", term319);
        setBooleanField(term286, term286.getClass(), "unknown", true);
        setBooleanField(term286, term286.getClass(), "resolved", true);
        setField(term286, term286.getClass(), "resolveResult", null);
        setField(term286, term286.getClass(), "registry", null);
        HashMap term4753 = new HashMap();
        term4750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term4754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term4755 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term4750, term4750.getClass(), "className", "BKLfkLiZTH");
        setField(term4750, term4750.getClass(), "properties", term4753);
        setBooleanField(term4750, term4750.getClass(), "nativeType", false);
        setField(term4750, term4750.getClass(), "implicitPrototypeFallback", null);
        setField(term4754, term4754.getClass(), "call", null);
        setField(term4754, term4754.getClass(), "prototypeSlot", null);
        setField(term4754, term4754.getClass(), "kind", null);
        setField(term4754, term4754.getClass(), "typeOfThis", null);
        setField(term4754, term4754.getClass(), "source", null);
        setField(term4754, term4754.getClass(), "implementedInterfaces", null);
        setField(term4754, term4754.getClass(), "extendedInterfaces", null);
        setField(term4754, term4754.getClass(), "subTypes", null);
        setField(term4754, term4754.getClass(), "templateTypeName", null);
        setField(term4754, term4754.getClass(), "className", null);
        setField(term4754, term4754.getClass(), "properties", null);
        setBooleanField(term4754, term4754.getClass(), "nativeType", false);
        setField(term4754, term4754.getClass(), "implicitPrototypeFallback", null);
        setField(term4754, term4754.getClass(), "ownerFunction", null);
        setBooleanField(term4754, term4754.getClass(), "prettyPrint", false);
        setBooleanField(term4754, term4754.getClass(), "visited", false);
        setField(term4754, term4754.getClass(), "docInfo", null);
        setBooleanField(term4754, term4754.getClass(), "unknown", false);
        setBooleanField(term4754, term4754.getClass(), "resolved", false);
        setField(term4754, term4754.getClass(), "resolveResult", null);
        setField(term4754, term4754.getClass(), "registry", null);
        setField(term4750, term4750.getClass(), "ownerFunction", term4754);
        setBooleanField(term4750, term4750.getClass(), "prettyPrint", false);
        setBooleanField(term4750, term4750.getClass(), "visited", true);
        setField(term4755, term4755.getClass(), "info", null);
        setField(term4755, term4755.getClass(), "documentation", null);
        setField(term4755, term4755.getClass(), "associatedNode", null);
        setField(term4755, term4755.getClass(), "visibility", null);
        setIntField(term4755, term4755.getClass(), "bitset", 0);
        setField(term4755, term4755.getClass(), "type", null);
        setField(term4755, term4755.getClass(), "thisType", null);
        setBooleanField(term4755, term4755.getClass(), "includeDocumentation", false);
        setField(term4750, term4750.getClass(), "docInfo", term4755);
        setBooleanField(term4750, term4750.getClass(), "unknown", true);
        setBooleanField(term4750, term4750.getClass(), "resolved", true);
        setField(term4750, term4750.getClass(), "resolveResult", null);
        setField(term4750, term4750.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertiesCount", argTypes, term286, args);
        assertTrue(recursiveEquals(term286, term4750));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


