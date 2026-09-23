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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_hasUnknownSupertype_25949462988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13503;

    public FunctionType_hasUnknownSupertype_25949462988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45779 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term45778 = ((Class) term45779).getDeclaredField((String) "ORDINARY");
        ((Field) term45778).setAccessible(true);
        Object enum116 = ((Field) term45778).get((Object) null);
        term13503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term13504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13518 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13528 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term13505, term13505.getClass(), "type", 1559605714);
        setIntField(term13507, term13507.getClass(), "type", -100825168);
        setIntField(term13509, term13509.getClass(), "type", 0);
        setField(term13509, term13509.getClass(), "next", null);
        setField(term13509, term13509.getClass(), "first", null);
        setField(term13509, term13509.getClass(), "last", null);
        setField(term13509, term13509.getClass(), "propListHead", null);
        setIntField(term13509, term13509.getClass(), "sourcePosition", 0);
        setField(term13509, term13509.getClass(), "jsType", null);
        setField(term13509, term13509.getClass(), "parent", null);
        setField(term13507, term13507.getClass(), "next", term13509);
        setIntField(term13512, term13512.getClass(), "type", 0);
        setField(term13512, term13512.getClass(), "next", null);
        setField(term13512, term13512.getClass(), "first", null);
        setField(term13512, term13512.getClass(), "last", null);
        setField(term13512, term13512.getClass(), "propListHead", null);
        setIntField(term13512, term13512.getClass(), "sourcePosition", 0);
        setField(term13512, term13512.getClass(), "jsType", null);
        setField(term13512, term13512.getClass(), "parent", null);
        setField(term13507, term13507.getClass(), "first", term13512);
        setIntField(term13515, term13515.getClass(), "type", 0);
        setField(term13515, term13515.getClass(), "next", null);
        setField(term13515, term13515.getClass(), "first", null);
        setField(term13515, term13515.getClass(), "last", null);
        setField(term13515, term13515.getClass(), "propListHead", null);
        setIntField(term13515, term13515.getClass(), "sourcePosition", 0);
        setField(term13515, term13515.getClass(), "jsType", null);
        setField(term13515, term13515.getClass(), "parent", null);
        setField(term13507, term13507.getClass(), "last", term13515);
        setField(term13518, term13518.getClass(), "next", null);
        setIntField(term13518, term13518.getClass(), "type", 0);
        setIntField(term13518, term13518.getClass(), "intValue", 0);
        setField(term13518, term13518.getClass(), "objectValue", null);
        setField(term13507, term13507.getClass(), "propListHead", term13518);
        setIntField(term13507, term13507.getClass(), "sourcePosition", 768407648);
        setField(term13507, term13507.getClass(), "jsType", null);
        setField(term13507, term13507.getClass(), "parent", null);
        setField(term13505, term13505.getClass(), "next", term13507);
        setIntField(term13522, term13522.getClass(), "type", 0);
        setField(term13522, term13522.getClass(), "next", null);
        setField(term13522, term13522.getClass(), "first", null);
        setField(term13522, term13522.getClass(), "last", null);
        setField(term13522, term13522.getClass(), "propListHead", null);
        setIntField(term13522, term13522.getClass(), "sourcePosition", 0);
        setField(term13522, term13522.getClass(), "jsType", null);
        setField(term13522, term13522.getClass(), "parent", null);
        setField(term13505, term13505.getClass(), "first", term13522);
        setIntField(term13525, term13525.getClass(), "type", 0);
        setField(term13525, term13525.getClass(), "next", null);
        setField(term13525, term13525.getClass(), "first", null);
        setField(term13525, term13525.getClass(), "last", null);
        setField(term13525, term13525.getClass(), "propListHead", null);
        setIntField(term13525, term13525.getClass(), "sourcePosition", 0);
        setField(term13525, term13525.getClass(), "jsType", null);
        setField(term13525, term13525.getClass(), "parent", null);
        setField(term13505, term13505.getClass(), "last", term13525);
        setField(term13528, term13528.getClass(), "next", null);
        setIntField(term13528, term13528.getClass(), "type", 0);
        setIntField(term13528, term13528.getClass(), "intValue", 0);
        setField(term13528, term13528.getClass(), "objectValue", null);
        setField(term13505, term13505.getClass(), "propListHead", term13528);
        setIntField(term13505, term13505.getClass(), "sourcePosition", -350454594);
        setField(term13505, term13505.getClass(), "jsType", null);
        setField(term13505, term13505.getClass(), "parent", null);
        setField(term13504, term13504.getClass(), "parameters", term13505);
        setField(term13504, term13504.getClass(), "returnType", null);
        setBooleanField(term13504, term13504.getClass(), "returnTypeInferred", false);
        setBooleanField(term13504, term13504.getClass(), "resolved", false);
        setField(term13504, term13504.getClass(), "resolveResult", null);
        setField(term13504, term13504.getClass(), "registry", null);
        setField(term13503, term13503.getClass(), "call", term13504);
        setField(term13534, term13534.getClass(), "ownerFunction", null);
        setField(term13534, term13534.getClass(), "className", null);
        setField(term13534, term13534.getClass(), "properties", null);
        setBooleanField(term13534, term13534.getClass(), "nativeType", false);
        setField(term13534, term13534.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term13534, term13534.getClass(), "prettyPrint", false);
        setBooleanField(term13534, term13534.getClass(), "visited", false);
        setField(term13534, term13534.getClass(), "docInfo", null);
        setBooleanField(term13534, term13534.getClass(), "unknown", false);
        setBooleanField(term13534, term13534.getClass(), "resolved", false);
        setField(term13534, term13534.getClass(), "resolveResult", null);
        setField(term13534, term13534.getClass(), "registry", null);
        setField(term13503, term13503.getClass(), "prototype", term13534);
        setField(term13503, term13503.getClass(), "kind", enum116);
        setField(term13503, term13503.getClass(), "typeOfThis", null);
        setField(term13503, term13503.getClass(), "source", null);
        setField(term13503, term13503.getClass(), "implementedInterfaces", null);
        setField(term13503, term13503.getClass(), "subTypes", null);
        setField(term13503, term13503.getClass(), "templateTypeName", null);
        setField(term13503, term13503.getClass(), "className", null);
        setField(term13503, term13503.getClass(), "properties", null);
        setBooleanField(term13503, term13503.getClass(), "nativeType", false);
        setField(term13503, term13503.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term13503, term13503.getClass(), "prettyPrint", false);
        setBooleanField(term13503, term13503.getClass(), "visited", false);
        setField(term13503, term13503.getClass(), "docInfo", null);
        setBooleanField(term13503, term13503.getClass(), "unknown", false);
        setBooleanField(term13503, term13503.getClass(), "resolved", false);
        setField(term13503, term13503.getClass(), "resolveResult", null);
        setField(term13503, term13503.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasUnknownSupertype", argTypes, term13503, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


