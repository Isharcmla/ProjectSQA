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

public class CSVFormat_withIgnoreEmptyLines_47944145177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10791;
     Object term10903;
     Object term41752;
     Object term41433;

    public CSVFormat_withIgnoreEmptyLines_47944145177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10793 = new Character('p');
        Class<? extends Object> term41775 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41774 = ((Class) term41775).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term41774).setAccessible(true);
        Object enum106 = ((Field) term41774).get((Object) null);
        Character term10810 = new Character('a');
        Character term10812 = new Character('H');
        term10791 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10841 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term10791, term10791.getClass(), "delimiter", 'F');
        setField(term10791, term10791.getClass(), "quoteCharacter", term10793);
        setField(term10791, term10791.getClass(), "quoteMode", enum106);
        setField(term10791, term10791.getClass(), "commentMarker", term10810);
        setField(term10791, term10791.getClass(), "escapeCharacter", term10812);
        setBooleanField(term10791, term10791.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term10791, term10791.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term10791, term10791.getClass(), "ignoreEmptyLines", false);
        setField(term10791, term10791.getClass(), "recordSeparator", "OqbwYQfvAe");
        setField(term10791, term10791.getClass(), "nullString", "tRxZafjqIx");
        setElement(term10841, 0, "DhjNLmRMCu");
        setElement(term10841, 1, "PgPzMSEjjX");
        setElement(term10841, 2, "wzsPSPcRdj");
        setElement(term10841, 3, "kGMQdqJYyB");
        setElement(term10841, 4, "XJJNClzHRf");
        setField(term10791, term10791.getClass(), "header", term10841);
        setBooleanField(term10791, term10791.getClass(), "skipHeaderRecord", false);
        term10903 = new Boolean(true);
        Character term41753 = new Character('p');
        Class<? extends Object> term42045 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42044 = ((Class) term42045).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42044).setAccessible(true);
        Object enum107 = ((Field) term42044).get((Object) null);
        Character term41757 = new Character('a');
        Character term41758 = new Character('H');
        term41752 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41763 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term41752, term41752.getClass(), "delimiter", 'F');
        setField(term41752, term41752.getClass(), "quoteCharacter", term41753);
        setField(term41752, term41752.getClass(), "quoteMode", enum107);
        setField(term41752, term41752.getClass(), "commentMarker", term41757);
        setField(term41752, term41752.getClass(), "escapeCharacter", term41758);
        setBooleanField(term41752, term41752.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term41752, term41752.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term41752, term41752.getClass(), "ignoreEmptyLines", false);
        setField(term41752, term41752.getClass(), "recordSeparator", "OqbwYQfvAe");
        setField(term41752, term41752.getClass(), "nullString", "tRxZafjqIx");
        setElement(term41763, 0, "DhjNLmRMCu");
        setElement(term41763, 1, "PgPzMSEjjX");
        setElement(term41763, 2, "wzsPSPcRdj");
        setElement(term41763, 3, "kGMQdqJYyB");
        setElement(term41763, 4, "XJJNClzHRf");
        setField(term41752, term41752.getClass(), "header", term41763);
        setBooleanField(term41752, term41752.getClass(), "skipHeaderRecord", false);
        Character term41435 = new Character('p');
        Class<? extends Object> term42315 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42314 = ((Class) term42315).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42314).setAccessible(true);
        Object enum108 = ((Field) term42314).get((Object) null);
        Character term41452 = new Character('a');
        Character term41454 = new Character('H');
        term41433 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41483 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term41433, term41433.getClass(), "delimiter", 'F');
        setField(term41433, term41433.getClass(), "quoteCharacter", term41435);
        setField(term41433, term41433.getClass(), "quoteMode", enum108);
        setField(term41433, term41433.getClass(), "commentMarker", term41452);
        setField(term41433, term41433.getClass(), "escapeCharacter", term41454);
        setBooleanField(term41433, term41433.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term41433, term41433.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term41433, term41433.getClass(), "ignoreEmptyLines", true);
        setField(term41433, term41433.getClass(), "recordSeparator", "OqbwYQfvAe");
        setField(term41433, term41433.getClass(), "nullString", "tRxZafjqIx");
        setElement(term41483, 0, "DhjNLmRMCu");
        setElement(term41483, 1, "PgPzMSEjjX");
        setElement(term41483, 2, "wzsPSPcRdj");
        setElement(term41483, 3, "kGMQdqJYyB");
        setElement(term41483, 4, "XJJNClzHRf");
        setField(term41433, term41433.getClass(), "header", term41483);
        setBooleanField(term41433, term41433.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10903;
        Object retValue = callMethod(klass, "withIgnoreEmptyLines", argTypes, term10791, args);
        assertTrue(recursiveEquals(term10791, term41752));
        assertTrue(recursiveEquals(term10903, true));
        assertTrue(recursiveEquals(retValue, term41433));
    }

};


