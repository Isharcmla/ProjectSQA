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
import java.lang.Object;

public class DateTimeFormatter_isPrinter_125735626494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11285;
     Object term11635;

    public DateTimeFormatter_isPrinter_125735626494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11285 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term11409 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term11285, term11285.getClass(), "iPrinter", term11409);
        term11635 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term11636 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term11636, term11636.getClass(), "iValue", null);
        setField(term11635, term11635.getClass(), "iPrinter", term11636);
        setField(term11635, term11635.getClass(), "iParser", null);
        setField(term11635, term11635.getClass(), "iLocale", null);
        setBooleanField(term11635, term11635.getClass(), "iOffsetParsed", false);
        setField(term11635, term11635.getClass(), "iChrono", null);
        setField(term11635, term11635.getClass(), "iZone", null);
        setField(term11635, term11635.getClass(), "iPivotYear", null);
        setIntField(term11635, term11635.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPrinter", argTypes, term11285, args);
        assertTrue(recursiveEquals(term11285, term11635));
        assertTrue(recursiveEquals(retValue, true));
    }

};


