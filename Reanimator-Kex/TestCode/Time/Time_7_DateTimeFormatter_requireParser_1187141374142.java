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

public class DateTimeFormatter_requireParser_1187141374142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30550;
     Object term31511;
     Object term31505;

    public DateTimeFormatter_requireParser_1187141374142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30550 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term30666 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term30550, term30550.getClass(), "iParser", term30666);
        term31511 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term31512 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term31511, term31511.getClass(), "iPrinter", null);
        setField(term31512, term31512.getClass(), "iPrinters", null);
        setField(term31512, term31512.getClass(), "iParsers", null);
        setIntField(term31512, term31512.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term31512, term31512.getClass(), "iParsedLengthEstimate", 0);
        setField(term31511, term31511.getClass(), "iParser", term31512);
        setField(term31511, term31511.getClass(), "iLocale", null);
        setBooleanField(term31511, term31511.getClass(), "iOffsetParsed", false);
        setField(term31511, term31511.getClass(), "iChrono", null);
        setField(term31511, term31511.getClass(), "iZone", null);
        setField(term31511, term31511.getClass(), "iPivotYear", null);
        setIntField(term31511, term31511.getClass(), "iDefaultYear", 0);
        term31505 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term31505, term31505.getClass(), "iPrinters", null);
        setField(term31505, term31505.getClass(), "iParsers", null);
        setIntField(term31505, term31505.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term31505, term31505.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requireParser", argTypes, term30550, args);
        assertTrue(recursiveEquals(term30550, term31511));
        assertTrue(recursiveEquals(retValue, term31505));
    }

};


