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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_setImplementedInterfaces_1966858440446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405916;
     Object term406116;

    public FunctionType_setImplementedInterfaces_1966858440446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term409844 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term409843 = ((Class) term409844).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term409843).setAccessible(true);
        Object enum673 = ((Field) term409843).get((Object) null);
        term405916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term405916, term405916.getClass(), "kind", enum673);
        Class<? extends Object> term410144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term410143 = ((Class) term410144).getDeclaredField((String) "ORDINARY");
        ((Field) term410143).setAccessible(true);
        Object enum674 =  ((Field) term410143).get((Object) null);
        Object term406524 = newInstance(Class.forName("java.lang.Object"));
        term406116 = new ArrayList();
        ((ArrayList) term406116).add(enum674);
        ((ArrayList) term406116).add(term406524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term406116;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term405916, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


