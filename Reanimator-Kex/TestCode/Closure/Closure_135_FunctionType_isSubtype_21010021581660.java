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

public class FunctionType_isSubtype_21010021581660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242535;
     Object term2243089;
     Object term2243844;
     Object term2243848;

    public FunctionType_isSubtype_21010021581660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2243854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2243853 = ((Class) term2243854).getDeclaredField((String) "INTERFACE");
        ((Field) term2243853).setAccessible(true);
        Object enum4185 = ((Field) term2243853).get((Object) null);
        term2242535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2242535, term2242535.getClass(), "kind", enum4185);
        Class<? extends Object> term2244148 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2244147 = ((Class) term2244148).getDeclaredField((String) "INTERFACE");
        ((Field) term2244147).setAccessible(true);
        Object enum4186 = ((Field) term2244147).get((Object) null);
        term2243089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2243089, term2243089.getClass(), "kind", enum4186);
        Class<? extends Object> term2244442 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2244441 = ((Class) term2244442).getDeclaredField((String) "INTERFACE");
        ((Field) term2244441).setAccessible(true);
        Object enum4187 = ((Field) term2244441).get((Object) null);
        term2243844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2243844, term2243844.getClass(), "this$0", null);
        setField(term2243844, term2243844.getClass(), "call", null);
        setField(term2243844, term2243844.getClass(), "prototype", null);
        setField(term2243844, term2243844.getClass(), "kind", enum4187);
        setField(term2243844, term2243844.getClass(), "typeOfThis", null);
        setField(term2243844, term2243844.getClass(), "source", null);
        setField(term2243844, term2243844.getClass(), "implementedInterfaces", null);
        setField(term2243844, term2243844.getClass(), "subTypes", null);
        setField(term2243844, term2243844.getClass(), "templateTypeName", null);
        setField(term2243844, term2243844.getClass(), "className", null);
        setField(term2243844, term2243844.getClass(), "properties", null);
        setField(term2243844, term2243844.getClass(), "implicitPrototype", null);
        setBooleanField(term2243844, term2243844.getClass(), "nativeType", false);
        setBooleanField(term2243844, term2243844.getClass(), "visited", false);
        setField(term2243844, term2243844.getClass(), "docInfo", null);
        setBooleanField(term2243844, term2243844.getClass(), "unknown", false);
        setBooleanField(term2243844, term2243844.getClass(), "resolved", false);
        setField(term2243844, term2243844.getClass(), "resolveResult", null);
        setField(term2243844, term2243844.getClass(), "registry", null);
        Class<? extends Object> term2244736 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2244735 = ((Class) term2244736).getDeclaredField((String) "INTERFACE");
        ((Field) term2244735).setAccessible(true);
        Object enum4188 = ((Field) term2244735).get((Object) null);
        term2243848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2243848, term2243848.getClass(), "call", null);
        setField(term2243848, term2243848.getClass(), "prototype", null);
        setField(term2243848, term2243848.getClass(), "kind", enum4188);
        setField(term2243848, term2243848.getClass(), "typeOfThis", null);
        setField(term2243848, term2243848.getClass(), "source", null);
        setField(term2243848, term2243848.getClass(), "implementedInterfaces", null);
        setField(term2243848, term2243848.getClass(), "subTypes", null);
        setField(term2243848, term2243848.getClass(), "templateTypeName", null);
        setField(term2243848, term2243848.getClass(), "className", null);
        setField(term2243848, term2243848.getClass(), "properties", null);
        setField(term2243848, term2243848.getClass(), "implicitPrototype", null);
        setBooleanField(term2243848, term2243848.getClass(), "nativeType", false);
        setBooleanField(term2243848, term2243848.getClass(), "visited", false);
        setField(term2243848, term2243848.getClass(), "docInfo", null);
        setBooleanField(term2243848, term2243848.getClass(), "unknown", false);
        setBooleanField(term2243848, term2243848.getClass(), "resolved", false);
        setField(term2243848, term2243848.getClass(), "resolveResult", null);
        setField(term2243848, term2243848.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2243089;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2242535, args);
        assertTrue(recursiveEquals(term2242535, term2243844));
        assertTrue(recursiveEquals(term2243089, term2243848));
        assertTrue(recursiveEquals(retValue, true));
    }

};


