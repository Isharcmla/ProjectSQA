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
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_withCommentStart_707445643373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280830;
     Object term280982;
     Object term281189;
     Object term281193;
     Object term281158;

    public CSVFormat_withCommentStart_707445643373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term281195 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term281194 = ((Class) term281195).getDeclaredField((String) "NONE");
        ((Field) term281194).setAccessible(true);
        Object enum425 = ((Field) term281194).get((Object) null);
        term280830 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term280830, term280830.getClass(), "delimiter", (char) 0);
        setField(term280830, term280830.getClass(), "quoteChar", null);
        setField(term280830, term280830.getClass(), "quotePolicy", enum425);
        setField(term280830, term280830.getClass(), "escape", null);
        setBooleanField(term280830, term280830.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term280830, term280830.getClass(), "ignoreEmptyLines", false);
        setField(term280830, term280830.getClass(), "recordSeparator", null);
        setField(term280830, term280830.getClass(), "nullString", null);
        setField(term280830, term280830.getClass(), "header", null);
        setBooleanField(term280830, term280830.getClass(), "skipHeaderRecord", false);
        term280982 = new Character((char) 0);
        Class<? extends Object> term281354 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term281353 = ((Class) term281354).getDeclaredField((String) "NONE");
        ((Field) term281353).setAccessible(true);
        Object enum426 = ((Field) term281353).get((Object) null);
        term281189 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term281189, term281189.getClass(), "delimiter", (char) 0);
        setField(term281189, term281189.getClass(), "quoteChar", null);
        setField(term281189, term281189.getClass(), "quotePolicy", enum426);
        setField(term281189, term281189.getClass(), "commentStart", null);
        setField(term281189, term281189.getClass(), "escape", null);
        setBooleanField(term281189, term281189.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term281189, term281189.getClass(), "ignoreEmptyLines", false);
        setField(term281189, term281189.getClass(), "recordSeparator", null);
        setField(term281189, term281189.getClass(), "nullString", null);
        setField(term281189, term281189.getClass(), "header", null);
        setBooleanField(term281189, term281189.getClass(), "skipHeaderRecord", false);
        term281193 = new Character((char) 0);
        Class<? extends Object> term281513 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term281512 = ((Class) term281513).getDeclaredField((String) "NONE");
        ((Field) term281512).setAccessible(true);
        Object enum427 = ((Field) term281512).get((Object) null);
        Character term281168 = new Character((char) 0);
        term281158 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term281158, term281158.getClass(), "delimiter", (char) 0);
        setField(term281158, term281158.getClass(), "quoteChar", null);
        setField(term281158, term281158.getClass(), "quotePolicy", enum427);
        setField(term281158, term281158.getClass(), "commentStart", term281168);
        setField(term281158, term281158.getClass(), "escape", null);
        setBooleanField(term281158, term281158.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term281158, term281158.getClass(), "ignoreEmptyLines", false);
        setField(term281158, term281158.getClass(), "recordSeparator", null);
        setField(term281158, term281158.getClass(), "nullString", null);
        setField(term281158, term281158.getClass(), "header", null);
        setBooleanField(term281158, term281158.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term280982;
        Object retValue = callMethod(klass, "withCommentStart", argTypes, term280830, args);
        assertTrue(recursiveEquals(term280830, term281189));
        assertTrue(recursiveEquals(term280982, term281193));
        assertTrue(recursiveEquals(retValue, term281158));
    }

};


