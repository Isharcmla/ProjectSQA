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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecords_141997098328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4320;

    public CSVPrinter_printRecords_141997098328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4323 = new Character('D');
        Class<? extends Object> term13178 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13177 = ((Class) term13178).getDeclaredField((String) "NONE");
        ((Field) term13177).setAccessible(true);
        Object enum30 = ((Field) term13177).get((Object) null);
        Character term4333 = new Character('I');
        Character term4335 = new Character('R');
        term4320 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term4321 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4363 = (Object[]) newArray("java.lang.String", 1);
        setField(term4320, term4320.getClass(), "out", null);
        setCharField(term4321, term4321.getClass(), "delimiter", 't');
        setField(term4321, term4321.getClass(), "quoteChar", term4323);
        setField(term4321, term4321.getClass(), "quotePolicy", enum30);
        setField(term4321, term4321.getClass(), "commentStart", term4333);
        setField(term4321, term4321.getClass(), "escape", term4335);
        setBooleanField(term4321, term4321.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4321, term4321.getClass(), "ignoreEmptyLines", true);
        setField(term4321, term4321.getClass(), "recordSeparator", "wGmYcqUkgE");
        setField(term4321, term4321.getClass(), "nullString", "idgaQsnJpQ");
        setElement(term4363, 0, "VgZnGoIFwQ");
        setField(term4321, term4321.getClass(), "header", term4363);
        setBooleanField(term4321, term4321.getClass(), "skipHeaderRecord", false);
        setField(term4320, term4320.getClass(), "format", term4321);
        setBooleanField(term4320, term4320.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printRecords", argTypes, term4320, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


