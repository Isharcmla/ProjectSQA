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

public class CSVFormat_validate_72528894286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11817;
     Object term59856;

    public CSVFormat_validate_72528894286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11819 = new Character('k');
        Class<? extends Object> term59874 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59873 = ((Class) term59874).getDeclaredField((String) "ALL");
        ((Field) term59873).setAccessible(true);
        Object enum105 = ((Field) term59873).get((Object) null);
        Character term11828 = new Character('X');
        Character term11830 = new Character('u');
        term11817 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11859 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11860 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term11817, term11817.getClass(), "delimiter", 'h');
        setField(term11817, term11817.getClass(), "quoteCharacter", term11819);
        setField(term11817, term11817.getClass(), "quoteMode", enum105);
        setField(term11817, term11817.getClass(), "commentMarker", term11828);
        setField(term11817, term11817.getClass(), "escapeCharacter", term11830);
        setBooleanField(term11817, term11817.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term11817, term11817.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term11817, term11817.getClass(), "ignoreEmptyLines", false);
        setField(term11817, term11817.getClass(), "recordSeparator", "NJhGgctbdj");
        setField(term11817, term11817.getClass(), "nullString", "MYWYUeLGOp");
        setField(term11817, term11817.getClass(), "header", term11859);
        setElement(term11860, 0, "tsTGdgQYUL");
        setElement(term11860, 1, "TtGbVmKcnX");
        setField(term11817, term11817.getClass(), "headerComments", term11860);
        setBooleanField(term11817, term11817.getClass(), "skipHeaderRecord", true);
        setBooleanField(term11817, term11817.getClass(), "ignoreHeaderCase", false);
        Character term59857 = new Character('k');
        Class<? extends Object> term60090 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term60089 = ((Class) term60090).getDeclaredField((String) "ALL");
        ((Field) term60089).setAccessible(true);
        Object enum106 = ((Field) term60089).get((Object) null);
        Character term59861 = new Character('X');
        Character term59862 = new Character('u');
        term59856 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term59867 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59868 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term59856, term59856.getClass(), "delimiter", 'h');
        setField(term59856, term59856.getClass(), "quoteCharacter", term59857);
        setField(term59856, term59856.getClass(), "quoteMode", enum106);
        setField(term59856, term59856.getClass(), "commentMarker", term59861);
        setField(term59856, term59856.getClass(), "escapeCharacter", term59862);
        setBooleanField(term59856, term59856.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term59856, term59856.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term59856, term59856.getClass(), "ignoreEmptyLines", false);
        setField(term59856, term59856.getClass(), "recordSeparator", "NJhGgctbdj");
        setField(term59856, term59856.getClass(), "nullString", "MYWYUeLGOp");
        setField(term59856, term59856.getClass(), "header", term59867);
        setElement(term59868, 0, "tsTGdgQYUL");
        setElement(term59868, 1, "TtGbVmKcnX");
        setField(term59856, term59856.getClass(), "headerComments", term59868);
        setBooleanField(term59856, term59856.getClass(), "skipHeaderRecord", true);
        setBooleanField(term59856, term59856.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term11817, args);
        assertTrue(recursiveEquals(term11817, term59856));
    }

};


