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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Period_withSeconds_681688998141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1550;
     Object term1578;

    public Period_withSeconds_681688998141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1550 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1551 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1564 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1565 = (int[]) newIntArray(5);
        int[] term1571 = (int[]) newIntArray(6);
        setField(term1551, term1551.getClass(), "iName", "MjGYSRKTNF");
        setField(term1551, term1551.getClass(), "iTypes", term1564);
        setIntElement(term1565, 0, -2068769794);
        setIntElement(term1565, 1, -117576464);
        setIntElement(term1565, 2, -1007160944);
        setIntElement(term1565, 3, 1135664017);
        setIntElement(term1565, 4, 590364439);
        setField(term1551, term1551.getClass(), "iIndices", term1565);
        setField(term1550, term1550.getClass(), "iType", term1551);
        setField(term1550, term1550.getClass(), "iValues", term1571);
        term1578 = new Integer(890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1578;
        try {
            callMethod(klass, "withSeconds", argTypes, term1550, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


