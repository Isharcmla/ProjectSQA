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

public class FunctionType_visit_187068537796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16705;

    public FunctionType_visit_187068537796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51784 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term51783 = ((Class) term51784).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term51783).setAccessible(true);
        Object enum131 = ((Field) term51783).get((Object) null);
        term16705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term16706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term16707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16720 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16730 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term16707, term16707.getClass(), "type", -645429025);
        setIntField(term16709, term16709.getClass(), "type", 1003743923);
        setIntField(term16711, term16711.getClass(), "type", 0);
        setField(term16711, term16711.getClass(), "next", null);
        setField(term16711, term16711.getClass(), "first", null);
        setField(term16711, term16711.getClass(), "last", null);
        setField(term16711, term16711.getClass(), "propListHead", null);
        setIntField(term16711, term16711.getClass(), "sourcePosition", 0);
        setField(term16711, term16711.getClass(), "jsType", null);
        setField(term16711, term16711.getClass(), "parent", null);
        setField(term16709, term16709.getClass(), "next", term16711);
        setIntField(term16714, term16714.getClass(), "type", 0);
        setField(term16714, term16714.getClass(), "next", null);
        setField(term16714, term16714.getClass(), "first", null);
        setField(term16714, term16714.getClass(), "last", null);
        setField(term16714, term16714.getClass(), "propListHead", null);
        setIntField(term16714, term16714.getClass(), "sourcePosition", 0);
        setField(term16714, term16714.getClass(), "jsType", null);
        setField(term16714, term16714.getClass(), "parent", null);
        setField(term16709, term16709.getClass(), "first", term16714);
        setIntField(term16717, term16717.getClass(), "type", 0);
        setField(term16717, term16717.getClass(), "next", null);
        setField(term16717, term16717.getClass(), "first", null);
        setField(term16717, term16717.getClass(), "last", null);
        setField(term16717, term16717.getClass(), "propListHead", null);
        setIntField(term16717, term16717.getClass(), "sourcePosition", 0);
        setField(term16717, term16717.getClass(), "jsType", null);
        setField(term16717, term16717.getClass(), "parent", null);
        setField(term16709, term16709.getClass(), "last", term16717);
        setField(term16720, term16720.getClass(), "next", null);
        setIntField(term16720, term16720.getClass(), "type", 0);
        setIntField(term16720, term16720.getClass(), "intValue", 0);
        setField(term16720, term16720.getClass(), "objectValue", null);
        setField(term16709, term16709.getClass(), "propListHead", term16720);
        setIntField(term16709, term16709.getClass(), "sourcePosition", 1887772522);
        setField(term16709, term16709.getClass(), "jsType", null);
        setField(term16709, term16709.getClass(), "parent", null);
        setField(term16707, term16707.getClass(), "next", term16709);
        setIntField(term16724, term16724.getClass(), "type", 0);
        setField(term16724, term16724.getClass(), "next", null);
        setField(term16724, term16724.getClass(), "first", null);
        setField(term16724, term16724.getClass(), "last", null);
        setField(term16724, term16724.getClass(), "propListHead", null);
        setIntField(term16724, term16724.getClass(), "sourcePosition", 0);
        setField(term16724, term16724.getClass(), "jsType", null);
        setField(term16724, term16724.getClass(), "parent", null);
        setField(term16707, term16707.getClass(), "first", term16724);
        setIntField(term16727, term16727.getClass(), "type", 0);
        setField(term16727, term16727.getClass(), "next", null);
        setField(term16727, term16727.getClass(), "first", null);
        setField(term16727, term16727.getClass(), "last", null);
        setField(term16727, term16727.getClass(), "propListHead", null);
        setIntField(term16727, term16727.getClass(), "sourcePosition", 0);
        setField(term16727, term16727.getClass(), "jsType", null);
        setField(term16727, term16727.getClass(), "parent", null);
        setField(term16707, term16707.getClass(), "last", term16727);
        setField(term16730, term16730.getClass(), "next", null);
        setIntField(term16730, term16730.getClass(), "type", 0);
        setIntField(term16730, term16730.getClass(), "intValue", 0);
        setField(term16730, term16730.getClass(), "objectValue", null);
        setField(term16707, term16707.getClass(), "propListHead", term16730);
        setIntField(term16707, term16707.getClass(), "sourcePosition", 354196060);
        setField(term16707, term16707.getClass(), "jsType", null);
        setField(term16707, term16707.getClass(), "parent", null);
        setField(term16706, term16706.getClass(), "parameters", term16707);
        setField(term16706, term16706.getClass(), "returnType", null);
        setBooleanField(term16706, term16706.getClass(), "returnTypeInferred", false);
        setBooleanField(term16706, term16706.getClass(), "resolved", false);
        setField(term16706, term16706.getClass(), "resolveResult", null);
        setField(term16706, term16706.getClass(), "registry", null);
        setField(term16705, term16705.getClass(), "call", term16706);
        setField(term16736, term16736.getClass(), "ownerFunction", null);
        setField(term16736, term16736.getClass(), "className", null);
        setField(term16736, term16736.getClass(), "properties", null);
        setField(term16736, term16736.getClass(), "implicitPrototype", null);
        setBooleanField(term16736, term16736.getClass(), "nativeType", false);
        setBooleanField(term16736, term16736.getClass(), "prettyPrint", false);
        setBooleanField(term16736, term16736.getClass(), "visited", false);
        setField(term16736, term16736.getClass(), "docInfo", null);
        setBooleanField(term16736, term16736.getClass(), "unknown", false);
        setBooleanField(term16736, term16736.getClass(), "resolved", false);
        setField(term16736, term16736.getClass(), "resolveResult", null);
        setField(term16736, term16736.getClass(), "registry", null);
        setField(term16705, term16705.getClass(), "prototype", term16736);
        setField(term16705, term16705.getClass(), "kind", enum131);
        setField(term16705, term16705.getClass(), "typeOfThis", null);
        setField(term16705, term16705.getClass(), "source", null);
        setField(term16705, term16705.getClass(), "implementedInterfaces", null);
        setField(term16705, term16705.getClass(), "subTypes", null);
        setField(term16705, term16705.getClass(), "templateTypeName", null);
        setField(term16705, term16705.getClass(), "className", null);
        setField(term16705, term16705.getClass(), "properties", null);
        setField(term16705, term16705.getClass(), "implicitPrototype", null);
        setBooleanField(term16705, term16705.getClass(), "nativeType", false);
        setBooleanField(term16705, term16705.getClass(), "prettyPrint", false);
        setBooleanField(term16705, term16705.getClass(), "visited", false);
        setField(term16705, term16705.getClass(), "docInfo", null);
        setBooleanField(term16705, term16705.getClass(), "unknown", false);
        setBooleanField(term16705, term16705.getClass(), "resolved", false);
        setField(term16705, term16705.getClass(), "resolveResult", null);
        setField(term16705, term16705.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term16705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


