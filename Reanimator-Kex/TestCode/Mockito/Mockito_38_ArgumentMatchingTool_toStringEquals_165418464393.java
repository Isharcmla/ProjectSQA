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
import java.lang.Character;

public class ArgumentMatchingTool_toStringEquals_165418464393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59852;
     Object term59946;

    public ArgumentMatchingTool_toStringEquals_165418464393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59852 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class term60050 = char.class;
        Character term60140 = new Character((char) 0);
        term59946 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term60014 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term59946, term59946.getClass(), "featureDescription", null);
        setField(term60014, term60014.getClass(), "eventClass", term60050);
        setField(term60014, term60014.getClass(), "source", term60140);
        setField(term59946, term59946.getClass(), "subMatcher", term60014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term59946;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term59852, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


