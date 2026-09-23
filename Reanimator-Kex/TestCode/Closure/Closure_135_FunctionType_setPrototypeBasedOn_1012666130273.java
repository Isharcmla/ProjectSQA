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
import java.util.HashMap;

public class FunctionType_setPrototypeBasedOn_1012666130273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139380;
     Object term139480;
     Object term139543;
     Object term139547;

    public FunctionType_setPrototypeBasedOn_1012666130273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term139380, term139380.getClass(), "prototype", null);
        setField(term139380, term139380.getClass(), "registry", null);
        setBooleanField(term139380, term139380.getClass(), "nativeType", false);
        term139480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        HashMap term139545 = new HashMap();
        term139543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term139544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term139546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term139543, term139543.getClass(), "call", null);
        setField(term139544, term139544.getClass(), "ownerFunction", term139543);
        setField(term139544, term139544.getClass(), "className", null);
        setField(term139544, term139544.getClass(), "properties", term139545);
        setField(term139546, term139546.getClass(), "call", null);
        setField(term139546, term139546.getClass(), "prototype", null);
        setField(term139546, term139546.getClass(), "kind", null);
        setField(term139546, term139546.getClass(), "typeOfThis", null);
        setField(term139546, term139546.getClass(), "source", null);
        setField(term139546, term139546.getClass(), "implementedInterfaces", null);
        setField(term139546, term139546.getClass(), "subTypes", null);
        setField(term139546, term139546.getClass(), "templateTypeName", null);
        setField(term139546, term139546.getClass(), "className", null);
        setField(term139546, term139546.getClass(), "properties", null);
        setField(term139546, term139546.getClass(), "implicitPrototype", null);
        setBooleanField(term139546, term139546.getClass(), "nativeType", false);
        setBooleanField(term139546, term139546.getClass(), "visited", false);
        setField(term139546, term139546.getClass(), "docInfo", null);
        setBooleanField(term139546, term139546.getClass(), "unknown", false);
        setBooleanField(term139546, term139546.getClass(), "resolved", false);
        setField(term139546, term139546.getClass(), "resolveResult", null);
        setField(term139546, term139546.getClass(), "registry", null);
        setField(term139544, term139544.getClass(), "implicitPrototype", term139546);
        setBooleanField(term139544, term139544.getClass(), "nativeType", false);
        setBooleanField(term139544, term139544.getClass(), "visited", false);
        setField(term139544, term139544.getClass(), "docInfo", null);
        setBooleanField(term139544, term139544.getClass(), "unknown", true);
        setBooleanField(term139544, term139544.getClass(), "resolved", false);
        setField(term139544, term139544.getClass(), "resolveResult", null);
        setField(term139544, term139544.getClass(), "registry", null);
        setField(term139543, term139543.getClass(), "prototype", term139544);
        setField(term139543, term139543.getClass(), "kind", null);
        setField(term139543, term139543.getClass(), "typeOfThis", null);
        setField(term139543, term139543.getClass(), "source", null);
        setField(term139543, term139543.getClass(), "implementedInterfaces", null);
        setField(term139543, term139543.getClass(), "subTypes", null);
        setField(term139543, term139543.getClass(), "templateTypeName", null);
        setField(term139543, term139543.getClass(), "className", null);
        setField(term139543, term139543.getClass(), "properties", null);
        setField(term139543, term139543.getClass(), "implicitPrototype", null);
        setBooleanField(term139543, term139543.getClass(), "nativeType", false);
        setBooleanField(term139543, term139543.getClass(), "visited", false);
        setField(term139543, term139543.getClass(), "docInfo", null);
        setBooleanField(term139543, term139543.getClass(), "unknown", false);
        setBooleanField(term139543, term139543.getClass(), "resolved", false);
        setField(term139543, term139543.getClass(), "resolveResult", null);
        setField(term139543, term139543.getClass(), "registry", null);
        term139547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term139547, term139547.getClass(), "call", null);
        setField(term139547, term139547.getClass(), "prototype", null);
        setField(term139547, term139547.getClass(), "kind", null);
        setField(term139547, term139547.getClass(), "typeOfThis", null);
        setField(term139547, term139547.getClass(), "source", null);
        setField(term139547, term139547.getClass(), "implementedInterfaces", null);
        setField(term139547, term139547.getClass(), "subTypes", null);
        setField(term139547, term139547.getClass(), "templateTypeName", null);
        setField(term139547, term139547.getClass(), "className", null);
        setField(term139547, term139547.getClass(), "properties", null);
        setField(term139547, term139547.getClass(), "implicitPrototype", null);
        setBooleanField(term139547, term139547.getClass(), "nativeType", false);
        setBooleanField(term139547, term139547.getClass(), "visited", false);
        setField(term139547, term139547.getClass(), "docInfo", null);
        setBooleanField(term139547, term139547.getClass(), "unknown", false);
        setBooleanField(term139547, term139547.getClass(), "resolved", false);
        setField(term139547, term139547.getClass(), "resolveResult", null);
        setField(term139547, term139547.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term139480;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term139380, args);
        assertTrue(recursiveEquals(term139380, term139543));
        assertTrue(recursiveEquals(term139480, term139547));
    }

};


