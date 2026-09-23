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

public class FunctionType_setPrototypeNoCheck_1402626902700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700355;
     Object term700825;

    public FunctionType_setPrototypeNoCheck_1402626902700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term701271 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term701270 = ((Class) term701271).getDeclaredField((String) "ORDINARY");
        ((Field) term701270).setAccessible(true);
        Object enum1139 = ((Field) term701270).get((Object) null);
        term700355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term700469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term700573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term700573, term700573.getClass(), "ownerFunction", null);
        setField(term700469, term700469.getClass(), "type", term700573);
        setField(term700355, term700355.getClass(), "prototypeSlot", term700469);
        setField(term700355, term700355.getClass(), "source", null);
        setField(term700355, term700355.getClass(), "kind", enum1139);
        setBooleanField(term700355, term700355.getClass(), "unknown", false);
        setField(term700355, term700355.getClass(), "subTypes", null);
        setBooleanField(term700355, term700355.getClass(), "nativeType", false);
        Class<? extends Object> term701562 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term701561 = ((Class) term701562).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term701561).setAccessible(true);
        Object enum1140 = ((Field) term701561).get((Object) null);
        term700825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term701013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term701121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term700825, term700825.getClass(), "ownerFunction", null);
        setBooleanField(term700825, term700825.getClass(), "unknown", false);
        setField(term700825, term700825.getClass(), "subTypes", null);
        setBooleanField(term700825, term700825.getClass(), "nativeType", false);
        setField(term700825, term700825.getClass(), "kind", enum1139);
        setBooleanField(term701121, term701121.getClass(), "unknown", false);
        setField(term701121, term701121.getClass(), "subTypes", null);
        setBooleanField(term701121, term701121.getClass(), "nativeType", false);
        setField(term701121, term701121.getClass(), "kind", enum1140);
        setField(term701013, term701013.getClass(), "type", term701121);
        setField(term700825, term700825.getClass(), "prototypeSlot", term701013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term700825;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term700355, args);
    }

};


