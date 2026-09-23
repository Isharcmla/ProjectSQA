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

public class DateTimeFormatterBuilder_canBuildParser_228301192227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28652;
     Object term29129;

    public DateTimeFormatterBuilder_canBuildParser_228301192227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28652 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term28778 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term28652, term28652.getClass(), "iFormatter", term28778);
        term29129 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term29130 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term29129, term29129.getClass(), "iElementPairs", null);
        setField(term29130, term29130.getClass(), "iZeroOffsetPrintText", null);
        setField(term29130, term29130.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term29130, term29130.getClass(), "iShowSeparators", false);
        setIntField(term29130, term29130.getClass(), "iMinFields", 0);
        setIntField(term29130, term29130.getClass(), "iMaxFields", 0);
        setField(term29129, term29129.getClass(), "iFormatter", term29130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildParser", argTypes, term28652, args);
        assertTrue(recursiveEquals(term28652, term29129));
    }

};


