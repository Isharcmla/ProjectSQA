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

public class CSVFormat_withQuote_1334970014106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21122;
     Object term21325;
     Object term90096;
     Object term90135;
     Object term89465;

    public CSVFormat_withQuote_1334970014106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21124 = new Character('m');
        Class<? extends Object> term90137 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term90136 = ((Class) term90137).getDeclaredField((String) "NONE");
        ((Field) term90136).setAccessible(true);
        Object enum160 = ((Field) term90136).get((Object) null);
        Character term21134 = new Character('M');
        Character term21136 = new Character('b');
        term21122 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21165 = (Object[]) newArray("java.lang.String", 7);
        Object[] term21250 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term21122, term21122.getClass(), "delimiter", 'i');
        setField(term21122, term21122.getClass(), "quoteCharacter", term21124);
        setField(term21122, term21122.getClass(), "quoteMode", enum160);
        setField(term21122, term21122.getClass(), "commentMarker", term21134);
        setField(term21122, term21122.getClass(), "escapeCharacter", term21136);
        setBooleanField(term21122, term21122.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term21122, term21122.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term21122, term21122.getClass(), "ignoreEmptyLines", true);
        setField(term21122, term21122.getClass(), "recordSeparator", "rsumfoDNHa");
        setField(term21122, term21122.getClass(), "nullString", "ceCWHUTQUM");
        setElement(term21165, 0, "LrqwfrKKtS");
        setElement(term21165, 1, "ZUdnQXfzCI");
        setElement(term21165, 2, "EULDrUNQvw");
        setElement(term21165, 3, "BtvAvsJSei");
        setElement(term21165, 4, "vqnBkkxoIa");
        setElement(term21165, 5, "bycpZjxXFn");
        setElement(term21165, 6, "jQWttOAiwL");
        setField(term21122, term21122.getClass(), "header", term21165);
        setElement(term21250, 0, "DzKFxEuEEC");
        setElement(term21250, 1, "CAMnvfDLJL");
        setElement(term21250, 2, "mfHtgSbdjD");
        setElement(term21250, 3, "cmuaUiHMVL");
        setElement(term21250, 4, "xjoSGPWUgu");
        setElement(term21250, 5, "uzmqjnOUXu");
        setField(term21122, term21122.getClass(), "headerComments", term21250);
        setBooleanField(term21122, term21122.getClass(), "skipHeaderRecord", true);
        setBooleanField(term21122, term21122.getClass(), "ignoreHeaderCase", true);
        term21325 = new Character('l');
        Character term90097 = new Character('m');
        Class<? extends Object> term90466 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term90465 = ((Class) term90466).getDeclaredField((String) "NONE");
        ((Field) term90465).setAccessible(true);
        Object enum161 = ((Field) term90465).get((Object) null);
        Character term90101 = new Character('M');
        Character term90102 = new Character('b');
        term90096 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term90107 = (Object[]) newArray("java.lang.String", 7);
        Object[] term90122 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term90096, term90096.getClass(), "delimiter", 'i');
        setField(term90096, term90096.getClass(), "quoteCharacter", term90097);
        setField(term90096, term90096.getClass(), "quoteMode", enum161);
        setField(term90096, term90096.getClass(), "commentMarker", term90101);
        setField(term90096, term90096.getClass(), "escapeCharacter", term90102);
        setBooleanField(term90096, term90096.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term90096, term90096.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term90096, term90096.getClass(), "ignoreEmptyLines", true);
        setField(term90096, term90096.getClass(), "recordSeparator", "rsumfoDNHa");
        setField(term90096, term90096.getClass(), "nullString", "ceCWHUTQUM");
        setElement(term90107, 0, "LrqwfrKKtS");
        setElement(term90107, 1, "ZUdnQXfzCI");
        setElement(term90107, 2, "EULDrUNQvw");
        setElement(term90107, 3, "BtvAvsJSei");
        setElement(term90107, 4, "vqnBkkxoIa");
        setElement(term90107, 5, "bycpZjxXFn");
        setElement(term90107, 6, "jQWttOAiwL");
        setField(term90096, term90096.getClass(), "header", term90107);
        setElement(term90122, 0, "DzKFxEuEEC");
        setElement(term90122, 1, "CAMnvfDLJL");
        setElement(term90122, 2, "mfHtgSbdjD");
        setElement(term90122, 3, "cmuaUiHMVL");
        setElement(term90122, 4, "xjoSGPWUgu");
        setElement(term90122, 5, "uzmqjnOUXu");
        setField(term90096, term90096.getClass(), "headerComments", term90122);
        setBooleanField(term90096, term90096.getClass(), "skipHeaderRecord", true);
        setBooleanField(term90096, term90096.getClass(), "ignoreHeaderCase", true);
        term90135 = new Character('l');
        Character term89467 = new Character('l');
        Class<? extends Object> term90795 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term90794 = ((Class) term90795).getDeclaredField((String) "NONE");
        ((Field) term90794).setAccessible(true);
        Object enum162 = ((Field) term90794).get((Object) null);
        Character term89477 = new Character('M');
        Character term89479 = new Character('b');
        term89465 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term89508 = (Object[]) newArray("java.lang.String", 7);
        Object[] term89593 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term89465, term89465.getClass(), "delimiter", 'i');
        setField(term89465, term89465.getClass(), "quoteCharacter", term89467);
        setField(term89465, term89465.getClass(), "quoteMode", enum162);
        setField(term89465, term89465.getClass(), "commentMarker", term89477);
        setField(term89465, term89465.getClass(), "escapeCharacter", term89479);
        setBooleanField(term89465, term89465.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term89465, term89465.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term89465, term89465.getClass(), "ignoreEmptyLines", true);
        setField(term89465, term89465.getClass(), "recordSeparator", "rsumfoDNHa");
        setField(term89465, term89465.getClass(), "nullString", "ceCWHUTQUM");
        setElement(term89508, 0, "LrqwfrKKtS");
        setElement(term89508, 1, "ZUdnQXfzCI");
        setElement(term89508, 2, "EULDrUNQvw");
        setElement(term89508, 3, "BtvAvsJSei");
        setElement(term89508, 4, "vqnBkkxoIa");
        setElement(term89508, 5, "bycpZjxXFn");
        setElement(term89508, 6, "jQWttOAiwL");
        setField(term89465, term89465.getClass(), "header", term89508);
        setElement(term89593, 0, "DzKFxEuEEC");
        setElement(term89593, 1, "CAMnvfDLJL");
        setElement(term89593, 2, "mfHtgSbdjD");
        setElement(term89593, 3, "cmuaUiHMVL");
        setElement(term89593, 4, "xjoSGPWUgu");
        setElement(term89593, 5, "uzmqjnOUXu");
        setField(term89465, term89465.getClass(), "headerComments", term89593);
        setBooleanField(term89465, term89465.getClass(), "skipHeaderRecord", true);
        setBooleanField(term89465, term89465.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term21325;
        Object retValue = callMethod(klass, "withQuote", argTypes, term21122, args);
        assertTrue(recursiveEquals(term21122, term90096));
        assertTrue(recursiveEquals(term21325, term90135));
        assertTrue(recursiveEquals(retValue, term89465));
    }

};


