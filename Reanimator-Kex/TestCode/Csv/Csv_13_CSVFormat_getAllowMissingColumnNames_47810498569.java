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

public class CSVFormat_getAllowMissingColumnNames_47810498569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3951;
     Object term45784;

    public CSVFormat_getAllowMissingColumnNames_47810498569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3953 = new Character('j');
        Class<? extends Object> term45804 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45803 = ((Class) term45804).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term45803).setAccessible(true);
        Object enum72 = ((Field) term45803).get((Object) null);
        Character term3970 = new Character('J');
        Character term3972 = new Character('C');
        term3951 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4001 = (Object[]) newArray("java.lang.String", 2);
        Object[] term4026 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term3951, term3951.getClass(), "delimiter", 's');
        setField(term3951, term3951.getClass(), "quoteCharacter", term3953);
        setField(term3951, term3951.getClass(), "quoteMode", enum72);
        setField(term3951, term3951.getClass(), "commentMarker", term3970);
        setField(term3951, term3951.getClass(), "escapeCharacter", term3972);
        setBooleanField(term3951, term3951.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3951, term3951.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term3951, term3951.getClass(), "ignoreEmptyLines", true);
        setField(term3951, term3951.getClass(), "recordSeparator", "jSpAteRute");
        setField(term3951, term3951.getClass(), "nullString", "swZVeJAxjt");
        setElement(term4001, 0, "xOcJIiQQDu");
        setElement(term4001, 1, "GVizqqzXpy");
        setField(term3951, term3951.getClass(), "header", term4001);
        setElement(term4026, 0, "JqXGgAhZPl");
        setField(term3951, term3951.getClass(), "headerComments", term4026);
        setBooleanField(term3951, term3951.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3951, term3951.getClass(), "ignoreHeaderCase", true);
        Character term45785 = new Character('j');
        Class<? extends Object> term46054 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46053 = ((Class) term46054).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term46053).setAccessible(true);
        Object enum73 = ((Field) term46053).get((Object) null);
        Character term45789 = new Character('J');
        Character term45790 = new Character('C');
        term45784 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45795 = (Object[]) newArray("java.lang.String", 2);
        Object[] term45800 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term45784, term45784.getClass(), "delimiter", 's');
        setField(term45784, term45784.getClass(), "quoteCharacter", term45785);
        setField(term45784, term45784.getClass(), "quoteMode", enum73);
        setField(term45784, term45784.getClass(), "commentMarker", term45789);
        setField(term45784, term45784.getClass(), "escapeCharacter", term45790);
        setBooleanField(term45784, term45784.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term45784, term45784.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term45784, term45784.getClass(), "ignoreEmptyLines", true);
        setField(term45784, term45784.getClass(), "recordSeparator", "jSpAteRute");
        setField(term45784, term45784.getClass(), "nullString", "swZVeJAxjt");
        setElement(term45795, 0, "xOcJIiQQDu");
        setElement(term45795, 1, "GVizqqzXpy");
        setField(term45784, term45784.getClass(), "header", term45795);
        setElement(term45800, 0, "JqXGgAhZPl");
        setField(term45784, term45784.getClass(), "headerComments", term45800);
        setBooleanField(term45784, term45784.getClass(), "skipHeaderRecord", false);
        setBooleanField(term45784, term45784.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowMissingColumnNames", argTypes, term3951, args);
        assertTrue(recursiveEquals(term3951, term45784));
    }

};


