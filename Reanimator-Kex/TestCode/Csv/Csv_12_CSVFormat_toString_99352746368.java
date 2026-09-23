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

public class CSVFormat_toString_99352746368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7532;
     Object term33152;

    public CSVFormat_toString_99352746368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7534 = new Character('F');
        Class<? extends Object> term33171 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33170 = ((Class) term33171).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term33170).setAccessible(true);
        Object enum85 = ((Field) term33170).get((Object) null);
        Character term7551 = new Character('I');
        Character term7553 = new Character('s');
        term7532 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7582 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term7532, term7532.getClass(), "delimiter", 'M');
        setField(term7532, term7532.getClass(), "quoteCharacter", term7534);
        setField(term7532, term7532.getClass(), "quoteMode", enum85);
        setField(term7532, term7532.getClass(), "commentMarker", term7551);
        setField(term7532, term7532.getClass(), "escapeCharacter", term7553);
        setBooleanField(term7532, term7532.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term7532, term7532.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term7532, term7532.getClass(), "ignoreEmptyLines", true);
        setField(term7532, term7532.getClass(), "recordSeparator", "SdCKLMIYnX");
        setField(term7532, term7532.getClass(), "nullString", "OJJtVNPyKZ");
        setElement(term7582, 0, "AKNapTAfmD");
        setElement(term7582, 1, "xJgPlLxpgC");
        setElement(term7582, 2, "EYtfuJaxiM");
        setField(term7532, term7532.getClass(), "header", term7582);
        setBooleanField(term7532, term7532.getClass(), "skipHeaderRecord", true);
        Character term33153 = new Character('F');
        Class<? extends Object> term33421 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33420 = ((Class) term33421).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term33420).setAccessible(true);
        Object enum86 = ((Field) term33420).get((Object) null);
        Character term33157 = new Character('I');
        Character term33158 = new Character('s');
        term33152 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33163 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term33152, term33152.getClass(), "delimiter", 'M');
        setField(term33152, term33152.getClass(), "quoteCharacter", term33153);
        setField(term33152, term33152.getClass(), "quoteMode", enum86);
        setField(term33152, term33152.getClass(), "commentMarker", term33157);
        setField(term33152, term33152.getClass(), "escapeCharacter", term33158);
        setBooleanField(term33152, term33152.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term33152, term33152.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term33152, term33152.getClass(), "ignoreEmptyLines", true);
        setField(term33152, term33152.getClass(), "recordSeparator", "SdCKLMIYnX");
        setField(term33152, term33152.getClass(), "nullString", "OJJtVNPyKZ");
        setElement(term33163, 0, "AKNapTAfmD");
        setElement(term33163, 1, "xJgPlLxpgC");
        setElement(term33163, 2, "EYtfuJaxiM");
        setField(term33152, term33152.getClass(), "header", term33163);
        setBooleanField(term33152, term33152.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term7532, args);
        assertTrue(recursiveEquals(term7532, term33152));
        assertTrue(recursiveEquals(retValue, "Delimiter=<M> Escape=<s> QuoteChar=<F> CommentStart=<I> NullString=<OJJtVNPyKZ> RecordSeparator=<SdCKLMIYnX> EmptyLines:ignored SkipHeaderRecord:true Header:[AKNapTAfmD, xJgPlLxpgC, EYtfuJaxiM]"));
    }

};


