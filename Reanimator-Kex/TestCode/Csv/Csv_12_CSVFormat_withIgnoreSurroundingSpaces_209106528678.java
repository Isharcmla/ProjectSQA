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

public class CSVFormat_withIgnoreSurroundingSpaces_209106528678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11175;
     Object term11256;
     Object term42841;
     Object term42608;

    public CSVFormat_withIgnoreSurroundingSpaces_209106528678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11177 = new Character('w');
        Class<? extends Object> term42860 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42859 = ((Class) term42860).getDeclaredField((String) "NONE");
        ((Field) term42859).setAccessible(true);
        Object enum109 = ((Field) term42859).get((Object) null);
        Character term11187 = new Character('X');
        Character term11189 = new Character('R');
        term11175 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11218 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term11175, term11175.getClass(), "delimiter", 'E');
        setField(term11175, term11175.getClass(), "quoteCharacter", term11177);
        setField(term11175, term11175.getClass(), "quoteMode", enum109);
        setField(term11175, term11175.getClass(), "commentMarker", term11187);
        setField(term11175, term11175.getClass(), "escapeCharacter", term11189);
        setBooleanField(term11175, term11175.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term11175, term11175.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term11175, term11175.getClass(), "ignoreEmptyLines", false);
        setField(term11175, term11175.getClass(), "recordSeparator", "HDaezxQfQR");
        setField(term11175, term11175.getClass(), "nullString", "iikZEapDlu");
        setElement(term11218, 0, "nhoHrZfnIN");
        setElement(term11218, 1, "ZkMALXpEAZ");
        setElement(term11218, 2, "tXfQjSqDzN");
        setField(term11175, term11175.getClass(), "header", term11218);
        setBooleanField(term11175, term11175.getClass(), "skipHeaderRecord", true);
        term11256 = new Boolean(false);
        Character term42842 = new Character('w');
        Class<? extends Object> term43089 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43088 = ((Class) term43089).getDeclaredField((String) "NONE");
        ((Field) term43088).setAccessible(true);
        Object enum110 = ((Field) term43088).get((Object) null);
        Character term42846 = new Character('X');
        Character term42847 = new Character('R');
        term42841 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42852 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term42841, term42841.getClass(), "delimiter", 'E');
        setField(term42841, term42841.getClass(), "quoteCharacter", term42842);
        setField(term42841, term42841.getClass(), "quoteMode", enum110);
        setField(term42841, term42841.getClass(), "commentMarker", term42846);
        setField(term42841, term42841.getClass(), "escapeCharacter", term42847);
        setBooleanField(term42841, term42841.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term42841, term42841.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term42841, term42841.getClass(), "ignoreEmptyLines", false);
        setField(term42841, term42841.getClass(), "recordSeparator", "HDaezxQfQR");
        setField(term42841, term42841.getClass(), "nullString", "iikZEapDlu");
        setElement(term42852, 0, "nhoHrZfnIN");
        setElement(term42852, 1, "ZkMALXpEAZ");
        setElement(term42852, 2, "tXfQjSqDzN");
        setField(term42841, term42841.getClass(), "header", term42852);
        setBooleanField(term42841, term42841.getClass(), "skipHeaderRecord", true);
        Character term42610 = new Character('w');
        Class<? extends Object> term43318 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43317 = ((Class) term43318).getDeclaredField((String) "NONE");
        ((Field) term43317).setAccessible(true);
        Object enum111 = ((Field) term43317).get((Object) null);
        Character term42620 = new Character('X');
        Character term42622 = new Character('R');
        term42608 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42651 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term42608, term42608.getClass(), "delimiter", 'E');
        setField(term42608, term42608.getClass(), "quoteCharacter", term42610);
        setField(term42608, term42608.getClass(), "quoteMode", enum111);
        setField(term42608, term42608.getClass(), "commentMarker", term42620);
        setField(term42608, term42608.getClass(), "escapeCharacter", term42622);
        setBooleanField(term42608, term42608.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term42608, term42608.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term42608, term42608.getClass(), "ignoreEmptyLines", false);
        setField(term42608, term42608.getClass(), "recordSeparator", "HDaezxQfQR");
        setField(term42608, term42608.getClass(), "nullString", "iikZEapDlu");
        setElement(term42651, 0, "nhoHrZfnIN");
        setElement(term42651, 1, "ZkMALXpEAZ");
        setElement(term42651, 2, "tXfQjSqDzN");
        setField(term42608, term42608.getClass(), "header", term42651);
        setBooleanField(term42608, term42608.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11256;
        Object retValue = callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term11175, args);
        assertTrue(recursiveEquals(term11175, term42841));
        assertTrue(recursiveEquals(term11256, false));
        assertTrue(recursiveEquals(retValue, term42608));
    }

};


