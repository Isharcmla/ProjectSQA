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

public class FunctionType_setPrototypeNoCheck_1402626902726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736181;
     Object term736651;

    public FunctionType_setPrototypeNoCheck_1402626902726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term736801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term736800 = ((Class) term736801).getDeclaredField((String) "ORDINARY");
        ((Field) term736800).setAccessible(true);
        Object enum1174 = ((Field) term736800).get((Object) null);
        term736181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term736295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term736399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term736399, term736399.getClass(), "ownerFunction", null);
        setField(term736295, term736295.getClass(), "type", term736399);
        setField(term736181, term736181.getClass(), "prototypeSlot", term736295);
        setField(term736181, term736181.getClass(), "source", null);
        setField(term736181, term736181.getClass(), "kind", enum1174);
        setBooleanField(term736181, term736181.getClass(), "unknown", false);
        setField(term736181, term736181.getClass(), "subTypes", null);
        setBooleanField(term736181, term736181.getClass(), "nativeType", false);
        Class<? extends Object> term737092 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term737091 = ((Class) term737092).getDeclaredField((String) "INTERFACE");
        ((Field) term737091).setAccessible(true);
        Object enum1175 = ((Field) term737091).get((Object) null);
        term736651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term736651, term736651.getClass(), "ownerFunction", null);
        setBooleanField(term736651, term736651.getClass(), "unknown", false);
        setField(term736651, term736651.getClass(), "subTypes", null);
        setBooleanField(term736651, term736651.getClass(), "nativeType", false);
        setField(term736651, term736651.getClass(), "kind", enum1175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term736651;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term736181, args);
    }

};


