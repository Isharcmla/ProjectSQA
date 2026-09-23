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

public class CSVPrinter_init_93915638815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CSVPrinter_init_93915638815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3 = new Character('A');
        Class<? extends Object> term7125 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term7124 = ((Class) term7125).getDeclaredField((String) "ALL");
        ((Field) term7124).setAccessible(true);
        Object enum15 = ((Field) term7124).get((Object) null);
        Character term12 = new Character('E');
        Character term14 = new Character('B');
        term1 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term43 = (Object[]) newArray("java.lang.String", 5);
        Object[] term104 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term1, term1.getClass(), "delimiter", 'P');
        setField(term1, term1.getClass(), "quoteCharacter", term3);
        setField(term1, term1.getClass(), "quoteMode", enum15);
        setField(term1, term1.getClass(), "commentMarker", term12);
        setField(term1, term1.getClass(), "escapeCharacter", term14);
        setBooleanField(term1, term1.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1, term1.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term1, term1.getClass(), "ignoreEmptyLines", false);
        setField(term1, term1.getClass(), "recordSeparator", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "nullString", "sjlJAEtRrb");
        setElement(term43, 0, "MuLcgQHgqz");
        setElement(term43, 1, "xxtlPwDYFs");
        setElement(term43, 2, "jJCZpVmanW");
        setElement(term43, 3, "EGtDIRbSSb");
        setElement(term43, 4, "SzjVpOQTyS");
        setField(term1, term1.getClass(), "header", term43);
        setElement(term104, 0, "MjGYSRKTNF");
        setElement(term104, 1, "hRNSzYYIrc");
        setElement(term104, 2, "RMFIsYGgne");
        setElement(term104, 3, "NRdvgJlhkX");
        setField(term1, term1.getClass(), "headerComments", term104);
        setBooleanField(term1, term1.getClass(), "skipHeaderRecord", false);
        setBooleanField(term1, term1.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


