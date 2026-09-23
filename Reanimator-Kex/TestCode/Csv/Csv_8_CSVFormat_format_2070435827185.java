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

public class CSVFormat_format_2070435827185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89835;

    public CSVFormat_format_2070435827185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term89887 = new Character((char) 41208);
        Character term89939 = new Character('C');
        Character term89991 = new Character('C');
        term89835 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term89835, term89835.getClass(), "quoteChar", term89887);
        setCharField(term89835, term89835.getClass(), "delimiter", (char) 60164);
        setField(term89835, term89835.getClass(), "escape", term89939);
        setField(term89835, term89835.getClass(), "commentStart", term89991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term89835, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


