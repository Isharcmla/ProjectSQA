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

public class FunctionType_isSubtype_21010021581658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2238179;
     Object term2238529;
     Object term2241098;
     Object term2241103;

    public FunctionType_isSubtype_21010021581658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2241110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2241109 = ((Class) term2241110).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2241109).setAccessible(true);
        Object enum4179 = ((Field) term2241109).get((Object) null);
        term2238179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2238421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2238179, term2238179.getClass(), "kind", enum4179);
        setField(term2238179, term2238179.getClass(), "call", term2238421);
        Class<? extends Object> term2241410 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2241409 = ((Class) term2241410).getDeclaredField((String) "ORDINARY");
        ((Field) term2241409).setAccessible(true);
        Object enum4180 = ((Field) term2241409).get((Object) null);
        term2238529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2238771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2238529, term2238529.getClass(), "kind", enum4180);
        setField(term2238529, term2238529.getClass(), "call", term2238771);
        Class<? extends Object> term2241701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2241700 = ((Class) term2241701).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2241700).setAccessible(true);
        Object enum4181 = ((Field) term2241700).get((Object) null);
        term2241098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2241099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2241098, term2241098.getClass(), "this$0", null);
        setField(term2241099, term2241099.getClass(), "parameters", null);
        setField(term2241099, term2241099.getClass(), "returnType", null);
        setBooleanField(term2241099, term2241099.getClass(), "resolved", false);
        setField(term2241099, term2241099.getClass(), "resolveResult", null);
        setField(term2241099, term2241099.getClass(), "registry", null);
        setField(term2241098, term2241098.getClass(), "call", term2241099);
        setField(term2241098, term2241098.getClass(), "prototype", null);
        setField(term2241098, term2241098.getClass(), "kind", enum4181);
        setField(term2241098, term2241098.getClass(), "typeOfThis", null);
        setField(term2241098, term2241098.getClass(), "source", null);
        setField(term2241098, term2241098.getClass(), "implementedInterfaces", null);
        setField(term2241098, term2241098.getClass(), "subTypes", null);
        setField(term2241098, term2241098.getClass(), "templateTypeName", null);
        setField(term2241098, term2241098.getClass(), "className", null);
        setField(term2241098, term2241098.getClass(), "properties", null);
        setField(term2241098, term2241098.getClass(), "implicitPrototype", null);
        setBooleanField(term2241098, term2241098.getClass(), "nativeType", false);
        setBooleanField(term2241098, term2241098.getClass(), "visited", false);
        setField(term2241098, term2241098.getClass(), "docInfo", null);
        setBooleanField(term2241098, term2241098.getClass(), "unknown", false);
        setBooleanField(term2241098, term2241098.getClass(), "resolved", false);
        setField(term2241098, term2241098.getClass(), "resolveResult", null);
        setField(term2241098, term2241098.getClass(), "registry", null);
        Class<? extends Object> term2242001 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2242000 = ((Class) term2242001).getDeclaredField((String) "ORDINARY");
        ((Field) term2242000).setAccessible(true);
        Object enum4182 = ((Field) term2242000).get((Object) null);
        term2241103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2241104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2241103, term2241103.getClass(), "this$0", null);
        setField(term2241104, term2241104.getClass(), "parameters", null);
        setField(term2241104, term2241104.getClass(), "returnType", null);
        setBooleanField(term2241104, term2241104.getClass(), "resolved", false);
        setField(term2241104, term2241104.getClass(), "resolveResult", null);
        setField(term2241104, term2241104.getClass(), "registry", null);
        setField(term2241103, term2241103.getClass(), "call", term2241104);
        setField(term2241103, term2241103.getClass(), "prototype", null);
        setField(term2241103, term2241103.getClass(), "kind", enum4182);
        setField(term2241103, term2241103.getClass(), "typeOfThis", null);
        setField(term2241103, term2241103.getClass(), "source", null);
        setField(term2241103, term2241103.getClass(), "implementedInterfaces", null);
        setField(term2241103, term2241103.getClass(), "subTypes", null);
        setField(term2241103, term2241103.getClass(), "templateTypeName", null);
        setField(term2241103, term2241103.getClass(), "className", null);
        setField(term2241103, term2241103.getClass(), "properties", null);
        setField(term2241103, term2241103.getClass(), "implicitPrototype", null);
        setBooleanField(term2241103, term2241103.getClass(), "nativeType", false);
        setBooleanField(term2241103, term2241103.getClass(), "visited", false);
        setField(term2241103, term2241103.getClass(), "docInfo", null);
        setBooleanField(term2241103, term2241103.getClass(), "unknown", false);
        setBooleanField(term2241103, term2241103.getClass(), "resolved", false);
        setField(term2241103, term2241103.getClass(), "resolveResult", null);
        setField(term2241103, term2241103.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2238529;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2238179, args);
        assertTrue(recursiveEquals(term2238179, term2241098));
        assertTrue(recursiveEquals(term2238529, term2241103));
        assertTrue(recursiveEquals(retValue, true));
    }

};


