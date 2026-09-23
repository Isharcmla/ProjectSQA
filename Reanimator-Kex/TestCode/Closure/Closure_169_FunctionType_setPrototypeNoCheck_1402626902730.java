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

public class FunctionType_setPrototypeNoCheck_1402626902730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742554;
     Object term743020;

    public FunctionType_setPrototypeNoCheck_1402626902730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term743022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term743021 = ((Class) term743022).getDeclaredField((String) "ORDINARY");
        ((Field) term743021).setAccessible(true);
        Object enum1181 = ((Field) term743021).get((Object) null);
        term742554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term742668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term742768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term742768, term742768.getClass(), "ownerFunction", term742554);
        setField(term742668, term742668.getClass(), "type", term742768);
        setField(term742554, term742554.getClass(), "prototypeSlot", term742668);
        setField(term742554, term742554.getClass(), "source", null);
        setField(term742554, term742554.getClass(), "kind", enum1181);
        setBooleanField(term742554, term742554.getClass(), "unknown", false);
        setField(term742554, term742554.getClass(), "subTypes", null);
        setBooleanField(term742554, term742554.getClass(), "nativeType", false);
        term743020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term743020, term743020.getClass(), "ownerFunction", null);
        setBooleanField(term743020, term743020.getClass(), "unknown", false);
        setField(term743020, term743020.getClass(), "subTypes", null);
        setBooleanField(term743020, term743020.getClass(), "nativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term743020;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term742554, args);
    }

};


