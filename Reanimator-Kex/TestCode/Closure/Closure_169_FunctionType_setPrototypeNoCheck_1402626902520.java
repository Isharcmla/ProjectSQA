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

public class FunctionType_setPrototypeNoCheck_1402626902520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482106;
     Object term483100;

    public FunctionType_setPrototypeNoCheck_1402626902520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term484379 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term484378 = ((Class) term484379).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term484378).setAccessible(true);
        Object enum785 = ((Field) term484378).get((Object) null);
        ArrayList term482990 = new ArrayList();
        term482106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term482220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term482324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term482424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term482494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term482324, term482324.getClass(), "ownerFunction", term482424);
        setField(term482220, term482220.getClass(), "type", term482324);
        setField(term482106, term482106.getClass(), "prototypeSlot", term482220);
        setField(term482106, term482106.getClass(), "source", term482494);
        setField(term482106, term482106.getClass(), "kind", enum785);
        setBooleanField(term482106, term482106.getClass(), "unknown", false);
        setField(term482106, term482106.getClass(), "subTypes", term482990);
        setBooleanField(term482106, term482106.getClass(), "nativeType", false);
        term483100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term483436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term483100, term483100.getClass(), "ownerFunction", null);
        setBooleanField(term483100, term483100.getClass(), "unknown", false);
        setField(term483100, term483100.getClass(), "subTypes", null);
        setBooleanField(term483100, term483100.getClass(), "nativeType", false);
        setField(term483100, term483100.getClass(), "kind", enum785);
        setField(term483100, term483100.getClass(), "prototypeSlot", term483436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term483100;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term482106, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


