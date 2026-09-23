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

public class FunctionType_setPrototypeNoCheck_1402626902536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506451;
     Object term507353;

    public FunctionType_setPrototypeNoCheck_1402626902536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term508632 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term508631 = ((Class) term508632).getDeclaredField((String) "INTERFACE");
        ((Field) term508631).setAccessible(true);
        Object enum830 = ((Field) term508631).get((Object) null);
        ArrayList term507249 = new ArrayList();
        term506451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term506565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term506653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term506753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term506653, term506653.getClass(), "ownerFunction", term506753);
        setField(term506565, term506565.getClass(), "type", term506653);
        setField(term506451, term506451.getClass(), "prototypeSlot", term506565);
        setField(term506451, term506451.getClass(), "source", null);
        setField(term506451, term506451.getClass(), "kind", enum830);
        setBooleanField(term506451, term506451.getClass(), "unknown", false);
        setField(term506451, term506451.getClass(), "subTypes", term507249);
        setBooleanField(term506451, term506451.getClass(), "nativeType", false);
        Class<? extends Object> term508926 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term508925 = ((Class) term508926).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term508925).setAccessible(true);
        Object enum831 = ((Field) term508925).get((Object) null);
        term507353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term507353, term507353.getClass(), "ownerFunction", null);
        setBooleanField(term507353, term507353.getClass(), "unknown", false);
        setField(term507353, term507353.getClass(), "subTypes", null);
        setBooleanField(term507353, term507353.getClass(), "nativeType", false);
        setField(term507353, term507353.getClass(), "kind", enum831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term507353;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term506451, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


