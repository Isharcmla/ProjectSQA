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

public class Period_withHours_1143441258779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2764023;

    public Period_withHours_1143441258779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2764023 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2764077 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2720966 = (Object[]) newArray("org.joda.time.DurationFieldType", 166);
        int[] term2721134 = (int[]) newIntArray(248);
        setField(term2764077, term2764077.getClass(), "iTypes", term2720966);
        setField(term2764023, term2764023.getClass(), "iType", term2764077);
        setField(term2764023, term2764023.getClass(), "iValues", term2721134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2764023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


