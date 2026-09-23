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

public class ArgumentMatchingTool_toStringEquals_1654184643123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90917;
     Object term91011;

    public ArgumentMatchingTool_toStringEquals_1654184643123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90917 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class term91115 = byte.class;
        term91011 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term91079 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        Object term91225 = newInstance(Class.forName("java.util.regex.Pattern$CIBackRef"));
        setField(term91011, term91011.getClass(), "featureDescription", null);
        setField(term91079, term91079.getClass(), "eventClass", term91115);
        setField(term91079, term91079.getClass(), "source", term91225);
        setField(term91011, term91011.getClass(), "subMatcher", term91079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term91011;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term90917, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


