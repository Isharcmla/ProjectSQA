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

public class FunctionType_isEquivalentTo_230708275393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292902;
     Object term293160;
     Object term293977;
     Object term293981;

    public FunctionType_isEquivalentTo_230708275393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293987 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term293986 = ((Class) term293987).getDeclaredField((String) "INTERFACE");
        ((Field) term293986).setAccessible(true);
        Object enum540 = ((Field) term293986).get((Object) null);
        term292902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term292902, term292902.getClass(), "kind", enum540);
        Class<? extends Object> term294281 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term294280 = ((Class) term294281).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term294280).setAccessible(true);
        Object enum541 = ((Field) term294280).get((Object) null);
        term293160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term293160, term293160.getClass(), "kind", enum541);
        Class<? extends Object> term294581 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term294580 = ((Class) term294581).getDeclaredField((String) "INTERFACE");
        ((Field) term294580).setAccessible(true);
        Object enum542 = ((Field) term294580).get((Object) null);
        term293977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term293977, term293977.getClass(), "call", null);
        setField(term293977, term293977.getClass(), "prototype", null);
        setField(term293977, term293977.getClass(), "kind", enum542);
        setField(term293977, term293977.getClass(), "typeOfThis", null);
        setField(term293977, term293977.getClass(), "source", null);
        setField(term293977, term293977.getClass(), "implementedInterfaces", null);
        setField(term293977, term293977.getClass(), "subTypes", null);
        setField(term293977, term293977.getClass(), "templateTypeName", null);
        setField(term293977, term293977.getClass(), "className", null);
        setField(term293977, term293977.getClass(), "properties", null);
        setField(term293977, term293977.getClass(), "implicitPrototype", null);
        setBooleanField(term293977, term293977.getClass(), "nativeType", false);
        setBooleanField(term293977, term293977.getClass(), "prettyPrint", false);
        setBooleanField(term293977, term293977.getClass(), "visited", false);
        setField(term293977, term293977.getClass(), "docInfo", null);
        setBooleanField(term293977, term293977.getClass(), "unknown", false);
        setBooleanField(term293977, term293977.getClass(), "resolved", false);
        setField(term293977, term293977.getClass(), "resolveResult", null);
        setField(term293977, term293977.getClass(), "registry", null);
        Class<? extends Object> term294875 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term294874 = ((Class) term294875).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term294874).setAccessible(true);
        Object enum543 = ((Field) term294874).get((Object) null);
        term293981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term293981, term293981.getClass(), "call", null);
        setField(term293981, term293981.getClass(), "prototype", null);
        setField(term293981, term293981.getClass(), "kind", enum543);
        setField(term293981, term293981.getClass(), "typeOfThis", null);
        setField(term293981, term293981.getClass(), "source", null);
        setField(term293981, term293981.getClass(), "implementedInterfaces", null);
        setField(term293981, term293981.getClass(), "subTypes", null);
        setField(term293981, term293981.getClass(), "templateTypeName", null);
        setField(term293981, term293981.getClass(), "className", null);
        setField(term293981, term293981.getClass(), "properties", null);
        setField(term293981, term293981.getClass(), "implicitPrototype", null);
        setBooleanField(term293981, term293981.getClass(), "nativeType", false);
        setBooleanField(term293981, term293981.getClass(), "prettyPrint", false);
        setBooleanField(term293981, term293981.getClass(), "visited", false);
        setField(term293981, term293981.getClass(), "docInfo", null);
        setBooleanField(term293981, term293981.getClass(), "unknown", false);
        setBooleanField(term293981, term293981.getClass(), "resolved", false);
        setField(term293981, term293981.getClass(), "resolveResult", null);
        setField(term293981, term293981.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term293160;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term292902, args);
        assertTrue(recursiveEquals(term292902, term293977));
        assertTrue(recursiveEquals(term293160, term293981));
        assertTrue(recursiveEquals(retValue, false));
    }

};


