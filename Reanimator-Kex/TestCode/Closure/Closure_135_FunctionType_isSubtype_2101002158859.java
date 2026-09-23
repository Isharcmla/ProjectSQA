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

public class FunctionType_isSubtype_2101002158859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888262;
     Object term888816;
     Object term891750;
     Object term891754;

    public FunctionType_isSubtype_2101002158859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term891764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term891763 = ((Class) term891764).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term891763).setAccessible(true);
        Object enum1660 = ((Field) term891763).get((Object) null);
        term888262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term888262, term888262.getClass(), "kind", enum1660);
        setField(term888262, term888262.getClass(), "typeOfThis", term888262);
        Class<? extends Object> term892064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term892063 = ((Class) term892064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term892063).setAccessible(true);
        Object enum1661 = ((Field) term892063).get((Object) null);
        Class<? extends Object> term892364 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term892363 = ((Class) term892364).getDeclaredField((String) "INTERFACE");
        ((Field) term892363).setAccessible(true);
        Object enum1662 = ((Field) term892363).get((Object) null);
        term888816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term888998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term888816, term888816.getClass(), "kind", enum1661);
        setField(term888998, term888998.getClass(), "kind", enum1662);
        setField(term888816, term888816.getClass(), "typeOfThis", term888998);
        Class<? extends Object> term892658 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term892657 = ((Class) term892658).getDeclaredField((String) "INTERFACE");
        ((Field) term892657).setAccessible(true);
        Object enum1663 = ((Field) term892657).get((Object) null);
        term891750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term891750, term891750.getClass(), "this$0", null);
        setField(term891750, term891750.getClass(), "call", null);
        setField(term891750, term891750.getClass(), "prototype", null);
        setField(term891750, term891750.getClass(), "kind", enum1663);
        setField(term891750, term891750.getClass(), "typeOfThis", term891750);
        setField(term891750, term891750.getClass(), "source", null);
        setField(term891750, term891750.getClass(), "implementedInterfaces", null);
        setField(term891750, term891750.getClass(), "subTypes", null);
        setField(term891750, term891750.getClass(), "templateTypeName", null);
        setField(term891750, term891750.getClass(), "className", null);
        setField(term891750, term891750.getClass(), "properties", null);
        setField(term891750, term891750.getClass(), "implicitPrototype", null);
        setBooleanField(term891750, term891750.getClass(), "nativeType", false);
        setBooleanField(term891750, term891750.getClass(), "visited", false);
        setField(term891750, term891750.getClass(), "docInfo", null);
        setBooleanField(term891750, term891750.getClass(), "unknown", false);
        setBooleanField(term891750, term891750.getClass(), "resolved", false);
        setField(term891750, term891750.getClass(), "resolveResult", null);
        setField(term891750, term891750.getClass(), "registry", null);
        Class<? extends Object> term892952 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term892951 = ((Class) term892952).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term892951).setAccessible(true);
        Object enum1664 = ((Field) term892951).get((Object) null);
        Class<? extends Object> term893252 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term893251 = ((Class) term893252).getDeclaredField((String) "INTERFACE");
        ((Field) term893251).setAccessible(true);
        Object enum1665 = ((Field) term893251).get((Object) null);
        term891754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term891758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term891754, term891754.getClass(), "call", null);
        setField(term891754, term891754.getClass(), "prototype", null);
        setField(term891754, term891754.getClass(), "kind", enum1664);
        setField(term891758, term891758.getClass(), "this$0", null);
        setField(term891758, term891758.getClass(), "call", null);
        setField(term891758, term891758.getClass(), "prototype", null);
        setField(term891758, term891758.getClass(), "kind", enum1665);
        setField(term891758, term891758.getClass(), "typeOfThis", null);
        setField(term891758, term891758.getClass(), "source", null);
        setField(term891758, term891758.getClass(), "implementedInterfaces", null);
        setField(term891758, term891758.getClass(), "subTypes", null);
        setField(term891758, term891758.getClass(), "templateTypeName", null);
        setField(term891758, term891758.getClass(), "className", null);
        setField(term891758, term891758.getClass(), "properties", null);
        setField(term891758, term891758.getClass(), "implicitPrototype", null);
        setBooleanField(term891758, term891758.getClass(), "nativeType", false);
        setBooleanField(term891758, term891758.getClass(), "visited", false);
        setField(term891758, term891758.getClass(), "docInfo", null);
        setBooleanField(term891758, term891758.getClass(), "unknown", false);
        setBooleanField(term891758, term891758.getClass(), "resolved", false);
        setField(term891758, term891758.getClass(), "resolveResult", null);
        setField(term891758, term891758.getClass(), "registry", null);
        setField(term891754, term891754.getClass(), "typeOfThis", term891758);
        setField(term891754, term891754.getClass(), "source", null);
        setField(term891754, term891754.getClass(), "implementedInterfaces", null);
        setField(term891754, term891754.getClass(), "subTypes", null);
        setField(term891754, term891754.getClass(), "templateTypeName", null);
        setField(term891754, term891754.getClass(), "className", null);
        setField(term891754, term891754.getClass(), "properties", null);
        setField(term891754, term891754.getClass(), "implicitPrototype", null);
        setBooleanField(term891754, term891754.getClass(), "nativeType", false);
        setBooleanField(term891754, term891754.getClass(), "visited", false);
        setField(term891754, term891754.getClass(), "docInfo", null);
        setBooleanField(term891754, term891754.getClass(), "unknown", false);
        setBooleanField(term891754, term891754.getClass(), "resolved", false);
        setField(term891754, term891754.getClass(), "resolveResult", null);
        setField(term891754, term891754.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term888816;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term888262, args);
        assertTrue(recursiveEquals(term888262, term891750));
        assertTrue(recursiveEquals(term888816, term891754));
        assertTrue(recursiveEquals(retValue, false));
    }

};


