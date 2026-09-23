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

public class FunctionType_isSubtype_2101002158531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401164;
     Object term401422;
     Object term401877;
     Object term401881;

    public FunctionType_isSubtype_2101002158531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term401887 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term401886 = ((Class) term401887).getDeclaredField((String) "INTERFACE");
        ((Field) term401886).setAccessible(true);
        Object enum740 = ((Field) term401886).get((Object) null);
        term401164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term401164, term401164.getClass(), "kind", enum740);
        term401422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term401422, term401422.getClass(), "kind", enum740);
        Class<? extends Object> term402181 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term402180 = ((Class) term402181).getDeclaredField((String) "INTERFACE");
        ((Field) term402180).setAccessible(true);
        Object enum741 = ((Field) term402180).get((Object) null);
        term401877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term401877, term401877.getClass(), "this$0", null);
        setField(term401877, term401877.getClass(), "call", null);
        setField(term401877, term401877.getClass(), "prototype", null);
        setField(term401877, term401877.getClass(), "kind", enum741);
        setField(term401877, term401877.getClass(), "typeOfThis", null);
        setField(term401877, term401877.getClass(), "source", null);
        setField(term401877, term401877.getClass(), "implementedInterfaces", null);
        setField(term401877, term401877.getClass(), "subTypes", null);
        setField(term401877, term401877.getClass(), "templateTypeName", null);
        setField(term401877, term401877.getClass(), "className", null);
        setField(term401877, term401877.getClass(), "properties", null);
        setField(term401877, term401877.getClass(), "implicitPrototype", null);
        setBooleanField(term401877, term401877.getClass(), "nativeType", false);
        setBooleanField(term401877, term401877.getClass(), "visited", false);
        setField(term401877, term401877.getClass(), "docInfo", null);
        setBooleanField(term401877, term401877.getClass(), "unknown", false);
        setBooleanField(term401877, term401877.getClass(), "resolved", false);
        setField(term401877, term401877.getClass(), "resolveResult", null);
        setField(term401877, term401877.getClass(), "registry", null);
        Class<? extends Object> term402475 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term402474 = ((Class) term402475).getDeclaredField((String) "INTERFACE");
        ((Field) term402474).setAccessible(true);
        Object enum742 = ((Field) term402474).get((Object) null);
        term401881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term401881, term401881.getClass(), "call", null);
        setField(term401881, term401881.getClass(), "prototype", null);
        setField(term401881, term401881.getClass(), "kind", enum742);
        setField(term401881, term401881.getClass(), "typeOfThis", null);
        setField(term401881, term401881.getClass(), "source", null);
        setField(term401881, term401881.getClass(), "implementedInterfaces", null);
        setField(term401881, term401881.getClass(), "subTypes", null);
        setField(term401881, term401881.getClass(), "templateTypeName", null);
        setField(term401881, term401881.getClass(), "className", null);
        setField(term401881, term401881.getClass(), "properties", null);
        setField(term401881, term401881.getClass(), "implicitPrototype", null);
        setBooleanField(term401881, term401881.getClass(), "nativeType", false);
        setBooleanField(term401881, term401881.getClass(), "visited", false);
        setField(term401881, term401881.getClass(), "docInfo", null);
        setBooleanField(term401881, term401881.getClass(), "unknown", false);
        setBooleanField(term401881, term401881.getClass(), "resolved", false);
        setField(term401881, term401881.getClass(), "resolveResult", null);
        setField(term401881, term401881.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term401422;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term401164, args);
        assertTrue(recursiveEquals(term401164, term401877));
        assertTrue(recursiveEquals(term401422, term401881));
        assertTrue(recursiveEquals(retValue, true));
    }

};


