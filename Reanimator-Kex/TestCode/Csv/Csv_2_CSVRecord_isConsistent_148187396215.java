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
import java.lang.Object;
import java.util.HashMap;

public class CSVRecord_isConsistent_148187396215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term2602;

    public CSVRecord_isConsistent_148187396215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term405 = new HashMap();
        term343 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term344 = (Object[]) newArray("java.lang.String", 5);
        setElement(term344, 0, "ZiaGIbnzTs");
        setElement(term344, 1, "tbcdzjIfER");
        setElement(term344, 2, "HyxfbSQYBe");
        setElement(term344, 3, "pCTimMblYc");
        setElement(term344, 4, "hNxWaHcfhY");
        setField(term343, term343.getClass(), "values", term344);
        setField(term343, term343.getClass(), "mapping", term405);
        setField(term343, term343.getClass(), "comment", "xOEqzGAmDU");
        setLongField(term343, term343.getClass(), "recordNumber", -8400487765614892086L);
        HashMap term2614 = new HashMap();
        term2602 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term2603 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2603, 0, "ZiaGIbnzTs");
        setElement(term2603, 1, "tbcdzjIfER");
        setElement(term2603, 2, "HyxfbSQYBe");
        setElement(term2603, 3, "pCTimMblYc");
        setElement(term2603, 4, "hNxWaHcfhY");
        setField(term2602, term2602.getClass(), "values", term2603);
        setField(term2602, term2602.getClass(), "mapping", term2614);
        setField(term2602, term2602.getClass(), "comment", "xOEqzGAmDU");
        setLongField(term2602, term2602.getClass(), "recordNumber", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConsistent", argTypes, term343, args);
        assertTrue(recursiveEquals(term343, term2602));
        assertTrue(recursiveEquals(retValue, false));
    }

};


