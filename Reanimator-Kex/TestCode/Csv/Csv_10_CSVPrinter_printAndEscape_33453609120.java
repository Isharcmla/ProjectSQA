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
import java.lang.Integer;

public class CSVPrinter_printAndEscape_33453609120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;
     Object term1707;
     Object term1709;

    public CSVPrinter_printAndEscape_33453609120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1592 = new Character('u');
        Class<? extends Object> term8104 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term8103 = ((Class) term8104).getDeclaredField((String) "NONE");
        ((Field) term8103).setAccessible(true);
        Object enum22 = ((Field) term8103).get((Object) null);
        Character term1602 = new Character('L');
        Character term1604 = new Character('c');
        term1589 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1590 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1632 = (Object[]) newArray("java.lang.String", 6);
        setField(term1589, term1589.getClass(), "out", null);
        setCharField(term1590, term1590.getClass(), "delimiter", 'M');
        setField(term1590, term1590.getClass(), "quoteChar", term1592);
        setField(term1590, term1590.getClass(), "quotePolicy", enum22);
        setField(term1590, term1590.getClass(), "commentStart", term1602);
        setField(term1590, term1590.getClass(), "escape", term1604);
        setBooleanField(term1590, term1590.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1590, term1590.getClass(), "ignoreEmptyLines", true);
        setField(term1590, term1590.getClass(), "recordSeparator", "OclPbYPkcH");
        setField(term1590, term1590.getClass(), "nullString", "IoAlmYsBwc");
        setElement(term1632, 0, "TEParAifyi");
        setElement(term1632, 1, "OWDIEULEFu");
        setElement(term1632, 2, "dWRymuLBtr");
        setElement(term1632, 3, "AijpHYOFuy");
        setElement(term1632, 4, "SbAoxhfrkn");
        setElement(term1632, 5, "kuTXqwMtDB");
        setField(term1590, term1590.getClass(), "header", term1632);
        setBooleanField(term1590, term1590.getClass(), "skipHeaderRecord", true);
        setField(term1589, term1589.getClass(), "format", term1590);
        setBooleanField(term1589, term1589.getClass(), "newRecord", true);
        term1707 = new Integer(1484323161);
        term1709 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1707;
        args[2] = term1709;
        try {
            callMethod(klass, "printAndEscape", argTypes, term1589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


