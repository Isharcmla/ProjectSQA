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

public class FunctionType_isSubtype_2101002158420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273697;
     Object term273955;
     Object term275724;
     Object term275728;

    public FunctionType_isSubtype_2101002158420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term275731 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term275730 = ((Class) term275731).getDeclaredField((String) "INTERFACE");
        ((Field) term275730).setAccessible(true);
        Object enum500 = ((Field) term275730).get((Object) null);
        term273697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term273697, term273697.getClass(), "kind", enum500);
        term273955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term276025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term276024 = ((Class) term276025).getDeclaredField((String) "INTERFACE");
        ((Field) term276024).setAccessible(true);
        Object enum501 = ((Field) term276024).get((Object) null);
        term275724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term275724, term275724.getClass(), "this$0", null);
        setField(term275724, term275724.getClass(), "call", null);
        setField(term275724, term275724.getClass(), "prototype", null);
        setField(term275724, term275724.getClass(), "kind", enum501);
        setField(term275724, term275724.getClass(), "typeOfThis", null);
        setField(term275724, term275724.getClass(), "source", null);
        setField(term275724, term275724.getClass(), "implementedInterfaces", null);
        setField(term275724, term275724.getClass(), "subTypes", null);
        setField(term275724, term275724.getClass(), "templateTypeName", null);
        setField(term275724, term275724.getClass(), "className", null);
        setField(term275724, term275724.getClass(), "properties", null);
        setField(term275724, term275724.getClass(), "implicitPrototype", null);
        setBooleanField(term275724, term275724.getClass(), "nativeType", false);
        setBooleanField(term275724, term275724.getClass(), "visited", false);
        setField(term275724, term275724.getClass(), "docInfo", null);
        setBooleanField(term275724, term275724.getClass(), "unknown", false);
        setBooleanField(term275724, term275724.getClass(), "resolved", false);
        setField(term275724, term275724.getClass(), "resolveResult", null);
        setField(term275724, term275724.getClass(), "registry", null);
        term275728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term275728, term275728.getClass(), "call", null);
        setField(term275728, term275728.getClass(), "prototype", null);
        setField(term275728, term275728.getClass(), "kind", null);
        setField(term275728, term275728.getClass(), "typeOfThis", null);
        setField(term275728, term275728.getClass(), "source", null);
        setField(term275728, term275728.getClass(), "implementedInterfaces", null);
        setField(term275728, term275728.getClass(), "subTypes", null);
        setField(term275728, term275728.getClass(), "templateTypeName", null);
        setField(term275728, term275728.getClass(), "className", null);
        setField(term275728, term275728.getClass(), "properties", null);
        setField(term275728, term275728.getClass(), "implicitPrototype", null);
        setBooleanField(term275728, term275728.getClass(), "nativeType", false);
        setBooleanField(term275728, term275728.getClass(), "visited", false);
        setField(term275728, term275728.getClass(), "docInfo", null);
        setBooleanField(term275728, term275728.getClass(), "unknown", false);
        setBooleanField(term275728, term275728.getClass(), "resolved", false);
        setField(term275728, term275728.getClass(), "resolveResult", null);
        setField(term275728, term275728.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term273955;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term273697, args);
        assertTrue(recursiveEquals(term273697, term275724));
        assertTrue(recursiveEquals(term273955, term275728));
        assertTrue(recursiveEquals(retValue, false));
    }

};


