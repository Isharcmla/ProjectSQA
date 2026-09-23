package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_parseInto_1093923209186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37208;
     Object term37398;

    public DateTimeFormatter_parseInto_1093923209186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37208 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term37334 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        setField(term37208, term37208.getClass(), "iParser", term37334);
        term37398 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        Object term37476 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        setLongField(term37398, term37398.getClass(), "iMillis", 0L);
        setField(term37398, term37398.getClass(), "iChronology", term37476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadWritableInstant");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term37398;
        args[1] = null;
        args[2] = 0;
        callMethod(klass, "parseInto", argTypes, term37208, args);
    }

};


