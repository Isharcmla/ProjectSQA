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

public class FunctionType_appendVarArgsString_156835394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15661;
     Object term15715;

    public FunctionType_appendVarArgsString_156835394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50192 = ((Class) term50193).getDeclaredField((String) "ORDINARY");
        ((Field) term50192).setAccessible(true);
        Object enum126 = ((Field) term50192).get((Object) null);
        term15661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15676 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15686 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term15663, term15663.getClass(), "type", -423900705);
        setIntField(term15665, term15665.getClass(), "type", -370828664);
        setIntField(term15667, term15667.getClass(), "type", 0);
        setField(term15667, term15667.getClass(), "next", null);
        setField(term15667, term15667.getClass(), "first", null);
        setField(term15667, term15667.getClass(), "last", null);
        setField(term15667, term15667.getClass(), "propListHead", null);
        setIntField(term15667, term15667.getClass(), "sourcePosition", 0);
        setField(term15667, term15667.getClass(), "jsType", null);
        setField(term15667, term15667.getClass(), "parent", null);
        setField(term15665, term15665.getClass(), "next", term15667);
        setIntField(term15670, term15670.getClass(), "type", 0);
        setField(term15670, term15670.getClass(), "next", null);
        setField(term15670, term15670.getClass(), "first", null);
        setField(term15670, term15670.getClass(), "last", null);
        setField(term15670, term15670.getClass(), "propListHead", null);
        setIntField(term15670, term15670.getClass(), "sourcePosition", 0);
        setField(term15670, term15670.getClass(), "jsType", null);
        setField(term15670, term15670.getClass(), "parent", null);
        setField(term15665, term15665.getClass(), "first", term15670);
        setIntField(term15673, term15673.getClass(), "type", 0);
        setField(term15673, term15673.getClass(), "next", null);
        setField(term15673, term15673.getClass(), "first", null);
        setField(term15673, term15673.getClass(), "last", null);
        setField(term15673, term15673.getClass(), "propListHead", null);
        setIntField(term15673, term15673.getClass(), "sourcePosition", 0);
        setField(term15673, term15673.getClass(), "jsType", null);
        setField(term15673, term15673.getClass(), "parent", null);
        setField(term15665, term15665.getClass(), "last", term15673);
        setField(term15676, term15676.getClass(), "next", null);
        setIntField(term15676, term15676.getClass(), "type", 0);
        setIntField(term15676, term15676.getClass(), "intValue", 0);
        setField(term15676, term15676.getClass(), "objectValue", null);
        setField(term15665, term15665.getClass(), "propListHead", term15676);
        setIntField(term15665, term15665.getClass(), "sourcePosition", 1168633950);
        setField(term15665, term15665.getClass(), "jsType", null);
        setField(term15665, term15665.getClass(), "parent", null);
        setField(term15663, term15663.getClass(), "next", term15665);
        setIntField(term15680, term15680.getClass(), "type", 0);
        setField(term15680, term15680.getClass(), "next", null);
        setField(term15680, term15680.getClass(), "first", null);
        setField(term15680, term15680.getClass(), "last", null);
        setField(term15680, term15680.getClass(), "propListHead", null);
        setIntField(term15680, term15680.getClass(), "sourcePosition", 0);
        setField(term15680, term15680.getClass(), "jsType", null);
        setField(term15680, term15680.getClass(), "parent", null);
        setField(term15663, term15663.getClass(), "first", term15680);
        setIntField(term15683, term15683.getClass(), "type", 0);
        setField(term15683, term15683.getClass(), "next", null);
        setField(term15683, term15683.getClass(), "first", null);
        setField(term15683, term15683.getClass(), "last", null);
        setField(term15683, term15683.getClass(), "propListHead", null);
        setIntField(term15683, term15683.getClass(), "sourcePosition", 0);
        setField(term15683, term15683.getClass(), "jsType", null);
        setField(term15683, term15683.getClass(), "parent", null);
        setField(term15663, term15663.getClass(), "last", term15683);
        setField(term15686, term15686.getClass(), "next", null);
        setIntField(term15686, term15686.getClass(), "type", 0);
        setIntField(term15686, term15686.getClass(), "intValue", 0);
        setField(term15686, term15686.getClass(), "objectValue", null);
        setField(term15663, term15663.getClass(), "propListHead", term15686);
        setIntField(term15663, term15663.getClass(), "sourcePosition", 1607082164);
        setField(term15663, term15663.getClass(), "jsType", null);
        setField(term15663, term15663.getClass(), "parent", null);
        setField(term15662, term15662.getClass(), "parameters", term15663);
        setField(term15662, term15662.getClass(), "returnType", null);
        setBooleanField(term15662, term15662.getClass(), "returnTypeInferred", false);
        setBooleanField(term15662, term15662.getClass(), "resolved", false);
        setField(term15662, term15662.getClass(), "resolveResult", null);
        setField(term15662, term15662.getClass(), "registry", null);
        setField(term15661, term15661.getClass(), "call", term15662);
        setField(term15692, term15692.getClass(), "ownerFunction", null);
        setField(term15692, term15692.getClass(), "className", null);
        setField(term15692, term15692.getClass(), "properties", null);
        setBooleanField(term15692, term15692.getClass(), "nativeType", false);
        setField(term15692, term15692.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term15692, term15692.getClass(), "prettyPrint", false);
        setBooleanField(term15692, term15692.getClass(), "visited", false);
        setField(term15692, term15692.getClass(), "docInfo", null);
        setBooleanField(term15692, term15692.getClass(), "unknown", false);
        setBooleanField(term15692, term15692.getClass(), "resolved", false);
        setField(term15692, term15692.getClass(), "resolveResult", null);
        setField(term15692, term15692.getClass(), "registry", null);
        setField(term15661, term15661.getClass(), "prototype", term15692);
        setField(term15661, term15661.getClass(), "kind", enum126);
        setField(term15661, term15661.getClass(), "typeOfThis", null);
        setField(term15661, term15661.getClass(), "source", null);
        setField(term15661, term15661.getClass(), "implementedInterfaces", null);
        setField(term15661, term15661.getClass(), "subTypes", null);
        setField(term15661, term15661.getClass(), "templateTypeName", null);
        setField(term15661, term15661.getClass(), "className", null);
        setField(term15661, term15661.getClass(), "properties", null);
        setBooleanField(term15661, term15661.getClass(), "nativeType", false);
        setField(term15661, term15661.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term15661, term15661.getClass(), "prettyPrint", false);
        setBooleanField(term15661, term15661.getClass(), "visited", false);
        setField(term15661, term15661.getClass(), "docInfo", null);
        setBooleanField(term15661, term15661.getClass(), "unknown", false);
        setBooleanField(term15661, term15661.getClass(), "resolved", false);
        setField(term15661, term15661.getClass(), "resolveResult", null);
        setField(term15661, term15661.getClass(), "registry", null);
        term15715 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term15716 = (byte[]) newByteArray(16);
        setField(term15715, term15715.getClass(), "value", term15716);
        setByteField(term15715, term15715.getClass(), "coder", (byte) 47);
        setIntField(term15715, term15715.getClass(), "count", 1890399366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term15715;
        args[1] = null;
        try {
            callMethod(klass, "appendVarArgsString", argTypes, term15661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


