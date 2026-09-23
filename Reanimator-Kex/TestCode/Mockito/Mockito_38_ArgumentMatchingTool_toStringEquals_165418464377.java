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

public class ArgumentMatchingTool_toStringEquals_165418464377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44304;
     Object term44398;

    public ArgumentMatchingTool_toStringEquals_165418464377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44304 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term44398 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term44472 = newInstance(Class.forName("org.hamcrest.core.StringStartsWith"));
        setField(term44398, term44398.getClass(), "featureDescription", null);
        setField(term44472, term44472.getClass(), "substring", "");
        setField(term44398, term44398.getClass(), "subMatcher", term44472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term44398;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term44304, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


