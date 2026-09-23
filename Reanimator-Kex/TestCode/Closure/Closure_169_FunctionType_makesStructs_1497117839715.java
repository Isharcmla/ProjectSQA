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

public class FunctionType_makesStructs_1497117839715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719722;

    public FunctionType_makesStructs_1497117839715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term720346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term720345 = ((Class) term720346).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term720345).setAccessible(true);
        Object enum1157 = ((Field) term720345).get((Object) null);
        Class<? extends Object> term720646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term720645 = ((Class) term720646).getDeclaredField((String) "DICT");
        ((Field) term720645).setAccessible(true);
        Object enum1158 = ((Field) term720645).get((Object) null);
        term719722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term720144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term720244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term720344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term719722, term719722.getClass(), "kind", enum1157);
        setField(term719722, term719722.getClass(), "propAccess", enum1158);
        setField(term720244, term720244.getClass(), "implicitPrototypeFallback", term720344);
        setField(term720144, term720144.getClass(), "type", term720244);
        setField(term719722, term719722.getClass(), "prototypeSlot", term720144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makesStructs", argTypes, term719722, args);
    }

};


