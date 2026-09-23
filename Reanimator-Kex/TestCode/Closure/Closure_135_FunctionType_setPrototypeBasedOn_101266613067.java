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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeBasedOn_101266613067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7021;

    public FunctionType_setPrototypeBasedOn_101266613067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31571 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term31570 = ((Class) term31571).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term31570).setAccessible(true);
        Object enum79 = ((Field) term31570).get((Object) null);
        term7021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7036 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7046 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term7023, term7023.getClass(), "type", 534834644);
        setIntField(term7025, term7025.getClass(), "type", 252575029);
        setIntField(term7027, term7027.getClass(), "type", 0);
        setField(term7027, term7027.getClass(), "next", null);
        setField(term7027, term7027.getClass(), "first", null);
        setField(term7027, term7027.getClass(), "last", null);
        setField(term7027, term7027.getClass(), "propListHead", null);
        setIntField(term7027, term7027.getClass(), "sourcePosition", 0);
        setField(term7027, term7027.getClass(), "jsType", null);
        setField(term7027, term7027.getClass(), "parent", null);
        setField(term7025, term7025.getClass(), "next", term7027);
        setIntField(term7030, term7030.getClass(), "type", 0);
        setField(term7030, term7030.getClass(), "next", null);
        setField(term7030, term7030.getClass(), "first", null);
        setField(term7030, term7030.getClass(), "last", null);
        setField(term7030, term7030.getClass(), "propListHead", null);
        setIntField(term7030, term7030.getClass(), "sourcePosition", 0);
        setField(term7030, term7030.getClass(), "jsType", null);
        setField(term7030, term7030.getClass(), "parent", null);
        setField(term7025, term7025.getClass(), "first", term7030);
        setIntField(term7033, term7033.getClass(), "type", 0);
        setField(term7033, term7033.getClass(), "next", null);
        setField(term7033, term7033.getClass(), "first", null);
        setField(term7033, term7033.getClass(), "last", null);
        setField(term7033, term7033.getClass(), "propListHead", null);
        setIntField(term7033, term7033.getClass(), "sourcePosition", 0);
        setField(term7033, term7033.getClass(), "jsType", null);
        setField(term7033, term7033.getClass(), "parent", null);
        setField(term7025, term7025.getClass(), "last", term7033);
        setField(term7036, term7036.getClass(), "next", null);
        setIntField(term7036, term7036.getClass(), "type", 0);
        setIntField(term7036, term7036.getClass(), "intValue", 0);
        setField(term7036, term7036.getClass(), "objectValue", null);
        setField(term7025, term7025.getClass(), "propListHead", term7036);
        setIntField(term7025, term7025.getClass(), "sourcePosition", 57189932);
        setField(term7025, term7025.getClass(), "jsType", null);
        setField(term7025, term7025.getClass(), "parent", null);
        setField(term7023, term7023.getClass(), "next", term7025);
        setIntField(term7040, term7040.getClass(), "type", 0);
        setField(term7040, term7040.getClass(), "next", null);
        setField(term7040, term7040.getClass(), "first", null);
        setField(term7040, term7040.getClass(), "last", null);
        setField(term7040, term7040.getClass(), "propListHead", null);
        setIntField(term7040, term7040.getClass(), "sourcePosition", 0);
        setField(term7040, term7040.getClass(), "jsType", null);
        setField(term7040, term7040.getClass(), "parent", null);
        setField(term7023, term7023.getClass(), "first", term7040);
        setIntField(term7043, term7043.getClass(), "type", 0);
        setField(term7043, term7043.getClass(), "next", null);
        setField(term7043, term7043.getClass(), "first", null);
        setField(term7043, term7043.getClass(), "last", null);
        setField(term7043, term7043.getClass(), "propListHead", null);
        setIntField(term7043, term7043.getClass(), "sourcePosition", 0);
        setField(term7043, term7043.getClass(), "jsType", null);
        setField(term7043, term7043.getClass(), "parent", null);
        setField(term7023, term7023.getClass(), "last", term7043);
        setField(term7046, term7046.getClass(), "next", null);
        setIntField(term7046, term7046.getClass(), "type", 0);
        setIntField(term7046, term7046.getClass(), "intValue", 0);
        setField(term7046, term7046.getClass(), "objectValue", null);
        setField(term7023, term7023.getClass(), "propListHead", term7046);
        setIntField(term7023, term7023.getClass(), "sourcePosition", 1460722225);
        setField(term7023, term7023.getClass(), "jsType", null);
        setField(term7023, term7023.getClass(), "parent", null);
        setField(term7022, term7022.getClass(), "parameters", term7023);
        setField(term7022, term7022.getClass(), "returnType", null);
        setBooleanField(term7022, term7022.getClass(), "resolved", false);
        setField(term7022, term7022.getClass(), "resolveResult", null);
        setField(term7022, term7022.getClass(), "registry", null);
        setField(term7021, term7021.getClass(), "call", term7022);
        setField(term7051, term7051.getClass(), "ownerFunction", null);
        setField(term7051, term7051.getClass(), "className", null);
        setField(term7051, term7051.getClass(), "properties", null);
        setField(term7051, term7051.getClass(), "implicitPrototype", null);
        setBooleanField(term7051, term7051.getClass(), "nativeType", false);
        setBooleanField(term7051, term7051.getClass(), "visited", false);
        setField(term7051, term7051.getClass(), "docInfo", null);
        setBooleanField(term7051, term7051.getClass(), "unknown", false);
        setBooleanField(term7051, term7051.getClass(), "resolved", false);
        setField(term7051, term7051.getClass(), "resolveResult", null);
        setField(term7051, term7051.getClass(), "registry", null);
        setField(term7021, term7021.getClass(), "prototype", term7051);
        setField(term7021, term7021.getClass(), "kind", enum79);
        setField(term7021, term7021.getClass(), "typeOfThis", null);
        setField(term7021, term7021.getClass(), "source", null);
        setField(term7021, term7021.getClass(), "implementedInterfaces", null);
        setField(term7021, term7021.getClass(), "subTypes", null);
        setField(term7021, term7021.getClass(), "templateTypeName", null);
        setField(term7021, term7021.getClass(), "className", null);
        setField(term7021, term7021.getClass(), "properties", null);
        setField(term7021, term7021.getClass(), "implicitPrototype", null);
        setBooleanField(term7021, term7021.getClass(), "nativeType", false);
        setBooleanField(term7021, term7021.getClass(), "visited", false);
        setField(term7021, term7021.getClass(), "docInfo", null);
        setBooleanField(term7021, term7021.getClass(), "unknown", false);
        setBooleanField(term7021, term7021.getClass(), "resolved", false);
        setField(term7021, term7021.getClass(), "resolveResult", null);
        setField(term7021, term7021.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term7021, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


