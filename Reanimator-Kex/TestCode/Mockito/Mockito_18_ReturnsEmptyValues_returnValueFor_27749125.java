package org.mockito.internal.stubbing.defaultanswers;

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
import static org.mockito.internal.stubbing.defaultanswers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.stubbing.defaultanswers.EqualityUtils.*;
import java.lang.Object;

public class ReturnsEmptyValues_returnValueFor_27749125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;

    public ReturnsEmptyValues_returnValueFor_27749125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term5 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term6 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term4, term4.getClass(), "methodsGuru", term5);
        setField(term4, term4.getClass(), "mockUtil", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "returnValueFor", argTypes, term4, args);
    }

};


