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

public class FunctionType_isSubtype_2101002158680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614309;
     Object term614565;
     Object term615764;
     Object term615768;

    public FunctionType_isSubtype_2101002158680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term615774 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term615773 = ((Class) term615774).getDeclaredField((String) "INTERFACE");
        ((Field) term615773).setAccessible(true);
        Object enum1141 = ((Field) term615773).get((Object) null);
        term614309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term614309, term614309.getClass(), "kind", enum1141);
        term614565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term614565, term614565.getClass(), "kind", enum1141);
        Class<? extends Object> term616068 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term616067 = ((Class) term616068).getDeclaredField((String) "INTERFACE");
        ((Field) term616067).setAccessible(true);
        Object enum1142 = ((Field) term616067).get((Object) null);
        term615764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term615764, term615764.getClass(), "call", null);
        setField(term615764, term615764.getClass(), "prototype", null);
        setField(term615764, term615764.getClass(), "kind", enum1142);
        setField(term615764, term615764.getClass(), "typeOfThis", null);
        setField(term615764, term615764.getClass(), "source", null);
        setField(term615764, term615764.getClass(), "implementedInterfaces", null);
        setField(term615764, term615764.getClass(), "subTypes", null);
        setField(term615764, term615764.getClass(), "templateTypeName", null);
        setField(term615764, term615764.getClass(), "className", null);
        setField(term615764, term615764.getClass(), "properties", null);
        setField(term615764, term615764.getClass(), "implicitPrototype", null);
        setBooleanField(term615764, term615764.getClass(), "nativeType", false);
        setBooleanField(term615764, term615764.getClass(), "visited", false);
        setField(term615764, term615764.getClass(), "docInfo", null);
        setBooleanField(term615764, term615764.getClass(), "unknown", false);
        setBooleanField(term615764, term615764.getClass(), "resolved", false);
        setField(term615764, term615764.getClass(), "resolveResult", null);
        setField(term615764, term615764.getClass(), "registry", null);
        Class<? extends Object> term616362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term616361 = ((Class) term616362).getDeclaredField((String) "INTERFACE");
        ((Field) term616361).setAccessible(true);
        Object enum1143 = ((Field) term616361).get((Object) null);
        term615768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term615768, term615768.getClass(), "this$0", null);
        setField(term615768, term615768.getClass(), "call", null);
        setField(term615768, term615768.getClass(), "prototype", null);
        setField(term615768, term615768.getClass(), "kind", enum1143);
        setField(term615768, term615768.getClass(), "typeOfThis", null);
        setField(term615768, term615768.getClass(), "source", null);
        setField(term615768, term615768.getClass(), "implementedInterfaces", null);
        setField(term615768, term615768.getClass(), "subTypes", null);
        setField(term615768, term615768.getClass(), "templateTypeName", null);
        setField(term615768, term615768.getClass(), "className", null);
        setField(term615768, term615768.getClass(), "properties", null);
        setField(term615768, term615768.getClass(), "implicitPrototype", null);
        setBooleanField(term615768, term615768.getClass(), "nativeType", false);
        setBooleanField(term615768, term615768.getClass(), "visited", false);
        setField(term615768, term615768.getClass(), "docInfo", null);
        setBooleanField(term615768, term615768.getClass(), "unknown", false);
        setBooleanField(term615768, term615768.getClass(), "resolved", false);
        setField(term615768, term615768.getClass(), "resolveResult", null);
        setField(term615768, term615768.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term614565;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term614309, args);
        assertTrue(recursiveEquals(term614309, term615764));
        assertTrue(recursiveEquals(term614565, term615768));
        assertTrue(recursiveEquals(retValue, true));
    }

};


