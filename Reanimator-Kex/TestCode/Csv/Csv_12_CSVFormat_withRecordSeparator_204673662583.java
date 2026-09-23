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

public class CSVFormat_withRecordSeparator_204673662583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12986;
     Object term13146;
     Object term47984;
     Object term47847;

    public CSVFormat_withRecordSeparator_204673662583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12988 = new Character('F');
        Class<? extends Object> term48015 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48014 = ((Class) term48015).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term48014).setAccessible(true);
        Object enum124 = ((Field) term48014).get((Object) null);
        Character term13005 = new Character('Z');
        Character term13007 = new Character('i');
        term12986 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13036 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term12986, term12986.getClass(), "delimiter", 't');
        setField(term12986, term12986.getClass(), "quoteCharacter", term12988);
        setField(term12986, term12986.getClass(), "quoteMode", enum124);
        setField(term12986, term12986.getClass(), "commentMarker", term13005);
        setField(term12986, term12986.getClass(), "escapeCharacter", term13007);
        setBooleanField(term12986, term12986.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term12986, term12986.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term12986, term12986.getClass(), "ignoreEmptyLines", true);
        setField(term12986, term12986.getClass(), "recordSeparator", "NzBMMhkhpT");
        setField(term12986, term12986.getClass(), "nullString", "qCpEbQDHdF");
        setElement(term13036, 0, "AHbZyFOmlo");
        setElement(term13036, 1, "TwfWVQGiIj");
        setElement(term13036, 2, "gUvcueTURF");
        setElement(term13036, 3, "EwQBhZjCIT");
        setElement(term13036, 4, "aSkmSwTnEw");
        setElement(term13036, 5, "xvkbvaEGYd");
        setElement(term13036, 6, "HBGNxdNURv");
        setElement(term13036, 7, "mfCpTPPQQm");
        setElement(term13036, 8, "OcJCIDNIXA");
        setField(term12986, term12986.getClass(), "header", term13036);
        setBooleanField(term12986, term12986.getClass(), "skipHeaderRecord", false);
        term13146 = new Character('a');
        Character term47985 = new Character('F');
        Class<? extends Object> term48325 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48324 = ((Class) term48325).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term48324).setAccessible(true);
        Object enum125 = ((Field) term48324).get((Object) null);
        Character term47989 = new Character('Z');
        Character term47990 = new Character('i');
        term47984 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term47995 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term47984, term47984.getClass(), "delimiter", 't');
        setField(term47984, term47984.getClass(), "quoteCharacter", term47985);
        setField(term47984, term47984.getClass(), "quoteMode", enum125);
        setField(term47984, term47984.getClass(), "commentMarker", term47989);
        setField(term47984, term47984.getClass(), "escapeCharacter", term47990);
        setBooleanField(term47984, term47984.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term47984, term47984.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term47984, term47984.getClass(), "ignoreEmptyLines", true);
        setField(term47984, term47984.getClass(), "recordSeparator", "NzBMMhkhpT");
        setField(term47984, term47984.getClass(), "nullString", "qCpEbQDHdF");
        setElement(term47995, 0, "AHbZyFOmlo");
        setElement(term47995, 1, "TwfWVQGiIj");
        setElement(term47995, 2, "gUvcueTURF");
        setElement(term47995, 3, "EwQBhZjCIT");
        setElement(term47995, 4, "aSkmSwTnEw");
        setElement(term47995, 5, "xvkbvaEGYd");
        setElement(term47995, 6, "HBGNxdNURv");
        setElement(term47995, 7, "mfCpTPPQQm");
        setElement(term47995, 8, "OcJCIDNIXA");
        setField(term47984, term47984.getClass(), "header", term47995);
        setBooleanField(term47984, term47984.getClass(), "skipHeaderRecord", false);
        Character term47849 = new Character('F');
        Class<? extends Object> term48635 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48634 = ((Class) term48635).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term48634).setAccessible(true);
        Object enum126 = ((Field) term48634).get((Object) null);
        Character term47851 = new Character('Z');
        Character term47853 = new Character('i');
        term47847 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term47873 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term47847, term47847.getClass(), "delimiter", 't');
        setField(term47847, term47847.getClass(), "quoteCharacter", term47849);
        setField(term47847, term47847.getClass(), "quoteMode", enum126);
        setField(term47847, term47847.getClass(), "commentMarker", term47851);
        setField(term47847, term47847.getClass(), "escapeCharacter", term47853);
        setBooleanField(term47847, term47847.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term47847, term47847.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term47847, term47847.getClass(), "ignoreEmptyLines", true);
        setField(term47847, term47847.getClass(), "recordSeparator", "a");
        setField(term47847, term47847.getClass(), "nullString", "qCpEbQDHdF");
        setElement(term47873, 0, "AHbZyFOmlo");
        setElement(term47873, 1, "TwfWVQGiIj");
        setElement(term47873, 2, "gUvcueTURF");
        setElement(term47873, 3, "EwQBhZjCIT");
        setElement(term47873, 4, "aSkmSwTnEw");
        setElement(term47873, 5, "xvkbvaEGYd");
        setElement(term47873, 6, "HBGNxdNURv");
        setElement(term47873, 7, "mfCpTPPQQm");
        setElement(term47873, 8, "OcJCIDNIXA");
        setField(term47847, term47847.getClass(), "header", term47873);
        setBooleanField(term47847, term47847.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term13146;
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term12986, args);
        assertTrue(recursiveEquals(term12986, term47984));
        assertTrue(recursiveEquals(term13146, 'a'));
        assertTrue(recursiveEquals(retValue, term47847));
    }

};


