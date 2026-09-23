package org.mockito.internal.creation;

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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.creation.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class DelegatingMethod_getReturnType_170445936216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2138;

    public DelegatingMethod_getReturnType_170445936216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5678 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldStaticReadWrite");
        Class<? extends Object> term5980 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldStaticReadWrite");
        Class term5988 = float.class;
        Object[] term5989 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term5989, 0, term5980);
        setElement(term5989, 1, term5988);
        Method term2139 = ((Class) term5678).getDeclaredMethod((String) "setVolatile", (Class[]) term5989);
        ((Method) term2139).setAccessible(false);
        term2138 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term2138, term2138.getClass(), "method", term2139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnType", argTypes, term2138, args);
    }

};


