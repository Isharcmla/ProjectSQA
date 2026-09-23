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

public class CSVRecord_toList_104251999528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1800;
     Object term5420;
     Object term5325;

    public CSVRecord_toList_104251999528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1813 = new HashMap();
        term1800 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term1825 = (Object[]) newArray("java.lang.String", 3);
        setField(term1800, term1800.getClass(), "comment", "jiKYgYHqIS");
        setField(term1800, term1800.getClass(), "mapping", term1813);
        setLongField(term1800, term1800.getClass(), "recordNumber", -4325723315152823407L);
        setElement(term1825, 0, "XqgfKFvPSD");
        setElement(term1825, 1, "JiVRgTZvKc");
        setElement(term1825, 2, "XPKmummaqg");
        setField(term1800, term1800.getClass(), "values", term1825);
        HashMap term5423 = new HashMap();
        term5420 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5424 = (Object[]) newArray("java.lang.String", 3);
        setField(term5420, term5420.getClass(), "comment", "jiKYgYHqIS");
        setField(term5420, term5420.getClass(), "mapping", term5423);
        setLongField(term5420, term5420.getClass(), "recordNumber", -4325723315152823407L);
        setElement(term5424, 0, "XqgfKFvPSD");
        setElement(term5424, 1, "JiVRgTZvKc");
        setElement(term5424, 2, "XPKmummaqg");
        setField(term5420, term5420.getClass(), "values", term5424);
        term5325 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term5326 = (Object[]) newArray("java.lang.String", 3);
        setElement(term5326, 0, "XqgfKFvPSD");
        setElement(term5326, 1, "JiVRgTZvKc");
        setElement(term5326, 2, "XPKmummaqg");
        setField(term5325, term5325.getClass(), "a", term5326);
        setIntField(term5325, term5325.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toList", argTypes, term1800, args);
        assertTrue(recursiveEquals(term1800, term5420));
        assertTrue(recursiveEquals(retValue, term5325));
    }

};


