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

public class CSVPrinter_printComment_1675209560165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123996;
     Object term124864;

    public CSVPrinter_printComment_1675209560165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123996 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term124066 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term124066, term124066.getClass(), "commentStart", null);
        setField(term123996, term123996.getClass(), "format", term124066);
        term124864 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term124865 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term124864, term124864.getClass(), "out", null);
        setCharField(term124865, term124865.getClass(), "delimiter", (char) 0);
        setField(term124865, term124865.getClass(), "quoteChar", null);
        setField(term124865, term124865.getClass(), "quotePolicy", null);
        setField(term124865, term124865.getClass(), "commentStart", null);
        setField(term124865, term124865.getClass(), "escape", null);
        setBooleanField(term124865, term124865.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term124865, term124865.getClass(), "ignoreEmptyLines", false);
        setField(term124865, term124865.getClass(), "recordSeparator", null);
        setField(term124865, term124865.getClass(), "nullString", null);
        setField(term124865, term124865.getClass(), "header", null);
        setBooleanField(term124865, term124865.getClass(), "skipHeaderRecord", false);
        setField(term124864, term124864.getClass(), "format", term124865);
        setBooleanField(term124864, term124864.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "printComment", argTypes, term123996, args);
        assertTrue(recursiveEquals(term123996, term124864));
    }

};


