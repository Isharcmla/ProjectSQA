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

public class PeriodFormatterBuilder_appendPrefix_466624587180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36808;
     Object term37520;
     Object term37506;

    public PeriodFormatterBuilder_appendPrefix_466624587180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36808 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term36924 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setField(term36808, term36808.getClass(), "iPrefix", term36924);
        term37520 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term37521 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        Object term37522 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        Object term37523 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setIntField(term37520, term37520.getClass(), "iMinPrintedDigits", 0);
        setIntField(term37520, term37520.getClass(), "iPrintZeroSetting", 0);
        setIntField(term37520, term37520.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term37520, term37520.getClass(), "iRejectSignedValues", false);
        setField(term37522, term37522.getClass(), "iSingularText", null);
        setField(term37522, term37522.getClass(), "iPluralText", null);
        setField(term37521, term37521.getClass(), "iLeft", term37522);
        setField(term37523, term37523.getClass(), "iSingularText", "");
        setField(term37523, term37523.getClass(), "iPluralText", "");
        setField(term37521, term37521.getClass(), "iRight", term37523);
        setField(term37520, term37520.getClass(), "iPrefix", term37521);
        setField(term37520, term37520.getClass(), "iElementPairs", null);
        setBooleanField(term37520, term37520.getClass(), "iNotPrinter", false);
        setBooleanField(term37520, term37520.getClass(), "iNotParser", false);
        setField(term37520, term37520.getClass(), "iFieldFormatters", null);
        term37506 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term37511 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        Object term37512 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        Object term37513 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setIntField(term37506, term37506.getClass(), "iMinPrintedDigits", 0);
        setIntField(term37506, term37506.getClass(), "iPrintZeroSetting", 0);
        setIntField(term37506, term37506.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term37506, term37506.getClass(), "iRejectSignedValues", false);
        setField(term37512, term37512.getClass(), "iSingularText", null);
        setField(term37512, term37512.getClass(), "iPluralText", null);
        setField(term37511, term37511.getClass(), "iLeft", term37512);
        setField(term37513, term37513.getClass(), "iSingularText", "");
        setField(term37513, term37513.getClass(), "iPluralText", "");
        setField(term37511, term37511.getClass(), "iRight", term37513);
        setField(term37506, term37506.getClass(), "iPrefix", term37511);
        setField(term37506, term37506.getClass(), "iElementPairs", null);
        setBooleanField(term37506, term37506.getClass(), "iNotPrinter", false);
        setBooleanField(term37506, term37506.getClass(), "iNotParser", false);
        setField(term37506, term37506.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "";
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term36808, args);
        assertTrue(recursiveEquals(term36808, term37520));
        assertTrue(recursiveEquals(retValue, term37506));
    }

};


