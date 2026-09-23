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

public class Period_init_824939225108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;
     Object term293;
     Object term295;

    public Period_init_824939225108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = new Long(-2813493605142626659L);
        term293 = new Long(-8885298608300233488L);
        term295 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term308 = (Object[]) newArray("org.joda.time.DurationFieldType", 9);
        int[] term309 = (int[]) newIntArray(3);
        setField(term295, term295.getClass(), "iName", "LQFpaHEwXR");
        setField(term295, term295.getClass(), "iTypes", term308);
        setIntElement(term309, 0, -93135961);
        setIntElement(term309, 1, -112921587);
        setIntElement(term309, 2, 933028652);
        setField(term295, term295.getClass(), "iIndices", term309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.joda.time.PeriodType");
        argTypes[3] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[4];
        args[0] = term291;
        args[1] = term293;
        args[2] = term295;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


