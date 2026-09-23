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

public class FunctionType_getTypeOfThis_43340120592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16587;

    public FunctionType_getTypeOfThis_43340120592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50895 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50894 = ((Class) term50895).getDeclaredField((String) "ORDINARY");
        ((Field) term50894).setAccessible(true);
        Object enum125 = ((Field) term50894).get((Object) null);
        term16587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term16588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term16589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16602 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16612 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term16589, term16589.getClass(), "type", 1126618861);
        setIntField(term16591, term16591.getClass(), "type", -876426634);
        setIntField(term16593, term16593.getClass(), "type", 0);
        setField(term16593, term16593.getClass(), "next", null);
        setField(term16593, term16593.getClass(), "first", null);
        setField(term16593, term16593.getClass(), "last", null);
        setField(term16593, term16593.getClass(), "propListHead", null);
        setIntField(term16593, term16593.getClass(), "sourcePosition", 0);
        setField(term16593, term16593.getClass(), "jsType", null);
        setField(term16593, term16593.getClass(), "parent", null);
        setField(term16591, term16591.getClass(), "next", term16593);
        setIntField(term16596, term16596.getClass(), "type", 0);
        setField(term16596, term16596.getClass(), "next", null);
        setField(term16596, term16596.getClass(), "first", null);
        setField(term16596, term16596.getClass(), "last", null);
        setField(term16596, term16596.getClass(), "propListHead", null);
        setIntField(term16596, term16596.getClass(), "sourcePosition", 0);
        setField(term16596, term16596.getClass(), "jsType", null);
        setField(term16596, term16596.getClass(), "parent", null);
        setField(term16591, term16591.getClass(), "first", term16596);
        setIntField(term16599, term16599.getClass(), "type", 0);
        setField(term16599, term16599.getClass(), "next", null);
        setField(term16599, term16599.getClass(), "first", null);
        setField(term16599, term16599.getClass(), "last", null);
        setField(term16599, term16599.getClass(), "propListHead", null);
        setIntField(term16599, term16599.getClass(), "sourcePosition", 0);
        setField(term16599, term16599.getClass(), "jsType", null);
        setField(term16599, term16599.getClass(), "parent", null);
        setField(term16591, term16591.getClass(), "last", term16599);
        setField(term16602, term16602.getClass(), "next", null);
        setIntField(term16602, term16602.getClass(), "type", 0);
        setIntField(term16602, term16602.getClass(), "intValue", 0);
        setField(term16602, term16602.getClass(), "objectValue", null);
        setField(term16591, term16591.getClass(), "propListHead", term16602);
        setIntField(term16591, term16591.getClass(), "sourcePosition", 213831054);
        setField(term16591, term16591.getClass(), "jsType", null);
        setField(term16591, term16591.getClass(), "parent", null);
        setField(term16589, term16589.getClass(), "next", term16591);
        setIntField(term16606, term16606.getClass(), "type", 0);
        setField(term16606, term16606.getClass(), "next", null);
        setField(term16606, term16606.getClass(), "first", null);
        setField(term16606, term16606.getClass(), "last", null);
        setField(term16606, term16606.getClass(), "propListHead", null);
        setIntField(term16606, term16606.getClass(), "sourcePosition", 0);
        setField(term16606, term16606.getClass(), "jsType", null);
        setField(term16606, term16606.getClass(), "parent", null);
        setField(term16589, term16589.getClass(), "first", term16606);
        setIntField(term16609, term16609.getClass(), "type", 0);
        setField(term16609, term16609.getClass(), "next", null);
        setField(term16609, term16609.getClass(), "first", null);
        setField(term16609, term16609.getClass(), "last", null);
        setField(term16609, term16609.getClass(), "propListHead", null);
        setIntField(term16609, term16609.getClass(), "sourcePosition", 0);
        setField(term16609, term16609.getClass(), "jsType", null);
        setField(term16609, term16609.getClass(), "parent", null);
        setField(term16589, term16589.getClass(), "last", term16609);
        setField(term16612, term16612.getClass(), "next", null);
        setIntField(term16612, term16612.getClass(), "type", 0);
        setIntField(term16612, term16612.getClass(), "intValue", 0);
        setField(term16612, term16612.getClass(), "objectValue", null);
        setField(term16589, term16589.getClass(), "propListHead", term16612);
        setIntField(term16589, term16589.getClass(), "sourcePosition", 330043745);
        setField(term16589, term16589.getClass(), "jsType", null);
        setField(term16589, term16589.getClass(), "parent", null);
        setField(term16588, term16588.getClass(), "parameters", term16589);
        setField(term16588, term16588.getClass(), "returnType", null);
        setBooleanField(term16588, term16588.getClass(), "resolved", false);
        setField(term16588, term16588.getClass(), "resolveResult", null);
        setField(term16588, term16588.getClass(), "registry", null);
        setField(term16587, term16587.getClass(), "call", term16588);
        setField(term16617, term16617.getClass(), "ownerFunction", null);
        setField(term16617, term16617.getClass(), "className", null);
        setField(term16617, term16617.getClass(), "properties", null);
        setField(term16617, term16617.getClass(), "implicitPrototype", null);
        setBooleanField(term16617, term16617.getClass(), "nativeType", false);
        setBooleanField(term16617, term16617.getClass(), "visited", false);
        setField(term16617, term16617.getClass(), "docInfo", null);
        setBooleanField(term16617, term16617.getClass(), "unknown", false);
        setBooleanField(term16617, term16617.getClass(), "resolved", false);
        setField(term16617, term16617.getClass(), "resolveResult", null);
        setField(term16617, term16617.getClass(), "registry", null);
        setField(term16587, term16587.getClass(), "prototype", term16617);
        setField(term16587, term16587.getClass(), "kind", enum125);
        setField(term16587, term16587.getClass(), "typeOfThis", null);
        setField(term16587, term16587.getClass(), "source", null);
        setField(term16587, term16587.getClass(), "implementedInterfaces", null);
        setField(term16587, term16587.getClass(), "subTypes", null);
        setField(term16587, term16587.getClass(), "templateTypeName", null);
        setField(term16587, term16587.getClass(), "className", null);
        setField(term16587, term16587.getClass(), "properties", null);
        setField(term16587, term16587.getClass(), "implicitPrototype", null);
        setBooleanField(term16587, term16587.getClass(), "nativeType", false);
        setBooleanField(term16587, term16587.getClass(), "visited", false);
        setField(term16587, term16587.getClass(), "docInfo", null);
        setBooleanField(term16587, term16587.getClass(), "unknown", false);
        setBooleanField(term16587, term16587.getClass(), "resolved", false);
        setField(term16587, term16587.getClass(), "resolveResult", null);
        setField(term16587, term16587.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getTypeOfThis", argTypes, term16587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


