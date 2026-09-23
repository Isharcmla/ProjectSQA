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

public class FunctionType_isSubtype_2101002158795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789908;
     Object term790668;

    public FunctionType_isSubtype_2101002158795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term792387 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term792386 = ((Class) term792387).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term792386).setAccessible(true);
        Object enum1476 = ((Field) term792386).get((Object) null);
        Class<? extends Object> term792687 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term792686 = ((Class) term792687).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term792686).setAccessible(true);
        Object enum1477 = ((Field) term792686).get((Object) null);
        term789908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term790460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term790560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term789908, term789908.getClass(), "kind", enum1476);
        setField(term790460, term790460.getClass(), "kind", enum1477);
        setField(term790460, term790460.getClass(), "typeOfThis", term790560);
        setField(term789908, term789908.getClass(), "typeOfThis", term790460);
        term790668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term790998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term791104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term790668, term790668.getClass(), "kind", enum1476);
        setField(term790998, term790998.getClass(), "kind", enum1477);
        setField(term790998, term790998.getClass(), "typeOfThis", term791104);
        setField(term790668, term790668.getClass(), "typeOfThis", term790998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term790668;
        try {
            callMethod(klass, "isSubtype", argTypes, term789908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


