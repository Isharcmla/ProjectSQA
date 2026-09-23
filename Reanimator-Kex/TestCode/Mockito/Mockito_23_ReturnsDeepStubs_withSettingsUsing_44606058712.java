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

public class ReturnsDeepStubs_withSettingsUsing_44606058712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public ReturnsDeepStubs_withSettingsUsing_44606058712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term26 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term27 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term28 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term29 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term30 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term31 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term32 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term26, term26.getClass(), "reporter", term27);
        setField(term26, term26.getClass(), "mockUtil", term28);
        setField(term26, term26.getClass(), "mockingProgress", term29);
        setField(term25, term25.getClass(), "mockitoCore", term26);
        setField(term30, term30.getClass(), "methodsGuru", term31);
        setField(term30, term30.getClass(), "mockUtil", term32);
        setField(term25, term25.getClass(), "delegate", term30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withSettingsUsing", argTypes, term25, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


