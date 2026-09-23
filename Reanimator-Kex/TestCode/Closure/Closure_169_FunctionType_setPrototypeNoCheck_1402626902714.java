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

public class FunctionType_setPrototypeNoCheck_1402626902714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717936;
     Object term718802;

    public FunctionType_setPrototypeNoCheck_1402626902714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term719192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term719191 = ((Class) term719192).getDeclaredField((String) "INTERFACE");
        ((Field) term719191).setAccessible(true);
        Object enum1156 = ((Field) term719191).get((Object) null);
        term717936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term718050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term718154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term718254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term718154, term718154.getClass(), "ownerFunction", term718254);
        setField(term718050, term718050.getClass(), "type", term718154);
        setField(term717936, term717936.getClass(), "prototypeSlot", term718050);
        setField(term717936, term717936.getClass(), "source", null);
        setField(term717936, term717936.getClass(), "kind", enum1156);
        setBooleanField(term717936, term717936.getClass(), "unknown", false);
        setField(term717936, term717936.getClass(), "subTypes", null);
        setBooleanField(term717936, term717936.getClass(), "nativeType", false);
        ArrayList term718854 = new ArrayList();
        term718802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term719190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term718802, term718802.getClass(), "ownerFunction", null);
        setBooleanField(term718802, term718802.getClass(), "unknown", false);
        setField(term718802, term718802.getClass(), "subTypes", term718854);
        setBooleanField(term718802, term718802.getClass(), "nativeType", false);
        setField(term718802, term718802.getClass(), "kind", enum1156);
        setField(term718802, term718802.getClass(), "prototypeSlot", term719190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term718802;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term717936, args);
    }

};


