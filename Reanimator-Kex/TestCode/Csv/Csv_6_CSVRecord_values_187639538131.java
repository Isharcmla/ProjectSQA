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

public class CSVRecord_values_187639538131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1996;
     Object term5751;
     Object term5682;

    public CSVRecord_values_187639538131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2009 = new HashMap();
        term1996 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term2021 = (Object[]) newArray("java.lang.String", 2);
        setField(term1996, term1996.getClass(), "comment", "QXzGXbEXMu");
        setField(term1996, term1996.getClass(), "mapping", term2009);
        setLongField(term1996, term1996.getClass(), "recordNumber", -872011222785455006L);
        setElement(term2021, 0, "xBsXSDjXYK");
        setElement(term2021, 1, "sEnIVFtZuQ");
        setField(term1996, term1996.getClass(), "values", term2021);
        HashMap term5754 = new HashMap();
        term5751 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5755 = (Object[]) newArray("java.lang.String", 2);
        setField(term5751, term5751.getClass(), "comment", "QXzGXbEXMu");
        setField(term5751, term5751.getClass(), "mapping", term5754);
        setLongField(term5751, term5751.getClass(), "recordNumber", -872011222785455006L);
        setElement(term5755, 0, "xBsXSDjXYK");
        setElement(term5755, 1, "sEnIVFtZuQ");
        setField(term5751, term5751.getClass(), "values", term5755);
        term5682 = (Object[]) newArray("java.lang.String", 2);
        setElement(term5682, 0, "xBsXSDjXYK");
        setElement(term5682, 1, "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term1996, args);
        assertTrue(recursiveEquals(term1996, term5751));
        assertTrue(recursiveEquals(retValue, term5682));
    }

};


