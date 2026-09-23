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
import java.lang.ClassCastException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class ArgumentMatchingTool_toStringEquals_1654184643101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68324;
     Object term68418;

    public ArgumentMatchingTool_toStringEquals_1654184643101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68324 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        StringBuilder term68632 = new StringBuilder();
        ArrayList term68572 = new ArrayList();
        ((ArrayList) term68572).add(term68632);
        term68418 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term68520 = newInstance(Class.forName("org.hamcrest.collection.IsArrayContainingInOrder"));
        setField(term68418, term68418.getClass(), "featureDescription", null);
        setField(term68520, term68520.getClass(), "matchers", term68572);
        setField(term68418, term68418.getClass(), "subMatcher", term68520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term68418;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term68324, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


