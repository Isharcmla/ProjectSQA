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

public class CSVFormat_getCommentMarker_191689993664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;
     Object term42190;
     Object term42002;

    public CSVFormat_getCommentMarker_191689993664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1791 = new Character('M');
        Class<? extends Object> term42227 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42226 = ((Class) term42227).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42226).setAccessible(true);
        Object enum62 = ((Field) term42226).get((Object) null);
        Character term1808 = new Character('u');
        Character term1810 = new Character('L');
        term1789 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1839 = (Object[]) newArray("java.lang.String", 6);
        Object[] term1912 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term1789, term1789.getClass(), "delimiter", 'b');
        setField(term1789, term1789.getClass(), "quoteCharacter", term1791);
        setField(term1789, term1789.getClass(), "quoteMode", enum62);
        setField(term1789, term1789.getClass(), "commentMarker", term1808);
        setField(term1789, term1789.getClass(), "escapeCharacter", term1810);
        setBooleanField(term1789, term1789.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1789, term1789.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term1789, term1789.getClass(), "ignoreEmptyLines", true);
        setField(term1789, term1789.getClass(), "recordSeparator", "UlajhuVLaP");
        setField(term1789, term1789.getClass(), "nullString", "gGSMzuGICf");
        setElement(term1839, 0, "hxCBltsObl");
        setElement(term1839, 1, "BndsHwAFMv");
        setElement(term1839, 2, "GzFkzHGYFt");
        setElement(term1839, 3, "tShwQLRGNe");
        setElement(term1839, 4, "LvtrsXUliU");
        setElement(term1839, 5, "xLbjWUgOIL");
        setField(term1789, term1789.getClass(), "header", term1839);
        setElement(term1912, 0, "jDtqGUpnZN");
        setElement(term1912, 1, "nGKItKLYNC");
        setElement(term1912, 2, "UiUYnPrcCi");
        setElement(term1912, 3, "UoYtihxVaS");
        setElement(term1912, 4, "JDswTTCZHV");
        setField(term1789, term1789.getClass(), "headerComments", term1912);
        setBooleanField(term1789, term1789.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1789, term1789.getClass(), "ignoreHeaderCase", true);
        Character term42191 = new Character('M');
        Class<? extends Object> term42688 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42687 = ((Class) term42688).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42687).setAccessible(true);
        Object enum63 = ((Field) term42687).get((Object) null);
        Character term42195 = new Character('u');
        Character term42196 = new Character('L');
        term42190 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42201 = (Object[]) newArray("java.lang.String", 6);
        Object[] term42214 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term42190, term42190.getClass(), "delimiter", 'b');
        setField(term42190, term42190.getClass(), "quoteCharacter", term42191);
        setField(term42190, term42190.getClass(), "quoteMode", enum63);
        setField(term42190, term42190.getClass(), "commentMarker", term42195);
        setField(term42190, term42190.getClass(), "escapeCharacter", term42196);
        setBooleanField(term42190, term42190.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term42190, term42190.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term42190, term42190.getClass(), "ignoreEmptyLines", true);
        setField(term42190, term42190.getClass(), "recordSeparator", "UlajhuVLaP");
        setField(term42190, term42190.getClass(), "nullString", "gGSMzuGICf");
        setElement(term42201, 0, "hxCBltsObl");
        setElement(term42201, 1, "BndsHwAFMv");
        setElement(term42201, 2, "GzFkzHGYFt");
        setElement(term42201, 3, "tShwQLRGNe");
        setElement(term42201, 4, "LvtrsXUliU");
        setElement(term42201, 5, "xLbjWUgOIL");
        setField(term42190, term42190.getClass(), "header", term42201);
        setElement(term42214, 0, "jDtqGUpnZN");
        setElement(term42214, 1, "nGKItKLYNC");
        setElement(term42214, 2, "UiUYnPrcCi");
        setElement(term42214, 3, "UoYtihxVaS");
        setElement(term42214, 4, "JDswTTCZHV");
        setField(term42190, term42190.getClass(), "headerComments", term42214);
        setBooleanField(term42190, term42190.getClass(), "skipHeaderRecord", true);
        setBooleanField(term42190, term42190.getClass(), "ignoreHeaderCase", true);
        term42002 = new Character('u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCommentMarker", argTypes, term1789, args);
        assertTrue(recursiveEquals(term1789, term42190));
        assertTrue(recursiveEquals(retValue, term42002));
    }

};


