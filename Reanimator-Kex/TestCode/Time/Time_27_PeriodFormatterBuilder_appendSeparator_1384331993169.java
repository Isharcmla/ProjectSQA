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
import java.lang.Object;

public class PeriodFormatterBuilder_appendSeparator_1384331993169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33892;

    public PeriodFormatterBuilder_appendSeparator_1384331993169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33892 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term34008 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setField(term33892, term33892.getClass(), "iPrefix", term34008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = "";
        args[2] = null;
        try {
            callMethod(klass, "appendSeparator", argTypes, term33892, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


