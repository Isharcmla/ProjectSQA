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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_parse_76031632362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6140;

    public CSVFormat_parse_76031632362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6142 = new Character('h');
        Class<? extends Object> term26799 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term26798 = ((Class) term26799).getDeclaredField((String) "ALL");
        ((Field) term26798).setAccessible(true);
        Object enum78 = ((Field) term26798).get((Object) null);
        Character term6151 = new Character('R');
        Character term6153 = new Character('N');
        term6140 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6181 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term6140, term6140.getClass(), "delimiter", 'F');
        setField(term6140, term6140.getClass(), "quoteChar", term6142);
        setField(term6140, term6140.getClass(), "quotePolicy", enum78);
        setField(term6140, term6140.getClass(), "commentStart", term6151);
        setField(term6140, term6140.getClass(), "escape", term6153);
        setBooleanField(term6140, term6140.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6140, term6140.getClass(), "ignoreEmptyLines", false);
        setField(term6140, term6140.getClass(), "recordSeparator", "SJiQaLvSKv");
        setField(term6140, term6140.getClass(), "nullString", "OEXDRUKcFl");
        setElement(term6181, 0, "RYdKCNNMBR");
        setElement(term6181, 1, "yGtHPyvYiQ");
        setField(term6140, term6140.getClass(), "header", term6181);
        setBooleanField(term6140, term6140.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term6140, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


