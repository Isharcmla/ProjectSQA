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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734232;
     Object term735198;

    public FunctionType_setPrototypeNoCheck_1402626902725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term735274 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term735273 = ((Class) term735274).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term735273).setAccessible(true);
        Object enum1172 = ((Field) term735273).get((Object) null);
        ArrayList term735088 = new ArrayList();
        term734232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term734346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term734434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term734522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term734592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term734434, term734434.getClass(), "ownerFunction", term734522);
        setField(term734346, term734346.getClass(), "type", term734434);
        setField(term734232, term734232.getClass(), "prototypeSlot", term734346);
        setField(term734232, term734232.getClass(), "source", term734592);
        setField(term734232, term734232.getClass(), "kind", enum1172);
        setBooleanField(term734232, term734232.getClass(), "unknown", false);
        setField(term734232, term734232.getClass(), "subTypes", term735088);
        setBooleanField(term734232, term734232.getClass(), "nativeType", false);
        Class<? extends Object> term735574 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term735573 = ((Class) term735574).getDeclaredField((String) "INTERFACE");
        ((Field) term735573).setAccessible(true);
        Object enum1173 = ((Field) term735573).get((Object) null);
        term735198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term735198, term735198.getClass(), "ownerFunction", null);
        setBooleanField(term735198, term735198.getClass(), "unknown", false);
        setField(term735198, term735198.getClass(), "subTypes", null);
        setBooleanField(term735198, term735198.getClass(), "nativeType", false);
        setField(term735198, term735198.getClass(), "kind", enum1173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term735198;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term734232, args);
    }

};


