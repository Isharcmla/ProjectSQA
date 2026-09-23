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

public class PrototypeObjectType_getReferenceName_26652182472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2463;
     Object term8746;

    public PrototypeObjectType_getReferenceName_26652182472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2476 = new HashMap();
        term2463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2497 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2463, term2463.getClass(), "className", "PCipZnmBOF");
        setField(term2463, term2463.getClass(), "properties", term2476);
        setBooleanField(term2463, term2463.getClass(), "nativeType", true);
        setField(term2463, term2463.getClass(), "implicitPrototypeFallback", null);
        setField(term2488, term2488.getClass(), "call", null);
        setField(term2488, term2488.getClass(), "prototypeSlot", null);
        setField(term2488, term2488.getClass(), "kind", null);
        setField(term2488, term2488.getClass(), "typeOfThis", null);
        setField(term2488, term2488.getClass(), "source", null);
        setField(term2488, term2488.getClass(), "implementedInterfaces", null);
        setField(term2488, term2488.getClass(), "extendedInterfaces", null);
        setField(term2488, term2488.getClass(), "subTypes", null);
        setField(term2488, term2488.getClass(), "templateTypeNames", null);
        setField(term2488, term2488.getClass(), "className", null);
        setField(term2488, term2488.getClass(), "properties", null);
        setBooleanField(term2488, term2488.getClass(), "nativeType", false);
        setField(term2488, term2488.getClass(), "implicitPrototypeFallback", null);
        setField(term2488, term2488.getClass(), "ownerFunction", null);
        setBooleanField(term2488, term2488.getClass(), "prettyPrint", false);
        setBooleanField(term2488, term2488.getClass(), "visited", false);
        setField(term2488, term2488.getClass(), "docInfo", null);
        setBooleanField(term2488, term2488.getClass(), "unknown", false);
        setBooleanField(term2488, term2488.getClass(), "resolved", false);
        setField(term2488, term2488.getClass(), "resolveResult", null);
        setBooleanField(term2488, term2488.getClass(), "inTemplatedCheckVisit", false);
        setField(term2488, term2488.getClass(), "registry", null);
        setField(term2463, term2463.getClass(), "ownerFunction", term2488);
        setBooleanField(term2463, term2463.getClass(), "prettyPrint", true);
        setBooleanField(term2463, term2463.getClass(), "visited", false);
        setField(term2497, term2497.getClass(), "info", null);
        setField(term2497, term2497.getClass(), "documentation", null);
        setField(term2497, term2497.getClass(), "associatedNode", null);
        setField(term2497, term2497.getClass(), "visibility", null);
        setIntField(term2497, term2497.getClass(), "bitset", 0);
        setField(term2497, term2497.getClass(), "type", null);
        setField(term2497, term2497.getClass(), "thisType", null);
        setBooleanField(term2497, term2497.getClass(), "includeDocumentation", false);
        setField(term2463, term2463.getClass(), "docInfo", term2497);
        setBooleanField(term2463, term2463.getClass(), "unknown", false);
        setBooleanField(term2463, term2463.getClass(), "resolved", false);
        setField(term2463, term2463.getClass(), "resolveResult", null);
        setBooleanField(term2463, term2463.getClass(), "inTemplatedCheckVisit", false);
        setField(term2463, term2463.getClass(), "registry", null);
        HashMap term8749 = new HashMap();
        term8746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8751 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8746, term8746.getClass(), "className", "PCipZnmBOF");
        setField(term8746, term8746.getClass(), "properties", term8749);
        setBooleanField(term8746, term8746.getClass(), "nativeType", true);
        setField(term8746, term8746.getClass(), "implicitPrototypeFallback", null);
        setField(term8750, term8750.getClass(), "call", null);
        setField(term8750, term8750.getClass(), "prototypeSlot", null);
        setField(term8750, term8750.getClass(), "kind", null);
        setField(term8750, term8750.getClass(), "typeOfThis", null);
        setField(term8750, term8750.getClass(), "source", null);
        setField(term8750, term8750.getClass(), "implementedInterfaces", null);
        setField(term8750, term8750.getClass(), "extendedInterfaces", null);
        setField(term8750, term8750.getClass(), "subTypes", null);
        setField(term8750, term8750.getClass(), "templateTypeNames", null);
        setField(term8750, term8750.getClass(), "className", null);
        setField(term8750, term8750.getClass(), "properties", null);
        setBooleanField(term8750, term8750.getClass(), "nativeType", false);
        setField(term8750, term8750.getClass(), "implicitPrototypeFallback", null);
        setField(term8750, term8750.getClass(), "ownerFunction", null);
        setBooleanField(term8750, term8750.getClass(), "prettyPrint", false);
        setBooleanField(term8750, term8750.getClass(), "visited", false);
        setField(term8750, term8750.getClass(), "docInfo", null);
        setBooleanField(term8750, term8750.getClass(), "unknown", false);
        setBooleanField(term8750, term8750.getClass(), "resolved", false);
        setField(term8750, term8750.getClass(), "resolveResult", null);
        setBooleanField(term8750, term8750.getClass(), "inTemplatedCheckVisit", false);
        setField(term8750, term8750.getClass(), "registry", null);
        setField(term8746, term8746.getClass(), "ownerFunction", term8750);
        setBooleanField(term8746, term8746.getClass(), "prettyPrint", true);
        setBooleanField(term8746, term8746.getClass(), "visited", false);
        setField(term8751, term8751.getClass(), "info", null);
        setField(term8751, term8751.getClass(), "documentation", null);
        setField(term8751, term8751.getClass(), "associatedNode", null);
        setField(term8751, term8751.getClass(), "visibility", null);
        setIntField(term8751, term8751.getClass(), "bitset", 0);
        setField(term8751, term8751.getClass(), "type", null);
        setField(term8751, term8751.getClass(), "thisType", null);
        setBooleanField(term8751, term8751.getClass(), "includeDocumentation", false);
        setField(term8746, term8746.getClass(), "docInfo", term8751);
        setBooleanField(term8746, term8746.getClass(), "unknown", false);
        setBooleanField(term8746, term8746.getClass(), "resolved", false);
        setField(term8746, term8746.getClass(), "resolveResult", null);
        setBooleanField(term8746, term8746.getClass(), "inTemplatedCheckVisit", false);
        setField(term8746, term8746.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReferenceName", argTypes, term2463, args);
        assertTrue(recursiveEquals(term2463, term8746));
        assertTrue(recursiveEquals(retValue, "PCipZnmBOF"));
    }

};


