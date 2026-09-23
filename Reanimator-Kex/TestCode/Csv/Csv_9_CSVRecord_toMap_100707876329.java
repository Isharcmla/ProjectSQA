package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_toMap_100707876329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902;
     Object term5585;
     Object term5580;

    public CSVRecord_toMap_100707876329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1915 = new HashMap();
        term1902 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1927 = (Object[]) newArray("java.lang.String", 1);
        setField(term1902, term1902.getClass(), "comment", "BKLfkLiZTH");
        setField(term1902, term1902.getClass(), "mapping", term1915);
        setLongField(term1902, term1902.getClass(), "recordNumber", 2535595959091595249L);
        setElement(term1927, 0, "sEccwbJKYE");
        setField(term1902, term1902.getClass(), "values", term1927);
        HashMap term5588 = new HashMap();
        term5585 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5590 = (Object[]) newArray("java.lang.String", 1);
        setField(term5585, term5585.getClass(), "comment", "BKLfkLiZTH");
        setField(term5585, term5585.getClass(), "mapping", term5588);
        setLongField(term5585, term5585.getClass(), "recordNumber", 2535595959091595249L);
        setElement(term5590, 0, "sEccwbJKYE");
        setField(term5585, term5585.getClass(), "values", term5590);
        term5580 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toMap", argTypes, term1902, args);
        assertTrue(recursiveEquals(term1902, term5585));
        assertTrue(recursiveEquals(retValue, term5580));
    }

};


