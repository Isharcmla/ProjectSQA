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

public class FunctionType_isSubtype_2101002158909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980549;
     Object term981201;

    public FunctionType_isSubtype_2101002158909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term982498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term982497 = ((Class) term982498).getDeclaredField((String) "ORDINARY");
        ((Field) term982497).setAccessible(true);
        Object enum1831 = ((Field) term982497).get((Object) null);
        term980549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term981093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term980549, term980549.getClass(), "kind", enum1831);
        setField(term981093, term981093.getClass(), "kind", enum1831);
        setField(term980549, term980549.getClass(), "typeOfThis", term981093);
        Class<? extends Object> term982789 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term982788 = ((Class) term982789).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term982788).setAccessible(true);
        Object enum1832 = ((Field) term982788).get((Object) null);
        term981201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term981531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term981201, term981201.getClass(), "kind", enum1831);
        setField(term981531, term981531.getClass(), "kind", enum1832);
        setField(term981201, term981201.getClass(), "typeOfThis", term981531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term981201;
        try {
            callMethod(klass, "isSubtype", argTypes, term980549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


