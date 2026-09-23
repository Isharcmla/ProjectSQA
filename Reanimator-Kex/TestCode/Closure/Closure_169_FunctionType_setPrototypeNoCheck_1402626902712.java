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

public class FunctionType_setPrototypeNoCheck_1402626902712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715743;
     Object term715545;

    public FunctionType_setPrototypeNoCheck_1402626902712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term715978 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term715977 = ((Class) term715978).getDeclaredField((String) "ORDINARY");
        ((Field) term715977).setAccessible(true);
        Object enum1153 = ((Field) term715977).get((Object) null);
        term715743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term715800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term715852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term715902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term715852, term715852.getClass(), "ownerFunction", term715902);
        setField(term715800, term715800.getClass(), "type", term715852);
        setField(term715743, term715743.getClass(), "prototypeSlot", term715800);
        setField(term715743, term715743.getClass(), "source", null);
        setField(term715743, term715743.getClass(), "kind", enum1153);
        setBooleanField(term715743, term715743.getClass(), "unknown", false);
        setField(term715743, term715743.getClass(), "subTypes", null);
        setBooleanField(term715743, term715743.getClass(), "nativeType", false);
        Class<? extends Object> term716269 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term716268 = ((Class) term716269).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term716268).setAccessible(true);
        Object enum1154 = ((Field) term716268).get((Object) null);
        term715545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term715545, term715545.getClass(), "ownerFunction", null);
        setBooleanField(term715545, term715545.getClass(), "unknown", false);
        setField(term715545, term715545.getClass(), "subTypes", null);
        setBooleanField(term715545, term715545.getClass(), "nativeType", false);
        setField(term715545, term715545.getClass(), "kind", enum1154);
        setField(term715545, term715545.getClass(), "typeOfThis", term715743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term715545;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term715743, args);
    }

};


