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

public class CSVFormat_format_2070435827139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65074;

    public CSVFormat_format_2070435827139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term65126 = new Character((char) 2496);
        Character term65178 = new Character((char) 55564);
        Character term65230 = new Character((char) 34581);
        term65074 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term65074, term65074.getClass(), "quoteChar", term65126);
        setCharField(term65074, term65074.getClass(), "delimiter", (char) 34581);
        setField(term65074, term65074.getClass(), "escape", term65178);
        setField(term65074, term65074.getClass(), "commentStart", term65230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term65074, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


