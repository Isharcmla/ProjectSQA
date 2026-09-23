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

public class Week_getFirstMillisecond_154440212934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8589;

    public Week_getFirstMillisecond_154440212934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8589 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setShortField(term8589, term8589.getClass(), "year", (short) 0);
        setByteField(term8589, term8589.getClass(), "week", (byte) 0);
        setLongField(term8589, term8589.getClass(), "firstMillisecond", 0L);
        setLongField(term8589, term8589.getClass(), "lastMillisecond", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstMillisecond", argTypes, term8589, args);
    }

};


