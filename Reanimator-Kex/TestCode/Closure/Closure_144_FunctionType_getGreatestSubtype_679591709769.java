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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_679591709769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862223;
     Object term862793;

    public FunctionType_getGreatestSubtype_679591709769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term864401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term864400 = ((Class) term864401).getDeclaredField((String) "ORDINARY");
        ((Field) term864400).setAccessible(true);
        Object enum1559 = ((Field) term864400).get((Object) null);
        term862223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term862481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term862589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term862683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term862223, term862223.getClass(), "kind", enum1559);
        setField(term862481, term862481.getClass(), "kind", enum1559);
        setField(term862589, term862589.getClass(), "kind", enum1559);
        setField(term862589, term862589.getClass(), "typeOfThis", term862683);
        setField(term862481, term862481.getClass(), "typeOfThis", term862589);
        setField(term862223, term862223.getClass(), "typeOfThis", term862481);
        Class<? extends Object> term864692 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term864691 = ((Class) term864692).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term864691).setAccessible(true);
        Object enum1560 = ((Field) term864691).get((Object) null);
        term862793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term862967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term863067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term862793, term862793.getClass(), "kind", enum1559);
        setField(term862967, term862967.getClass(), "kind", enum1559);
        setField(term863067, term863067.getClass(), "kind", enum1560);
        setField(term863067, term863067.getClass(), "typeOfThis", null);
        setField(term862967, term862967.getClass(), "typeOfThis", term863067);
        setField(term862793, term862793.getClass(), "typeOfThis", term862967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term862793;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term862223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


