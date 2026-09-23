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
import java.lang.String;

public class ArgumentMatchingTool_toStringEquals_165418464391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57374;
     Object term57468;

    public ArgumentMatchingTool_toStringEquals_165418464391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57374 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term57610 = Class.forName((String) "java.lang.String");
        term57468 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term57574 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        Object term57700 = newInstance(Class.forName("java.util.ArraysParallelSortHelpers$FJChar$Merger"));
        setField(term57468, term57468.getClass(), "featureDescription", "");
        setField(term57574, term57574.getClass(), "eventClass", term57610);
        setField(term57574, term57574.getClass(), "source", term57700);
        setField(term57468, term57468.getClass(), "subMatcher", term57574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term57468;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term57374, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


