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

public class FunctionType_isSubtype_2101002158872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912134;
     Object term912884;

    public FunctionType_isSubtype_2101002158872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term915994 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term915993 = ((Class) term915994).getDeclaredField((String) "INTERFACE");
        ((Field) term915993).setAccessible(true);
        Object enum1704 = ((Field) term915993).get((Object) null);
        term912134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term913008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term913205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term912134, term912134.getClass(), "kind", enum1704);
        setField(term913008, term913008.getClass(), "kind", enum1704);
        setField(term913008, term913008.getClass(), "typeOfThis", term913205);
        setField(term912134, term912134.getClass(), "typeOfThis", term913008);
        Class<? extends Object> term916288 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term916287 = ((Class) term916288).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term916287).setAccessible(true);
        Object enum1705 = ((Field) term916287).get((Object) null);
        term912884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term912884, term912884.getClass(), "kind", enum1705);
        setField(term912884, term912884.getClass(), "typeOfThis", term913008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term912884;
        try {
            callMethod(klass, "isSubtype", argTypes, term912134, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


