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
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72015;
     Object term72229;
     Object term72314;
     Object term72315;
     Object term72246;

    public JSType_getGreatestSubtype_1951394506339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term72115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term72115, term72115.getClass(), "unknown", false);
        setField(term72015, term72015.getClass(), "referencedType", term72115);
        term72229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term72229, term72229.getClass(), "unknown", false);
        term72314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term72314, term72314.getClass(), "className", null);
        setField(term72314, term72314.getClass(), "properties", null);
        setBooleanField(term72314, term72314.getClass(), "nativeType", false);
        setField(term72314, term72314.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term72314, term72314.getClass(), "prettyPrint", false);
        setBooleanField(term72314, term72314.getClass(), "visited", false);
        setField(term72314, term72314.getClass(), "docInfo", null);
        setBooleanField(term72314, term72314.getClass(), "unknown", false);
        setBooleanField(term72314, term72314.getClass(), "resolved", false);
        setField(term72314, term72314.getClass(), "resolveResult", null);
        setField(term72314, term72314.getClass(), "registry", null);
        term72315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term72316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term72315, term72315.getClass(), "parameterType", null);
        setField(term72316, term72316.getClass(), "call", null);
        setField(term72316, term72316.getClass(), "prototype", null);
        setField(term72316, term72316.getClass(), "kind", null);
        setField(term72316, term72316.getClass(), "typeOfThis", null);
        setField(term72316, term72316.getClass(), "source", null);
        setField(term72316, term72316.getClass(), "implementedInterfaces", null);
        setField(term72316, term72316.getClass(), "subTypes", null);
        setField(term72316, term72316.getClass(), "templateTypeName", null);
        setField(term72316, term72316.getClass(), "className", null);
        setField(term72316, term72316.getClass(), "properties", null);
        setBooleanField(term72316, term72316.getClass(), "nativeType", false);
        setField(term72316, term72316.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term72316, term72316.getClass(), "prettyPrint", false);
        setBooleanField(term72316, term72316.getClass(), "visited", false);
        setField(term72316, term72316.getClass(), "docInfo", null);
        setBooleanField(term72316, term72316.getClass(), "unknown", false);
        setBooleanField(term72316, term72316.getClass(), "resolved", false);
        setField(term72316, term72316.getClass(), "resolveResult", null);
        setField(term72316, term72316.getClass(), "registry", null);
        setField(term72315, term72315.getClass(), "referencedType", term72316);
        setField(term72315, term72315.getClass(), "referencedObjType", null);
        setBooleanField(term72315, term72315.getClass(), "visited", false);
        setField(term72315, term72315.getClass(), "docInfo", null);
        setBooleanField(term72315, term72315.getClass(), "unknown", false);
        setBooleanField(term72315, term72315.getClass(), "resolved", false);
        setField(term72315, term72315.getClass(), "resolveResult", null);
        setField(term72315, term72315.getClass(), "registry", null);
        term72246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term72247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term72246, term72246.getClass(), "parameterType", null);
        setField(term72247, term72247.getClass(), "call", null);
        setField(term72247, term72247.getClass(), "prototype", null);
        setField(term72247, term72247.getClass(), "kind", null);
        setField(term72247, term72247.getClass(), "typeOfThis", null);
        setField(term72247, term72247.getClass(), "source", null);
        setField(term72247, term72247.getClass(), "implementedInterfaces", null);
        setField(term72247, term72247.getClass(), "subTypes", null);
        setField(term72247, term72247.getClass(), "templateTypeName", null);
        setField(term72247, term72247.getClass(), "className", null);
        setField(term72247, term72247.getClass(), "properties", null);
        setBooleanField(term72247, term72247.getClass(), "nativeType", false);
        setField(term72247, term72247.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term72247, term72247.getClass(), "prettyPrint", false);
        setBooleanField(term72247, term72247.getClass(), "visited", false);
        setField(term72247, term72247.getClass(), "docInfo", null);
        setBooleanField(term72247, term72247.getClass(), "unknown", false);
        setBooleanField(term72247, term72247.getClass(), "resolved", false);
        setField(term72247, term72247.getClass(), "resolveResult", null);
        setField(term72247, term72247.getClass(), "registry", null);
        setField(term72246, term72246.getClass(), "referencedType", term72247);
        setField(term72246, term72246.getClass(), "referencedObjType", null);
        setBooleanField(term72246, term72246.getClass(), "visited", false);
        setField(term72246, term72246.getClass(), "docInfo", null);
        setBooleanField(term72246, term72246.getClass(), "unknown", false);
        setBooleanField(term72246, term72246.getClass(), "resolved", false);
        setField(term72246, term72246.getClass(), "resolveResult", null);
        setField(term72246, term72246.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term72015;
        args[1] = term72229;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term72015, term72314));
        assertTrue(recursiveEquals(term72229, term72315));
        assertTrue(recursiveEquals(retValue, term72246));
    }

};


