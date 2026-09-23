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

public class ReturnsDeepStubs_returnsDeepStubsAnswerUsing_170130044913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public ReturnsDeepStubs_returnsDeepStubsAnswerUsing_170130044913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term34 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term35 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term36 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term37 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term38 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term39 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term40 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term34, term34.getClass(), "reporter", term35);
        setField(term34, term34.getClass(), "mockUtil", term36);
        setField(term34, term34.getClass(), "mockingProgress", term37);
        setField(term33, term33.getClass(), "mockitoCore", term34);
        setField(term38, term38.getClass(), "methodsGuru", term39);
        setField(term38, term38.getClass(), "mockUtil", term40);
        setField(term33, term33.getClass(), "delegate", term38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "returnsDeepStubsAnswerUsing", argTypes, term33, args);
    }

};


