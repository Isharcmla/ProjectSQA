package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectCanCast_1169833078494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258318;
     Object term258428;
     Object term258982;
     Object term259880;
     Object term259881;
     Object term259885;

    public TypeValidator_expectCanCast_1169833078494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258318 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term259890 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term259889 = ((Class) term259890).getDeclaredField((String) "ORDINARY");
        ((Field) term259889).setAccessible(true);
        Object enum156 = ((Field) term259889).get((Object) null);
        term258428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term258428, term258428.getClass(), "kind", enum156);
        setBooleanField(term258428, term258428.getClass(), "unknown", false);
        Class<? extends Object> term260181 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term260180 = ((Class) term260181).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term260180).setAccessible(true);
        Object enum157 = ((Field) term260180).get((Object) null);
        term258982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term258982, term258982.getClass(), "unknown", true);
        setField(term258982, term258982.getClass(), "implicitPrototypeFallback", null);
        setField(term258982, term258982.getClass(), "kind", enum157);
        term259880 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term259880, term259880.getClass(), "compiler", null);
        setField(term259880, term259880.getClass(), "typeRegistry", null);
        setField(term259880, term259880.getClass(), "allValueTypes", null);
        setBooleanField(term259880, term259880.getClass(), "shouldReport", false);
        setField(term259880, term259880.getClass(), "nullOrUndefined", null);
        setField(term259880, term259880.getClass(), "mismatches", null);
        Class<? extends Object> term260481 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term260480 = ((Class) term260481).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term260480).setAccessible(true);
        Object enum158 = ((Field) term260480).get((Object) null);
        term259881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term259881, term259881.getClass(), "call", null);
        setField(term259881, term259881.getClass(), "prototype", null);
        setField(term259881, term259881.getClass(), "kind", enum158);
        setField(term259881, term259881.getClass(), "typeOfThis", null);
        setField(term259881, term259881.getClass(), "source", null);
        setField(term259881, term259881.getClass(), "implementedInterfaces", null);
        setField(term259881, term259881.getClass(), "subTypes", null);
        setField(term259881, term259881.getClass(), "templateTypeName", null);
        setField(term259881, term259881.getClass(), "className", null);
        setField(term259881, term259881.getClass(), "properties", null);
        setBooleanField(term259881, term259881.getClass(), "nativeType", false);
        setField(term259881, term259881.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term259881, term259881.getClass(), "prettyPrint", false);
        setBooleanField(term259881, term259881.getClass(), "visited", false);
        setField(term259881, term259881.getClass(), "docInfo", null);
        setBooleanField(term259881, term259881.getClass(), "unknown", false);
        setBooleanField(term259881, term259881.getClass(), "resolved", false);
        setField(term259881, term259881.getClass(), "resolveResult", null);
        setField(term259881, term259881.getClass(), "registry", null);
        Class<? extends Object> term260781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term260780 = ((Class) term260781).getDeclaredField((String) "INTERFACE");
        ((Field) term260780).setAccessible(true);
        Object enum159 = ((Field) term260780).get((Object) null);
        term259885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term259885, term259885.getClass(), "call", null);
        setField(term259885, term259885.getClass(), "prototype", null);
        setField(term259885, term259885.getClass(), "kind", enum159);
        setField(term259885, term259885.getClass(), "typeOfThis", null);
        setField(term259885, term259885.getClass(), "source", null);
        setField(term259885, term259885.getClass(), "implementedInterfaces", null);
        setField(term259885, term259885.getClass(), "subTypes", null);
        setField(term259885, term259885.getClass(), "templateTypeName", null);
        setField(term259885, term259885.getClass(), "className", null);
        setField(term259885, term259885.getClass(), "properties", null);
        setBooleanField(term259885, term259885.getClass(), "nativeType", false);
        setField(term259885, term259885.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term259885, term259885.getClass(), "prettyPrint", false);
        setBooleanField(term259885, term259885.getClass(), "visited", false);
        setField(term259885, term259885.getClass(), "docInfo", null);
        setBooleanField(term259885, term259885.getClass(), "unknown", false);
        setBooleanField(term259885, term259885.getClass(), "resolved", false);
        setField(term259885, term259885.getClass(), "resolveResult", null);
        setField(term259885, term259885.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term258428;
        args[3] = term258982;
        callMethod(klass, "expectCanCast", argTypes, term258318, args);
        assertTrue(recursiveEquals(term258318, term259880));
        assertTrue(recursiveEquals(term258428, null));
        assertTrue(recursiveEquals(term258982, null));
    }

};


