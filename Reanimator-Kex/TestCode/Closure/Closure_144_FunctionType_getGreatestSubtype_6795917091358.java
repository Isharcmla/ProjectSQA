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

public class FunctionType_getGreatestSubtype_6795917091358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1909972;
     Object term1910550;

    public FunctionType_getGreatestSubtype_6795917091358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1913635 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1913634 = ((Class) term1913635).getDeclaredField((String) "ORDINARY");
        ((Field) term1913634).setAccessible(true);
        Object enum3388 = ((Field) term1913634).get((Object) null);
        term1909972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1910230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1910340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1910440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1909972, term1909972.getClass(), "kind", enum3388);
        setField(term1910230, term1910230.getClass(), "kind", enum3388);
        setField(term1910340, term1910340.getClass(), "kind", enum3388);
        setField(term1910340, term1910340.getClass(), "typeOfThis", term1910440);
        setField(term1910230, term1910230.getClass(), "typeOfThis", term1910340);
        setField(term1909972, term1909972.getClass(), "typeOfThis", term1910230);
        Class<? extends Object> term1913926 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1913925 = ((Class) term1913926).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1913925).setAccessible(true);
        Object enum3389 = ((Field) term1913925).get((Object) null);
        term1910550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1910724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1910824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1910550, term1910550.getClass(), "kind", enum3388);
        setField(term1910724, term1910724.getClass(), "kind", enum3388);
        setField(term1910824, term1910824.getClass(), "kind", enum3389);
        setField(term1910824, term1910824.getClass(), "typeOfThis", null);
        setField(term1910724, term1910724.getClass(), "typeOfThis", term1910824);
        setField(term1910550, term1910550.getClass(), "typeOfThis", term1910724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1910550;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1909972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


