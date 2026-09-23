package org.mockito.internal.verification.argumentmatching;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArgumentMatchingTool_toStringEquals_165418464367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31705;
     Object term31799;

    public ArgumentMatchingTool_toStringEquals_165418464367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31705 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class term31941 = byte.class;
        term31799 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term31905 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        Object term32083 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setField(term31799, term31799.getClass(), "featureDescription", "java.lang.String");
        setField(term31905, term31905.getClass(), "eventClass", term31941);
        setField(term31905, term31905.getClass(), "source", term32083);
        setField(term31799, term31799.getClass(), "subMatcher", term31905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term31799;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term31705, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


