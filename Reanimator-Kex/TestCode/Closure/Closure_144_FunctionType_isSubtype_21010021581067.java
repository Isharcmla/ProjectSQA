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

public class FunctionType_isSubtype_21010021581067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1387719;
     Object term1388171;

    public FunctionType_isSubtype_21010021581067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1390057 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1390056 = ((Class) term1390057).getDeclaredField((String) "ORDINARY");
        ((Field) term1390056).setAccessible(true);
        Object enum2492 = ((Field) term1390056).get((Object) null);
        term1387719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1387975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1388063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1387719, term1387719.getClass(), "kind", enum2492);
        setField(term1387975, term1387975.getClass(), "kind", enum2492);
        setField(term1387975, term1387975.getClass(), "typeOfThis", term1388063);
        setField(term1387975, term1387975.getClass(), "call", null);
        setField(term1387719, term1387719.getClass(), "typeOfThis", term1387975);
        Class<? extends Object> term1390348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1390347 = ((Class) term1390348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1390347).setAccessible(true);
        Object enum2493 = ((Field) term1390347).get((Object) null);
        term1388171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1388353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1388595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1388171, term1388171.getClass(), "kind", enum2492);
        setField(term1388353, term1388353.getClass(), "kind", enum2493);
        setField(term1388353, term1388353.getClass(), "typeOfThis", null);
        setField(term1388353, term1388353.getClass(), "call", term1388595);
        setField(term1388171, term1388171.getClass(), "typeOfThis", term1388353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1388171;
        try {
            callMethod(klass, "isSubtype", argTypes, term1387719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


