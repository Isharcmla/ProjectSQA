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

public class FunctionType_isSubtype_2101002158555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437151;
     Object term437803;
     Object term438411;
     Object term438416;

    public FunctionType_isSubtype_2101002158555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term438422 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term438421 = ((Class) term438422).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term438421).setAccessible(true);
        Object enum810 = ((Field) term438421).get((Object) null);
        term437151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term437695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term437151, term437151.getClass(), "kind", enum810);
        setField(term437151, term437151.getClass(), "typeOfThis", term437695);
        term437803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term437803, term437803.getClass(), "kind", enum810);
        setField(term437803, term437803.getClass(), "typeOfThis", null);
        Class<? extends Object> term438722 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term438721 = ((Class) term438722).getDeclaredField((String) "INTERFACE");
        ((Field) term438721).setAccessible(true);
        Object enum811 = ((Field) term438721).get((Object) null);
        term438411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term438415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term438411, term438411.getClass(), "this$0", null);
        setField(term438411, term438411.getClass(), "call", null);
        setField(term438411, term438411.getClass(), "prototype", null);
        setField(term438411, term438411.getClass(), "kind", enum811);
        setField(term438415, term438415.getClass(), "call", null);
        setField(term438415, term438415.getClass(), "prototype", null);
        setField(term438415, term438415.getClass(), "kind", null);
        setField(term438415, term438415.getClass(), "typeOfThis", null);
        setField(term438415, term438415.getClass(), "source", null);
        setField(term438415, term438415.getClass(), "implementedInterfaces", null);
        setField(term438415, term438415.getClass(), "subTypes", null);
        setField(term438415, term438415.getClass(), "templateTypeName", null);
        setField(term438415, term438415.getClass(), "className", null);
        setField(term438415, term438415.getClass(), "properties", null);
        setField(term438415, term438415.getClass(), "implicitPrototype", null);
        setBooleanField(term438415, term438415.getClass(), "nativeType", false);
        setBooleanField(term438415, term438415.getClass(), "visited", false);
        setField(term438415, term438415.getClass(), "docInfo", null);
        setBooleanField(term438415, term438415.getClass(), "unknown", false);
        setBooleanField(term438415, term438415.getClass(), "resolved", false);
        setField(term438415, term438415.getClass(), "resolveResult", null);
        setField(term438415, term438415.getClass(), "registry", null);
        setField(term438411, term438411.getClass(), "typeOfThis", term438415);
        setField(term438411, term438411.getClass(), "source", null);
        setField(term438411, term438411.getClass(), "implementedInterfaces", null);
        setField(term438411, term438411.getClass(), "subTypes", null);
        setField(term438411, term438411.getClass(), "templateTypeName", null);
        setField(term438411, term438411.getClass(), "className", null);
        setField(term438411, term438411.getClass(), "properties", null);
        setField(term438411, term438411.getClass(), "implicitPrototype", null);
        setBooleanField(term438411, term438411.getClass(), "nativeType", false);
        setBooleanField(term438411, term438411.getClass(), "visited", false);
        setField(term438411, term438411.getClass(), "docInfo", null);
        setBooleanField(term438411, term438411.getClass(), "unknown", false);
        setBooleanField(term438411, term438411.getClass(), "resolved", false);
        setField(term438411, term438411.getClass(), "resolveResult", null);
        setField(term438411, term438411.getClass(), "registry", null);
        Class<? extends Object> term439016 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term439015 = ((Class) term439016).getDeclaredField((String) "INTERFACE");
        ((Field) term439015).setAccessible(true);
        Object enum812 = ((Field) term439015).get((Object) null);
        term438416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term438416, term438416.getClass(), "this$0", null);
        setField(term438416, term438416.getClass(), "call", null);
        setField(term438416, term438416.getClass(), "prototype", null);
        setField(term438416, term438416.getClass(), "kind", enum812);
        setField(term438416, term438416.getClass(), "typeOfThis", null);
        setField(term438416, term438416.getClass(), "source", null);
        setField(term438416, term438416.getClass(), "implementedInterfaces", null);
        setField(term438416, term438416.getClass(), "subTypes", null);
        setField(term438416, term438416.getClass(), "templateTypeName", null);
        setField(term438416, term438416.getClass(), "className", null);
        setField(term438416, term438416.getClass(), "properties", null);
        setField(term438416, term438416.getClass(), "implicitPrototype", null);
        setBooleanField(term438416, term438416.getClass(), "nativeType", false);
        setBooleanField(term438416, term438416.getClass(), "visited", false);
        setField(term438416, term438416.getClass(), "docInfo", null);
        setBooleanField(term438416, term438416.getClass(), "unknown", false);
        setBooleanField(term438416, term438416.getClass(), "resolved", false);
        setField(term438416, term438416.getClass(), "resolveResult", null);
        setField(term438416, term438416.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term437803;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term437151, args);
        assertTrue(recursiveEquals(term437151, term438411));
        assertTrue(recursiveEquals(term437803, term438416));
        assertTrue(recursiveEquals(retValue, true));
    }

};


