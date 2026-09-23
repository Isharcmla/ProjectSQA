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
import java.lang.Boolean;

public class PrototypeObjectType_setPrettyPrint_168347772267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;
     Object term2251;
     Object term8177;

    public PrototypeObjectType_setPrettyPrint_168347772267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2224 = new HashMap();
        term2211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2245 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2211, term2211.getClass(), "className", "iikZEapDlu");
        setField(term2211, term2211.getClass(), "properties", term2224);
        setBooleanField(term2211, term2211.getClass(), "nativeType", false);
        setField(term2211, term2211.getClass(), "implicitPrototypeFallback", null);
        setField(term2236, term2236.getClass(), "call", null);
        setField(term2236, term2236.getClass(), "prototypeSlot", null);
        setField(term2236, term2236.getClass(), "kind", null);
        setField(term2236, term2236.getClass(), "typeOfThis", null);
        setField(term2236, term2236.getClass(), "source", null);
        setField(term2236, term2236.getClass(), "implementedInterfaces", null);
        setField(term2236, term2236.getClass(), "extendedInterfaces", null);
        setField(term2236, term2236.getClass(), "subTypes", null);
        setField(term2236, term2236.getClass(), "templateTypeNames", null);
        setField(term2236, term2236.getClass(), "className", null);
        setField(term2236, term2236.getClass(), "properties", null);
        setBooleanField(term2236, term2236.getClass(), "nativeType", false);
        setField(term2236, term2236.getClass(), "implicitPrototypeFallback", null);
        setField(term2236, term2236.getClass(), "ownerFunction", null);
        setBooleanField(term2236, term2236.getClass(), "prettyPrint", false);
        setBooleanField(term2236, term2236.getClass(), "visited", false);
        setField(term2236, term2236.getClass(), "docInfo", null);
        setBooleanField(term2236, term2236.getClass(), "unknown", false);
        setBooleanField(term2236, term2236.getClass(), "resolved", false);
        setField(term2236, term2236.getClass(), "resolveResult", null);
        setBooleanField(term2236, term2236.getClass(), "inTemplatedCheckVisit", false);
        setField(term2236, term2236.getClass(), "registry", null);
        setField(term2211, term2211.getClass(), "ownerFunction", term2236);
        setBooleanField(term2211, term2211.getClass(), "prettyPrint", false);
        setBooleanField(term2211, term2211.getClass(), "visited", true);
        setField(term2245, term2245.getClass(), "info", null);
        setField(term2245, term2245.getClass(), "documentation", null);
        setField(term2245, term2245.getClass(), "associatedNode", null);
        setField(term2245, term2245.getClass(), "visibility", null);
        setIntField(term2245, term2245.getClass(), "bitset", 0);
        setField(term2245, term2245.getClass(), "type", null);
        setField(term2245, term2245.getClass(), "thisType", null);
        setBooleanField(term2245, term2245.getClass(), "includeDocumentation", false);
        setField(term2211, term2211.getClass(), "docInfo", term2245);
        setBooleanField(term2211, term2211.getClass(), "unknown", false);
        setBooleanField(term2211, term2211.getClass(), "resolved", false);
        setField(term2211, term2211.getClass(), "resolveResult", null);
        setBooleanField(term2211, term2211.getClass(), "inTemplatedCheckVisit", false);
        setField(term2211, term2211.getClass(), "registry", null);
        term2251 = new Boolean(false);
        HashMap term8180 = new HashMap();
        term8177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8182 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8177, term8177.getClass(), "className", "iikZEapDlu");
        setField(term8177, term8177.getClass(), "properties", term8180);
        setBooleanField(term8177, term8177.getClass(), "nativeType", false);
        setField(term8177, term8177.getClass(), "implicitPrototypeFallback", null);
        setField(term8181, term8181.getClass(), "call", null);
        setField(term8181, term8181.getClass(), "prototypeSlot", null);
        setField(term8181, term8181.getClass(), "kind", null);
        setField(term8181, term8181.getClass(), "typeOfThis", null);
        setField(term8181, term8181.getClass(), "source", null);
        setField(term8181, term8181.getClass(), "implementedInterfaces", null);
        setField(term8181, term8181.getClass(), "extendedInterfaces", null);
        setField(term8181, term8181.getClass(), "subTypes", null);
        setField(term8181, term8181.getClass(), "templateTypeNames", null);
        setField(term8181, term8181.getClass(), "className", null);
        setField(term8181, term8181.getClass(), "properties", null);
        setBooleanField(term8181, term8181.getClass(), "nativeType", false);
        setField(term8181, term8181.getClass(), "implicitPrototypeFallback", null);
        setField(term8181, term8181.getClass(), "ownerFunction", null);
        setBooleanField(term8181, term8181.getClass(), "prettyPrint", false);
        setBooleanField(term8181, term8181.getClass(), "visited", false);
        setField(term8181, term8181.getClass(), "docInfo", null);
        setBooleanField(term8181, term8181.getClass(), "unknown", false);
        setBooleanField(term8181, term8181.getClass(), "resolved", false);
        setField(term8181, term8181.getClass(), "resolveResult", null);
        setBooleanField(term8181, term8181.getClass(), "inTemplatedCheckVisit", false);
        setField(term8181, term8181.getClass(), "registry", null);
        setField(term8177, term8177.getClass(), "ownerFunction", term8181);
        setBooleanField(term8177, term8177.getClass(), "prettyPrint", false);
        setBooleanField(term8177, term8177.getClass(), "visited", true);
        setField(term8182, term8182.getClass(), "info", null);
        setField(term8182, term8182.getClass(), "documentation", null);
        setField(term8182, term8182.getClass(), "associatedNode", null);
        setField(term8182, term8182.getClass(), "visibility", null);
        setIntField(term8182, term8182.getClass(), "bitset", 0);
        setField(term8182, term8182.getClass(), "type", null);
        setField(term8182, term8182.getClass(), "thisType", null);
        setBooleanField(term8182, term8182.getClass(), "includeDocumentation", false);
        setField(term8177, term8177.getClass(), "docInfo", term8182);
        setBooleanField(term8177, term8177.getClass(), "unknown", false);
        setBooleanField(term8177, term8177.getClass(), "resolved", false);
        setField(term8177, term8177.getClass(), "resolveResult", null);
        setBooleanField(term8177, term8177.getClass(), "inTemplatedCheckVisit", false);
        setField(term8177, term8177.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2251;
        callMethod(klass, "setPrettyPrint", argTypes, term2211, args);
        assertTrue(recursiveEquals(term2211, term8177));
        assertTrue(recursiveEquals(term2251, false));
    }

};


