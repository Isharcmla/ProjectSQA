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
import java.nio.ReadOnlyBufferException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class CSVPrinter_printComment_167520956087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35822;

    public CSVPrinter_printComment_167520956087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term35944 = new Character((char) 0);
        term35822 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term35892 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term36000 = newInstance(Class.forName("java.nio.StringCharBuffer"));
        setField(term35892, term35892.getClass(), "commentStart", term35944);
        setField(term35822, term35822.getClass(), "format", term35892);
        setBooleanField(term35822, term35822.getClass(), "newRecord", true);
        setField(term35822, term35822.getClass(), "out", term36000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printComment", argTypes, term35822, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


