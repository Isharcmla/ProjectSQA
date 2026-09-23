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
import java.lang.Long;
import java.lang.Object;

public class Period_init_1842741909106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;
     Object term258;
     Object term260;

    public Period_init_1842741909106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = new Long(4872422362414183754L);
        term258 = new Long(6811161968424632369L);
        term260 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term273 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term274 = (int[]) newIntArray(1);
        setField(term260, term260.getClass(), "iName", "MxlszYVzRf");
        setField(term260, term260.getClass(), "iTypes", term273);
        setIntElement(term274, 0, -1588772968);
        setField(term260, term260.getClass(), "iIndices", term274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[3];
        args[0] = term256;
        args[1] = term258;
        args[2] = term260;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


