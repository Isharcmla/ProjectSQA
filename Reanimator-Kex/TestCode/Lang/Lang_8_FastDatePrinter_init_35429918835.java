package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_init_35429918835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public FastDatePrinter_init_35429918835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18506 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term18544 = newInstance(Class.forName("java.util.Locale"));
        setField(term18506, term18506.getClass(), "mPattern", null);
        setField(term18506, term18506.getClass(), "mTimeZone", null);
        setField(term18506, term18506.getClass(), "mLocale", term18544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = "L LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


