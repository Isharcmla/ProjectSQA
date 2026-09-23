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

public class FastDateParser_parse_26415989853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7348;

    public FastDateParser_parse_26415989853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7348 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term7348, term7348.getClass(), "pattern", null);
        setField(term7348, term7348.getClass(), "timeZone", null);
        setField(term7348, term7348.getClass(), "locale", null);
        setField(term7348, term7348.getClass(), "parsePattern", null);
        setField(term7348, term7348.getClass(), "strategies", null);
        setIntField(term7348, term7348.getClass(), "thisYear", 0);
        setField(term7348, term7348.getClass(), "nameValues", null);
        setField(term7348, term7348.getClass(), "currentFormatField", null);
        setField(term7348, term7348.getClass(), "nextStrategy", null);
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
            callMethod(klass, "parse", argTypes, term7348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


