package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class Period_seconds_154872563294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term10602;

    public Period_seconds_154872563294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = new Integer(-1087774327);
        term10602 = newInstance(Class.forName("org.joda.time.Period"));
        Object term10603 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term10614 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term10615 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10618 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10621 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10624 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10627 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10630 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10633 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10636 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term10639 = (int[]) newIntArray(8);
        int[] term10648 = (int[]) newIntArray(8);
        setField(term10603, term10603.getClass(), "iName", "Standard");
        setByteField(term10615, term10615.getClass(), "iOrdinal", (byte) 4);
        setField(term10615, term10615.getClass(), "iName", "");
        setElement(term10614, 0, term10615);
        setByteField(term10618, term10618.getClass(), "iOrdinal", (byte) 5);
        setField(term10618, term10618.getClass(), "iName", "");
        setElement(term10614, 1, term10618);
        setByteField(term10621, term10621.getClass(), "iOrdinal", (byte) 6);
        setField(term10621, term10621.getClass(), "iName", "");
        setElement(term10614, 2, term10621);
        setByteField(term10624, term10624.getClass(), "iOrdinal", (byte) 7);
        setField(term10624, term10624.getClass(), "iName", "");
        setElement(term10614, 3, term10624);
        setByteField(term10627, term10627.getClass(), "iOrdinal", (byte) 9);
        setField(term10627, term10627.getClass(), "iName", "");
        setElement(term10614, 4, term10627);
        setByteField(term10630, term10630.getClass(), "iOrdinal", (byte) 10);
        setField(term10630, term10630.getClass(), "iName", "");
        setElement(term10614, 5, term10630);
        setByteField(term10633, term10633.getClass(), "iOrdinal", (byte) 11);
        setField(term10633, term10633.getClass(), "iName", "");
        setElement(term10614, 6, term10633);
        setByteField(term10636, term10636.getClass(), "iOrdinal", (byte) 12);
        setField(term10636, term10636.getClass(), "iName", "");
        setElement(term10614, 7, term10636);
        setField(term10603, term10603.getClass(), "iTypes", term10614);
        setIntElement(term10639, 1, 1);
        setIntElement(term10639, 2, 2);
        setIntElement(term10639, 3, 3);
        setIntElement(term10639, 4, 4);
        setIntElement(term10639, 5, 5);
        setIntElement(term10639, 6, 6);
        setIntElement(term10639, 7, 7);
        setField(term10603, term10603.getClass(), "iIndices", term10639);
        setField(term10602, term10602.getClass(), "iType", term10603);
        setIntElement(term10648, 6, -1087774327);
        setField(term10602, term10602.getClass(), "iValues", term10648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107;
        Object retValue = callMethod(klass, "seconds", argTypes, null, args);
        assertTrue(recursiveEquals(term107, -1087774327));
        assertTrue(recursiveEquals(retValue, term10602));
    }

};


