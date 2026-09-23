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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendYear_511540842122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;
     Object term400;
     Object term402;
     Object term10212;
     Object term10191;

    public DateTimeFormatterBuilder_appendYear_511540842122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term395 = new ArrayList();
        term394 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term399 = newInstance(Class.forName("java.lang.Object"));
        setField(term394, term394.getClass(), "iElementPairs", term395);
        setField(term394, term394.getClass(), "iFormatter", term399);
        term400 = new Integer(1193880199);
        term402 = new Integer(-1087774327);
        Object term10215 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term10216 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term10215, term10215.getClass(), "iMinPrintedDigits", 1193880199);
        setByteField(term10216, term10216.getClass(), "iOrdinal", (byte) 5);
        setField(term10216, term10216.getClass(), "iUnitType", null);
        setField(term10216, term10216.getClass(), "iRangeType", null);
        setField(term10216, term10216.getClass(), "iName", null);
        setField(term10215, term10215.getClass(), "iFieldType", term10216);
        setIntField(term10215, term10215.getClass(), "iMaxParsedDigits", 1193880199);
        setBooleanField(term10215, term10215.getClass(), "iSigned", true);
        ArrayList term10213 = new ArrayList();
        ((ArrayList) term10213).add(term10215);
        ((ArrayList) term10213).add(term10215);
        term10212 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10212, term10212.getClass(), "iElementPairs", term10213);
        setField(term10212, term10212.getClass(), "iFormatter", null);
        Object term10194 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term10196 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term10194, term10194.getClass(), "iMinPrintedDigits", 1193880199);
        setByteField(term10196, term10196.getClass(), "iOrdinal", (byte) 5);
        setField(term10196, term10196.getClass(), "iUnitType", null);
        setField(term10196, term10196.getClass(), "iRangeType", null);
        setField(term10196, term10196.getClass(), "iName", null);
        setField(term10194, term10194.getClass(), "iFieldType", term10196);
        setIntField(term10194, term10194.getClass(), "iMaxParsedDigits", 1193880199);
        setBooleanField(term10194, term10194.getClass(), "iSigned", true);
        ArrayList term10192 = new ArrayList();
        ((ArrayList) term10192).add(term10194);
        ((ArrayList) term10192).add(term10194);
        term10191 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10191, term10191.getClass(), "iElementPairs", term10192);
        setField(term10191, term10191.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term400;
        args[1] = term402;
        Object retValue = callMethod(klass, "appendYear", argTypes, term394, args);
        assertTrue(recursiveEquals(term394, term10212));
        assertTrue(recursiveEquals(term400, 1193880199));
        assertTrue(recursiveEquals(term402, -1087774327));
        assertTrue(recursiveEquals(retValue, term10191));
    }

};


