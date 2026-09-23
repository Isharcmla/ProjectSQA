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

public class FunctionType_isSubtype_21010021581371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1753865;
     Object term1754215;
     Object term1755159;
     Object term1755164;

    public FunctionType_isSubtype_21010021581371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1755171 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1755170 = ((Class) term1755171).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1755170).setAccessible(true);
        Object enum3271 = ((Field) term1755170).get((Object) null);
        term1753865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1754107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1753865, term1753865.getClass(), "kind", enum3271);
        setField(term1753865, term1753865.getClass(), "call", term1754107);
        Class<? extends Object> term1755471 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1755470 = ((Class) term1755471).getDeclaredField((String) "ORDINARY");
        ((Field) term1755470).setAccessible(true);
        Object enum3272 = ((Field) term1755470).get((Object) null);
        term1754215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1754457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1754215, term1754215.getClass(), "kind", enum3272);
        setField(term1754215, term1754215.getClass(), "call", term1754457);
        Class<? extends Object> term1755762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1755761 = ((Class) term1755762).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1755761).setAccessible(true);
        Object enum3273 = ((Field) term1755761).get((Object) null);
        term1755159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1755160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1755159, term1755159.getClass(), "this$0", null);
        setField(term1755160, term1755160.getClass(), "parameters", null);
        setField(term1755160, term1755160.getClass(), "returnType", null);
        setBooleanField(term1755160, term1755160.getClass(), "resolved", false);
        setField(term1755160, term1755160.getClass(), "resolveResult", null);
        setField(term1755160, term1755160.getClass(), "registry", null);
        setField(term1755159, term1755159.getClass(), "call", term1755160);
        setField(term1755159, term1755159.getClass(), "prototype", null);
        setField(term1755159, term1755159.getClass(), "kind", enum3273);
        setField(term1755159, term1755159.getClass(), "typeOfThis", null);
        setField(term1755159, term1755159.getClass(), "source", null);
        setField(term1755159, term1755159.getClass(), "implementedInterfaces", null);
        setField(term1755159, term1755159.getClass(), "subTypes", null);
        setField(term1755159, term1755159.getClass(), "templateTypeName", null);
        setField(term1755159, term1755159.getClass(), "className", null);
        setField(term1755159, term1755159.getClass(), "properties", null);
        setField(term1755159, term1755159.getClass(), "implicitPrototype", null);
        setBooleanField(term1755159, term1755159.getClass(), "nativeType", false);
        setBooleanField(term1755159, term1755159.getClass(), "visited", false);
        setField(term1755159, term1755159.getClass(), "docInfo", null);
        setBooleanField(term1755159, term1755159.getClass(), "unknown", false);
        setBooleanField(term1755159, term1755159.getClass(), "resolved", false);
        setField(term1755159, term1755159.getClass(), "resolveResult", null);
        setField(term1755159, term1755159.getClass(), "registry", null);
        Class<? extends Object> term1756062 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1756061 = ((Class) term1756062).getDeclaredField((String) "ORDINARY");
        ((Field) term1756061).setAccessible(true);
        Object enum3274 = ((Field) term1756061).get((Object) null);
        term1755164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1755165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1755164, term1755164.getClass(), "this$0", null);
        setField(term1755165, term1755165.getClass(), "parameters", null);
        setField(term1755165, term1755165.getClass(), "returnType", null);
        setBooleanField(term1755165, term1755165.getClass(), "resolved", false);
        setField(term1755165, term1755165.getClass(), "resolveResult", null);
        setField(term1755165, term1755165.getClass(), "registry", null);
        setField(term1755164, term1755164.getClass(), "call", term1755165);
        setField(term1755164, term1755164.getClass(), "prototype", null);
        setField(term1755164, term1755164.getClass(), "kind", enum3274);
        setField(term1755164, term1755164.getClass(), "typeOfThis", null);
        setField(term1755164, term1755164.getClass(), "source", null);
        setField(term1755164, term1755164.getClass(), "implementedInterfaces", null);
        setField(term1755164, term1755164.getClass(), "subTypes", null);
        setField(term1755164, term1755164.getClass(), "templateTypeName", null);
        setField(term1755164, term1755164.getClass(), "className", null);
        setField(term1755164, term1755164.getClass(), "properties", null);
        setField(term1755164, term1755164.getClass(), "implicitPrototype", null);
        setBooleanField(term1755164, term1755164.getClass(), "nativeType", false);
        setBooleanField(term1755164, term1755164.getClass(), "visited", false);
        setField(term1755164, term1755164.getClass(), "docInfo", null);
        setBooleanField(term1755164, term1755164.getClass(), "unknown", false);
        setBooleanField(term1755164, term1755164.getClass(), "resolved", false);
        setField(term1755164, term1755164.getClass(), "resolveResult", null);
        setField(term1755164, term1755164.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1754215;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1753865, args);
        assertTrue(recursiveEquals(term1753865, term1755159));
        assertTrue(recursiveEquals(term1754215, term1755164));
        assertTrue(recursiveEquals(retValue, true));
    }

};


