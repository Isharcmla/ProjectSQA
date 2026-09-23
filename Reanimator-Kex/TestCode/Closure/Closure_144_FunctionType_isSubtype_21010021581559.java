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

public class FunctionType_isSubtype_21010021581559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2279181;
     Object term2279835;
     Object term2282701;
     Object term2282709;

    public FunctionType_isSubtype_21010021581559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2282719 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2282718 = ((Class) term2282719).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2282718).setAccessible(true);
        Object enum4071 = ((Field) term2282718).get((Object) null);
        Class<? extends Object> term2283019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283018 = ((Class) term2283019).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2283018).setAccessible(true);
        Object enum4072 = ((Field) term2283018).get((Object) null);
        term2279181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2279725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2279181, term2279181.getClass(), "kind", enum4071);
        setField(term2279725, term2279725.getClass(), "kind", enum4072);
        setField(term2279181, term2279181.getClass(), "typeOfThis", term2279725);
        Class<? extends Object> term2283319 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283318 = ((Class) term2283319).getDeclaredField((String) "INTERFACE");
        ((Field) term2283318).setAccessible(true);
        Object enum4073 = ((Field) term2283318).get((Object) null);
        term2279835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2280019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2279835, term2279835.getClass(), "kind", enum4072);
        setField(term2280019, term2280019.getClass(), "kind", enum4073);
        setField(term2279835, term2279835.getClass(), "typeOfThis", term2280019);
        Class<? extends Object> term2283613 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283612 = ((Class) term2283613).getDeclaredField((String) "INTERFACE");
        ((Field) term2283612).setAccessible(true);
        Object enum4074 = ((Field) term2283612).get((Object) null);
        Class<? extends Object> term2283907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2283906 = ((Class) term2283907).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2283906).setAccessible(true);
        Object enum4075 = ((Field) term2283906).get((Object) null);
        term2282701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2282705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2282701, term2282701.getClass(), "call", null);
        setField(term2282701, term2282701.getClass(), "prototype", null);
        setField(term2282701, term2282701.getClass(), "kind", enum4074);
        setField(term2282705, term2282705.getClass(), "call", null);
        setField(term2282705, term2282705.getClass(), "prototype", null);
        setField(term2282705, term2282705.getClass(), "kind", enum4075);
        setField(term2282705, term2282705.getClass(), "typeOfThis", null);
        setField(term2282705, term2282705.getClass(), "source", null);
        setField(term2282705, term2282705.getClass(), "implementedInterfaces", null);
        setField(term2282705, term2282705.getClass(), "subTypes", null);
        setField(term2282705, term2282705.getClass(), "templateTypeName", null);
        setField(term2282705, term2282705.getClass(), "className", null);
        setField(term2282705, term2282705.getClass(), "properties", null);
        setField(term2282705, term2282705.getClass(), "implicitPrototype", null);
        setBooleanField(term2282705, term2282705.getClass(), "nativeType", false);
        setBooleanField(term2282705, term2282705.getClass(), "prettyPrint", false);
        setBooleanField(term2282705, term2282705.getClass(), "visited", false);
        setField(term2282705, term2282705.getClass(), "docInfo", null);
        setBooleanField(term2282705, term2282705.getClass(), "unknown", false);
        setBooleanField(term2282705, term2282705.getClass(), "resolved", false);
        setField(term2282705, term2282705.getClass(), "resolveResult", null);
        setField(term2282705, term2282705.getClass(), "registry", null);
        setField(term2282701, term2282701.getClass(), "typeOfThis", term2282705);
        setField(term2282701, term2282701.getClass(), "source", null);
        setField(term2282701, term2282701.getClass(), "implementedInterfaces", null);
        setField(term2282701, term2282701.getClass(), "subTypes", null);
        setField(term2282701, term2282701.getClass(), "templateTypeName", null);
        setField(term2282701, term2282701.getClass(), "className", null);
        setField(term2282701, term2282701.getClass(), "properties", null);
        setField(term2282701, term2282701.getClass(), "implicitPrototype", null);
        setBooleanField(term2282701, term2282701.getClass(), "nativeType", false);
        setBooleanField(term2282701, term2282701.getClass(), "prettyPrint", false);
        setBooleanField(term2282701, term2282701.getClass(), "visited", false);
        setField(term2282701, term2282701.getClass(), "docInfo", null);
        setBooleanField(term2282701, term2282701.getClass(), "unknown", false);
        setBooleanField(term2282701, term2282701.getClass(), "resolved", false);
        setField(term2282701, term2282701.getClass(), "resolveResult", null);
        setField(term2282701, term2282701.getClass(), "registry", null);
        Class<? extends Object> term2284207 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2284206 = ((Class) term2284207).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2284206).setAccessible(true);
        Object enum4076 = ((Field) term2284206).get((Object) null);
        Class<? extends Object> term2284507 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2284506 = ((Class) term2284507).getDeclaredField((String) "INTERFACE");
        ((Field) term2284506).setAccessible(true);
        Object enum4077 = ((Field) term2284506).get((Object) null);
        term2282709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2282713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2282709, term2282709.getClass(), "call", null);
        setField(term2282709, term2282709.getClass(), "prototype", null);
        setField(term2282709, term2282709.getClass(), "kind", enum4076);
        setField(term2282713, term2282713.getClass(), "call", null);
        setField(term2282713, term2282713.getClass(), "prototype", null);
        setField(term2282713, term2282713.getClass(), "kind", enum4077);
        setField(term2282713, term2282713.getClass(), "typeOfThis", null);
        setField(term2282713, term2282713.getClass(), "source", null);
        setField(term2282713, term2282713.getClass(), "implementedInterfaces", null);
        setField(term2282713, term2282713.getClass(), "subTypes", null);
        setField(term2282713, term2282713.getClass(), "templateTypeName", null);
        setField(term2282713, term2282713.getClass(), "className", null);
        setField(term2282713, term2282713.getClass(), "properties", null);
        setField(term2282713, term2282713.getClass(), "implicitPrototype", null);
        setBooleanField(term2282713, term2282713.getClass(), "nativeType", false);
        setBooleanField(term2282713, term2282713.getClass(), "prettyPrint", false);
        setBooleanField(term2282713, term2282713.getClass(), "visited", false);
        setField(term2282713, term2282713.getClass(), "docInfo", null);
        setBooleanField(term2282713, term2282713.getClass(), "unknown", false);
        setBooleanField(term2282713, term2282713.getClass(), "resolved", false);
        setField(term2282713, term2282713.getClass(), "resolveResult", null);
        setField(term2282713, term2282713.getClass(), "registry", null);
        setField(term2282709, term2282709.getClass(), "typeOfThis", term2282713);
        setField(term2282709, term2282709.getClass(), "source", null);
        setField(term2282709, term2282709.getClass(), "implementedInterfaces", null);
        setField(term2282709, term2282709.getClass(), "subTypes", null);
        setField(term2282709, term2282709.getClass(), "templateTypeName", null);
        setField(term2282709, term2282709.getClass(), "className", null);
        setField(term2282709, term2282709.getClass(), "properties", null);
        setField(term2282709, term2282709.getClass(), "implicitPrototype", null);
        setBooleanField(term2282709, term2282709.getClass(), "nativeType", false);
        setBooleanField(term2282709, term2282709.getClass(), "prettyPrint", false);
        setBooleanField(term2282709, term2282709.getClass(), "visited", false);
        setField(term2282709, term2282709.getClass(), "docInfo", null);
        setBooleanField(term2282709, term2282709.getClass(), "unknown", false);
        setBooleanField(term2282709, term2282709.getClass(), "resolved", false);
        setField(term2282709, term2282709.getClass(), "resolveResult", null);
        setField(term2282709, term2282709.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2279835;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2279181, args);
        assertTrue(recursiveEquals(term2279181, term2282701));
        assertTrue(recursiveEquals(term2279835, term2282709));
        assertTrue(recursiveEquals(retValue, false));
    }

};


