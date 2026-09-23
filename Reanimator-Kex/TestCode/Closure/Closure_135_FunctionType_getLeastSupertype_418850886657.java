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

public class FunctionType_getLeastSupertype_418850886657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581163;
     Object term581715;
     Object term584603;
     Object term584607;
     Object term584517;

    public FunctionType_getLeastSupertype_418850886657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term584612 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term584611 = ((Class) term584612).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term584611).setAccessible(true);
        Object enum1080 = ((Field) term584611).get((Object) null);
        term581163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term581163, term581163.getClass(), "kind", enum1080);
        Class<? extends Object> term584912 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term584911 = ((Class) term584912).getDeclaredField((String) "INTERFACE");
        ((Field) term584911).setAccessible(true);
        Object enum1081 = ((Field) term584911).get((Object) null);
        term581715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term581715, term581715.getClass(), "kind", enum1081);
        Class<? extends Object> term585206 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term585205 = ((Class) term585206).getDeclaredField((String) "INTERFACE");
        ((Field) term585205).setAccessible(true);
        Object enum1082 = ((Field) term585205).get((Object) null);
        term584603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term584603, term584603.getClass(), "call", null);
        setField(term584603, term584603.getClass(), "prototype", null);
        setField(term584603, term584603.getClass(), "kind", enum1082);
        setField(term584603, term584603.getClass(), "typeOfThis", null);
        setField(term584603, term584603.getClass(), "source", null);
        setField(term584603, term584603.getClass(), "implementedInterfaces", null);
        setField(term584603, term584603.getClass(), "subTypes", null);
        setField(term584603, term584603.getClass(), "templateTypeName", null);
        setField(term584603, term584603.getClass(), "className", null);
        setField(term584603, term584603.getClass(), "properties", null);
        setField(term584603, term584603.getClass(), "implicitPrototype", null);
        setBooleanField(term584603, term584603.getClass(), "nativeType", false);
        setBooleanField(term584603, term584603.getClass(), "visited", false);
        setField(term584603, term584603.getClass(), "docInfo", null);
        setBooleanField(term584603, term584603.getClass(), "unknown", false);
        setBooleanField(term584603, term584603.getClass(), "resolved", false);
        setField(term584603, term584603.getClass(), "resolveResult", null);
        setField(term584603, term584603.getClass(), "registry", null);
        Class<? extends Object> term585500 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term585499 = ((Class) term585500).getDeclaredField((String) "INTERFACE");
        ((Field) term585499).setAccessible(true);
        Object enum1083 = ((Field) term585499).get((Object) null);
        term584607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term584607, term584607.getClass(), "this$0", null);
        setField(term584607, term584607.getClass(), "call", null);
        setField(term584607, term584607.getClass(), "prototype", null);
        setField(term584607, term584607.getClass(), "kind", enum1083);
        setField(term584607, term584607.getClass(), "typeOfThis", null);
        setField(term584607, term584607.getClass(), "source", null);
        setField(term584607, term584607.getClass(), "implementedInterfaces", null);
        setField(term584607, term584607.getClass(), "subTypes", null);
        setField(term584607, term584607.getClass(), "templateTypeName", null);
        setField(term584607, term584607.getClass(), "className", null);
        setField(term584607, term584607.getClass(), "properties", null);
        setField(term584607, term584607.getClass(), "implicitPrototype", null);
        setBooleanField(term584607, term584607.getClass(), "nativeType", false);
        setBooleanField(term584607, term584607.getClass(), "visited", false);
        setField(term584607, term584607.getClass(), "docInfo", null);
        setBooleanField(term584607, term584607.getClass(), "unknown", false);
        setBooleanField(term584607, term584607.getClass(), "resolved", false);
        setField(term584607, term584607.getClass(), "resolveResult", null);
        setField(term584607, term584607.getClass(), "registry", null);
        Class<? extends Object> term585794 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term585793 = ((Class) term585794).getDeclaredField((String) "INTERFACE");
        ((Field) term585793).setAccessible(true);
        Object enum1084 = ((Field) term585793).get((Object) null);
        term584517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term584517, term584517.getClass(), "call", null);
        setField(term584517, term584517.getClass(), "prototype", null);
        setField(term584517, term584517.getClass(), "kind", enum1084);
        setField(term584517, term584517.getClass(), "typeOfThis", null);
        setField(term584517, term584517.getClass(), "source", null);
        setField(term584517, term584517.getClass(), "implementedInterfaces", null);
        setField(term584517, term584517.getClass(), "subTypes", null);
        setField(term584517, term584517.getClass(), "templateTypeName", null);
        setField(term584517, term584517.getClass(), "className", null);
        setField(term584517, term584517.getClass(), "properties", null);
        setField(term584517, term584517.getClass(), "implicitPrototype", null);
        setBooleanField(term584517, term584517.getClass(), "nativeType", false);
        setBooleanField(term584517, term584517.getClass(), "visited", false);
        setField(term584517, term584517.getClass(), "docInfo", null);
        setBooleanField(term584517, term584517.getClass(), "unknown", false);
        setBooleanField(term584517, term584517.getClass(), "resolved", false);
        setField(term584517, term584517.getClass(), "resolveResult", null);
        setField(term584517, term584517.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term581715;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term581163, args);
        assertTrue(recursiveEquals(term581163, term584603));
        assertTrue(recursiveEquals(term581715, term584607));
        assertTrue(recursiveEquals(retValue, term584517));
    }

};


