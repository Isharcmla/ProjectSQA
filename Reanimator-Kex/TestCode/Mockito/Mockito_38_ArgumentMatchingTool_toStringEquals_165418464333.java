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
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArgumentMatchingTool_toStringEquals_165418464333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12193;
     Object term12287;

    public ArgumentMatchingTool_toStringEquals_165418464333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12193 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term12287 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term12377 = newInstance(Class.forName("org.hamcrest.collection.IsIterableWithSize"));
        setField(term12287, term12287.getClass(), "featureDescription", null);
        setField(term12377, term12377.getClass(), "featureDescription", null);
        setField(term12377, term12377.getClass(), "subMatcher", term12287);
        setField(term12287, term12287.getClass(), "subMatcher", term12377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term12287;
        args[1] = null;
        callMethod(klass, "toStringEquals", argTypes, term12193, args);
    }

};


