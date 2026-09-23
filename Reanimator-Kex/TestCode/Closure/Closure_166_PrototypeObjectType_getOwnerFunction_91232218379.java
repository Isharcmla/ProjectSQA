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

public class PrototypeObjectType_getOwnerFunction_91232218379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3205;
     Object term9878;
     Object term9809;

    public PrototypeObjectType_getOwnerFunction_91232218379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3218 = new HashMap();
        term3205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3239 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3205, term3205.getClass(), "className", "MHGKyEnwKc");
        setField(term3205, term3205.getClass(), "properties", term3218);
        setBooleanField(term3205, term3205.getClass(), "nativeType", true);
        setField(term3205, term3205.getClass(), "implicitPrototypeFallback", null);
        setField(term3230, term3230.getClass(), "call", null);
        setField(term3230, term3230.getClass(), "prototypeSlot", null);
        setField(term3230, term3230.getClass(), "kind", null);
        setField(term3230, term3230.getClass(), "typeOfThis", null);
        setField(term3230, term3230.getClass(), "source", null);
        setField(term3230, term3230.getClass(), "implementedInterfaces", null);
        setField(term3230, term3230.getClass(), "extendedInterfaces", null);
        setField(term3230, term3230.getClass(), "subTypes", null);
        setField(term3230, term3230.getClass(), "templateTypeNames", null);
        setField(term3230, term3230.getClass(), "className", null);
        setField(term3230, term3230.getClass(), "properties", null);
        setBooleanField(term3230, term3230.getClass(), "nativeType", false);
        setField(term3230, term3230.getClass(), "implicitPrototypeFallback", null);
        setField(term3230, term3230.getClass(), "ownerFunction", null);
        setBooleanField(term3230, term3230.getClass(), "prettyPrint", false);
        setBooleanField(term3230, term3230.getClass(), "visited", false);
        setField(term3230, term3230.getClass(), "docInfo", null);
        setBooleanField(term3230, term3230.getClass(), "unknown", false);
        setBooleanField(term3230, term3230.getClass(), "resolved", false);
        setField(term3230, term3230.getClass(), "resolveResult", null);
        setBooleanField(term3230, term3230.getClass(), "inTemplatedCheckVisit", false);
        setField(term3230, term3230.getClass(), "registry", null);
        setField(term3205, term3205.getClass(), "ownerFunction", term3230);
        setBooleanField(term3205, term3205.getClass(), "prettyPrint", false);
        setBooleanField(term3205, term3205.getClass(), "visited", true);
        setField(term3239, term3239.getClass(), "info", null);
        setField(term3239, term3239.getClass(), "documentation", null);
        setField(term3239, term3239.getClass(), "associatedNode", null);
        setField(term3239, term3239.getClass(), "visibility", null);
        setIntField(term3239, term3239.getClass(), "bitset", 0);
        setField(term3239, term3239.getClass(), "type", null);
        setField(term3239, term3239.getClass(), "thisType", null);
        setBooleanField(term3239, term3239.getClass(), "includeDocumentation", false);
        setField(term3205, term3205.getClass(), "docInfo", term3239);
        setBooleanField(term3205, term3205.getClass(), "unknown", true);
        setBooleanField(term3205, term3205.getClass(), "resolved", true);
        setField(term3205, term3205.getClass(), "resolveResult", null);
        setBooleanField(term3205, term3205.getClass(), "inTemplatedCheckVisit", false);
        setField(term3205, term3205.getClass(), "registry", null);
        HashMap term9881 = new HashMap();
        term9878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9883 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9878, term9878.getClass(), "className", "MHGKyEnwKc");
        setField(term9878, term9878.getClass(), "properties", term9881);
        setBooleanField(term9878, term9878.getClass(), "nativeType", true);
        setField(term9878, term9878.getClass(), "implicitPrototypeFallback", null);
        setField(term9882, term9882.getClass(), "call", null);
        setField(term9882, term9882.getClass(), "prototypeSlot", null);
        setField(term9882, term9882.getClass(), "kind", null);
        setField(term9882, term9882.getClass(), "typeOfThis", null);
        setField(term9882, term9882.getClass(), "source", null);
        setField(term9882, term9882.getClass(), "implementedInterfaces", null);
        setField(term9882, term9882.getClass(), "extendedInterfaces", null);
        setField(term9882, term9882.getClass(), "subTypes", null);
        setField(term9882, term9882.getClass(), "templateTypeNames", null);
        setField(term9882, term9882.getClass(), "className", null);
        setField(term9882, term9882.getClass(), "properties", null);
        setBooleanField(term9882, term9882.getClass(), "nativeType", false);
        setField(term9882, term9882.getClass(), "implicitPrototypeFallback", null);
        setField(term9882, term9882.getClass(), "ownerFunction", null);
        setBooleanField(term9882, term9882.getClass(), "prettyPrint", false);
        setBooleanField(term9882, term9882.getClass(), "visited", false);
        setField(term9882, term9882.getClass(), "docInfo", null);
        setBooleanField(term9882, term9882.getClass(), "unknown", false);
        setBooleanField(term9882, term9882.getClass(), "resolved", false);
        setField(term9882, term9882.getClass(), "resolveResult", null);
        setBooleanField(term9882, term9882.getClass(), "inTemplatedCheckVisit", false);
        setField(term9882, term9882.getClass(), "registry", null);
        setField(term9878, term9878.getClass(), "ownerFunction", term9882);
        setBooleanField(term9878, term9878.getClass(), "prettyPrint", false);
        setBooleanField(term9878, term9878.getClass(), "visited", true);
        setField(term9883, term9883.getClass(), "info", null);
        setField(term9883, term9883.getClass(), "documentation", null);
        setField(term9883, term9883.getClass(), "associatedNode", null);
        setField(term9883, term9883.getClass(), "visibility", null);
        setIntField(term9883, term9883.getClass(), "bitset", 0);
        setField(term9883, term9883.getClass(), "type", null);
        setField(term9883, term9883.getClass(), "thisType", null);
        setBooleanField(term9883, term9883.getClass(), "includeDocumentation", false);
        setField(term9878, term9878.getClass(), "docInfo", term9883);
        setBooleanField(term9878, term9878.getClass(), "unknown", true);
        setBooleanField(term9878, term9878.getClass(), "resolved", true);
        setField(term9878, term9878.getClass(), "resolveResult", null);
        setBooleanField(term9878, term9878.getClass(), "inTemplatedCheckVisit", false);
        setField(term9878, term9878.getClass(), "registry", null);
        term9809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term9809, term9809.getClass(), "call", null);
        setField(term9809, term9809.getClass(), "prototypeSlot", null);
        setField(term9809, term9809.getClass(), "kind", null);
        setField(term9809, term9809.getClass(), "typeOfThis", null);
        setField(term9809, term9809.getClass(), "source", null);
        setField(term9809, term9809.getClass(), "implementedInterfaces", null);
        setField(term9809, term9809.getClass(), "extendedInterfaces", null);
        setField(term9809, term9809.getClass(), "subTypes", null);
        setField(term9809, term9809.getClass(), "templateTypeNames", null);
        setField(term9809, term9809.getClass(), "className", null);
        setField(term9809, term9809.getClass(), "properties", null);
        setBooleanField(term9809, term9809.getClass(), "nativeType", false);
        setField(term9809, term9809.getClass(), "implicitPrototypeFallback", null);
        setField(term9809, term9809.getClass(), "ownerFunction", null);
        setBooleanField(term9809, term9809.getClass(), "prettyPrint", false);
        setBooleanField(term9809, term9809.getClass(), "visited", false);
        setField(term9809, term9809.getClass(), "docInfo", null);
        setBooleanField(term9809, term9809.getClass(), "unknown", false);
        setBooleanField(term9809, term9809.getClass(), "resolved", false);
        setField(term9809, term9809.getClass(), "resolveResult", null);
        setBooleanField(term9809, term9809.getClass(), "inTemplatedCheckVisit", false);
        setField(term9809, term9809.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOwnerFunction", argTypes, term3205, args);
        assertTrue(recursiveEquals(term3205, term9878));
        assertTrue(recursiveEquals(retValue, term9809));
    }

};


