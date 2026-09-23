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

public class PeriodFormatterBuilder_toFormatter_2046878105181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38389;
     Object term41313;
     Object term41307;

    public PeriodFormatterBuilder_toFormatter_2046878105181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38389 = new ArrayList();
        term41313 = new ArrayList();
        term41307 = newInstance(Class.forName("org.joda.time.format.PeriodFormatter"));
        Object term41308 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term41307, term41307.getClass(), "iPrinter", null);
        setField(term41308, term41308.getClass(), "iText", "");
        setField(term41307, term41307.getClass(), "iParser", term41308);
        setField(term41307, term41307.getClass(), "iLocale", null);
        setField(term41307, term41307.getClass(), "iParseType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term38389;
        args[1] = true;
        args[2] = false;
        Object retValue = callMethod(klass, "toFormatter", argTypes, null, args);
        assertTrue(recursiveEquals(term38389, term41313));
        assertTrue(recursiveEquals(retValue, term41307));
    }

};


