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

public class PrototypeObjectType_getPropertiesCount_124241641746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;
     Object term4867;

    public PrototypeObjectType_getPropertiesCount_124241641746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term301 = new HashMap();
        term288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term322 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term288, term288.getClass(), "className", "BKLfkLiZTH");
        setField(term288, term288.getClass(), "properties", term301);
        setBooleanField(term288, term288.getClass(), "nativeType", false);
        setField(term288, term288.getClass(), "implicitPrototypeFallback", null);
        setField(term313, term313.getClass(), "call", null);
        setField(term313, term313.getClass(), "prototypeSlot", null);
        setField(term313, term313.getClass(), "kind", null);
        setField(term313, term313.getClass(), "typeOfThis", null);
        setField(term313, term313.getClass(), "source", null);
        setField(term313, term313.getClass(), "implementedInterfaces", null);
        setField(term313, term313.getClass(), "extendedInterfaces", null);
        setField(term313, term313.getClass(), "subTypes", null);
        setField(term313, term313.getClass(), "templateTypeNames", null);
        setField(term313, term313.getClass(), "className", null);
        setField(term313, term313.getClass(), "properties", null);
        setBooleanField(term313, term313.getClass(), "nativeType", false);
        setField(term313, term313.getClass(), "implicitPrototypeFallback", null);
        setField(term313, term313.getClass(), "ownerFunction", null);
        setBooleanField(term313, term313.getClass(), "prettyPrint", false);
        setBooleanField(term313, term313.getClass(), "visited", false);
        setField(term313, term313.getClass(), "docInfo", null);
        setBooleanField(term313, term313.getClass(), "unknown", false);
        setBooleanField(term313, term313.getClass(), "resolved", false);
        setField(term313, term313.getClass(), "resolveResult", null);
        setBooleanField(term313, term313.getClass(), "inTemplatedCheckVisit", false);
        setField(term313, term313.getClass(), "registry", null);
        setField(term288, term288.getClass(), "ownerFunction", term313);
        setBooleanField(term288, term288.getClass(), "prettyPrint", false);
        setBooleanField(term288, term288.getClass(), "visited", true);
        setField(term322, term322.getClass(), "info", null);
        setField(term322, term322.getClass(), "documentation", null);
        setField(term322, term322.getClass(), "associatedNode", null);
        setField(term322, term322.getClass(), "visibility", null);
        setIntField(term322, term322.getClass(), "bitset", 0);
        setField(term322, term322.getClass(), "type", null);
        setField(term322, term322.getClass(), "thisType", null);
        setBooleanField(term322, term322.getClass(), "includeDocumentation", false);
        setField(term288, term288.getClass(), "docInfo", term322);
        setBooleanField(term288, term288.getClass(), "unknown", true);
        setBooleanField(term288, term288.getClass(), "resolved", true);
        setField(term288, term288.getClass(), "resolveResult", null);
        setBooleanField(term288, term288.getClass(), "inTemplatedCheckVisit", false);
        setField(term288, term288.getClass(), "registry", null);
        HashMap term4870 = new HashMap();
        term4867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term4871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term4872 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term4867, term4867.getClass(), "className", "BKLfkLiZTH");
        setField(term4867, term4867.getClass(), "properties", term4870);
        setBooleanField(term4867, term4867.getClass(), "nativeType", false);
        setField(term4867, term4867.getClass(), "implicitPrototypeFallback", null);
        setField(term4871, term4871.getClass(), "call", null);
        setField(term4871, term4871.getClass(), "prototypeSlot", null);
        setField(term4871, term4871.getClass(), "kind", null);
        setField(term4871, term4871.getClass(), "typeOfThis", null);
        setField(term4871, term4871.getClass(), "source", null);
        setField(term4871, term4871.getClass(), "implementedInterfaces", null);
        setField(term4871, term4871.getClass(), "extendedInterfaces", null);
        setField(term4871, term4871.getClass(), "subTypes", null);
        setField(term4871, term4871.getClass(), "templateTypeNames", null);
        setField(term4871, term4871.getClass(), "className", null);
        setField(term4871, term4871.getClass(), "properties", null);
        setBooleanField(term4871, term4871.getClass(), "nativeType", false);
        setField(term4871, term4871.getClass(), "implicitPrototypeFallback", null);
        setField(term4871, term4871.getClass(), "ownerFunction", null);
        setBooleanField(term4871, term4871.getClass(), "prettyPrint", false);
        setBooleanField(term4871, term4871.getClass(), "visited", false);
        setField(term4871, term4871.getClass(), "docInfo", null);
        setBooleanField(term4871, term4871.getClass(), "unknown", false);
        setBooleanField(term4871, term4871.getClass(), "resolved", false);
        setField(term4871, term4871.getClass(), "resolveResult", null);
        setBooleanField(term4871, term4871.getClass(), "inTemplatedCheckVisit", false);
        setField(term4871, term4871.getClass(), "registry", null);
        setField(term4867, term4867.getClass(), "ownerFunction", term4871);
        setBooleanField(term4867, term4867.getClass(), "prettyPrint", false);
        setBooleanField(term4867, term4867.getClass(), "visited", true);
        setField(term4872, term4872.getClass(), "info", null);
        setField(term4872, term4872.getClass(), "documentation", null);
        setField(term4872, term4872.getClass(), "associatedNode", null);
        setField(term4872, term4872.getClass(), "visibility", null);
        setIntField(term4872, term4872.getClass(), "bitset", 0);
        setField(term4872, term4872.getClass(), "type", null);
        setField(term4872, term4872.getClass(), "thisType", null);
        setBooleanField(term4872, term4872.getClass(), "includeDocumentation", false);
        setField(term4867, term4867.getClass(), "docInfo", term4872);
        setBooleanField(term4867, term4867.getClass(), "unknown", true);
        setBooleanField(term4867, term4867.getClass(), "resolved", true);
        setField(term4867, term4867.getClass(), "resolveResult", null);
        setBooleanField(term4867, term4867.getClass(), "inTemplatedCheckVisit", false);
        setField(term4867, term4867.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertiesCount", argTypes, term288, args);
        assertTrue(recursiveEquals(term288, term4867));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


