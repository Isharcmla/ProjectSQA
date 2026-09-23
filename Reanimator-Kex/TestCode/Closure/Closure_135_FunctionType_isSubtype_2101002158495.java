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

public class FunctionType_isSubtype_2101002158495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354291;
     Object term354741;
     Object term356639;
     Object term356645;

    public FunctionType_isSubtype_2101002158495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term356652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term356651 = ((Class) term356652).getDeclaredField((String) "ORDINARY");
        ((Field) term356651).setAccessible(true);
        Object enum649 = ((Field) term356651).get((Object) null);
        term354291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term354539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term354633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term354291, term354291.getClass(), "kind", enum649);
        setField(term354291, term354291.getClass(), "typeOfThis", term354539);
        setField(term354291, term354291.getClass(), "call", term354633);
        Class<? extends Object> term356943 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term356942 = ((Class) term356943).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term356942).setAccessible(true);
        Object enum650 = ((Field) term356942).get((Object) null);
        term354741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term354995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term354741, term354741.getClass(), "kind", enum650);
        setField(term354741, term354741.getClass(), "typeOfThis", term354995);
        setField(term354741, term354741.getClass(), "call", null);
        Class<? extends Object> term357243 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term357242 = ((Class) term357243).getDeclaredField((String) "ORDINARY");
        ((Field) term357242).setAccessible(true);
        Object enum651 = ((Field) term357242).get((Object) null);
        term356639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term356640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term356644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term356639, term356639.getClass(), "this$0", null);
        setField(term356640, term356640.getClass(), "parameters", null);
        setField(term356640, term356640.getClass(), "returnType", null);
        setBooleanField(term356640, term356640.getClass(), "resolved", false);
        setField(term356640, term356640.getClass(), "resolveResult", null);
        setField(term356640, term356640.getClass(), "registry", null);
        setField(term356639, term356639.getClass(), "call", term356640);
        setField(term356639, term356639.getClass(), "prototype", null);
        setField(term356639, term356639.getClass(), "kind", enum651);
        setField(term356644, term356644.getClass(), "call", null);
        setField(term356644, term356644.getClass(), "prototype", null);
        setField(term356644, term356644.getClass(), "kind", null);
        setField(term356644, term356644.getClass(), "typeOfThis", null);
        setField(term356644, term356644.getClass(), "source", null);
        setField(term356644, term356644.getClass(), "implementedInterfaces", null);
        setField(term356644, term356644.getClass(), "subTypes", null);
        setField(term356644, term356644.getClass(), "templateTypeName", null);
        setField(term356644, term356644.getClass(), "className", null);
        setField(term356644, term356644.getClass(), "properties", null);
        setField(term356644, term356644.getClass(), "implicitPrototype", null);
        setBooleanField(term356644, term356644.getClass(), "nativeType", false);
        setBooleanField(term356644, term356644.getClass(), "visited", false);
        setField(term356644, term356644.getClass(), "docInfo", null);
        setBooleanField(term356644, term356644.getClass(), "unknown", false);
        setBooleanField(term356644, term356644.getClass(), "resolved", false);
        setField(term356644, term356644.getClass(), "resolveResult", null);
        setField(term356644, term356644.getClass(), "registry", null);
        setField(term356639, term356639.getClass(), "typeOfThis", term356644);
        setField(term356639, term356639.getClass(), "source", null);
        setField(term356639, term356639.getClass(), "implementedInterfaces", null);
        setField(term356639, term356639.getClass(), "subTypes", null);
        setField(term356639, term356639.getClass(), "templateTypeName", null);
        setField(term356639, term356639.getClass(), "className", null);
        setField(term356639, term356639.getClass(), "properties", null);
        setField(term356639, term356639.getClass(), "implicitPrototype", null);
        setBooleanField(term356639, term356639.getClass(), "nativeType", false);
        setBooleanField(term356639, term356639.getClass(), "visited", false);
        setField(term356639, term356639.getClass(), "docInfo", null);
        setBooleanField(term356639, term356639.getClass(), "unknown", false);
        setBooleanField(term356639, term356639.getClass(), "resolved", false);
        setField(term356639, term356639.getClass(), "resolveResult", null);
        setField(term356639, term356639.getClass(), "registry", null);
        Class<? extends Object> term357534 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term357533 = ((Class) term357534).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term357533).setAccessible(true);
        Object enum652 = ((Field) term357533).get((Object) null);
        term356645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term356649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term356645, term356645.getClass(), "this$0", null);
        setField(term356645, term356645.getClass(), "call", null);
        setField(term356645, term356645.getClass(), "prototype", null);
        setField(term356645, term356645.getClass(), "kind", enum652);
        setField(term356649, term356649.getClass(), "referencedType", null);
        setBooleanField(term356649, term356649.getClass(), "visited", false);
        setField(term356649, term356649.getClass(), "docInfo", null);
        setBooleanField(term356649, term356649.getClass(), "unknown", false);
        setBooleanField(term356649, term356649.getClass(), "resolved", false);
        setField(term356649, term356649.getClass(), "resolveResult", null);
        setField(term356649, term356649.getClass(), "registry", null);
        setField(term356645, term356645.getClass(), "typeOfThis", term356649);
        setField(term356645, term356645.getClass(), "source", null);
        setField(term356645, term356645.getClass(), "implementedInterfaces", null);
        setField(term356645, term356645.getClass(), "subTypes", null);
        setField(term356645, term356645.getClass(), "templateTypeName", null);
        setField(term356645, term356645.getClass(), "className", null);
        setField(term356645, term356645.getClass(), "properties", null);
        setField(term356645, term356645.getClass(), "implicitPrototype", null);
        setBooleanField(term356645, term356645.getClass(), "nativeType", false);
        setBooleanField(term356645, term356645.getClass(), "visited", false);
        setField(term356645, term356645.getClass(), "docInfo", null);
        setBooleanField(term356645, term356645.getClass(), "unknown", false);
        setBooleanField(term356645, term356645.getClass(), "resolved", false);
        setField(term356645, term356645.getClass(), "resolveResult", null);
        setField(term356645, term356645.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term354741;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term354291, args);
        assertTrue(recursiveEquals(term354291, term356639));
        assertTrue(recursiveEquals(term354741, term356645));
        assertTrue(recursiveEquals(retValue, false));
    }

};


