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
import java.lang.Boolean;

public class CSVFormat_withIgnoreEmptyLines_47944145199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17770;
     Object term17936;
     Object term78345;
     Object term77824;

    public CSVFormat_withIgnoreEmptyLines_47944145199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17772 = new Character('b');
        Class<? extends Object> term78379 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term78378 = ((Class) term78379).getDeclaredField((String) "ALL");
        ((Field) term78378).setAccessible(true);
        Object enum139 = ((Field) term78378).get((Object) null);
        Character term17781 = new Character('n');
        Character term17783 = new Character('z');
        term17770 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17812 = (Object[]) newArray("java.lang.String", 6);
        Object[] term17885 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term17770, term17770.getClass(), "delimiter", 'I');
        setField(term17770, term17770.getClass(), "quoteCharacter", term17772);
        setField(term17770, term17770.getClass(), "quoteMode", enum139);
        setField(term17770, term17770.getClass(), "commentMarker", term17781);
        setField(term17770, term17770.getClass(), "escapeCharacter", term17783);
        setBooleanField(term17770, term17770.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term17770, term17770.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term17770, term17770.getClass(), "ignoreEmptyLines", false);
        setField(term17770, term17770.getClass(), "recordSeparator", "IpmgwHTgnG");
        setField(term17770, term17770.getClass(), "nullString", "tIpkeYIezR");
        setElement(term17812, 0, "YkZtEtthvz");
        setElement(term17812, 1, "dwlZSxlXOo");
        setElement(term17812, 2, "lKrEAkypza");
        setElement(term17812, 3, "KtuuNAqGCQ");
        setElement(term17812, 4, "OGQsfjmReM");
        setElement(term17812, 5, "YsUtbngnRO");
        setField(term17770, term17770.getClass(), "header", term17812);
        setElement(term17885, 0, "JisaWUxcNb");
        setElement(term17885, 1, "NxgmYPzWCI");
        setElement(term17885, 2, "SqjyKmayBx");
        setElement(term17885, 3, "XjDhvToxJy");
        setField(term17770, term17770.getClass(), "headerComments", term17885);
        setBooleanField(term17770, term17770.getClass(), "skipHeaderRecord", true);
        setBooleanField(term17770, term17770.getClass(), "ignoreHeaderCase", true);
        term17936 = new Boolean(false);
        Character term78346 = new Character('b');
        Class<? extends Object> term78675 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term78674 = ((Class) term78675).getDeclaredField((String) "ALL");
        ((Field) term78674).setAccessible(true);
        Object enum140 = ((Field) term78674).get((Object) null);
        Character term78350 = new Character('n');
        Character term78351 = new Character('z');
        term78345 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term78356 = (Object[]) newArray("java.lang.String", 6);
        Object[] term78369 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term78345, term78345.getClass(), "delimiter", 'I');
        setField(term78345, term78345.getClass(), "quoteCharacter", term78346);
        setField(term78345, term78345.getClass(), "quoteMode", enum140);
        setField(term78345, term78345.getClass(), "commentMarker", term78350);
        setField(term78345, term78345.getClass(), "escapeCharacter", term78351);
        setBooleanField(term78345, term78345.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term78345, term78345.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term78345, term78345.getClass(), "ignoreEmptyLines", false);
        setField(term78345, term78345.getClass(), "recordSeparator", "IpmgwHTgnG");
        setField(term78345, term78345.getClass(), "nullString", "tIpkeYIezR");
        setElement(term78356, 0, "YkZtEtthvz");
        setElement(term78356, 1, "dwlZSxlXOo");
        setElement(term78356, 2, "lKrEAkypza");
        setElement(term78356, 3, "KtuuNAqGCQ");
        setElement(term78356, 4, "OGQsfjmReM");
        setElement(term78356, 5, "YsUtbngnRO");
        setField(term78345, term78345.getClass(), "header", term78356);
        setElement(term78369, 0, "JisaWUxcNb");
        setElement(term78369, 1, "NxgmYPzWCI");
        setElement(term78369, 2, "SqjyKmayBx");
        setElement(term78369, 3, "XjDhvToxJy");
        setField(term78345, term78345.getClass(), "headerComments", term78369);
        setBooleanField(term78345, term78345.getClass(), "skipHeaderRecord", true);
        setBooleanField(term78345, term78345.getClass(), "ignoreHeaderCase", true);
        Character term77826 = new Character('b');
        Class<? extends Object> term78971 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term78970 = ((Class) term78971).getDeclaredField((String) "ALL");
        ((Field) term78970).setAccessible(true);
        Object enum141 = ((Field) term78970).get((Object) null);
        Character term77835 = new Character('n');
        Character term77837 = new Character('z');
        term77824 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term77866 = (Object[]) newArray("java.lang.String", 6);
        Object[] term77939 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term77824, term77824.getClass(), "delimiter", 'I');
        setField(term77824, term77824.getClass(), "quoteCharacter", term77826);
        setField(term77824, term77824.getClass(), "quoteMode", enum141);
        setField(term77824, term77824.getClass(), "commentMarker", term77835);
        setField(term77824, term77824.getClass(), "escapeCharacter", term77837);
        setBooleanField(term77824, term77824.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term77824, term77824.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term77824, term77824.getClass(), "ignoreEmptyLines", false);
        setField(term77824, term77824.getClass(), "recordSeparator", "IpmgwHTgnG");
        setField(term77824, term77824.getClass(), "nullString", "tIpkeYIezR");
        setElement(term77866, 0, "YkZtEtthvz");
        setElement(term77866, 1, "dwlZSxlXOo");
        setElement(term77866, 2, "lKrEAkypza");
        setElement(term77866, 3, "KtuuNAqGCQ");
        setElement(term77866, 4, "OGQsfjmReM");
        setElement(term77866, 5, "YsUtbngnRO");
        setField(term77824, term77824.getClass(), "header", term77866);
        setElement(term77939, 0, "JisaWUxcNb");
        setElement(term77939, 1, "NxgmYPzWCI");
        setElement(term77939, 2, "SqjyKmayBx");
        setElement(term77939, 3, "XjDhvToxJy");
        setField(term77824, term77824.getClass(), "headerComments", term77939);
        setBooleanField(term77824, term77824.getClass(), "skipHeaderRecord", true);
        setBooleanField(term77824, term77824.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17936;
        Object retValue = callMethod(klass, "withIgnoreEmptyLines", argTypes, term17770, args);
        assertTrue(recursiveEquals(term17770, term78345));
        assertTrue(recursiveEquals(term17936, false));
        assertTrue(recursiveEquals(retValue, term77824));
    }

};


