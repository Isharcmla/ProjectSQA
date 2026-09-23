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
import static org.joda.time.format.EqualityUtils.*;

public class DateTimeFormatterBuilder_checkPrinter_1554834940252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32977;
     Object term33107;
     Object term33559;
     Object term33560;

    public DateTimeFormatterBuilder_checkPrinter_1554834940252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32977 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term33107 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        term33559 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term33559, term33559.getClass(), "iElementPairs", null);
        setField(term33559, term33559.getClass(), "iFormatter", null);
        term33560 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term33560, term33560.getClass(), "iValue", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        Object[] args = new Object[1];
        args[0] = term33107;
        callMethod(klass, "checkPrinter", argTypes, term32977, args);
        assertTrue(recursiveEquals(term32977, term33559));
        assertTrue(recursiveEquals(term33107, term33560));
    }

};


