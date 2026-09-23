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
import java.lang.String;
import java.lang.Object;

public class FunctionType_getImplementedInterfaces_281458626173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86439;
     Object term87179;

    public FunctionType_getImplementedInterfaces_281458626173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87186 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term87185 = ((Class) term87186).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term87185).setAccessible(true);
        Object enum195 = ((Field) term87185).get((Object) null);
        term86439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term86705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term86803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term86439, term86439.getClass(), "kind", enum195);
        setField(term86705, term86705.getClass(), "implicitPrototype", term86803);
        setField(term86439, term86439.getClass(), "prototype", term86705);
        Class<? extends Object> term87486 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term87485 = ((Class) term87486).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term87485).setAccessible(true);
        Object enum196 = ((Field) term87485).get((Object) null);
        term87179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term87180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term87181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term87179, term87179.getClass(), "call", null);
        setField(term87180, term87180.getClass(), "ownerFunction", null);
        setField(term87180, term87180.getClass(), "className", null);
        setField(term87180, term87180.getClass(), "properties", null);
        setBooleanField(term87181, term87181.getClass(), "isChecked", false);
        setBooleanField(term87181, term87181.getClass(), "visited", false);
        setField(term87181, term87181.getClass(), "docInfo", null);
        setBooleanField(term87181, term87181.getClass(), "unknown", false);
        setBooleanField(term87181, term87181.getClass(), "resolved", false);
        setField(term87181, term87181.getClass(), "resolveResult", null);
        setField(term87181, term87181.getClass(), "registry", null);
        setField(term87180, term87180.getClass(), "implicitPrototype", term87181);
        setBooleanField(term87180, term87180.getClass(), "nativeType", false);
        setBooleanField(term87180, term87180.getClass(), "prettyPrint", false);
        setBooleanField(term87180, term87180.getClass(), "visited", false);
        setField(term87180, term87180.getClass(), "docInfo", null);
        setBooleanField(term87180, term87180.getClass(), "unknown", false);
        setBooleanField(term87180, term87180.getClass(), "resolved", false);
        setField(term87180, term87180.getClass(), "resolveResult", null);
        setField(term87180, term87180.getClass(), "registry", null);
        setField(term87179, term87179.getClass(), "prototype", term87180);
        setField(term87179, term87179.getClass(), "kind", enum196);
        setField(term87179, term87179.getClass(), "typeOfThis", null);
        setField(term87179, term87179.getClass(), "source", null);
        setField(term87179, term87179.getClass(), "implementedInterfaces", null);
        setField(term87179, term87179.getClass(), "subTypes", null);
        setField(term87179, term87179.getClass(), "templateTypeName", null);
        setField(term87179, term87179.getClass(), "className", null);
        setField(term87179, term87179.getClass(), "properties", null);
        setField(term87179, term87179.getClass(), "implicitPrototype", null);
        setBooleanField(term87179, term87179.getClass(), "nativeType", false);
        setBooleanField(term87179, term87179.getClass(), "prettyPrint", false);
        setBooleanField(term87179, term87179.getClass(), "visited", false);
        setField(term87179, term87179.getClass(), "docInfo", null);
        setBooleanField(term87179, term87179.getClass(), "unknown", false);
        setBooleanField(term87179, term87179.getClass(), "resolved", false);
        setField(term87179, term87179.getClass(), "resolveResult", null);
        setField(term87179, term87179.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term86439, args);
        assertTrue(recursiveEquals(term86439, term87179));
        assertTrue(recursiveEquals(retValue, null));
    }

};


