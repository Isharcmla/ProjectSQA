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

public class FunctionType_isSubtype_2101002158563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447887;
     Object term448237;
     Object term449077;
     Object term449082;

    public FunctionType_isSubtype_2101002158563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term449088 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449087 = ((Class) term449088).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term449087).setAccessible(true);
        Object enum831 = ((Field) term449087).get((Object) null);
        term447887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term448129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term447887, term447887.getClass(), "kind", enum831);
        setField(term447887, term447887.getClass(), "call", term448129);
        Class<? extends Object> term449388 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449387 = ((Class) term449388).getDeclaredField((String) "ORDINARY");
        ((Field) term449387).setAccessible(true);
        Object enum832 = ((Field) term449387).get((Object) null);
        term448237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term448237, term448237.getClass(), "kind", enum832);
        setField(term448237, term448237.getClass(), "call", null);
        Class<? extends Object> term449679 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449678 = ((Class) term449679).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term449678).setAccessible(true);
        Object enum833 = ((Field) term449678).get((Object) null);
        term449077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term449078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term449078, term449078.getClass(), "parameters", null);
        setField(term449078, term449078.getClass(), "returnType", null);
        setBooleanField(term449078, term449078.getClass(), "resolved", false);
        setField(term449078, term449078.getClass(), "resolveResult", null);
        setField(term449078, term449078.getClass(), "registry", null);
        setField(term449077, term449077.getClass(), "call", term449078);
        setField(term449077, term449077.getClass(), "prototype", null);
        setField(term449077, term449077.getClass(), "kind", enum833);
        setField(term449077, term449077.getClass(), "typeOfThis", null);
        setField(term449077, term449077.getClass(), "source", null);
        setField(term449077, term449077.getClass(), "implementedInterfaces", null);
        setField(term449077, term449077.getClass(), "subTypes", null);
        setField(term449077, term449077.getClass(), "templateTypeName", null);
        setField(term449077, term449077.getClass(), "className", null);
        setField(term449077, term449077.getClass(), "properties", null);
        setField(term449077, term449077.getClass(), "implicitPrototype", null);
        setBooleanField(term449077, term449077.getClass(), "nativeType", false);
        setBooleanField(term449077, term449077.getClass(), "visited", false);
        setField(term449077, term449077.getClass(), "docInfo", null);
        setBooleanField(term449077, term449077.getClass(), "unknown", false);
        setBooleanField(term449077, term449077.getClass(), "resolved", false);
        setField(term449077, term449077.getClass(), "resolveResult", null);
        setField(term449077, term449077.getClass(), "registry", null);
        Class<? extends Object> term449979 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449978 = ((Class) term449979).getDeclaredField((String) "ORDINARY");
        ((Field) term449978).setAccessible(true);
        Object enum834 = ((Field) term449978).get((Object) null);
        term449082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term449082, term449082.getClass(), "this$0", null);
        setField(term449082, term449082.getClass(), "call", null);
        setField(term449082, term449082.getClass(), "prototype", null);
        setField(term449082, term449082.getClass(), "kind", enum834);
        setField(term449082, term449082.getClass(), "typeOfThis", null);
        setField(term449082, term449082.getClass(), "source", null);
        setField(term449082, term449082.getClass(), "implementedInterfaces", null);
        setField(term449082, term449082.getClass(), "subTypes", null);
        setField(term449082, term449082.getClass(), "templateTypeName", null);
        setField(term449082, term449082.getClass(), "className", null);
        setField(term449082, term449082.getClass(), "properties", null);
        setField(term449082, term449082.getClass(), "implicitPrototype", null);
        setBooleanField(term449082, term449082.getClass(), "nativeType", false);
        setBooleanField(term449082, term449082.getClass(), "visited", false);
        setField(term449082, term449082.getClass(), "docInfo", null);
        setBooleanField(term449082, term449082.getClass(), "unknown", false);
        setBooleanField(term449082, term449082.getClass(), "resolved", false);
        setField(term449082, term449082.getClass(), "resolveResult", null);
        setField(term449082, term449082.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term448237;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term447887, args);
        assertTrue(recursiveEquals(term447887, term449077));
        assertTrue(recursiveEquals(term448237, term449082));
        assertTrue(recursiveEquals(retValue, false));
    }

};


