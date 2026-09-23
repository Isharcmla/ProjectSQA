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

public class FunctionType_isSubtype_21010021581001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1261824;
     Object term1262478;
     Object term1263385;
     Object term1263393;

    public FunctionType_isSubtype_21010021581001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1263400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1263399 = ((Class) term1263400).getDeclaredField((String) "INTERFACE");
        ((Field) term1263399).setAccessible(true);
        Object enum2265 = ((Field) term1263399).get((Object) null);
        Class<? extends Object> term1263694 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1263693 = ((Class) term1263694).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1263693).setAccessible(true);
        Object enum2266 = ((Field) term1263693).get((Object) null);
        term1261824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1262368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1261824, term1261824.getClass(), "kind", enum2265);
        setField(term1262368, term1262368.getClass(), "kind", enum2266);
        setField(term1261824, term1261824.getClass(), "typeOfThis", term1262368);
        term1262478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1262662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1262478, term1262478.getClass(), "kind", enum2266);
        setField(term1262662, term1262662.getClass(), "kind", enum2266);
        setField(term1262478, term1262478.getClass(), "typeOfThis", term1262662);
        Class<? extends Object> term1263994 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1263993 = ((Class) term1263994).getDeclaredField((String) "INTERFACE");
        ((Field) term1263993).setAccessible(true);
        Object enum2267 = ((Field) term1263993).get((Object) null);
        Class<? extends Object> term1264288 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1264287 = ((Class) term1264288).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1264287).setAccessible(true);
        Object enum2268 = ((Field) term1264287).get((Object) null);
        term1263385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1263389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1263385, term1263385.getClass(), "this$0", null);
        setField(term1263385, term1263385.getClass(), "call", null);
        setField(term1263385, term1263385.getClass(), "prototype", null);
        setField(term1263385, term1263385.getClass(), "kind", enum2267);
        setField(term1263389, term1263389.getClass(), "call", null);
        setField(term1263389, term1263389.getClass(), "prototype", null);
        setField(term1263389, term1263389.getClass(), "kind", enum2268);
        setField(term1263389, term1263389.getClass(), "typeOfThis", null);
        setField(term1263389, term1263389.getClass(), "source", null);
        setField(term1263389, term1263389.getClass(), "implementedInterfaces", null);
        setField(term1263389, term1263389.getClass(), "subTypes", null);
        setField(term1263389, term1263389.getClass(), "templateTypeName", null);
        setField(term1263389, term1263389.getClass(), "className", null);
        setField(term1263389, term1263389.getClass(), "properties", null);
        setField(term1263389, term1263389.getClass(), "implicitPrototype", null);
        setBooleanField(term1263389, term1263389.getClass(), "nativeType", false);
        setBooleanField(term1263389, term1263389.getClass(), "prettyPrint", false);
        setBooleanField(term1263389, term1263389.getClass(), "visited", false);
        setField(term1263389, term1263389.getClass(), "docInfo", null);
        setBooleanField(term1263389, term1263389.getClass(), "unknown", false);
        setBooleanField(term1263389, term1263389.getClass(), "resolved", false);
        setField(term1263389, term1263389.getClass(), "resolveResult", null);
        setField(term1263389, term1263389.getClass(), "registry", null);
        setField(term1263385, term1263385.getClass(), "typeOfThis", term1263389);
        setField(term1263385, term1263385.getClass(), "source", null);
        setField(term1263385, term1263385.getClass(), "implementedInterfaces", null);
        setField(term1263385, term1263385.getClass(), "subTypes", null);
        setField(term1263385, term1263385.getClass(), "templateTypeName", null);
        setField(term1263385, term1263385.getClass(), "className", null);
        setField(term1263385, term1263385.getClass(), "properties", null);
        setField(term1263385, term1263385.getClass(), "implicitPrototype", null);
        setBooleanField(term1263385, term1263385.getClass(), "nativeType", false);
        setBooleanField(term1263385, term1263385.getClass(), "prettyPrint", false);
        setBooleanField(term1263385, term1263385.getClass(), "visited", false);
        setField(term1263385, term1263385.getClass(), "docInfo", null);
        setBooleanField(term1263385, term1263385.getClass(), "unknown", false);
        setBooleanField(term1263385, term1263385.getClass(), "resolved", false);
        setField(term1263385, term1263385.getClass(), "resolveResult", null);
        setField(term1263385, term1263385.getClass(), "registry", null);
        Class<? extends Object> term1264588 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1264587 = ((Class) term1264588).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1264587).setAccessible(true);
        Object enum2269 = ((Field) term1264587).get((Object) null);
        term1263393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1263397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1263393, term1263393.getClass(), "call", null);
        setField(term1263393, term1263393.getClass(), "prototype", null);
        setField(term1263393, term1263393.getClass(), "kind", enum2269);
        setField(term1263397, term1263397.getClass(), "call", null);
        setField(term1263397, term1263397.getClass(), "prototype", null);
        setField(term1263397, term1263397.getClass(), "kind", enum2269);
        setField(term1263397, term1263397.getClass(), "typeOfThis", null);
        setField(term1263397, term1263397.getClass(), "source", null);
        setField(term1263397, term1263397.getClass(), "implementedInterfaces", null);
        setField(term1263397, term1263397.getClass(), "subTypes", null);
        setField(term1263397, term1263397.getClass(), "templateTypeName", null);
        setField(term1263397, term1263397.getClass(), "className", null);
        setField(term1263397, term1263397.getClass(), "properties", null);
        setField(term1263397, term1263397.getClass(), "implicitPrototype", null);
        setBooleanField(term1263397, term1263397.getClass(), "nativeType", false);
        setBooleanField(term1263397, term1263397.getClass(), "prettyPrint", false);
        setBooleanField(term1263397, term1263397.getClass(), "visited", false);
        setField(term1263397, term1263397.getClass(), "docInfo", null);
        setBooleanField(term1263397, term1263397.getClass(), "unknown", false);
        setBooleanField(term1263397, term1263397.getClass(), "resolved", false);
        setField(term1263397, term1263397.getClass(), "resolveResult", null);
        setField(term1263397, term1263397.getClass(), "registry", null);
        setField(term1263393, term1263393.getClass(), "typeOfThis", term1263397);
        setField(term1263393, term1263393.getClass(), "source", null);
        setField(term1263393, term1263393.getClass(), "implementedInterfaces", null);
        setField(term1263393, term1263393.getClass(), "subTypes", null);
        setField(term1263393, term1263393.getClass(), "templateTypeName", null);
        setField(term1263393, term1263393.getClass(), "className", null);
        setField(term1263393, term1263393.getClass(), "properties", null);
        setField(term1263393, term1263393.getClass(), "implicitPrototype", null);
        setBooleanField(term1263393, term1263393.getClass(), "nativeType", false);
        setBooleanField(term1263393, term1263393.getClass(), "prettyPrint", false);
        setBooleanField(term1263393, term1263393.getClass(), "visited", false);
        setField(term1263393, term1263393.getClass(), "docInfo", null);
        setBooleanField(term1263393, term1263393.getClass(), "unknown", false);
        setBooleanField(term1263393, term1263393.getClass(), "resolved", false);
        setField(term1263393, term1263393.getClass(), "resolveResult", null);
        setField(term1263393, term1263393.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1262478;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1261824, args);
        assertTrue(recursiveEquals(term1261824, term1263385));
        assertTrue(recursiveEquals(term1262478, term1263393));
        assertTrue(recursiveEquals(retValue, false));
    }

};


