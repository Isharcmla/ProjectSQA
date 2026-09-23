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

public class CSVPrinter_printRecords_1035483741209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269491;
     Object term268738;
     Object term269894;
     Object term269897;

    public CSVPrinter_printRecords_1035483741209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269491 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term269529 = newInstance(Class.forName("java.io.Writer$1"));
        Object term269599 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term269491, term269491.getClass(), "newRecord", false);
        setField(term269491, term269491.getClass(), "out", term269529);
        setCharField(term269599, term269599.getClass(), "delimiter", (char) 0);
        setField(term269599, term269599.getClass(), "quoteChar", null);
        setField(term269599, term269599.getClass(), "escape", null);
        setField(term269599, term269599.getClass(), "recordSeparator", null);
        setField(term269491, term269491.getClass(), "format", term269599);
        term268738 = (Object[]) newArray("java.lang.Object", 5);
        Object term269671 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object[] term268740 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term268738, 0, term269671);
        setElement(term268738, 1, term268740);
        term269894 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term269895 = newInstance(Class.forName("java.io.Writer$1"));
        Object term269896 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term269895, term269895.getClass(), "closed", false);
        setField(term269895, term269895.getClass(), "writeBuffer", null);
        setField(term269895, term269895.getClass(), "lock", null);
        setField(term269894, term269894.getClass(), "out", term269895);
        setCharField(term269896, term269896.getClass(), "delimiter", (char) 0);
        setField(term269896, term269896.getClass(), "quoteChar", null);
        setField(term269896, term269896.getClass(), "quotePolicy", null);
        setField(term269896, term269896.getClass(), "commentStart", null);
        setField(term269896, term269896.getClass(), "escape", null);
        setBooleanField(term269896, term269896.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term269896, term269896.getClass(), "ignoreEmptyLines", false);
        setField(term269896, term269896.getClass(), "recordSeparator", null);
        setField(term269896, term269896.getClass(), "nullString", null);
        setField(term269896, term269896.getClass(), "header", null);
        setBooleanField(term269896, term269896.getClass(), "skipHeaderRecord", false);
        setField(term269894, term269894.getClass(), "format", term269896);
        setBooleanField(term269894, term269894.getClass(), "newRecord", true);
        term269897 = (Object[]) newArray("java.lang.Object", 5);
        Object term269898 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object[] term269899 = (Object[]) newArray("java.lang.Object", 0);
        setField(term269898, term269898.getClass(), "out", null);
        setField(term269898, term269898.getClass(), "format", null);
        setBooleanField(term269898, term269898.getClass(), "newRecord", false);
        setElement(term269897, 0, term269898);
        setElement(term269897, 1, term269899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term268738;
        callMethod(klass, "printRecords", argTypes, term269491, args);
        assertTrue(recursiveEquals(term269491, term269894));
        assertTrue(recursiveEquals(term268738, term269897));
    }

};


