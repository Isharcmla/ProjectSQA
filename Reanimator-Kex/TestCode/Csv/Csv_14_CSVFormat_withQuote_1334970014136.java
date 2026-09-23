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

public class CSVFormat_withQuote_1334970014136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26729;
     Object term26973;
     Object term102853;
     Object term102898;
     Object term102100;

    public CSVFormat_withQuote_1334970014136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term26731 = new Character('q');
        Character term26734 = new Character('K');
        Character term26945 = new Character('A');
        Class<? extends Object> term103070 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term103069 = ((Class) term103070).getDeclaredField((String) "MINIMAL");
        ((Field) term103069).setAccessible(true);
        Object enum208 = ((Field) term103069).get((Object) null);
        term26729 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26736 = (Object[]) newArray("java.lang.String", 8);
        Object[] term26833 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term26729, term26729.getClass(), "allowMissingColumnNames", false);
        setField(term26729, term26729.getClass(), "commentMarker", term26731);
        setCharField(term26729, term26729.getClass(), "delimiter", 'C');
        setField(term26729, term26729.getClass(), "escapeCharacter", term26734);
        setElement(term26736, 0, "iVOvTzOxwt");
        setElement(term26736, 1, "BjZQdecXvB");
        setElement(term26736, 2, "iUkOOQhEkw");
        setElement(term26736, 3, "wmVoFoUVmU");
        setElement(term26736, 4, "lLiSiPCciB");
        setElement(term26736, 5, "PsMKIIEwdR");
        setElement(term26736, 6, "RbQmXqfXAT");
        setElement(term26736, 7, "fcCAsvfBbe");
        setField(term26729, term26729.getClass(), "header", term26736);
        setElement(term26833, 0, "mUNcKUxghj");
        setElement(term26833, 1, "lnvLKbtveE");
        setElement(term26833, 2, "FfrrEhTHzQ");
        setElement(term26833, 3, "LXnDNrMsqT");
        setElement(term26833, 4, "ZLQamJFBmu");
        setElement(term26833, 5, "ZWcOCwKNvd");
        setElement(term26833, 6, "GTmoNrziyc");
        setElement(term26833, 7, "LvztehSlhM");
        setField(term26729, term26729.getClass(), "headerComments", term26833);
        setBooleanField(term26729, term26729.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term26729, term26729.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term26729, term26729.getClass(), "ignoreSurroundingSpaces", false);
        setField(term26729, term26729.getClass(), "nullString", "njvnWFTMxN");
        setField(term26729, term26729.getClass(), "quoteCharacter", term26945);
        setField(term26729, term26729.getClass(), "quoteMode", enum208);
        setField(term26729, term26729.getClass(), "recordSeparator", "fLRqcTSfzF");
        setBooleanField(term26729, term26729.getClass(), "skipHeaderRecord", true);
        setBooleanField(term26729, term26729.getClass(), "trailingDelimiter", false);
        setBooleanField(term26729, term26729.getClass(), "trim", false);
        term26973 = new Character('V');
        Character term102854 = new Character('q');
        Character term102855 = new Character('K');
        Character term102892 = new Character('A');
        Class<? extends Object> term103438 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term103437 = ((Class) term103438).getDeclaredField((String) "MINIMAL");
        ((Field) term103437).setAccessible(true);
        Object enum209 = ((Field) term103437).get((Object) null);
        term102853 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term102856 = (Object[]) newArray("java.lang.String", 8);
        Object[] term102873 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term102853, term102853.getClass(), "allowMissingColumnNames", false);
        setField(term102853, term102853.getClass(), "commentMarker", term102854);
        setCharField(term102853, term102853.getClass(), "delimiter", 'C');
        setField(term102853, term102853.getClass(), "escapeCharacter", term102855);
        setElement(term102856, 0, "iVOvTzOxwt");
        setElement(term102856, 1, "BjZQdecXvB");
        setElement(term102856, 2, "iUkOOQhEkw");
        setElement(term102856, 3, "wmVoFoUVmU");
        setElement(term102856, 4, "lLiSiPCciB");
        setElement(term102856, 5, "PsMKIIEwdR");
        setElement(term102856, 6, "RbQmXqfXAT");
        setElement(term102856, 7, "fcCAsvfBbe");
        setField(term102853, term102853.getClass(), "header", term102856);
        setElement(term102873, 0, "mUNcKUxghj");
        setElement(term102873, 1, "lnvLKbtveE");
        setElement(term102873, 2, "FfrrEhTHzQ");
        setElement(term102873, 3, "LXnDNrMsqT");
        setElement(term102873, 4, "ZLQamJFBmu");
        setElement(term102873, 5, "ZWcOCwKNvd");
        setElement(term102873, 6, "GTmoNrziyc");
        setElement(term102873, 7, "LvztehSlhM");
        setField(term102853, term102853.getClass(), "headerComments", term102873);
        setBooleanField(term102853, term102853.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term102853, term102853.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term102853, term102853.getClass(), "ignoreSurroundingSpaces", false);
        setField(term102853, term102853.getClass(), "nullString", "njvnWFTMxN");
        setField(term102853, term102853.getClass(), "quoteCharacter", term102892);
        setField(term102853, term102853.getClass(), "quoteMode", enum209);
        setField(term102853, term102853.getClass(), "recordSeparator", "fLRqcTSfzF");
        setBooleanField(term102853, term102853.getClass(), "skipHeaderRecord", true);
        setBooleanField(term102853, term102853.getClass(), "trailingDelimiter", false);
        setBooleanField(term102853, term102853.getClass(), "trim", false);
        term102898 = new Character('V');
        Character term102102 = new Character('q');
        Character term102105 = new Character('K');
        Character term102316 = new Character('V');
        Class<? extends Object> term103806 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term103805 = ((Class) term103806).getDeclaredField((String) "MINIMAL");
        ((Field) term103805).setAccessible(true);
        Object enum210 = ((Field) term103805).get((Object) null);
        term102100 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term102107 = (Object[]) newArray("java.lang.String", 8);
        Object[] term102204 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term102100, term102100.getClass(), "allowMissingColumnNames", false);
        setField(term102100, term102100.getClass(), "commentMarker", term102102);
        setCharField(term102100, term102100.getClass(), "delimiter", 'C');
        setField(term102100, term102100.getClass(), "escapeCharacter", term102105);
        setElement(term102107, 0, "iVOvTzOxwt");
        setElement(term102107, 1, "BjZQdecXvB");
        setElement(term102107, 2, "iUkOOQhEkw");
        setElement(term102107, 3, "wmVoFoUVmU");
        setElement(term102107, 4, "lLiSiPCciB");
        setElement(term102107, 5, "PsMKIIEwdR");
        setElement(term102107, 6, "RbQmXqfXAT");
        setElement(term102107, 7, "fcCAsvfBbe");
        setField(term102100, term102100.getClass(), "header", term102107);
        setElement(term102204, 0, "mUNcKUxghj");
        setElement(term102204, 1, "lnvLKbtveE");
        setElement(term102204, 2, "FfrrEhTHzQ");
        setElement(term102204, 3, "LXnDNrMsqT");
        setElement(term102204, 4, "ZLQamJFBmu");
        setElement(term102204, 5, "ZWcOCwKNvd");
        setElement(term102204, 6, "GTmoNrziyc");
        setElement(term102204, 7, "LvztehSlhM");
        setField(term102100, term102100.getClass(), "headerComments", term102204);
        setBooleanField(term102100, term102100.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term102100, term102100.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term102100, term102100.getClass(), "ignoreSurroundingSpaces", false);
        setField(term102100, term102100.getClass(), "nullString", "njvnWFTMxN");
        setField(term102100, term102100.getClass(), "quoteCharacter", term102316);
        setField(term102100, term102100.getClass(), "quoteMode", enum210);
        setField(term102100, term102100.getClass(), "recordSeparator", "fLRqcTSfzF");
        setBooleanField(term102100, term102100.getClass(), "skipHeaderRecord", true);
        setBooleanField(term102100, term102100.getClass(), "trailingDelimiter", false);
        setBooleanField(term102100, term102100.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term26973;
        Object retValue = callMethod(klass, "withQuote", argTypes, term26729, args);
        assertTrue(recursiveEquals(term26729, term102853));
        assertTrue(recursiveEquals(term26973, term102898));
        assertTrue(recursiveEquals(retValue, term102100));
    }

};


