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

public class ArgumentMatchingTool_toStringEquals_1654184643151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129787;
     Object term129881;

    public ArgumentMatchingTool_toStringEquals_1654184643151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129787 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term130023 = Class.forName((String) "java.lang.String");
        term129881 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term129987 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        Object term130097 = newInstance(Class.forName("java.util.regex.Pattern$CIBackRef"));
        setField(term129881, term129881.getClass(), "featureDescription", "");
        setField(term129987, term129987.getClass(), "eventClass", term130023);
        setField(term129987, term129987.getClass(), "source", term130097);
        setField(term129881, term129881.getClass(), "subMatcher", term129987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term129881;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term129787, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


