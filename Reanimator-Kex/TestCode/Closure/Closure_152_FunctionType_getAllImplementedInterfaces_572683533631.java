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
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629004;

    public FunctionType_getAllImplementedInterfaces_572683533631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term630064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term630063 = ((Class) term630064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term630063).setAccessible(true);
        Object enum969 = ((Field) term630063).get((Object) null);
        Object term629422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term629422, term629422.getClass(), "referencedObjType", null);
        ArrayList term629322 = new ArrayList();
        ((ArrayList) term629322).add(term629422);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        ((ArrayList) term629322).add((Object)null);
        term629004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term629270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term629004, term629004.getClass(), "kind", enum969);
        setField(term629270, term629270.getClass(), "implicitPrototypeFallback", null);
        setField(term629004, term629004.getClass(), "prototype", term629270);
        setField(term629004, term629004.getClass(), "implementedInterfaces", term629322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term629004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


