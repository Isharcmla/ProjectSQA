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

public class DateTimeFormatterBuilder_canBuildPrinter_974927415307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45296;
     Object term45818;

    public DateTimeFormatterBuilder_canBuildPrinter_974927415307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45296 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term45422 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term45296, term45296.getClass(), "iFormatter", term45422);
        term45818 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term45819 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term45818, term45818.getClass(), "iElementPairs", null);
        setField(term45819, term45819.getClass(), "iZeroOffsetPrintText", null);
        setField(term45819, term45819.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term45819, term45819.getClass(), "iShowSeparators", false);
        setIntField(term45819, term45819.getClass(), "iMinFields", 0);
        setIntField(term45819, term45819.getClass(), "iMaxFields", 0);
        setField(term45818, term45818.getClass(), "iFormatter", term45819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildPrinter", argTypes, term45296, args);
        assertTrue(recursiveEquals(term45296, term45818));
    }

};


