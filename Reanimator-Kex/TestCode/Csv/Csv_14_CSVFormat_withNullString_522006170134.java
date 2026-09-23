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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withNullString_522006170134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25817;
     Object term99441;
     Object term98948;

    public CSVFormat_withNullString_522006170134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term25819 = new Character('x');
        Character term25822 = new Character('G');
        Character term25949 = new Character('V');
        Class<? extends Object> term99575 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term99574 = ((Class) term99575).getDeclaredField((String) "NONE");
        ((Field) term99574).setAccessible(true);
        Object enum202 = ((Field) term99574).get((Object) null);
        term25817 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25824 = (Object[]) newArray("java.lang.String", 6);
        Object[] term25897 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term25817, term25817.getClass(), "allowMissingColumnNames", false);
        setField(term25817, term25817.getClass(), "commentMarker", term25819);
        setCharField(term25817, term25817.getClass(), "delimiter", 'v');
        setField(term25817, term25817.getClass(), "escapeCharacter", term25822);
        setElement(term25824, 0, "GSzQdbHLHw");
        setElement(term25824, 1, "IkfarsYNJO");
        setElement(term25824, 2, "aZKOWhHMEh");
        setElement(term25824, 3, "YfkhviKZwl");
        setElement(term25824, 4, "DcOhhAfJTI");
        setElement(term25824, 5, "gYTIkBFOoS");
        setField(term25817, term25817.getClass(), "header", term25824);
        setElement(term25897, 0, "xmzSoVgiED");
        setElement(term25897, 1, "pdSvedKgPq");
        setElement(term25897, 2, "epPTwvcoyb");
        setField(term25817, term25817.getClass(), "headerComments", term25897);
        setBooleanField(term25817, term25817.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term25817, term25817.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term25817, term25817.getClass(), "ignoreSurroundingSpaces", false);
        setField(term25817, term25817.getClass(), "nullString", "UBPHmOICBs");
        setField(term25817, term25817.getClass(), "quoteCharacter", term25949);
        setField(term25817, term25817.getClass(), "quoteMode", enum202);
        setField(term25817, term25817.getClass(), "recordSeparator", "IDJUVPgUJf");
        setBooleanField(term25817, term25817.getClass(), "skipHeaderRecord", false);
        setBooleanField(term25817, term25817.getClass(), "trailingDelimiter", false);
        setBooleanField(term25817, term25817.getClass(), "trim", true);
        Character term99442 = new Character('x');
        Character term99443 = new Character('G');
        Character term99466 = new Character('V');
        Class<? extends Object> term99874 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term99873 = ((Class) term99874).getDeclaredField((String) "NONE");
        ((Field) term99873).setAccessible(true);
        Object enum203 = ((Field) term99873).get((Object) null);
        term99441 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term99444 = (Object[]) newArray("java.lang.String", 6);
        Object[] term99457 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term99441, term99441.getClass(), "allowMissingColumnNames", false);
        setField(term99441, term99441.getClass(), "commentMarker", term99442);
        setCharField(term99441, term99441.getClass(), "delimiter", 'v');
        setField(term99441, term99441.getClass(), "escapeCharacter", term99443);
        setElement(term99444, 0, "GSzQdbHLHw");
        setElement(term99444, 1, "IkfarsYNJO");
        setElement(term99444, 2, "aZKOWhHMEh");
        setElement(term99444, 3, "YfkhviKZwl");
        setElement(term99444, 4, "DcOhhAfJTI");
        setElement(term99444, 5, "gYTIkBFOoS");
        setField(term99441, term99441.getClass(), "header", term99444);
        setElement(term99457, 0, "xmzSoVgiED");
        setElement(term99457, 1, "pdSvedKgPq");
        setElement(term99457, 2, "epPTwvcoyb");
        setField(term99441, term99441.getClass(), "headerComments", term99457);
        setBooleanField(term99441, term99441.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term99441, term99441.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term99441, term99441.getClass(), "ignoreSurroundingSpaces", false);
        setField(term99441, term99441.getClass(), "nullString", "UBPHmOICBs");
        setField(term99441, term99441.getClass(), "quoteCharacter", term99466);
        setField(term99441, term99441.getClass(), "quoteMode", enum203);
        setField(term99441, term99441.getClass(), "recordSeparator", "IDJUVPgUJf");
        setBooleanField(term99441, term99441.getClass(), "skipHeaderRecord", false);
        setBooleanField(term99441, term99441.getClass(), "trailingDelimiter", false);
        setBooleanField(term99441, term99441.getClass(), "trim", true);
        Character term98950 = new Character('x');
        Character term98953 = new Character('G');
        Character term99080 = new Character('V');
        Class<? extends Object> term100173 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term100172 = ((Class) term100173).getDeclaredField((String) "NONE");
        ((Field) term100172).setAccessible(true);
        Object enum204 = ((Field) term100172).get((Object) null);
        term98948 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term98955 = (Object[]) newArray("java.lang.String", 6);
        Object[] term99028 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term98948, term98948.getClass(), "allowMissingColumnNames", false);
        setField(term98948, term98948.getClass(), "commentMarker", term98950);
        setCharField(term98948, term98948.getClass(), "delimiter", 'v');
        setField(term98948, term98948.getClass(), "escapeCharacter", term98953);
        setElement(term98955, 0, "GSzQdbHLHw");
        setElement(term98955, 1, "IkfarsYNJO");
        setElement(term98955, 2, "aZKOWhHMEh");
        setElement(term98955, 3, "YfkhviKZwl");
        setElement(term98955, 4, "DcOhhAfJTI");
        setElement(term98955, 5, "gYTIkBFOoS");
        setField(term98948, term98948.getClass(), "header", term98955);
        setElement(term99028, 0, "xmzSoVgiED");
        setElement(term99028, 1, "pdSvedKgPq");
        setElement(term99028, 2, "epPTwvcoyb");
        setField(term98948, term98948.getClass(), "headerComments", term99028);
        setBooleanField(term98948, term98948.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term98948, term98948.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term98948, term98948.getClass(), "ignoreSurroundingSpaces", false);
        setField(term98948, term98948.getClass(), "nullString", "JmnWRJUxGr");
        setField(term98948, term98948.getClass(), "quoteCharacter", term99080);
        setField(term98948, term98948.getClass(), "quoteMode", enum204);
        setField(term98948, term98948.getClass(), "recordSeparator", "IDJUVPgUJf");
        setBooleanField(term98948, term98948.getClass(), "skipHeaderRecord", false);
        setBooleanField(term98948, term98948.getClass(), "trailingDelimiter", false);
        setBooleanField(term98948, term98948.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmnWRJUxGr";
        Object retValue = callMethod(klass, "withNullString", argTypes, term25817, args);
        assertTrue(recursiveEquals(term25817, term99441));
        assertTrue(recursiveEquals(retValue, term98948));
    }

};


