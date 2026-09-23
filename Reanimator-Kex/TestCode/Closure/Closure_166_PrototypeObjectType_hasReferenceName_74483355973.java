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

public class PrototypeObjectType_hasReferenceName_74483355973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2513;
     Object term8818;

    public PrototypeObjectType_hasReferenceName_74483355973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2526 = new HashMap();
        term2513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2547 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2513, term2513.getClass(), "className", "CFyoseFGLF");
        setField(term2513, term2513.getClass(), "properties", term2526);
        setBooleanField(term2513, term2513.getClass(), "nativeType", false);
        setField(term2513, term2513.getClass(), "implicitPrototypeFallback", null);
        setField(term2538, term2538.getClass(), "call", null);
        setField(term2538, term2538.getClass(), "prototypeSlot", null);
        setField(term2538, term2538.getClass(), "kind", null);
        setField(term2538, term2538.getClass(), "typeOfThis", null);
        setField(term2538, term2538.getClass(), "source", null);
        setField(term2538, term2538.getClass(), "implementedInterfaces", null);
        setField(term2538, term2538.getClass(), "extendedInterfaces", null);
        setField(term2538, term2538.getClass(), "subTypes", null);
        setField(term2538, term2538.getClass(), "templateTypeNames", null);
        setField(term2538, term2538.getClass(), "className", null);
        setField(term2538, term2538.getClass(), "properties", null);
        setBooleanField(term2538, term2538.getClass(), "nativeType", false);
        setField(term2538, term2538.getClass(), "implicitPrototypeFallback", null);
        setField(term2538, term2538.getClass(), "ownerFunction", null);
        setBooleanField(term2538, term2538.getClass(), "prettyPrint", false);
        setBooleanField(term2538, term2538.getClass(), "visited", false);
        setField(term2538, term2538.getClass(), "docInfo", null);
        setBooleanField(term2538, term2538.getClass(), "unknown", false);
        setBooleanField(term2538, term2538.getClass(), "resolved", false);
        setField(term2538, term2538.getClass(), "resolveResult", null);
        setBooleanField(term2538, term2538.getClass(), "inTemplatedCheckVisit", false);
        setField(term2538, term2538.getClass(), "registry", null);
        setField(term2513, term2513.getClass(), "ownerFunction", term2538);
        setBooleanField(term2513, term2513.getClass(), "prettyPrint", true);
        setBooleanField(term2513, term2513.getClass(), "visited", true);
        setField(term2547, term2547.getClass(), "info", null);
        setField(term2547, term2547.getClass(), "documentation", null);
        setField(term2547, term2547.getClass(), "associatedNode", null);
        setField(term2547, term2547.getClass(), "visibility", null);
        setIntField(term2547, term2547.getClass(), "bitset", 0);
        setField(term2547, term2547.getClass(), "type", null);
        setField(term2547, term2547.getClass(), "thisType", null);
        setBooleanField(term2547, term2547.getClass(), "includeDocumentation", false);
        setField(term2513, term2513.getClass(), "docInfo", term2547);
        setBooleanField(term2513, term2513.getClass(), "unknown", true);
        setBooleanField(term2513, term2513.getClass(), "resolved", false);
        setField(term2513, term2513.getClass(), "resolveResult", null);
        setBooleanField(term2513, term2513.getClass(), "inTemplatedCheckVisit", false);
        setField(term2513, term2513.getClass(), "registry", null);
        HashMap term8821 = new HashMap();
        term8818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8823 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8818, term8818.getClass(), "className", "CFyoseFGLF");
        setField(term8818, term8818.getClass(), "properties", term8821);
        setBooleanField(term8818, term8818.getClass(), "nativeType", false);
        setField(term8818, term8818.getClass(), "implicitPrototypeFallback", null);
        setField(term8822, term8822.getClass(), "call", null);
        setField(term8822, term8822.getClass(), "prototypeSlot", null);
        setField(term8822, term8822.getClass(), "kind", null);
        setField(term8822, term8822.getClass(), "typeOfThis", null);
        setField(term8822, term8822.getClass(), "source", null);
        setField(term8822, term8822.getClass(), "implementedInterfaces", null);
        setField(term8822, term8822.getClass(), "extendedInterfaces", null);
        setField(term8822, term8822.getClass(), "subTypes", null);
        setField(term8822, term8822.getClass(), "templateTypeNames", null);
        setField(term8822, term8822.getClass(), "className", null);
        setField(term8822, term8822.getClass(), "properties", null);
        setBooleanField(term8822, term8822.getClass(), "nativeType", false);
        setField(term8822, term8822.getClass(), "implicitPrototypeFallback", null);
        setField(term8822, term8822.getClass(), "ownerFunction", null);
        setBooleanField(term8822, term8822.getClass(), "prettyPrint", false);
        setBooleanField(term8822, term8822.getClass(), "visited", false);
        setField(term8822, term8822.getClass(), "docInfo", null);
        setBooleanField(term8822, term8822.getClass(), "unknown", false);
        setBooleanField(term8822, term8822.getClass(), "resolved", false);
        setField(term8822, term8822.getClass(), "resolveResult", null);
        setBooleanField(term8822, term8822.getClass(), "inTemplatedCheckVisit", false);
        setField(term8822, term8822.getClass(), "registry", null);
        setField(term8818, term8818.getClass(), "ownerFunction", term8822);
        setBooleanField(term8818, term8818.getClass(), "prettyPrint", true);
        setBooleanField(term8818, term8818.getClass(), "visited", true);
        setField(term8823, term8823.getClass(), "info", null);
        setField(term8823, term8823.getClass(), "documentation", null);
        setField(term8823, term8823.getClass(), "associatedNode", null);
        setField(term8823, term8823.getClass(), "visibility", null);
        setIntField(term8823, term8823.getClass(), "bitset", 0);
        setField(term8823, term8823.getClass(), "type", null);
        setField(term8823, term8823.getClass(), "thisType", null);
        setBooleanField(term8823, term8823.getClass(), "includeDocumentation", false);
        setField(term8818, term8818.getClass(), "docInfo", term8823);
        setBooleanField(term8818, term8818.getClass(), "unknown", true);
        setBooleanField(term8818, term8818.getClass(), "resolved", false);
        setField(term8818, term8818.getClass(), "resolveResult", null);
        setBooleanField(term8818, term8818.getClass(), "inTemplatedCheckVisit", false);
        setField(term8818, term8818.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasReferenceName", argTypes, term2513, args);
        assertTrue(recursiveEquals(term2513, term8818));
        assertTrue(recursiveEquals(retValue, true));
    }

};


