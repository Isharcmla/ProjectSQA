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
import java.lang.Boolean;

public class CSVFormat_withIgnoreHeaderCase_1929024790131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24681;
     Object term24826;
     Object term95615;
     Object term95154;

    public CSVFormat_withIgnoreHeaderCase_1929024790131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term24683 = new Character('z');
        Character term24686 = new Character('A');
        Character term24801 = new Character('m');
        Class<? extends Object> term95735 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term95734 = ((Class) term95735).getDeclaredField((String) "NONE");
        ((Field) term95734).setAccessible(true);
        Object enum193 = ((Field) term95734).get((Object) null);
        term24681 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24688 = (Object[]) newArray("java.lang.String", 8);
        Object[] term24785 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term24681, term24681.getClass(), "allowMissingColumnNames", false);
        setField(term24681, term24681.getClass(), "commentMarker", term24683);
        setCharField(term24681, term24681.getClass(), "delimiter", 'G');
        setField(term24681, term24681.getClass(), "escapeCharacter", term24686);
        setElement(term24688, 0, "EWFbEDAVrE");
        setElement(term24688, 1, "EMiMtYgfvr");
        setElement(term24688, 2, "OyYyYYnJuF");
        setElement(term24688, 3, "aYLvcxZohT");
        setElement(term24688, 4, "mnHyQbMyld");
        setElement(term24688, 5, "KHtaDOIcJZ");
        setElement(term24688, 6, "vgdwrCZczl");
        setElement(term24688, 7, "gKMNrpKBpu");
        setField(term24681, term24681.getClass(), "header", term24688);
        setField(term24681, term24681.getClass(), "headerComments", term24785);
        setBooleanField(term24681, term24681.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term24681, term24681.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term24681, term24681.getClass(), "ignoreSurroundingSpaces", false);
        setField(term24681, term24681.getClass(), "nullString", "ZbHJVEqcoa");
        setField(term24681, term24681.getClass(), "quoteCharacter", term24801);
        setField(term24681, term24681.getClass(), "quoteMode", enum193);
        setField(term24681, term24681.getClass(), "recordSeparator", "awDQVEVIKi");
        setBooleanField(term24681, term24681.getClass(), "skipHeaderRecord", false);
        setBooleanField(term24681, term24681.getClass(), "trailingDelimiter", false);
        setBooleanField(term24681, term24681.getClass(), "trim", false);
        term24826 = new Boolean(true);
        Character term95616 = new Character('z');
        Character term95617 = new Character('A');
        Character term95638 = new Character('m');
        Class<? extends Object> term96014 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term96013 = ((Class) term96014).getDeclaredField((String) "NONE");
        ((Field) term96013).setAccessible(true);
        Object enum194 = ((Field) term96013).get((Object) null);
        term95615 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term95618 = (Object[]) newArray("java.lang.String", 8);
        Object[] term95635 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term95615, term95615.getClass(), "allowMissingColumnNames", false);
        setField(term95615, term95615.getClass(), "commentMarker", term95616);
        setCharField(term95615, term95615.getClass(), "delimiter", 'G');
        setField(term95615, term95615.getClass(), "escapeCharacter", term95617);
        setElement(term95618, 0, "EWFbEDAVrE");
        setElement(term95618, 1, "EMiMtYgfvr");
        setElement(term95618, 2, "OyYyYYnJuF");
        setElement(term95618, 3, "aYLvcxZohT");
        setElement(term95618, 4, "mnHyQbMyld");
        setElement(term95618, 5, "KHtaDOIcJZ");
        setElement(term95618, 6, "vgdwrCZczl");
        setElement(term95618, 7, "gKMNrpKBpu");
        setField(term95615, term95615.getClass(), "header", term95618);
        setField(term95615, term95615.getClass(), "headerComments", term95635);
        setBooleanField(term95615, term95615.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term95615, term95615.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term95615, term95615.getClass(), "ignoreSurroundingSpaces", false);
        setField(term95615, term95615.getClass(), "nullString", "ZbHJVEqcoa");
        setField(term95615, term95615.getClass(), "quoteCharacter", term95638);
        setField(term95615, term95615.getClass(), "quoteMode", enum194);
        setField(term95615, term95615.getClass(), "recordSeparator", "awDQVEVIKi");
        setBooleanField(term95615, term95615.getClass(), "skipHeaderRecord", false);
        setBooleanField(term95615, term95615.getClass(), "trailingDelimiter", false);
        setBooleanField(term95615, term95615.getClass(), "trim", false);
        Character term95156 = new Character('z');
        Character term95159 = new Character('A');
        Character term95274 = new Character('m');
        Class<? extends Object> term96293 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term96292 = ((Class) term96293).getDeclaredField((String) "NONE");
        ((Field) term96292).setAccessible(true);
        Object enum195 = ((Field) term96292).get((Object) null);
        term95154 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term95161 = (Object[]) newArray("java.lang.String", 8);
        Object[] term95258 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term95154, term95154.getClass(), "allowMissingColumnNames", false);
        setField(term95154, term95154.getClass(), "commentMarker", term95156);
        setCharField(term95154, term95154.getClass(), "delimiter", 'G');
        setField(term95154, term95154.getClass(), "escapeCharacter", term95159);
        setElement(term95161, 0, "EWFbEDAVrE");
        setElement(term95161, 1, "EMiMtYgfvr");
        setElement(term95161, 2, "OyYyYYnJuF");
        setElement(term95161, 3, "aYLvcxZohT");
        setElement(term95161, 4, "mnHyQbMyld");
        setElement(term95161, 5, "KHtaDOIcJZ");
        setElement(term95161, 6, "vgdwrCZczl");
        setElement(term95161, 7, "gKMNrpKBpu");
        setField(term95154, term95154.getClass(), "header", term95161);
        setField(term95154, term95154.getClass(), "headerComments", term95258);
        setBooleanField(term95154, term95154.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term95154, term95154.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term95154, term95154.getClass(), "ignoreSurroundingSpaces", false);
        setField(term95154, term95154.getClass(), "nullString", "ZbHJVEqcoa");
        setField(term95154, term95154.getClass(), "quoteCharacter", term95274);
        setField(term95154, term95154.getClass(), "quoteMode", enum195);
        setField(term95154, term95154.getClass(), "recordSeparator", "awDQVEVIKi");
        setBooleanField(term95154, term95154.getClass(), "skipHeaderRecord", false);
        setBooleanField(term95154, term95154.getClass(), "trailingDelimiter", false);
        setBooleanField(term95154, term95154.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term24826;
        Object retValue = callMethod(klass, "withIgnoreHeaderCase", argTypes, term24681, args);
        assertTrue(recursiveEquals(term24681, term95615));
        assertTrue(recursiveEquals(term24826, true));
        assertTrue(recursiveEquals(retValue, term95154));
    }

};


