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

public class CSVFormat_equals_3408109862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;
     Object term970;
     Object term26638;
     Object term26667;

    public CSVFormat_equals_3408109862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term826 = new Character('l');
        Class<? extends Object> term26670 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26669 = ((Class) term26670).getDeclaredField((String) "MINIMAL");
        ((Field) term26669).setAccessible(true);
        Object enum58 = ((Field) term26669).get((Object) null);
        Character term839 = new Character('J');
        Character term841 = new Character('A');
        term824 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term870 = (Object[]) newArray("java.lang.String", 6);
        Object[] term943 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term824, term824.getClass(), "delimiter", 'j');
        setField(term824, term824.getClass(), "quoteCharacter", term826);
        setField(term824, term824.getClass(), "quoteMode", enum58);
        setField(term824, term824.getClass(), "commentMarker", term839);
        setField(term824, term824.getClass(), "escapeCharacter", term841);
        setBooleanField(term824, term824.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term824, term824.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term824, term824.getClass(), "ignoreEmptyLines", false);
        setField(term824, term824.getClass(), "recordSeparator", "ZiaGIbnzTs");
        setField(term824, term824.getClass(), "nullString", "tbcdzjIfER");
        setElement(term870, 0, "HyxfbSQYBe");
        setElement(term870, 1, "pCTimMblYc");
        setElement(term870, 2, "hNxWaHcfhY");
        setElement(term870, 3, "RkybSrpybU");
        setElement(term870, 4, "xOEqzGAmDU");
        setElement(term870, 5, "eZFUvlxvGV");
        setField(term824, term824.getClass(), "header", term870);
        setElement(term943, 0, "BYqFIqCKAV");
        setElement(term943, 1, "vrQLuWIDJX");
        setField(term824, term824.getClass(), "headerComments", term943);
        setBooleanField(term824, term824.getClass(), "skipHeaderRecord", true);
        setBooleanField(term824, term824.getClass(), "ignoreHeaderCase", false);
        term970 = newInstance(Class.forName("java.lang.Object"));
        Character term26639 = new Character('l');
        Class<? extends Object> term26958 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26957 = ((Class) term26958).getDeclaredField((String) "MINIMAL");
        ((Field) term26957).setAccessible(true);
        Object enum59 = ((Field) term26957).get((Object) null);
        Character term26643 = new Character('J');
        Character term26644 = new Character('A');
        term26638 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26649 = (Object[]) newArray("java.lang.String", 6);
        Object[] term26662 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term26638, term26638.getClass(), "delimiter", 'j');
        setField(term26638, term26638.getClass(), "quoteCharacter", term26639);
        setField(term26638, term26638.getClass(), "quoteMode", enum59);
        setField(term26638, term26638.getClass(), "commentMarker", term26643);
        setField(term26638, term26638.getClass(), "escapeCharacter", term26644);
        setBooleanField(term26638, term26638.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term26638, term26638.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term26638, term26638.getClass(), "ignoreEmptyLines", false);
        setField(term26638, term26638.getClass(), "recordSeparator", "ZiaGIbnzTs");
        setField(term26638, term26638.getClass(), "nullString", "tbcdzjIfER");
        setElement(term26649, 0, "HyxfbSQYBe");
        setElement(term26649, 1, "pCTimMblYc");
        setElement(term26649, 2, "hNxWaHcfhY");
        setElement(term26649, 3, "RkybSrpybU");
        setElement(term26649, 4, "xOEqzGAmDU");
        setElement(term26649, 5, "eZFUvlxvGV");
        setField(term26638, term26638.getClass(), "header", term26649);
        setElement(term26662, 0, "BYqFIqCKAV");
        setElement(term26662, 1, "vrQLuWIDJX");
        setField(term26638, term26638.getClass(), "headerComments", term26662);
        setBooleanField(term26638, term26638.getClass(), "skipHeaderRecord", true);
        setBooleanField(term26638, term26638.getClass(), "ignoreHeaderCase", false);
        term26667 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term970;
        Object retValue = callMethod(klass, "equals", argTypes, term824, args);
        assertTrue(recursiveEquals(term824, term26638));
        assertTrue(recursiveEquals(term970, term26667));
        assertTrue(recursiveEquals(retValue, false));
    }

};


