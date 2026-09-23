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

public class CSVFormat_getRecordSeparator_169175301359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4560;
     Object term27697;

    public CSVFormat_getRecordSeparator_169175301359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4562 = new Character('b');
        Class<? extends Object> term27776 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term27775 = ((Class) term27776).getDeclaredField((String) "NONE");
        ((Field) term27775).setAccessible(true);
        Object enum69 = ((Field) term27775).get((Object) null);
        Character term4572 = new Character('S');
        Character term4574 = new Character('S');
        term4560 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4603 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term4560, term4560.getClass(), "delimiter", 'R');
        setField(term4560, term4560.getClass(), "quoteCharacter", term4562);
        setField(term4560, term4560.getClass(), "quoteMode", enum69);
        setField(term4560, term4560.getClass(), "commentMarker", term4572);
        setField(term4560, term4560.getClass(), "escapeCharacter", term4574);
        setBooleanField(term4560, term4560.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term4560, term4560.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term4560, term4560.getClass(), "ignoreEmptyLines", true);
        setField(term4560, term4560.getClass(), "recordSeparator", "wGmYcqUkgE");
        setField(term4560, term4560.getClass(), "nullString", "idgaQsnJpQ");
        setElement(term4603, 0, "VgZnGoIFwQ");
        setElement(term4603, 1, "jUbSRrkrYZ");
        setElement(term4603, 2, "bWWfajKbEX");
        setField(term4560, term4560.getClass(), "header", term4603);
        setBooleanField(term4560, term4560.getClass(), "skipHeaderRecord", false);
        Character term27698 = new Character('b');
        Class<? extends Object> term28005 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28004 = ((Class) term28005).getDeclaredField((String) "NONE");
        ((Field) term28004).setAccessible(true);
        Object enum70 = ((Field) term28004).get((Object) null);
        Character term27702 = new Character('S');
        Character term27703 = new Character('S');
        term27697 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27708 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term27697, term27697.getClass(), "delimiter", 'R');
        setField(term27697, term27697.getClass(), "quoteCharacter", term27698);
        setField(term27697, term27697.getClass(), "quoteMode", enum70);
        setField(term27697, term27697.getClass(), "commentMarker", term27702);
        setField(term27697, term27697.getClass(), "escapeCharacter", term27703);
        setBooleanField(term27697, term27697.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term27697, term27697.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term27697, term27697.getClass(), "ignoreEmptyLines", true);
        setField(term27697, term27697.getClass(), "recordSeparator", "wGmYcqUkgE");
        setField(term27697, term27697.getClass(), "nullString", "idgaQsnJpQ");
        setElement(term27708, 0, "VgZnGoIFwQ");
        setElement(term27708, 1, "jUbSRrkrYZ");
        setElement(term27708, 2, "bWWfajKbEX");
        setField(term27697, term27697.getClass(), "header", term27708);
        setBooleanField(term27697, term27697.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSeparator", argTypes, term4560, args);
        assertTrue(recursiveEquals(term4560, term27697));
        assertTrue(recursiveEquals(retValue, "wGmYcqUkgE"));
    }

};


