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
     Object term5753;
     Object term5684;

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
        HashMap term5756 = new HashMap();
        term5753 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5757 = (Object[]) newArray("java.lang.String", 2);
        setField(term5753, term5753.getClass(), "comment", "QXzGXbEXMu");
        setField(term5753, term5753.getClass(), "mapping", term5756);
        setLongField(term5753, term5753.getClass(), "recordNumber", -872011222785455006L);
        setElement(term5757, 0, "xBsXSDjXYK");
        setElement(term5757, 1, "sEnIVFtZuQ");
        setField(term5753, term5753.getClass(), "values", term5757);
        term5684 = (Object[]) newArray("java.lang.String", 2);
        setElement(term5684, 0, "xBsXSDjXYK");
        setElement(term5684, 1, "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term1996, args);
        assertTrue(recursiveEquals(term1996, term5753));
        assertTrue(recursiveEquals(retValue, term5684));
    }

};


