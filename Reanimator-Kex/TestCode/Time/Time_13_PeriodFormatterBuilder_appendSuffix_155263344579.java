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
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_appendSuffix_155263344579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public PeriodFormatterBuilder_appendSuffix_155263344579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term618 = new ArrayList();
        term613 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term624 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term613, term613.getClass(), "iMinPrintedDigits", 1);
        setIntField(term613, term613.getClass(), "iPrintZeroSetting", 2);
        setIntField(term613, term613.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term613, term613.getClass(), "iRejectSignedValues", true);
        setField(term613, term613.getClass(), "iPrefix", null);
        setField(term613, term613.getClass(), "iElementPairs", term618);
        setBooleanField(term613, term613.getClass(), "iNotPrinter", true);
        setBooleanField(term613, term613.getClass(), "iNotParser", false);
        setField(term613, term613.getClass(), "iFieldFormatters", term624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendSuffix", argTypes, term613, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


