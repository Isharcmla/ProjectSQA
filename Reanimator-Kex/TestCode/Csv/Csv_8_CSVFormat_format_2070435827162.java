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
import java.lang.Object;

public class CSVFormat_format_2070435827162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75500;

    public CSVFormat_format_2070435827162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term75552 = new Character((char) 16);
        Character term75604 = new Character((char) 4096);
        Character term75656 = new Character((char) 0);
        term75500 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term75319 = (Object[]) newArray("java.lang.String", 16);
        setField(term75500, term75500.getClass(), "quoteChar", term75552);
        setCharField(term75500, term75500.getClass(), "delimiter", (char) 65516);
        setField(term75500, term75500.getClass(), "escape", term75604);
        setField(term75500, term75500.getClass(), "commentStart", term75656);
        setField(term75500, term75500.getClass(), "header", term75319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term75500, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


