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

public class CSVFormat_isNullStringSet_101520930481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9337;
     Object term55032;

    public CSVFormat_isNullStringSet_101520930481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9339 = new Character('r');
        Class<? extends Object> term55069 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55068 = ((Class) term55069).getDeclaredField((String) "NONE");
        ((Field) term55068).setAccessible(true);
        Object enum95 = ((Field) term55068).get((Object) null);
        Character term9349 = new Character('c');
        Character term9351 = new Character('R');
        term9337 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9380 = (Object[]) newArray("java.lang.String", 8);
        Object[] term9477 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term9337, term9337.getClass(), "delimiter", 'I');
        setField(term9337, term9337.getClass(), "quoteCharacter", term9339);
        setField(term9337, term9337.getClass(), "quoteMode", enum95);
        setField(term9337, term9337.getClass(), "commentMarker", term9349);
        setField(term9337, term9337.getClass(), "escapeCharacter", term9351);
        setBooleanField(term9337, term9337.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9337, term9337.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term9337, term9337.getClass(), "ignoreEmptyLines", false);
        setField(term9337, term9337.getClass(), "recordSeparator", "CFyoseFGLF");
        setField(term9337, term9337.getClass(), "nullString", "SFqCrhEWLm");
        setElement(term9380, 0, "GZdcJyZntS");
        setElement(term9380, 1, "OIHoJeysUi");
        setElement(term9380, 2, "WXMWFDGcLB");
        setElement(term9380, 3, "wKWbJssZuG");
        setElement(term9380, 4, "NzBMMhkhpT");
        setElement(term9380, 5, "qCpEbQDHdF");
        setElement(term9380, 6, "AHbZyFOmlo");
        setElement(term9380, 7, "TwfWVQGiIj");
        setField(term9337, term9337.getClass(), "header", term9380);
        setElement(term9477, 0, "gUvcueTURF");
        setElement(term9477, 1, "EwQBhZjCIT");
        setElement(term9477, 2, "aSkmSwTnEw");
        setField(term9337, term9337.getClass(), "headerComments", term9477);
        setBooleanField(term9337, term9337.getClass(), "skipHeaderRecord", true);
        setBooleanField(term9337, term9337.getClass(), "ignoreHeaderCase", true);
        Character term55033 = new Character('r');
        Class<? extends Object> term55598 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55597 = ((Class) term55598).getDeclaredField((String) "NONE");
        ((Field) term55597).setAccessible(true);
        Object enum96 = ((Field) term55597).get((Object) null);
        Character term55037 = new Character('c');
        Character term55038 = new Character('R');
        term55032 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55043 = (Object[]) newArray("java.lang.String", 8);
        Object[] term55060 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term55032, term55032.getClass(), "delimiter", 'I');
        setField(term55032, term55032.getClass(), "quoteCharacter", term55033);
        setField(term55032, term55032.getClass(), "quoteMode", enum96);
        setField(term55032, term55032.getClass(), "commentMarker", term55037);
        setField(term55032, term55032.getClass(), "escapeCharacter", term55038);
        setBooleanField(term55032, term55032.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term55032, term55032.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term55032, term55032.getClass(), "ignoreEmptyLines", false);
        setField(term55032, term55032.getClass(), "recordSeparator", "CFyoseFGLF");
        setField(term55032, term55032.getClass(), "nullString", "SFqCrhEWLm");
        setElement(term55043, 0, "GZdcJyZntS");
        setElement(term55043, 1, "OIHoJeysUi");
        setElement(term55043, 2, "WXMWFDGcLB");
        setElement(term55043, 3, "wKWbJssZuG");
        setElement(term55043, 4, "NzBMMhkhpT");
        setElement(term55043, 5, "qCpEbQDHdF");
        setElement(term55043, 6, "AHbZyFOmlo");
        setElement(term55043, 7, "TwfWVQGiIj");
        setField(term55032, term55032.getClass(), "header", term55043);
        setElement(term55060, 0, "gUvcueTURF");
        setElement(term55060, 1, "EwQBhZjCIT");
        setElement(term55060, 2, "aSkmSwTnEw");
        setField(term55032, term55032.getClass(), "headerComments", term55060);
        setBooleanField(term55032, term55032.getClass(), "skipHeaderRecord", true);
        setBooleanField(term55032, term55032.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullStringSet", argTypes, term9337, args);
        assertTrue(recursiveEquals(term9337, term55032));
        assertTrue(recursiveEquals(retValue, true));
    }

};


