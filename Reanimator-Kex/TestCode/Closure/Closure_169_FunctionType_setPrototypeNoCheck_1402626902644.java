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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622891;
     Object term623521;

    public FunctionType_setPrototypeNoCheck_1402626902644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term625510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term625509 = ((Class) term625510).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term625509).setAccessible(true);
        Object enum1019 = ((Field) term625509).get((Object) null);
        term622891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term623005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term623093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term623193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term623263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term623093, term623093.getClass(), "ownerFunction", term623193);
        setField(term623005, term623005.getClass(), "type", term623093);
        setField(term622891, term622891.getClass(), "prototypeSlot", term623005);
        setField(term622891, term622891.getClass(), "source", term623263);
        setField(term622891, term622891.getClass(), "kind", enum1019);
        term623521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term623629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term623521, term623521.getClass(), "ownerFunction", null);
        setField(term623521, term623521.getClass(), "implicitPrototypeFallback", term623629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term623521;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term622891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


