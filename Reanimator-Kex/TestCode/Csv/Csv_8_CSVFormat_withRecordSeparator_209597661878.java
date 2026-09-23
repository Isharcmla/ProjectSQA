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

public class CSVFormat_withRecordSeparator_209597661878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11692;
     Object term42628;
     Object term42456;

    public CSVFormat_withRecordSeparator_209597661878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11694 = new Character('l');
        Class<? extends Object> term42773 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term42772 = ((Class) term42773).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42772).setAccessible(true);
        Object enum124 = ((Field) term42772).get((Object) null);
        Character term11711 = new Character('i');
        Character term11713 = new Character('e');
        term11692 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11741 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term11692, term11692.getClass(), "delimiter", 'J');
        setField(term11692, term11692.getClass(), "quoteChar", term11694);
        setField(term11692, term11692.getClass(), "quotePolicy", enum124);
        setField(term11692, term11692.getClass(), "commentStart", term11711);
        setField(term11692, term11692.getClass(), "escape", term11713);
        setBooleanField(term11692, term11692.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term11692, term11692.getClass(), "ignoreEmptyLines", true);
        setField(term11692, term11692.getClass(), "recordSeparator", "SFqCrhEWLm");
        setField(term11692, term11692.getClass(), "nullString", "GZdcJyZntS");
        setElement(term11741, 0, "OIHoJeysUi");
        setField(term11692, term11692.getClass(), "header", term11741);
        setBooleanField(term11692, term11692.getClass(), "skipHeaderRecord", true);
        Character term42629 = new Character('l');
        Class<? extends Object> term43155 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term43154 = ((Class) term43155).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43154).setAccessible(true);
        Object enum126 = ((Field) term43154).get((Object) null);
        Character term42633 = new Character('i');
        Character term42634 = new Character('e');
        term42628 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42639 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term42628, term42628.getClass(), "delimiter", 'J');
        setField(term42628, term42628.getClass(), "quoteChar", term42629);
        setField(term42628, term42628.getClass(), "quotePolicy", enum126);
        setField(term42628, term42628.getClass(), "commentStart", term42633);
        setField(term42628, term42628.getClass(), "escape", term42634);
        setBooleanField(term42628, term42628.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term42628, term42628.getClass(), "ignoreEmptyLines", true);
        setField(term42628, term42628.getClass(), "recordSeparator", "SFqCrhEWLm");
        setField(term42628, term42628.getClass(), "nullString", "GZdcJyZntS");
        setElement(term42639, 0, "OIHoJeysUi");
        setField(term42628, term42628.getClass(), "header", term42639);
        setBooleanField(term42628, term42628.getClass(), "skipHeaderRecord", true);
        Character term42458 = new Character('l');
        Class<? extends Object> term43403 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term43402 = ((Class) term43403).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43402).setAccessible(true);
        Object enum128 = ((Field) term43402).get((Object) null);
        Character term42475 = new Character('i');
        Character term42477 = new Character('e');
        term42456 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42505 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term42456, term42456.getClass(), "delimiter", 'J');
        setField(term42456, term42456.getClass(), "quoteChar", term42458);
        setField(term42456, term42456.getClass(), "quotePolicy", enum128);
        setField(term42456, term42456.getClass(), "commentStart", term42475);
        setField(term42456, term42456.getClass(), "escape", term42477);
        setBooleanField(term42456, term42456.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term42456, term42456.getClass(), "ignoreEmptyLines", true);
        setField(term42456, term42456.getClass(), "recordSeparator", "WXMWFDGcLB");
        setField(term42456, term42456.getClass(), "nullString", "GZdcJyZntS");
        setElement(term42505, 0, "OIHoJeysUi");
        setField(term42456, term42456.getClass(), "header", term42505);
        setBooleanField(term42456, term42456.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXMWFDGcLB";
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term11692, args);
        assertTrue(recursiveEquals(term11692, term42628));
        assertTrue(recursiveEquals(retValue, term42456));
    }

};


