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

public class FunctionType_isEquivalentTo_230708275248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129704;
     Object term130070;
     Object term131908;
     Object term131913;

    public FunctionType_isEquivalentTo_230708275248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131919 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term131918 = ((Class) term131919).getDeclaredField((String) "ORDINARY");
        ((Field) term131918).setAccessible(true);
        Object enum242 = ((Field) term131918).get((Object) null);
        term129704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term129960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term129704, term129704.getClass(), "kind", enum242);
        setField(term129704, term129704.getClass(), "typeOfThis", term129960);
        Class<? extends Object> term132210 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term132209 = ((Class) term132210).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term132209).setAccessible(true);
        Object enum243 = ((Field) term132209).get((Object) null);
        term130070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term130070, term130070.getClass(), "kind", enum243);
        setField(term130070, term130070.getClass(), "typeOfThis", null);
        Class<? extends Object> term132510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term132509 = ((Class) term132510).getDeclaredField((String) "ORDINARY");
        ((Field) term132509).setAccessible(true);
        Object enum244 = ((Field) term132509).get((Object) null);
        term131908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term131912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term131908, term131908.getClass(), "call", null);
        setField(term131908, term131908.getClass(), "prototype", null);
        setField(term131908, term131908.getClass(), "kind", enum244);
        setField(term131912, term131912.getClass(), "this$0", null);
        setField(term131912, term131912.getClass(), "call", null);
        setField(term131912, term131912.getClass(), "prototype", null);
        setField(term131912, term131912.getClass(), "kind", null);
        setField(term131912, term131912.getClass(), "typeOfThis", null);
        setField(term131912, term131912.getClass(), "source", null);
        setField(term131912, term131912.getClass(), "implementedInterfaces", null);
        setField(term131912, term131912.getClass(), "subTypes", null);
        setField(term131912, term131912.getClass(), "templateTypeName", null);
        setField(term131912, term131912.getClass(), "className", null);
        setField(term131912, term131912.getClass(), "properties", null);
        setBooleanField(term131912, term131912.getClass(), "nativeType", false);
        setField(term131912, term131912.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term131912, term131912.getClass(), "prettyPrint", false);
        setBooleanField(term131912, term131912.getClass(), "visited", false);
        setField(term131912, term131912.getClass(), "docInfo", null);
        setBooleanField(term131912, term131912.getClass(), "unknown", false);
        setBooleanField(term131912, term131912.getClass(), "resolved", false);
        setField(term131912, term131912.getClass(), "resolveResult", null);
        setField(term131912, term131912.getClass(), "registry", null);
        setField(term131908, term131908.getClass(), "typeOfThis", term131912);
        setField(term131908, term131908.getClass(), "source", null);
        setField(term131908, term131908.getClass(), "implementedInterfaces", null);
        setField(term131908, term131908.getClass(), "subTypes", null);
        setField(term131908, term131908.getClass(), "templateTypeName", null);
        setField(term131908, term131908.getClass(), "className", null);
        setField(term131908, term131908.getClass(), "properties", null);
        setBooleanField(term131908, term131908.getClass(), "nativeType", false);
        setField(term131908, term131908.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term131908, term131908.getClass(), "prettyPrint", false);
        setBooleanField(term131908, term131908.getClass(), "visited", false);
        setField(term131908, term131908.getClass(), "docInfo", null);
        setBooleanField(term131908, term131908.getClass(), "unknown", false);
        setBooleanField(term131908, term131908.getClass(), "resolved", false);
        setField(term131908, term131908.getClass(), "resolveResult", null);
        setField(term131908, term131908.getClass(), "registry", null);
        Class<? extends Object> term132801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term132800 = ((Class) term132801).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term132800).setAccessible(true);
        Object enum245 = ((Field) term132800).get((Object) null);
        term131913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term131913, term131913.getClass(), "call", null);
        setField(term131913, term131913.getClass(), "prototype", null);
        setField(term131913, term131913.getClass(), "kind", enum245);
        setField(term131913, term131913.getClass(), "typeOfThis", null);
        setField(term131913, term131913.getClass(), "source", null);
        setField(term131913, term131913.getClass(), "implementedInterfaces", null);
        setField(term131913, term131913.getClass(), "subTypes", null);
        setField(term131913, term131913.getClass(), "templateTypeName", null);
        setField(term131913, term131913.getClass(), "className", null);
        setField(term131913, term131913.getClass(), "properties", null);
        setBooleanField(term131913, term131913.getClass(), "nativeType", false);
        setField(term131913, term131913.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term131913, term131913.getClass(), "prettyPrint", false);
        setBooleanField(term131913, term131913.getClass(), "visited", false);
        setField(term131913, term131913.getClass(), "docInfo", null);
        setBooleanField(term131913, term131913.getClass(), "unknown", false);
        setBooleanField(term131913, term131913.getClass(), "resolved", false);
        setField(term131913, term131913.getClass(), "resolveResult", null);
        setField(term131913, term131913.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term130070;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term129704, args);
        assertTrue(recursiveEquals(term129704, term131908));
        assertTrue(recursiveEquals(term130070, term131913));
        assertTrue(recursiveEquals(retValue, false));
    }

};


