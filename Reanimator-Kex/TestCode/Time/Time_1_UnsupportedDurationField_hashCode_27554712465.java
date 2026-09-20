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

public class UnsupportedDurationField_hashCode_27554712465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12410;
     Object term12583;

    public UnsupportedDurationField_hashCode_27554712465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12410 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12530 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term12530, term12530.getClass(), "iName", "");
        setField(term12410, term12410.getClass(), "iType", term12530);
        term12583 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12584 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term12584, term12584.getClass(), "iOrdinal", (byte) 0);
        setField(term12584, term12584.getClass(), "iName", "");
        setField(term12583, term12583.getClass(), "iType", term12584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12410, args);
        assertTrue(recursiveEquals(term12410, term12583));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
