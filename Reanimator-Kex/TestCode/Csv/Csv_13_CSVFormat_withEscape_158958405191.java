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

public class CSVFormat_withEscape_158958405191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14307;
     Object term14505;
     Object term68611;
     Object term68648;
     Object term68004;

    public CSVFormat_withEscape_158958405191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term14309 = new Character('F');
        Class<? extends Object> term68650 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term68649 = ((Class) term68650).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term68649).setAccessible(true);
        Object enum119 = ((Field) term68649).get((Object) null);
        Character term14326 = new Character('p');
        Character term14328 = new Character('a');
        term14307 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term14357 = (Object[]) newArray("java.lang.String", 6);
        Object[] term14430 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term14307, term14307.getClass(), "delimiter", 'Q');
        setField(term14307, term14307.getClass(), "quoteCharacter", term14309);
        setField(term14307, term14307.getClass(), "quoteMode", enum119);
        setField(term14307, term14307.getClass(), "commentMarker", term14326);
        setField(term14307, term14307.getClass(), "escapeCharacter", term14328);
        setBooleanField(term14307, term14307.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term14307, term14307.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term14307, term14307.getClass(), "ignoreEmptyLines", true);
        setField(term14307, term14307.getClass(), "recordSeparator", "dAldIGYAXV");
        setField(term14307, term14307.getClass(), "nullString", "mLwibAPEsa");
        setElement(term14357, 0, "zsWKWiTFuo");
        setElement(term14357, 1, "UPUbwyHQKN");
        setElement(term14357, 2, "lgQkrXANyI");
        setElement(term14357, 3, "MeTmRZXErV");
        setElement(term14357, 4, "jNxbVmoZgq");
        setElement(term14357, 5, "PvmBHIXaMY");
        setField(term14307, term14307.getClass(), "header", term14357);
        setElement(term14430, 0, "hulYxtowxw");
        setElement(term14430, 1, "GNEmuHPNcU");
        setElement(term14430, 2, "IoSfuKDFRe");
        setElement(term14430, 3, "AWYyZiNfsm");
        setElement(term14430, 4, "ITRRYiuDwH");
        setElement(term14430, 5, "llRfwANcVF");
        setField(term14307, term14307.getClass(), "headerComments", term14430);
        setBooleanField(term14307, term14307.getClass(), "skipHeaderRecord", false);
        setBooleanField(term14307, term14307.getClass(), "ignoreHeaderCase", false);
        term14505 = new Character('H');
        Character term68612 = new Character('F');
        Class<? extends Object> term68990 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term68989 = ((Class) term68990).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term68989).setAccessible(true);
        Object enum120 = ((Field) term68989).get((Object) null);
        Character term68616 = new Character('p');
        Character term68617 = new Character('a');
        term68611 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term68622 = (Object[]) newArray("java.lang.String", 6);
        Object[] term68635 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term68611, term68611.getClass(), "delimiter", 'Q');
        setField(term68611, term68611.getClass(), "quoteCharacter", term68612);
        setField(term68611, term68611.getClass(), "quoteMode", enum120);
        setField(term68611, term68611.getClass(), "commentMarker", term68616);
        setField(term68611, term68611.getClass(), "escapeCharacter", term68617);
        setBooleanField(term68611, term68611.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term68611, term68611.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term68611, term68611.getClass(), "ignoreEmptyLines", true);
        setField(term68611, term68611.getClass(), "recordSeparator", "dAldIGYAXV");
        setField(term68611, term68611.getClass(), "nullString", "mLwibAPEsa");
        setElement(term68622, 0, "zsWKWiTFuo");
        setElement(term68622, 1, "UPUbwyHQKN");
        setElement(term68622, 2, "lgQkrXANyI");
        setElement(term68622, 3, "MeTmRZXErV");
        setElement(term68622, 4, "jNxbVmoZgq");
        setElement(term68622, 5, "PvmBHIXaMY");
        setField(term68611, term68611.getClass(), "header", term68622);
        setElement(term68635, 0, "hulYxtowxw");
        setElement(term68635, 1, "GNEmuHPNcU");
        setElement(term68635, 2, "IoSfuKDFRe");
        setElement(term68635, 3, "AWYyZiNfsm");
        setElement(term68635, 4, "ITRRYiuDwH");
        setElement(term68635, 5, "llRfwANcVF");
        setField(term68611, term68611.getClass(), "headerComments", term68635);
        setBooleanField(term68611, term68611.getClass(), "skipHeaderRecord", false);
        setBooleanField(term68611, term68611.getClass(), "ignoreHeaderCase", false);
        term68648 = new Character('H');
        Character term68006 = new Character('F');
        Class<? extends Object> term69330 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term69329 = ((Class) term69330).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term69329).setAccessible(true);
        Object enum121 = ((Field) term69329).get((Object) null);
        Character term68023 = new Character('p');
        Character term68025 = new Character('H');
        term68004 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term68054 = (Object[]) newArray("java.lang.String", 6);
        Object[] term68127 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term68004, term68004.getClass(), "delimiter", 'Q');
        setField(term68004, term68004.getClass(), "quoteCharacter", term68006);
        setField(term68004, term68004.getClass(), "quoteMode", enum121);
        setField(term68004, term68004.getClass(), "commentMarker", term68023);
        setField(term68004, term68004.getClass(), "escapeCharacter", term68025);
        setBooleanField(term68004, term68004.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term68004, term68004.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term68004, term68004.getClass(), "ignoreEmptyLines", true);
        setField(term68004, term68004.getClass(), "recordSeparator", "dAldIGYAXV");
        setField(term68004, term68004.getClass(), "nullString", "mLwibAPEsa");
        setElement(term68054, 0, "zsWKWiTFuo");
        setElement(term68054, 1, "UPUbwyHQKN");
        setElement(term68054, 2, "lgQkrXANyI");
        setElement(term68054, 3, "MeTmRZXErV");
        setElement(term68054, 4, "jNxbVmoZgq");
        setElement(term68054, 5, "PvmBHIXaMY");
        setField(term68004, term68004.getClass(), "header", term68054);
        setElement(term68127, 0, "hulYxtowxw");
        setElement(term68127, 1, "GNEmuHPNcU");
        setElement(term68127, 2, "IoSfuKDFRe");
        setElement(term68127, 3, "AWYyZiNfsm");
        setElement(term68127, 4, "ITRRYiuDwH");
        setElement(term68127, 5, "llRfwANcVF");
        setField(term68004, term68004.getClass(), "headerComments", term68127);
        setBooleanField(term68004, term68004.getClass(), "skipHeaderRecord", false);
        setBooleanField(term68004, term68004.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term14505;
        Object retValue = callMethod(klass, "withEscape", argTypes, term14307, args);
        assertTrue(recursiveEquals(term14307, term68611));
        assertTrue(recursiveEquals(term14505, term68648));
        assertTrue(recursiveEquals(retValue, term68004));
    }

};


