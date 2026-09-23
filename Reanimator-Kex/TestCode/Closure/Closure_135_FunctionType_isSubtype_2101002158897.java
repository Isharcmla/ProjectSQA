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

public class FunctionType_isSubtype_2101002158897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955753;
     Object term956405;

    public FunctionType_isSubtype_2101002158897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term957771 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term957770 = ((Class) term957771).getDeclaredField((String) "INTERFACE");
        ((Field) term957770).setAccessible(true);
        Object enum1784 = ((Field) term957770).get((Object) null);
        Class<? extends Object> term958065 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term958064 = ((Class) term958065).getDeclaredField((String) "INTERFACE");
        ((Field) term958064).setAccessible(true);
        Object enum1785 = ((Field) term958064).get((Object) null);
        term955753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term956297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term955753, term955753.getClass(), "kind", enum1784);
        setField(term956297, term956297.getClass(), "kind", enum1785);
        setField(term955753, term955753.getClass(), "typeOfThis", term956297);
        term956405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term956735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term956405, term956405.getClass(), "kind", enum1784);
        setField(term956735, term956735.getClass(), "kind", enum1785);
        setField(term956405, term956405.getClass(), "typeOfThis", term956735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term956405;
        try {
            callMethod(klass, "isSubtype", argTypes, term955753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


