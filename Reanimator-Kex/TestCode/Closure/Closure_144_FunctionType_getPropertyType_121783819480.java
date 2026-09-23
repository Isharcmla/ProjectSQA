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

public class FunctionType_getPropertyType_121783819480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10628;

    public FunctionType_getPropertyType_121783819480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40254 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term40253 = ((Class) term40254).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term40253).setAccessible(true);
        Object enum105 = ((Field) term40253).get((Object) null);
        term10628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10643 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10653 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10630, term10630.getClass(), "type", -680920524);
        setIntField(term10632, term10632.getClass(), "type", -1533843432);
        setIntField(term10634, term10634.getClass(), "type", 0);
        setField(term10634, term10634.getClass(), "next", null);
        setField(term10634, term10634.getClass(), "first", null);
        setField(term10634, term10634.getClass(), "last", null);
        setField(term10634, term10634.getClass(), "propListHead", null);
        setIntField(term10634, term10634.getClass(), "sourcePosition", 0);
        setField(term10634, term10634.getClass(), "jsType", null);
        setField(term10634, term10634.getClass(), "parent", null);
        setField(term10632, term10632.getClass(), "next", term10634);
        setIntField(term10637, term10637.getClass(), "type", 0);
        setField(term10637, term10637.getClass(), "next", null);
        setField(term10637, term10637.getClass(), "first", null);
        setField(term10637, term10637.getClass(), "last", null);
        setField(term10637, term10637.getClass(), "propListHead", null);
        setIntField(term10637, term10637.getClass(), "sourcePosition", 0);
        setField(term10637, term10637.getClass(), "jsType", null);
        setField(term10637, term10637.getClass(), "parent", null);
        setField(term10632, term10632.getClass(), "first", term10637);
        setIntField(term10640, term10640.getClass(), "type", 0);
        setField(term10640, term10640.getClass(), "next", null);
        setField(term10640, term10640.getClass(), "first", null);
        setField(term10640, term10640.getClass(), "last", null);
        setField(term10640, term10640.getClass(), "propListHead", null);
        setIntField(term10640, term10640.getClass(), "sourcePosition", 0);
        setField(term10640, term10640.getClass(), "jsType", null);
        setField(term10640, term10640.getClass(), "parent", null);
        setField(term10632, term10632.getClass(), "last", term10640);
        setField(term10643, term10643.getClass(), "next", null);
        setIntField(term10643, term10643.getClass(), "type", 0);
        setIntField(term10643, term10643.getClass(), "intValue", 0);
        setField(term10643, term10643.getClass(), "objectValue", null);
        setField(term10632, term10632.getClass(), "propListHead", term10643);
        setIntField(term10632, term10632.getClass(), "sourcePosition", -123338791);
        setField(term10632, term10632.getClass(), "jsType", null);
        setField(term10632, term10632.getClass(), "parent", null);
        setField(term10630, term10630.getClass(), "next", term10632);
        setIntField(term10647, term10647.getClass(), "type", 0);
        setField(term10647, term10647.getClass(), "next", null);
        setField(term10647, term10647.getClass(), "first", null);
        setField(term10647, term10647.getClass(), "last", null);
        setField(term10647, term10647.getClass(), "propListHead", null);
        setIntField(term10647, term10647.getClass(), "sourcePosition", 0);
        setField(term10647, term10647.getClass(), "jsType", null);
        setField(term10647, term10647.getClass(), "parent", null);
        setField(term10630, term10630.getClass(), "first", term10647);
        setIntField(term10650, term10650.getClass(), "type", 0);
        setField(term10650, term10650.getClass(), "next", null);
        setField(term10650, term10650.getClass(), "first", null);
        setField(term10650, term10650.getClass(), "last", null);
        setField(term10650, term10650.getClass(), "propListHead", null);
        setIntField(term10650, term10650.getClass(), "sourcePosition", 0);
        setField(term10650, term10650.getClass(), "jsType", null);
        setField(term10650, term10650.getClass(), "parent", null);
        setField(term10630, term10630.getClass(), "last", term10650);
        setField(term10653, term10653.getClass(), "next", null);
        setIntField(term10653, term10653.getClass(), "type", 0);
        setIntField(term10653, term10653.getClass(), "intValue", 0);
        setField(term10653, term10653.getClass(), "objectValue", null);
        setField(term10630, term10630.getClass(), "propListHead", term10653);
        setIntField(term10630, term10630.getClass(), "sourcePosition", -1467089634);
        setField(term10630, term10630.getClass(), "jsType", null);
        setField(term10630, term10630.getClass(), "parent", null);
        setField(term10629, term10629.getClass(), "parameters", term10630);
        setField(term10629, term10629.getClass(), "returnType", null);
        setBooleanField(term10629, term10629.getClass(), "returnTypeInferred", false);
        setBooleanField(term10629, term10629.getClass(), "resolved", false);
        setField(term10629, term10629.getClass(), "resolveResult", null);
        setField(term10629, term10629.getClass(), "registry", null);
        setField(term10628, term10628.getClass(), "call", term10629);
        setField(term10659, term10659.getClass(), "ownerFunction", null);
        setField(term10659, term10659.getClass(), "className", null);
        setField(term10659, term10659.getClass(), "properties", null);
        setField(term10659, term10659.getClass(), "implicitPrototype", null);
        setBooleanField(term10659, term10659.getClass(), "nativeType", false);
        setBooleanField(term10659, term10659.getClass(), "prettyPrint", false);
        setBooleanField(term10659, term10659.getClass(), "visited", false);
        setField(term10659, term10659.getClass(), "docInfo", null);
        setBooleanField(term10659, term10659.getClass(), "unknown", false);
        setBooleanField(term10659, term10659.getClass(), "resolved", false);
        setField(term10659, term10659.getClass(), "resolveResult", null);
        setField(term10659, term10659.getClass(), "registry", null);
        setField(term10628, term10628.getClass(), "prototype", term10659);
        setField(term10628, term10628.getClass(), "kind", enum105);
        setField(term10628, term10628.getClass(), "typeOfThis", null);
        setField(term10628, term10628.getClass(), "source", null);
        setField(term10628, term10628.getClass(), "implementedInterfaces", null);
        setField(term10628, term10628.getClass(), "subTypes", null);
        setField(term10628, term10628.getClass(), "templateTypeName", null);
        setField(term10628, term10628.getClass(), "className", null);
        setField(term10628, term10628.getClass(), "properties", null);
        setField(term10628, term10628.getClass(), "implicitPrototype", null);
        setBooleanField(term10628, term10628.getClass(), "nativeType", false);
        setBooleanField(term10628, term10628.getClass(), "prettyPrint", false);
        setBooleanField(term10628, term10628.getClass(), "visited", false);
        setField(term10628, term10628.getClass(), "docInfo", null);
        setBooleanField(term10628, term10628.getClass(), "unknown", false);
        setBooleanField(term10628, term10628.getClass(), "resolved", false);
        setField(term10628, term10628.getClass(), "resolveResult", null);
        setField(term10628, term10628.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HzqpegHiRq";
        try {
            callMethod(klass, "getPropertyType", argTypes, term10628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


