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

public class FunctionType_isSubtype_21010021581644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2212638;
     Object term2213398;
     Object term2216743;
     Object term2216749;

    public FunctionType_isSubtype_21010021581644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2216760 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2216759 = ((Class) term2216760).getDeclaredField((String) "INTERFACE");
        ((Field) term2216759).setAccessible(true);
        Object enum4132 = ((Field) term2216759).get((Object) null);
        term2212638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2213190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2213290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2212638, term2212638.getClass(), "kind", enum4132);
        setField(term2213190, term2213190.getClass(), "kind", enum4132);
        setField(term2213190, term2213190.getClass(), "typeOfThis", term2213290);
        setField(term2213190, term2213190.getClass(), "call", null);
        setField(term2212638, term2212638.getClass(), "typeOfThis", term2213190);
        Class<? extends Object> term2217054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2217053 = ((Class) term2217054).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2217053).setAccessible(true);
        Object enum4133 = ((Field) term2217053).get((Object) null);
        term2213398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2213728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2213822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2213398, term2213398.getClass(), "kind", enum4132);
        setField(term2213728, term2213728.getClass(), "kind", enum4133);
        setField(term2213728, term2213728.getClass(), "typeOfThis", null);
        setField(term2213728, term2213728.getClass(), "call", term2213822);
        setField(term2213398, term2213398.getClass(), "typeOfThis", term2213728);
        Class<? extends Object> term2217354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2217353 = ((Class) term2217354).getDeclaredField((String) "INTERFACE");
        ((Field) term2217353).setAccessible(true);
        Object enum4134 = ((Field) term2217353).get((Object) null);
        term2216743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2216747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2216748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2216743, term2216743.getClass(), "call", null);
        setField(term2216743, term2216743.getClass(), "prototype", null);
        setField(term2216743, term2216743.getClass(), "kind", enum4134);
        setField(term2216747, term2216747.getClass(), "this$0", null);
        setField(term2216747, term2216747.getClass(), "call", null);
        setField(term2216747, term2216747.getClass(), "prototype", null);
        setField(term2216747, term2216747.getClass(), "kind", enum4134);
        setField(term2216748, term2216748.getClass(), "call", null);
        setField(term2216748, term2216748.getClass(), "prototype", null);
        setField(term2216748, term2216748.getClass(), "kind", null);
        setField(term2216748, term2216748.getClass(), "typeOfThis", null);
        setField(term2216748, term2216748.getClass(), "source", null);
        setField(term2216748, term2216748.getClass(), "implementedInterfaces", null);
        setField(term2216748, term2216748.getClass(), "subTypes", null);
        setField(term2216748, term2216748.getClass(), "templateTypeName", null);
        setField(term2216748, term2216748.getClass(), "className", null);
        setField(term2216748, term2216748.getClass(), "properties", null);
        setField(term2216748, term2216748.getClass(), "implicitPrototype", null);
        setBooleanField(term2216748, term2216748.getClass(), "nativeType", false);
        setBooleanField(term2216748, term2216748.getClass(), "visited", false);
        setField(term2216748, term2216748.getClass(), "docInfo", null);
        setBooleanField(term2216748, term2216748.getClass(), "unknown", false);
        setBooleanField(term2216748, term2216748.getClass(), "resolved", false);
        setField(term2216748, term2216748.getClass(), "resolveResult", null);
        setField(term2216748, term2216748.getClass(), "registry", null);
        setField(term2216747, term2216747.getClass(), "typeOfThis", term2216748);
        setField(term2216747, term2216747.getClass(), "source", null);
        setField(term2216747, term2216747.getClass(), "implementedInterfaces", null);
        setField(term2216747, term2216747.getClass(), "subTypes", null);
        setField(term2216747, term2216747.getClass(), "templateTypeName", null);
        setField(term2216747, term2216747.getClass(), "className", null);
        setField(term2216747, term2216747.getClass(), "properties", null);
        setField(term2216747, term2216747.getClass(), "implicitPrototype", null);
        setBooleanField(term2216747, term2216747.getClass(), "nativeType", false);
        setBooleanField(term2216747, term2216747.getClass(), "visited", false);
        setField(term2216747, term2216747.getClass(), "docInfo", null);
        setBooleanField(term2216747, term2216747.getClass(), "unknown", false);
        setBooleanField(term2216747, term2216747.getClass(), "resolved", false);
        setField(term2216747, term2216747.getClass(), "resolveResult", null);
        setField(term2216747, term2216747.getClass(), "registry", null);
        setField(term2216743, term2216743.getClass(), "typeOfThis", term2216747);
        setField(term2216743, term2216743.getClass(), "source", null);
        setField(term2216743, term2216743.getClass(), "implementedInterfaces", null);
        setField(term2216743, term2216743.getClass(), "subTypes", null);
        setField(term2216743, term2216743.getClass(), "templateTypeName", null);
        setField(term2216743, term2216743.getClass(), "className", null);
        setField(term2216743, term2216743.getClass(), "properties", null);
        setField(term2216743, term2216743.getClass(), "implicitPrototype", null);
        setBooleanField(term2216743, term2216743.getClass(), "nativeType", false);
        setBooleanField(term2216743, term2216743.getClass(), "visited", false);
        setField(term2216743, term2216743.getClass(), "docInfo", null);
        setBooleanField(term2216743, term2216743.getClass(), "unknown", false);
        setBooleanField(term2216743, term2216743.getClass(), "resolved", false);
        setField(term2216743, term2216743.getClass(), "resolveResult", null);
        setField(term2216743, term2216743.getClass(), "registry", null);
        Class<? extends Object> term2217648 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2217647 = ((Class) term2217648).getDeclaredField((String) "INTERFACE");
        ((Field) term2217647).setAccessible(true);
        Object enum4135 = ((Field) term2217647).get((Object) null);
        Class<? extends Object> term2217942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2217941 = ((Class) term2217942).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2217941).setAccessible(true);
        Object enum4136 = ((Field) term2217941).get((Object) null);
        term2216749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2216753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2216754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2216749, term2216749.getClass(), "this$0", null);
        setField(term2216749, term2216749.getClass(), "call", null);
        setField(term2216749, term2216749.getClass(), "prototype", null);
        setField(term2216749, term2216749.getClass(), "kind", enum4135);
        setField(term2216753, term2216753.getClass(), "this$0", null);
        setField(term2216754, term2216754.getClass(), "parameters", null);
        setField(term2216754, term2216754.getClass(), "returnType", null);
        setBooleanField(term2216754, term2216754.getClass(), "resolved", false);
        setField(term2216754, term2216754.getClass(), "resolveResult", null);
        setField(term2216754, term2216754.getClass(), "registry", null);
        setField(term2216753, term2216753.getClass(), "call", term2216754);
        setField(term2216753, term2216753.getClass(), "prototype", null);
        setField(term2216753, term2216753.getClass(), "kind", enum4136);
        setField(term2216753, term2216753.getClass(), "typeOfThis", null);
        setField(term2216753, term2216753.getClass(), "source", null);
        setField(term2216753, term2216753.getClass(), "implementedInterfaces", null);
        setField(term2216753, term2216753.getClass(), "subTypes", null);
        setField(term2216753, term2216753.getClass(), "templateTypeName", null);
        setField(term2216753, term2216753.getClass(), "className", null);
        setField(term2216753, term2216753.getClass(), "properties", null);
        setField(term2216753, term2216753.getClass(), "implicitPrototype", null);
        setBooleanField(term2216753, term2216753.getClass(), "nativeType", false);
        setBooleanField(term2216753, term2216753.getClass(), "visited", false);
        setField(term2216753, term2216753.getClass(), "docInfo", null);
        setBooleanField(term2216753, term2216753.getClass(), "unknown", false);
        setBooleanField(term2216753, term2216753.getClass(), "resolved", false);
        setField(term2216753, term2216753.getClass(), "resolveResult", null);
        setField(term2216753, term2216753.getClass(), "registry", null);
        setField(term2216749, term2216749.getClass(), "typeOfThis", term2216753);
        setField(term2216749, term2216749.getClass(), "source", null);
        setField(term2216749, term2216749.getClass(), "implementedInterfaces", null);
        setField(term2216749, term2216749.getClass(), "subTypes", null);
        setField(term2216749, term2216749.getClass(), "templateTypeName", null);
        setField(term2216749, term2216749.getClass(), "className", null);
        setField(term2216749, term2216749.getClass(), "properties", null);
        setField(term2216749, term2216749.getClass(), "implicitPrototype", null);
        setBooleanField(term2216749, term2216749.getClass(), "nativeType", false);
        setBooleanField(term2216749, term2216749.getClass(), "visited", false);
        setField(term2216749, term2216749.getClass(), "docInfo", null);
        setBooleanField(term2216749, term2216749.getClass(), "unknown", false);
        setBooleanField(term2216749, term2216749.getClass(), "resolved", false);
        setField(term2216749, term2216749.getClass(), "resolveResult", null);
        setField(term2216749, term2216749.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2213398;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2212638, args);
        assertTrue(recursiveEquals(term2212638, term2216743));
        assertTrue(recursiveEquals(term2213398, term2216749));
        assertTrue(recursiveEquals(retValue, true));
    }

};


