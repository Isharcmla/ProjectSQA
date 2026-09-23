package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Week_getSerialIndex_77336305814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;

    public Week_getSerialIndex_77336305814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setShortField(term805, term805.getClass(), "year", (short) 2026);
        setByteField(term805, term805.getClass(), "week", (byte) 39);
        setLongField(term805, term805.getClass(), "firstMillisecond", 1789887600000L);
        setLongField(term805, term805.getClass(), "lastMillisecond", 1790492399999L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSerialIndex", argTypes, term805, args);
    }

};


