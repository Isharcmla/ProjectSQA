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

public class CSVFormat_withIgnoreSurroundingSpaces_2091066216100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18234;
     Object term80210;
     Object term80015;

    public CSVFormat_withIgnoreSurroundingSpaces_2091066216100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term18236 = new Character('s');
        Class<? extends Object> term80250 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80249 = ((Class) term80250).getDeclaredField((String) "MINIMAL");
        ((Field) term80249).setAccessible(true);
        Object enum142 = ((Field) term80249).get((Object) null);
        Character term18249 = new Character('t');
        Character term18251 = new Character('b');
        term18234 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18280 = (Object[]) newArray("java.lang.String", 6);
        Object[] term18353 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term18234, term18234.getClass(), "delimiter", 'T');
        setField(term18234, term18234.getClass(), "quoteCharacter", term18236);
        setField(term18234, term18234.getClass(), "quoteMode", enum142);
        setField(term18234, term18234.getClass(), "commentMarker", term18249);
        setField(term18234, term18234.getClass(), "escapeCharacter", term18251);
        setBooleanField(term18234, term18234.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term18234, term18234.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term18234, term18234.getClass(), "ignoreEmptyLines", true);
        setField(term18234, term18234.getClass(), "recordSeparator", "nxSTJflLQy");
        setField(term18234, term18234.getClass(), "nullString", "FlHzxEfFzI");
        setElement(term18280, 0, "aSATgQUpoe");
        setElement(term18280, 1, "VkPSXewZfB");
        setElement(term18280, 2, "ubodzJoMGW");
        setElement(term18280, 3, "weddIktxOA");
        setElement(term18280, 4, "uSlMeISsDD");
        setElement(term18280, 5, "WdCiTDUKqn");
        setField(term18234, term18234.getClass(), "header", term18280);
        setElement(term18353, 0, "PSizQDoxxe");
        setElement(term18353, 1, "mKaHyMybrK");
        setElement(term18353, 2, "AyrEXuGrEj");
        setElement(term18353, 3, "yevIIoVYHq");
        setElement(term18353, 4, "UuYWMTqWTV");
        setElement(term18353, 5, "DSFGlcaXUb");
        setElement(term18353, 6, "sHMXNUzNeM");
        setField(term18234, term18234.getClass(), "headerComments", term18353);
        setBooleanField(term18234, term18234.getClass(), "skipHeaderRecord", true);
        setBooleanField(term18234, term18234.getClass(), "ignoreHeaderCase", true);
        Character term80211 = new Character('s');
        Class<? extends Object> term80588 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80587 = ((Class) term80588).getDeclaredField((String) "MINIMAL");
        ((Field) term80587).setAccessible(true);
        Object enum143 = ((Field) term80587).get((Object) null);
        Character term80215 = new Character('t');
        Character term80216 = new Character('b');
        term80210 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term80221 = (Object[]) newArray("java.lang.String", 6);
        Object[] term80234 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term80210, term80210.getClass(), "delimiter", 'T');
        setField(term80210, term80210.getClass(), "quoteCharacter", term80211);
        setField(term80210, term80210.getClass(), "quoteMode", enum143);
        setField(term80210, term80210.getClass(), "commentMarker", term80215);
        setField(term80210, term80210.getClass(), "escapeCharacter", term80216);
        setBooleanField(term80210, term80210.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term80210, term80210.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term80210, term80210.getClass(), "ignoreEmptyLines", true);
        setField(term80210, term80210.getClass(), "recordSeparator", "nxSTJflLQy");
        setField(term80210, term80210.getClass(), "nullString", "FlHzxEfFzI");
        setElement(term80221, 0, "aSATgQUpoe");
        setElement(term80221, 1, "VkPSXewZfB");
        setElement(term80221, 2, "ubodzJoMGW");
        setElement(term80221, 3, "weddIktxOA");
        setElement(term80221, 4, "uSlMeISsDD");
        setElement(term80221, 5, "WdCiTDUKqn");
        setField(term80210, term80210.getClass(), "header", term80221);
        setElement(term80234, 0, "PSizQDoxxe");
        setElement(term80234, 1, "mKaHyMybrK");
        setElement(term80234, 2, "AyrEXuGrEj");
        setElement(term80234, 3, "yevIIoVYHq");
        setElement(term80234, 4, "UuYWMTqWTV");
        setElement(term80234, 5, "DSFGlcaXUb");
        setElement(term80234, 6, "sHMXNUzNeM");
        setField(term80210, term80210.getClass(), "headerComments", term80234);
        setBooleanField(term80210, term80210.getClass(), "skipHeaderRecord", true);
        setBooleanField(term80210, term80210.getClass(), "ignoreHeaderCase", true);
        Character term80017 = new Character('s');
        Class<? extends Object> term80926 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80925 = ((Class) term80926).getDeclaredField((String) "MINIMAL");
        ((Field) term80925).setAccessible(true);
        Object enum144 = ((Field) term80925).get((Object) null);
        Character term80019 = new Character('t');
        Character term80021 = new Character('b');
        term80015 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term80050 = (Object[]) newArray("java.lang.String", 6);
        Object[] term80123 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term80015, term80015.getClass(), "delimiter", 'T');
        setField(term80015, term80015.getClass(), "quoteCharacter", term80017);
        setField(term80015, term80015.getClass(), "quoteMode", enum144);
        setField(term80015, term80015.getClass(), "commentMarker", term80019);
        setField(term80015, term80015.getClass(), "escapeCharacter", term80021);
        setBooleanField(term80015, term80015.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term80015, term80015.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term80015, term80015.getClass(), "ignoreEmptyLines", true);
        setField(term80015, term80015.getClass(), "recordSeparator", "nxSTJflLQy");
        setField(term80015, term80015.getClass(), "nullString", "FlHzxEfFzI");
        setElement(term80050, 0, "aSATgQUpoe");
        setElement(term80050, 1, "VkPSXewZfB");
        setElement(term80050, 2, "ubodzJoMGW");
        setElement(term80050, 3, "weddIktxOA");
        setElement(term80050, 4, "uSlMeISsDD");
        setElement(term80050, 5, "WdCiTDUKqn");
        setField(term80015, term80015.getClass(), "header", term80050);
        setElement(term80123, 0, "PSizQDoxxe");
        setElement(term80123, 1, "mKaHyMybrK");
        setElement(term80123, 2, "AyrEXuGrEj");
        setElement(term80123, 3, "yevIIoVYHq");
        setElement(term80123, 4, "UuYWMTqWTV");
        setElement(term80123, 5, "DSFGlcaXUb");
        setElement(term80123, 6, "sHMXNUzNeM");
        setField(term80015, term80015.getClass(), "headerComments", term80123);
        setBooleanField(term80015, term80015.getClass(), "skipHeaderRecord", true);
        setBooleanField(term80015, term80015.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term18234, args);
        assertTrue(recursiveEquals(term18234, term80210));
        assertTrue(recursiveEquals(retValue, term80015));
    }

};


