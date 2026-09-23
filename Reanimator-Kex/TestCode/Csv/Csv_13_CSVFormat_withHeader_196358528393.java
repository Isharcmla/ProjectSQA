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

public class CSVFormat_withHeader_196358528393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15336;
     Object term71427;
     Object term71389;

    public CSVFormat_withHeader_196358528393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15338 = new Character('V');
        Class<? extends Object> term71443 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term71442 = ((Class) term71443).getDeclaredField((String) "NONE");
        ((Field) term71442).setAccessible(true);
        Object enum125 = ((Field) term71442).get((Object) null);
        Character term15348 = new Character('c');
        Character term15350 = new Character('I');
        term15336 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15379 = (Object[]) newArray("java.lang.String", 1);
        Object[] term15392 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term15336, term15336.getClass(), "delimiter", 'o');
        setField(term15336, term15336.getClass(), "quoteCharacter", term15338);
        setField(term15336, term15336.getClass(), "quoteMode", enum125);
        setField(term15336, term15336.getClass(), "commentMarker", term15348);
        setField(term15336, term15336.getClass(), "escapeCharacter", term15350);
        setBooleanField(term15336, term15336.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term15336, term15336.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term15336, term15336.getClass(), "ignoreEmptyLines", true);
        setField(term15336, term15336.getClass(), "recordSeparator", "bdyhHbDAmJ");
        setField(term15336, term15336.getClass(), "nullString", "BBXiTNHqGE");
        setElement(term15379, 0, "IEYhJmgCVd");
        setField(term15336, term15336.getClass(), "header", term15379);
        setField(term15336, term15336.getClass(), "headerComments", term15392);
        setBooleanField(term15336, term15336.getClass(), "skipHeaderRecord", true);
        setBooleanField(term15336, term15336.getClass(), "ignoreHeaderCase", false);
        Character term71428 = new Character('V');
        Class<? extends Object> term71652 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term71651 = ((Class) term71652).getDeclaredField((String) "NONE");
        ((Field) term71651).setAccessible(true);
        Object enum126 = ((Field) term71651).get((Object) null);
        Character term71432 = new Character('c');
        Character term71433 = new Character('I');
        term71427 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term71438 = (Object[]) newArray("java.lang.String", 1);
        Object[] term71441 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term71427, term71427.getClass(), "delimiter", 'o');
        setField(term71427, term71427.getClass(), "quoteCharacter", term71428);
        setField(term71427, term71427.getClass(), "quoteMode", enum126);
        setField(term71427, term71427.getClass(), "commentMarker", term71432);
        setField(term71427, term71427.getClass(), "escapeCharacter", term71433);
        setBooleanField(term71427, term71427.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term71427, term71427.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term71427, term71427.getClass(), "ignoreEmptyLines", true);
        setField(term71427, term71427.getClass(), "recordSeparator", "bdyhHbDAmJ");
        setField(term71427, term71427.getClass(), "nullString", "BBXiTNHqGE");
        setElement(term71438, 0, "IEYhJmgCVd");
        setField(term71427, term71427.getClass(), "header", term71438);
        setField(term71427, term71427.getClass(), "headerComments", term71441);
        setBooleanField(term71427, term71427.getClass(), "skipHeaderRecord", true);
        setBooleanField(term71427, term71427.getClass(), "ignoreHeaderCase", false);
        Character term71391 = new Character('V');
        Class<? extends Object> term71861 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term71860 = ((Class) term71861).getDeclaredField((String) "NONE");
        ((Field) term71860).setAccessible(true);
        Object enum127 = ((Field) term71860).get((Object) null);
        Character term71393 = new Character('c');
        Character term71395 = new Character('I');
        term71389 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term71424 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term71389, term71389.getClass(), "delimiter", 'o');
        setField(term71389, term71389.getClass(), "quoteCharacter", term71391);
        setField(term71389, term71389.getClass(), "quoteMode", enum127);
        setField(term71389, term71389.getClass(), "commentMarker", term71393);
        setField(term71389, term71389.getClass(), "escapeCharacter", term71395);
        setBooleanField(term71389, term71389.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term71389, term71389.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term71389, term71389.getClass(), "ignoreEmptyLines", true);
        setField(term71389, term71389.getClass(), "recordSeparator", "bdyhHbDAmJ");
        setField(term71389, term71389.getClass(), "nullString", "BBXiTNHqGE");
        setField(term71389, term71389.getClass(), "header", null);
        setField(term71389, term71389.getClass(), "headerComments", term71424);
        setBooleanField(term71389, term71389.getClass(), "skipHeaderRecord", true);
        setBooleanField(term71389, term71389.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withHeader", argTypes, term15336, args);
        assertTrue(recursiveEquals(term15336, term71427));
        assertTrue(recursiveEquals(retValue, term71389));
    }

};


