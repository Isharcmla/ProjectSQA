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

public class FunctionType_setPrototypeNoCheck_1402626902678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672917;
     Object term673461;

    public FunctionType_setPrototypeNoCheck_1402626902678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term674802 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term674801 = ((Class) term674802).getDeclaredField((String) "ORDINARY");
        ((Field) term674801).setAccessible(true);
        Object enum1107 = ((Field) term674801).get((Object) null);
        term672917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term673031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term673139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term673209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term673139, term673139.getClass(), "ownerFunction", null);
        setField(term673031, term673031.getClass(), "type", term673139);
        setField(term672917, term672917.getClass(), "prototypeSlot", term673031);
        setField(term672917, term672917.getClass(), "source", term673209);
        setField(term672917, term672917.getClass(), "kind", enum1107);
        setBooleanField(term672917, term672917.getClass(), "unknown", false);
        setField(term672917, term672917.getClass(), "subTypes", null);
        setBooleanField(term672917, term672917.getClass(), "nativeType", false);
        Class<? extends Object> term675093 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term675092 = ((Class) term675093).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term675092).setAccessible(true);
        Object enum1108 = ((Field) term675092).get((Object) null);
        term673461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term673461, term673461.getClass(), "ownerFunction", null);
        setBooleanField(term673461, term673461.getClass(), "unknown", false);
        setField(term673461, term673461.getClass(), "subTypes", null);
        setBooleanField(term673461, term673461.getClass(), "nativeType", false);
        setField(term673461, term673461.getClass(), "kind", enum1108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term673461;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term672917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


