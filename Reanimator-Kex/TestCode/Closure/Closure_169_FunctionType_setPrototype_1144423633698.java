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

public class FunctionType_setPrototype_1144423633698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697767;
     Object term698095;

    public FunctionType_setPrototype_1144423633698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term698205 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term698204 = ((Class) term698205).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term698204).setAccessible(true);
        Object enum1136 = ((Field) term698204).get((Object) null);
        term697767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term697985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term697767, term697767.getClass(), "kind", enum1136);
        setField(term697767, term697767.getClass(), "typeOfThis", null);
        setField(term697767, term697767.getClass(), "prototypeSlot", null);
        setField(term697767, term697767.getClass(), "source", term697985);
        term698095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term698203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term698095, term698095.getClass(), "ownerFunction", null);
        setField(term698095, term698095.getClass(), "implicitPrototypeFallback", term698203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term698095;
        args[1] = null;
        callMethod(klass, "setPrototype", argTypes, term697767, args);
    }

};


