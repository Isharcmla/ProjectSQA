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

public class DateTimeFormatterBuilder_isParser_1628847859210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25731;
     Object term25861;
     Object term26019;
     Object term26020;

    public DateTimeFormatterBuilder_isParser_1628847859210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25731 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term25861 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        term26019 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term26019, term26019.getClass(), "iElementPairs", null);
        setField(term26019, term26019.getClass(), "iFormatter", null);
        term26020 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term26020, term26020.getClass(), "iValue", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25861;
        callMethod(klass, "isParser", argTypes, term25731, args);
        assertTrue(recursiveEquals(term25731, term26019));
        assertTrue(recursiveEquals(term25861, term26020));
    }

};


