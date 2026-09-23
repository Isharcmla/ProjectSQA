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

public class CSVFormat_isCommentingEnabled_74523482058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4832;
     Object term24238;

    public CSVFormat_isCommentingEnabled_74523482058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4834 = new Character('p');
        Class<? extends Object> term24252 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term24251 = ((Class) term24252).getDeclaredField((String) "ALL");
        ((Field) term24251).setAccessible(true);
        Object enum70 = ((Field) term24251).get((Object) null);
        Character term4843 = new Character('O');
        Character term4845 = new Character('Q');
        term4832 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4873 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term4832, term4832.getClass(), "delimiter", 'V');
        setField(term4832, term4832.getClass(), "quoteChar", term4834);
        setField(term4832, term4832.getClass(), "quotePolicy", enum70);
        setField(term4832, term4832.getClass(), "commentStart", term4843);
        setField(term4832, term4832.getClass(), "escape", term4845);
        setBooleanField(term4832, term4832.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term4832, term4832.getClass(), "ignoreEmptyLines", true);
        setField(term4832, term4832.getClass(), "recordSeparator", "TimdotUuNC");
        setField(term4832, term4832.getClass(), "nullString", "PkWMRdJcBb");
        setField(term4832, term4832.getClass(), "header", term4873);
        setBooleanField(term4832, term4832.getClass(), "skipHeaderRecord", true);
        Character term24239 = new Character('p');
        Class<? extends Object> term24428 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term24427 = ((Class) term24428).getDeclaredField((String) "ALL");
        ((Field) term24427).setAccessible(true);
        Object enum71 = ((Field) term24427).get((Object) null);
        Character term24243 = new Character('O');
        Character term24244 = new Character('Q');
        term24238 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24249 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term24238, term24238.getClass(), "delimiter", 'V');
        setField(term24238, term24238.getClass(), "quoteChar", term24239);
        setField(term24238, term24238.getClass(), "quotePolicy", enum71);
        setField(term24238, term24238.getClass(), "commentStart", term24243);
        setField(term24238, term24238.getClass(), "escape", term24244);
        setBooleanField(term24238, term24238.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term24238, term24238.getClass(), "ignoreEmptyLines", true);
        setField(term24238, term24238.getClass(), "recordSeparator", "TimdotUuNC");
        setField(term24238, term24238.getClass(), "nullString", "PkWMRdJcBb");
        setField(term24238, term24238.getClass(), "header", term24249);
        setBooleanField(term24238, term24238.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCommentingEnabled", argTypes, term4832, args);
        assertTrue(recursiveEquals(term4832, term24238));
        assertTrue(recursiveEquals(retValue, true));
    }

};


