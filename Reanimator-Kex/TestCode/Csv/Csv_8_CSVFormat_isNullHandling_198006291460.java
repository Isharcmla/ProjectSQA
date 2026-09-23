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

public class CSVFormat_isNullHandling_198006291460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5346;
     Object term25209;

    public CSVFormat_isNullHandling_198006291460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5348 = new Character('G');
        Class<? extends Object> term25239 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term25238 = ((Class) term25239).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25238).setAccessible(true);
        Object enum74 = ((Field) term25238).get((Object) null);
        Character term5365 = new Character('Y');
        Character term5367 = new Character('S');
        term5346 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5395 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term5346, term5346.getClass(), "delimiter", 'j');
        setField(term5346, term5346.getClass(), "quoteChar", term5348);
        setField(term5346, term5346.getClass(), "quotePolicy", enum74);
        setField(term5346, term5346.getClass(), "commentStart", term5365);
        setField(term5346, term5346.getClass(), "escape", term5367);
        setBooleanField(term5346, term5346.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5346, term5346.getClass(), "ignoreEmptyLines", true);
        setField(term5346, term5346.getClass(), "recordSeparator", "JqXGgAhZPl");
        setField(term5346, term5346.getClass(), "nullString", "jiKYgYHqIS");
        setElement(term5395, 0, "DfISiziTgG");
        setElement(term5395, 1, "XqgfKFvPSD");
        setElement(term5395, 2, "JiVRgTZvKc");
        setElement(term5395, 3, "XPKmummaqg");
        setElement(term5395, 4, "BKLfkLiZTH");
        setElement(term5395, 5, "SPpkrGcPRr");
        setElement(term5395, 6, "sEccwbJKYE");
        setElement(term5395, 7, "AWRooQKkdW");
        setField(term5346, term5346.getClass(), "header", term5395);
        setBooleanField(term5346, term5346.getClass(), "skipHeaderRecord", false);
        Character term25210 = new Character('G');
        Class<? extends Object> term25519 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term25518 = ((Class) term25519).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25518).setAccessible(true);
        Object enum75 = ((Field) term25518).get((Object) null);
        Character term25214 = new Character('Y');
        Character term25215 = new Character('S');
        term25209 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25220 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term25209, term25209.getClass(), "delimiter", 'j');
        setField(term25209, term25209.getClass(), "quoteChar", term25210);
        setField(term25209, term25209.getClass(), "quotePolicy", enum75);
        setField(term25209, term25209.getClass(), "commentStart", term25214);
        setField(term25209, term25209.getClass(), "escape", term25215);
        setBooleanField(term25209, term25209.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term25209, term25209.getClass(), "ignoreEmptyLines", true);
        setField(term25209, term25209.getClass(), "recordSeparator", "JqXGgAhZPl");
        setField(term25209, term25209.getClass(), "nullString", "jiKYgYHqIS");
        setElement(term25220, 0, "DfISiziTgG");
        setElement(term25220, 1, "XqgfKFvPSD");
        setElement(term25220, 2, "JiVRgTZvKc");
        setElement(term25220, 3, "XPKmummaqg");
        setElement(term25220, 4, "BKLfkLiZTH");
        setElement(term25220, 5, "SPpkrGcPRr");
        setElement(term25220, 6, "sEccwbJKYE");
        setElement(term25220, 7, "AWRooQKkdW");
        setField(term25209, term25209.getClass(), "header", term25220);
        setBooleanField(term25209, term25209.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullHandling", argTypes, term5346, args);
        assertTrue(recursiveEquals(term5346, term25209));
        assertTrue(recursiveEquals(retValue, true));
    }

};


