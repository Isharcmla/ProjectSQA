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
import java.util.ArrayList;

public class DateTimeFormatterBuilder_appendDayOfYear_1529551337414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65707;
     Object term65981;
     Object term65960;

    public DateTimeFormatterBuilder_appendDayOfYear_1529551337414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65797 = new ArrayList();
        term65707 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term65745 = newInstance(Class.forName("java.lang.Object"));
        setField(term65707, term65707.getClass(), "iFormatter", term65745);
        setField(term65707, term65707.getClass(), "iElementPairs", term65797);
        Object term65984 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term65985 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term65984, term65984.getClass(), "iMinPrintedDigits", 880194700);
        setByteField(term65985, term65985.getClass(), "iOrdinal", (byte) 6);
        setField(term65985, term65985.getClass(), "iUnitType", null);
        setField(term65985, term65985.getClass(), "iRangeType", null);
        setField(term65985, term65985.getClass(), "iName", null);
        setField(term65984, term65984.getClass(), "iFieldType", term65985);
        setIntField(term65984, term65984.getClass(), "iMaxParsedDigits", 880194700);
        setBooleanField(term65984, term65984.getClass(), "iSigned", false);
        ArrayList term65982 = new ArrayList();
        ((ArrayList) term65982).add(term65984);
        ((ArrayList) term65982).add(term65984);
        term65981 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term65981, term65981.getClass(), "iElementPairs", term65982);
        setField(term65981, term65981.getClass(), "iFormatter", null);
        Object term65963 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term65965 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term65963, term65963.getClass(), "iMinPrintedDigits", 880194700);
        setByteField(term65965, term65965.getClass(), "iOrdinal", (byte) 6);
        setField(term65965, term65965.getClass(), "iUnitType", null);
        setField(term65965, term65965.getClass(), "iRangeType", null);
        setField(term65965, term65965.getClass(), "iName", null);
        setField(term65963, term65963.getClass(), "iFieldType", term65965);
        setIntField(term65963, term65963.getClass(), "iMaxParsedDigits", 880194700);
        setBooleanField(term65963, term65963.getClass(), "iSigned", false);
        ArrayList term65961 = new ArrayList();
        ((ArrayList) term65961).add(term65963);
        ((ArrayList) term65961).add(term65963);
        term65960 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term65960, term65960.getClass(), "iElementPairs", term65961);
        setField(term65960, term65960.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 880194700;
        Object retValue = callMethod(klass, "appendDayOfYear", argTypes, term65707, args);
        assertTrue(recursiveEquals(term65707, term65981));
        assertTrue(recursiveEquals(retValue, term65960));
    }

};


