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
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1012666130196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97970;
     Object term98336;

    public FunctionType_setPrototypeBasedOn_1012666130196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98338 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98337 = ((Class) term98338).getDeclaredField((String) "INTERFACE");
        ((Field) term98337).setAccessible(true);
        Object enum191 = ((Field) term98337).get((Object) null);
        term97970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term98232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term97970, term97970.getClass(), "nativeType", false);
        setField(term97970, term97970.getClass(), "kind", enum191);
        setField(term97970, term97970.getClass(), "prototype", term98232);
        setField(term97970, term97970.getClass(), "prototypeSlot", null);
        term98336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term98336, term98336.getClass(), "className", null);
        setField(term98336, term98336.getClass(), "ownerFunction", null);
        setBooleanField(term98336, term98336.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term98336;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term97970, args);
    }

};


