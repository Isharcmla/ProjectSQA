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

public class FunctionType_isSubtype_21010021581195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454200;
     Object term1454952;
     Object term1456088;
     Object term1456094;

    public FunctionType_isSubtype_21010021581195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1456105 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1456104 = ((Class) term1456105).getDeclaredField((String) "INTERFACE");
        ((Field) term1456104).setAccessible(true);
        Object enum2719 = ((Field) term1456104).get((Object) null);
        term1454200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1454744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1455332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1454200, term1454200.getClass(), "kind", enum2719);
        setField(term1454744, term1454744.getClass(), "kind", enum2719);
        setField(term1454744, term1454744.getClass(), "typeOfThis", term1455332);
        setField(term1454200, term1454200.getClass(), "typeOfThis", term1454744);
        Class<? extends Object> term1456399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1456398 = ((Class) term1456399).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1456398).setAccessible(true);
        Object enum2720 = ((Field) term1456398).get((Object) null);
        term1454952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1455134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1454952, term1454952.getClass(), "kind", enum2720);
        setField(term1455134, term1455134.getClass(), "kind", enum2719);
        setField(term1455134, term1455134.getClass(), "typeOfThis", term1455332);
        setField(term1454952, term1454952.getClass(), "typeOfThis", term1455134);
        Class<? extends Object> term1456699 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1456698 = ((Class) term1456699).getDeclaredField((String) "INTERFACE");
        ((Field) term1456698).setAccessible(true);
        Object enum2721 = ((Field) term1456698).get((Object) null);
        term1456088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1456092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1456093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1456088, term1456088.getClass(), "this$0", null);
        setField(term1456088, term1456088.getClass(), "call", null);
        setField(term1456088, term1456088.getClass(), "prototype", null);
        setField(term1456088, term1456088.getClass(), "kind", enum2721);
        setField(term1456092, term1456092.getClass(), "call", null);
        setField(term1456092, term1456092.getClass(), "prototype", null);
        setField(term1456092, term1456092.getClass(), "kind", enum2721);
        setField(term1456093, term1456093.getClass(), "call", null);
        setField(term1456093, term1456093.getClass(), "prototype", null);
        setField(term1456093, term1456093.getClass(), "kind", null);
        setField(term1456093, term1456093.getClass(), "typeOfThis", null);
        setField(term1456093, term1456093.getClass(), "source", null);
        setField(term1456093, term1456093.getClass(), "implementedInterfaces", null);
        setField(term1456093, term1456093.getClass(), "subTypes", null);
        setField(term1456093, term1456093.getClass(), "templateTypeName", null);
        setField(term1456093, term1456093.getClass(), "className", null);
        setField(term1456093, term1456093.getClass(), "properties", null);
        setField(term1456093, term1456093.getClass(), "implicitPrototype", null);
        setBooleanField(term1456093, term1456093.getClass(), "nativeType", false);
        setBooleanField(term1456093, term1456093.getClass(), "visited", false);
        setField(term1456093, term1456093.getClass(), "docInfo", null);
        setBooleanField(term1456093, term1456093.getClass(), "unknown", false);
        setBooleanField(term1456093, term1456093.getClass(), "resolved", false);
        setField(term1456093, term1456093.getClass(), "resolveResult", null);
        setField(term1456093, term1456093.getClass(), "registry", null);
        setField(term1456092, term1456092.getClass(), "typeOfThis", term1456093);
        setField(term1456092, term1456092.getClass(), "source", null);
        setField(term1456092, term1456092.getClass(), "implementedInterfaces", null);
        setField(term1456092, term1456092.getClass(), "subTypes", null);
        setField(term1456092, term1456092.getClass(), "templateTypeName", null);
        setField(term1456092, term1456092.getClass(), "className", null);
        setField(term1456092, term1456092.getClass(), "properties", null);
        setField(term1456092, term1456092.getClass(), "implicitPrototype", null);
        setBooleanField(term1456092, term1456092.getClass(), "nativeType", false);
        setBooleanField(term1456092, term1456092.getClass(), "visited", false);
        setField(term1456092, term1456092.getClass(), "docInfo", null);
        setBooleanField(term1456092, term1456092.getClass(), "unknown", false);
        setBooleanField(term1456092, term1456092.getClass(), "resolved", false);
        setField(term1456092, term1456092.getClass(), "resolveResult", null);
        setField(term1456092, term1456092.getClass(), "registry", null);
        setField(term1456088, term1456088.getClass(), "typeOfThis", term1456092);
        setField(term1456088, term1456088.getClass(), "source", null);
        setField(term1456088, term1456088.getClass(), "implementedInterfaces", null);
        setField(term1456088, term1456088.getClass(), "subTypes", null);
        setField(term1456088, term1456088.getClass(), "templateTypeName", null);
        setField(term1456088, term1456088.getClass(), "className", null);
        setField(term1456088, term1456088.getClass(), "properties", null);
        setField(term1456088, term1456088.getClass(), "implicitPrototype", null);
        setBooleanField(term1456088, term1456088.getClass(), "nativeType", false);
        setBooleanField(term1456088, term1456088.getClass(), "visited", false);
        setField(term1456088, term1456088.getClass(), "docInfo", null);
        setBooleanField(term1456088, term1456088.getClass(), "unknown", false);
        setBooleanField(term1456088, term1456088.getClass(), "resolved", false);
        setField(term1456088, term1456088.getClass(), "resolveResult", null);
        setField(term1456088, term1456088.getClass(), "registry", null);
        Class<? extends Object> term1456998 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1456997 = ((Class) term1456998).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1456997).setAccessible(true);
        Object enum2722 = ((Field) term1456997).get((Object) null);
        Class<? extends Object> term1457298 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1457297 = ((Class) term1457298).getDeclaredField((String) "INTERFACE");
        ((Field) term1457297).setAccessible(true);
        Object enum2723 = ((Field) term1457297).get((Object) null);
        term1456094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1456098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1456102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1456094, term1456094.getClass(), "this$0", null);
        setField(term1456094, term1456094.getClass(), "call", null);
        setField(term1456094, term1456094.getClass(), "prototype", null);
        setField(term1456094, term1456094.getClass(), "kind", enum2722);
        setField(term1456098, term1456098.getClass(), "this$0", null);
        setField(term1456098, term1456098.getClass(), "call", null);
        setField(term1456098, term1456098.getClass(), "prototype", null);
        setField(term1456098, term1456098.getClass(), "kind", enum2723);
        setField(term1456102, term1456102.getClass(), "call", null);
        setField(term1456102, term1456102.getClass(), "prototype", null);
        setField(term1456102, term1456102.getClass(), "kind", null);
        setField(term1456102, term1456102.getClass(), "typeOfThis", null);
        setField(term1456102, term1456102.getClass(), "source", null);
        setField(term1456102, term1456102.getClass(), "implementedInterfaces", null);
        setField(term1456102, term1456102.getClass(), "subTypes", null);
        setField(term1456102, term1456102.getClass(), "templateTypeName", null);
        setField(term1456102, term1456102.getClass(), "className", null);
        setField(term1456102, term1456102.getClass(), "properties", null);
        setField(term1456102, term1456102.getClass(), "implicitPrototype", null);
        setBooleanField(term1456102, term1456102.getClass(), "nativeType", false);
        setBooleanField(term1456102, term1456102.getClass(), "visited", false);
        setField(term1456102, term1456102.getClass(), "docInfo", null);
        setBooleanField(term1456102, term1456102.getClass(), "unknown", false);
        setBooleanField(term1456102, term1456102.getClass(), "resolved", false);
        setField(term1456102, term1456102.getClass(), "resolveResult", null);
        setField(term1456102, term1456102.getClass(), "registry", null);
        setField(term1456098, term1456098.getClass(), "typeOfThis", term1456102);
        setField(term1456098, term1456098.getClass(), "source", null);
        setField(term1456098, term1456098.getClass(), "implementedInterfaces", null);
        setField(term1456098, term1456098.getClass(), "subTypes", null);
        setField(term1456098, term1456098.getClass(), "templateTypeName", null);
        setField(term1456098, term1456098.getClass(), "className", null);
        setField(term1456098, term1456098.getClass(), "properties", null);
        setField(term1456098, term1456098.getClass(), "implicitPrototype", null);
        setBooleanField(term1456098, term1456098.getClass(), "nativeType", false);
        setBooleanField(term1456098, term1456098.getClass(), "visited", false);
        setField(term1456098, term1456098.getClass(), "docInfo", null);
        setBooleanField(term1456098, term1456098.getClass(), "unknown", false);
        setBooleanField(term1456098, term1456098.getClass(), "resolved", false);
        setField(term1456098, term1456098.getClass(), "resolveResult", null);
        setField(term1456098, term1456098.getClass(), "registry", null);
        setField(term1456094, term1456094.getClass(), "typeOfThis", term1456098);
        setField(term1456094, term1456094.getClass(), "source", null);
        setField(term1456094, term1456094.getClass(), "implementedInterfaces", null);
        setField(term1456094, term1456094.getClass(), "subTypes", null);
        setField(term1456094, term1456094.getClass(), "templateTypeName", null);
        setField(term1456094, term1456094.getClass(), "className", null);
        setField(term1456094, term1456094.getClass(), "properties", null);
        setField(term1456094, term1456094.getClass(), "implicitPrototype", null);
        setBooleanField(term1456094, term1456094.getClass(), "nativeType", false);
        setBooleanField(term1456094, term1456094.getClass(), "visited", false);
        setField(term1456094, term1456094.getClass(), "docInfo", null);
        setBooleanField(term1456094, term1456094.getClass(), "unknown", false);
        setBooleanField(term1456094, term1456094.getClass(), "resolved", false);
        setField(term1456094, term1456094.getClass(), "resolveResult", null);
        setField(term1456094, term1456094.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1454952;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1454200, args);
        assertTrue(recursiveEquals(term1454200, term1456088));
        assertTrue(recursiveEquals(term1454952, term1456094));
        assertTrue(recursiveEquals(retValue, false));
    }

};


