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

public class FunctionType_isSubtype_2101002158597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500077;
     Object term500629;
     Object term501388;
     Object term501392;

    public FunctionType_isSubtype_2101002158597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term501398 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term501397 = ((Class) term501398).getDeclaredField((String) "INTERFACE");
        ((Field) term501397).setAccessible(true);
        Object enum926 = ((Field) term501397).get((Object) null);
        term500077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term500077, term500077.getClass(), "kind", enum926);
        Class<? extends Object> term501692 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term501691 = ((Class) term501692).getDeclaredField((String) "INTERFACE");
        ((Field) term501691).setAccessible(true);
        Object enum927 = ((Field) term501691).get((Object) null);
        term500629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term500629, term500629.getClass(), "kind", enum927);
        Class<? extends Object> term501986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term501985 = ((Class) term501986).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term501985).setAccessible(true);
        Object enum928 = ((Field) term501985).get((Object) null);
        term501388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term501388, term501388.getClass(), "call", null);
        setField(term501388, term501388.getClass(), "prototype", null);
        setField(term501388, term501388.getClass(), "kind", enum928);
        setField(term501388, term501388.getClass(), "typeOfThis", null);
        setField(term501388, term501388.getClass(), "source", null);
        setField(term501388, term501388.getClass(), "implementedInterfaces", null);
        setField(term501388, term501388.getClass(), "subTypes", null);
        setField(term501388, term501388.getClass(), "templateTypeName", null);
        setField(term501388, term501388.getClass(), "className", null);
        setField(term501388, term501388.getClass(), "properties", null);
        setField(term501388, term501388.getClass(), "implicitPrototype", null);
        setBooleanField(term501388, term501388.getClass(), "nativeType", false);
        setBooleanField(term501388, term501388.getClass(), "visited", false);
        setField(term501388, term501388.getClass(), "docInfo", null);
        setBooleanField(term501388, term501388.getClass(), "unknown", false);
        setBooleanField(term501388, term501388.getClass(), "resolved", false);
        setField(term501388, term501388.getClass(), "resolveResult", null);
        setField(term501388, term501388.getClass(), "registry", null);
        Class<? extends Object> term502286 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term502285 = ((Class) term502286).getDeclaredField((String) "INTERFACE");
        ((Field) term502285).setAccessible(true);
        Object enum929 = ((Field) term502285).get((Object) null);
        term501392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term501392, term501392.getClass(), "this$0", null);
        setField(term501392, term501392.getClass(), "call", null);
        setField(term501392, term501392.getClass(), "prototype", null);
        setField(term501392, term501392.getClass(), "kind", enum929);
        setField(term501392, term501392.getClass(), "typeOfThis", null);
        setField(term501392, term501392.getClass(), "source", null);
        setField(term501392, term501392.getClass(), "implementedInterfaces", null);
        setField(term501392, term501392.getClass(), "subTypes", null);
        setField(term501392, term501392.getClass(), "templateTypeName", null);
        setField(term501392, term501392.getClass(), "className", null);
        setField(term501392, term501392.getClass(), "properties", null);
        setField(term501392, term501392.getClass(), "implicitPrototype", null);
        setBooleanField(term501392, term501392.getClass(), "nativeType", false);
        setBooleanField(term501392, term501392.getClass(), "visited", false);
        setField(term501392, term501392.getClass(), "docInfo", null);
        setBooleanField(term501392, term501392.getClass(), "unknown", false);
        setBooleanField(term501392, term501392.getClass(), "resolved", false);
        setField(term501392, term501392.getClass(), "resolveResult", null);
        setField(term501392, term501392.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term500629;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term500077, args);
        assertTrue(recursiveEquals(term500077, term501388));
        assertTrue(recursiveEquals(term500629, term501392));
        assertTrue(recursiveEquals(retValue, true));
    }

};


