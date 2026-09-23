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

public class FunctionType_isSubtype_21010021581051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1202206;
     Object term1202866;
     Object term1204216;
     Object term1204221;

    public FunctionType_isSubtype_21010021581051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1204231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1204230 = ((Class) term1204231).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1204230).setAccessible(true);
        Object enum2242 = ((Field) term1204230).get((Object) null);
        Class<? extends Object> term1204531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1204530 = ((Class) term1204531).getDeclaredField((String) "INTERFACE");
        ((Field) term1204530).setAccessible(true);
        Object enum2243 = ((Field) term1204530).get((Object) null);
        term1202206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1202758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1202206, term1202206.getClass(), "kind", enum2242);
        setField(term1202758, term1202758.getClass(), "kind", enum2243);
        setField(term1202206, term1202206.getClass(), "typeOfThis", term1202758);
        Class<? extends Object> term1204825 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1204824 = ((Class) term1204825).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1204824).setAccessible(true);
        Object enum2244 = ((Field) term1204824).get((Object) null);
        term1202866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1203196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1202866, term1202866.getClass(), "kind", enum2242);
        setField(term1203196, term1203196.getClass(), "kind", enum2244);
        setField(term1202866, term1202866.getClass(), "typeOfThis", term1203196);
        Class<? extends Object> term1205125 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1205124 = ((Class) term1205125).getDeclaredField((String) "INTERFACE");
        ((Field) term1205124).setAccessible(true);
        Object enum2245 = ((Field) term1205124).get((Object) null);
        term1204216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1204220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1204216, term1204216.getClass(), "call", null);
        setField(term1204216, term1204216.getClass(), "prototype", null);
        setField(term1204216, term1204216.getClass(), "kind", enum2245);
        setField(term1204220, term1204220.getClass(), "this$0", null);
        setField(term1204220, term1204220.getClass(), "call", null);
        setField(term1204220, term1204220.getClass(), "prototype", null);
        setField(term1204220, term1204220.getClass(), "kind", enum2245);
        setField(term1204220, term1204220.getClass(), "typeOfThis", null);
        setField(term1204220, term1204220.getClass(), "source", null);
        setField(term1204220, term1204220.getClass(), "implementedInterfaces", null);
        setField(term1204220, term1204220.getClass(), "subTypes", null);
        setField(term1204220, term1204220.getClass(), "templateTypeName", null);
        setField(term1204220, term1204220.getClass(), "className", null);
        setField(term1204220, term1204220.getClass(), "properties", null);
        setField(term1204220, term1204220.getClass(), "implicitPrototype", null);
        setBooleanField(term1204220, term1204220.getClass(), "nativeType", false);
        setBooleanField(term1204220, term1204220.getClass(), "visited", false);
        setField(term1204220, term1204220.getClass(), "docInfo", null);
        setBooleanField(term1204220, term1204220.getClass(), "unknown", false);
        setBooleanField(term1204220, term1204220.getClass(), "resolved", false);
        setField(term1204220, term1204220.getClass(), "resolveResult", null);
        setField(term1204220, term1204220.getClass(), "registry", null);
        setField(term1204216, term1204216.getClass(), "typeOfThis", term1204220);
        setField(term1204216, term1204216.getClass(), "source", null);
        setField(term1204216, term1204216.getClass(), "implementedInterfaces", null);
        setField(term1204216, term1204216.getClass(), "subTypes", null);
        setField(term1204216, term1204216.getClass(), "templateTypeName", null);
        setField(term1204216, term1204216.getClass(), "className", null);
        setField(term1204216, term1204216.getClass(), "properties", null);
        setField(term1204216, term1204216.getClass(), "implicitPrototype", null);
        setBooleanField(term1204216, term1204216.getClass(), "nativeType", false);
        setBooleanField(term1204216, term1204216.getClass(), "visited", false);
        setField(term1204216, term1204216.getClass(), "docInfo", null);
        setBooleanField(term1204216, term1204216.getClass(), "unknown", false);
        setBooleanField(term1204216, term1204216.getClass(), "resolved", false);
        setField(term1204216, term1204216.getClass(), "resolveResult", null);
        setField(term1204216, term1204216.getClass(), "registry", null);
        Class<? extends Object> term1205419 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1205418 = ((Class) term1205419).getDeclaredField((String) "INTERFACE");
        ((Field) term1205418).setAccessible(true);
        Object enum2246 = ((Field) term1205418).get((Object) null);
        Class<? extends Object> term1205713 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1205712 = ((Class) term1205713).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1205712).setAccessible(true);
        Object enum2247 = ((Field) term1205712).get((Object) null);
        term1204221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1204225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1204221, term1204221.getClass(), "this$0", null);
        setField(term1204221, term1204221.getClass(), "call", null);
        setField(term1204221, term1204221.getClass(), "prototype", null);
        setField(term1204221, term1204221.getClass(), "kind", enum2246);
        setField(term1204225, term1204225.getClass(), "this$0", null);
        setField(term1204225, term1204225.getClass(), "call", null);
        setField(term1204225, term1204225.getClass(), "prototype", null);
        setField(term1204225, term1204225.getClass(), "kind", enum2247);
        setField(term1204225, term1204225.getClass(), "typeOfThis", null);
        setField(term1204225, term1204225.getClass(), "source", null);
        setField(term1204225, term1204225.getClass(), "implementedInterfaces", null);
        setField(term1204225, term1204225.getClass(), "subTypes", null);
        setField(term1204225, term1204225.getClass(), "templateTypeName", null);
        setField(term1204225, term1204225.getClass(), "className", null);
        setField(term1204225, term1204225.getClass(), "properties", null);
        setField(term1204225, term1204225.getClass(), "implicitPrototype", null);
        setBooleanField(term1204225, term1204225.getClass(), "nativeType", false);
        setBooleanField(term1204225, term1204225.getClass(), "visited", false);
        setField(term1204225, term1204225.getClass(), "docInfo", null);
        setBooleanField(term1204225, term1204225.getClass(), "unknown", false);
        setBooleanField(term1204225, term1204225.getClass(), "resolved", false);
        setField(term1204225, term1204225.getClass(), "resolveResult", null);
        setField(term1204225, term1204225.getClass(), "registry", null);
        setField(term1204221, term1204221.getClass(), "typeOfThis", term1204225);
        setField(term1204221, term1204221.getClass(), "source", null);
        setField(term1204221, term1204221.getClass(), "implementedInterfaces", null);
        setField(term1204221, term1204221.getClass(), "subTypes", null);
        setField(term1204221, term1204221.getClass(), "templateTypeName", null);
        setField(term1204221, term1204221.getClass(), "className", null);
        setField(term1204221, term1204221.getClass(), "properties", null);
        setField(term1204221, term1204221.getClass(), "implicitPrototype", null);
        setBooleanField(term1204221, term1204221.getClass(), "nativeType", false);
        setBooleanField(term1204221, term1204221.getClass(), "visited", false);
        setField(term1204221, term1204221.getClass(), "docInfo", null);
        setBooleanField(term1204221, term1204221.getClass(), "unknown", false);
        setBooleanField(term1204221, term1204221.getClass(), "resolved", false);
        setField(term1204221, term1204221.getClass(), "resolveResult", null);
        setField(term1204221, term1204221.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1202866;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1202206, args);
        assertTrue(recursiveEquals(term1202206, term1204216));
        assertTrue(recursiveEquals(term1202866, term1204221));
        assertTrue(recursiveEquals(retValue, true));
    }

};


