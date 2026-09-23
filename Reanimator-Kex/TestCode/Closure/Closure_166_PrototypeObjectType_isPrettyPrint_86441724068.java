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

public class PrototypeObjectType_isPrettyPrint_86441724068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2263;
     Object term8238;

    public PrototypeObjectType_isPrettyPrint_86441724068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2276 = new HashMap();
        term2263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2297 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2263, term2263.getClass(), "className", "tXfQjSqDzN");
        setField(term2263, term2263.getClass(), "properties", term2276);
        setBooleanField(term2263, term2263.getClass(), "nativeType", false);
        setField(term2263, term2263.getClass(), "implicitPrototypeFallback", null);
        setField(term2288, term2288.getClass(), "call", null);
        setField(term2288, term2288.getClass(), "prototypeSlot", null);
        setField(term2288, term2288.getClass(), "kind", null);
        setField(term2288, term2288.getClass(), "typeOfThis", null);
        setField(term2288, term2288.getClass(), "source", null);
        setField(term2288, term2288.getClass(), "implementedInterfaces", null);
        setField(term2288, term2288.getClass(), "extendedInterfaces", null);
        setField(term2288, term2288.getClass(), "subTypes", null);
        setField(term2288, term2288.getClass(), "templateTypeNames", null);
        setField(term2288, term2288.getClass(), "className", null);
        setField(term2288, term2288.getClass(), "properties", null);
        setBooleanField(term2288, term2288.getClass(), "nativeType", false);
        setField(term2288, term2288.getClass(), "implicitPrototypeFallback", null);
        setField(term2288, term2288.getClass(), "ownerFunction", null);
        setBooleanField(term2288, term2288.getClass(), "prettyPrint", false);
        setBooleanField(term2288, term2288.getClass(), "visited", false);
        setField(term2288, term2288.getClass(), "docInfo", null);
        setBooleanField(term2288, term2288.getClass(), "unknown", false);
        setBooleanField(term2288, term2288.getClass(), "resolved", false);
        setField(term2288, term2288.getClass(), "resolveResult", null);
        setBooleanField(term2288, term2288.getClass(), "inTemplatedCheckVisit", false);
        setField(term2288, term2288.getClass(), "registry", null);
        setField(term2263, term2263.getClass(), "ownerFunction", term2288);
        setBooleanField(term2263, term2263.getClass(), "prettyPrint", false);
        setBooleanField(term2263, term2263.getClass(), "visited", true);
        setField(term2297, term2297.getClass(), "info", null);
        setField(term2297, term2297.getClass(), "documentation", null);
        setField(term2297, term2297.getClass(), "associatedNode", null);
        setField(term2297, term2297.getClass(), "visibility", null);
        setIntField(term2297, term2297.getClass(), "bitset", 0);
        setField(term2297, term2297.getClass(), "type", null);
        setField(term2297, term2297.getClass(), "thisType", null);
        setBooleanField(term2297, term2297.getClass(), "includeDocumentation", false);
        setField(term2263, term2263.getClass(), "docInfo", term2297);
        setBooleanField(term2263, term2263.getClass(), "unknown", true);
        setBooleanField(term2263, term2263.getClass(), "resolved", false);
        setField(term2263, term2263.getClass(), "resolveResult", null);
        setBooleanField(term2263, term2263.getClass(), "inTemplatedCheckVisit", false);
        setField(term2263, term2263.getClass(), "registry", null);
        HashMap term8241 = new HashMap();
        term8238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8243 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8238, term8238.getClass(), "className", "tXfQjSqDzN");
        setField(term8238, term8238.getClass(), "properties", term8241);
        setBooleanField(term8238, term8238.getClass(), "nativeType", false);
        setField(term8238, term8238.getClass(), "implicitPrototypeFallback", null);
        setField(term8242, term8242.getClass(), "call", null);
        setField(term8242, term8242.getClass(), "prototypeSlot", null);
        setField(term8242, term8242.getClass(), "kind", null);
        setField(term8242, term8242.getClass(), "typeOfThis", null);
        setField(term8242, term8242.getClass(), "source", null);
        setField(term8242, term8242.getClass(), "implementedInterfaces", null);
        setField(term8242, term8242.getClass(), "extendedInterfaces", null);
        setField(term8242, term8242.getClass(), "subTypes", null);
        setField(term8242, term8242.getClass(), "templateTypeNames", null);
        setField(term8242, term8242.getClass(), "className", null);
        setField(term8242, term8242.getClass(), "properties", null);
        setBooleanField(term8242, term8242.getClass(), "nativeType", false);
        setField(term8242, term8242.getClass(), "implicitPrototypeFallback", null);
        setField(term8242, term8242.getClass(), "ownerFunction", null);
        setBooleanField(term8242, term8242.getClass(), "prettyPrint", false);
        setBooleanField(term8242, term8242.getClass(), "visited", false);
        setField(term8242, term8242.getClass(), "docInfo", null);
        setBooleanField(term8242, term8242.getClass(), "unknown", false);
        setBooleanField(term8242, term8242.getClass(), "resolved", false);
        setField(term8242, term8242.getClass(), "resolveResult", null);
        setBooleanField(term8242, term8242.getClass(), "inTemplatedCheckVisit", false);
        setField(term8242, term8242.getClass(), "registry", null);
        setField(term8238, term8238.getClass(), "ownerFunction", term8242);
        setBooleanField(term8238, term8238.getClass(), "prettyPrint", false);
        setBooleanField(term8238, term8238.getClass(), "visited", true);
        setField(term8243, term8243.getClass(), "info", null);
        setField(term8243, term8243.getClass(), "documentation", null);
        setField(term8243, term8243.getClass(), "associatedNode", null);
        setField(term8243, term8243.getClass(), "visibility", null);
        setIntField(term8243, term8243.getClass(), "bitset", 0);
        setField(term8243, term8243.getClass(), "type", null);
        setField(term8243, term8243.getClass(), "thisType", null);
        setBooleanField(term8243, term8243.getClass(), "includeDocumentation", false);
        setField(term8238, term8238.getClass(), "docInfo", term8243);
        setBooleanField(term8238, term8238.getClass(), "unknown", true);
        setBooleanField(term8238, term8238.getClass(), "resolved", false);
        setField(term8238, term8238.getClass(), "resolveResult", null);
        setBooleanField(term8238, term8238.getClass(), "inTemplatedCheckVisit", false);
        setField(term8238, term8238.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrettyPrint", argTypes, term2263, args);
        assertTrue(recursiveEquals(term2263, term8238));
    }

};


