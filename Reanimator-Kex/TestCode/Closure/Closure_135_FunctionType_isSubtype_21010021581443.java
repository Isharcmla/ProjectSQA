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

public class FunctionType_isSubtype_21010021581443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1873583;
     Object term1873839;
     Object term1874682;
     Object term1874686;

    public FunctionType_isSubtype_21010021581443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1874692 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1874691 = ((Class) term1874692).getDeclaredField((String) "INTERFACE");
        ((Field) term1874691).setAccessible(true);
        Object enum3492 = ((Field) term1874691).get((Object) null);
        term1873583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1873583, term1873583.getClass(), "kind", enum3492);
        Class<? extends Object> term1874986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1874985 = ((Class) term1874986).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1874985).setAccessible(true);
        Object enum3493 = ((Field) term1874985).get((Object) null);
        term1873839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1873839, term1873839.getClass(), "kind", enum3493);
        Class<? extends Object> term1875286 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1875285 = ((Class) term1875286).getDeclaredField((String) "INTERFACE");
        ((Field) term1875285).setAccessible(true);
        Object enum3494 = ((Field) term1875285).get((Object) null);
        term1874682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1874682, term1874682.getClass(), "this$0", null);
        setField(term1874682, term1874682.getClass(), "call", null);
        setField(term1874682, term1874682.getClass(), "prototype", null);
        setField(term1874682, term1874682.getClass(), "kind", enum3494);
        setField(term1874682, term1874682.getClass(), "typeOfThis", null);
        setField(term1874682, term1874682.getClass(), "source", null);
        setField(term1874682, term1874682.getClass(), "implementedInterfaces", null);
        setField(term1874682, term1874682.getClass(), "subTypes", null);
        setField(term1874682, term1874682.getClass(), "templateTypeName", null);
        setField(term1874682, term1874682.getClass(), "className", null);
        setField(term1874682, term1874682.getClass(), "properties", null);
        setField(term1874682, term1874682.getClass(), "implicitPrototype", null);
        setBooleanField(term1874682, term1874682.getClass(), "nativeType", false);
        setBooleanField(term1874682, term1874682.getClass(), "visited", false);
        setField(term1874682, term1874682.getClass(), "docInfo", null);
        setBooleanField(term1874682, term1874682.getClass(), "unknown", false);
        setBooleanField(term1874682, term1874682.getClass(), "resolved", false);
        setField(term1874682, term1874682.getClass(), "resolveResult", null);
        setField(term1874682, term1874682.getClass(), "registry", null);
        Class<? extends Object> term1875580 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1875579 = ((Class) term1875580).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1875579).setAccessible(true);
        Object enum3495 = ((Field) term1875579).get((Object) null);
        term1874686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1874686, term1874686.getClass(), "this$0", null);
        setField(term1874686, term1874686.getClass(), "call", null);
        setField(term1874686, term1874686.getClass(), "prototype", null);
        setField(term1874686, term1874686.getClass(), "kind", enum3495);
        setField(term1874686, term1874686.getClass(), "typeOfThis", null);
        setField(term1874686, term1874686.getClass(), "source", null);
        setField(term1874686, term1874686.getClass(), "implementedInterfaces", null);
        setField(term1874686, term1874686.getClass(), "subTypes", null);
        setField(term1874686, term1874686.getClass(), "templateTypeName", null);
        setField(term1874686, term1874686.getClass(), "className", null);
        setField(term1874686, term1874686.getClass(), "properties", null);
        setField(term1874686, term1874686.getClass(), "implicitPrototype", null);
        setBooleanField(term1874686, term1874686.getClass(), "nativeType", false);
        setBooleanField(term1874686, term1874686.getClass(), "visited", false);
        setField(term1874686, term1874686.getClass(), "docInfo", null);
        setBooleanField(term1874686, term1874686.getClass(), "unknown", false);
        setBooleanField(term1874686, term1874686.getClass(), "resolved", false);
        setField(term1874686, term1874686.getClass(), "resolveResult", null);
        setField(term1874686, term1874686.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1873839;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1873583, args);
        assertTrue(recursiveEquals(term1873583, term1874682));
        assertTrue(recursiveEquals(term1873839, term1874686));
        assertTrue(recursiveEquals(retValue, false));
    }

};


