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

public class FunctionType_isSubtype_2101002158977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1087301;
     Object term1087963;

    public FunctionType_isSubtype_2101002158977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1091303 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1091302 = ((Class) term1091303).getDeclaredField((String) "INTERFACE");
        ((Field) term1091302).setAccessible(true);
        Object enum2030 = ((Field) term1091302).get((Object) null);
        Class<? extends Object> term1091597 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1091596 = ((Class) term1091597).getDeclaredField((String) "INTERFACE");
        ((Field) term1091596).setAccessible(true);
        Object enum2031 = ((Field) term1091596).get((Object) null);
        term1087301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1087855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1087301, term1087301.getClass(), "kind", enum2030);
        setField(term1087855, term1087855.getClass(), "kind", enum2031);
        setField(term1087301, term1087301.getClass(), "typeOfThis", term1087855);
        term1087963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1088293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1087963, term1087963.getClass(), "kind", enum2030);
        setField(term1088293, term1088293.getClass(), "kind", enum2031);
        setField(term1087963, term1087963.getClass(), "typeOfThis", term1088293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1087963;
        try {
            callMethod(klass, "isSubtype", argTypes, term1087301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


