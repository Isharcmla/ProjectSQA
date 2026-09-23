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

public class FunctionType_isSubtype_2101002158693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630656;
     Object term631112;

    public FunctionType_isSubtype_2101002158693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term634876 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term634875 = ((Class) term634876).getDeclaredField((String) "ORDINARY");
        ((Field) term634875).setAccessible(true);
        Object enum1177 = ((Field) term634875).get((Object) null);
        term630656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term630904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term631004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term630656, term630656.getClass(), "kind", enum1177);
        setField(term630904, term630904.getClass(), "kind", enum1177);
        setField(term630904, term630904.getClass(), "typeOfThis", term631004);
        setField(term630656, term630656.getClass(), "typeOfThis", term630904);
        Class<? extends Object> term635167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term635166 = ((Class) term635167).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term635166).setAccessible(true);
        Object enum1178 = ((Field) term635166).get((Object) null);
        term631112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term631294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term631112, term631112.getClass(), "kind", enum1177);
        setField(term631294, term631294.getClass(), "kind", enum1178);
        setField(term631294, term631294.getClass(), "typeOfThis", null);
        setField(term631112, term631112.getClass(), "typeOfThis", term631294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term631112;
        try {
            callMethod(klass, "isSubtype", argTypes, term630656, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


