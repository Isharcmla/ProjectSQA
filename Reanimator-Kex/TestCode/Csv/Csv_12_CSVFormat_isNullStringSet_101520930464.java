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

public class CSVFormat_isNullStringSet_101520930464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6152;
     Object term30627;

    public CSVFormat_isNullStringSet_101520930464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6154 = new Character('K');
        Class<? extends Object> term30653 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term30652 = ((Class) term30653).getDeclaredField((String) "MINIMAL");
        ((Field) term30652).setAccessible(true);
        Object enum79 = ((Field) term30652).get((Object) null);
        Character term6167 = new Character('T');
        Character term6169 = new Character('N');
        term6152 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6198 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term6152, term6152.getClass(), "delimiter", 'R');
        setField(term6152, term6152.getClass(), "quoteCharacter", term6154);
        setField(term6152, term6152.getClass(), "quoteMode", enum79);
        setField(term6152, term6152.getClass(), "commentMarker", term6167);
        setField(term6152, term6152.getClass(), "escapeCharacter", term6169);
        setBooleanField(term6152, term6152.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6152, term6152.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term6152, term6152.getClass(), "ignoreEmptyLines", false);
        setField(term6152, term6152.getClass(), "recordSeparator", "vjxIhXHxGR");
        setField(term6152, term6152.getClass(), "nullString", "QXzGXbEXMu");
        setElement(term6198, 0, "qxSDVejjiY");
        setElement(term6198, 1, "xBsXSDjXYK");
        setElement(term6198, 2, "sEnIVFtZuQ");
        setElement(term6198, 3, "ZVecLZMLHF");
        setElement(term6198, 4, "fztQhjqwdP");
        setElement(term6198, 5, "eVpkWxjuki");
        setField(term6152, term6152.getClass(), "header", term6198);
        setBooleanField(term6152, term6152.getClass(), "skipHeaderRecord", false);
        Character term30628 = new Character('K');
        Class<? extends Object> term30921 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term30920 = ((Class) term30921).getDeclaredField((String) "MINIMAL");
        ((Field) term30920).setAccessible(true);
        Object enum80 = ((Field) term30920).get((Object) null);
        Character term30632 = new Character('T');
        Character term30633 = new Character('N');
        term30627 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30638 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term30627, term30627.getClass(), "delimiter", 'R');
        setField(term30627, term30627.getClass(), "quoteCharacter", term30628);
        setField(term30627, term30627.getClass(), "quoteMode", enum80);
        setField(term30627, term30627.getClass(), "commentMarker", term30632);
        setField(term30627, term30627.getClass(), "escapeCharacter", term30633);
        setBooleanField(term30627, term30627.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term30627, term30627.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term30627, term30627.getClass(), "ignoreEmptyLines", false);
        setField(term30627, term30627.getClass(), "recordSeparator", "vjxIhXHxGR");
        setField(term30627, term30627.getClass(), "nullString", "QXzGXbEXMu");
        setElement(term30638, 0, "qxSDVejjiY");
        setElement(term30638, 1, "xBsXSDjXYK");
        setElement(term30638, 2, "sEnIVFtZuQ");
        setElement(term30638, 3, "ZVecLZMLHF");
        setElement(term30638, 4, "fztQhjqwdP");
        setElement(term30638, 5, "eVpkWxjuki");
        setField(term30627, term30627.getClass(), "header", term30638);
        setBooleanField(term30627, term30627.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullStringSet", argTypes, term6152, args);
        assertTrue(recursiveEquals(term6152, term30627));
        assertTrue(recursiveEquals(retValue, true));
    }

};


