package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Period_withFields_1016662063132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;
     Object term55001;
     Object term54973;

    public Period_withFields_1016662063132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1093 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1094 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1107 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1108 = (int[]) newIntArray(5);
        int[] term1114 = (int[]) newIntArray(6);
        setField(term1094, term1094.getClass(), "iName", "MjGYSRKTNF");
        setField(term1094, term1094.getClass(), "iTypes", term1107);
        setIntElement(term1108, 0, -2068769794);
        setIntElement(term1108, 1, -117576464);
        setIntElement(term1108, 2, -1007160944);
        setIntElement(term1108, 3, 1135664017);
        setIntElement(term1108, 4, 590364439);
        setField(term1094, term1094.getClass(), "iIndices", term1108);
        setField(term1093, term1093.getClass(), "iType", term1094);
        setField(term1093, term1093.getClass(), "iValues", term1114);
        term55001 = newInstance(Class.forName("org.joda.time.Period"));
        Object term55002 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term55005 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term55006 = (int[]) newIntArray(5);
        int[] term55007 = (int[]) newIntArray(6);
        setField(term55002, term55002.getClass(), "iName", "MjGYSRKTNF");
        setField(term55002, term55002.getClass(), "iTypes", term55005);
        setIntElement(term55006, 0, -2068769794);
        setIntElement(term55006, 1, -117576464);
        setIntElement(term55006, 2, -1007160944);
        setIntElement(term55006, 3, 1135664017);
        setIntElement(term55006, 4, 590364439);
        setField(term55002, term55002.getClass(), "iIndices", term55006);
        setField(term55001, term55001.getClass(), "iType", term55002);
        setField(term55001, term55001.getClass(), "iValues", term55007);
        term54973 = newInstance(Class.forName("org.joda.time.Period"));
        Object term54974 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term54987 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term54988 = (int[]) newIntArray(5);
        int[] term54994 = (int[]) newIntArray(6);
        setField(term54974, term54974.getClass(), "iName", "MjGYSRKTNF");
        setField(term54974, term54974.getClass(), "iTypes", term54987);
        setIntElement(term54988, 0, -2068769794);
        setIntElement(term54988, 1, -117576464);
        setIntElement(term54988, 2, -1007160944);
        setIntElement(term54988, 3, 1135664017);
        setIntElement(term54988, 4, 590364439);
        setField(term54974, term54974.getClass(), "iIndices", term54988);
        setField(term54973, term54973.getClass(), "iType", term54974);
        setField(term54973, term54973.getClass(), "iValues", term54994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withFields", argTypes, term1093, args);
        assertTrue(recursiveEquals(term1093, term55001));
        assertTrue(recursiveEquals(retValue, term54973));
    }

};


