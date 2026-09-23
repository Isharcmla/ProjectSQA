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

public class PrototypeObjectType_isPropertyInExterns_157681045754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term6553;

    public PrototypeObjectType_isPropertyInExterns_157681045754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term826 = new HashMap();
        term813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term847 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term813, term813.getClass(), "className", "OJJtVNPyKZ");
        setField(term813, term813.getClass(), "properties", term826);
        setBooleanField(term813, term813.getClass(), "nativeType", false);
        setField(term813, term813.getClass(), "implicitPrototypeFallback", null);
        setField(term838, term838.getClass(), "call", null);
        setField(term838, term838.getClass(), "prototypeSlot", null);
        setField(term838, term838.getClass(), "kind", null);
        setField(term838, term838.getClass(), "typeOfThis", null);
        setField(term838, term838.getClass(), "source", null);
        setField(term838, term838.getClass(), "implementedInterfaces", null);
        setField(term838, term838.getClass(), "extendedInterfaces", null);
        setField(term838, term838.getClass(), "subTypes", null);
        setField(term838, term838.getClass(), "templateTypeNames", null);
        setField(term838, term838.getClass(), "className", null);
        setField(term838, term838.getClass(), "properties", null);
        setBooleanField(term838, term838.getClass(), "nativeType", false);
        setField(term838, term838.getClass(), "implicitPrototypeFallback", null);
        setField(term838, term838.getClass(), "ownerFunction", null);
        setBooleanField(term838, term838.getClass(), "prettyPrint", false);
        setBooleanField(term838, term838.getClass(), "visited", false);
        setField(term838, term838.getClass(), "docInfo", null);
        setBooleanField(term838, term838.getClass(), "unknown", false);
        setBooleanField(term838, term838.getClass(), "resolved", false);
        setField(term838, term838.getClass(), "resolveResult", null);
        setBooleanField(term838, term838.getClass(), "inTemplatedCheckVisit", false);
        setField(term838, term838.getClass(), "registry", null);
        setField(term813, term813.getClass(), "ownerFunction", term838);
        setBooleanField(term813, term813.getClass(), "prettyPrint", false);
        setBooleanField(term813, term813.getClass(), "visited", true);
        setField(term847, term847.getClass(), "info", null);
        setField(term847, term847.getClass(), "documentation", null);
        setField(term847, term847.getClass(), "associatedNode", null);
        setField(term847, term847.getClass(), "visibility", null);
        setIntField(term847, term847.getClass(), "bitset", 0);
        setField(term847, term847.getClass(), "type", null);
        setField(term847, term847.getClass(), "thisType", null);
        setBooleanField(term847, term847.getClass(), "includeDocumentation", false);
        setField(term813, term813.getClass(), "docInfo", term847);
        setBooleanField(term813, term813.getClass(), "unknown", false);
        setBooleanField(term813, term813.getClass(), "resolved", false);
        setField(term813, term813.getClass(), "resolveResult", null);
        setBooleanField(term813, term813.getClass(), "inTemplatedCheckVisit", false);
        setField(term813, term813.getClass(), "registry", null);
        HashMap term6556 = new HashMap();
        term6553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6553, term6553.getClass(), "className", "OJJtVNPyKZ");
        setField(term6553, term6553.getClass(), "properties", term6556);
        setBooleanField(term6553, term6553.getClass(), "nativeType", false);
        setField(term6553, term6553.getClass(), "implicitPrototypeFallback", null);
        setField(term6557, term6557.getClass(), "call", null);
        setField(term6557, term6557.getClass(), "prototypeSlot", null);
        setField(term6557, term6557.getClass(), "kind", null);
        setField(term6557, term6557.getClass(), "typeOfThis", null);
        setField(term6557, term6557.getClass(), "source", null);
        setField(term6557, term6557.getClass(), "implementedInterfaces", null);
        setField(term6557, term6557.getClass(), "extendedInterfaces", null);
        setField(term6557, term6557.getClass(), "subTypes", null);
        setField(term6557, term6557.getClass(), "templateTypeNames", null);
        setField(term6557, term6557.getClass(), "className", null);
        setField(term6557, term6557.getClass(), "properties", null);
        setBooleanField(term6557, term6557.getClass(), "nativeType", false);
        setField(term6557, term6557.getClass(), "implicitPrototypeFallback", null);
        setField(term6557, term6557.getClass(), "ownerFunction", null);
        setBooleanField(term6557, term6557.getClass(), "prettyPrint", false);
        setBooleanField(term6557, term6557.getClass(), "visited", false);
        setField(term6557, term6557.getClass(), "docInfo", null);
        setBooleanField(term6557, term6557.getClass(), "unknown", false);
        setBooleanField(term6557, term6557.getClass(), "resolved", false);
        setField(term6557, term6557.getClass(), "resolveResult", null);
        setBooleanField(term6557, term6557.getClass(), "inTemplatedCheckVisit", false);
        setField(term6557, term6557.getClass(), "registry", null);
        setField(term6553, term6553.getClass(), "ownerFunction", term6557);
        setBooleanField(term6553, term6553.getClass(), "prettyPrint", false);
        setBooleanField(term6553, term6553.getClass(), "visited", true);
        setField(term6558, term6558.getClass(), "info", null);
        setField(term6558, term6558.getClass(), "documentation", null);
        setField(term6558, term6558.getClass(), "associatedNode", null);
        setField(term6558, term6558.getClass(), "visibility", null);
        setIntField(term6558, term6558.getClass(), "bitset", 0);
        setField(term6558, term6558.getClass(), "type", null);
        setField(term6558, term6558.getClass(), "thisType", null);
        setBooleanField(term6558, term6558.getClass(), "includeDocumentation", false);
        setField(term6553, term6553.getClass(), "docInfo", term6558);
        setBooleanField(term6553, term6553.getClass(), "unknown", false);
        setBooleanField(term6553, term6553.getClass(), "resolved", false);
        setField(term6553, term6553.getClass(), "resolveResult", null);
        setBooleanField(term6553, term6553.getClass(), "inTemplatedCheckVisit", false);
        setField(term6553, term6553.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        callMethod(klass, "isPropertyInExterns", argTypes, term813, args);
        assertTrue(recursiveEquals(term813, term6553));
    }

};


