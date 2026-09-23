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

public class FunctionType_isSubtype_2101002158837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978962;
     Object term979614;

    public FunctionType_isSubtype_2101002158837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term981189 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term981188 = ((Class) term981189).getDeclaredField((String) "ORDINARY");
        ((Field) term981188).setAccessible(true);
        Object enum1772 = ((Field) term981188).get((Object) null);
        Class<? extends Object> term981480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term981479 = ((Class) term981480).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term981479).setAccessible(true);
        Object enum1773 = ((Field) term981479).get((Object) null);
        term978962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term979506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term978962, term978962.getClass(), "kind", enum1772);
        setField(term979506, term979506.getClass(), "kind", enum1773);
        setField(term978962, term978962.getClass(), "typeOfThis", term979506);
        term979614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term979944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term979614, term979614.getClass(), "kind", enum1772);
        setField(term979944, term979944.getClass(), "kind", enum1773);
        setField(term979614, term979614.getClass(), "typeOfThis", term979944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term979614;
        try {
            callMethod(klass, "isSubtype", argTypes, term978962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


