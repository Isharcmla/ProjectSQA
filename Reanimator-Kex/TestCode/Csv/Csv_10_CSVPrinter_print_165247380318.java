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

public class CSVPrinter_print_165247380318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999;
     Object term1092;

    public CSVPrinter_print_165247380318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1002 = new Character('J');
        Class<? extends Object> term6881 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term6880 = ((Class) term6881).getDeclaredField((String) "ALL");
        ((Field) term6880).setAccessible(true);
        Object enum20 = ((Field) term6880).get((Object) null);
        Character term1011 = new Character('A');
        Character term1013 = new Character('E');
        term999 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1000 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1041 = (Object[]) newArray("java.lang.String", 4);
        setField(term999, term999.getClass(), "out", null);
        setCharField(term1000, term1000.getClass(), "delimiter", 'l');
        setField(term1000, term1000.getClass(), "quoteChar", term1002);
        setField(term1000, term1000.getClass(), "quotePolicy", enum20);
        setField(term1000, term1000.getClass(), "commentStart", term1011);
        setField(term1000, term1000.getClass(), "escape", term1013);
        setBooleanField(term1000, term1000.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1000, term1000.getClass(), "ignoreEmptyLines", false);
        setField(term1000, term1000.getClass(), "recordSeparator", "HyxfbSQYBe");
        setField(term1000, term1000.getClass(), "nullString", "pCTimMblYc");
        setElement(term1041, 0, "hNxWaHcfhY");
        setElement(term1041, 1, "RkybSrpybU");
        setElement(term1041, 2, "xOEqzGAmDU");
        setElement(term1041, 3, "eZFUvlxvGV");
        setField(term1000, term1000.getClass(), "header", term1041);
        setBooleanField(term1000, term1000.getClass(), "skipHeaderRecord", true);
        setField(term999, term999.getClass(), "format", term1000);
        setBooleanField(term999, term999.getClass(), "newRecord", false);
        term1092 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1092;
        try {
            callMethod(klass, "print", argTypes, term999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


