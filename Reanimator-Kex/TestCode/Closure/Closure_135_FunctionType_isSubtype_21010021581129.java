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

public class FunctionType_isSubtype_21010021581129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1334738;
     Object term1335498;
     Object term1336635;
     Object term1336641;

    public FunctionType_isSubtype_21010021581129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1336649 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1336648 = ((Class) term1336649).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1336648).setAccessible(true);
        Object enum2497 = ((Field) term1336648).get((Object) null);
        term1334738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1335282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1335390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1334738, term1334738.getClass(), "kind", enum2497);
        setField(term1335282, term1335282.getClass(), "kind", enum2497);
        setField(term1335282, term1335282.getClass(), "typeOfThis", term1335390);
        setField(term1334738, term1334738.getClass(), "typeOfThis", term1335282);
        Class<? extends Object> term1336949 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1336948 = ((Class) term1336949).getDeclaredField((String) "INTERFACE");
        ((Field) term1336948).setAccessible(true);
        Object enum2498 = ((Field) term1336948).get((Object) null);
        term1335498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1335828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1335926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1335498, term1335498.getClass(), "kind", enum2497);
        setField(term1335828, term1335828.getClass(), "kind", enum2498);
        setField(term1335828, term1335828.getClass(), "typeOfThis", term1335926);
        setField(term1335498, term1335498.getClass(), "typeOfThis", term1335828);
        Class<? extends Object> term1337243 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1337242 = ((Class) term1337243).getDeclaredField((String) "INTERFACE");
        ((Field) term1337242).setAccessible(true);
        Object enum2499 = ((Field) term1337242).get((Object) null);
        term1336635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1336639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1336640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1336635, term1336635.getClass(), "this$0", null);
        setField(term1336635, term1336635.getClass(), "call", null);
        setField(term1336635, term1336635.getClass(), "prototype", null);
        setField(term1336635, term1336635.getClass(), "kind", enum2499);
        setField(term1336639, term1336639.getClass(), "call", null);
        setField(term1336639, term1336639.getClass(), "prototype", null);
        setField(term1336639, term1336639.getClass(), "kind", enum2499);
        setField(term1336640, term1336640.getClass(), "this$0", null);
        setField(term1336640, term1336640.getClass(), "call", null);
        setField(term1336640, term1336640.getClass(), "prototype", null);
        setField(term1336640, term1336640.getClass(), "kind", null);
        setField(term1336640, term1336640.getClass(), "typeOfThis", null);
        setField(term1336640, term1336640.getClass(), "source", null);
        setField(term1336640, term1336640.getClass(), "implementedInterfaces", null);
        setField(term1336640, term1336640.getClass(), "subTypes", null);
        setField(term1336640, term1336640.getClass(), "templateTypeName", null);
        setField(term1336640, term1336640.getClass(), "className", null);
        setField(term1336640, term1336640.getClass(), "properties", null);
        setField(term1336640, term1336640.getClass(), "implicitPrototype", null);
        setBooleanField(term1336640, term1336640.getClass(), "nativeType", false);
        setBooleanField(term1336640, term1336640.getClass(), "visited", false);
        setField(term1336640, term1336640.getClass(), "docInfo", null);
        setBooleanField(term1336640, term1336640.getClass(), "unknown", false);
        setBooleanField(term1336640, term1336640.getClass(), "resolved", false);
        setField(term1336640, term1336640.getClass(), "resolveResult", null);
        setField(term1336640, term1336640.getClass(), "registry", null);
        setField(term1336639, term1336639.getClass(), "typeOfThis", term1336640);
        setField(term1336639, term1336639.getClass(), "source", null);
        setField(term1336639, term1336639.getClass(), "implementedInterfaces", null);
        setField(term1336639, term1336639.getClass(), "subTypes", null);
        setField(term1336639, term1336639.getClass(), "templateTypeName", null);
        setField(term1336639, term1336639.getClass(), "className", null);
        setField(term1336639, term1336639.getClass(), "properties", null);
        setField(term1336639, term1336639.getClass(), "implicitPrototype", null);
        setBooleanField(term1336639, term1336639.getClass(), "nativeType", false);
        setBooleanField(term1336639, term1336639.getClass(), "visited", false);
        setField(term1336639, term1336639.getClass(), "docInfo", null);
        setBooleanField(term1336639, term1336639.getClass(), "unknown", false);
        setBooleanField(term1336639, term1336639.getClass(), "resolved", false);
        setField(term1336639, term1336639.getClass(), "resolveResult", null);
        setField(term1336639, term1336639.getClass(), "registry", null);
        setField(term1336635, term1336635.getClass(), "typeOfThis", term1336639);
        setField(term1336635, term1336635.getClass(), "source", null);
        setField(term1336635, term1336635.getClass(), "implementedInterfaces", null);
        setField(term1336635, term1336635.getClass(), "subTypes", null);
        setField(term1336635, term1336635.getClass(), "templateTypeName", null);
        setField(term1336635, term1336635.getClass(), "className", null);
        setField(term1336635, term1336635.getClass(), "properties", null);
        setField(term1336635, term1336635.getClass(), "implicitPrototype", null);
        setBooleanField(term1336635, term1336635.getClass(), "nativeType", false);
        setBooleanField(term1336635, term1336635.getClass(), "visited", false);
        setField(term1336635, term1336635.getClass(), "docInfo", null);
        setBooleanField(term1336635, term1336635.getClass(), "unknown", false);
        setBooleanField(term1336635, term1336635.getClass(), "resolved", false);
        setField(term1336635, term1336635.getClass(), "resolveResult", null);
        setField(term1336635, term1336635.getClass(), "registry", null);
        Class<? extends Object> term1337537 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1337536 = ((Class) term1337537).getDeclaredField((String) "INTERFACE");
        ((Field) term1337536).setAccessible(true);
        Object enum2500 = ((Field) term1337536).get((Object) null);
        term1336641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1336645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1336646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1336641, term1336641.getClass(), "this$0", null);
        setField(term1336641, term1336641.getClass(), "call", null);
        setField(term1336641, term1336641.getClass(), "prototype", null);
        setField(term1336641, term1336641.getClass(), "kind", enum2500);
        setField(term1336645, term1336645.getClass(), "this$0", null);
        setField(term1336645, term1336645.getClass(), "call", null);
        setField(term1336645, term1336645.getClass(), "prototype", null);
        setField(term1336645, term1336645.getClass(), "kind", enum2500);
        setField(term1336646, term1336646.getClass(), "indexType", null);
        setField(term1336646, term1336646.getClass(), "referencedType", null);
        setBooleanField(term1336646, term1336646.getClass(), "visited", false);
        setField(term1336646, term1336646.getClass(), "docInfo", null);
        setBooleanField(term1336646, term1336646.getClass(), "unknown", false);
        setBooleanField(term1336646, term1336646.getClass(), "resolved", false);
        setField(term1336646, term1336646.getClass(), "resolveResult", null);
        setField(term1336646, term1336646.getClass(), "registry", null);
        setField(term1336645, term1336645.getClass(), "typeOfThis", term1336646);
        setField(term1336645, term1336645.getClass(), "source", null);
        setField(term1336645, term1336645.getClass(), "implementedInterfaces", null);
        setField(term1336645, term1336645.getClass(), "subTypes", null);
        setField(term1336645, term1336645.getClass(), "templateTypeName", null);
        setField(term1336645, term1336645.getClass(), "className", null);
        setField(term1336645, term1336645.getClass(), "properties", null);
        setField(term1336645, term1336645.getClass(), "implicitPrototype", null);
        setBooleanField(term1336645, term1336645.getClass(), "nativeType", false);
        setBooleanField(term1336645, term1336645.getClass(), "visited", false);
        setField(term1336645, term1336645.getClass(), "docInfo", null);
        setBooleanField(term1336645, term1336645.getClass(), "unknown", false);
        setBooleanField(term1336645, term1336645.getClass(), "resolved", false);
        setField(term1336645, term1336645.getClass(), "resolveResult", null);
        setField(term1336645, term1336645.getClass(), "registry", null);
        setField(term1336641, term1336641.getClass(), "typeOfThis", term1336645);
        setField(term1336641, term1336641.getClass(), "source", null);
        setField(term1336641, term1336641.getClass(), "implementedInterfaces", null);
        setField(term1336641, term1336641.getClass(), "subTypes", null);
        setField(term1336641, term1336641.getClass(), "templateTypeName", null);
        setField(term1336641, term1336641.getClass(), "className", null);
        setField(term1336641, term1336641.getClass(), "properties", null);
        setField(term1336641, term1336641.getClass(), "implicitPrototype", null);
        setBooleanField(term1336641, term1336641.getClass(), "nativeType", false);
        setBooleanField(term1336641, term1336641.getClass(), "visited", false);
        setField(term1336641, term1336641.getClass(), "docInfo", null);
        setBooleanField(term1336641, term1336641.getClass(), "unknown", false);
        setBooleanField(term1336641, term1336641.getClass(), "resolved", false);
        setField(term1336641, term1336641.getClass(), "resolveResult", null);
        setField(term1336641, term1336641.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1335498;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1334738, args);
        assertTrue(recursiveEquals(term1334738, term1336635));
        assertTrue(recursiveEquals(term1335498, term1336641));
        assertTrue(recursiveEquals(retValue, true));
    }

};


