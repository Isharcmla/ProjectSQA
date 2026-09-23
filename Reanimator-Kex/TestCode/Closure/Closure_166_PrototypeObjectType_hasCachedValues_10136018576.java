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

public class PrototypeObjectType_hasCachedValues_10136018576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2663;
     Object term9205;

    public PrototypeObjectType_hasCachedValues_10136018576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2676 = new HashMap();
        term2663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2697 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2663, term2663.getClass(), "className", "TwfWVQGiIj");
        setField(term2663, term2663.getClass(), "properties", term2676);
        setBooleanField(term2663, term2663.getClass(), "nativeType", true);
        setField(term2663, term2663.getClass(), "implicitPrototypeFallback", null);
        setField(term2688, term2688.getClass(), "call", null);
        setField(term2688, term2688.getClass(), "prototypeSlot", null);
        setField(term2688, term2688.getClass(), "kind", null);
        setField(term2688, term2688.getClass(), "typeOfThis", null);
        setField(term2688, term2688.getClass(), "source", null);
        setField(term2688, term2688.getClass(), "implementedInterfaces", null);
        setField(term2688, term2688.getClass(), "extendedInterfaces", null);
        setField(term2688, term2688.getClass(), "subTypes", null);
        setField(term2688, term2688.getClass(), "templateTypeNames", null);
        setField(term2688, term2688.getClass(), "className", null);
        setField(term2688, term2688.getClass(), "properties", null);
        setBooleanField(term2688, term2688.getClass(), "nativeType", false);
        setField(term2688, term2688.getClass(), "implicitPrototypeFallback", null);
        setField(term2688, term2688.getClass(), "ownerFunction", null);
        setBooleanField(term2688, term2688.getClass(), "prettyPrint", false);
        setBooleanField(term2688, term2688.getClass(), "visited", false);
        setField(term2688, term2688.getClass(), "docInfo", null);
        setBooleanField(term2688, term2688.getClass(), "unknown", false);
        setBooleanField(term2688, term2688.getClass(), "resolved", false);
        setField(term2688, term2688.getClass(), "resolveResult", null);
        setBooleanField(term2688, term2688.getClass(), "inTemplatedCheckVisit", false);
        setField(term2688, term2688.getClass(), "registry", null);
        setField(term2663, term2663.getClass(), "ownerFunction", term2688);
        setBooleanField(term2663, term2663.getClass(), "prettyPrint", false);
        setBooleanField(term2663, term2663.getClass(), "visited", false);
        setField(term2697, term2697.getClass(), "info", null);
        setField(term2697, term2697.getClass(), "documentation", null);
        setField(term2697, term2697.getClass(), "associatedNode", null);
        setField(term2697, term2697.getClass(), "visibility", null);
        setIntField(term2697, term2697.getClass(), "bitset", 0);
        setField(term2697, term2697.getClass(), "type", null);
        setField(term2697, term2697.getClass(), "thisType", null);
        setBooleanField(term2697, term2697.getClass(), "includeDocumentation", false);
        setField(term2663, term2663.getClass(), "docInfo", term2697);
        setBooleanField(term2663, term2663.getClass(), "unknown", true);
        setBooleanField(term2663, term2663.getClass(), "resolved", false);
        setField(term2663, term2663.getClass(), "resolveResult", null);
        setBooleanField(term2663, term2663.getClass(), "inTemplatedCheckVisit", false);
        setField(term2663, term2663.getClass(), "registry", null);
        HashMap term9208 = new HashMap();
        term9205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9210 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9205, term9205.getClass(), "className", "TwfWVQGiIj");
        setField(term9205, term9205.getClass(), "properties", term9208);
        setBooleanField(term9205, term9205.getClass(), "nativeType", true);
        setField(term9205, term9205.getClass(), "implicitPrototypeFallback", null);
        setField(term9209, term9209.getClass(), "call", null);
        setField(term9209, term9209.getClass(), "prototypeSlot", null);
        setField(term9209, term9209.getClass(), "kind", null);
        setField(term9209, term9209.getClass(), "typeOfThis", null);
        setField(term9209, term9209.getClass(), "source", null);
        setField(term9209, term9209.getClass(), "implementedInterfaces", null);
        setField(term9209, term9209.getClass(), "extendedInterfaces", null);
        setField(term9209, term9209.getClass(), "subTypes", null);
        setField(term9209, term9209.getClass(), "templateTypeNames", null);
        setField(term9209, term9209.getClass(), "className", null);
        setField(term9209, term9209.getClass(), "properties", null);
        setBooleanField(term9209, term9209.getClass(), "nativeType", false);
        setField(term9209, term9209.getClass(), "implicitPrototypeFallback", null);
        setField(term9209, term9209.getClass(), "ownerFunction", null);
        setBooleanField(term9209, term9209.getClass(), "prettyPrint", false);
        setBooleanField(term9209, term9209.getClass(), "visited", false);
        setField(term9209, term9209.getClass(), "docInfo", null);
        setBooleanField(term9209, term9209.getClass(), "unknown", false);
        setBooleanField(term9209, term9209.getClass(), "resolved", false);
        setField(term9209, term9209.getClass(), "resolveResult", null);
        setBooleanField(term9209, term9209.getClass(), "inTemplatedCheckVisit", false);
        setField(term9209, term9209.getClass(), "registry", null);
        setField(term9205, term9205.getClass(), "ownerFunction", term9209);
        setBooleanField(term9205, term9205.getClass(), "prettyPrint", false);
        setBooleanField(term9205, term9205.getClass(), "visited", false);
        setField(term9210, term9210.getClass(), "info", null);
        setField(term9210, term9210.getClass(), "documentation", null);
        setField(term9210, term9210.getClass(), "associatedNode", null);
        setField(term9210, term9210.getClass(), "visibility", null);
        setIntField(term9210, term9210.getClass(), "bitset", 0);
        setField(term9210, term9210.getClass(), "type", null);
        setField(term9210, term9210.getClass(), "thisType", null);
        setBooleanField(term9210, term9210.getClass(), "includeDocumentation", false);
        setField(term9205, term9205.getClass(), "docInfo", term9210);
        setBooleanField(term9205, term9205.getClass(), "unknown", true);
        setBooleanField(term9205, term9205.getClass(), "resolved", false);
        setField(term9205, term9205.getClass(), "resolveResult", null);
        setBooleanField(term9205, term9205.getClass(), "inTemplatedCheckVisit", false);
        setField(term9205, term9205.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasCachedValues", argTypes, term2663, args);
        assertTrue(recursiveEquals(term2663, term9205));
    }

};


