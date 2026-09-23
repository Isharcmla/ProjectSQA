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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721208;

    public FunctionType_clearCachedValues_1343537339716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term721260 = new ArrayList();
        Class<? extends Object> term721810 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term721809 = ((Class) term721810).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term721809).setAccessible(true);
        Object enum1159 = ((Field) term721809).get((Object) null);
        Class<? extends Object> term722110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term722109 = ((Class) term722110).getDeclaredField((String) "INTERFACE");
        ((Field) term722109).setAccessible(true);
        Object enum1160 = ((Field) term722109).get((Object) null);
        term721208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term721512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term721208, term721208.getClass(), "unknown", false);
        setField(term721208, term721208.getClass(), "subTypes", term721260);
        setBooleanField(term721208, term721208.getClass(), "nativeType", false);
        setField(term721208, term721208.getClass(), "kind", enum1159);
        setBooleanField(term721512, term721512.getClass(), "unknown", false);
        setField(term721512, term721512.getClass(), "subTypes", null);
        setBooleanField(term721512, term721512.getClass(), "nativeType", false);
        setField(term721512, term721512.getClass(), "kind", enum1160);
        setField(term721208, term721208.getClass(), "typeOfThis", term721512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term721208, args);
    }

};


