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

public class FunctionType_isSubtype_2101002158429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284343;
     Object term284599;
     Object term285734;
     Object term285738;

    public FunctionType_isSubtype_2101002158429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term285744 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term285743 = ((Class) term285744).getDeclaredField((String) "INTERFACE");
        ((Field) term285743).setAccessible(true);
        Object enum522 = ((Field) term285743).get((Object) null);
        term284343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term284343, term284343.getClass(), "kind", enum522);
        term284599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term284599, term284599.getClass(), "kind", enum522);
        Class<? extends Object> term286038 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term286037 = ((Class) term286038).getDeclaredField((String) "INTERFACE");
        ((Field) term286037).setAccessible(true);
        Object enum523 = ((Field) term286037).get((Object) null);
        term285734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term285734, term285734.getClass(), "this$0", null);
        setField(term285734, term285734.getClass(), "call", null);
        setField(term285734, term285734.getClass(), "prototype", null);
        setField(term285734, term285734.getClass(), "kind", enum523);
        setField(term285734, term285734.getClass(), "typeOfThis", null);
        setField(term285734, term285734.getClass(), "source", null);
        setField(term285734, term285734.getClass(), "implementedInterfaces", null);
        setField(term285734, term285734.getClass(), "subTypes", null);
        setField(term285734, term285734.getClass(), "templateTypeName", null);
        setField(term285734, term285734.getClass(), "className", null);
        setField(term285734, term285734.getClass(), "properties", null);
        setField(term285734, term285734.getClass(), "implicitPrototype", null);
        setBooleanField(term285734, term285734.getClass(), "nativeType", false);
        setBooleanField(term285734, term285734.getClass(), "visited", false);
        setField(term285734, term285734.getClass(), "docInfo", null);
        setBooleanField(term285734, term285734.getClass(), "unknown", false);
        setBooleanField(term285734, term285734.getClass(), "resolved", false);
        setField(term285734, term285734.getClass(), "resolveResult", null);
        setField(term285734, term285734.getClass(), "registry", null);
        Class<? extends Object> term286332 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term286331 = ((Class) term286332).getDeclaredField((String) "INTERFACE");
        ((Field) term286331).setAccessible(true);
        Object enum524 = ((Field) term286331).get((Object) null);
        term285738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term285738, term285738.getClass(), "this$0", null);
        setField(term285738, term285738.getClass(), "call", null);
        setField(term285738, term285738.getClass(), "prototype", null);
        setField(term285738, term285738.getClass(), "kind", enum524);
        setField(term285738, term285738.getClass(), "typeOfThis", null);
        setField(term285738, term285738.getClass(), "source", null);
        setField(term285738, term285738.getClass(), "implementedInterfaces", null);
        setField(term285738, term285738.getClass(), "subTypes", null);
        setField(term285738, term285738.getClass(), "templateTypeName", null);
        setField(term285738, term285738.getClass(), "className", null);
        setField(term285738, term285738.getClass(), "properties", null);
        setField(term285738, term285738.getClass(), "implicitPrototype", null);
        setBooleanField(term285738, term285738.getClass(), "nativeType", false);
        setBooleanField(term285738, term285738.getClass(), "visited", false);
        setField(term285738, term285738.getClass(), "docInfo", null);
        setBooleanField(term285738, term285738.getClass(), "unknown", false);
        setBooleanField(term285738, term285738.getClass(), "resolved", false);
        setField(term285738, term285738.getClass(), "resolveResult", null);
        setField(term285738, term285738.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term284599;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term284343, args);
        assertTrue(recursiveEquals(term284343, term285734));
        assertTrue(recursiveEquals(term284599, term285738));
        assertTrue(recursiveEquals(retValue, true));
    }

};


