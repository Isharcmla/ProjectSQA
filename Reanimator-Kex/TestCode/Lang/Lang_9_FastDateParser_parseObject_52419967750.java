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

public class FastDateParser_parseObject_52419967750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5891;

    public FastDateParser_parseObject_52419967750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5891 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term5891, term5891.getClass(), "pattern", null);
        setField(term5891, term5891.getClass(), "timeZone", null);
        setField(term5891, term5891.getClass(), "locale", null);
        setField(term5891, term5891.getClass(), "parsePattern", null);
        setField(term5891, term5891.getClass(), "strategies", null);
        setIntField(term5891, term5891.getClass(), "thisYear", 0);
        setField(term5891, term5891.getClass(), "nameValues", null);
        setField(term5891, term5891.getClass(), "currentFormatField", null);
        setField(term5891, term5891.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseObject", argTypes, term5891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


