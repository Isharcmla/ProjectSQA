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
import java.util.ArrayList;

public class ArgumentMatchingTool_toStringEquals_1654184643115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82695;
     Object term82783;

    public ArgumentMatchingTool_toStringEquals_1654184643115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82695 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        ArrayList term82938 = new ArrayList();
        term82783 = newInstance(Class.forName("org.hamcrest.collection.IsArrayContaining"));
        Object term82867 = newInstance(Class.forName("org.hamcrest.beans.SamePropertyValuesAs"));
        setField(term82867, term82867.getClass(), "expectedBean", "");
        setField(term82867, term82867.getClass(), "propertyMatchers", term82938);
        setField(term82783, term82783.getClass(), "elementMatcher", term82867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term82783;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term82695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


