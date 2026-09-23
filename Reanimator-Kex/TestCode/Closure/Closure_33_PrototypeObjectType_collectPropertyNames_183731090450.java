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

public class PrototypeObjectType_collectPropertyNames_183731090450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592;
     Object term630;
     Object term5652;
     Object term5659;

    public PrototypeObjectType_collectPropertyNames_183731090450() {
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
        Set<Object> term5671 =  ((Map) term631).keySet();
        term630 = new HashSet((Collection<? extends Object>) term5671);
        HashMap term5655 = new HashMap();
        term5652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5658 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term5652, term5652.getClass(), "className", "XylxrMBraH");
        setField(term5652, term5652.getClass(), "properties", term5655);
        setBooleanField(term5652, term5652.getClass(), "nativeType", false);
        setField(term5652, term5652.getClass(), "implicitPrototypeFallback", null);
        setField(term5657, term5657.getClass(), "call", null);
        setField(term5657, term5657.getClass(), "prototypeSlot", null);
        setField(term5657, term5657.getClass(), "kind", null);
        setField(term5657, term5657.getClass(), "typeOfThis", null);
        setField(term5657, term5657.getClass(), "source", null);
        setField(term5657, term5657.getClass(), "implementedInterfaces", null);
        setField(term5657, term5657.getClass(), "extendedInterfaces", null);
        setField(term5657, term5657.getClass(), "subTypes", null);
        setField(term5657, term5657.getClass(), "templateTypeName", null);
        setField(term5657, term5657.getClass(), "className", null);
        setField(term5657, term5657.getClass(), "properties", null);
        setBooleanField(term5657, term5657.getClass(), "nativeType", false);
        setField(term5657, term5657.getClass(), "implicitPrototypeFallback", null);
        setField(term5657, term5657.getClass(), "ownerFunction", null);
        setBooleanField(term5657, term5657.getClass(), "prettyPrint", false);
        setBooleanField(term5657, term5657.getClass(), "visited", false);
        setField(term5657, term5657.getClass(), "docInfo", null);
        setBooleanField(term5657, term5657.getClass(), "unknown", false);
        setBooleanField(term5657, term5657.getClass(), "resolved", false);
        setField(term5657, term5657.getClass(), "resolveResult", null);
        setField(term5657, term5657.getClass(), "registry", null);
        setField(term5652, term5652.getClass(), "ownerFunction", term5657);
        setBooleanField(term5652, term5652.getClass(), "prettyPrint", true);
        setBooleanField(term5652, term5652.getClass(), "visited", false);
        setField(term5658, term5658.getClass(), "info", null);
        setField(term5658, term5658.getClass(), "documentation", null);
        setField(term5658, term5658.getClass(), "associatedNode", null);
        setField(term5658, term5658.getClass(), "visibility", null);
        setIntField(term5658, term5658.getClass(), "bitset", 0);
        setField(term5658, term5658.getClass(), "type", null);
        setField(term5658, term5658.getClass(), "thisType", null);
        setBooleanField(term5658, term5658.getClass(), "includeDocumentation", false);
        setField(term5652, term5652.getClass(), "docInfo", term5658);
        setBooleanField(term5652, term5652.getClass(), "unknown", false);
        setBooleanField(term5652, term5652.getClass(), "resolved", false);
        setField(term5652, term5652.getClass(), "resolveResult", null);
        setField(term5652, term5652.getClass(), "registry", null);
        HashMap term5660 = new HashMap();
        Set<Object> term5682 =  ((Map) term5660).keySet();
        term5659 = new HashSet((Collection<? extends Object>) term5682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "collectPropertyNames", argTypes, term592, args);
        assertTrue(recursiveEquals(term592, term5652));
        assertTrue(recursiveEquals(term630, term5659));
    }

};


