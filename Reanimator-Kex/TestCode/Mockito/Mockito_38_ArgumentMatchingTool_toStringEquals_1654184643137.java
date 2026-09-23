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

public class ArgumentMatchingTool_toStringEquals_1654184643137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112177;
     Object term112265;

    public ArgumentMatchingTool_toStringEquals_1654184643137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112177 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term112265 = newInstance(Class.forName("org.hamcrest.collection.IsArrayContaining"));
        Object term112349 = newInstance(Class.forName("org.hamcrest.beans.SamePropertyValuesAs"));
        Object term112457 = newInstance(Class.forName("org.assertj.core.error.ShouldHaveOnlyElementsOfType"));
        setField(term112349, term112349.getClass(), "expectedBean", term112457);
        setField(term112265, term112265.getClass(), "elementMatcher", term112349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term112265;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term112177, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


