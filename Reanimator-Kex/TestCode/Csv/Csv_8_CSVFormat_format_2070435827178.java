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
import java.lang.Character;

public class CSVFormat_format_2070435827178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78709;

    public CSVFormat_format_2070435827178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term78761 = new Character((char) 33024);
        Character term78813 = new Character((char) 27153);
        term78709 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term78709, term78709.getClass(), "quoteChar", term78761);
        setCharField(term78709, term78709.getClass(), "delimiter", (char) 27153);
        setField(term78709, term78709.getClass(), "escape", term78813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term78709, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


