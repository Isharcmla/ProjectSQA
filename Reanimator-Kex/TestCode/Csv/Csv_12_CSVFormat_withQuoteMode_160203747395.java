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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withQuoteMode_160203747395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54621;
     Object enum134;

    public CSVFormat_withQuoteMode_160203747395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term54673 = new Character((char) 0);
        term54621 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term54468 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term54621, term54621.getClass(), "delimiter", (char) 0);
        setField(term54621, term54621.getClass(), "quoteCharacter", term54673);
        setField(term54621, term54621.getClass(), "commentMarker", term54673);
        setField(term54621, term54621.getClass(), "escapeCharacter", null);
        setBooleanField(term54621, term54621.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term54621, term54621.getClass(), "ignoreEmptyLines", false);
        setField(term54621, term54621.getClass(), "recordSeparator", null);
        setField(term54621, term54621.getClass(), "nullString", "NONE");
        setField(term54621, term54621.getClass(), "header", term54468);
        setBooleanField(term54621, term54621.getClass(), "skipHeaderRecord", false);
        setBooleanField(term54621, term54621.getClass(), "allowMissingColumnNames", false);
        Class<? extends Object> term55354 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55353 = ((Class) term55354).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term55353).setAccessible(true);
        enum134 = ((Field) term55353).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.QuoteMode");
        Object[] args = new Object[1];
        args[0] = enum134;
        try {
            callMethod(klass, "withQuoteMode", argTypes, term54621, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


