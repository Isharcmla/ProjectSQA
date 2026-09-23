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

public class FunctionType_isSubtype_21010021581501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973047;
     Object term1973399;
     Object term1974399;
     Object term1974404;

    public FunctionType_isSubtype_21010021581501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1974411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1974410 = ((Class) term1974411).getDeclaredField((String) "ORDINARY");
        ((Field) term1974410).setAccessible(true);
        Object enum3678 = ((Field) term1974410).get((Object) null);
        term1973047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1973289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1973047, term1973047.getClass(), "kind", enum3678);
        setField(term1973047, term1973047.getClass(), "typeOfThis", term1973047);
        setField(term1973047, term1973047.getClass(), "call", term1973289);
        Class<? extends Object> term1974702 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1974701 = ((Class) term1974702).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1974701).setAccessible(true);
        Object enum3679 = ((Field) term1974701).get((Object) null);
        term1973399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1973641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1973399, term1973399.getClass(), "kind", enum3679);
        setField(term1973399, term1973399.getClass(), "typeOfThis", null);
        setField(term1973399, term1973399.getClass(), "call", term1973641);
        Class<? extends Object> term1975002 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1975001 = ((Class) term1975002).getDeclaredField((String) "ORDINARY");
        ((Field) term1975001).setAccessible(true);
        Object enum3680 = ((Field) term1975001).get((Object) null);
        term1974399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1974400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1974399, term1974399.getClass(), "this$0", null);
        setField(term1974400, term1974400.getClass(), "parameters", null);
        setField(term1974400, term1974400.getClass(), "returnType", null);
        setBooleanField(term1974400, term1974400.getClass(), "resolved", false);
        setField(term1974400, term1974400.getClass(), "resolveResult", null);
        setField(term1974400, term1974400.getClass(), "registry", null);
        setField(term1974399, term1974399.getClass(), "call", term1974400);
        setField(term1974399, term1974399.getClass(), "prototype", null);
        setField(term1974399, term1974399.getClass(), "kind", enum3680);
        setField(term1974399, term1974399.getClass(), "typeOfThis", term1974399);
        setField(term1974399, term1974399.getClass(), "source", null);
        setField(term1974399, term1974399.getClass(), "implementedInterfaces", null);
        setField(term1974399, term1974399.getClass(), "subTypes", null);
        setField(term1974399, term1974399.getClass(), "templateTypeName", null);
        setField(term1974399, term1974399.getClass(), "className", null);
        setField(term1974399, term1974399.getClass(), "properties", null);
        setField(term1974399, term1974399.getClass(), "implicitPrototype", null);
        setBooleanField(term1974399, term1974399.getClass(), "nativeType", false);
        setBooleanField(term1974399, term1974399.getClass(), "visited", false);
        setField(term1974399, term1974399.getClass(), "docInfo", null);
        setBooleanField(term1974399, term1974399.getClass(), "unknown", false);
        setBooleanField(term1974399, term1974399.getClass(), "resolved", false);
        setField(term1974399, term1974399.getClass(), "resolveResult", null);
        setField(term1974399, term1974399.getClass(), "registry", null);
        Class<? extends Object> term1975293 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1975292 = ((Class) term1975293).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1975292).setAccessible(true);
        Object enum3681 = ((Field) term1975292).get((Object) null);
        term1974404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1974405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1974405, term1974405.getClass(), "parameters", null);
        setField(term1974405, term1974405.getClass(), "returnType", null);
        setBooleanField(term1974405, term1974405.getClass(), "resolved", false);
        setField(term1974405, term1974405.getClass(), "resolveResult", null);
        setField(term1974405, term1974405.getClass(), "registry", null);
        setField(term1974404, term1974404.getClass(), "call", term1974405);
        setField(term1974404, term1974404.getClass(), "prototype", null);
        setField(term1974404, term1974404.getClass(), "kind", enum3681);
        setField(term1974404, term1974404.getClass(), "typeOfThis", null);
        setField(term1974404, term1974404.getClass(), "source", null);
        setField(term1974404, term1974404.getClass(), "implementedInterfaces", null);
        setField(term1974404, term1974404.getClass(), "subTypes", null);
        setField(term1974404, term1974404.getClass(), "templateTypeName", null);
        setField(term1974404, term1974404.getClass(), "className", null);
        setField(term1974404, term1974404.getClass(), "properties", null);
        setField(term1974404, term1974404.getClass(), "implicitPrototype", null);
        setBooleanField(term1974404, term1974404.getClass(), "nativeType", false);
        setBooleanField(term1974404, term1974404.getClass(), "visited", false);
        setField(term1974404, term1974404.getClass(), "docInfo", null);
        setBooleanField(term1974404, term1974404.getClass(), "unknown", false);
        setBooleanField(term1974404, term1974404.getClass(), "resolved", false);
        setField(term1974404, term1974404.getClass(), "resolveResult", null);
        setField(term1974404, term1974404.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1973399;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1973047, args);
        assertTrue(recursiveEquals(term1973047, term1974399));
        assertTrue(recursiveEquals(term1973399, term1974404));
        assertTrue(recursiveEquals(retValue, true));
    }

};


