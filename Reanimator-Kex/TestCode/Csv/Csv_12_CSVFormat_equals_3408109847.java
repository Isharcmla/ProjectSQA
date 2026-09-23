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

public class CSVFormat_equals_3408109847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;
     Object term498;
     Object term15387;
     Object term15407;

    public CSVFormat_equals_3408109847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term404 = new Character('T');
        Class<? extends Object> term15410 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15409 = ((Class) term15410).getDeclaredField((String) "MINIMAL");
        ((Field) term15409).setAccessible(true);
        Object enum44 = ((Field) term15409).get((Object) null);
        Character term417 = new Character('D');
        Character term419 = new Character('s');
        term402 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term448 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term402, term402.getClass(), "delimiter", 't');
        setField(term402, term402.getClass(), "quoteCharacter", term404);
        setField(term402, term402.getClass(), "quoteMode", enum44);
        setField(term402, term402.getClass(), "commentMarker", term417);
        setField(term402, term402.getClass(), "escapeCharacter", term419);
        setBooleanField(term402, term402.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term402, term402.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term402, term402.getClass(), "ignoreEmptyLines", true);
        setField(term402, term402.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term402, term402.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term448, 0, "RMFIsYGgne");
        setElement(term448, 1, "NRdvgJlhkX");
        setElement(term448, 2, "uuaPigETmJ");
        setElement(term448, 3, "MxlszYVzRf");
        setField(term402, term402.getClass(), "header", term448);
        setBooleanField(term402, term402.getClass(), "skipHeaderRecord", true);
        term498 = newInstance(Class.forName("java.lang.Object"));
        Character term15388 = new Character('T');
        Class<? extends Object> term15658 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15657 = ((Class) term15658).getDeclaredField((String) "MINIMAL");
        ((Field) term15657).setAccessible(true);
        Object enum45 = ((Field) term15657).get((Object) null);
        Character term15392 = new Character('D');
        Character term15393 = new Character('s');
        term15387 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15398 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term15387, term15387.getClass(), "delimiter", 't');
        setField(term15387, term15387.getClass(), "quoteCharacter", term15388);
        setField(term15387, term15387.getClass(), "quoteMode", enum45);
        setField(term15387, term15387.getClass(), "commentMarker", term15392);
        setField(term15387, term15387.getClass(), "escapeCharacter", term15393);
        setBooleanField(term15387, term15387.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term15387, term15387.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term15387, term15387.getClass(), "ignoreEmptyLines", true);
        setField(term15387, term15387.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term15387, term15387.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term15398, 0, "RMFIsYGgne");
        setElement(term15398, 1, "NRdvgJlhkX");
        setElement(term15398, 2, "uuaPigETmJ");
        setElement(term15398, 3, "MxlszYVzRf");
        setField(term15387, term15387.getClass(), "header", term15398);
        setBooleanField(term15387, term15387.getClass(), "skipHeaderRecord", true);
        term15407 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term498;
        Object retValue = callMethod(klass, "equals", argTypes, term402, args);
        assertTrue(recursiveEquals(term402, term15387));
        assertTrue(recursiveEquals(term498, term15407));
        assertTrue(recursiveEquals(retValue, false));
    }

};


