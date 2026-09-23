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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_equals_3408109844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term475;
     Object term13264;
     Object term13284;

    public CSVFormat_equals_3408109844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term382 = new Character('T');
        Class<? extends Object> term13287 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13286 = ((Class) term13287).getDeclaredField((String) "MINIMAL");
        ((Field) term13286).setAccessible(true);
        Object enum41 = ((Field) term13286).get((Object) null);
        Character term395 = new Character('D');
        Character term397 = new Character('s');
        term380 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term425 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term380, term380.getClass(), "delimiter", 't');
        setField(term380, term380.getClass(), "quoteChar", term382);
        setField(term380, term380.getClass(), "quotePolicy", enum41);
        setField(term380, term380.getClass(), "commentStart", term395);
        setField(term380, term380.getClass(), "escape", term397);
        setBooleanField(term380, term380.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term380, term380.getClass(), "ignoreEmptyLines", true);
        setField(term380, term380.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term380, term380.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term425, 0, "RMFIsYGgne");
        setElement(term425, 1, "NRdvgJlhkX");
        setElement(term425, 2, "uuaPigETmJ");
        setElement(term425, 3, "MxlszYVzRf");
        setField(term380, term380.getClass(), "header", term425);
        setBooleanField(term380, term380.getClass(), "skipHeaderRecord", true);
        term475 = newInstance(Class.forName("java.lang.Object"));
        Character term13265 = new Character('T');
        Class<? extends Object> term13515 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13514 = ((Class) term13515).getDeclaredField((String) "MINIMAL");
        ((Field) term13514).setAccessible(true);
        Object enum42 = ((Field) term13514).get((Object) null);
        Character term13269 = new Character('D');
        Character term13270 = new Character('s');
        term13264 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13275 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term13264, term13264.getClass(), "delimiter", 't');
        setField(term13264, term13264.getClass(), "quoteChar", term13265);
        setField(term13264, term13264.getClass(), "quotePolicy", enum42);
        setField(term13264, term13264.getClass(), "commentStart", term13269);
        setField(term13264, term13264.getClass(), "escape", term13270);
        setBooleanField(term13264, term13264.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term13264, term13264.getClass(), "ignoreEmptyLines", true);
        setField(term13264, term13264.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term13264, term13264.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term13275, 0, "RMFIsYGgne");
        setElement(term13275, 1, "NRdvgJlhkX");
        setElement(term13275, 2, "uuaPigETmJ");
        setElement(term13275, 3, "MxlszYVzRf");
        setField(term13264, term13264.getClass(), "header", term13275);
        setBooleanField(term13264, term13264.getClass(), "skipHeaderRecord", true);
        term13284 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term475;
        Object retValue = callMethod(klass, "equals", argTypes, term380, args);
        assertTrue(recursiveEquals(term380, term13264));
        assertTrue(recursiveEquals(term475, term13284));
        assertTrue(recursiveEquals(retValue, false));
    }

};


