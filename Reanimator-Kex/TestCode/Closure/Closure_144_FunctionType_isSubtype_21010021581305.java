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

public class FunctionType_isSubtype_21010021581305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811677;
     Object term1812427;

    public FunctionType_isSubtype_21010021581305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1814069 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1814068 = ((Class) term1814069).getDeclaredField((String) "INTERFACE");
        ((Field) term1814068).setAccessible(true);
        Object enum3221 = ((Field) term1814068).get((Object) null);
        Class<? extends Object> term1814363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1814362 = ((Class) term1814363).getDeclaredField((String) "INTERFACE");
        ((Field) term1814362).setAccessible(true);
        Object enum3222 = ((Field) term1814362).get((Object) null);
        term1811677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1812221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1812317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1811677, term1811677.getClass(), "kind", enum3221);
        setField(term1812221, term1812221.getClass(), "kind", enum3222);
        setField(term1812221, term1812221.getClass(), "typeOfThis", term1812317);
        setField(term1811677, term1811677.getClass(), "typeOfThis", term1812221);
        Class<? extends Object> term1814657 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1814656 = ((Class) term1814657).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1814656).setAccessible(true);
        Object enum3223 = ((Field) term1814656).get((Object) null);
        term1812427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1812759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1812427, term1812427.getClass(), "kind", enum3221);
        setField(term1812759, term1812759.getClass(), "kind", enum3223);
        setField(term1812759, term1812759.getClass(), "typeOfThis", null);
        setField(term1812427, term1812427.getClass(), "typeOfThis", term1812759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1812427;
        try {
            callMethod(klass, "isSubtype", argTypes, term1811677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


