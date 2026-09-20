package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;

public class UnsupportedDurationField_getName_136697030551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9438;
     Object term9564;

    public UnsupportedDurationField_getName_136697030551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9438 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term9558 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term9438, term9438.getClass(), "iType", term9558);
        term9564 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term9565 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term9565, term9565.getClass(), "iOrdinal", (byte) 0);
        setField(term9565, term9565.getClass(), "iName", null);
        setField(term9564, term9564.getClass(), "iType", term9565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term9438, args);
        assertTrue(recursiveEquals(term9438, term9564));
        assertTrue(recursiveEquals(retValue, null));
    }

};
