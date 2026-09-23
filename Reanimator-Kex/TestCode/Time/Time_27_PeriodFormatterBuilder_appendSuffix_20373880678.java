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

public class PeriodFormatterBuilder_appendSuffix_20373880678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;

    public PeriodFormatterBuilder_appendSuffix_20373880678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term562 = new ArrayList();
        term557 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term568 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term557, term557.getClass(), "iMinPrintedDigits", 1);
        setIntField(term557, term557.getClass(), "iPrintZeroSetting", 2);
        setIntField(term557, term557.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term557, term557.getClass(), "iRejectSignedValues", true);
        setField(term557, term557.getClass(), "iPrefix", null);
        setField(term557, term557.getClass(), "iElementPairs", term562);
        setBooleanField(term557, term557.getClass(), "iNotPrinter", true);
        setBooleanField(term557, term557.getClass(), "iNotParser", false);
        setField(term557, term557.getClass(), "iFieldFormatters", term568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "MxlszYVzRf";
        args[1] = "LQFpaHEwXR";
        try {
            callMethod(klass, "appendSuffix", argTypes, term557, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


