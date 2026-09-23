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

public class PrototypeObjectType_getImplicitPrototype_94519877069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2335;
     Object term8176;

    public PrototypeObjectType_getImplicitPrototype_94519877069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2348 = new HashMap();
        term2335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2368 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2335, term2335.getClass(), "className", "PCipZnmBOF");
        setField(term2335, term2335.getClass(), "properties", term2348);
        setBooleanField(term2335, term2335.getClass(), "nativeType", false);
        setField(term2335, term2335.getClass(), "implicitPrototypeFallback", null);
        setField(term2360, term2360.getClass(), "call", null);
        setField(term2360, term2360.getClass(), "prototypeSlot", null);
        setField(term2360, term2360.getClass(), "kind", null);
        setField(term2360, term2360.getClass(), "typeOfThis", null);
        setField(term2360, term2360.getClass(), "source", null);
        setField(term2360, term2360.getClass(), "implementedInterfaces", null);
        setField(term2360, term2360.getClass(), "extendedInterfaces", null);
        setField(term2360, term2360.getClass(), "subTypes", null);
        setField(term2360, term2360.getClass(), "templateTypeName", null);
        setField(term2360, term2360.getClass(), "className", null);
        setField(term2360, term2360.getClass(), "properties", null);
        setBooleanField(term2360, term2360.getClass(), "nativeType", false);
        setField(term2360, term2360.getClass(), "implicitPrototypeFallback", null);
        setField(term2360, term2360.getClass(), "ownerFunction", null);
        setBooleanField(term2360, term2360.getClass(), "prettyPrint", false);
        setBooleanField(term2360, term2360.getClass(), "visited", false);
        setField(term2360, term2360.getClass(), "docInfo", null);
        setBooleanField(term2360, term2360.getClass(), "unknown", false);
        setBooleanField(term2360, term2360.getClass(), "resolved", false);
        setField(term2360, term2360.getClass(), "resolveResult", null);
        setField(term2360, term2360.getClass(), "registry", null);
        setField(term2335, term2335.getClass(), "ownerFunction", term2360);
        setBooleanField(term2335, term2335.getClass(), "prettyPrint", true);
        setBooleanField(term2335, term2335.getClass(), "visited", true);
        setField(term2368, term2368.getClass(), "info", null);
        setField(term2368, term2368.getClass(), "documentation", null);
        setField(term2368, term2368.getClass(), "associatedNode", null);
        setField(term2368, term2368.getClass(), "visibility", null);
        setIntField(term2368, term2368.getClass(), "bitset", 0);
        setField(term2368, term2368.getClass(), "type", null);
        setField(term2368, term2368.getClass(), "thisType", null);
        setBooleanField(term2368, term2368.getClass(), "includeDocumentation", false);
        setField(term2335, term2335.getClass(), "docInfo", term2368);
        setBooleanField(term2335, term2335.getClass(), "unknown", true);
        setBooleanField(term2335, term2335.getClass(), "resolved", false);
        setField(term2335, term2335.getClass(), "resolveResult", null);
        setField(term2335, term2335.getClass(), "registry", null);
        HashMap term8179 = new HashMap();
        term8176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8181 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8176, term8176.getClass(), "className", "PCipZnmBOF");
        setField(term8176, term8176.getClass(), "properties", term8179);
        setBooleanField(term8176, term8176.getClass(), "nativeType", false);
        setField(term8176, term8176.getClass(), "implicitPrototypeFallback", null);
        setField(term8180, term8180.getClass(), "call", null);
        setField(term8180, term8180.getClass(), "prototypeSlot", null);
        setField(term8180, term8180.getClass(), "kind", null);
        setField(term8180, term8180.getClass(), "typeOfThis", null);
        setField(term8180, term8180.getClass(), "source", null);
        setField(term8180, term8180.getClass(), "implementedInterfaces", null);
        setField(term8180, term8180.getClass(), "extendedInterfaces", null);
        setField(term8180, term8180.getClass(), "subTypes", null);
        setField(term8180, term8180.getClass(), "templateTypeName", null);
        setField(term8180, term8180.getClass(), "className", null);
        setField(term8180, term8180.getClass(), "properties", null);
        setBooleanField(term8180, term8180.getClass(), "nativeType", false);
        setField(term8180, term8180.getClass(), "implicitPrototypeFallback", null);
        setField(term8180, term8180.getClass(), "ownerFunction", null);
        setBooleanField(term8180, term8180.getClass(), "prettyPrint", false);
        setBooleanField(term8180, term8180.getClass(), "visited", false);
        setField(term8180, term8180.getClass(), "docInfo", null);
        setBooleanField(term8180, term8180.getClass(), "unknown", false);
        setBooleanField(term8180, term8180.getClass(), "resolved", false);
        setField(term8180, term8180.getClass(), "resolveResult", null);
        setField(term8180, term8180.getClass(), "registry", null);
        setField(term8176, term8176.getClass(), "ownerFunction", term8180);
        setBooleanField(term8176, term8176.getClass(), "prettyPrint", true);
        setBooleanField(term8176, term8176.getClass(), "visited", true);
        setField(term8181, term8181.getClass(), "info", null);
        setField(term8181, term8181.getClass(), "documentation", null);
        setField(term8181, term8181.getClass(), "associatedNode", null);
        setField(term8181, term8181.getClass(), "visibility", null);
        setIntField(term8181, term8181.getClass(), "bitset", 0);
        setField(term8181, term8181.getClass(), "type", null);
        setField(term8181, term8181.getClass(), "thisType", null);
        setBooleanField(term8181, term8181.getClass(), "includeDocumentation", false);
        setField(term8176, term8176.getClass(), "docInfo", term8181);
        setBooleanField(term8176, term8176.getClass(), "unknown", true);
        setBooleanField(term8176, term8176.getClass(), "resolved", false);
        setField(term8176, term8176.getClass(), "resolveResult", null);
        setField(term8176, term8176.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplicitPrototype", argTypes, term2335, args);
        assertTrue(recursiveEquals(term2335, term8176));
        assertTrue(recursiveEquals(retValue, null));
    }

};


