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

public class CSVFormat_getCommentStart_148830717846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010;
     Object term17050;
     Object term16993;

    public CSVFormat_getCommentStart_148830717846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1012 = new Character('t');
        Class<? extends Object> term17065 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term17064 = ((Class) term17065).getDeclaredField((String) "ALL");
        ((Field) term17064).setAccessible(true);
        Object enum45 = ((Field) term17064).get((Object) null);
        Character term1021 = new Character('R');
        Character term1023 = new Character('r');
        term1010 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1051 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term1010, term1010.getClass(), "delimiter", 'E');
        setField(term1010, term1010.getClass(), "quoteChar", term1012);
        setField(term1010, term1010.getClass(), "quotePolicy", enum45);
        setField(term1010, term1010.getClass(), "commentStart", term1021);
        setField(term1010, term1010.getClass(), "escape", term1023);
        setBooleanField(term1010, term1010.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1010, term1010.getClass(), "ignoreEmptyLines", false);
        setField(term1010, term1010.getClass(), "recordSeparator", "HyxfbSQYBe");
        setField(term1010, term1010.getClass(), "nullString", "pCTimMblYc");
        setElement(term1051, 0, "hNxWaHcfhY");
        setField(term1010, term1010.getClass(), "header", term1051);
        setBooleanField(term1010, term1010.getClass(), "skipHeaderRecord", true);
        Character term17051 = new Character('t');
        Class<? extends Object> term17251 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term17250 = ((Class) term17251).getDeclaredField((String) "ALL");
        ((Field) term17250).setAccessible(true);
        Object enum46 = ((Field) term17250).get((Object) null);
        Character term17055 = new Character('R');
        Character term17056 = new Character('r');
        term17050 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17061 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term17050, term17050.getClass(), "delimiter", 'E');
        setField(term17050, term17050.getClass(), "quoteChar", term17051);
        setField(term17050, term17050.getClass(), "quotePolicy", enum46);
        setField(term17050, term17050.getClass(), "commentStart", term17055);
        setField(term17050, term17050.getClass(), "escape", term17056);
        setBooleanField(term17050, term17050.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term17050, term17050.getClass(), "ignoreEmptyLines", false);
        setField(term17050, term17050.getClass(), "recordSeparator", "HyxfbSQYBe");
        setField(term17050, term17050.getClass(), "nullString", "pCTimMblYc");
        setElement(term17061, 0, "hNxWaHcfhY");
        setField(term17050, term17050.getClass(), "header", term17061);
        setBooleanField(term17050, term17050.getClass(), "skipHeaderRecord", true);
        term16993 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCommentStart", argTypes, term1010, args);
        assertTrue(recursiveEquals(term1010, term17050));
        assertTrue(recursiveEquals(retValue, term16993));
    }

};


