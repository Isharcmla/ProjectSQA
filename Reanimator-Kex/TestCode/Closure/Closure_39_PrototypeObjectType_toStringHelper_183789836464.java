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

public class PrototypeObjectType_toStringHelper_183789836464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2139;
     Object term2177;
     Object term7883;

    public PrototypeObjectType_toStringHelper_183789836464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2152 = new HashMap();
        term2139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2172 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2139, term2139.getClass(), "className", "tXfQjSqDzN");
        setField(term2139, term2139.getClass(), "properties", term2152);
        setBooleanField(term2139, term2139.getClass(), "nativeType", false);
        setField(term2139, term2139.getClass(), "implicitPrototypeFallback", null);
        setField(term2164, term2164.getClass(), "call", null);
        setField(term2164, term2164.getClass(), "prototypeSlot", null);
        setField(term2164, term2164.getClass(), "kind", null);
        setField(term2164, term2164.getClass(), "typeOfThis", null);
        setField(term2164, term2164.getClass(), "source", null);
        setField(term2164, term2164.getClass(), "implementedInterfaces", null);
        setField(term2164, term2164.getClass(), "extendedInterfaces", null);
        setField(term2164, term2164.getClass(), "subTypes", null);
        setField(term2164, term2164.getClass(), "templateTypeName", null);
        setField(term2164, term2164.getClass(), "className", null);
        setField(term2164, term2164.getClass(), "properties", null);
        setBooleanField(term2164, term2164.getClass(), "nativeType", false);
        setField(term2164, term2164.getClass(), "implicitPrototypeFallback", null);
        setField(term2164, term2164.getClass(), "ownerFunction", null);
        setBooleanField(term2164, term2164.getClass(), "prettyPrint", false);
        setBooleanField(term2164, term2164.getClass(), "visited", false);
        setField(term2164, term2164.getClass(), "docInfo", null);
        setBooleanField(term2164, term2164.getClass(), "unknown", false);
        setBooleanField(term2164, term2164.getClass(), "resolved", false);
        setField(term2164, term2164.getClass(), "resolveResult", null);
        setField(term2164, term2164.getClass(), "registry", null);
        setField(term2139, term2139.getClass(), "ownerFunction", term2164);
        setBooleanField(term2139, term2139.getClass(), "prettyPrint", true);
        setBooleanField(term2139, term2139.getClass(), "visited", true);
        setField(term2172, term2172.getClass(), "info", null);
        setField(term2172, term2172.getClass(), "documentation", null);
        setField(term2172, term2172.getClass(), "associatedNode", null);
        setField(term2172, term2172.getClass(), "visibility", null);
        setIntField(term2172, term2172.getClass(), "bitset", 0);
        setField(term2172, term2172.getClass(), "type", null);
        setField(term2172, term2172.getClass(), "thisType", null);
        setBooleanField(term2172, term2172.getClass(), "includeDocumentation", false);
        setField(term2139, term2139.getClass(), "docInfo", term2172);
        setBooleanField(term2139, term2139.getClass(), "unknown", false);
        setBooleanField(term2139, term2139.getClass(), "resolved", true);
        setField(term2139, term2139.getClass(), "resolveResult", null);
        setField(term2139, term2139.getClass(), "registry", null);
        term2177 = new Boolean(true);
        HashMap term7886 = new HashMap();
        term7883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7888 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7883, term7883.getClass(), "className", "tXfQjSqDzN");
        setField(term7883, term7883.getClass(), "properties", term7886);
        setBooleanField(term7883, term7883.getClass(), "nativeType", false);
        setField(term7883, term7883.getClass(), "implicitPrototypeFallback", null);
        setField(term7887, term7887.getClass(), "call", null);
        setField(term7887, term7887.getClass(), "prototypeSlot", null);
        setField(term7887, term7887.getClass(), "kind", null);
        setField(term7887, term7887.getClass(), "typeOfThis", null);
        setField(term7887, term7887.getClass(), "source", null);
        setField(term7887, term7887.getClass(), "implementedInterfaces", null);
        setField(term7887, term7887.getClass(), "extendedInterfaces", null);
        setField(term7887, term7887.getClass(), "subTypes", null);
        setField(term7887, term7887.getClass(), "templateTypeName", null);
        setField(term7887, term7887.getClass(), "className", null);
        setField(term7887, term7887.getClass(), "properties", null);
        setBooleanField(term7887, term7887.getClass(), "nativeType", false);
        setField(term7887, term7887.getClass(), "implicitPrototypeFallback", null);
        setField(term7887, term7887.getClass(), "ownerFunction", null);
        setBooleanField(term7887, term7887.getClass(), "prettyPrint", false);
        setBooleanField(term7887, term7887.getClass(), "visited", false);
        setField(term7887, term7887.getClass(), "docInfo", null);
        setBooleanField(term7887, term7887.getClass(), "unknown", false);
        setBooleanField(term7887, term7887.getClass(), "resolved", false);
        setField(term7887, term7887.getClass(), "resolveResult", null);
        setField(term7887, term7887.getClass(), "registry", null);
        setField(term7883, term7883.getClass(), "ownerFunction", term7887);
        setBooleanField(term7883, term7883.getClass(), "prettyPrint", true);
        setBooleanField(term7883, term7883.getClass(), "visited", true);
        setField(term7888, term7888.getClass(), "info", null);
        setField(term7888, term7888.getClass(), "documentation", null);
        setField(term7888, term7888.getClass(), "associatedNode", null);
        setField(term7888, term7888.getClass(), "visibility", null);
        setIntField(term7888, term7888.getClass(), "bitset", 0);
        setField(term7888, term7888.getClass(), "type", null);
        setField(term7888, term7888.getClass(), "thisType", null);
        setBooleanField(term7888, term7888.getClass(), "includeDocumentation", false);
        setField(term7883, term7883.getClass(), "docInfo", term7888);
        setBooleanField(term7883, term7883.getClass(), "unknown", false);
        setBooleanField(term7883, term7883.getClass(), "resolved", true);
        setField(term7883, term7883.getClass(), "resolveResult", null);
        setField(term7883, term7883.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2177;
        Object retValue = callMethod(klass, "toStringHelper", argTypes, term2139, args);
        assertTrue(recursiveEquals(term2139, term7883));
        assertTrue(recursiveEquals(term2177, true));
        assertTrue(recursiveEquals(retValue, "tXfQjSqDzN"));
    }

};


