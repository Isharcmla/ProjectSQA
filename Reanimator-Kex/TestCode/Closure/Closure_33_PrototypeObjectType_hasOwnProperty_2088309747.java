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

public class PrototypeObjectType_hasOwnProperty_2088309747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;
     Object term5163;

    public PrototypeObjectType_hasOwnProperty_2088309747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term417 = new HashMap();
        term404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term404, term404.getClass(), "className", "xBsXSDjXYK");
        setField(term404, term404.getClass(), "properties", term417);
        setBooleanField(term404, term404.getClass(), "nativeType", true);
        setField(term404, term404.getClass(), "implicitPrototypeFallback", null);
        setField(term429, term429.getClass(), "call", null);
        setField(term429, term429.getClass(), "prototypeSlot", null);
        setField(term429, term429.getClass(), "kind", null);
        setField(term429, term429.getClass(), "typeOfThis", null);
        setField(term429, term429.getClass(), "source", null);
        setField(term429, term429.getClass(), "implementedInterfaces", null);
        setField(term429, term429.getClass(), "extendedInterfaces", null);
        setField(term429, term429.getClass(), "subTypes", null);
        setField(term429, term429.getClass(), "templateTypeName", null);
        setField(term429, term429.getClass(), "className", null);
        setField(term429, term429.getClass(), "properties", null);
        setBooleanField(term429, term429.getClass(), "nativeType", false);
        setField(term429, term429.getClass(), "implicitPrototypeFallback", null);
        setField(term429, term429.getClass(), "ownerFunction", null);
        setBooleanField(term429, term429.getClass(), "prettyPrint", false);
        setBooleanField(term429, term429.getClass(), "visited", false);
        setField(term429, term429.getClass(), "docInfo", null);
        setBooleanField(term429, term429.getClass(), "unknown", false);
        setBooleanField(term429, term429.getClass(), "resolved", false);
        setField(term429, term429.getClass(), "resolveResult", null);
        setField(term429, term429.getClass(), "registry", null);
        setField(term404, term404.getClass(), "ownerFunction", term429);
        setBooleanField(term404, term404.getClass(), "prettyPrint", false);
        setBooleanField(term404, term404.getClass(), "visited", false);
        setField(term437, term437.getClass(), "info", null);
        setField(term437, term437.getClass(), "documentation", null);
        setField(term437, term437.getClass(), "associatedNode", null);
        setField(term437, term437.getClass(), "visibility", null);
        setIntField(term437, term437.getClass(), "bitset", 0);
        setField(term437, term437.getClass(), "type", null);
        setField(term437, term437.getClass(), "thisType", null);
        setBooleanField(term437, term437.getClass(), "includeDocumentation", false);
        setField(term404, term404.getClass(), "docInfo", term437);
        setBooleanField(term404, term404.getClass(), "unknown", false);
        setBooleanField(term404, term404.getClass(), "resolved", true);
        setField(term404, term404.getClass(), "resolveResult", null);
        setField(term404, term404.getClass(), "registry", null);
        HashMap term5166 = new HashMap();
        term5163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5168 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5163, term5163.getClass(), "className", "xBsXSDjXYK");
        setField(term5163, term5163.getClass(), "properties", term5166);
        setBooleanField(term5163, term5163.getClass(), "nativeType", true);
        setField(term5163, term5163.getClass(), "implicitPrototypeFallback", null);
        setField(term5167, term5167.getClass(), "call", null);
        setField(term5167, term5167.getClass(), "prototypeSlot", null);
        setField(term5167, term5167.getClass(), "kind", null);
        setField(term5167, term5167.getClass(), "typeOfThis", null);
        setField(term5167, term5167.getClass(), "source", null);
        setField(term5167, term5167.getClass(), "implementedInterfaces", null);
        setField(term5167, term5167.getClass(), "extendedInterfaces", null);
        setField(term5167, term5167.getClass(), "subTypes", null);
        setField(term5167, term5167.getClass(), "templateTypeName", null);
        setField(term5167, term5167.getClass(), "className", null);
        setField(term5167, term5167.getClass(), "properties", null);
        setBooleanField(term5167, term5167.getClass(), "nativeType", false);
        setField(term5167, term5167.getClass(), "implicitPrototypeFallback", null);
        setField(term5167, term5167.getClass(), "ownerFunction", null);
        setBooleanField(term5167, term5167.getClass(), "prettyPrint", false);
        setBooleanField(term5167, term5167.getClass(), "visited", false);
        setField(term5167, term5167.getClass(), "docInfo", null);
        setBooleanField(term5167, term5167.getClass(), "unknown", false);
        setBooleanField(term5167, term5167.getClass(), "resolved", false);
        setField(term5167, term5167.getClass(), "resolveResult", null);
        setField(term5167, term5167.getClass(), "registry", null);
        setField(term5163, term5163.getClass(), "ownerFunction", term5167);
        setBooleanField(term5163, term5163.getClass(), "prettyPrint", false);
        setBooleanField(term5163, term5163.getClass(), "visited", false);
        setField(term5168, term5168.getClass(), "info", null);
        setField(term5168, term5168.getClass(), "documentation", null);
        setField(term5168, term5168.getClass(), "associatedNode", null);
        setField(term5168, term5168.getClass(), "visibility", null);
        setIntField(term5168, term5168.getClass(), "bitset", 0);
        setField(term5168, term5168.getClass(), "type", null);
        setField(term5168, term5168.getClass(), "thisType", null);
        setBooleanField(term5168, term5168.getClass(), "includeDocumentation", false);
        setField(term5163, term5163.getClass(), "docInfo", term5168);
        setBooleanField(term5163, term5163.getClass(), "unknown", false);
        setBooleanField(term5163, term5163.getClass(), "resolved", true);
        setField(term5163, term5163.getClass(), "resolveResult", null);
        setField(term5163, term5163.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        Object retValue = callMethod(klass, "hasOwnProperty", argTypes, term404, args);
        assertTrue(recursiveEquals(term404, term5163));
        assertTrue(recursiveEquals(retValue, false));
    }

};


