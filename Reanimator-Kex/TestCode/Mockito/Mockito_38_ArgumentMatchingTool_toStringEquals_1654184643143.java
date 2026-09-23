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
import java.lang.String;
import java.lang.Character;

public class ArgumentMatchingTool_toStringEquals_1654184643143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119571;
     Object term119665;

    public ArgumentMatchingTool_toStringEquals_1654184643143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119571 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term119769 = Class.forName((String) "kex.java.lang.Character");
        Character term119859 = new Character((char) 13);
        term119665 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term119733 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term119665, term119665.getClass(), "featureDescription", null);
        setField(term119733, term119733.getClass(), "eventClass", term119769);
        setField(term119733, term119733.getClass(), "source", term119859);
        setField(term119665, term119665.getClass(), "subMatcher", term119733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term119665;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term119571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


