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

public class CSVFormat_validate_72528894264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6648;
     Object term27927;

    public CSVFormat_validate_72528894264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6650 = new Character('r');
        Class<? extends Object> term27958 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term27957 = ((Class) term27958).getDeclaredField((String) "NONE");
        ((Field) term27957).setAccessible(true);
        Object enum81 = ((Field) term27957).get((Object) null);
        Character term6660 = new Character('c');
        Character term6662 = new Character('R');
        term6648 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6690 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term6648, term6648.getClass(), "delimiter", 'I');
        setField(term6648, term6648.getClass(), "quoteChar", term6650);
        setField(term6648, term6648.getClass(), "quotePolicy", enum81);
        setField(term6648, term6648.getClass(), "commentStart", term6660);
        setField(term6648, term6648.getClass(), "escape", term6662);
        setBooleanField(term6648, term6648.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6648, term6648.getClass(), "ignoreEmptyLines", false);
        setField(term6648, term6648.getClass(), "recordSeparator", "pORebkoRdD");
        setField(term6648, term6648.getClass(), "nullString", "mXGCWJDOqA");
        setElement(term6690, 0, "dpNsDgfPso");
        setElement(term6690, 1, "hCWPJQKpdc");
        setElement(term6690, 2, "WzMEhMXkKx");
        setElement(term6690, 3, "XOiDvlDhdc");
        setElement(term6690, 4, "AdxvLJhNLe");
        setElement(term6690, 5, "lHfTrWKMPk");
        setElement(term6690, 6, "JDaAnsVTGV");
        setElement(term6690, 7, "mLUZFTfjle");
        setElement(term6690, 8, "xIeFjkHkOe");
        setField(term6648, term6648.getClass(), "header", term6690);
        setBooleanField(term6648, term6648.getClass(), "skipHeaderRecord", false);
        Character term27928 = new Character('r');
        Class<? extends Object> term28227 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term28226 = ((Class) term28227).getDeclaredField((String) "NONE");
        ((Field) term28226).setAccessible(true);
        Object enum82 = ((Field) term28226).get((Object) null);
        Character term27932 = new Character('c');
        Character term27933 = new Character('R');
        term27927 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27938 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term27927, term27927.getClass(), "delimiter", 'I');
        setField(term27927, term27927.getClass(), "quoteChar", term27928);
        setField(term27927, term27927.getClass(), "quotePolicy", enum82);
        setField(term27927, term27927.getClass(), "commentStart", term27932);
        setField(term27927, term27927.getClass(), "escape", term27933);
        setBooleanField(term27927, term27927.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term27927, term27927.getClass(), "ignoreEmptyLines", false);
        setField(term27927, term27927.getClass(), "recordSeparator", "pORebkoRdD");
        setField(term27927, term27927.getClass(), "nullString", "mXGCWJDOqA");
        setElement(term27938, 0, "dpNsDgfPso");
        setElement(term27938, 1, "hCWPJQKpdc");
        setElement(term27938, 2, "WzMEhMXkKx");
        setElement(term27938, 3, "XOiDvlDhdc");
        setElement(term27938, 4, "AdxvLJhNLe");
        setElement(term27938, 5, "lHfTrWKMPk");
        setElement(term27938, 6, "JDaAnsVTGV");
        setElement(term27938, 7, "mLUZFTfjle");
        setElement(term27938, 8, "xIeFjkHkOe");
        setField(term27927, term27927.getClass(), "header", term27938);
        setBooleanField(term27927, term27927.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term6648, args);
        assertTrue(recursiveEquals(term6648, term27927));
    }

};


