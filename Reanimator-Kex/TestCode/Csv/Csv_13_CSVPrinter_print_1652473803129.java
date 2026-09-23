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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_print_1652473803129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104088;

    public CSVPrinter_print_1652473803129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term104210 = new Character((char) 0);
        Class<? extends Object> term104897 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term104896 = ((Class) term104897).getDeclaredField((String) "NONE");
        ((Field) term104896).setAccessible(true);
        Object enum108 = ((Field) term104896).get((Object) null);
        term104088 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term104158 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term104088, term104088.getClass(), "newRecord", true);
        setField(term104158, term104158.getClass(), "quoteCharacter", term104210);
        setCharField(term104158, term104158.getClass(), "delimiter", (char) 0);
        setField(term104158, term104158.getClass(), "quoteMode", enum108);
        setField(term104088, term104088.getClass(), "format", term104158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "print", argTypes, term104088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


