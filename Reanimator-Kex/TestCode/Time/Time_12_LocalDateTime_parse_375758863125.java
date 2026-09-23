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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDateTime_parse_375758863125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public LocalDateTime_parse_375758863125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36093 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(null, Class.forName("org.joda.time.format.ISODateTimeFormat"), "ldotp", null);
        setField(null, Class.forName("org.joda.time.format.ISODateTimeFormat"), "tpe", term36093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, null, args);
    }

};


