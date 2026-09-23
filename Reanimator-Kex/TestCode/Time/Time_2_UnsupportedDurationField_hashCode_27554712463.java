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

public class UnsupportedDurationField_hashCode_27554712463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12046;
     Object term12219;

    public UnsupportedDurationField_hashCode_27554712463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12046 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12166 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term12166, term12166.getClass(), "iName", "");
        setField(term12046, term12046.getClass(), "iType", term12166);
        term12219 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12220 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term12220, term12220.getClass(), "iOrdinal", (byte) 0);
        setField(term12220, term12220.getClass(), "iName", "");
        setField(term12219, term12219.getClass(), "iType", term12220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12046, args);
        assertTrue(recursiveEquals(term12046, term12219));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


