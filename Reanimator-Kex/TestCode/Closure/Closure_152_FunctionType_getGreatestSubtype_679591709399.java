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

public class FunctionType_getGreatestSubtype_679591709399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306012;
     Object term306370;

    public FunctionType_getGreatestSubtype_679591709399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term307469 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term307468 = ((Class) term307469).getDeclaredField((String) "ORDINARY");
        ((Field) term307468).setAccessible(true);
        Object enum530 = ((Field) term307468).get((Object) null);
        term306012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term306260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term306012, term306012.getClass(), "kind", enum530);
        setField(term306012, term306012.getClass(), "typeOfThis", term306260);
        Class<? extends Object> term307760 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term307759 = ((Class) term307760).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term307759).setAccessible(true);
        Object enum531 = ((Field) term307759).get((Object) null);
        term306370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term306370, term306370.getClass(), "kind", enum531);
        setField(term306370, term306370.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term306370;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term306012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


