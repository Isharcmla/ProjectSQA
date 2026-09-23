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
import java.lang.NullPointerException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArgumentMatchingTool_toStringEquals_1654184643149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126519;
     Object term126607;

    public ArgumentMatchingTool_toStringEquals_1654184643149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126519 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term126607 = newInstance(Class.forName("org.hamcrest.collection.IsArrayContaining"));
        Object term126691 = newInstance(Class.forName("org.hamcrest.beans.SamePropertyValuesAs"));
        Object term126777 = newInstance(Class.forName("org.assertj.core.error.ShouldContainNull"));
        setField(term126691, term126691.getClass(), "expectedBean", term126777);
        setField(term126607, term126607.getClass(), "elementMatcher", term126691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term126607;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term126519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


