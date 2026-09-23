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

public class FunctionType_isSubtype_21010021581526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2015710;
     Object term2016362;
     Object term2019208;
     Object term2019216;

    public FunctionType_isSubtype_21010021581526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2019223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2019222 = ((Class) term2019223).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2019222).setAccessible(true);
        Object enum3758 = ((Field) term2019222).get((Object) null);
        Class<? extends Object> term2019523 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2019522 = ((Class) term2019523).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2019522).setAccessible(true);
        Object enum3759 = ((Field) term2019522).get((Object) null);
        term2015710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2016254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2015710, term2015710.getClass(), "kind", enum3758);
        setField(term2016254, term2016254.getClass(), "kind", enum3759);
        setField(term2015710, term2015710.getClass(), "typeOfThis", term2016254);
        term2016362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2016536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2016362, term2016362.getClass(), "kind", enum3759);
        setField(term2016362, term2016362.getClass(), "typeOfThis", term2016536);
        Class<? extends Object> term2019823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2019822 = ((Class) term2019823).getDeclaredField((String) "INTERFACE");
        ((Field) term2019822).setAccessible(true);
        Object enum3760 = ((Field) term2019822).get((Object) null);
        Class<? extends Object> term2020117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2020116 = ((Class) term2020117).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2020116).setAccessible(true);
        Object enum3761 = ((Field) term2020116).get((Object) null);
        term2019208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2019212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2019208, term2019208.getClass(), "this$0", null);
        setField(term2019208, term2019208.getClass(), "call", null);
        setField(term2019208, term2019208.getClass(), "prototype", null);
        setField(term2019208, term2019208.getClass(), "kind", enum3760);
        setField(term2019212, term2019212.getClass(), "call", null);
        setField(term2019212, term2019212.getClass(), "prototype", null);
        setField(term2019212, term2019212.getClass(), "kind", enum3761);
        setField(term2019212, term2019212.getClass(), "typeOfThis", null);
        setField(term2019212, term2019212.getClass(), "source", null);
        setField(term2019212, term2019212.getClass(), "implementedInterfaces", null);
        setField(term2019212, term2019212.getClass(), "subTypes", null);
        setField(term2019212, term2019212.getClass(), "templateTypeName", null);
        setField(term2019212, term2019212.getClass(), "className", null);
        setField(term2019212, term2019212.getClass(), "properties", null);
        setField(term2019212, term2019212.getClass(), "implicitPrototype", null);
        setBooleanField(term2019212, term2019212.getClass(), "nativeType", false);
        setBooleanField(term2019212, term2019212.getClass(), "visited", false);
        setField(term2019212, term2019212.getClass(), "docInfo", null);
        setBooleanField(term2019212, term2019212.getClass(), "unknown", false);
        setBooleanField(term2019212, term2019212.getClass(), "resolved", false);
        setField(term2019212, term2019212.getClass(), "resolveResult", null);
        setField(term2019212, term2019212.getClass(), "registry", null);
        setField(term2019208, term2019208.getClass(), "typeOfThis", term2019212);
        setField(term2019208, term2019208.getClass(), "source", null);
        setField(term2019208, term2019208.getClass(), "implementedInterfaces", null);
        setField(term2019208, term2019208.getClass(), "subTypes", null);
        setField(term2019208, term2019208.getClass(), "templateTypeName", null);
        setField(term2019208, term2019208.getClass(), "className", null);
        setField(term2019208, term2019208.getClass(), "properties", null);
        setField(term2019208, term2019208.getClass(), "implicitPrototype", null);
        setBooleanField(term2019208, term2019208.getClass(), "nativeType", false);
        setBooleanField(term2019208, term2019208.getClass(), "visited", false);
        setField(term2019208, term2019208.getClass(), "docInfo", null);
        setBooleanField(term2019208, term2019208.getClass(), "unknown", false);
        setBooleanField(term2019208, term2019208.getClass(), "resolved", false);
        setField(term2019208, term2019208.getClass(), "resolveResult", null);
        setField(term2019208, term2019208.getClass(), "registry", null);
        Class<? extends Object> term2020417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2020416 = ((Class) term2020417).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2020416).setAccessible(true);
        Object enum3762 = ((Field) term2020416).get((Object) null);
        term2019216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2019220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2019216, term2019216.getClass(), "this$0", null);
        setField(term2019216, term2019216.getClass(), "call", null);
        setField(term2019216, term2019216.getClass(), "prototype", null);
        setField(term2019216, term2019216.getClass(), "kind", enum3762);
        setField(term2019220, term2019220.getClass(), "call", null);
        setField(term2019220, term2019220.getClass(), "prototype", null);
        setField(term2019220, term2019220.getClass(), "kind", null);
        setField(term2019220, term2019220.getClass(), "typeOfThis", null);
        setField(term2019220, term2019220.getClass(), "source", null);
        setField(term2019220, term2019220.getClass(), "implementedInterfaces", null);
        setField(term2019220, term2019220.getClass(), "subTypes", null);
        setField(term2019220, term2019220.getClass(), "templateTypeName", null);
        setField(term2019220, term2019220.getClass(), "className", null);
        setField(term2019220, term2019220.getClass(), "properties", null);
        setField(term2019220, term2019220.getClass(), "implicitPrototype", null);
        setBooleanField(term2019220, term2019220.getClass(), "nativeType", false);
        setBooleanField(term2019220, term2019220.getClass(), "visited", false);
        setField(term2019220, term2019220.getClass(), "docInfo", null);
        setBooleanField(term2019220, term2019220.getClass(), "unknown", false);
        setBooleanField(term2019220, term2019220.getClass(), "resolved", false);
        setField(term2019220, term2019220.getClass(), "resolveResult", null);
        setField(term2019220, term2019220.getClass(), "registry", null);
        setField(term2019216, term2019216.getClass(), "typeOfThis", term2019220);
        setField(term2019216, term2019216.getClass(), "source", null);
        setField(term2019216, term2019216.getClass(), "implementedInterfaces", null);
        setField(term2019216, term2019216.getClass(), "subTypes", null);
        setField(term2019216, term2019216.getClass(), "templateTypeName", null);
        setField(term2019216, term2019216.getClass(), "className", null);
        setField(term2019216, term2019216.getClass(), "properties", null);
        setField(term2019216, term2019216.getClass(), "implicitPrototype", null);
        setBooleanField(term2019216, term2019216.getClass(), "nativeType", false);
        setBooleanField(term2019216, term2019216.getClass(), "visited", false);
        setField(term2019216, term2019216.getClass(), "docInfo", null);
        setBooleanField(term2019216, term2019216.getClass(), "unknown", false);
        setBooleanField(term2019216, term2019216.getClass(), "resolved", false);
        setField(term2019216, term2019216.getClass(), "resolveResult", null);
        setField(term2019216, term2019216.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2016362;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2015710, args);
        assertTrue(recursiveEquals(term2015710, term2019208));
        assertTrue(recursiveEquals(term2016362, term2019216));
        assertTrue(recursiveEquals(retValue, false));
    }

};


