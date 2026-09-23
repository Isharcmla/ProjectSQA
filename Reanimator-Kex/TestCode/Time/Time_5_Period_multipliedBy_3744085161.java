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
import java.lang.Object;
import java.lang.Integer;

public class Period_multipliedBy_3744085161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2566;
     Object term2594;
     Object term66591;
     Object term66583;

    public Period_multipliedBy_3744085161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2566 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2567 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2580 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2581 = (int[]) newIntArray(5);
        int[] term2587 = (int[]) newIntArray(6);
        setField(term2567, term2567.getClass(), "iName", "MjGYSRKTNF");
        setField(term2567, term2567.getClass(), "iTypes", term2580);
        setIntElement(term2581, 0, -2068769794);
        setIntElement(term2581, 1, -117576464);
        setIntElement(term2581, 2, -1007160944);
        setIntElement(term2581, 3, 1135664017);
        setIntElement(term2581, 4, 590364439);
        setField(term2567, term2567.getClass(), "iIndices", term2581);
        setField(term2566, term2566.getClass(), "iType", term2567);
        setField(term2566, term2566.getClass(), "iValues", term2587);
        term2594 = new Integer(96566506);
        term66591 = newInstance(Class.forName("org.joda.time.Period"));
        Object term66592 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term66595 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term66596 = (int[]) newIntArray(5);
        int[] term66597 = (int[]) newIntArray(6);
        setField(term66592, term66592.getClass(), "iName", "MjGYSRKTNF");
        setField(term66592, term66592.getClass(), "iTypes", term66595);
        setIntElement(term66596, 0, -2068769794);
        setIntElement(term66596, 1, -117576464);
        setIntElement(term66596, 2, -1007160944);
        setIntElement(term66596, 3, 1135664017);
        setIntElement(term66596, 4, 590364439);
        setField(term66592, term66592.getClass(), "iIndices", term66596);
        setField(term66591, term66591.getClass(), "iType", term66592);
        setField(term66591, term66591.getClass(), "iValues", term66597);
        term66583 = newInstance(Class.forName("org.joda.time.Period"));
        Object term66409 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term66422 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term66423 = (int[]) newIntArray(5);
        int[] term66584 = (int[]) newIntArray(6);
        setField(term66409, term66409.getClass(), "iName", "MjGYSRKTNF");
        setField(term66409, term66409.getClass(), "iTypes", term66422);
        setIntElement(term66423, 0, -2068769794);
        setIntElement(term66423, 1, -117576464);
        setIntElement(term66423, 2, -1007160944);
        setIntElement(term66423, 3, 1135664017);
        setIntElement(term66423, 4, 590364439);
        setField(term66409, term66409.getClass(), "iIndices", term66423);
        setField(term66583, term66583.getClass(), "iType", term66409);
        setField(term66583, term66583.getClass(), "iValues", term66584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2594;
        Object retValue = callMethod(klass, "multipliedBy", argTypes, term2566, args);
        assertTrue(recursiveEquals(term2566, term66591));
        assertTrue(recursiveEquals(term2594, 96566506));
        assertTrue(recursiveEquals(retValue, term66583));
    }

};


