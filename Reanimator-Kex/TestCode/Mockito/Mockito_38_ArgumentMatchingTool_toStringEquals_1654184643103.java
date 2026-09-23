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

public class ArgumentMatchingTool_toStringEquals_1654184643103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71177;
     Object term71271;

    public ArgumentMatchingTool_toStringEquals_1654184643103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71177 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term71413 = Class.forName((String) "java.lang.Appendable");
        term71271 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term71377 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        Object term71508 = newInstance(Class.forName("org.assertj.core.internal.cglib.core.CodeEmitter$State"));
        setField(term71271, term71271.getClass(), "featureDescription", "");
        setField(term71377, term71377.getClass(), "eventClass", term71413);
        setField(term71377, term71377.getClass(), "source", term71508);
        setField(term71271, term71271.getClass(), "subMatcher", term71377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term71271;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term71177, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


