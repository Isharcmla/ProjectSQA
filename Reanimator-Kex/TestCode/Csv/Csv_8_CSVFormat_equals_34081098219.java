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

public class CSVFormat_equals_34081098219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111714;
     Object term111830;
     Object term111886;
     Object term111887;

    public CSVFormat_equals_34081098219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111714 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term111830 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsShorts$ArrayHandle"));
        term111886 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term111886, term111886.getClass(), "delimiter", (char) 0);
        setField(term111886, term111886.getClass(), "quoteChar", null);
        setField(term111886, term111886.getClass(), "quotePolicy", null);
        setField(term111886, term111886.getClass(), "commentStart", null);
        setField(term111886, term111886.getClass(), "escape", null);
        setBooleanField(term111886, term111886.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term111886, term111886.getClass(), "ignoreEmptyLines", false);
        setField(term111886, term111886.getClass(), "recordSeparator", null);
        setField(term111886, term111886.getClass(), "nullString", null);
        setField(term111886, term111886.getClass(), "header", null);
        setBooleanField(term111886, term111886.getClass(), "skipHeaderRecord", false);
        term111887 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsShorts$ArrayHandle"));
        setBooleanField(term111887, term111887.getClass(), "be", false);
        setField(term111887, term111887.getClass(), "vform", null);
        setField(term111887, term111887.getClass(), "typesAndInvokers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term111830;
        Object retValue = callMethod(klass, "equals", argTypes, term111714, args);
        assertTrue(recursiveEquals(term111714, term111886));
        assertTrue(recursiveEquals(term111830, term111887));
        assertTrue(recursiveEquals(retValue, false));
    }

};


