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

public class FunctionType_getImplementedInterfaces_281458626247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139525;
     Object term141464;

    public FunctionType_getImplementedInterfaces_281458626247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141471 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term141470 = ((Class) term141471).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term141470).setAccessible(true);
        Object enum284 = ((Field) term141470).get((Object) null);
        term139525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term139791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term139891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term139525, term139525.getClass(), "kind", enum284);
        setField(term139791, term139791.getClass(), "implicitPrototype", term139891);
        setField(term139525, term139525.getClass(), "prototype", term139791);
        Class<? extends Object> term141771 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term141770 = ((Class) term141771).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term141770).setAccessible(true);
        Object enum285 = ((Field) term141770).get((Object) null);
        term141464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term141465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term141466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term141464, term141464.getClass(), "call", null);
        setField(term141465, term141465.getClass(), "ownerFunction", null);
        setField(term141465, term141465.getClass(), "className", null);
        setField(term141465, term141465.getClass(), "properties", null);
        setField(term141466, term141466.getClass(), "call", null);
        setField(term141466, term141466.getClass(), "prototype", null);
        setField(term141466, term141466.getClass(), "kind", null);
        setField(term141466, term141466.getClass(), "typeOfThis", null);
        setField(term141466, term141466.getClass(), "source", null);
        setField(term141466, term141466.getClass(), "implementedInterfaces", null);
        setField(term141466, term141466.getClass(), "subTypes", null);
        setField(term141466, term141466.getClass(), "templateTypeName", null);
        setField(term141466, term141466.getClass(), "className", null);
        setField(term141466, term141466.getClass(), "properties", null);
        setField(term141466, term141466.getClass(), "implicitPrototype", null);
        setBooleanField(term141466, term141466.getClass(), "nativeType", false);
        setBooleanField(term141466, term141466.getClass(), "prettyPrint", false);
        setBooleanField(term141466, term141466.getClass(), "visited", false);
        setField(term141466, term141466.getClass(), "docInfo", null);
        setBooleanField(term141466, term141466.getClass(), "unknown", false);
        setBooleanField(term141466, term141466.getClass(), "resolved", false);
        setField(term141466, term141466.getClass(), "resolveResult", null);
        setField(term141466, term141466.getClass(), "registry", null);
        setField(term141465, term141465.getClass(), "implicitPrototype", term141466);
        setBooleanField(term141465, term141465.getClass(), "nativeType", false);
        setBooleanField(term141465, term141465.getClass(), "prettyPrint", false);
        setBooleanField(term141465, term141465.getClass(), "visited", false);
        setField(term141465, term141465.getClass(), "docInfo", null);
        setBooleanField(term141465, term141465.getClass(), "unknown", false);
        setBooleanField(term141465, term141465.getClass(), "resolved", false);
        setField(term141465, term141465.getClass(), "resolveResult", null);
        setField(term141465, term141465.getClass(), "registry", null);
        setField(term141464, term141464.getClass(), "prototype", term141465);
        setField(term141464, term141464.getClass(), "kind", enum285);
        setField(term141464, term141464.getClass(), "typeOfThis", null);
        setField(term141464, term141464.getClass(), "source", null);
        setField(term141464, term141464.getClass(), "implementedInterfaces", null);
        setField(term141464, term141464.getClass(), "subTypes", null);
        setField(term141464, term141464.getClass(), "templateTypeName", null);
        setField(term141464, term141464.getClass(), "className", null);
        setField(term141464, term141464.getClass(), "properties", null);
        setField(term141464, term141464.getClass(), "implicitPrototype", null);
        setBooleanField(term141464, term141464.getClass(), "nativeType", false);
        setBooleanField(term141464, term141464.getClass(), "prettyPrint", false);
        setBooleanField(term141464, term141464.getClass(), "visited", false);
        setField(term141464, term141464.getClass(), "docInfo", null);
        setBooleanField(term141464, term141464.getClass(), "unknown", false);
        setBooleanField(term141464, term141464.getClass(), "resolved", false);
        setField(term141464, term141464.getClass(), "resolveResult", null);
        setField(term141464, term141464.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term139525, args);
        assertTrue(recursiveEquals(term139525, term141464));
        assertTrue(recursiveEquals(retValue, null));
    }

};


