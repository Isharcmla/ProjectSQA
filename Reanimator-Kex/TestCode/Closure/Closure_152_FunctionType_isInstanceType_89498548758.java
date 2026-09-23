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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_isInstanceType_89498548758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2705;

    public FunctionType_isInstanceType_89498548758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25005 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term25004 = ((Class) term25005).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term25004).setAccessible(true);
        Object enum65 = ((Field) term25004).get((Object) null);
        term2705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2720 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2730 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term2707, term2707.getClass(), "type", 458147407);
        setIntField(term2709, term2709.getClass(), "type", 1596070772);
        setIntField(term2711, term2711.getClass(), "type", 0);
        setField(term2711, term2711.getClass(), "next", null);
        setField(term2711, term2711.getClass(), "first", null);
        setField(term2711, term2711.getClass(), "last", null);
        setField(term2711, term2711.getClass(), "propListHead", null);
        setIntField(term2711, term2711.getClass(), "sourcePosition", 0);
        setField(term2711, term2711.getClass(), "jsType", null);
        setField(term2711, term2711.getClass(), "parent", null);
        setField(term2709, term2709.getClass(), "next", term2711);
        setIntField(term2714, term2714.getClass(), "type", 0);
        setField(term2714, term2714.getClass(), "next", null);
        setField(term2714, term2714.getClass(), "first", null);
        setField(term2714, term2714.getClass(), "last", null);
        setField(term2714, term2714.getClass(), "propListHead", null);
        setIntField(term2714, term2714.getClass(), "sourcePosition", 0);
        setField(term2714, term2714.getClass(), "jsType", null);
        setField(term2714, term2714.getClass(), "parent", null);
        setField(term2709, term2709.getClass(), "first", term2714);
        setIntField(term2717, term2717.getClass(), "type", 0);
        setField(term2717, term2717.getClass(), "next", null);
        setField(term2717, term2717.getClass(), "first", null);
        setField(term2717, term2717.getClass(), "last", null);
        setField(term2717, term2717.getClass(), "propListHead", null);
        setIntField(term2717, term2717.getClass(), "sourcePosition", 0);
        setField(term2717, term2717.getClass(), "jsType", null);
        setField(term2717, term2717.getClass(), "parent", null);
        setField(term2709, term2709.getClass(), "last", term2717);
        setField(term2720, term2720.getClass(), "next", null);
        setIntField(term2720, term2720.getClass(), "type", 0);
        setIntField(term2720, term2720.getClass(), "intValue", 0);
        setField(term2720, term2720.getClass(), "objectValue", null);
        setField(term2709, term2709.getClass(), "propListHead", term2720);
        setIntField(term2709, term2709.getClass(), "sourcePosition", 97029295);
        setField(term2709, term2709.getClass(), "jsType", null);
        setField(term2709, term2709.getClass(), "parent", null);
        setField(term2707, term2707.getClass(), "next", term2709);
        setIntField(term2724, term2724.getClass(), "type", 0);
        setField(term2724, term2724.getClass(), "next", null);
        setField(term2724, term2724.getClass(), "first", null);
        setField(term2724, term2724.getClass(), "last", null);
        setField(term2724, term2724.getClass(), "propListHead", null);
        setIntField(term2724, term2724.getClass(), "sourcePosition", 0);
        setField(term2724, term2724.getClass(), "jsType", null);
        setField(term2724, term2724.getClass(), "parent", null);
        setField(term2707, term2707.getClass(), "first", term2724);
        setIntField(term2727, term2727.getClass(), "type", 0);
        setField(term2727, term2727.getClass(), "next", null);
        setField(term2727, term2727.getClass(), "first", null);
        setField(term2727, term2727.getClass(), "last", null);
        setField(term2727, term2727.getClass(), "propListHead", null);
        setIntField(term2727, term2727.getClass(), "sourcePosition", 0);
        setField(term2727, term2727.getClass(), "jsType", null);
        setField(term2727, term2727.getClass(), "parent", null);
        setField(term2707, term2707.getClass(), "last", term2727);
        setField(term2730, term2730.getClass(), "next", null);
        setIntField(term2730, term2730.getClass(), "type", 0);
        setIntField(term2730, term2730.getClass(), "intValue", 0);
        setField(term2730, term2730.getClass(), "objectValue", null);
        setField(term2707, term2707.getClass(), "propListHead", term2730);
        setIntField(term2707, term2707.getClass(), "sourcePosition", -1371869594);
        setField(term2707, term2707.getClass(), "jsType", null);
        setField(term2707, term2707.getClass(), "parent", null);
        setField(term2706, term2706.getClass(), "parameters", term2707);
        setField(term2706, term2706.getClass(), "returnType", null);
        setBooleanField(term2706, term2706.getClass(), "returnTypeInferred", false);
        setBooleanField(term2706, term2706.getClass(), "resolved", false);
        setField(term2706, term2706.getClass(), "resolveResult", null);
        setField(term2706, term2706.getClass(), "registry", null);
        setField(term2705, term2705.getClass(), "call", term2706);
        setField(term2736, term2736.getClass(), "ownerFunction", null);
        setField(term2736, term2736.getClass(), "className", null);
        setField(term2736, term2736.getClass(), "properties", null);
        setBooleanField(term2736, term2736.getClass(), "nativeType", false);
        setField(term2736, term2736.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term2736, term2736.getClass(), "prettyPrint", false);
        setBooleanField(term2736, term2736.getClass(), "visited", false);
        setField(term2736, term2736.getClass(), "docInfo", null);
        setBooleanField(term2736, term2736.getClass(), "unknown", false);
        setBooleanField(term2736, term2736.getClass(), "resolved", false);
        setField(term2736, term2736.getClass(), "resolveResult", null);
        setField(term2736, term2736.getClass(), "registry", null);
        setField(term2705, term2705.getClass(), "prototype", term2736);
        setField(term2705, term2705.getClass(), "kind", enum65);
        setField(term2705, term2705.getClass(), "typeOfThis", null);
        setField(term2705, term2705.getClass(), "source", null);
        setField(term2705, term2705.getClass(), "implementedInterfaces", null);
        setField(term2705, term2705.getClass(), "subTypes", null);
        setField(term2705, term2705.getClass(), "templateTypeName", null);
        setField(term2705, term2705.getClass(), "className", null);
        setField(term2705, term2705.getClass(), "properties", null);
        setBooleanField(term2705, term2705.getClass(), "nativeType", false);
        setField(term2705, term2705.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term2705, term2705.getClass(), "prettyPrint", false);
        setBooleanField(term2705, term2705.getClass(), "visited", false);
        setField(term2705, term2705.getClass(), "docInfo", null);
        setBooleanField(term2705, term2705.getClass(), "unknown", false);
        setBooleanField(term2705, term2705.getClass(), "resolved", false);
        setField(term2705, term2705.getClass(), "resolveResult", null);
        setField(term2705, term2705.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isInstanceType", argTypes, term2705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


