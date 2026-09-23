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

public class CSVFormat_validate_72528894269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7870;
     Object term33979;

    public CSVFormat_validate_72528894269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7872 = new Character('G');
        Class<? extends Object> term34002 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term34001 = ((Class) term34002).getDeclaredField((String) "NONE");
        ((Field) term34001).setAccessible(true);
        Object enum87 = ((Field) term34001).get((Object) null);
        Character term7882 = new Character('g');
        Character term7884 = new Character('n');
        term7870 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7913 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term7870, term7870.getClass(), "delimiter", 'Y');
        setField(term7870, term7870.getClass(), "quoteCharacter", term7872);
        setField(term7870, term7870.getClass(), "quoteMode", enum87);
        setField(term7870, term7870.getClass(), "commentMarker", term7882);
        setField(term7870, term7870.getClass(), "escapeCharacter", term7884);
        setBooleanField(term7870, term7870.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term7870, term7870.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term7870, term7870.getClass(), "ignoreEmptyLines", false);
        setField(term7870, term7870.getClass(), "recordSeparator", "gCWtLVKVVe");
        setField(term7870, term7870.getClass(), "nullString", "fWKJoSoCwE");
        setElement(term7913, 0, "wfaXBpWAUH");
        setElement(term7913, 1, "VMeAzAHwZj");
        setElement(term7913, 2, "PznxWXsZME");
        setElement(term7913, 3, "ZzIujlwVsw");
        setElement(term7913, 4, "LWyEaeIyAo");
        setField(term7870, term7870.getClass(), "header", term7913);
        setBooleanField(term7870, term7870.getClass(), "skipHeaderRecord", false);
        Character term33980 = new Character('G');
        Class<? extends Object> term34251 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term34250 = ((Class) term34251).getDeclaredField((String) "NONE");
        ((Field) term34250).setAccessible(true);
        Object enum88 = ((Field) term34250).get((Object) null);
        Character term33984 = new Character('g');
        Character term33985 = new Character('n');
        term33979 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33990 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term33979, term33979.getClass(), "delimiter", 'Y');
        setField(term33979, term33979.getClass(), "quoteCharacter", term33980);
        setField(term33979, term33979.getClass(), "quoteMode", enum88);
        setField(term33979, term33979.getClass(), "commentMarker", term33984);
        setField(term33979, term33979.getClass(), "escapeCharacter", term33985);
        setBooleanField(term33979, term33979.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term33979, term33979.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term33979, term33979.getClass(), "ignoreEmptyLines", false);
        setField(term33979, term33979.getClass(), "recordSeparator", "gCWtLVKVVe");
        setField(term33979, term33979.getClass(), "nullString", "fWKJoSoCwE");
        setElement(term33990, 0, "wfaXBpWAUH");
        setElement(term33990, 1, "VMeAzAHwZj");
        setElement(term33990, 2, "PznxWXsZME");
        setElement(term33990, 3, "ZzIujlwVsw");
        setElement(term33990, 4, "LWyEaeIyAo");
        setField(term33979, term33979.getClass(), "header", term33990);
        setBooleanField(term33979, term33979.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term7870, args);
        assertTrue(recursiveEquals(term7870, term33979));
    }

};


