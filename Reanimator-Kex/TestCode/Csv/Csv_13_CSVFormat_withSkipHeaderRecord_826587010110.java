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

public class CSVFormat_withSkipHeaderRecord_826587010110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23169;
     Object term96789;
     Object term96738;

    public CSVFormat_withSkipHeaderRecord_826587010110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23171 = new Character('y');
        Class<? extends Object> term96805 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term96804 = ((Class) term96805).getDeclaredField((String) "ALL");
        ((Field) term96804).setAccessible(true);
        Object enum174 = ((Field) term96804).get((Object) null);
        Character term23180 = new Character('b');
        Character term23182 = new Character('S');
        term23169 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23211 = (Object[]) newArray("java.lang.String", 1);
        Object[] term23224 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term23169, term23169.getClass(), "delimiter", 'k');
        setField(term23169, term23169.getClass(), "quoteCharacter", term23171);
        setField(term23169, term23169.getClass(), "quoteMode", enum174);
        setField(term23169, term23169.getClass(), "commentMarker", term23180);
        setField(term23169, term23169.getClass(), "escapeCharacter", term23182);
        setBooleanField(term23169, term23169.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term23169, term23169.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term23169, term23169.getClass(), "ignoreEmptyLines", true);
        setField(term23169, term23169.getClass(), "recordSeparator", "UiWhvbypdr");
        setField(term23169, term23169.getClass(), "nullString", "CgleElJNje");
        setElement(term23211, 0, "ZrchvNGMtd");
        setField(term23169, term23169.getClass(), "header", term23211);
        setField(term23169, term23169.getClass(), "headerComments", term23224);
        setBooleanField(term23169, term23169.getClass(), "skipHeaderRecord", false);
        setBooleanField(term23169, term23169.getClass(), "ignoreHeaderCase", true);
        Character term96790 = new Character('y');
        Class<? extends Object> term97011 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term97010 = ((Class) term97011).getDeclaredField((String) "ALL");
        ((Field) term97010).setAccessible(true);
        Object enum175 = ((Field) term97010).get((Object) null);
        Character term96794 = new Character('b');
        Character term96795 = new Character('S');
        term96789 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term96800 = (Object[]) newArray("java.lang.String", 1);
        Object[] term96803 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term96789, term96789.getClass(), "delimiter", 'k');
        setField(term96789, term96789.getClass(), "quoteCharacter", term96790);
        setField(term96789, term96789.getClass(), "quoteMode", enum175);
        setField(term96789, term96789.getClass(), "commentMarker", term96794);
        setField(term96789, term96789.getClass(), "escapeCharacter", term96795);
        setBooleanField(term96789, term96789.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term96789, term96789.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term96789, term96789.getClass(), "ignoreEmptyLines", true);
        setField(term96789, term96789.getClass(), "recordSeparator", "UiWhvbypdr");
        setField(term96789, term96789.getClass(), "nullString", "CgleElJNje");
        setElement(term96800, 0, "ZrchvNGMtd");
        setField(term96789, term96789.getClass(), "header", term96800);
        setField(term96789, term96789.getClass(), "headerComments", term96803);
        setBooleanField(term96789, term96789.getClass(), "skipHeaderRecord", false);
        setBooleanField(term96789, term96789.getClass(), "ignoreHeaderCase", true);
        Character term96740 = new Character('y');
        Class<? extends Object> term97217 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term97216 = ((Class) term97217).getDeclaredField((String) "ALL");
        ((Field) term97216).setAccessible(true);
        Object enum176 = ((Field) term97216).get((Object) null);
        Character term96742 = new Character('b');
        Character term96744 = new Character('S');
        term96738 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term96773 = (Object[]) newArray("java.lang.String", 1);
        Object[] term96786 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term96738, term96738.getClass(), "delimiter", 'k');
        setField(term96738, term96738.getClass(), "quoteCharacter", term96740);
        setField(term96738, term96738.getClass(), "quoteMode", enum176);
        setField(term96738, term96738.getClass(), "commentMarker", term96742);
        setField(term96738, term96738.getClass(), "escapeCharacter", term96744);
        setBooleanField(term96738, term96738.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term96738, term96738.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term96738, term96738.getClass(), "ignoreEmptyLines", true);
        setField(term96738, term96738.getClass(), "recordSeparator", "UiWhvbypdr");
        setField(term96738, term96738.getClass(), "nullString", "CgleElJNje");
        setElement(term96773, 0, "ZrchvNGMtd");
        setField(term96738, term96738.getClass(), "header", term96773);
        setField(term96738, term96738.getClass(), "headerComments", term96786);
        setBooleanField(term96738, term96738.getClass(), "skipHeaderRecord", true);
        setBooleanField(term96738, term96738.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withSkipHeaderRecord", argTypes, term23169, args);
        assertTrue(recursiveEquals(term23169, term96789));
        assertTrue(recursiveEquals(retValue, term96738));
    }

};


