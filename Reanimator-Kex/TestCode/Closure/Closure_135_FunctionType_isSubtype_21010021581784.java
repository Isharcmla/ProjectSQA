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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_21010021581784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2450742;
     Object term2451394;

    public FunctionType_isSubtype_21010021581784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2451726 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2451725 = ((Class) term2451726).getDeclaredField((String) "INTERFACE");
        ((Field) term2451725).setAccessible(true);
        Object enum4577 = ((Field) term2451725).get((Object) null);
        term2450742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2451286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2450742, term2450742.getClass(), "kind", enum4577);
        setField(term2450742, term2450742.getClass(), "typeOfThis", term2451286);
        Class<? extends Object> term2452020 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2452019 = ((Class) term2452020).getDeclaredField((String) "INTERFACE");
        ((Field) term2452019).setAccessible(true);
        Object enum4578 = ((Field) term2452019).get((Object) null);
        term2451394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2451724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2451394, term2451394.getClass(), "kind", enum4577);
        setField(term2451724, term2451724.getClass(), "kind", enum4578);
        setField(term2451724, term2451724.getClass(), "typeOfThis", null);
        setField(term2451394, term2451394.getClass(), "typeOfThis", term2451724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2451394;
        callMethod(klass, "isSubtype", argTypes, term2450742, args);
    }

};


