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

public class FunctionType_isSubtype_21010021581385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1780968;
     Object term1781628;
     Object term1782819;
     Object term1782824;

    public FunctionType_isSubtype_21010021581385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1782831 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1782830 = ((Class) term1782831).getDeclaredField((String) "ORDINARY");
        ((Field) term1782830).setAccessible(true);
        Object enum3324 = ((Field) term1782830).get((Object) null);
        Class<? extends Object> term1783122 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1783121 = ((Class) term1783122).getDeclaredField((String) "INTERFACE");
        ((Field) term1783121).setAccessible(true);
        Object enum3325 = ((Field) term1783121).get((Object) null);
        term1780968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1781520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1780968, term1780968.getClass(), "kind", enum3324);
        setField(term1781520, term1781520.getClass(), "kind", enum3325);
        setField(term1780968, term1780968.getClass(), "typeOfThis", term1781520);
        Class<? extends Object> term1783416 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1783415 = ((Class) term1783416).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1783415).setAccessible(true);
        Object enum3326 = ((Field) term1783415).get((Object) null);
        term1781628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1781810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1781628, term1781628.getClass(), "kind", enum3326);
        setField(term1781628, term1781628.getClass(), "typeOfThis", term1781810);
        Class<? extends Object> term1783716 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1783715 = ((Class) term1783716).getDeclaredField((String) "INTERFACE");
        ((Field) term1783715).setAccessible(true);
        Object enum3327 = ((Field) term1783715).get((Object) null);
        term1782819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1782823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1782819, term1782819.getClass(), "this$0", null);
        setField(term1782819, term1782819.getClass(), "call", null);
        setField(term1782819, term1782819.getClass(), "prototype", null);
        setField(term1782819, term1782819.getClass(), "kind", enum3327);
        setField(term1782823, term1782823.getClass(), "this$0", null);
        setField(term1782823, term1782823.getClass(), "call", null);
        setField(term1782823, term1782823.getClass(), "prototype", null);
        setField(term1782823, term1782823.getClass(), "kind", enum3327);
        setField(term1782823, term1782823.getClass(), "typeOfThis", null);
        setField(term1782823, term1782823.getClass(), "source", null);
        setField(term1782823, term1782823.getClass(), "implementedInterfaces", null);
        setField(term1782823, term1782823.getClass(), "subTypes", null);
        setField(term1782823, term1782823.getClass(), "templateTypeName", null);
        setField(term1782823, term1782823.getClass(), "className", null);
        setField(term1782823, term1782823.getClass(), "properties", null);
        setField(term1782823, term1782823.getClass(), "implicitPrototype", null);
        setBooleanField(term1782823, term1782823.getClass(), "nativeType", false);
        setBooleanField(term1782823, term1782823.getClass(), "visited", false);
        setField(term1782823, term1782823.getClass(), "docInfo", null);
        setBooleanField(term1782823, term1782823.getClass(), "unknown", false);
        setBooleanField(term1782823, term1782823.getClass(), "resolved", false);
        setField(term1782823, term1782823.getClass(), "resolveResult", null);
        setField(term1782823, term1782823.getClass(), "registry", null);
        setField(term1782819, term1782819.getClass(), "typeOfThis", term1782823);
        setField(term1782819, term1782819.getClass(), "source", null);
        setField(term1782819, term1782819.getClass(), "implementedInterfaces", null);
        setField(term1782819, term1782819.getClass(), "subTypes", null);
        setField(term1782819, term1782819.getClass(), "templateTypeName", null);
        setField(term1782819, term1782819.getClass(), "className", null);
        setField(term1782819, term1782819.getClass(), "properties", null);
        setField(term1782819, term1782819.getClass(), "implicitPrototype", null);
        setBooleanField(term1782819, term1782819.getClass(), "nativeType", false);
        setBooleanField(term1782819, term1782819.getClass(), "visited", false);
        setField(term1782819, term1782819.getClass(), "docInfo", null);
        setBooleanField(term1782819, term1782819.getClass(), "unknown", false);
        setBooleanField(term1782819, term1782819.getClass(), "resolved", false);
        setField(term1782819, term1782819.getClass(), "resolveResult", null);
        setField(term1782819, term1782819.getClass(), "registry", null);
        Class<? extends Object> term1784010 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1784009 = ((Class) term1784010).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1784009).setAccessible(true);
        Object enum3328 = ((Field) term1784009).get((Object) null);
        term1782824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1782828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1782824, term1782824.getClass(), "this$0", null);
        setField(term1782824, term1782824.getClass(), "call", null);
        setField(term1782824, term1782824.getClass(), "prototype", null);
        setField(term1782824, term1782824.getClass(), "kind", enum3328);
        setField(term1782828, term1782828.getClass(), "this$0", null);
        setField(term1782828, term1782828.getClass(), "call", null);
        setField(term1782828, term1782828.getClass(), "prototype", null);
        setField(term1782828, term1782828.getClass(), "kind", null);
        setField(term1782828, term1782828.getClass(), "typeOfThis", null);
        setField(term1782828, term1782828.getClass(), "source", null);
        setField(term1782828, term1782828.getClass(), "implementedInterfaces", null);
        setField(term1782828, term1782828.getClass(), "subTypes", null);
        setField(term1782828, term1782828.getClass(), "templateTypeName", null);
        setField(term1782828, term1782828.getClass(), "className", null);
        setField(term1782828, term1782828.getClass(), "properties", null);
        setField(term1782828, term1782828.getClass(), "implicitPrototype", null);
        setBooleanField(term1782828, term1782828.getClass(), "nativeType", false);
        setBooleanField(term1782828, term1782828.getClass(), "visited", false);
        setField(term1782828, term1782828.getClass(), "docInfo", null);
        setBooleanField(term1782828, term1782828.getClass(), "unknown", false);
        setBooleanField(term1782828, term1782828.getClass(), "resolved", false);
        setField(term1782828, term1782828.getClass(), "resolveResult", null);
        setField(term1782828, term1782828.getClass(), "registry", null);
        setField(term1782824, term1782824.getClass(), "typeOfThis", term1782828);
        setField(term1782824, term1782824.getClass(), "source", null);
        setField(term1782824, term1782824.getClass(), "implementedInterfaces", null);
        setField(term1782824, term1782824.getClass(), "subTypes", null);
        setField(term1782824, term1782824.getClass(), "templateTypeName", null);
        setField(term1782824, term1782824.getClass(), "className", null);
        setField(term1782824, term1782824.getClass(), "properties", null);
        setField(term1782824, term1782824.getClass(), "implicitPrototype", null);
        setBooleanField(term1782824, term1782824.getClass(), "nativeType", false);
        setBooleanField(term1782824, term1782824.getClass(), "visited", false);
        setField(term1782824, term1782824.getClass(), "docInfo", null);
        setBooleanField(term1782824, term1782824.getClass(), "unknown", false);
        setBooleanField(term1782824, term1782824.getClass(), "resolved", false);
        setField(term1782824, term1782824.getClass(), "resolveResult", null);
        setField(term1782824, term1782824.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1781628;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1780968, args);
        assertTrue(recursiveEquals(term1780968, term1782819));
        assertTrue(recursiveEquals(term1781628, term1782824));
        assertTrue(recursiveEquals(retValue, false));
    }

};


