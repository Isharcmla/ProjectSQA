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
import java.lang.Long;
import java.lang.Object;

public class Period_init_91175019918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term215;

    public Period_init_91175019918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = new Long(-8400487765614892086L);
        term215 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term228 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term229 = (int[]) newIntArray(6);
        setField(term215, term215.getClass(), "iName", "uuaPigETmJ");
        setField(term215, term215.getClass(), "iTypes", term228);
        setIntElement(term229, 0, 1596070772);
        setIntElement(term229, 1, 97029295);
        setIntElement(term229, 2, -1371869594);
        setIntElement(term229, 3, -2095575670);
        setIntElement(term229, 4, 1225272962);
        setIntElement(term229, 5, 1324040357);
        setField(term215, term215.getClass(), "iIndices", term229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = term213;
        args[1] = term215;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


