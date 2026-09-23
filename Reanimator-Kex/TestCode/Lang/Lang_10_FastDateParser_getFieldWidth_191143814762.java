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

public class FastDateParser_getFieldWidth_191143814762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9668;

    public FastDateParser_getFieldWidth_191143814762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9668 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term9668, term9668.getClass(), "pattern", null);
        setField(term9668, term9668.getClass(), "timeZone", null);
        setField(term9668, term9668.getClass(), "locale", null);
        setField(term9668, term9668.getClass(), "parsePattern", null);
        setField(term9668, term9668.getClass(), "strategies", null);
        setIntField(term9668, term9668.getClass(), "thisYear", 0);
        setField(term9668, term9668.getClass(), "nameValues", null);
        setField(term9668, term9668.getClass(), "currentFormatField", null);
        setField(term9668, term9668.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getFieldWidth", argTypes, term9668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


