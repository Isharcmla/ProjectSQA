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

public class FunctionType_isSubtype_21010021581349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1715415;
     Object term1716173;
     Object term1717239;
     Object term1717245;

    public FunctionType_isSubtype_21010021581349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1717255 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1717254 = ((Class) term1717255).getDeclaredField((String) "ORDINARY");
        ((Field) term1717254).setAccessible(true);
        Object enum3203 = ((Field) term1717254).get((Object) null);
        term1715415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1715959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1716065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1715415, term1715415.getClass(), "kind", enum3203);
        setField(term1715959, term1715959.getClass(), "kind", enum3203);
        setField(term1715959, term1715959.getClass(), "typeOfThis", term1716065);
        setField(term1715415, term1715415.getClass(), "typeOfThis", term1715959);
        Class<? extends Object> term1717546 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1717545 = ((Class) term1717546).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1717545).setAccessible(true);
        Object enum3204 = ((Field) term1717545).get((Object) null);
        term1716173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1716503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1716173, term1716173.getClass(), "kind", enum3203);
        setField(term1716503, term1716503.getClass(), "kind", enum3204);
        setField(term1716503, term1716503.getClass(), "typeOfThis", null);
        setField(term1716173, term1716173.getClass(), "typeOfThis", term1716503);
        Class<? extends Object> term1717846 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1717845 = ((Class) term1717846).getDeclaredField((String) "INTERFACE");
        ((Field) term1717845).setAccessible(true);
        Object enum3205 = ((Field) term1717845).get((Object) null);
        term1717239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1717243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1717244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1717239, term1717239.getClass(), "this$0", null);
        setField(term1717239, term1717239.getClass(), "call", null);
        setField(term1717239, term1717239.getClass(), "prototype", null);
        setField(term1717239, term1717239.getClass(), "kind", enum3205);
        setField(term1717243, term1717243.getClass(), "call", null);
        setField(term1717243, term1717243.getClass(), "prototype", null);
        setField(term1717243, term1717243.getClass(), "kind", enum3205);
        setField(term1717244, term1717244.getClass(), "primitiveType", null);
        setField(term1717244, term1717244.getClass(), "primitiveObjectType", null);
        setField(term1717244, term1717244.getClass(), "name", null);
        setBooleanField(term1717244, term1717244.getClass(), "visited", false);
        setField(term1717244, term1717244.getClass(), "docInfo", null);
        setBooleanField(term1717244, term1717244.getClass(), "unknown", false);
        setBooleanField(term1717244, term1717244.getClass(), "resolved", false);
        setField(term1717244, term1717244.getClass(), "resolveResult", null);
        setField(term1717244, term1717244.getClass(), "registry", null);
        setField(term1717243, term1717243.getClass(), "typeOfThis", term1717244);
        setField(term1717243, term1717243.getClass(), "source", null);
        setField(term1717243, term1717243.getClass(), "implementedInterfaces", null);
        setField(term1717243, term1717243.getClass(), "subTypes", null);
        setField(term1717243, term1717243.getClass(), "templateTypeName", null);
        setField(term1717243, term1717243.getClass(), "className", null);
        setField(term1717243, term1717243.getClass(), "properties", null);
        setField(term1717243, term1717243.getClass(), "implicitPrototype", null);
        setBooleanField(term1717243, term1717243.getClass(), "nativeType", false);
        setBooleanField(term1717243, term1717243.getClass(), "visited", false);
        setField(term1717243, term1717243.getClass(), "docInfo", null);
        setBooleanField(term1717243, term1717243.getClass(), "unknown", false);
        setBooleanField(term1717243, term1717243.getClass(), "resolved", false);
        setField(term1717243, term1717243.getClass(), "resolveResult", null);
        setField(term1717243, term1717243.getClass(), "registry", null);
        setField(term1717239, term1717239.getClass(), "typeOfThis", term1717243);
        setField(term1717239, term1717239.getClass(), "source", null);
        setField(term1717239, term1717239.getClass(), "implementedInterfaces", null);
        setField(term1717239, term1717239.getClass(), "subTypes", null);
        setField(term1717239, term1717239.getClass(), "templateTypeName", null);
        setField(term1717239, term1717239.getClass(), "className", null);
        setField(term1717239, term1717239.getClass(), "properties", null);
        setField(term1717239, term1717239.getClass(), "implicitPrototype", null);
        setBooleanField(term1717239, term1717239.getClass(), "nativeType", false);
        setBooleanField(term1717239, term1717239.getClass(), "visited", false);
        setField(term1717239, term1717239.getClass(), "docInfo", null);
        setBooleanField(term1717239, term1717239.getClass(), "unknown", false);
        setBooleanField(term1717239, term1717239.getClass(), "resolved", false);
        setField(term1717239, term1717239.getClass(), "resolveResult", null);
        setField(term1717239, term1717239.getClass(), "registry", null);
        Class<? extends Object> term1718140 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1718139 = ((Class) term1718140).getDeclaredField((String) "INTERFACE");
        ((Field) term1718139).setAccessible(true);
        Object enum3206 = ((Field) term1718139).get((Object) null);
        Class<? extends Object> term1718434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1718433 = ((Class) term1718434).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1718433).setAccessible(true);
        Object enum3207 = ((Field) term1718433).get((Object) null);
        term1717245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1717249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1717245, term1717245.getClass(), "this$0", null);
        setField(term1717245, term1717245.getClass(), "call", null);
        setField(term1717245, term1717245.getClass(), "prototype", null);
        setField(term1717245, term1717245.getClass(), "kind", enum3206);
        setField(term1717249, term1717249.getClass(), "this$0", null);
        setField(term1717249, term1717249.getClass(), "call", null);
        setField(term1717249, term1717249.getClass(), "prototype", null);
        setField(term1717249, term1717249.getClass(), "kind", enum3207);
        setField(term1717249, term1717249.getClass(), "typeOfThis", null);
        setField(term1717249, term1717249.getClass(), "source", null);
        setField(term1717249, term1717249.getClass(), "implementedInterfaces", null);
        setField(term1717249, term1717249.getClass(), "subTypes", null);
        setField(term1717249, term1717249.getClass(), "templateTypeName", null);
        setField(term1717249, term1717249.getClass(), "className", null);
        setField(term1717249, term1717249.getClass(), "properties", null);
        setField(term1717249, term1717249.getClass(), "implicitPrototype", null);
        setBooleanField(term1717249, term1717249.getClass(), "nativeType", false);
        setBooleanField(term1717249, term1717249.getClass(), "visited", false);
        setField(term1717249, term1717249.getClass(), "docInfo", null);
        setBooleanField(term1717249, term1717249.getClass(), "unknown", false);
        setBooleanField(term1717249, term1717249.getClass(), "resolved", false);
        setField(term1717249, term1717249.getClass(), "resolveResult", null);
        setField(term1717249, term1717249.getClass(), "registry", null);
        setField(term1717245, term1717245.getClass(), "typeOfThis", term1717249);
        setField(term1717245, term1717245.getClass(), "source", null);
        setField(term1717245, term1717245.getClass(), "implementedInterfaces", null);
        setField(term1717245, term1717245.getClass(), "subTypes", null);
        setField(term1717245, term1717245.getClass(), "templateTypeName", null);
        setField(term1717245, term1717245.getClass(), "className", null);
        setField(term1717245, term1717245.getClass(), "properties", null);
        setField(term1717245, term1717245.getClass(), "implicitPrototype", null);
        setBooleanField(term1717245, term1717245.getClass(), "nativeType", false);
        setBooleanField(term1717245, term1717245.getClass(), "visited", false);
        setField(term1717245, term1717245.getClass(), "docInfo", null);
        setBooleanField(term1717245, term1717245.getClass(), "unknown", false);
        setBooleanField(term1717245, term1717245.getClass(), "resolved", false);
        setField(term1717245, term1717245.getClass(), "resolveResult", null);
        setField(term1717245, term1717245.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1716173;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1715415, args);
        assertTrue(recursiveEquals(term1715415, term1717239));
        assertTrue(recursiveEquals(term1716173, term1717245));
        assertTrue(recursiveEquals(retValue, true));
    }

};


