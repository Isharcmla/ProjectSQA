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

public class PrototypeObjectType_toStringHelper_183789836466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159;
     Object term2199;
     Object term8106;

    public PrototypeObjectType_toStringHelper_183789836466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2172 = new HashMap();
        term2159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2193 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2159, term2159.getClass(), "className", "kGMQdqJYyB");
        setField(term2159, term2159.getClass(), "properties", term2172);
        setBooleanField(term2159, term2159.getClass(), "nativeType", false);
        setField(term2159, term2159.getClass(), "implicitPrototypeFallback", null);
        setField(term2184, term2184.getClass(), "call", null);
        setField(term2184, term2184.getClass(), "prototypeSlot", null);
        setField(term2184, term2184.getClass(), "kind", null);
        setField(term2184, term2184.getClass(), "typeOfThis", null);
        setField(term2184, term2184.getClass(), "source", null);
        setField(term2184, term2184.getClass(), "implementedInterfaces", null);
        setField(term2184, term2184.getClass(), "extendedInterfaces", null);
        setField(term2184, term2184.getClass(), "subTypes", null);
        setField(term2184, term2184.getClass(), "templateTypeNames", null);
        setField(term2184, term2184.getClass(), "className", null);
        setField(term2184, term2184.getClass(), "properties", null);
        setBooleanField(term2184, term2184.getClass(), "nativeType", false);
        setField(term2184, term2184.getClass(), "implicitPrototypeFallback", null);
        setField(term2184, term2184.getClass(), "ownerFunction", null);
        setBooleanField(term2184, term2184.getClass(), "prettyPrint", false);
        setBooleanField(term2184, term2184.getClass(), "visited", false);
        setField(term2184, term2184.getClass(), "docInfo", null);
        setBooleanField(term2184, term2184.getClass(), "unknown", false);
        setBooleanField(term2184, term2184.getClass(), "resolved", false);
        setField(term2184, term2184.getClass(), "resolveResult", null);
        setBooleanField(term2184, term2184.getClass(), "inTemplatedCheckVisit", false);
        setField(term2184, term2184.getClass(), "registry", null);
        setField(term2159, term2159.getClass(), "ownerFunction", term2184);
        setBooleanField(term2159, term2159.getClass(), "prettyPrint", true);
        setBooleanField(term2159, term2159.getClass(), "visited", true);
        setField(term2193, term2193.getClass(), "info", null);
        setField(term2193, term2193.getClass(), "documentation", null);
        setField(term2193, term2193.getClass(), "associatedNode", null);
        setField(term2193, term2193.getClass(), "visibility", null);
        setIntField(term2193, term2193.getClass(), "bitset", 0);
        setField(term2193, term2193.getClass(), "type", null);
        setField(term2193, term2193.getClass(), "thisType", null);
        setBooleanField(term2193, term2193.getClass(), "includeDocumentation", false);
        setField(term2159, term2159.getClass(), "docInfo", term2193);
        setBooleanField(term2159, term2159.getClass(), "unknown", false);
        setBooleanField(term2159, term2159.getClass(), "resolved", true);
        setField(term2159, term2159.getClass(), "resolveResult", null);
        setBooleanField(term2159, term2159.getClass(), "inTemplatedCheckVisit", false);
        setField(term2159, term2159.getClass(), "registry", null);
        term2199 = new Boolean(true);
        HashMap term8109 = new HashMap();
        term8106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8111 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8106, term8106.getClass(), "className", "kGMQdqJYyB");
        setField(term8106, term8106.getClass(), "properties", term8109);
        setBooleanField(term8106, term8106.getClass(), "nativeType", false);
        setField(term8106, term8106.getClass(), "implicitPrototypeFallback", null);
        setField(term8110, term8110.getClass(), "call", null);
        setField(term8110, term8110.getClass(), "prototypeSlot", null);
        setField(term8110, term8110.getClass(), "kind", null);
        setField(term8110, term8110.getClass(), "typeOfThis", null);
        setField(term8110, term8110.getClass(), "source", null);
        setField(term8110, term8110.getClass(), "implementedInterfaces", null);
        setField(term8110, term8110.getClass(), "extendedInterfaces", null);
        setField(term8110, term8110.getClass(), "subTypes", null);
        setField(term8110, term8110.getClass(), "templateTypeNames", null);
        setField(term8110, term8110.getClass(), "className", null);
        setField(term8110, term8110.getClass(), "properties", null);
        setBooleanField(term8110, term8110.getClass(), "nativeType", false);
        setField(term8110, term8110.getClass(), "implicitPrototypeFallback", null);
        setField(term8110, term8110.getClass(), "ownerFunction", null);
        setBooleanField(term8110, term8110.getClass(), "prettyPrint", false);
        setBooleanField(term8110, term8110.getClass(), "visited", false);
        setField(term8110, term8110.getClass(), "docInfo", null);
        setBooleanField(term8110, term8110.getClass(), "unknown", false);
        setBooleanField(term8110, term8110.getClass(), "resolved", false);
        setField(term8110, term8110.getClass(), "resolveResult", null);
        setBooleanField(term8110, term8110.getClass(), "inTemplatedCheckVisit", false);
        setField(term8110, term8110.getClass(), "registry", null);
        setField(term8106, term8106.getClass(), "ownerFunction", term8110);
        setBooleanField(term8106, term8106.getClass(), "prettyPrint", true);
        setBooleanField(term8106, term8106.getClass(), "visited", true);
        setField(term8111, term8111.getClass(), "info", null);
        setField(term8111, term8111.getClass(), "documentation", null);
        setField(term8111, term8111.getClass(), "associatedNode", null);
        setField(term8111, term8111.getClass(), "visibility", null);
        setIntField(term8111, term8111.getClass(), "bitset", 0);
        setField(term8111, term8111.getClass(), "type", null);
        setField(term8111, term8111.getClass(), "thisType", null);
        setBooleanField(term8111, term8111.getClass(), "includeDocumentation", false);
        setField(term8106, term8106.getClass(), "docInfo", term8111);
        setBooleanField(term8106, term8106.getClass(), "unknown", false);
        setBooleanField(term8106, term8106.getClass(), "resolved", true);
        setField(term8106, term8106.getClass(), "resolveResult", null);
        setBooleanField(term8106, term8106.getClass(), "inTemplatedCheckVisit", false);
        setField(term8106, term8106.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2199;
        Object retValue = callMethod(klass, "toStringHelper", argTypes, term2159, args);
        assertTrue(recursiveEquals(term2159, term8106));
        assertTrue(recursiveEquals(term2199, true));
        assertTrue(recursiveEquals(retValue, "kGMQdqJYyB"));
    }

};


