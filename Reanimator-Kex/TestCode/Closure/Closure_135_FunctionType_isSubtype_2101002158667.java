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

public class FunctionType_isSubtype_2101002158667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596471;
     Object term597023;
     Object term597782;
     Object term597786;

    public FunctionType_isSubtype_2101002158667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term597791 = ((Class) term597792).getDeclaredField((String) "INTERFACE");
        ((Field) term597791).setAccessible(true);
        Object enum1106 = ((Field) term597791).get((Object) null);
        term596471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term596471, term596471.getClass(), "kind", enum1106);
        Class<? extends Object> term598086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term598085 = ((Class) term598086).getDeclaredField((String) "INTERFACE");
        ((Field) term598085).setAccessible(true);
        Object enum1107 = ((Field) term598085).get((Object) null);
        term597023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term597023, term597023.getClass(), "kind", enum1107);
        Class<? extends Object> term598380 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term598379 = ((Class) term598380).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term598379).setAccessible(true);
        Object enum1108 = ((Field) term598379).get((Object) null);
        term597782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term597782, term597782.getClass(), "this$0", null);
        setField(term597782, term597782.getClass(), "call", null);
        setField(term597782, term597782.getClass(), "prototype", null);
        setField(term597782, term597782.getClass(), "kind", enum1108);
        setField(term597782, term597782.getClass(), "typeOfThis", null);
        setField(term597782, term597782.getClass(), "source", null);
        setField(term597782, term597782.getClass(), "implementedInterfaces", null);
        setField(term597782, term597782.getClass(), "subTypes", null);
        setField(term597782, term597782.getClass(), "templateTypeName", null);
        setField(term597782, term597782.getClass(), "className", null);
        setField(term597782, term597782.getClass(), "properties", null);
        setField(term597782, term597782.getClass(), "implicitPrototype", null);
        setBooleanField(term597782, term597782.getClass(), "nativeType", false);
        setBooleanField(term597782, term597782.getClass(), "visited", false);
        setField(term597782, term597782.getClass(), "docInfo", null);
        setBooleanField(term597782, term597782.getClass(), "unknown", false);
        setBooleanField(term597782, term597782.getClass(), "resolved", false);
        setField(term597782, term597782.getClass(), "resolveResult", null);
        setField(term597782, term597782.getClass(), "registry", null);
        Class<? extends Object> term598680 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term598679 = ((Class) term598680).getDeclaredField((String) "INTERFACE");
        ((Field) term598679).setAccessible(true);
        Object enum1109 = ((Field) term598679).get((Object) null);
        term597786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term597786, term597786.getClass(), "this$0", null);
        setField(term597786, term597786.getClass(), "call", null);
        setField(term597786, term597786.getClass(), "prototype", null);
        setField(term597786, term597786.getClass(), "kind", enum1109);
        setField(term597786, term597786.getClass(), "typeOfThis", null);
        setField(term597786, term597786.getClass(), "source", null);
        setField(term597786, term597786.getClass(), "implementedInterfaces", null);
        setField(term597786, term597786.getClass(), "subTypes", null);
        setField(term597786, term597786.getClass(), "templateTypeName", null);
        setField(term597786, term597786.getClass(), "className", null);
        setField(term597786, term597786.getClass(), "properties", null);
        setField(term597786, term597786.getClass(), "implicitPrototype", null);
        setBooleanField(term597786, term597786.getClass(), "nativeType", false);
        setBooleanField(term597786, term597786.getClass(), "visited", false);
        setField(term597786, term597786.getClass(), "docInfo", null);
        setBooleanField(term597786, term597786.getClass(), "unknown", false);
        setBooleanField(term597786, term597786.getClass(), "resolved", false);
        setField(term597786, term597786.getClass(), "resolveResult", null);
        setField(term597786, term597786.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term597023;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term596471, args);
        assertTrue(recursiveEquals(term596471, term597782));
        assertTrue(recursiveEquals(term597023, term597786));
        assertTrue(recursiveEquals(retValue, true));
    }

};


