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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705748;
     Object term706394;

    public FunctionType_setPrototypeNoCheck_1402626902705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term706396 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term706395 = ((Class) term706396).getDeclaredField((String) "INTERFACE");
        ((Field) term706395).setAccessible(true);
        Object enum1145 = ((Field) term706395).get((Object) null);
        term705748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term705862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term705966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term706066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term706136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term705966, term705966.getClass(), "ownerFunction", term706066);
        setField(term705862, term705862.getClass(), "type", term705966);
        setField(term705748, term705748.getClass(), "prototypeSlot", term705862);
        setField(term705748, term705748.getClass(), "source", term706136);
        setField(term705748, term705748.getClass(), "kind", enum1145);
        term706394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term706394, term706394.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term706394;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term705748, args);
    }

};


