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

public class FunctionType_setPrototypeNoCheck_1402626902686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682138;
     Object term682698;

    public FunctionType_setPrototypeNoCheck_1402626902686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term683572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term683571 = ((Class) term683572).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term683571).setAccessible(true);
        Object enum1121 = ((Field) term683571).get((Object) null);
        term682138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term682252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term682340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term682440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term682340, term682340.getClass(), "ownerFunction", term682440);
        setField(term682252, term682252.getClass(), "type", term682340);
        setField(term682138, term682138.getClass(), "prototypeSlot", term682252);
        setField(term682138, term682138.getClass(), "source", null);
        setField(term682138, term682138.getClass(), "kind", enum1121);
        term682698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term682698, term682698.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term682698;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term682138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


