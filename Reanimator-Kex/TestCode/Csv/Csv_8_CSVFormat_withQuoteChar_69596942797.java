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

public class CSVFormat_withQuoteChar_69596942797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47813;

    public CSVFormat_withQuoteChar_69596942797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48737 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term48736 = ((Class) term48737).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term48736).setAccessible(true);
        Object enum134 = ((Field) term48736).get((Object) null);
        term47813 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term47813, term47813.getClass(), "delimiter", (char) 10);
        setField(term47813, term47813.getClass(), "quotePolicy", enum134);
        setField(term47813, term47813.getClass(), "commentStart", null);
        setField(term47813, term47813.getClass(), "escape", null);
        setBooleanField(term47813, term47813.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term47813, term47813.getClass(), "ignoreEmptyLines", false);
        setField(term47813, term47813.getClass(), "recordSeparator", null);
        setField(term47813, term47813.getClass(), "nullString", "");
        setField(term47813, term47813.getClass(), "header", null);
        setBooleanField(term47813, term47813.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "withQuoteChar", argTypes, term47813, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


