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

public class DateTimeFormatterBuilder_appendYearOfEra_1306603301127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;
     Object term446;
     Object term448;
     Object term10560;
     Object term10539;

    public DateTimeFormatterBuilder_appendYearOfEra_1306603301127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term441 = new ArrayList();
        term440 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term445 = newInstance(Class.forName("java.lang.Object"));
        setField(term440, term440.getClass(), "iElementPairs", term441);
        setField(term440, term440.getClass(), "iFormatter", term445);
        term446 = new Integer(1962444399);
        term448 = new Integer(767834723);
        Object term10563 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term10564 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term10563, term10563.getClass(), "iMinPrintedDigits", 1962444399);
        setByteField(term10564, term10564.getClass(), "iOrdinal", (byte) 2);
        setField(term10564, term10564.getClass(), "iUnitType", null);
        setField(term10564, term10564.getClass(), "iRangeType", null);
        setField(term10564, term10564.getClass(), "iName", null);
        setField(term10563, term10563.getClass(), "iFieldType", term10564);
        setIntField(term10563, term10563.getClass(), "iMaxParsedDigits", 1962444399);
        setBooleanField(term10563, term10563.getClass(), "iSigned", false);
        ArrayList term10561 = new ArrayList();
        ((ArrayList) term10561).add(term10563);
        ((ArrayList) term10561).add(term10563);
        term10560 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10560, term10560.getClass(), "iElementPairs", term10561);
        setField(term10560, term10560.getClass(), "iFormatter", null);
        Object term10542 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term10544 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term10542, term10542.getClass(), "iMinPrintedDigits", 1962444399);
        setByteField(term10544, term10544.getClass(), "iOrdinal", (byte) 2);
        setField(term10544, term10544.getClass(), "iUnitType", null);
        setField(term10544, term10544.getClass(), "iRangeType", null);
        setField(term10544, term10544.getClass(), "iName", null);
        setField(term10542, term10542.getClass(), "iFieldType", term10544);
        setIntField(term10542, term10542.getClass(), "iMaxParsedDigits", 1962444399);
        setBooleanField(term10542, term10542.getClass(), "iSigned", false);
        ArrayList term10540 = new ArrayList();
        ((ArrayList) term10540).add(term10542);
        ((ArrayList) term10540).add(term10542);
        term10539 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10539, term10539.getClass(), "iElementPairs", term10540);
        setField(term10539, term10539.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term446;
        args[1] = term448;
        Object retValue = callMethod(klass, "appendYearOfEra", argTypes, term440, args);
        assertTrue(recursiveEquals(term440, term10560));
        assertTrue(recursiveEquals(term446, 1962444399));
        assertTrue(recursiveEquals(term448, 767834723));
        assertTrue(recursiveEquals(retValue, term10539));
    }

};


