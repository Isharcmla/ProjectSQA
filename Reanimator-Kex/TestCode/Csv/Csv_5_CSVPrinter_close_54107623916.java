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
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_close_54107623916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;
     Object term5520;

    public CSVPrinter_close_54107623916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term374 = new Character('n');
        Class<? extends Object> term5542 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term5541 = ((Class) term5542).getDeclaredField((String) "MINIMAL");
        ((Field) term5541).setAccessible(true);
        Object enum16 = ((Field) term5541).get((Object) null);
        Character term387 = new Character('Z');
        Character term389 = new Character('t');
        term371 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term417 = (Object[]) newArray("java.lang.String", 4);
        setField(term371, term371.getClass(), "out", null);
        setCharField(term372, term372.getClass(), "delimiter", 't');
        setField(term372, term372.getClass(), "quoteChar", term374);
        setField(term372, term372.getClass(), "quotePolicy", enum16);
        setField(term372, term372.getClass(), "commentStart", term387);
        setField(term372, term372.getClass(), "escape", term389);
        setBooleanField(term372, term372.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term372, term372.getClass(), "ignoreEmptyLines", true);
        setField(term372, term372.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term372, term372.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term417, 0, "RMFIsYGgne");
        setElement(term417, 1, "NRdvgJlhkX");
        setElement(term417, 2, "uuaPigETmJ");
        setElement(term417, 3, "MxlszYVzRf");
        setField(term372, term372.getClass(), "header", term417);
        setBooleanField(term372, term372.getClass(), "skipHeaderRecord", true);
        setField(term371, term371.getClass(), "format", term372);
        setBooleanField(term371, term371.getClass(), "newRecord", true);
        Character term5522 = new Character('n');
        Class<? extends Object> term5770 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term5769 = ((Class) term5770).getDeclaredField((String) "MINIMAL");
        ((Field) term5769).setAccessible(true);
        Object enum17 = ((Field) term5769).get((Object) null);
        Character term5526 = new Character('Z');
        Character term5527 = new Character('t');
        term5520 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term5521 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5532 = (Object[]) newArray("java.lang.String", 4);
        setField(term5520, term5520.getClass(), "out", null);
        setCharField(term5521, term5521.getClass(), "delimiter", 't');
        setField(term5521, term5521.getClass(), "quoteChar", term5522);
        setField(term5521, term5521.getClass(), "quotePolicy", enum17);
        setField(term5521, term5521.getClass(), "commentStart", term5526);
        setField(term5521, term5521.getClass(), "escape", term5527);
        setBooleanField(term5521, term5521.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5521, term5521.getClass(), "ignoreEmptyLines", true);
        setField(term5521, term5521.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term5521, term5521.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term5532, 0, "RMFIsYGgne");
        setElement(term5532, 1, "NRdvgJlhkX");
        setElement(term5532, 2, "uuaPigETmJ");
        setElement(term5532, 3, "MxlszYVzRf");
        setField(term5521, term5521.getClass(), "header", term5532);
        setBooleanField(term5521, term5521.getClass(), "skipHeaderRecord", true);
        setField(term5520, term5520.getClass(), "format", term5521);
        setBooleanField(term5520, term5520.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term371, args);
        assertTrue(recursiveEquals(term371, term5520));
    }

};


