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

public class FunctionType_isSubtype_2101002158443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356721;
     Object term357373;

    public FunctionType_isSubtype_2101002158443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term358387 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term358386 = ((Class) term358387).getDeclaredField((String) "ORDINARY");
        ((Field) term358386).setAccessible(true);
        Object enum649 = ((Field) term358386).get((Object) null);
        term356721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term357265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term356721, term356721.getClass(), "kind", enum649);
        setField(term356721, term356721.getClass(), "typeOfThis", term357265);
        term357373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term357695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term357373, term357373.getClass(), "kind", enum649);
        setField(term357373, term357373.getClass(), "typeOfThis", term357695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term357373;
        try {
            callMethod(klass, "isSubtype", argTypes, term356721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


