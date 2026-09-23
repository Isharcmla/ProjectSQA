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

public class FunctionType_setPrototypeNoCheck_1402626902718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723580;
     Object term724040;

    public FunctionType_setPrototypeNoCheck_1402626902718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term724486 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724485 = ((Class) term724486).getDeclaredField((String) "ORDINARY");
        ((Field) term724485).setAccessible(true);
        Object enum1162 = ((Field) term724485).get((Object) null);
        term723580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term723694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term723782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term723782, term723782.getClass(), "ownerFunction", term723580);
        setField(term723694, term723694.getClass(), "type", term723782);
        setField(term723580, term723580.getClass(), "prototypeSlot", term723694);
        setField(term723580, term723580.getClass(), "source", null);
        setField(term723580, term723580.getClass(), "kind", enum1162);
        setBooleanField(term723580, term723580.getClass(), "unknown", false);
        setField(term723580, term723580.getClass(), "subTypes", null);
        setBooleanField(term723580, term723580.getClass(), "nativeType", false);
        Class<? extends Object> term724777 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724776 = ((Class) term724777).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term724776).setAccessible(true);
        Object enum1163 = ((Field) term724776).get((Object) null);
        term724040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term724296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term724484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term724040, term724040.getClass(), "ownerFunction", null);
        setBooleanField(term724040, term724040.getClass(), "unknown", false);
        setField(term724040, term724040.getClass(), "subTypes", null);
        setBooleanField(term724040, term724040.getClass(), "nativeType", false);
        setField(term724040, term724040.getClass(), "kind", enum1163);
        setBooleanField(term724296, term724296.getClass(), "unknown", false);
        setField(term724296, term724296.getClass(), "subTypes", null);
        setBooleanField(term724296, term724296.getClass(), "nativeType", false);
        setField(term724296, term724296.getClass(), "kind", enum1162);
        setField(term724296, term724296.getClass(), "prototypeSlot", null);
        setField(term724040, term724040.getClass(), "typeOfThis", term724296);
        setField(term724040, term724040.getClass(), "prototypeSlot", term724484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term724040;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term723580, args);
    }

};


