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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastDateParser_parseObject_172001379452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6769;

    public FastDateParser_parseObject_172001379452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6769 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term6769, term6769.getClass(), "pattern", null);
        setField(term6769, term6769.getClass(), "timeZone", null);
        setField(term6769, term6769.getClass(), "locale", null);
        setField(term6769, term6769.getClass(), "parsePattern", null);
        setField(term6769, term6769.getClass(), "strategies", null);
        setIntField(term6769, term6769.getClass(), "thisYear", 0);
        setField(term6769, term6769.getClass(), "nameValues", null);
        setField(term6769, term6769.getClass(), "currentFormatField", null);
        setField(term6769, term6769.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "parseObject", argTypes, term6769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


