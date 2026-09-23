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

public class FunctionType_isSubtype_2101002158813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818933;
     Object term819593;
     Object term820928;
     Object term820936;

    public FunctionType_isSubtype_2101002158813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term820943 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term820942 = ((Class) term820943).getDeclaredField((String) "ORDINARY");
        ((Field) term820942).setAccessible(true);
        Object enum1530 = ((Field) term820942).get((Object) null);
        Class<? extends Object> term821234 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term821233 = ((Class) term821234).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term821233).setAccessible(true);
        Object enum1531 = ((Field) term821233).get((Object) null);
        term818933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term819485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term818933, term818933.getClass(), "kind", enum1530);
        setField(term819485, term819485.getClass(), "kind", enum1531);
        setField(term818933, term818933.getClass(), "typeOfThis", term819485);
        Class<? extends Object> term821534 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term821533 = ((Class) term821534).getDeclaredField((String) "INTERFACE");
        ((Field) term821533).setAccessible(true);
        Object enum1532 = ((Field) term821533).get((Object) null);
        term819593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term819923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term819593, term819593.getClass(), "kind", enum1530);
        setField(term819923, term819923.getClass(), "kind", enum1532);
        setField(term819593, term819593.getClass(), "typeOfThis", term819923);
        Class<? extends Object> term821828 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term821827 = ((Class) term821828).getDeclaredField((String) "INTERFACE");
        ((Field) term821827).setAccessible(true);
        Object enum1533 = ((Field) term821827).get((Object) null);
        Class<? extends Object> term822122 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term822121 = ((Class) term822122).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term822121).setAccessible(true);
        Object enum1534 = ((Field) term822121).get((Object) null);
        term820928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term820932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term820928, term820928.getClass(), "call", null);
        setField(term820928, term820928.getClass(), "prototype", null);
        setField(term820928, term820928.getClass(), "kind", enum1533);
        setField(term820932, term820932.getClass(), "this$0", null);
        setField(term820932, term820932.getClass(), "call", null);
        setField(term820932, term820932.getClass(), "prototype", null);
        setField(term820932, term820932.getClass(), "kind", enum1534);
        setField(term820932, term820932.getClass(), "typeOfThis", null);
        setField(term820932, term820932.getClass(), "source", null);
        setField(term820932, term820932.getClass(), "implementedInterfaces", null);
        setField(term820932, term820932.getClass(), "subTypes", null);
        setField(term820932, term820932.getClass(), "templateTypeName", null);
        setField(term820932, term820932.getClass(), "className", null);
        setField(term820932, term820932.getClass(), "properties", null);
        setField(term820932, term820932.getClass(), "implicitPrototype", null);
        setBooleanField(term820932, term820932.getClass(), "nativeType", false);
        setBooleanField(term820932, term820932.getClass(), "visited", false);
        setField(term820932, term820932.getClass(), "docInfo", null);
        setBooleanField(term820932, term820932.getClass(), "unknown", false);
        setBooleanField(term820932, term820932.getClass(), "resolved", false);
        setField(term820932, term820932.getClass(), "resolveResult", null);
        setField(term820932, term820932.getClass(), "registry", null);
        setField(term820928, term820928.getClass(), "typeOfThis", term820932);
        setField(term820928, term820928.getClass(), "source", null);
        setField(term820928, term820928.getClass(), "implementedInterfaces", null);
        setField(term820928, term820928.getClass(), "subTypes", null);
        setField(term820928, term820928.getClass(), "templateTypeName", null);
        setField(term820928, term820928.getClass(), "className", null);
        setField(term820928, term820928.getClass(), "properties", null);
        setField(term820928, term820928.getClass(), "implicitPrototype", null);
        setBooleanField(term820928, term820928.getClass(), "nativeType", false);
        setBooleanField(term820928, term820928.getClass(), "visited", false);
        setField(term820928, term820928.getClass(), "docInfo", null);
        setBooleanField(term820928, term820928.getClass(), "unknown", false);
        setBooleanField(term820928, term820928.getClass(), "resolved", false);
        setField(term820928, term820928.getClass(), "resolveResult", null);
        setField(term820928, term820928.getClass(), "registry", null);
        Class<? extends Object> term822422 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term822421 = ((Class) term822422).getDeclaredField((String) "INTERFACE");
        ((Field) term822421).setAccessible(true);
        Object enum1535 = ((Field) term822421).get((Object) null);
        term820936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term820940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term820936, term820936.getClass(), "this$0", null);
        setField(term820936, term820936.getClass(), "call", null);
        setField(term820936, term820936.getClass(), "prototype", null);
        setField(term820936, term820936.getClass(), "kind", enum1535);
        setField(term820940, term820940.getClass(), "this$0", null);
        setField(term820940, term820940.getClass(), "call", null);
        setField(term820940, term820940.getClass(), "prototype", null);
        setField(term820940, term820940.getClass(), "kind", enum1535);
        setField(term820940, term820940.getClass(), "typeOfThis", null);
        setField(term820940, term820940.getClass(), "source", null);
        setField(term820940, term820940.getClass(), "implementedInterfaces", null);
        setField(term820940, term820940.getClass(), "subTypes", null);
        setField(term820940, term820940.getClass(), "templateTypeName", null);
        setField(term820940, term820940.getClass(), "className", null);
        setField(term820940, term820940.getClass(), "properties", null);
        setField(term820940, term820940.getClass(), "implicitPrototype", null);
        setBooleanField(term820940, term820940.getClass(), "nativeType", false);
        setBooleanField(term820940, term820940.getClass(), "visited", false);
        setField(term820940, term820940.getClass(), "docInfo", null);
        setBooleanField(term820940, term820940.getClass(), "unknown", false);
        setBooleanField(term820940, term820940.getClass(), "resolved", false);
        setField(term820940, term820940.getClass(), "resolveResult", null);
        setField(term820940, term820940.getClass(), "registry", null);
        setField(term820936, term820936.getClass(), "typeOfThis", term820940);
        setField(term820936, term820936.getClass(), "source", null);
        setField(term820936, term820936.getClass(), "implementedInterfaces", null);
        setField(term820936, term820936.getClass(), "subTypes", null);
        setField(term820936, term820936.getClass(), "templateTypeName", null);
        setField(term820936, term820936.getClass(), "className", null);
        setField(term820936, term820936.getClass(), "properties", null);
        setField(term820936, term820936.getClass(), "implicitPrototype", null);
        setBooleanField(term820936, term820936.getClass(), "nativeType", false);
        setBooleanField(term820936, term820936.getClass(), "visited", false);
        setField(term820936, term820936.getClass(), "docInfo", null);
        setBooleanField(term820936, term820936.getClass(), "unknown", false);
        setBooleanField(term820936, term820936.getClass(), "resolved", false);
        setField(term820936, term820936.getClass(), "resolveResult", null);
        setField(term820936, term820936.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term819593;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term818933, args);
        assertTrue(recursiveEquals(term818933, term820928));
        assertTrue(recursiveEquals(term819593, term820936));
        assertTrue(recursiveEquals(retValue, true));
    }

};


