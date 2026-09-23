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

public class FunctionType_setPrototypeNoCheck_1402626902710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712085;
     Object term712707;

    public FunctionType_setPrototypeNoCheck_1402626902710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term712709 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term712708 = ((Class) term712709).getDeclaredField((String) "INTERFACE");
        ((Field) term712708).setAccessible(true);
        Object enum1150 = ((Field) term712708).get((Object) null);
        ArrayList term712603 = new ArrayList();
        term712085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term712199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term712303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term712403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term712303, term712303.getClass(), "ownerFunction", term712403);
        setField(term712199, term712199.getClass(), "type", term712303);
        setField(term712085, term712085.getClass(), "prototypeSlot", term712199);
        setField(term712085, term712085.getClass(), "source", null);
        setField(term712085, term712085.getClass(), "kind", enum1150);
        setField(term712085, term712085.getClass(), "extendedInterfaces", term712603);
        term712707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term712707, term712707.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term712707;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term712085, args);
    }

};


