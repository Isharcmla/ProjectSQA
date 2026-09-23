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

public class FunctionType_isSubtype_21010021581273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1587974;
     Object term1588572;
     Object term1589753;
     Object term1589762;

    public FunctionType_isSubtype_21010021581273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1589770 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1589769 = ((Class) term1589770).getDeclaredField((String) "ORDINARY");
        ((Field) term1589769).setAccessible(true);
        Object enum2963 = ((Field) term1589769).get((Object) null);
        Class<? extends Object> term1590061 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1590060 = ((Class) term1590061).getDeclaredField((String) "INTERFACE");
        ((Field) term1590060).setAccessible(true);
        Object enum2964 = ((Field) term1590060).get((Object) null);
        term1587974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1588222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1588464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1587974, term1587974.getClass(), "kind", enum2963);
        setField(term1588222, term1588222.getClass(), "kind", enum2964);
        setField(term1587974, term1587974.getClass(), "typeOfThis", term1588222);
        setField(term1587974, term1587974.getClass(), "call", term1588464);
        term1588572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1588754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1588848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1588572, term1588572.getClass(), "kind", enum2963);
        setField(term1588754, term1588754.getClass(), "kind", enum2963);
        setField(term1588572, term1588572.getClass(), "typeOfThis", term1588754);
        setField(term1588572, term1588572.getClass(), "call", term1588848);
        Class<? extends Object> term1590355 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1590354 = ((Class) term1590355).getDeclaredField((String) "ORDINARY");
        ((Field) term1590354).setAccessible(true);
        Object enum2965 = ((Field) term1590354).get((Object) null);
        Class<? extends Object> term1590646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1590645 = ((Class) term1590646).getDeclaredField((String) "INTERFACE");
        ((Field) term1590645).setAccessible(true);
        Object enum2966 = ((Field) term1590645).get((Object) null);
        term1589753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1589754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1589758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1589753, term1589753.getClass(), "this$0", null);
        setField(term1589754, term1589754.getClass(), "parameters", null);
        setField(term1589754, term1589754.getClass(), "returnType", null);
        setBooleanField(term1589754, term1589754.getClass(), "resolved", false);
        setField(term1589754, term1589754.getClass(), "resolveResult", null);
        setField(term1589754, term1589754.getClass(), "registry", null);
        setField(term1589753, term1589753.getClass(), "call", term1589754);
        setField(term1589753, term1589753.getClass(), "prototype", null);
        setField(term1589753, term1589753.getClass(), "kind", enum2965);
        setField(term1589758, term1589758.getClass(), "call", null);
        setField(term1589758, term1589758.getClass(), "prototype", null);
        setField(term1589758, term1589758.getClass(), "kind", enum2966);
        setField(term1589758, term1589758.getClass(), "typeOfThis", null);
        setField(term1589758, term1589758.getClass(), "source", null);
        setField(term1589758, term1589758.getClass(), "implementedInterfaces", null);
        setField(term1589758, term1589758.getClass(), "subTypes", null);
        setField(term1589758, term1589758.getClass(), "templateTypeName", null);
        setField(term1589758, term1589758.getClass(), "className", null);
        setField(term1589758, term1589758.getClass(), "properties", null);
        setField(term1589758, term1589758.getClass(), "implicitPrototype", null);
        setBooleanField(term1589758, term1589758.getClass(), "nativeType", false);
        setBooleanField(term1589758, term1589758.getClass(), "visited", false);
        setField(term1589758, term1589758.getClass(), "docInfo", null);
        setBooleanField(term1589758, term1589758.getClass(), "unknown", false);
        setBooleanField(term1589758, term1589758.getClass(), "resolved", false);
        setField(term1589758, term1589758.getClass(), "resolveResult", null);
        setField(term1589758, term1589758.getClass(), "registry", null);
        setField(term1589753, term1589753.getClass(), "typeOfThis", term1589758);
        setField(term1589753, term1589753.getClass(), "source", null);
        setField(term1589753, term1589753.getClass(), "implementedInterfaces", null);
        setField(term1589753, term1589753.getClass(), "subTypes", null);
        setField(term1589753, term1589753.getClass(), "templateTypeName", null);
        setField(term1589753, term1589753.getClass(), "className", null);
        setField(term1589753, term1589753.getClass(), "properties", null);
        setField(term1589753, term1589753.getClass(), "implicitPrototype", null);
        setBooleanField(term1589753, term1589753.getClass(), "nativeType", false);
        setBooleanField(term1589753, term1589753.getClass(), "visited", false);
        setField(term1589753, term1589753.getClass(), "docInfo", null);
        setBooleanField(term1589753, term1589753.getClass(), "unknown", false);
        setBooleanField(term1589753, term1589753.getClass(), "resolved", false);
        setField(term1589753, term1589753.getClass(), "resolveResult", null);
        setField(term1589753, term1589753.getClass(), "registry", null);
        Class<? extends Object> term1590940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1590939 = ((Class) term1590940).getDeclaredField((String) "ORDINARY");
        ((Field) term1590939).setAccessible(true);
        Object enum2967 = ((Field) term1590939).get((Object) null);
        term1589762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1589763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1589767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1589762, term1589762.getClass(), "this$0", null);
        setField(term1589763, term1589763.getClass(), "parameters", null);
        setField(term1589763, term1589763.getClass(), "returnType", null);
        setBooleanField(term1589763, term1589763.getClass(), "resolved", false);
        setField(term1589763, term1589763.getClass(), "resolveResult", null);
        setField(term1589763, term1589763.getClass(), "registry", null);
        setField(term1589762, term1589762.getClass(), "call", term1589763);
        setField(term1589762, term1589762.getClass(), "prototype", null);
        setField(term1589762, term1589762.getClass(), "kind", enum2967);
        setField(term1589767, term1589767.getClass(), "this$0", null);
        setField(term1589767, term1589767.getClass(), "call", null);
        setField(term1589767, term1589767.getClass(), "prototype", null);
        setField(term1589767, term1589767.getClass(), "kind", enum2967);
        setField(term1589767, term1589767.getClass(), "typeOfThis", null);
        setField(term1589767, term1589767.getClass(), "source", null);
        setField(term1589767, term1589767.getClass(), "implementedInterfaces", null);
        setField(term1589767, term1589767.getClass(), "subTypes", null);
        setField(term1589767, term1589767.getClass(), "templateTypeName", null);
        setField(term1589767, term1589767.getClass(), "className", null);
        setField(term1589767, term1589767.getClass(), "properties", null);
        setField(term1589767, term1589767.getClass(), "implicitPrototype", null);
        setBooleanField(term1589767, term1589767.getClass(), "nativeType", false);
        setBooleanField(term1589767, term1589767.getClass(), "visited", false);
        setField(term1589767, term1589767.getClass(), "docInfo", null);
        setBooleanField(term1589767, term1589767.getClass(), "unknown", false);
        setBooleanField(term1589767, term1589767.getClass(), "resolved", false);
        setField(term1589767, term1589767.getClass(), "resolveResult", null);
        setField(term1589767, term1589767.getClass(), "registry", null);
        setField(term1589762, term1589762.getClass(), "typeOfThis", term1589767);
        setField(term1589762, term1589762.getClass(), "source", null);
        setField(term1589762, term1589762.getClass(), "implementedInterfaces", null);
        setField(term1589762, term1589762.getClass(), "subTypes", null);
        setField(term1589762, term1589762.getClass(), "templateTypeName", null);
        setField(term1589762, term1589762.getClass(), "className", null);
        setField(term1589762, term1589762.getClass(), "properties", null);
        setField(term1589762, term1589762.getClass(), "implicitPrototype", null);
        setBooleanField(term1589762, term1589762.getClass(), "nativeType", false);
        setBooleanField(term1589762, term1589762.getClass(), "visited", false);
        setField(term1589762, term1589762.getClass(), "docInfo", null);
        setBooleanField(term1589762, term1589762.getClass(), "unknown", false);
        setBooleanField(term1589762, term1589762.getClass(), "resolved", false);
        setField(term1589762, term1589762.getClass(), "resolveResult", null);
        setField(term1589762, term1589762.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1588572;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1587974, args);
        assertTrue(recursiveEquals(term1587974, term1589753));
        assertTrue(recursiveEquals(term1588572, term1589762));
        assertTrue(recursiveEquals(retValue, true));
    }

};


