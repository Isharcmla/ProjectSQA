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

public class PrototypeObjectType_getPropertiesCount_124241641744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;
     Object term4702;

    public PrototypeObjectType_getPropertiesCount_124241641744() {
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
        HashMap term4705 = new HashMap();
        term4702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term4706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term4707 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term4702, term4702.getClass(), "className", "BKLfkLiZTH");
        setField(term4702, term4702.getClass(), "properties", term4705);
        setBooleanField(term4702, term4702.getClass(), "nativeType", false);
        setField(term4702, term4702.getClass(), "implicitPrototypeFallback", null);
        setField(term4706, term4706.getClass(), "call", null);
        setField(term4706, term4706.getClass(), "prototypeSlot", null);
        setField(term4706, term4706.getClass(), "kind", null);
        setField(term4706, term4706.getClass(), "typeOfThis", null);
        setField(term4706, term4706.getClass(), "source", null);
        setField(term4706, term4706.getClass(), "implementedInterfaces", null);
        setField(term4706, term4706.getClass(), "extendedInterfaces", null);
        setField(term4706, term4706.getClass(), "subTypes", null);
        setField(term4706, term4706.getClass(), "templateTypeName", null);
        setField(term4706, term4706.getClass(), "className", null);
        setField(term4706, term4706.getClass(), "properties", null);
        setBooleanField(term4706, term4706.getClass(), "nativeType", false);
        setField(term4706, term4706.getClass(), "implicitPrototypeFallback", null);
        setField(term4706, term4706.getClass(), "ownerFunction", null);
        setBooleanField(term4706, term4706.getClass(), "prettyPrint", false);
        setBooleanField(term4706, term4706.getClass(), "visited", false);
        setField(term4706, term4706.getClass(), "docInfo", null);
        setBooleanField(term4706, term4706.getClass(), "unknown", false);
        setBooleanField(term4706, term4706.getClass(), "resolved", false);
        setField(term4706, term4706.getClass(), "resolveResult", null);
        setField(term4706, term4706.getClass(), "registry", null);
        setField(term4702, term4702.getClass(), "ownerFunction", term4706);
        setBooleanField(term4702, term4702.getClass(), "prettyPrint", false);
        setBooleanField(term4702, term4702.getClass(), "visited", true);
        setField(term4707, term4707.getClass(), "info", null);
        setField(term4707, term4707.getClass(), "documentation", null);
        setField(term4707, term4707.getClass(), "associatedNode", null);
        setField(term4707, term4707.getClass(), "visibility", null);
        setIntField(term4707, term4707.getClass(), "bitset", 0);
        setField(term4707, term4707.getClass(), "type", null);
        setField(term4707, term4707.getClass(), "thisType", null);
        setBooleanField(term4707, term4707.getClass(), "includeDocumentation", false);
        setField(term4702, term4702.getClass(), "docInfo", term4707);
        setBooleanField(term4702, term4702.getClass(), "unknown", true);
        setBooleanField(term4702, term4702.getClass(), "resolved", true);
        setField(term4702, term4702.getClass(), "resolveResult", null);
        setField(term4702, term4702.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertiesCount", argTypes, term286, args);
        assertTrue(recursiveEquals(term286, term4702));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


