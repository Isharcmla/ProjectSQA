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
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_679591709665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672591;
     Object term673363;

    public FunctionType_getGreatestSubtype_679591709665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term674905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term674904 = ((Class) term674905).getDeclaredField((String) "INTERFACE");
        ((Field) term674904).setAccessible(true);
        Object enum1215 = ((Field) term674904).get((Object) null);
        Class<? extends Object> term675199 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term675198 = ((Class) term675199).getDeclaredField((String) "INTERFACE");
        ((Field) term675198).setAccessible(true);
        Object enum1216 = ((Field) term675198).get((Object) null);
        term672591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term673145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term673253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term672591, term672591.getClass(), "kind", enum1215);
        setField(term673145, term673145.getClass(), "kind", enum1215);
        setField(term673253, term673253.getClass(), "kind", enum1216);
        setField(term673145, term673145.getClass(), "typeOfThis", term673253);
        setField(term672591, term672591.getClass(), "typeOfThis", term673145);
        Class<? extends Object> term675493 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term675492 = ((Class) term675493).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term675492).setAccessible(true);
        Object enum1217 = ((Field) term675492).get((Object) null);
        term673363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term673537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term673637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term673363, term673363.getClass(), "kind", enum1217);
        setField(term673537, term673537.getClass(), "kind", enum1217);
        setField(term673537, term673537.getClass(), "typeOfThis", term673637);
        setField(term673363, term673363.getClass(), "typeOfThis", term673537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term673363;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term672591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


