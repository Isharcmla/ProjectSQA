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

public class Partial_toStringList_1317680179165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51290;
     Object term51818;

    public Partial_toStringList_1317680179165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51290 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term50826 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term51410 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term51568 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        int[] term51095 = (int[]) newIntArray(106);
        setField(term51410, term51410.getClass(), "iName", "");
        setElement(term50826, 0, term51410);
        setElement(term50826, 1, term51568);
        setField(term51290, term51290.getClass(), "iTypes", term50826);
        setField(term51290, term51290.getClass(), "iValues", term51095);
        term51818 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term51819 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term51820 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term51823 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        int[] term51824 = (int[]) newIntArray(106);
        setField(term51818, term51818.getClass(), "iChronology", null);
        setByteField(term51820, term51820.getClass(), "iOrdinal", (byte) 0);
        setField(term51820, term51820.getClass(), "iUnitType", null);
        setField(term51820, term51820.getClass(), "iRangeType", null);
        setField(term51820, term51820.getClass(), "iName", "");
        setElement(term51819, 0, term51820);
        setByteField(term51823, term51823.getClass(), "iOrdinal", (byte) 0);
        setField(term51823, term51823.getClass(), "iUnitType", null);
        setField(term51823, term51823.getClass(), "iRangeType", null);
        setField(term51823, term51823.getClass(), "iName", null);
        setElement(term51819, 1, term51823);
        setField(term51818, term51818.getClass(), "iTypes", term51819);
        setField(term51818, term51818.getClass(), "iValues", term51824);
        setField(term51818, term51818.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toStringList", argTypes, term51290, args);
        assertTrue(recursiveEquals(term51290, term51818));
        assertTrue(recursiveEquals(retValue, "[=0, null=0]"));
    }

};


