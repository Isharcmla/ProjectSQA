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

public class FunctionType_tryMergeFunctionPiecewise_2003411845495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437788;
     Object term437609;

    public FunctionType_tryMergeFunctionPiecewise_2003411845495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term438630 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term438629 = ((Class) term438630).getDeclaredField((String) "ORDINARY");
        ((Field) term438629).setAccessible(true);
        Object enum717 = ((Field) term438629).get((Object) null);
        term437788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term437835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term437738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term437738, term437738.getClass(), "first", term437738);
        setField(term437738, term437738.getClass(), "jsType", null);
        setField(term437738, term437738.getClass(), "next", null);
        setField(term437835, term437835.getClass(), "parameters", term437738);
        setField(term437885, term437885.getClass(), "kind", enum717);
        setField(term437835, term437835.getClass(), "returnType", term437885);
        setField(term437788, term437788.getClass(), "call", term437835);
        setField(term437788, term437788.getClass(), "kind", enum717);
        term437609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term437703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term437703, term437703.getClass(), "parameters", term437738);
        setField(term437703, term437703.getClass(), "returnType", term437788);
        setField(term437609, term437609.getClass(), "call", term437703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term437609;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term437788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


