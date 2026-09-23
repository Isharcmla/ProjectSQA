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

public class DateTimeFormatterBuilder_appendSecondOfMinute_1944815354108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;
     Object term286;
     Object term7076;
     Object term7055;

    public DateTimeFormatterBuilder_appendSecondOfMinute_1944815354108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term281 = new ArrayList();
        term280 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term285 = newInstance(Class.forName("java.lang.Object"));
        setField(term280, term280.getClass(), "iElementPairs", term281);
        setField(term280, term280.getClass(), "iFormatter", term285);
        term286 = new Integer(1048535127);
        Object term7079 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term7080 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term7079, term7079.getClass(), "iMinPrintedDigits", 1048535127);
        setByteField(term7080, term7080.getClass(), "iOrdinal", (byte) 21);
        setField(term7080, term7080.getClass(), "iUnitType", null);
        setField(term7080, term7080.getClass(), "iRangeType", null);
        setField(term7080, term7080.getClass(), "iName", null);
        setField(term7079, term7079.getClass(), "iFieldType", term7080);
        setIntField(term7079, term7079.getClass(), "iMaxParsedDigits", 1048535127);
        setBooleanField(term7079, term7079.getClass(), "iSigned", false);
        ArrayList term7077 = new ArrayList();
        ((ArrayList) term7077).add(term7079);
        ((ArrayList) term7077).add(term7079);
        term7076 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term7076, term7076.getClass(), "iElementPairs", term7077);
        setField(term7076, term7076.getClass(), "iFormatter", null);
        Object term7058 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term7060 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term7058, term7058.getClass(), "iMinPrintedDigits", 1048535127);
        setByteField(term7060, term7060.getClass(), "iOrdinal", (byte) 21);
        setField(term7060, term7060.getClass(), "iUnitType", null);
        setField(term7060, term7060.getClass(), "iRangeType", null);
        setField(term7060, term7060.getClass(), "iName", null);
        setField(term7058, term7058.getClass(), "iFieldType", term7060);
        setIntField(term7058, term7058.getClass(), "iMaxParsedDigits", 1048535127);
        setBooleanField(term7058, term7058.getClass(), "iSigned", false);
        ArrayList term7056 = new ArrayList();
        ((ArrayList) term7056).add(term7058);
        ((ArrayList) term7056).add(term7058);
        term7055 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term7055, term7055.getClass(), "iElementPairs", term7056);
        setField(term7055, term7055.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286;
        Object retValue = callMethod(klass, "appendSecondOfMinute", argTypes, term280, args);
        assertTrue(recursiveEquals(term280, term7076));
        assertTrue(recursiveEquals(term286, 1048535127));
        assertTrue(recursiveEquals(retValue, term7055));
    }

};


