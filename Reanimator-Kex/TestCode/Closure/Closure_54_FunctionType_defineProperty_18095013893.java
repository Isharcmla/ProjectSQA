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
import java.lang.Boolean;

public class FunctionType_defineProperty_18095013893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10637;
     Object term10700;
     Object term10702;

    public FunctionType_defineProperty_18095013893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42512 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term42511 = ((Class) term42512).getDeclaredField((String) "INTERFACE");
        ((Field) term42511).setAccessible(true);
        Object enum109 = ((Field) term42511).get((Object) null);
        term10637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term10668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term10639, term10639.getClass(), "type", -1467089634);
        setIntField(term10641, term10641.getClass(), "type", -1070592289);
        setIntField(term10643, term10643.getClass(), "type", 0);
        setField(term10643, term10643.getClass(), "next", null);
        setField(term10643, term10643.getClass(), "first", null);
        setField(term10643, term10643.getClass(), "last", null);
        setField(term10643, term10643.getClass(), "propListHead", null);
        setIntField(term10643, term10643.getClass(), "sourcePosition", 0);
        setField(term10643, term10643.getClass(), "jsType", null);
        setField(term10643, term10643.getClass(), "parent", null);
        setField(term10641, term10641.getClass(), "next", term10643);
        setIntField(term10646, term10646.getClass(), "type", 0);
        setField(term10646, term10646.getClass(), "next", null);
        setField(term10646, term10646.getClass(), "first", null);
        setField(term10646, term10646.getClass(), "last", null);
        setField(term10646, term10646.getClass(), "propListHead", null);
        setIntField(term10646, term10646.getClass(), "sourcePosition", 0);
        setField(term10646, term10646.getClass(), "jsType", null);
        setField(term10646, term10646.getClass(), "parent", null);
        setField(term10641, term10641.getClass(), "first", term10646);
        setIntField(term10649, term10649.getClass(), "type", 0);
        setField(term10649, term10649.getClass(), "next", null);
        setField(term10649, term10649.getClass(), "first", null);
        setField(term10649, term10649.getClass(), "last", null);
        setField(term10649, term10649.getClass(), "propListHead", null);
        setIntField(term10649, term10649.getClass(), "sourcePosition", 0);
        setField(term10649, term10649.getClass(), "jsType", null);
        setField(term10649, term10649.getClass(), "parent", null);
        setField(term10641, term10641.getClass(), "last", term10649);
        setField(term10641, term10641.getClass(), "propListHead", null);
        setIntField(term10641, term10641.getClass(), "sourcePosition", 0);
        setField(term10641, term10641.getClass(), "jsType", null);
        setField(term10641, term10641.getClass(), "parent", null);
        setField(term10639, term10639.getClass(), "next", term10641);
        setIntField(term10653, term10653.getClass(), "type", 0);
        setField(term10653, term10653.getClass(), "next", null);
        setField(term10653, term10653.getClass(), "first", null);
        setField(term10653, term10653.getClass(), "last", null);
        setField(term10653, term10653.getClass(), "propListHead", null);
        setIntField(term10653, term10653.getClass(), "sourcePosition", 0);
        setField(term10653, term10653.getClass(), "jsType", null);
        setField(term10653, term10653.getClass(), "parent", null);
        setField(term10639, term10639.getClass(), "first", term10653);
        setIntField(term10656, term10656.getClass(), "type", 0);
        setField(term10656, term10656.getClass(), "next", null);
        setField(term10656, term10656.getClass(), "first", null);
        setField(term10656, term10656.getClass(), "last", null);
        setField(term10656, term10656.getClass(), "propListHead", null);
        setIntField(term10656, term10656.getClass(), "sourcePosition", 0);
        setField(term10656, term10656.getClass(), "jsType", null);
        setField(term10656, term10656.getClass(), "parent", null);
        setField(term10639, term10639.getClass(), "last", term10656);
        setField(term10639, term10639.getClass(), "propListHead", null);
        setIntField(term10639, term10639.getClass(), "sourcePosition", 0);
        setField(term10639, term10639.getClass(), "jsType", null);
        setField(term10639, term10639.getClass(), "parent", null);
        setField(term10638, term10638.getClass(), "parameters", term10639);
        setField(term10638, term10638.getClass(), "returnType", null);
        setBooleanField(term10638, term10638.getClass(), "returnTypeInferred", false);
        setBooleanField(term10638, term10638.getClass(), "resolved", false);
        setField(term10638, term10638.getClass(), "resolveResult", null);
        setField(term10638, term10638.getClass(), "registry", null);
        setField(term10637, term10637.getClass(), "call", term10638);
        setField(term10662, term10662.getClass(), "className", null);
        setField(term10662, term10662.getClass(), "properties", null);
        setBooleanField(term10662, term10662.getClass(), "nativeType", false);
        setField(term10662, term10662.getClass(), "implicitPrototypeFallback", null);
        setField(term10662, term10662.getClass(), "ownerFunction", null);
        setBooleanField(term10662, term10662.getClass(), "prettyPrint", false);
        setBooleanField(term10662, term10662.getClass(), "visited", false);
        setField(term10662, term10662.getClass(), "docInfo", null);
        setBooleanField(term10662, term10662.getClass(), "unknown", false);
        setBooleanField(term10662, term10662.getClass(), "resolved", false);
        setField(term10662, term10662.getClass(), "resolveResult", null);
        setField(term10662, term10662.getClass(), "registry", null);
        setField(term10637, term10637.getClass(), "prototype", term10662);
        setField(term10668, term10668.getClass(), "name", null);
        setField(term10668, term10668.getClass(), "type", null);
        setBooleanField(term10668, term10668.getClass(), "inferred", false);
        setField(term10637, term10637.getClass(), "prototypeSlot", term10668);
        setField(term10637, term10637.getClass(), "kind", enum109);
        setField(term10637, term10637.getClass(), "typeOfThis", null);
        setField(term10637, term10637.getClass(), "source", null);
        setField(term10637, term10637.getClass(), "implementedInterfaces", null);
        setField(term10637, term10637.getClass(), "extendedInterfaces", null);
        setField(term10637, term10637.getClass(), "subTypes", null);
        setField(term10637, term10637.getClass(), "templateTypeName", null);
        setField(term10637, term10637.getClass(), "className", null);
        setField(term10637, term10637.getClass(), "properties", null);
        setBooleanField(term10637, term10637.getClass(), "nativeType", false);
        setField(term10637, term10637.getClass(), "implicitPrototypeFallback", null);
        setField(term10637, term10637.getClass(), "ownerFunction", null);
        setBooleanField(term10637, term10637.getClass(), "prettyPrint", false);
        setBooleanField(term10637, term10637.getClass(), "visited", false);
        setField(term10637, term10637.getClass(), "docInfo", null);
        setBooleanField(term10637, term10637.getClass(), "unknown", false);
        setBooleanField(term10637, term10637.getClass(), "resolved", false);
        setField(term10637, term10637.getClass(), "resolveResult", null);
        setField(term10637, term10637.getClass(), "registry", null);
        term10700 = new Boolean(true);
        term10702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10702, term10702.getClass(), "type", 1252951645);
        setIntField(term10704, term10704.getClass(), "type", -1015274146);
        setIntField(term10706, term10706.getClass(), "type", 0);
        setField(term10706, term10706.getClass(), "next", null);
        setField(term10706, term10706.getClass(), "first", null);
        setField(term10706, term10706.getClass(), "last", null);
        setField(term10706, term10706.getClass(), "propListHead", null);
        setIntField(term10706, term10706.getClass(), "sourcePosition", 0);
        setField(term10706, term10706.getClass(), "jsType", null);
        setField(term10706, term10706.getClass(), "parent", null);
        setField(term10704, term10704.getClass(), "next", term10706);
        setIntField(term10709, term10709.getClass(), "type", 0);
        setField(term10709, term10709.getClass(), "next", null);
        setField(term10709, term10709.getClass(), "first", null);
        setField(term10709, term10709.getClass(), "last", null);
        setField(term10709, term10709.getClass(), "propListHead", null);
        setIntField(term10709, term10709.getClass(), "sourcePosition", 0);
        setField(term10709, term10709.getClass(), "jsType", null);
        setField(term10709, term10709.getClass(), "parent", null);
        setField(term10704, term10704.getClass(), "first", term10709);
        setIntField(term10712, term10712.getClass(), "type", 0);
        setField(term10712, term10712.getClass(), "next", null);
        setField(term10712, term10712.getClass(), "first", null);
        setField(term10712, term10712.getClass(), "last", null);
        setField(term10712, term10712.getClass(), "propListHead", null);
        setIntField(term10712, term10712.getClass(), "sourcePosition", 0);
        setField(term10712, term10712.getClass(), "jsType", null);
        setField(term10712, term10712.getClass(), "parent", null);
        setField(term10704, term10704.getClass(), "last", term10712);
        setField(term10704, term10704.getClass(), "propListHead", null);
        setIntField(term10704, term10704.getClass(), "sourcePosition", 0);
        setField(term10704, term10704.getClass(), "jsType", null);
        setField(term10704, term10704.getClass(), "parent", null);
        setField(term10702, term10702.getClass(), "next", term10704);
        setIntField(term10716, term10716.getClass(), "type", 0);
        setField(term10716, term10716.getClass(), "next", null);
        setField(term10716, term10716.getClass(), "first", null);
        setField(term10716, term10716.getClass(), "last", null);
        setField(term10716, term10716.getClass(), "propListHead", null);
        setIntField(term10716, term10716.getClass(), "sourcePosition", 0);
        setField(term10716, term10716.getClass(), "jsType", null);
        setField(term10716, term10716.getClass(), "parent", null);
        setField(term10702, term10702.getClass(), "first", term10716);
        setIntField(term10719, term10719.getClass(), "type", 0);
        setField(term10719, term10719.getClass(), "next", null);
        setField(term10719, term10719.getClass(), "first", null);
        setField(term10719, term10719.getClass(), "last", null);
        setField(term10719, term10719.getClass(), "propListHead", null);
        setIntField(term10719, term10719.getClass(), "sourcePosition", 0);
        setField(term10719, term10719.getClass(), "jsType", null);
        setField(term10719, term10719.getClass(), "parent", null);
        setField(term10702, term10702.getClass(), "last", term10719);
        setField(term10702, term10702.getClass(), "propListHead", null);
        setIntField(term10702, term10702.getClass(), "sourcePosition", 0);
        setField(term10702, term10702.getClass(), "jsType", null);
        setField(term10702, term10702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = "HHmNoYxIGj";
        args[1] = null;
        args[2] = term10700;
        args[3] = term10702;
        try {
            callMethod(klass, "defineProperty", argTypes, term10637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


