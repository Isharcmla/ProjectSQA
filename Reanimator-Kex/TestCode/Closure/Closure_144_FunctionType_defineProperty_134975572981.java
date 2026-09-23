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

public class FunctionType_defineProperty_134975572981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11007;
     Object term11076;
     Object term11078;

    public FunctionType_defineProperty_134975572981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40817 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term40816 = ((Class) term40817).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term40816).setAccessible(true);
        Object enum106 = ((Field) term40816).get((Object) null);
        term11007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11022 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11032 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11009, term11009.getClass(), "type", -1070592289);
        setIntField(term11011, term11011.getClass(), "type", 1252951645);
        setIntField(term11013, term11013.getClass(), "type", 0);
        setField(term11013, term11013.getClass(), "next", null);
        setField(term11013, term11013.getClass(), "first", null);
        setField(term11013, term11013.getClass(), "last", null);
        setField(term11013, term11013.getClass(), "propListHead", null);
        setIntField(term11013, term11013.getClass(), "sourcePosition", 0);
        setField(term11013, term11013.getClass(), "jsType", null);
        setField(term11013, term11013.getClass(), "parent", null);
        setField(term11011, term11011.getClass(), "next", term11013);
        setIntField(term11016, term11016.getClass(), "type", 0);
        setField(term11016, term11016.getClass(), "next", null);
        setField(term11016, term11016.getClass(), "first", null);
        setField(term11016, term11016.getClass(), "last", null);
        setField(term11016, term11016.getClass(), "propListHead", null);
        setIntField(term11016, term11016.getClass(), "sourcePosition", 0);
        setField(term11016, term11016.getClass(), "jsType", null);
        setField(term11016, term11016.getClass(), "parent", null);
        setField(term11011, term11011.getClass(), "first", term11016);
        setIntField(term11019, term11019.getClass(), "type", 0);
        setField(term11019, term11019.getClass(), "next", null);
        setField(term11019, term11019.getClass(), "first", null);
        setField(term11019, term11019.getClass(), "last", null);
        setField(term11019, term11019.getClass(), "propListHead", null);
        setIntField(term11019, term11019.getClass(), "sourcePosition", 0);
        setField(term11019, term11019.getClass(), "jsType", null);
        setField(term11019, term11019.getClass(), "parent", null);
        setField(term11011, term11011.getClass(), "last", term11019);
        setField(term11022, term11022.getClass(), "next", null);
        setIntField(term11022, term11022.getClass(), "type", 0);
        setIntField(term11022, term11022.getClass(), "intValue", 0);
        setField(term11022, term11022.getClass(), "objectValue", null);
        setField(term11011, term11011.getClass(), "propListHead", term11022);
        setIntField(term11011, term11011.getClass(), "sourcePosition", 574481092);
        setField(term11011, term11011.getClass(), "jsType", null);
        setField(term11011, term11011.getClass(), "parent", null);
        setField(term11009, term11009.getClass(), "next", term11011);
        setIntField(term11026, term11026.getClass(), "type", 0);
        setField(term11026, term11026.getClass(), "next", null);
        setField(term11026, term11026.getClass(), "first", null);
        setField(term11026, term11026.getClass(), "last", null);
        setField(term11026, term11026.getClass(), "propListHead", null);
        setIntField(term11026, term11026.getClass(), "sourcePosition", 0);
        setField(term11026, term11026.getClass(), "jsType", null);
        setField(term11026, term11026.getClass(), "parent", null);
        setField(term11009, term11009.getClass(), "first", term11026);
        setIntField(term11029, term11029.getClass(), "type", 0);
        setField(term11029, term11029.getClass(), "next", null);
        setField(term11029, term11029.getClass(), "first", null);
        setField(term11029, term11029.getClass(), "last", null);
        setField(term11029, term11029.getClass(), "propListHead", null);
        setIntField(term11029, term11029.getClass(), "sourcePosition", 0);
        setField(term11029, term11029.getClass(), "jsType", null);
        setField(term11029, term11029.getClass(), "parent", null);
        setField(term11009, term11009.getClass(), "last", term11029);
        setField(term11032, term11032.getClass(), "next", null);
        setIntField(term11032, term11032.getClass(), "type", 0);
        setIntField(term11032, term11032.getClass(), "intValue", 0);
        setField(term11032, term11032.getClass(), "objectValue", null);
        setField(term11009, term11009.getClass(), "propListHead", term11032);
        setIntField(term11009, term11009.getClass(), "sourcePosition", -310528004);
        setField(term11009, term11009.getClass(), "jsType", null);
        setField(term11009, term11009.getClass(), "parent", null);
        setField(term11008, term11008.getClass(), "parameters", term11009);
        setField(term11008, term11008.getClass(), "returnType", null);
        setBooleanField(term11008, term11008.getClass(), "returnTypeInferred", false);
        setBooleanField(term11008, term11008.getClass(), "resolved", false);
        setField(term11008, term11008.getClass(), "resolveResult", null);
        setField(term11008, term11008.getClass(), "registry", null);
        setField(term11007, term11007.getClass(), "call", term11008);
        setField(term11038, term11038.getClass(), "ownerFunction", null);
        setField(term11038, term11038.getClass(), "className", null);
        setField(term11038, term11038.getClass(), "properties", null);
        setField(term11038, term11038.getClass(), "implicitPrototype", null);
        setBooleanField(term11038, term11038.getClass(), "nativeType", false);
        setBooleanField(term11038, term11038.getClass(), "prettyPrint", false);
        setBooleanField(term11038, term11038.getClass(), "visited", false);
        setField(term11038, term11038.getClass(), "docInfo", null);
        setBooleanField(term11038, term11038.getClass(), "unknown", false);
        setBooleanField(term11038, term11038.getClass(), "resolved", false);
        setField(term11038, term11038.getClass(), "resolveResult", null);
        setField(term11038, term11038.getClass(), "registry", null);
        setField(term11007, term11007.getClass(), "prototype", term11038);
        setField(term11007, term11007.getClass(), "kind", enum106);
        setField(term11007, term11007.getClass(), "typeOfThis", null);
        setField(term11007, term11007.getClass(), "source", null);
        setField(term11007, term11007.getClass(), "implementedInterfaces", null);
        setField(term11007, term11007.getClass(), "subTypes", null);
        setField(term11007, term11007.getClass(), "templateTypeName", null);
        setField(term11007, term11007.getClass(), "className", null);
        setField(term11007, term11007.getClass(), "properties", null);
        setField(term11007, term11007.getClass(), "implicitPrototype", null);
        setBooleanField(term11007, term11007.getClass(), "nativeType", false);
        setBooleanField(term11007, term11007.getClass(), "prettyPrint", false);
        setBooleanField(term11007, term11007.getClass(), "visited", false);
        setField(term11007, term11007.getClass(), "docInfo", null);
        setBooleanField(term11007, term11007.getClass(), "unknown", false);
        setBooleanField(term11007, term11007.getClass(), "resolved", false);
        setField(term11007, term11007.getClass(), "resolveResult", null);
        setField(term11007, term11007.getClass(), "registry", null);
        term11076 = new Boolean(true);
        term11078 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "jwsfVjMoJT";
        args[1] = null;
        args[2] = term11076;
        args[3] = term11078;
        try {
            callMethod(klass, "defineProperty", argTypes, term11007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


