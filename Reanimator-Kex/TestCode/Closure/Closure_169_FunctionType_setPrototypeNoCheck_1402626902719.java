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

public class FunctionType_setPrototypeNoCheck_1402626902719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725356;
     Object term725926;

    public FunctionType_setPrototypeNoCheck_1402626902719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term726184 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term726183 = ((Class) term726184).getDeclaredField((String) "ORDINARY");
        ((Field) term726183).setAccessible(true);
        Object enum1164 = ((Field) term726183).get((Object) null);
        term725356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term725470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term725574 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term725674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term725574, term725574.getClass(), "ownerFunction", term725674);
        setField(term725470, term725470.getClass(), "type", term725574);
        setField(term725356, term725356.getClass(), "prototypeSlot", term725470);
        setField(term725356, term725356.getClass(), "source", null);
        setField(term725356, term725356.getClass(), "kind", enum1164);
        setBooleanField(term725356, term725356.getClass(), "unknown", false);
        setField(term725356, term725356.getClass(), "subTypes", null);
        setBooleanField(term725356, term725356.getClass(), "nativeType", false);
        Class<? extends Object> term726475 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term726474 = ((Class) term726475).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term726474).setAccessible(true);
        Object enum1165 = ((Field) term726474).get((Object) null);
        term725926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term726182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term725926, term725926.getClass(), "ownerFunction", null);
        setBooleanField(term725926, term725926.getClass(), "unknown", false);
        setField(term725926, term725926.getClass(), "subTypes", null);
        setBooleanField(term725926, term725926.getClass(), "nativeType", false);
        setField(term725926, term725926.getClass(), "kind", enum1165);
        setField(term725926, term725926.getClass(), "typeOfThis", term726182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term725926;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term725356, args);
    }

};


