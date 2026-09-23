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
import java.lang.Object;

public class Period_init_129454640830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;

    public Period_init_129454640830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term436 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term437 = (int[]) newIntArray(6);
        setField(term423, term423.getClass(), "iName", "tbcdzjIfER");
        setField(term423, term423.getClass(), "iTypes", term436);
        setIntElement(term437, 0, 1655935355);
        setIntElement(term437, 1, -481533957);
        setIntElement(term437, 2, 1240914516);
        setIntElement(term437, 3, -1465035361);
        setIntElement(term437, 4, 1090617576);
        setIntElement(term437, 5, -1547384488);
        setField(term423, term423.getClass(), "iIndices", term437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadableDuration");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[2] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term423;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


