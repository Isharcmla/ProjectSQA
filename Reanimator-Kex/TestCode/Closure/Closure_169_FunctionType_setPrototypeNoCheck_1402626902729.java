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

public class FunctionType_setPrototypeNoCheck_1402626902729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741111;
     Object term741581;

    public FunctionType_setPrototypeNoCheck_1402626902729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term741993 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term741992 = ((Class) term741993).getDeclaredField((String) "ORDINARY");
        ((Field) term741992).setAccessible(true);
        Object enum1180 = ((Field) term741992).get((Object) null);
        term741111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term741225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term741329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term741329, term741329.getClass(), "ownerFunction", null);
        setField(term741225, term741225.getClass(), "type", term741329);
        setField(term741111, term741111.getClass(), "prototypeSlot", term741225);
        setField(term741111, term741111.getClass(), "source", null);
        setField(term741111, term741111.getClass(), "kind", enum1180);
        setBooleanField(term741111, term741111.getClass(), "unknown", false);
        setField(term741111, term741111.getClass(), "subTypes", null);
        setBooleanField(term741111, term741111.getClass(), "nativeType", false);
        term741581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term741769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term741877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term741991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term741581, term741581.getClass(), "ownerFunction", null);
        setBooleanField(term741581, term741581.getClass(), "unknown", false);
        setField(term741581, term741581.getClass(), "subTypes", null);
        setBooleanField(term741581, term741581.getClass(), "nativeType", false);
        setField(term741581, term741581.getClass(), "kind", enum1180);
        setBooleanField(term741877, term741877.getClass(), "unknown", false);
        setField(term741877, term741877.getClass(), "subTypes", null);
        setBooleanField(term741877, term741877.getClass(), "nativeType", false);
        setField(term741877, term741877.getClass(), "kind", enum1180);
        setField(term741877, term741877.getClass(), "prototypeSlot", term741991);
        setField(term741769, term741769.getClass(), "type", term741877);
        setField(term741581, term741581.getClass(), "prototypeSlot", term741769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term741581;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term741111, args);
    }

};


