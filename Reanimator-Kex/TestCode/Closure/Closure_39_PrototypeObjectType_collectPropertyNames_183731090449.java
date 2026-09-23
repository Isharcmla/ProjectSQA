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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PrototypeObjectType_collectPropertyNames_183731090449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592;
     Object term630;
     Object term5604;
     Object term5611;

    public PrototypeObjectType_collectPropertyNames_183731090449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term605 = new HashMap();
        term592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term625 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term592, term592.getClass(), "className", "XylxrMBraH");
        setField(term592, term592.getClass(), "properties", term605);
        setBooleanField(term592, term592.getClass(), "nativeType", false);
        setField(term592, term592.getClass(), "implicitPrototypeFallback", null);
        setField(term617, term617.getClass(), "call", null);
        setField(term617, term617.getClass(), "prototypeSlot", null);
        setField(term617, term617.getClass(), "kind", null);
        setField(term617, term617.getClass(), "typeOfThis", null);
        setField(term617, term617.getClass(), "source", null);
        setField(term617, term617.getClass(), "implementedInterfaces", null);
        setField(term617, term617.getClass(), "extendedInterfaces", null);
        setField(term617, term617.getClass(), "subTypes", null);
        setField(term617, term617.getClass(), "templateTypeName", null);
        setField(term617, term617.getClass(), "className", null);
        setField(term617, term617.getClass(), "properties", null);
        setBooleanField(term617, term617.getClass(), "nativeType", false);
        setField(term617, term617.getClass(), "implicitPrototypeFallback", null);
        setField(term617, term617.getClass(), "ownerFunction", null);
        setBooleanField(term617, term617.getClass(), "prettyPrint", false);
        setBooleanField(term617, term617.getClass(), "visited", false);
        setField(term617, term617.getClass(), "docInfo", null);
        setBooleanField(term617, term617.getClass(), "unknown", false);
        setBooleanField(term617, term617.getClass(), "resolved", false);
        setField(term617, term617.getClass(), "resolveResult", null);
        setField(term617, term617.getClass(), "registry", null);
        setField(term592, term592.getClass(), "ownerFunction", term617);
        setBooleanField(term592, term592.getClass(), "prettyPrint", true);
        setBooleanField(term592, term592.getClass(), "visited", false);
        setField(term625, term625.getClass(), "info", null);
        setField(term625, term625.getClass(), "documentation", null);
        setField(term625, term625.getClass(), "associatedNode", null);
        setField(term625, term625.getClass(), "visibility", null);
        setIntField(term625, term625.getClass(), "bitset", 0);
        setField(term625, term625.getClass(), "type", null);
        setField(term625, term625.getClass(), "thisType", null);
        setBooleanField(term625, term625.getClass(), "includeDocumentation", false);
        setField(term592, term592.getClass(), "docInfo", term625);
        setBooleanField(term592, term592.getClass(), "unknown", false);
        setBooleanField(term592, term592.getClass(), "resolved", false);
        setField(term592, term592.getClass(), "resolveResult", null);
        setField(term592, term592.getClass(), "registry", null);
        HashMap term631 = new HashMap();
        Set<Object> term5623 =  ((Map) term631).keySet();
        term630 = new HashSet((Collection<? extends Object>) term5623);
        HashMap term5607 = new HashMap();
        term5604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5610 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5604, term5604.getClass(), "className", "XylxrMBraH");
        setField(term5604, term5604.getClass(), "properties", term5607);
        setBooleanField(term5604, term5604.getClass(), "nativeType", false);
        setField(term5604, term5604.getClass(), "implicitPrototypeFallback", null);
        setField(term5609, term5609.getClass(), "call", null);
        setField(term5609, term5609.getClass(), "prototypeSlot", null);
        setField(term5609, term5609.getClass(), "kind", null);
        setField(term5609, term5609.getClass(), "typeOfThis", null);
        setField(term5609, term5609.getClass(), "source", null);
        setField(term5609, term5609.getClass(), "implementedInterfaces", null);
        setField(term5609, term5609.getClass(), "extendedInterfaces", null);
        setField(term5609, term5609.getClass(), "subTypes", null);
        setField(term5609, term5609.getClass(), "templateTypeName", null);
        setField(term5609, term5609.getClass(), "className", null);
        setField(term5609, term5609.getClass(), "properties", null);
        setBooleanField(term5609, term5609.getClass(), "nativeType", false);
        setField(term5609, term5609.getClass(), "implicitPrototypeFallback", null);
        setField(term5609, term5609.getClass(), "ownerFunction", null);
        setBooleanField(term5609, term5609.getClass(), "prettyPrint", false);
        setBooleanField(term5609, term5609.getClass(), "visited", false);
        setField(term5609, term5609.getClass(), "docInfo", null);
        setBooleanField(term5609, term5609.getClass(), "unknown", false);
        setBooleanField(term5609, term5609.getClass(), "resolved", false);
        setField(term5609, term5609.getClass(), "resolveResult", null);
        setField(term5609, term5609.getClass(), "registry", null);
        setField(term5604, term5604.getClass(), "ownerFunction", term5609);
        setBooleanField(term5604, term5604.getClass(), "prettyPrint", true);
        setBooleanField(term5604, term5604.getClass(), "visited", false);
        setField(term5610, term5610.getClass(), "info", null);
        setField(term5610, term5610.getClass(), "documentation", null);
        setField(term5610, term5610.getClass(), "associatedNode", null);
        setField(term5610, term5610.getClass(), "visibility", null);
        setIntField(term5610, term5610.getClass(), "bitset", 0);
        setField(term5610, term5610.getClass(), "type", null);
        setField(term5610, term5610.getClass(), "thisType", null);
        setBooleanField(term5610, term5610.getClass(), "includeDocumentation", false);
        setField(term5604, term5604.getClass(), "docInfo", term5610);
        setBooleanField(term5604, term5604.getClass(), "unknown", false);
        setBooleanField(term5604, term5604.getClass(), "resolved", false);
        setField(term5604, term5604.getClass(), "resolveResult", null);
        setField(term5604, term5604.getClass(), "registry", null);
        HashMap term5612 = new HashMap();
        Set<Object> term5634 =  ((Map) term5612).keySet();
        term5611 = new HashSet((Collection<? extends Object>) term5634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "collectPropertyNames", argTypes, term592, args);
        assertTrue(recursiveEquals(term592, term5604));
        assertTrue(recursiveEquals(term630, term5611));
    }

};


