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

public class Period_withHours_1143441258825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3499379;

    public Period_withHours_1143441258825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3499379 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3499433 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3405586 = (Object[]) newArray("org.joda.time.DurationFieldType", 182);
        int[] term3405770 = (int[]) newIntArray(504);
        setField(term3499433, term3499433.getClass(), "iTypes", term3405586);
        setField(term3499379, term3499379.getClass(), "iType", term3499433);
        setField(term3499379, term3499379.getClass(), "iValues", term3405770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term3499379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


