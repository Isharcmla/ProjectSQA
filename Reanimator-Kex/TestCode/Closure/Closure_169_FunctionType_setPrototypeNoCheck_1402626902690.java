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

public class FunctionType_setPrototypeNoCheck_1402626902690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689014;
     Object term689584;

    public FunctionType_setPrototypeNoCheck_1402626902690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term689882 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term689881 = ((Class) term689882).getDeclaredField((String) "ORDINARY");
        ((Field) term689881).setAccessible(true);
        Object enum1129 = ((Field) term689881).get((Object) null);
        term689014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term689128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term689232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term689332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term689232, term689232.getClass(), "ownerFunction", term689332);
        setField(term689128, term689128.getClass(), "type", term689232);
        setField(term689014, term689014.getClass(), "prototypeSlot", term689128);
        setField(term689014, term689014.getClass(), "source", null);
        setField(term689014, term689014.getClass(), "kind", enum1129);
        setBooleanField(term689014, term689014.getClass(), "unknown", false);
        setField(term689014, term689014.getClass(), "subTypes", null);
        setBooleanField(term689014, term689014.getClass(), "nativeType", false);
        term689584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term689772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term689880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term689584, term689584.getClass(), "ownerFunction", null);
        setBooleanField(term689584, term689584.getClass(), "unknown", false);
        setField(term689584, term689584.getClass(), "subTypes", null);
        setBooleanField(term689584, term689584.getClass(), "nativeType", false);
        setField(term689584, term689584.getClass(), "kind", enum1129);
        setField(term689772, term689772.getClass(), "type", term689880);
        setField(term689584, term689584.getClass(), "prototypeSlot", term689772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term689584;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term689014, args);
    }

};


