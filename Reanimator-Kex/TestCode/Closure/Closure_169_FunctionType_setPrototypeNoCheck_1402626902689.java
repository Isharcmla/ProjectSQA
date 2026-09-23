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

public class FunctionType_setPrototypeNoCheck_1402626902689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688255;
     Object term688013;

    public FunctionType_setPrototypeNoCheck_1402626902689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term688442 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term688441 = ((Class) term688442).getDeclaredField((String) "ORDINARY");
        ((Field) term688441).setAccessible(true);
        Object enum1128 = ((Field) term688441).get((Object) null);
        ArrayList term688440 = new ArrayList();
        term688255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term688312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term688364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term688414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term688364, term688364.getClass(), "ownerFunction", term688414);
        setField(term688312, term688312.getClass(), "type", term688364);
        setField(term688255, term688255.getClass(), "prototypeSlot", term688312);
        setField(term688255, term688255.getClass(), "source", null);
        setField(term688255, term688255.getClass(), "kind", enum1128);
        setBooleanField(term688255, term688255.getClass(), "unknown", false);
        setField(term688255, term688255.getClass(), "subTypes", term688440);
        setBooleanField(term688255, term688255.getClass(), "nativeType", false);
        term688013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term688201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term688013, term688013.getClass(), "ownerFunction", null);
        setBooleanField(term688013, term688013.getClass(), "unknown", false);
        setField(term688013, term688013.getClass(), "subTypes", null);
        setBooleanField(term688013, term688013.getClass(), "nativeType", false);
        setField(term688013, term688013.getClass(), "kind", enum1128);
        setField(term688201, term688201.getClass(), "type", term688255);
        setField(term688013, term688013.getClass(), "prototypeSlot", term688201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term688013;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term688255, args);
    }

};


