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

public class PrototypeObjectType_getImplicitPrototype_94519877070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2363;
     Object term8358;

    public PrototypeObjectType_getImplicitPrototype_94519877070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2376 = new HashMap();
        term2363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2397 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2363, term2363.getClass(), "className", "FwPbDZcHmB");
        setField(term2363, term2363.getClass(), "properties", term2376);
        setBooleanField(term2363, term2363.getClass(), "nativeType", false);
        setField(term2363, term2363.getClass(), "implicitPrototypeFallback", null);
        setField(term2388, term2388.getClass(), "call", null);
        setField(term2388, term2388.getClass(), "prototypeSlot", null);
        setField(term2388, term2388.getClass(), "kind", null);
        setField(term2388, term2388.getClass(), "typeOfThis", null);
        setField(term2388, term2388.getClass(), "source", null);
        setField(term2388, term2388.getClass(), "implementedInterfaces", null);
        setField(term2388, term2388.getClass(), "extendedInterfaces", null);
        setField(term2388, term2388.getClass(), "subTypes", null);
        setField(term2388, term2388.getClass(), "templateTypeNames", null);
        setField(term2388, term2388.getClass(), "className", null);
        setField(term2388, term2388.getClass(), "properties", null);
        setBooleanField(term2388, term2388.getClass(), "nativeType", false);
        setField(term2388, term2388.getClass(), "implicitPrototypeFallback", null);
        setField(term2388, term2388.getClass(), "ownerFunction", null);
        setBooleanField(term2388, term2388.getClass(), "prettyPrint", false);
        setBooleanField(term2388, term2388.getClass(), "visited", false);
        setField(term2388, term2388.getClass(), "docInfo", null);
        setBooleanField(term2388, term2388.getClass(), "unknown", false);
        setBooleanField(term2388, term2388.getClass(), "resolved", false);
        setField(term2388, term2388.getClass(), "resolveResult", null);
        setBooleanField(term2388, term2388.getClass(), "inTemplatedCheckVisit", false);
        setField(term2388, term2388.getClass(), "registry", null);
        setField(term2363, term2363.getClass(), "ownerFunction", term2388);
        setBooleanField(term2363, term2363.getClass(), "prettyPrint", true);
        setBooleanField(term2363, term2363.getClass(), "visited", true);
        setField(term2397, term2397.getClass(), "info", null);
        setField(term2397, term2397.getClass(), "documentation", null);
        setField(term2397, term2397.getClass(), "associatedNode", null);
        setField(term2397, term2397.getClass(), "visibility", null);
        setIntField(term2397, term2397.getClass(), "bitset", 0);
        setField(term2397, term2397.getClass(), "type", null);
        setField(term2397, term2397.getClass(), "thisType", null);
        setBooleanField(term2397, term2397.getClass(), "includeDocumentation", false);
        setField(term2363, term2363.getClass(), "docInfo", term2397);
        setBooleanField(term2363, term2363.getClass(), "unknown", true);
        setBooleanField(term2363, term2363.getClass(), "resolved", false);
        setField(term2363, term2363.getClass(), "resolveResult", null);
        setBooleanField(term2363, term2363.getClass(), "inTemplatedCheckVisit", false);
        setField(term2363, term2363.getClass(), "registry", null);
        HashMap term8361 = new HashMap();
        term8358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8358, term8358.getClass(), "className", "FwPbDZcHmB");
        setField(term8358, term8358.getClass(), "properties", term8361);
        setBooleanField(term8358, term8358.getClass(), "nativeType", false);
        setField(term8358, term8358.getClass(), "implicitPrototypeFallback", null);
        setField(term8362, term8362.getClass(), "call", null);
        setField(term8362, term8362.getClass(), "prototypeSlot", null);
        setField(term8362, term8362.getClass(), "kind", null);
        setField(term8362, term8362.getClass(), "typeOfThis", null);
        setField(term8362, term8362.getClass(), "source", null);
        setField(term8362, term8362.getClass(), "implementedInterfaces", null);
        setField(term8362, term8362.getClass(), "extendedInterfaces", null);
        setField(term8362, term8362.getClass(), "subTypes", null);
        setField(term8362, term8362.getClass(), "templateTypeNames", null);
        setField(term8362, term8362.getClass(), "className", null);
        setField(term8362, term8362.getClass(), "properties", null);
        setBooleanField(term8362, term8362.getClass(), "nativeType", false);
        setField(term8362, term8362.getClass(), "implicitPrototypeFallback", null);
        setField(term8362, term8362.getClass(), "ownerFunction", null);
        setBooleanField(term8362, term8362.getClass(), "prettyPrint", false);
        setBooleanField(term8362, term8362.getClass(), "visited", false);
        setField(term8362, term8362.getClass(), "docInfo", null);
        setBooleanField(term8362, term8362.getClass(), "unknown", false);
        setBooleanField(term8362, term8362.getClass(), "resolved", false);
        setField(term8362, term8362.getClass(), "resolveResult", null);
        setBooleanField(term8362, term8362.getClass(), "inTemplatedCheckVisit", false);
        setField(term8362, term8362.getClass(), "registry", null);
        setField(term8358, term8358.getClass(), "ownerFunction", term8362);
        setBooleanField(term8358, term8358.getClass(), "prettyPrint", true);
        setBooleanField(term8358, term8358.getClass(), "visited", true);
        setField(term8363, term8363.getClass(), "info", null);
        setField(term8363, term8363.getClass(), "documentation", null);
        setField(term8363, term8363.getClass(), "associatedNode", null);
        setField(term8363, term8363.getClass(), "visibility", null);
        setIntField(term8363, term8363.getClass(), "bitset", 0);
        setField(term8363, term8363.getClass(), "type", null);
        setField(term8363, term8363.getClass(), "thisType", null);
        setBooleanField(term8363, term8363.getClass(), "includeDocumentation", false);
        setField(term8358, term8358.getClass(), "docInfo", term8363);
        setBooleanField(term8358, term8358.getClass(), "unknown", true);
        setBooleanField(term8358, term8358.getClass(), "resolved", false);
        setField(term8358, term8358.getClass(), "resolveResult", null);
        setBooleanField(term8358, term8358.getClass(), "inTemplatedCheckVisit", false);
        setField(term8358, term8358.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplicitPrototype", argTypes, term2363, args);
        assertTrue(recursiveEquals(term2363, term8358));
        assertTrue(recursiveEquals(retValue, null));
    }

};


