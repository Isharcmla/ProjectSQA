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

public class FunctionType_setPrototypeBasedOn_1012666130217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110169;
     Object term110813;

    public FunctionType_setPrototypeBasedOn_1012666130217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110815 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term110814 = ((Class) term110815).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term110814).setAccessible(true);
        Object enum200 = ((Field) term110814).get((Object) null);
        term110169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term110709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setBooleanField(term110169, term110169.getClass(), "nativeType", false);
        setField(term110169, term110169.getClass(), "kind", enum200);
        setField(term110169, term110169.getClass(), "prototype", null);
        setField(term110169, term110169.getClass(), "prototypeSlot", term110709);
        setBooleanField(term110169, term110169.getClass(), "unknown", false);
        setField(term110169, term110169.getClass(), "subTypes", null);
        term110813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term110813, term110813.getClass(), "className", null);
        setField(term110813, term110813.getClass(), "ownerFunction", null);
        setBooleanField(term110813, term110813.getClass(), "unknown", false);
        setField(term110813, term110813.getClass(), "subTypes", null);
        setBooleanField(term110813, term110813.getClass(), "nativeType", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term110813;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term110169, args);
    }

};


