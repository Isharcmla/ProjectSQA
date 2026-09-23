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

public class FunctionType_isSubtype_21010021581662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2245278;
     Object term2245930;
     Object term2246839;
     Object term2246847;

    public FunctionType_isSubtype_21010021581662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2246854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2246853 = ((Class) term2246854).getDeclaredField((String) "INTERFACE");
        ((Field) term2246853).setAccessible(true);
        Object enum4191 = ((Field) term2246853).get((Object) null);
        Class<? extends Object> term2247148 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2247147 = ((Class) term2247148).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2247147).setAccessible(true);
        Object enum4192 = ((Field) term2247147).get((Object) null);
        term2245278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2245822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2245278, term2245278.getClass(), "kind", enum4191);
        setField(term2245822, term2245822.getClass(), "kind", enum4192);
        setField(term2245278, term2245278.getClass(), "typeOfThis", term2245822);
        term2245930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2246112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2245930, term2245930.getClass(), "kind", enum4192);
        setField(term2246112, term2246112.getClass(), "kind", enum4192);
        setField(term2245930, term2245930.getClass(), "typeOfThis", term2246112);
        Class<? extends Object> term2247448 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2247447 = ((Class) term2247448).getDeclaredField((String) "INTERFACE");
        ((Field) term2247447).setAccessible(true);
        Object enum4193 = ((Field) term2247447).get((Object) null);
        Class<? extends Object> term2247742 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2247741 = ((Class) term2247742).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2247741).setAccessible(true);
        Object enum4194 = ((Field) term2247741).get((Object) null);
        term2246839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2246843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2246839, term2246839.getClass(), "this$0", null);
        setField(term2246839, term2246839.getClass(), "call", null);
        setField(term2246839, term2246839.getClass(), "prototype", null);
        setField(term2246839, term2246839.getClass(), "kind", enum4193);
        setField(term2246843, term2246843.getClass(), "call", null);
        setField(term2246843, term2246843.getClass(), "prototype", null);
        setField(term2246843, term2246843.getClass(), "kind", enum4194);
        setField(term2246843, term2246843.getClass(), "typeOfThis", null);
        setField(term2246843, term2246843.getClass(), "source", null);
        setField(term2246843, term2246843.getClass(), "implementedInterfaces", null);
        setField(term2246843, term2246843.getClass(), "subTypes", null);
        setField(term2246843, term2246843.getClass(), "templateTypeName", null);
        setField(term2246843, term2246843.getClass(), "className", null);
        setField(term2246843, term2246843.getClass(), "properties", null);
        setField(term2246843, term2246843.getClass(), "implicitPrototype", null);
        setBooleanField(term2246843, term2246843.getClass(), "nativeType", false);
        setBooleanField(term2246843, term2246843.getClass(), "visited", false);
        setField(term2246843, term2246843.getClass(), "docInfo", null);
        setBooleanField(term2246843, term2246843.getClass(), "unknown", false);
        setBooleanField(term2246843, term2246843.getClass(), "resolved", false);
        setField(term2246843, term2246843.getClass(), "resolveResult", null);
        setField(term2246843, term2246843.getClass(), "registry", null);
        setField(term2246839, term2246839.getClass(), "typeOfThis", term2246843);
        setField(term2246839, term2246839.getClass(), "source", null);
        setField(term2246839, term2246839.getClass(), "implementedInterfaces", null);
        setField(term2246839, term2246839.getClass(), "subTypes", null);
        setField(term2246839, term2246839.getClass(), "templateTypeName", null);
        setField(term2246839, term2246839.getClass(), "className", null);
        setField(term2246839, term2246839.getClass(), "properties", null);
        setField(term2246839, term2246839.getClass(), "implicitPrototype", null);
        setBooleanField(term2246839, term2246839.getClass(), "nativeType", false);
        setBooleanField(term2246839, term2246839.getClass(), "visited", false);
        setField(term2246839, term2246839.getClass(), "docInfo", null);
        setBooleanField(term2246839, term2246839.getClass(), "unknown", false);
        setBooleanField(term2246839, term2246839.getClass(), "resolved", false);
        setField(term2246839, term2246839.getClass(), "resolveResult", null);
        setField(term2246839, term2246839.getClass(), "registry", null);
        Class<? extends Object> term2248042 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2248041 = ((Class) term2248042).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2248041).setAccessible(true);
        Object enum4195 = ((Field) term2248041).get((Object) null);
        term2246847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2246851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2246847, term2246847.getClass(), "this$0", null);
        setField(term2246847, term2246847.getClass(), "call", null);
        setField(term2246847, term2246847.getClass(), "prototype", null);
        setField(term2246847, term2246847.getClass(), "kind", enum4195);
        setField(term2246851, term2246851.getClass(), "this$0", null);
        setField(term2246851, term2246851.getClass(), "call", null);
        setField(term2246851, term2246851.getClass(), "prototype", null);
        setField(term2246851, term2246851.getClass(), "kind", enum4195);
        setField(term2246851, term2246851.getClass(), "typeOfThis", null);
        setField(term2246851, term2246851.getClass(), "source", null);
        setField(term2246851, term2246851.getClass(), "implementedInterfaces", null);
        setField(term2246851, term2246851.getClass(), "subTypes", null);
        setField(term2246851, term2246851.getClass(), "templateTypeName", null);
        setField(term2246851, term2246851.getClass(), "className", null);
        setField(term2246851, term2246851.getClass(), "properties", null);
        setField(term2246851, term2246851.getClass(), "implicitPrototype", null);
        setBooleanField(term2246851, term2246851.getClass(), "nativeType", false);
        setBooleanField(term2246851, term2246851.getClass(), "visited", false);
        setField(term2246851, term2246851.getClass(), "docInfo", null);
        setBooleanField(term2246851, term2246851.getClass(), "unknown", false);
        setBooleanField(term2246851, term2246851.getClass(), "resolved", false);
        setField(term2246851, term2246851.getClass(), "resolveResult", null);
        setField(term2246851, term2246851.getClass(), "registry", null);
        setField(term2246847, term2246847.getClass(), "typeOfThis", term2246851);
        setField(term2246847, term2246847.getClass(), "source", null);
        setField(term2246847, term2246847.getClass(), "implementedInterfaces", null);
        setField(term2246847, term2246847.getClass(), "subTypes", null);
        setField(term2246847, term2246847.getClass(), "templateTypeName", null);
        setField(term2246847, term2246847.getClass(), "className", null);
        setField(term2246847, term2246847.getClass(), "properties", null);
        setField(term2246847, term2246847.getClass(), "implicitPrototype", null);
        setBooleanField(term2246847, term2246847.getClass(), "nativeType", false);
        setBooleanField(term2246847, term2246847.getClass(), "visited", false);
        setField(term2246847, term2246847.getClass(), "docInfo", null);
        setBooleanField(term2246847, term2246847.getClass(), "unknown", false);
        setBooleanField(term2246847, term2246847.getClass(), "resolved", false);
        setField(term2246847, term2246847.getClass(), "resolveResult", null);
        setField(term2246847, term2246847.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2245930;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2245278, args);
        assertTrue(recursiveEquals(term2245278, term2246839));
        assertTrue(recursiveEquals(term2245930, term2246847));
        assertTrue(recursiveEquals(retValue, false));
    }

};


