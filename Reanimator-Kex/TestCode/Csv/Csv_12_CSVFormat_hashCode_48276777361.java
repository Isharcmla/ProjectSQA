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

public class CSVFormat_hashCode_48276777361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5148;
     Object term28747;

    public CSVFormat_hashCode_48276777361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5150 = new Character('p');
        Class<? extends Object> term28760 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28759 = ((Class) term28760).getDeclaredField((String) "ALL");
        ((Field) term28759).setAccessible(true);
        Object enum73 = ((Field) term28759).get((Object) null);
        Character term5159 = new Character('O');
        Character term5161 = new Character('Q');
        term5148 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5190 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term5148, term5148.getClass(), "delimiter", 'V');
        setField(term5148, term5148.getClass(), "quoteCharacter", term5150);
        setField(term5148, term5148.getClass(), "quoteMode", enum73);
        setField(term5148, term5148.getClass(), "commentMarker", term5159);
        setField(term5148, term5148.getClass(), "escapeCharacter", term5161);
        setBooleanField(term5148, term5148.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5148, term5148.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term5148, term5148.getClass(), "ignoreEmptyLines", true);
        setField(term5148, term5148.getClass(), "recordSeparator", "TimdotUuNC");
        setField(term5148, term5148.getClass(), "nullString", "PkWMRdJcBb");
        setField(term5148, term5148.getClass(), "header", term5190);
        setBooleanField(term5148, term5148.getClass(), "skipHeaderRecord", true);
        Character term28748 = new Character('p');
        Class<? extends Object> term28956 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28955 = ((Class) term28956).getDeclaredField((String) "ALL");
        ((Field) term28955).setAccessible(true);
        Object enum74 = ((Field) term28955).get((Object) null);
        Character term28752 = new Character('O');
        Character term28753 = new Character('Q');
        term28747 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28758 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term28747, term28747.getClass(), "delimiter", 'V');
        setField(term28747, term28747.getClass(), "quoteCharacter", term28748);
        setField(term28747, term28747.getClass(), "quoteMode", enum74);
        setField(term28747, term28747.getClass(), "commentMarker", term28752);
        setField(term28747, term28747.getClass(), "escapeCharacter", term28753);
        setBooleanField(term28747, term28747.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term28747, term28747.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term28747, term28747.getClass(), "ignoreEmptyLines", true);
        setField(term28747, term28747.getClass(), "recordSeparator", "TimdotUuNC");
        setField(term28747, term28747.getClass(), "nullString", "PkWMRdJcBb");
        setField(term28747, term28747.getClass(), "header", term28758);
        setBooleanField(term28747, term28747.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term5148, args);
        assertTrue(recursiveEquals(term5148, term28747));
        assertTrue(recursiveEquals(retValue, 773830087));
    }

};


