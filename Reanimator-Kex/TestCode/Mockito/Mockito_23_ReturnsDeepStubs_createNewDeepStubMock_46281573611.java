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
import java.lang.NullPointerException;
import static org.mockito.internal.stubbing.defaultanswers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReturnsDeepStubs_createNewDeepStubMock_46281573611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public ReturnsDeepStubs_createNewDeepStubMock_46281573611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term18 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term19 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term20 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term21 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term22 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term23 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term24 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term18, term18.getClass(), "reporter", term19);
        setField(term18, term18.getClass(), "mockUtil", term20);
        setField(term18, term18.getClass(), "mockingProgress", term21);
        setField(term17, term17.getClass(), "mockitoCore", term18);
        setField(term22, term22.getClass(), "methodsGuru", term23);
        setField(term22, term22.getClass(), "mockUtil", term24);
        setField(term17, term17.getClass(), "delegate", term22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createNewDeepStubMock", argTypes, term17, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


