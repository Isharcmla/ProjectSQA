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

public class CSVFormat_withQuoteChar_1810112600115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54117;
     Object term54307;

    public CSVFormat_withQuoteChar_1810112600115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54770 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term54769 = ((Class) term54770).getDeclaredField((String) "NONE");
        ((Field) term54769).setAccessible(true);
        Object enum142 = ((Field) term54769).get((Object) null);
        term54117 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term54117, term54117.getClass(), "delimiter", (char) 13);
        setField(term54117, term54117.getClass(), "quotePolicy", enum142);
        setField(term54117, term54117.getClass(), "commentStart", null);
        setField(term54117, term54117.getClass(), "escape", null);
        setBooleanField(term54117, term54117.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term54117, term54117.getClass(), "ignoreEmptyLines", false);
        setField(term54117, term54117.getClass(), "recordSeparator", null);
        setField(term54117, term54117.getClass(), "nullString", "");
        setField(term54117, term54117.getClass(), "header", null);
        setBooleanField(term54117, term54117.getClass(), "skipHeaderRecord", false);
        term54307 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term54307;
        try {
            callMethod(klass, "withQuoteChar", argTypes, term54117, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


