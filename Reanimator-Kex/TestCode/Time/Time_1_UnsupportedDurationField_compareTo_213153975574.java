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

public class UnsupportedDurationField_compareTo_213153975574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13374;
     Object term13490;
     Object term13692;
     Object term13693;

    public UnsupportedDurationField_compareTo_213153975574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13374 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term13490 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        term13692 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term13692, term13692.getClass(), "iType", null);
        term13693 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term13693, term13693.getClass(), "iField", null);
        setBooleanField(term13693, term13693.getClass(), "iTimeField", false);
        setField(term13693, term13693.getClass(), "iZone", null);
        setField(term13693, term13693.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[1];
        args[0] = term13490;
        Object retValue = callMethod(klass, "compareTo", argTypes, term13374, args);
        assertTrue(recursiveEquals(term13374, term13692));
        assertTrue(recursiveEquals(term13490, term13693));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
