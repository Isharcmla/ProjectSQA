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

public class CSVPrinter_printComment_1675209560371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036494;

    public CSVPrinter_printComment_1675209560371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1036616 = new Character((char) 0);
        term1036494 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1036564 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term1036704 = newInstance(Class.forName("java.lang.StringBuffer"));
        setField(term1036564, term1036564.getClass(), "commentStart", term1036616);
        setField(term1036564, term1036564.getClass(), "recordSeparator", "");
        setField(term1036494, term1036494.getClass(), "format", term1036564);
        setBooleanField(term1036494, term1036494.getClass(), "newRecord", false);
        setField(term1036494, term1036494.getClass(), "out", term1036704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printComment", argTypes, term1036494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


