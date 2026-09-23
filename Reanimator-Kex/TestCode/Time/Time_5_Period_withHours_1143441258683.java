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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_withHours_1143441258683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732711;

    public Period_withHours_1143441258683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732711 = newInstance(Class.forName("org.joda.time.Period"));
        Object term732765 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term690536 = (Object[]) newArray("org.joda.time.DurationFieldType", 112);
        int[] term690650 = (int[]) newIntArray(365);
        setField(term732765, term732765.getClass(), "iTypes", term690536);
        setField(term732711, term732711.getClass(), "iType", term732765);
        setField(term732711, term732711.getClass(), "iValues", term690650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term732711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


