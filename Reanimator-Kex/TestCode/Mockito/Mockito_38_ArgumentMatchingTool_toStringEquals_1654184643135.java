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

public class ArgumentMatchingTool_toStringEquals_1654184643135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110202;
     Object term110290;

    public ArgumentMatchingTool_toStringEquals_1654184643135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110202 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term110290 = newInstance(Class.forName("org.hamcrest.collection.IsArrayContaining"));
        Object term110374 = newInstance(Class.forName("org.hamcrest.beans.SamePropertyValuesAs"));
        Object term110484 = newInstance(Class.forName("org.assertj.core.internal.Objects$ByFieldsComparison"));
        setField(term110374, term110374.getClass(), "expectedBean", term110484);
        setField(term110290, term110290.getClass(), "elementMatcher", term110374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term110290;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term110202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


