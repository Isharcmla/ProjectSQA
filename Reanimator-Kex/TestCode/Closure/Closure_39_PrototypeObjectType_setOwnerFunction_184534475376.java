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
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class PrototypeObjectType_setOwnerFunction_184534475376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2719;
     Object term2757;

    public PrototypeObjectType_setOwnerFunction_184534475376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2732 = new HashMap();
        term2719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2752 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2719, term2719.getClass(), "className", "pJbnHTYrxn");
        setField(term2719, term2719.getClass(), "properties", term2732);
        setBooleanField(term2719, term2719.getClass(), "nativeType", true);
        setField(term2719, term2719.getClass(), "implicitPrototypeFallback", null);
        setField(term2744, term2744.getClass(), "call", null);
        setField(term2744, term2744.getClass(), "prototypeSlot", null);
        setField(term2744, term2744.getClass(), "kind", null);
        setField(term2744, term2744.getClass(), "typeOfThis", null);
        setField(term2744, term2744.getClass(), "source", null);
        setField(term2744, term2744.getClass(), "implementedInterfaces", null);
        setField(term2744, term2744.getClass(), "extendedInterfaces", null);
        setField(term2744, term2744.getClass(), "subTypes", null);
        setField(term2744, term2744.getClass(), "templateTypeName", null);
        setField(term2744, term2744.getClass(), "className", null);
        setField(term2744, term2744.getClass(), "properties", null);
        setBooleanField(term2744, term2744.getClass(), "nativeType", false);
        setField(term2744, term2744.getClass(), "implicitPrototypeFallback", null);
        setField(term2744, term2744.getClass(), "ownerFunction", null);
        setBooleanField(term2744, term2744.getClass(), "prettyPrint", false);
        setBooleanField(term2744, term2744.getClass(), "visited", false);
        setField(term2744, term2744.getClass(), "docInfo", null);
        setBooleanField(term2744, term2744.getClass(), "unknown", false);
        setBooleanField(term2744, term2744.getClass(), "resolved", false);
        setField(term2744, term2744.getClass(), "resolveResult", null);
        setField(term2744, term2744.getClass(), "registry", null);
        setField(term2719, term2719.getClass(), "ownerFunction", term2744);
        setBooleanField(term2719, term2719.getClass(), "prettyPrint", true);
        setBooleanField(term2719, term2719.getClass(), "visited", true);
        setField(term2752, term2752.getClass(), "info", null);
        setField(term2752, term2752.getClass(), "documentation", null);
        setField(term2752, term2752.getClass(), "associatedNode", null);
        setField(term2752, term2752.getClass(), "visibility", null);
        setIntField(term2752, term2752.getClass(), "bitset", 0);
        setField(term2752, term2752.getClass(), "type", null);
        setField(term2752, term2752.getClass(), "thisType", null);
        setBooleanField(term2752, term2752.getClass(), "includeDocumentation", false);
        setField(term2719, term2719.getClass(), "docInfo", term2752);
        setBooleanField(term2719, term2719.getClass(), "unknown", true);
        setBooleanField(term2719, term2719.getClass(), "resolved", false);
        setField(term2719, term2719.getClass(), "resolveResult", null);
        setField(term2719, term2719.getClass(), "registry", null);
        Class<? extends Object> term9313 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term9312 = ((Class) term9313).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term9312).setAccessible(true);
        Object enum2 = ((Field) term9312).get((Object) null);
        term2757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term2759, term2759.getClass(), "type", -936895502);
        setIntField(term2761, term2761.getClass(), "type", -129547140);
        setIntField(term2763, term2763.getClass(), "type", 199287428);
        setField(term2763, term2763.getClass(), "next", null);
        setField(term2763, term2763.getClass(), "first", null);
        setField(term2763, term2763.getClass(), "last", null);
        setField(term2763, term2763.getClass(), "propListHead", null);
        setIntField(term2763, term2763.getClass(), "sourcePosition", 0);
        setField(term2763, term2763.getClass(), "jsType", null);
        setField(term2763, term2763.getClass(), "parent", null);
        setField(term2761, term2761.getClass(), "next", term2763);
        setIntField(term2766, term2766.getClass(), "type", 0);
        setField(term2766, term2766.getClass(), "next", null);
        setField(term2766, term2766.getClass(), "first", null);
        setField(term2766, term2766.getClass(), "last", null);
        setField(term2766, term2766.getClass(), "propListHead", null);
        setIntField(term2766, term2766.getClass(), "sourcePosition", 0);
        setField(term2766, term2766.getClass(), "jsType", null);
        setField(term2766, term2766.getClass(), "parent", null);
        setField(term2761, term2761.getClass(), "first", term2766);
        setIntField(term2769, term2769.getClass(), "type", 2009020256);
        setField(term2769, term2769.getClass(), "next", null);
        setField(term2769, term2769.getClass(), "first", term2766);
        setField(term2769, term2769.getClass(), "last", term2769);
        setField(term2769, term2769.getClass(), "propListHead", null);
        setIntField(term2769, term2769.getClass(), "sourcePosition", 0);
        setField(term2769, term2769.getClass(), "jsType", null);
        setField(term2769, term2769.getClass(), "parent", null);
        setField(term2761, term2761.getClass(), "last", term2769);
        setField(term2761, term2761.getClass(), "propListHead", null);
        setIntField(term2761, term2761.getClass(), "sourcePosition", 0);
        setField(term2761, term2761.getClass(), "jsType", null);
        setField(term2761, term2761.getClass(), "parent", null);
        setField(term2759, term2759.getClass(), "next", term2761);
        setIntField(term2773, term2773.getClass(), "type", 306847454);
        setIntField(term2775, term2775.getClass(), "type", 1745276158);
        setField(term2775, term2775.getClass(), "next", term2769);
        setField(term2775, term2775.getClass(), "first", null);
        setField(term2775, term2775.getClass(), "last", term2759);
        setField(term2775, term2775.getClass(), "propListHead", null);
        setIntField(term2775, term2775.getClass(), "sourcePosition", 0);
        setField(term2775, term2775.getClass(), "jsType", null);
        setField(term2775, term2775.getClass(), "parent", null);
        setField(term2773, term2773.getClass(), "next", term2775);
        setField(term2773, term2773.getClass(), "first", term2773);
        setIntField(term2778, term2778.getClass(), "type", -1195339592);
        setField(term2778, term2778.getClass(), "next", null);
        setField(term2778, term2778.getClass(), "first", term2766);
        setField(term2778, term2778.getClass(), "last", term2769);
        setField(term2778, term2778.getClass(), "propListHead", null);
        setIntField(term2778, term2778.getClass(), "sourcePosition", 0);
        setField(term2778, term2778.getClass(), "jsType", null);
        setField(term2778, term2778.getClass(), "parent", null);
        setField(term2773, term2773.getClass(), "last", term2778);
        setField(term2773, term2773.getClass(), "propListHead", null);
        setIntField(term2773, term2773.getClass(), "sourcePosition", 0);
        setField(term2773, term2773.getClass(), "jsType", null);
        setField(term2773, term2773.getClass(), "parent", null);
        setField(term2759, term2759.getClass(), "first", term2773);
        setField(term2759, term2759.getClass(), "last", term2763);
        setField(term2759, term2759.getClass(), "propListHead", null);
        setIntField(term2759, term2759.getClass(), "sourcePosition", 0);
        setField(term2759, term2759.getClass(), "jsType", null);
        setField(term2759, term2759.getClass(), "parent", null);
        setField(term2758, term2758.getClass(), "parameters", term2759);
        setField(term2758, term2758.getClass(), "returnType", null);
        setBooleanField(term2758, term2758.getClass(), "returnTypeInferred", false);
        setBooleanField(term2758, term2758.getClass(), "resolved", false);
        setField(term2758, term2758.getClass(), "resolveResult", null);
        setField(term2758, term2758.getClass(), "registry", null);
        setField(term2757, term2757.getClass(), "call", term2758);
        setField(term2785, term2785.getClass(), "name", null);
        setField(term2785, term2785.getClass(), "type", null);
        setBooleanField(term2785, term2785.getClass(), "inferred", false);
        setField(term2785, term2785.getClass(), "propertyNode", null);
        setField(term2785, term2785.getClass(), "docInfo", null);
        setField(term2757, term2757.getClass(), "prototypeSlot", term2785);
        setField(term2757, term2757.getClass(), "kind", enum2);
        setField(term2757, term2757.getClass(), "typeOfThis", null);
        setField(term2757, term2757.getClass(), "source", null);
        setField(term2757, term2757.getClass(), "implementedInterfaces", null);
        setField(term2757, term2757.getClass(), "extendedInterfaces", null);
        setField(term2757, term2757.getClass(), "subTypes", null);
        setField(term2757, term2757.getClass(), "templateTypeName", null);
        setField(term2757, term2757.getClass(), "className", null);
        setField(term2757, term2757.getClass(), "properties", null);
        setBooleanField(term2757, term2757.getClass(), "nativeType", false);
        setField(term2757, term2757.getClass(), "implicitPrototypeFallback", null);
        setField(term2757, term2757.getClass(), "ownerFunction", null);
        setBooleanField(term2757, term2757.getClass(), "prettyPrint", false);
        setBooleanField(term2757, term2757.getClass(), "visited", false);
        setField(term2757, term2757.getClass(), "docInfo", null);
        setBooleanField(term2757, term2757.getClass(), "unknown", false);
        setBooleanField(term2757, term2757.getClass(), "resolved", false);
        setField(term2757, term2757.getClass(), "resolveResult", null);
        setField(term2757, term2757.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term2757;
        try {
            callMethod(klass, "setOwnerFunction", argTypes, term2719, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


