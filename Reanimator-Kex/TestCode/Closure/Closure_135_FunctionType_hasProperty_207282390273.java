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

public class FunctionType_hasProperty_207282390273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9492;

    public FunctionType_hasProperty_207282390273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term36543 = ((Class) term36544).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term36543).setAccessible(true);
        Object enum92 = ((Field) term36543).get((Object) null);
        term9492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9507 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9517 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term9494, term9494.getClass(), "type", -1835839814);
        setIntField(term9496, term9496.getClass(), "type", -1694747156);
        setIntField(term9498, term9498.getClass(), "type", 0);
        setField(term9498, term9498.getClass(), "next", null);
        setField(term9498, term9498.getClass(), "first", null);
        setField(term9498, term9498.getClass(), "last", null);
        setField(term9498, term9498.getClass(), "propListHead", null);
        setIntField(term9498, term9498.getClass(), "sourcePosition", 0);
        setField(term9498, term9498.getClass(), "jsType", null);
        setField(term9498, term9498.getClass(), "parent", null);
        setField(term9496, term9496.getClass(), "next", term9498);
        setIntField(term9501, term9501.getClass(), "type", 0);
        setField(term9501, term9501.getClass(), "next", null);
        setField(term9501, term9501.getClass(), "first", null);
        setField(term9501, term9501.getClass(), "last", null);
        setField(term9501, term9501.getClass(), "propListHead", null);
        setIntField(term9501, term9501.getClass(), "sourcePosition", 0);
        setField(term9501, term9501.getClass(), "jsType", null);
        setField(term9501, term9501.getClass(), "parent", null);
        setField(term9496, term9496.getClass(), "first", term9501);
        setIntField(term9504, term9504.getClass(), "type", 0);
        setField(term9504, term9504.getClass(), "next", null);
        setField(term9504, term9504.getClass(), "first", null);
        setField(term9504, term9504.getClass(), "last", null);
        setField(term9504, term9504.getClass(), "propListHead", null);
        setIntField(term9504, term9504.getClass(), "sourcePosition", 0);
        setField(term9504, term9504.getClass(), "jsType", null);
        setField(term9504, term9504.getClass(), "parent", null);
        setField(term9496, term9496.getClass(), "last", term9504);
        setField(term9507, term9507.getClass(), "next", null);
        setIntField(term9507, term9507.getClass(), "type", 0);
        setIntField(term9507, term9507.getClass(), "intValue", 0);
        setField(term9507, term9507.getClass(), "objectValue", null);
        setField(term9496, term9496.getClass(), "propListHead", term9507);
        setIntField(term9496, term9496.getClass(), "sourcePosition", 1466373988);
        setField(term9496, term9496.getClass(), "jsType", null);
        setField(term9496, term9496.getClass(), "parent", null);
        setField(term9494, term9494.getClass(), "next", term9496);
        setIntField(term9511, term9511.getClass(), "type", 0);
        setField(term9511, term9511.getClass(), "next", null);
        setField(term9511, term9511.getClass(), "first", null);
        setField(term9511, term9511.getClass(), "last", null);
        setField(term9511, term9511.getClass(), "propListHead", null);
        setIntField(term9511, term9511.getClass(), "sourcePosition", 0);
        setField(term9511, term9511.getClass(), "jsType", null);
        setField(term9511, term9511.getClass(), "parent", null);
        setField(term9494, term9494.getClass(), "first", term9511);
        setIntField(term9514, term9514.getClass(), "type", 0);
        setField(term9514, term9514.getClass(), "next", null);
        setField(term9514, term9514.getClass(), "first", null);
        setField(term9514, term9514.getClass(), "last", null);
        setField(term9514, term9514.getClass(), "propListHead", null);
        setIntField(term9514, term9514.getClass(), "sourcePosition", 0);
        setField(term9514, term9514.getClass(), "jsType", null);
        setField(term9514, term9514.getClass(), "parent", null);
        setField(term9494, term9494.getClass(), "last", term9514);
        setField(term9517, term9517.getClass(), "next", null);
        setIntField(term9517, term9517.getClass(), "type", 0);
        setIntField(term9517, term9517.getClass(), "intValue", 0);
        setField(term9517, term9517.getClass(), "objectValue", null);
        setField(term9494, term9494.getClass(), "propListHead", term9517);
        setIntField(term9494, term9494.getClass(), "sourcePosition", -358526505);
        setField(term9494, term9494.getClass(), "jsType", null);
        setField(term9494, term9494.getClass(), "parent", null);
        setField(term9493, term9493.getClass(), "parameters", term9494);
        setField(term9493, term9493.getClass(), "returnType", null);
        setBooleanField(term9493, term9493.getClass(), "resolved", false);
        setField(term9493, term9493.getClass(), "resolveResult", null);
        setField(term9493, term9493.getClass(), "registry", null);
        setField(term9492, term9492.getClass(), "call", term9493);
        setField(term9522, term9522.getClass(), "ownerFunction", null);
        setField(term9522, term9522.getClass(), "className", null);
        setField(term9522, term9522.getClass(), "properties", null);
        setField(term9522, term9522.getClass(), "implicitPrototype", null);
        setBooleanField(term9522, term9522.getClass(), "nativeType", false);
        setBooleanField(term9522, term9522.getClass(), "visited", false);
        setField(term9522, term9522.getClass(), "docInfo", null);
        setBooleanField(term9522, term9522.getClass(), "unknown", false);
        setBooleanField(term9522, term9522.getClass(), "resolved", false);
        setField(term9522, term9522.getClass(), "resolveResult", null);
        setField(term9522, term9522.getClass(), "registry", null);
        setField(term9492, term9492.getClass(), "prototype", term9522);
        setField(term9492, term9492.getClass(), "kind", enum92);
        setField(term9492, term9492.getClass(), "typeOfThis", null);
        setField(term9492, term9492.getClass(), "source", null);
        setField(term9492, term9492.getClass(), "implementedInterfaces", null);
        setField(term9492, term9492.getClass(), "subTypes", null);
        setField(term9492, term9492.getClass(), "templateTypeName", null);
        setField(term9492, term9492.getClass(), "className", null);
        setField(term9492, term9492.getClass(), "properties", null);
        setField(term9492, term9492.getClass(), "implicitPrototype", null);
        setBooleanField(term9492, term9492.getClass(), "nativeType", false);
        setBooleanField(term9492, term9492.getClass(), "visited", false);
        setField(term9492, term9492.getClass(), "docInfo", null);
        setBooleanField(term9492, term9492.getClass(), "unknown", false);
        setBooleanField(term9492, term9492.getClass(), "resolved", false);
        setField(term9492, term9492.getClass(), "resolveResult", null);
        setField(term9492, term9492.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOuMEpOQAg";
        try {
            callMethod(klass, "hasProperty", argTypes, term9492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


