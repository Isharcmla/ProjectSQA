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

public class FunctionType_isSubtype_2101002158497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426487;
     Object term427139;

    public FunctionType_isSubtype_2101002158497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term428159 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term428158 = ((Class) term428159).getDeclaredField((String) "ORDINARY");
        ((Field) term428158).setAccessible(true);
        Object enum776 = ((Field) term428158).get((Object) null);
        term426487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term427031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term426487, term426487.getClass(), "kind", enum776);
        setField(term426487, term426487.getClass(), "typeOfThis", term427031);
        term427139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term427467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term427139, term427139.getClass(), "kind", enum776);
        setField(term427139, term427139.getClass(), "typeOfThis", term427467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term427139;
        try {
            callMethod(klass, "isSubtype", argTypes, term426487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


