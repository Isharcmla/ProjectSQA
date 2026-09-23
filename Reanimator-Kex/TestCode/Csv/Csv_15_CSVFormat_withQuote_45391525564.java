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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withQuote_45391525564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27640;
     Object term27830;

    public CSVFormat_withQuote_45391525564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term27642 = new Character('A');
        Character term27645 = new Character('v');
        Character term27796 = new Character('r');
        Class<? extends Object> term27953 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term27952 = ((Class) term27953).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term27952).setAccessible(true);
        Object enum61 = ((Field) term27952).get((Object) null);
        term27640 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27647 = (Object[]) newArray("java.lang.String", 5);
        Object[] term27708 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term27640, term27640.getClass(), "allowMissingColumnNames", false);
        setField(term27640, term27640.getClass(), "commentMarker", term27642);
        setCharField(term27640, term27640.getClass(), "delimiter", 'V');
        setField(term27640, term27640.getClass(), "escapeCharacter", term27645);
        setElement(term27647, 0, "GTmoNrziyc");
        setElement(term27647, 1, "LvztehSlhM");
        setElement(term27647, 2, "njvnWFTMxN");
        setElement(term27647, 3, "fLRqcTSfzF");
        setElement(term27647, 4, "EBYHwsuWAU");
        setField(term27640, term27640.getClass(), "header", term27647);
        setElement(term27708, 0, "PtIjKpiSix");
        setElement(term27708, 1, "NZdTuwSCIM");
        setElement(term27708, 2, "dDHcmzPAmP");
        setElement(term27708, 3, "HEaTkWYBgv");
        setElement(term27708, 4, "MpJsPKLTIU");
        setElement(term27708, 5, "IiNCZfdouL");
        setField(term27640, term27640.getClass(), "headerComments", term27708);
        setBooleanField(term27640, term27640.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term27640, term27640.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term27640, term27640.getClass(), "ignoreSurroundingSpaces", false);
        setField(term27640, term27640.getClass(), "nullString", "AhOHzCsHKW");
        setField(term27640, term27640.getClass(), "quoteCharacter", term27796);
        setField(term27640, term27640.getClass(), "quoteMode", enum61);
        setField(term27640, term27640.getClass(), "recordSeparator", "UqgLPaaAHi");
        setBooleanField(term27640, term27640.getClass(), "skipHeaderRecord", true);
        setBooleanField(term27640, term27640.getClass(), "trailingDelimiter", true);
        setBooleanField(term27640, term27640.getClass(), "trim", false);
        setBooleanField(term27640, term27640.getClass(), "autoFlush", true);
        term27830 = new Character('Q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term27830;
        callMethod(klass, "withQuote", argTypes, term27640, args);
    }

};


