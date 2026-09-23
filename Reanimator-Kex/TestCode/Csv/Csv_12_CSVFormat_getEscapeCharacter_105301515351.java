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

public class CSVFormat_getEscapeCharacter_105301515351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1740;
     Object term22319;
     Object term21835;

    public CSVFormat_getEscapeCharacter_105301515351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1742 = new Character('g');
        Class<? extends Object> term23179 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term23178 = ((Class) term23179).getDeclaredField((String) "NONE");
        ((Field) term23178).setAccessible(true);
        Object enum52 = ((Field) term23178).get((Object) null);
        Character term1752 = new Character('Q');
        Character term1754 = new Character('H');
        term1740 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1783 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term1740, term1740.getClass(), "delimiter", 'c');
        setField(term1740, term1740.getClass(), "quoteCharacter", term1742);
        setField(term1740, term1740.getClass(), "quoteMode", enum52);
        setField(term1740, term1740.getClass(), "commentMarker", term1752);
        setField(term1740, term1740.getClass(), "escapeCharacter", term1754);
        setBooleanField(term1740, term1740.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1740, term1740.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term1740, term1740.getClass(), "ignoreEmptyLines", true);
        setField(term1740, term1740.getClass(), "recordSeparator", "TEParAifyi");
        setField(term1740, term1740.getClass(), "nullString", "OWDIEULEFu");
        setElement(term1783, 0, "dWRymuLBtr");
        setElement(term1783, 1, "AijpHYOFuy");
        setField(term1740, term1740.getClass(), "header", term1783);
        setBooleanField(term1740, term1740.getClass(), "skipHeaderRecord", true);
        Character term22320 = new Character('g');
        Class<? extends Object> term23398 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term23397 = ((Class) term23398).getDeclaredField((String) "NONE");
        ((Field) term23397).setAccessible(true);
        Object enum55 = ((Field) term23397).get((Object) null);
        Character term22324 = new Character('Q');
        Character term22325 = new Character('H');
        term22319 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22330 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term22319, term22319.getClass(), "delimiter", 'c');
        setField(term22319, term22319.getClass(), "quoteCharacter", term22320);
        setField(term22319, term22319.getClass(), "quoteMode", enum55);
        setField(term22319, term22319.getClass(), "commentMarker", term22324);
        setField(term22319, term22319.getClass(), "escapeCharacter", term22325);
        setBooleanField(term22319, term22319.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term22319, term22319.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term22319, term22319.getClass(), "ignoreEmptyLines", true);
        setField(term22319, term22319.getClass(), "recordSeparator", "TEParAifyi");
        setField(term22319, term22319.getClass(), "nullString", "OWDIEULEFu");
        setElement(term22330, 0, "dWRymuLBtr");
        setElement(term22330, 1, "AijpHYOFuy");
        setField(term22319, term22319.getClass(), "header", term22330);
        setBooleanField(term22319, term22319.getClass(), "skipHeaderRecord", true);
        term21835 = new Character('H');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEscapeCharacter", argTypes, term1740, args);
        assertTrue(recursiveEquals(term1740, term22319));
        assertTrue(recursiveEquals(retValue, term21835));
    }

};


