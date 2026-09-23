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

public class DateTimeFormatter_withLocale_540774375173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44575;
     Object term44631;
     Object term44628;

    public DateTimeFormatter_withLocale_540774375173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44575 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term44613 = newInstance(Class.forName("java.util.Locale"));
        setField(term44575, term44575.getClass(), "iLocale", term44613);
        term44631 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term44632 = newInstance(Class.forName("java.util.Locale"));
        setField(term44631, term44631.getClass(), "iPrinter", null);
        setField(term44631, term44631.getClass(), "iParser", null);
        setField(term44632, term44632.getClass(), "baseLocale", null);
        setField(term44632, term44632.getClass(), "localeExtensions", null);
        setIntField(term44632, term44632.getClass(), "hashCodeValue", 0);
        setField(term44632, term44632.getClass(), "languageTag", null);
        setField(term44631, term44631.getClass(), "iLocale", term44632);
        setBooleanField(term44631, term44631.getClass(), "iOffsetParsed", false);
        setField(term44631, term44631.getClass(), "iChrono", null);
        setField(term44631, term44631.getClass(), "iZone", null);
        setField(term44631, term44631.getClass(), "iPivotYear", null);
        setIntField(term44631, term44631.getClass(), "iDefaultYear", 0);
        term44628 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term44628, term44628.getClass(), "iPrinter", null);
        setField(term44628, term44628.getClass(), "iParser", null);
        setField(term44628, term44628.getClass(), "iLocale", null);
        setBooleanField(term44628, term44628.getClass(), "iOffsetParsed", false);
        setField(term44628, term44628.getClass(), "iChrono", null);
        setField(term44628, term44628.getClass(), "iZone", null);
        setField(term44628, term44628.getClass(), "iPivotYear", null);
        setIntField(term44628, term44628.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withLocale", argTypes, term44575, args);
        assertTrue(recursiveEquals(term44575, term44631));
        assertTrue(recursiveEquals(retValue, term44628));
    }

};


