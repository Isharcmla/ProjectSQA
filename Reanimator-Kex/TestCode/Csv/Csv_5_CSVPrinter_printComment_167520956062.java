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

public class CSVPrinter_printComment_167520956062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25805;

    public CSVPrinter_printComment_167520956062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term25927 = new Character((char) 0);
        term25805 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term25875 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term25875, term25875.getClass(), "commentStart", term25927);
        setField(term25805, term25805.getClass(), "format", term25875);
        setBooleanField(term25805, term25805.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printComment", argTypes, term25805, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


