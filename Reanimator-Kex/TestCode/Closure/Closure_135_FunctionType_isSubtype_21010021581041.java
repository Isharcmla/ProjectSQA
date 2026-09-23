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

public class FunctionType_isSubtype_21010021581041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188286;
     Object term1188884;
     Object term1190371;
     Object term1190380;

    public FunctionType_isSubtype_21010021581041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1190390 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1190389 = ((Class) term1190390).getDeclaredField((String) "ORDINARY");
        ((Field) term1190389).setAccessible(true);
        Object enum2216 = ((Field) term1190389).get((Object) null);
        Class<? extends Object> term1190681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1190680 = ((Class) term1190681).getDeclaredField((String) "INTERFACE");
        ((Field) term1190680).setAccessible(true);
        Object enum2217 = ((Field) term1190680).get((Object) null);
        term1188286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1188534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1188776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1188286, term1188286.getClass(), "kind", enum2216);
        setField(term1188534, term1188534.getClass(), "kind", enum2217);
        setField(term1188286, term1188286.getClass(), "typeOfThis", term1188534);
        setField(term1188286, term1188286.getClass(), "call", term1188776);
        Class<? extends Object> term1190975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1190974 = ((Class) term1190975).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1190974).setAccessible(true);
        Object enum2218 = ((Field) term1190974).get((Object) null);
        term1188884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1189140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1188884, term1188884.getClass(), "kind", enum2218);
        setField(term1189140, term1189140.getClass(), "kind", enum2216);
        setField(term1188884, term1188884.getClass(), "typeOfThis", term1189140);
        setField(term1188884, term1188884.getClass(), "call", null);
        Class<? extends Object> term1191275 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1191274 = ((Class) term1191275).getDeclaredField((String) "ORDINARY");
        ((Field) term1191274).setAccessible(true);
        Object enum2219 = ((Field) term1191274).get((Object) null);
        Class<? extends Object> term1191566 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1191565 = ((Class) term1191566).getDeclaredField((String) "INTERFACE");
        ((Field) term1191565).setAccessible(true);
        Object enum2220 = ((Field) term1191565).get((Object) null);
        term1190371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1190372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1190376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1190371, term1190371.getClass(), "this$0", null);
        setField(term1190372, term1190372.getClass(), "parameters", null);
        setField(term1190372, term1190372.getClass(), "returnType", null);
        setBooleanField(term1190372, term1190372.getClass(), "resolved", false);
        setField(term1190372, term1190372.getClass(), "resolveResult", null);
        setField(term1190372, term1190372.getClass(), "registry", null);
        setField(term1190371, term1190371.getClass(), "call", term1190372);
        setField(term1190371, term1190371.getClass(), "prototype", null);
        setField(term1190371, term1190371.getClass(), "kind", enum2219);
        setField(term1190376, term1190376.getClass(), "call", null);
        setField(term1190376, term1190376.getClass(), "prototype", null);
        setField(term1190376, term1190376.getClass(), "kind", enum2220);
        setField(term1190376, term1190376.getClass(), "typeOfThis", null);
        setField(term1190376, term1190376.getClass(), "source", null);
        setField(term1190376, term1190376.getClass(), "implementedInterfaces", null);
        setField(term1190376, term1190376.getClass(), "subTypes", null);
        setField(term1190376, term1190376.getClass(), "templateTypeName", null);
        setField(term1190376, term1190376.getClass(), "className", null);
        setField(term1190376, term1190376.getClass(), "properties", null);
        setField(term1190376, term1190376.getClass(), "implicitPrototype", null);
        setBooleanField(term1190376, term1190376.getClass(), "nativeType", false);
        setBooleanField(term1190376, term1190376.getClass(), "visited", false);
        setField(term1190376, term1190376.getClass(), "docInfo", null);
        setBooleanField(term1190376, term1190376.getClass(), "unknown", false);
        setBooleanField(term1190376, term1190376.getClass(), "resolved", false);
        setField(term1190376, term1190376.getClass(), "resolveResult", null);
        setField(term1190376, term1190376.getClass(), "registry", null);
        setField(term1190371, term1190371.getClass(), "typeOfThis", term1190376);
        setField(term1190371, term1190371.getClass(), "source", null);
        setField(term1190371, term1190371.getClass(), "implementedInterfaces", null);
        setField(term1190371, term1190371.getClass(), "subTypes", null);
        setField(term1190371, term1190371.getClass(), "templateTypeName", null);
        setField(term1190371, term1190371.getClass(), "className", null);
        setField(term1190371, term1190371.getClass(), "properties", null);
        setField(term1190371, term1190371.getClass(), "implicitPrototype", null);
        setBooleanField(term1190371, term1190371.getClass(), "nativeType", false);
        setBooleanField(term1190371, term1190371.getClass(), "visited", false);
        setField(term1190371, term1190371.getClass(), "docInfo", null);
        setBooleanField(term1190371, term1190371.getClass(), "unknown", false);
        setBooleanField(term1190371, term1190371.getClass(), "resolved", false);
        setField(term1190371, term1190371.getClass(), "resolveResult", null);
        setField(term1190371, term1190371.getClass(), "registry", null);
        Class<? extends Object> term1191860 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1191859 = ((Class) term1191860).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1191859).setAccessible(true);
        Object enum2221 = ((Field) term1191859).get((Object) null);
        Class<? extends Object> term1192160 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1192159 = ((Class) term1192160).getDeclaredField((String) "ORDINARY");
        ((Field) term1192159).setAccessible(true);
        Object enum2222 = ((Field) term1192159).get((Object) null);
        term1190380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1190384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1190380, term1190380.getClass(), "this$0", null);
        setField(term1190380, term1190380.getClass(), "call", null);
        setField(term1190380, term1190380.getClass(), "prototype", null);
        setField(term1190380, term1190380.getClass(), "kind", enum2221);
        setField(term1190384, term1190384.getClass(), "this$0", null);
        setField(term1190384, term1190384.getClass(), "call", null);
        setField(term1190384, term1190384.getClass(), "prototype", null);
        setField(term1190384, term1190384.getClass(), "kind", enum2222);
        setField(term1190384, term1190384.getClass(), "typeOfThis", null);
        setField(term1190384, term1190384.getClass(), "source", null);
        setField(term1190384, term1190384.getClass(), "implementedInterfaces", null);
        setField(term1190384, term1190384.getClass(), "subTypes", null);
        setField(term1190384, term1190384.getClass(), "templateTypeName", null);
        setField(term1190384, term1190384.getClass(), "className", null);
        setField(term1190384, term1190384.getClass(), "properties", null);
        setField(term1190384, term1190384.getClass(), "implicitPrototype", null);
        setBooleanField(term1190384, term1190384.getClass(), "nativeType", false);
        setBooleanField(term1190384, term1190384.getClass(), "visited", false);
        setField(term1190384, term1190384.getClass(), "docInfo", null);
        setBooleanField(term1190384, term1190384.getClass(), "unknown", false);
        setBooleanField(term1190384, term1190384.getClass(), "resolved", false);
        setField(term1190384, term1190384.getClass(), "resolveResult", null);
        setField(term1190384, term1190384.getClass(), "registry", null);
        setField(term1190380, term1190380.getClass(), "typeOfThis", term1190384);
        setField(term1190380, term1190380.getClass(), "source", null);
        setField(term1190380, term1190380.getClass(), "implementedInterfaces", null);
        setField(term1190380, term1190380.getClass(), "subTypes", null);
        setField(term1190380, term1190380.getClass(), "templateTypeName", null);
        setField(term1190380, term1190380.getClass(), "className", null);
        setField(term1190380, term1190380.getClass(), "properties", null);
        setField(term1190380, term1190380.getClass(), "implicitPrototype", null);
        setBooleanField(term1190380, term1190380.getClass(), "nativeType", false);
        setBooleanField(term1190380, term1190380.getClass(), "visited", false);
        setField(term1190380, term1190380.getClass(), "docInfo", null);
        setBooleanField(term1190380, term1190380.getClass(), "unknown", false);
        setBooleanField(term1190380, term1190380.getClass(), "resolved", false);
        setField(term1190380, term1190380.getClass(), "resolveResult", null);
        setField(term1190380, term1190380.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1188884;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1188286, args);
        assertTrue(recursiveEquals(term1188286, term1190371));
        assertTrue(recursiveEquals(term1188884, term1190380));
        assertTrue(recursiveEquals(retValue, false));
    }

};


