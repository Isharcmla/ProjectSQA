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

public class FunctionType_tryMergeFunctionPiecewise_2003411845399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365665;
     Object term366623;

    public FunctionType_tryMergeFunctionPiecewise_2003411845399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term368375 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term368374 = ((Class) term368375).getDeclaredField((String) "ORDINARY");
        ((Field) term368374).setAccessible(true);
        Object enum619 = ((Field) term368374).get((Object) null);
        term365665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term365759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term366822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term366519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term366857, term366857.getClass(), "jsType", null);
        setField(term366892, term366892.getClass(), "jsType", null);
        setField(term366787, term366787.getClass(), "jsType", null);
        setField(term366787, term366787.getClass(), "next", term366822);
        setField(term366752, term366752.getClass(), "first", term366787);
        setField(term366752, term366752.getClass(), "jsType", null);
        setField(term366752, term366752.getClass(), "next", null);
        setField(term366892, term366892.getClass(), "next", term366752);
        setField(term366857, term366857.getClass(), "next", term366892);
        setField(term366822, term366822.getClass(), "first", term366857);
        setField(term366822, term366822.getClass(), "jsType", null);
        setField(term366927, term366927.getClass(), "jsType", null);
        setField(term366927, term366927.getClass(), "next", null);
        setField(term366822, term366822.getClass(), "next", term366927);
        setField(term365759, term365759.getClass(), "parameters", term366822);
        setBooleanField(term366279, term366279.getClass(), "unknown", false);
        setField(term366279, term366279.getClass(), "kind", enum619);
        setField(term366279, term366279.getClass(), "typeOfThis", term366519);
        setField(term365759, term365759.getClass(), "returnType", term366279);
        setField(term365665, term365665.getClass(), "call", term365759);
        Class<? extends Object> term368666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term368665 = ((Class) term368666).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term368665).setAccessible(true);
        Object enum620 = ((Field) term368665).get((Object) null);
        term366623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term366717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term367027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term366717, term366717.getClass(), "parameters", term366752);
        setBooleanField(term367027, term367027.getClass(), "unknown", false);
        setField(term367027, term367027.getClass(), "kind", enum620);
        setField(term367027, term367027.getClass(), "typeOfThis", null);
        setField(term366717, term366717.getClass(), "returnType", term367027);
        setField(term366623, term366623.getClass(), "call", term366717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term366623;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term365665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


