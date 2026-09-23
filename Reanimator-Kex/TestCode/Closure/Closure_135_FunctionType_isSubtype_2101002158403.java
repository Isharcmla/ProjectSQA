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

public class FunctionType_isSubtype_2101002158403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253064;
     Object term253414;
     Object term254533;
     Object term254538;

    public FunctionType_isSubtype_2101002158403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term254544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term254543 = ((Class) term254544).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term254543).setAccessible(true);
        Object enum461 = ((Field) term254543).get((Object) null);
        term253064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term253306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term253064, term253064.getClass(), "kind", enum461);
        setField(term253064, term253064.getClass(), "call", term253306);
        Class<? extends Object> term254844 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term254843 = ((Class) term254844).getDeclaredField((String) "ORDINARY");
        ((Field) term254843).setAccessible(true);
        Object enum462 = ((Field) term254843).get((Object) null);
        term253414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term253414, term253414.getClass(), "kind", enum462);
        setField(term253414, term253414.getClass(), "call", null);
        Class<? extends Object> term255135 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term255134 = ((Class) term255135).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term255134).setAccessible(true);
        Object enum463 = ((Field) term255134).get((Object) null);
        term254533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term254534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term254533, term254533.getClass(), "this$0", null);
        setField(term254534, term254534.getClass(), "parameters", null);
        setField(term254534, term254534.getClass(), "returnType", null);
        setBooleanField(term254534, term254534.getClass(), "resolved", false);
        setField(term254534, term254534.getClass(), "resolveResult", null);
        setField(term254534, term254534.getClass(), "registry", null);
        setField(term254533, term254533.getClass(), "call", term254534);
        setField(term254533, term254533.getClass(), "prototype", null);
        setField(term254533, term254533.getClass(), "kind", enum463);
        setField(term254533, term254533.getClass(), "typeOfThis", null);
        setField(term254533, term254533.getClass(), "source", null);
        setField(term254533, term254533.getClass(), "implementedInterfaces", null);
        setField(term254533, term254533.getClass(), "subTypes", null);
        setField(term254533, term254533.getClass(), "templateTypeName", null);
        setField(term254533, term254533.getClass(), "className", null);
        setField(term254533, term254533.getClass(), "properties", null);
        setField(term254533, term254533.getClass(), "implicitPrototype", null);
        setBooleanField(term254533, term254533.getClass(), "nativeType", false);
        setBooleanField(term254533, term254533.getClass(), "visited", false);
        setField(term254533, term254533.getClass(), "docInfo", null);
        setBooleanField(term254533, term254533.getClass(), "unknown", false);
        setBooleanField(term254533, term254533.getClass(), "resolved", false);
        setField(term254533, term254533.getClass(), "resolveResult", null);
        setField(term254533, term254533.getClass(), "registry", null);
        Class<? extends Object> term255435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term255434 = ((Class) term255435).getDeclaredField((String) "ORDINARY");
        ((Field) term255434).setAccessible(true);
        Object enum464 = ((Field) term255434).get((Object) null);
        term254538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term254538, term254538.getClass(), "this$0", null);
        setField(term254538, term254538.getClass(), "call", null);
        setField(term254538, term254538.getClass(), "prototype", null);
        setField(term254538, term254538.getClass(), "kind", enum464);
        setField(term254538, term254538.getClass(), "typeOfThis", null);
        setField(term254538, term254538.getClass(), "source", null);
        setField(term254538, term254538.getClass(), "implementedInterfaces", null);
        setField(term254538, term254538.getClass(), "subTypes", null);
        setField(term254538, term254538.getClass(), "templateTypeName", null);
        setField(term254538, term254538.getClass(), "className", null);
        setField(term254538, term254538.getClass(), "properties", null);
        setField(term254538, term254538.getClass(), "implicitPrototype", null);
        setBooleanField(term254538, term254538.getClass(), "nativeType", false);
        setBooleanField(term254538, term254538.getClass(), "visited", false);
        setField(term254538, term254538.getClass(), "docInfo", null);
        setBooleanField(term254538, term254538.getClass(), "unknown", false);
        setBooleanField(term254538, term254538.getClass(), "resolved", false);
        setField(term254538, term254538.getClass(), "resolveResult", null);
        setField(term254538, term254538.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term253414;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term253064, args);
        assertTrue(recursiveEquals(term253064, term254533));
        assertTrue(recursiveEquals(term253414, term254538));
        assertTrue(recursiveEquals(retValue, false));
    }

};


