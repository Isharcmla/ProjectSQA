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

public class ArgumentMatchingTool_toStringEquals_165418464359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23924;
     Object term24018;

    public ArgumentMatchingTool_toStringEquals_165418464359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23924 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term24018 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term24092 = newInstance(Class.forName("org.hamcrest.core.StringStartsWith"));
        setField(term24018, term24018.getClass(), "featureDescription", null);
        setField(term24092, term24092.getClass(), "substring", "");
        setField(term24018, term24018.getClass(), "subMatcher", term24092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term24018;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term23924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


