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

public class DateTimeFormatterBuilder_toFormatter_1146953023194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21224;
     Object term21815;
     Object term21808;

    public DateTimeFormatterBuilder_toFormatter_1146953023194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21224 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term21346 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(term21224, term21224.getClass(), "iFormatter", term21346);
        term21815 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term21816 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(term21815, term21815.getClass(), "iElementPairs", null);
        setIntField(term21816, term21816.getClass(), "iMinPrintedDigits", 0);
        setField(term21816, term21816.getClass(), "iFieldType", null);
        setIntField(term21816, term21816.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term21816, term21816.getClass(), "iSigned", false);
        setField(term21815, term21815.getClass(), "iFormatter", term21816);
        term21808 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term21791 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term21791, term21791.getClass(), "iMinPrintedDigits", 0);
        setField(term21791, term21791.getClass(), "iFieldType", null);
        setIntField(term21791, term21791.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term21791, term21791.getClass(), "iSigned", false);
        setField(term21808, term21808.getClass(), "iPrinter", term21791);
        setField(term21808, term21808.getClass(), "iParser", term21791);
        setField(term21808, term21808.getClass(), "iLocale", null);
        setBooleanField(term21808, term21808.getClass(), "iOffsetParsed", false);
        setField(term21808, term21808.getClass(), "iChrono", null);
        setField(term21808, term21808.getClass(), "iZone", null);
        setField(term21808, term21808.getClass(), "iPivotYear", null);
        setIntField(term21808, term21808.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toFormatter", argTypes, term21224, args);
        assertTrue(recursiveEquals(term21224, term21815));
        assertTrue(recursiveEquals(retValue, term21808));
    }

};


