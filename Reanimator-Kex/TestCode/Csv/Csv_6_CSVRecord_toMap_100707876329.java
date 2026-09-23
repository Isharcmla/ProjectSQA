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
     Object term5583;
     Object term5578;

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
        HashMap term5586 = new HashMap();
        term5583 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5588 = (Object[]) newArray("java.lang.String", 1);
        setField(term5583, term5583.getClass(), "comment", "BKLfkLiZTH");
        setField(term5583, term5583.getClass(), "mapping", term5586);
        setLongField(term5583, term5583.getClass(), "recordNumber", 2535595959091595249L);
        setElement(term5588, 0, "sEccwbJKYE");
        setField(term5583, term5583.getClass(), "values", term5588);
        term5578 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toMap", argTypes, term1902, args);
        assertTrue(recursiveEquals(term1902, term5583));
        assertTrue(recursiveEquals(retValue, term5578));
    }

};


