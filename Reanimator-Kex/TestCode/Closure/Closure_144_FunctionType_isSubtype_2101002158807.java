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

public class FunctionType_isSubtype_2101002158807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927223;
     Object term927875;

    public FunctionType_isSubtype_2101002158807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term928820 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term928819 = ((Class) term928820).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term928819).setAccessible(true);
        Object enum1680 = ((Field) term928819).get((Object) null);
        term927223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term927767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term927223, term927223.getClass(), "kind", enum1680);
        setField(term927223, term927223.getClass(), "typeOfThis", term927767);
        term927875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term928205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term927875, term927875.getClass(), "kind", enum1680);
        setField(term927875, term927875.getClass(), "typeOfThis", term928205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term927875;
        try {
            callMethod(klass, "isSubtype", argTypes, term927223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


