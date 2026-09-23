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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567990;
     Object term568984;

    public FunctionType_setPrototypeNoCheck_1402626902594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term569903 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term569902 = ((Class) term569903).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term569902).setAccessible(true);
        Object enum929 = ((Field) term569902).get((Object) null);
        ArrayList term568874 = new ArrayList();
        term567990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term568104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term568208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term568308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term568378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term568208, term568208.getClass(), "ownerFunction", term568308);
        setField(term568104, term568104.getClass(), "type", term568208);
        setField(term567990, term567990.getClass(), "prototypeSlot", term568104);
        setField(term567990, term567990.getClass(), "source", term568378);
        setField(term567990, term567990.getClass(), "kind", enum929);
        setBooleanField(term567990, term567990.getClass(), "unknown", false);
        setField(term567990, term567990.getClass(), "subTypes", term568874);
        setBooleanField(term567990, term567990.getClass(), "nativeType", false);
        term568984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term568984, term568984.getClass(), "ownerFunction", null);
        setBooleanField(term568984, term568984.getClass(), "unknown", false);
        setField(term568984, term568984.getClass(), "subTypes", null);
        setBooleanField(term568984, term568984.getClass(), "nativeType", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term568984;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term567990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


