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

public class CSVFormat_format_2070435827153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71886;

    public CSVFormat_format_2070435827153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term71938 = new Character((char) 0);
        Character term71990 = new Character((char) 2048);
        Character term72042 = new Character((char) 0);
        term71886 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term71886, term71886.getClass(), "quoteChar", term71938);
        setCharField(term71886, term71886.getClass(), "delimiter", (char) 63471);
        setField(term71886, term71886.getClass(), "escape", term71990);
        setField(term71886, term71886.getClass(), "commentStart", term72042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term71886, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


