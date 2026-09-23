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

public class FunctionType_setPrototypeNoCheck_1402626902733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746031;
     Object term746681;

    public FunctionType_setPrototypeNoCheck_1402626902733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term747087 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term747086 = ((Class) term747087).getDeclaredField((String) "ORDINARY");
        ((Field) term747086).setAccessible(true);
        Object enum1184 = ((Field) term747086).get((Object) null);
        term746031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term746145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term746249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term746353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term746423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term746249, term746249.getClass(), "ownerFunction", term746353);
        setField(term746145, term746145.getClass(), "type", term746249);
        setField(term746031, term746031.getClass(), "prototypeSlot", term746145);
        setField(term746031, term746031.getClass(), "source", term746423);
        setField(term746031, term746031.getClass(), "kind", enum1184);
        setBooleanField(term746031, term746031.getClass(), "unknown", false);
        setField(term746031, term746031.getClass(), "subTypes", null);
        setBooleanField(term746031, term746031.getClass(), "nativeType", false);
        Class<? extends Object> term747378 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term747377 = ((Class) term747378).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term747377).setAccessible(true);
        Object enum1185 = ((Field) term747377).get((Object) null);
        Class<? extends Object> term747678 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term747677 = ((Class) term747678).getDeclaredField((String) "INTERFACE");
        ((Field) term747677).setAccessible(true);
        Object enum1186 = ((Field) term747677).get((Object) null);
        term746681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term746937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term746681, term746681.getClass(), "ownerFunction", null);
        setBooleanField(term746681, term746681.getClass(), "unknown", false);
        setField(term746681, term746681.getClass(), "subTypes", null);
        setBooleanField(term746681, term746681.getClass(), "nativeType", false);
        setField(term746681, term746681.getClass(), "kind", enum1185);
        setBooleanField(term746937, term746937.getClass(), "unknown", false);
        setField(term746937, term746937.getClass(), "subTypes", null);
        setBooleanField(term746937, term746937.getClass(), "nativeType", false);
        setField(term746937, term746937.getClass(), "kind", enum1186);
        setField(term746681, term746681.getClass(), "typeOfThis", term746937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term746681;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term746031, args);
    }

};


