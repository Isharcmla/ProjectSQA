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

public class Week_getLastMillisecond_148080889941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8624;

    public Week_getLastMillisecond_148080889941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8624 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setShortField(term8624, term8624.getClass(), "year", (short) 0);
        setByteField(term8624, term8624.getClass(), "week", (byte) 0);
        setLongField(term8624, term8624.getClass(), "firstMillisecond", 0L);
        setLongField(term8624, term8624.getClass(), "lastMillisecond", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Calendar");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getLastMillisecond", argTypes, term8624, args);
    }

};


