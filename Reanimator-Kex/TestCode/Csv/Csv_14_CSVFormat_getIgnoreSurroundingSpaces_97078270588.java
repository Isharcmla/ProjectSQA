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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_getIgnoreSurroundingSpaces_97078270588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4770;
     Object term47579;

    public CSVFormat_getIgnoreSurroundingSpaces_97078270588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4772 = new Character('a');
        Character term4775 = new Character('W');
        Character term4890 = new Character('E');
        Class<? extends Object> term47699 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47698 = ((Class) term47699).getDeclaredField((String) "NONE");
        ((Field) term47698).setAccessible(true);
        Object enum94 = ((Field) term47698).get((Object) null);
        term4770 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4777 = (Object[]) newArray("java.lang.String", 3);
        Object[] term4814 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term4770, term4770.getClass(), "allowMissingColumnNames", false);
        setField(term4770, term4770.getClass(), "commentMarker", term4772);
        setCharField(term4770, term4770.getClass(), "delimiter", 'n');
        setField(term4770, term4770.getClass(), "escapeCharacter", term4775);
        setElement(term4777, 0, "qxSDVejjiY");
        setElement(term4777, 1, "xBsXSDjXYK");
        setElement(term4777, 2, "sEnIVFtZuQ");
        setField(term4770, term4770.getClass(), "header", term4777);
        setElement(term4814, 0, "ZVecLZMLHF");
        setElement(term4814, 1, "fztQhjqwdP");
        setElement(term4814, 2, "eVpkWxjuki");
        setElement(term4814, 3, "SJiQaLvSKv");
        setElement(term4814, 4, "OEXDRUKcFl");
        setField(term4770, term4770.getClass(), "headerComments", term4814);
        setBooleanField(term4770, term4770.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term4770, term4770.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term4770, term4770.getClass(), "ignoreSurroundingSpaces", false);
        setField(term4770, term4770.getClass(), "nullString", "RYdKCNNMBR");
        setField(term4770, term4770.getClass(), "quoteCharacter", term4890);
        setField(term4770, term4770.getClass(), "quoteMode", enum94);
        setField(term4770, term4770.getClass(), "recordSeparator", "yGtHPyvYiQ");
        setBooleanField(term4770, term4770.getClass(), "skipHeaderRecord", false);
        setBooleanField(term4770, term4770.getClass(), "trailingDelimiter", true);
        setBooleanField(term4770, term4770.getClass(), "trim", false);
        Character term47580 = new Character('a');
        Character term47581 = new Character('W');
        Character term47602 = new Character('E');
        Class<? extends Object> term47978 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47977 = ((Class) term47978).getDeclaredField((String) "NONE");
        ((Field) term47977).setAccessible(true);
        Object enum95 = ((Field) term47977).get((Object) null);
        term47579 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term47582 = (Object[]) newArray("java.lang.String", 3);
        Object[] term47589 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term47579, term47579.getClass(), "allowMissingColumnNames", false);
        setField(term47579, term47579.getClass(), "commentMarker", term47580);
        setCharField(term47579, term47579.getClass(), "delimiter", 'n');
        setField(term47579, term47579.getClass(), "escapeCharacter", term47581);
        setElement(term47582, 0, "qxSDVejjiY");
        setElement(term47582, 1, "xBsXSDjXYK");
        setElement(term47582, 2, "sEnIVFtZuQ");
        setField(term47579, term47579.getClass(), "header", term47582);
        setElement(term47589, 0, "ZVecLZMLHF");
        setElement(term47589, 1, "fztQhjqwdP");
        setElement(term47589, 2, "eVpkWxjuki");
        setElement(term47589, 3, "SJiQaLvSKv");
        setElement(term47589, 4, "OEXDRUKcFl");
        setField(term47579, term47579.getClass(), "headerComments", term47589);
        setBooleanField(term47579, term47579.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term47579, term47579.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term47579, term47579.getClass(), "ignoreSurroundingSpaces", false);
        setField(term47579, term47579.getClass(), "nullString", "RYdKCNNMBR");
        setField(term47579, term47579.getClass(), "quoteCharacter", term47602);
        setField(term47579, term47579.getClass(), "quoteMode", enum95);
        setField(term47579, term47579.getClass(), "recordSeparator", "yGtHPyvYiQ");
        setBooleanField(term47579, term47579.getClass(), "skipHeaderRecord", false);
        setBooleanField(term47579, term47579.getClass(), "trailingDelimiter", true);
        setBooleanField(term47579, term47579.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreSurroundingSpaces", argTypes, term4770, args);
        assertTrue(recursiveEquals(term4770, term47579));
    }

};


