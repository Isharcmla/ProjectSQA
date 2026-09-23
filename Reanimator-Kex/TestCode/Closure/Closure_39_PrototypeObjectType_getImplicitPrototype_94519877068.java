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

public class PrototypeObjectType_getImplicitPrototype_94519877068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2335;
     Object term8127;

    public PrototypeObjectType_getImplicitPrototype_94519877068() {
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
        HashMap term8130 = new HashMap();
        term8127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8132 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8127, term8127.getClass(), "className", "PCipZnmBOF");
        setField(term8127, term8127.getClass(), "properties", term8130);
        setBooleanField(term8127, term8127.getClass(), "nativeType", false);
        setField(term8127, term8127.getClass(), "implicitPrototypeFallback", null);
        setField(term8131, term8131.getClass(), "call", null);
        setField(term8131, term8131.getClass(), "prototypeSlot", null);
        setField(term8131, term8131.getClass(), "kind", null);
        setField(term8131, term8131.getClass(), "typeOfThis", null);
        setField(term8131, term8131.getClass(), "source", null);
        setField(term8131, term8131.getClass(), "implementedInterfaces", null);
        setField(term8131, term8131.getClass(), "extendedInterfaces", null);
        setField(term8131, term8131.getClass(), "subTypes", null);
        setField(term8131, term8131.getClass(), "templateTypeName", null);
        setField(term8131, term8131.getClass(), "className", null);
        setField(term8131, term8131.getClass(), "properties", null);
        setBooleanField(term8131, term8131.getClass(), "nativeType", false);
        setField(term8131, term8131.getClass(), "implicitPrototypeFallback", null);
        setField(term8131, term8131.getClass(), "ownerFunction", null);
        setBooleanField(term8131, term8131.getClass(), "prettyPrint", false);
        setBooleanField(term8131, term8131.getClass(), "visited", false);
        setField(term8131, term8131.getClass(), "docInfo", null);
        setBooleanField(term8131, term8131.getClass(), "unknown", false);
        setBooleanField(term8131, term8131.getClass(), "resolved", false);
        setField(term8131, term8131.getClass(), "resolveResult", null);
        setField(term8131, term8131.getClass(), "registry", null);
        setField(term8127, term8127.getClass(), "ownerFunction", term8131);
        setBooleanField(term8127, term8127.getClass(), "prettyPrint", true);
        setBooleanField(term8127, term8127.getClass(), "visited", true);
        setField(term8132, term8132.getClass(), "info", null);
        setField(term8132, term8132.getClass(), "documentation", null);
        setField(term8132, term8132.getClass(), "associatedNode", null);
        setField(term8132, term8132.getClass(), "visibility", null);
        setIntField(term8132, term8132.getClass(), "bitset", 0);
        setField(term8132, term8132.getClass(), "type", null);
        setField(term8132, term8132.getClass(), "thisType", null);
        setBooleanField(term8132, term8132.getClass(), "includeDocumentation", false);
        setField(term8127, term8127.getClass(), "docInfo", term8132);
        setBooleanField(term8127, term8127.getClass(), "unknown", true);
        setBooleanField(term8127, term8127.getClass(), "resolved", false);
        setField(term8127, term8127.getClass(), "resolveResult", null);
        setField(term8127, term8127.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplicitPrototype", argTypes, term2335, args);
        assertTrue(recursiveEquals(term2335, term8127));
        assertTrue(recursiveEquals(retValue, null));
    }

};


