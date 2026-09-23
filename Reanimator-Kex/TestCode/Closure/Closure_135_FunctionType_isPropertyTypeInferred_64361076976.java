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

public class FunctionType_isPropertyTypeInferred_64361076976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10612;

    public FunctionType_isPropertyTypeInferred_64361076976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38220 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term38219 = ((Class) term38220).getDeclaredField((String) "ORDINARY");
        ((Field) term38219).setAccessible(true);
        Object enum95 = ((Field) term38219).get((Object) null);
        term10612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10627 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10637 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10614, term10614.getClass(), "type", 798043553);
        setIntField(term10616, term10616.getClass(), "type", -868676396);
        setIntField(term10618, term10618.getClass(), "type", 0);
        setField(term10618, term10618.getClass(), "next", null);
        setField(term10618, term10618.getClass(), "first", null);
        setField(term10618, term10618.getClass(), "last", null);
        setField(term10618, term10618.getClass(), "propListHead", null);
        setIntField(term10618, term10618.getClass(), "sourcePosition", 0);
        setField(term10618, term10618.getClass(), "jsType", null);
        setField(term10618, term10618.getClass(), "parent", null);
        setField(term10616, term10616.getClass(), "next", term10618);
        setIntField(term10621, term10621.getClass(), "type", 0);
        setField(term10621, term10621.getClass(), "next", null);
        setField(term10621, term10621.getClass(), "first", null);
        setField(term10621, term10621.getClass(), "last", null);
        setField(term10621, term10621.getClass(), "propListHead", null);
        setIntField(term10621, term10621.getClass(), "sourcePosition", 0);
        setField(term10621, term10621.getClass(), "jsType", null);
        setField(term10621, term10621.getClass(), "parent", null);
        setField(term10616, term10616.getClass(), "first", term10621);
        setIntField(term10624, term10624.getClass(), "type", 0);
        setField(term10624, term10624.getClass(), "next", null);
        setField(term10624, term10624.getClass(), "first", null);
        setField(term10624, term10624.getClass(), "last", null);
        setField(term10624, term10624.getClass(), "propListHead", null);
        setIntField(term10624, term10624.getClass(), "sourcePosition", 0);
        setField(term10624, term10624.getClass(), "jsType", null);
        setField(term10624, term10624.getClass(), "parent", null);
        setField(term10616, term10616.getClass(), "last", term10624);
        setField(term10627, term10627.getClass(), "next", null);
        setIntField(term10627, term10627.getClass(), "type", 0);
        setIntField(term10627, term10627.getClass(), "intValue", 0);
        setField(term10627, term10627.getClass(), "objectValue", null);
        setField(term10616, term10616.getClass(), "propListHead", term10627);
        setIntField(term10616, term10616.getClass(), "sourcePosition", 1922684808);
        setField(term10616, term10616.getClass(), "jsType", null);
        setField(term10616, term10616.getClass(), "parent", null);
        setField(term10614, term10614.getClass(), "next", term10616);
        setIntField(term10631, term10631.getClass(), "type", 0);
        setField(term10631, term10631.getClass(), "next", null);
        setField(term10631, term10631.getClass(), "first", null);
        setField(term10631, term10631.getClass(), "last", null);
        setField(term10631, term10631.getClass(), "propListHead", null);
        setIntField(term10631, term10631.getClass(), "sourcePosition", 0);
        setField(term10631, term10631.getClass(), "jsType", null);
        setField(term10631, term10631.getClass(), "parent", null);
        setField(term10614, term10614.getClass(), "first", term10631);
        setIntField(term10634, term10634.getClass(), "type", 0);
        setField(term10634, term10634.getClass(), "next", null);
        setField(term10634, term10634.getClass(), "first", null);
        setField(term10634, term10634.getClass(), "last", null);
        setField(term10634, term10634.getClass(), "propListHead", null);
        setIntField(term10634, term10634.getClass(), "sourcePosition", 0);
        setField(term10634, term10634.getClass(), "jsType", null);
        setField(term10634, term10634.getClass(), "parent", null);
        setField(term10614, term10614.getClass(), "last", term10634);
        setField(term10637, term10637.getClass(), "next", null);
        setIntField(term10637, term10637.getClass(), "type", 0);
        setIntField(term10637, term10637.getClass(), "intValue", 0);
        setField(term10637, term10637.getClass(), "objectValue", null);
        setField(term10614, term10614.getClass(), "propListHead", term10637);
        setIntField(term10614, term10614.getClass(), "sourcePosition", -2005784375);
        setField(term10614, term10614.getClass(), "jsType", null);
        setField(term10614, term10614.getClass(), "parent", null);
        setField(term10613, term10613.getClass(), "parameters", term10614);
        setField(term10613, term10613.getClass(), "returnType", null);
        setBooleanField(term10613, term10613.getClass(), "resolved", false);
        setField(term10613, term10613.getClass(), "resolveResult", null);
        setField(term10613, term10613.getClass(), "registry", null);
        setField(term10612, term10612.getClass(), "call", term10613);
        setField(term10642, term10642.getClass(), "ownerFunction", null);
        setField(term10642, term10642.getClass(), "className", null);
        setField(term10642, term10642.getClass(), "properties", null);
        setField(term10642, term10642.getClass(), "implicitPrototype", null);
        setBooleanField(term10642, term10642.getClass(), "nativeType", false);
        setBooleanField(term10642, term10642.getClass(), "visited", false);
        setField(term10642, term10642.getClass(), "docInfo", null);
        setBooleanField(term10642, term10642.getClass(), "unknown", false);
        setBooleanField(term10642, term10642.getClass(), "resolved", false);
        setField(term10642, term10642.getClass(), "resolveResult", null);
        setField(term10642, term10642.getClass(), "registry", null);
        setField(term10612, term10612.getClass(), "prototype", term10642);
        setField(term10612, term10612.getClass(), "kind", enum95);
        setField(term10612, term10612.getClass(), "typeOfThis", null);
        setField(term10612, term10612.getClass(), "source", null);
        setField(term10612, term10612.getClass(), "implementedInterfaces", null);
        setField(term10612, term10612.getClass(), "subTypes", null);
        setField(term10612, term10612.getClass(), "templateTypeName", null);
        setField(term10612, term10612.getClass(), "className", null);
        setField(term10612, term10612.getClass(), "properties", null);
        setField(term10612, term10612.getClass(), "implicitPrototype", null);
        setBooleanField(term10612, term10612.getClass(), "nativeType", false);
        setBooleanField(term10612, term10612.getClass(), "visited", false);
        setField(term10612, term10612.getClass(), "docInfo", null);
        setBooleanField(term10612, term10612.getClass(), "unknown", false);
        setBooleanField(term10612, term10612.getClass(), "resolved", false);
        setField(term10612, term10612.getClass(), "resolveResult", null);
        setField(term10612, term10612.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bxrCBbrrct";
        try {
            callMethod(klass, "isPropertyTypeInferred", argTypes, term10612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


