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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_withIgnoreSurroundingSpaces_2091065286117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55106;

    public CSVFormat_withIgnoreSurroundingSpaces_2091065286117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55801 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term55800 = ((Class) term55801).getDeclaredField((String) "NONE");
        ((Field) term55800).setAccessible(true);
        Object enum144 = ((Field) term55800).get((Object) null);
        Character term55258 = new Character((char) 0);
        Character term55310 = new Character((char) 0);
        term55106 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55000 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term55106, term55106.getClass(), "delimiter", (char) 10);
        setField(term55106, term55106.getClass(), "quoteChar", null);
        setField(term55106, term55106.getClass(), "quotePolicy", enum144);
        setField(term55106, term55106.getClass(), "commentStart", term55258);
        setField(term55106, term55106.getClass(), "escape", term55310);
        setBooleanField(term55106, term55106.getClass(), "ignoreEmptyLines", false);
        setField(term55106, term55106.getClass(), "recordSeparator", null);
        setField(term55106, term55106.getClass(), "nullString", "");
        setField(term55106, term55106.getClass(), "header", term55000);
        setBooleanField(term55106, term55106.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term55106, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


