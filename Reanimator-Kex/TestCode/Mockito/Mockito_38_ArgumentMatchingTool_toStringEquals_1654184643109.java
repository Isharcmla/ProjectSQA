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
import java.lang.Character;

public class ArgumentMatchingTool_toStringEquals_1654184643109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76890;
     Object term76984;

    public ArgumentMatchingTool_toStringEquals_1654184643109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76890 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class<? extends Object> term77088 = Class.forName((String) "java.lang.Class");
        Character term77178 = new Character((char) 10);
        term76984 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term77052 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term76984, term76984.getClass(), "featureDescription", null);
        setField(term77052, term77052.getClass(), "eventClass", term77088);
        setField(term77052, term77052.getClass(), "source", term77178);
        setField(term76984, term76984.getClass(), "subMatcher", term77052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term76984;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term76890, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


