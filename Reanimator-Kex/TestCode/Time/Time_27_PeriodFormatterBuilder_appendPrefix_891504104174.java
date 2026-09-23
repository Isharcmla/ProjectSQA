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

public class PeriodFormatterBuilder_appendPrefix_891504104174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35361;
     Object term35890;
     Object term35878;

    public PeriodFormatterBuilder_appendPrefix_891504104174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35361 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term35477 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(term35361, term35361.getClass(), "iPrefix", term35477);
        term35890 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term35891 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        Object term35892 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        Object term35893 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setIntField(term35890, term35890.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35890, term35890.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35890, term35890.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35890, term35890.getClass(), "iRejectSignedValues", false);
        setField(term35892, term35892.getClass(), "iText", null);
        setField(term35891, term35891.getClass(), "iLeft", term35892);
        setField(term35893, term35893.getClass(), "iText", "");
        setField(term35891, term35891.getClass(), "iRight", term35893);
        setField(term35890, term35890.getClass(), "iPrefix", term35891);
        setField(term35890, term35890.getClass(), "iElementPairs", null);
        setBooleanField(term35890, term35890.getClass(), "iNotPrinter", false);
        setBooleanField(term35890, term35890.getClass(), "iNotParser", false);
        setField(term35890, term35890.getClass(), "iFieldFormatters", null);
        term35878 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term35883 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        Object term35884 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        Object term35885 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setIntField(term35878, term35878.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35878, term35878.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35878, term35878.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35878, term35878.getClass(), "iRejectSignedValues", false);
        setField(term35884, term35884.getClass(), "iText", null);
        setField(term35883, term35883.getClass(), "iLeft", term35884);
        setField(term35885, term35885.getClass(), "iText", "");
        setField(term35883, term35883.getClass(), "iRight", term35885);
        setField(term35878, term35878.getClass(), "iPrefix", term35883);
        setField(term35878, term35878.getClass(), "iElementPairs", null);
        setBooleanField(term35878, term35878.getClass(), "iNotPrinter", false);
        setBooleanField(term35878, term35878.getClass(), "iNotParser", false);
        setField(term35878, term35878.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term35361, args);
        assertTrue(recursiveEquals(term35361, term35890));
        assertTrue(recursiveEquals(retValue, term35878));
    }

};


