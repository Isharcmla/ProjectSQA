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
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245232;
     Object term245496;
     Object term245787;
     Object term245790;

    public FunctionType_tryMergeFunctionPiecewise_2003411845353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term245326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term245396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term245396, term245396.getClass(), "first", null);
        setField(term245326, term245326.getClass(), "parameters", term245396);
        setField(term245232, term245232.getClass(), "call", term245326);
        term245496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term245590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term245660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term245660, term245660.getClass(), "first", term245730);
        setField(term245590, term245590.getClass(), "parameters", term245660);
        setField(term245496, term245496.getClass(), "call", term245590);
        term245787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term245788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term245789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term245789, term245789.getClass(), "type", 0);
        setField(term245789, term245789.getClass(), "next", null);
        setField(term245789, term245789.getClass(), "first", null);
        setField(term245789, term245789.getClass(), "last", null);
        setField(term245789, term245789.getClass(), "propListHead", null);
        setIntField(term245789, term245789.getClass(), "sourcePosition", 0);
        setField(term245789, term245789.getClass(), "jsType", null);
        setField(term245789, term245789.getClass(), "parent", null);
        setField(term245788, term245788.getClass(), "parameters", term245789);
        setField(term245788, term245788.getClass(), "returnType", null);
        setBooleanField(term245788, term245788.getClass(), "returnTypeInferred", false);
        setBooleanField(term245788, term245788.getClass(), "resolved", false);
        setField(term245788, term245788.getClass(), "resolveResult", null);
        setField(term245788, term245788.getClass(), "registry", null);
        setField(term245787, term245787.getClass(), "call", term245788);
        setField(term245787, term245787.getClass(), "prototype", null);
        setField(term245787, term245787.getClass(), "kind", null);
        setField(term245787, term245787.getClass(), "typeOfThis", null);
        setField(term245787, term245787.getClass(), "source", null);
        setField(term245787, term245787.getClass(), "implementedInterfaces", null);
        setField(term245787, term245787.getClass(), "subTypes", null);
        setField(term245787, term245787.getClass(), "templateTypeName", null);
        setField(term245787, term245787.getClass(), "className", null);
        setField(term245787, term245787.getClass(), "properties", null);
        setBooleanField(term245787, term245787.getClass(), "nativeType", false);
        setField(term245787, term245787.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term245787, term245787.getClass(), "prettyPrint", false);
        setBooleanField(term245787, term245787.getClass(), "visited", false);
        setField(term245787, term245787.getClass(), "docInfo", null);
        setBooleanField(term245787, term245787.getClass(), "unknown", false);
        setBooleanField(term245787, term245787.getClass(), "resolved", false);
        setField(term245787, term245787.getClass(), "resolveResult", null);
        setField(term245787, term245787.getClass(), "registry", null);
        term245790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term245791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term245792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term245792, term245792.getClass(), "type", 0);
        setField(term245792, term245792.getClass(), "next", null);
        setIntField(term245793, term245793.getClass(), "type", 0);
        setField(term245793, term245793.getClass(), "next", null);
        setField(term245793, term245793.getClass(), "first", null);
        setField(term245793, term245793.getClass(), "last", null);
        setField(term245793, term245793.getClass(), "propListHead", null);
        setIntField(term245793, term245793.getClass(), "sourcePosition", 0);
        setField(term245793, term245793.getClass(), "jsType", null);
        setField(term245793, term245793.getClass(), "parent", null);
        setField(term245792, term245792.getClass(), "first", term245793);
        setField(term245792, term245792.getClass(), "last", null);
        setField(term245792, term245792.getClass(), "propListHead", null);
        setIntField(term245792, term245792.getClass(), "sourcePosition", 0);
        setField(term245792, term245792.getClass(), "jsType", null);
        setField(term245792, term245792.getClass(), "parent", null);
        setField(term245791, term245791.getClass(), "parameters", term245792);
        setField(term245791, term245791.getClass(), "returnType", null);
        setBooleanField(term245791, term245791.getClass(), "returnTypeInferred", false);
        setBooleanField(term245791, term245791.getClass(), "resolved", false);
        setField(term245791, term245791.getClass(), "resolveResult", null);
        setField(term245791, term245791.getClass(), "registry", null);
        setField(term245790, term245790.getClass(), "call", term245791);
        setField(term245790, term245790.getClass(), "prototype", null);
        setField(term245790, term245790.getClass(), "kind", null);
        setField(term245790, term245790.getClass(), "typeOfThis", null);
        setField(term245790, term245790.getClass(), "source", null);
        setField(term245790, term245790.getClass(), "implementedInterfaces", null);
        setField(term245790, term245790.getClass(), "subTypes", null);
        setField(term245790, term245790.getClass(), "templateTypeName", null);
        setField(term245790, term245790.getClass(), "className", null);
        setField(term245790, term245790.getClass(), "properties", null);
        setBooleanField(term245790, term245790.getClass(), "nativeType", false);
        setField(term245790, term245790.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term245790, term245790.getClass(), "prettyPrint", false);
        setBooleanField(term245790, term245790.getClass(), "visited", false);
        setField(term245790, term245790.getClass(), "docInfo", null);
        setBooleanField(term245790, term245790.getClass(), "unknown", false);
        setBooleanField(term245790, term245790.getClass(), "resolved", false);
        setField(term245790, term245790.getClass(), "resolveResult", null);
        setField(term245790, term245790.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term245496;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term245232, args);
        assertTrue(recursiveEquals(term245232, term245787));
        assertTrue(recursiveEquals(term245496, term245790));
        assertTrue(recursiveEquals(retValue, null));
    }

};


