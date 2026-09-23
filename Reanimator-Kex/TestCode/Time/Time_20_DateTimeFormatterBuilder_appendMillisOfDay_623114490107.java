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

public class DateTimeFormatterBuilder_appendMillisOfDay_623114490107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272;
     Object term278;
     Object term6994;
     Object term6973;

    public DateTimeFormatterBuilder_appendMillisOfDay_623114490107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term273 = new ArrayList();
        term272 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term277 = newInstance(Class.forName("java.lang.Object"));
        setField(term272, term272.getClass(), "iElementPairs", term273);
        setField(term272, term272.getClass(), "iFormatter", term277);
        term278 = new Integer(1622346318);
        Object term6997 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term6998 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term6997, term6997.getClass(), "iMinPrintedDigits", 1622346318);
        setByteField(term6998, term6998.getClass(), "iOrdinal", (byte) 22);
        setField(term6998, term6998.getClass(), "iUnitType", null);
        setField(term6998, term6998.getClass(), "iRangeType", null);
        setField(term6998, term6998.getClass(), "iName", null);
        setField(term6997, term6997.getClass(), "iFieldType", term6998);
        setIntField(term6997, term6997.getClass(), "iMaxParsedDigits", 1622346318);
        setBooleanField(term6997, term6997.getClass(), "iSigned", false);
        ArrayList term6995 = new ArrayList();
        ((ArrayList) term6995).add(term6997);
        ((ArrayList) term6995).add(term6997);
        term6994 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term6994, term6994.getClass(), "iElementPairs", term6995);
        setField(term6994, term6994.getClass(), "iFormatter", null);
        Object term6976 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term6978 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term6976, term6976.getClass(), "iMinPrintedDigits", 1622346318);
        setByteField(term6978, term6978.getClass(), "iOrdinal", (byte) 22);
        setField(term6978, term6978.getClass(), "iUnitType", null);
        setField(term6978, term6978.getClass(), "iRangeType", null);
        setField(term6978, term6978.getClass(), "iName", null);
        setField(term6976, term6976.getClass(), "iFieldType", term6978);
        setIntField(term6976, term6976.getClass(), "iMaxParsedDigits", 1622346318);
        setBooleanField(term6976, term6976.getClass(), "iSigned", false);
        ArrayList term6974 = new ArrayList();
        ((ArrayList) term6974).add(term6976);
        ((ArrayList) term6974).add(term6976);
        term6973 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term6973, term6973.getClass(), "iElementPairs", term6974);
        setField(term6973, term6973.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term278;
        Object retValue = callMethod(klass, "appendMillisOfDay", argTypes, term272, args);
        assertTrue(recursiveEquals(term272, term6994));
        assertTrue(recursiveEquals(term278, 1622346318));
        assertTrue(recursiveEquals(retValue, term6973));
    }

};


