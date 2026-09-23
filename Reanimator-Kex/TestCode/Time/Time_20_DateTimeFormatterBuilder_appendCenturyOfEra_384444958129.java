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

public class DateTimeFormatterBuilder_appendCenturyOfEra_384444958129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460;
     Object term466;
     Object term468;
     Object term10929;
     Object term10908;

    public DateTimeFormatterBuilder_appendCenturyOfEra_384444958129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term461 = new ArrayList();
        term460 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term465 = newInstance(Class.forName("java.lang.Object"));
        setField(term460, term460.getClass(), "iElementPairs", term461);
        setField(term460, term460.getClass(), "iFormatter", term465);
        term466 = new Integer(1876565163);
        term468 = new Integer(-817164822);
        Object term10932 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term10933 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term10932, term10932.getClass(), "iMinPrintedDigits", 1876565163);
        setByteField(term10933, term10933.getClass(), "iOrdinal", (byte) 3);
        setField(term10933, term10933.getClass(), "iUnitType", null);
        setField(term10933, term10933.getClass(), "iRangeType", null);
        setField(term10933, term10933.getClass(), "iName", null);
        setField(term10932, term10932.getClass(), "iFieldType", term10933);
        setIntField(term10932, term10932.getClass(), "iMaxParsedDigits", 1876565163);
        setBooleanField(term10932, term10932.getClass(), "iSigned", true);
        ArrayList term10930 = new ArrayList();
        ((ArrayList) term10930).add(term10932);
        ((ArrayList) term10930).add(term10932);
        term10929 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10929, term10929.getClass(), "iElementPairs", term10930);
        setField(term10929, term10929.getClass(), "iFormatter", null);
        Object term10911 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term10913 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term10911, term10911.getClass(), "iMinPrintedDigits", 1876565163);
        setByteField(term10913, term10913.getClass(), "iOrdinal", (byte) 3);
        setField(term10913, term10913.getClass(), "iUnitType", null);
        setField(term10913, term10913.getClass(), "iRangeType", null);
        setField(term10913, term10913.getClass(), "iName", null);
        setField(term10911, term10911.getClass(), "iFieldType", term10913);
        setIntField(term10911, term10911.getClass(), "iMaxParsedDigits", 1876565163);
        setBooleanField(term10911, term10911.getClass(), "iSigned", true);
        ArrayList term10909 = new ArrayList();
        ((ArrayList) term10909).add(term10911);
        ((ArrayList) term10909).add(term10911);
        term10908 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10908, term10908.getClass(), "iElementPairs", term10909);
        setField(term10908, term10908.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term466;
        args[1] = term468;
        Object retValue = callMethod(klass, "appendCenturyOfEra", argTypes, term460, args);
        assertTrue(recursiveEquals(term460, term10929));
        assertTrue(recursiveEquals(term466, 1876565163));
        assertTrue(recursiveEquals(term468, -817164822));
        assertTrue(recursiveEquals(retValue, term10908));
    }

};


