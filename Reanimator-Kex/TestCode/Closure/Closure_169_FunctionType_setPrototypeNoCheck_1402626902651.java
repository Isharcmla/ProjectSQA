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

public class FunctionType_setPrototypeNoCheck_1402626902651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631188;
     Object term631758;

    public FunctionType_setPrototypeNoCheck_1402626902651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term633913 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term633912 = ((Class) term633913).getDeclaredField((String) "ORDINARY");
        ((Field) term633912).setAccessible(true);
        Object enum1033 = ((Field) term633912).get((Object) null);
        term631188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term631302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term631406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term631506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term631406, term631406.getClass(), "ownerFunction", term631506);
        setField(term631302, term631302.getClass(), "type", term631406);
        setField(term631188, term631188.getClass(), "prototypeSlot", term631302);
        setField(term631188, term631188.getClass(), "source", null);
        setField(term631188, term631188.getClass(), "kind", enum1033);
        setBooleanField(term631188, term631188.getClass(), "unknown", false);
        setField(term631188, term631188.getClass(), "subTypes", null);
        setBooleanField(term631188, term631188.getClass(), "nativeType", false);
        Class<? extends Object> term634204 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term634203 = ((Class) term634204).getDeclaredField((String) "INTERFACE");
        ((Field) term634203).setAccessible(true);
        Object enum1034 = ((Field) term634203).get((Object) null);
        term631758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term631758, term631758.getClass(), "ownerFunction", null);
        setBooleanField(term631758, term631758.getClass(), "unknown", false);
        setField(term631758, term631758.getClass(), "subTypes", null);
        setBooleanField(term631758, term631758.getClass(), "nativeType", false);
        setField(term631758, term631758.getClass(), "kind", enum1034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term631758;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term631188, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


