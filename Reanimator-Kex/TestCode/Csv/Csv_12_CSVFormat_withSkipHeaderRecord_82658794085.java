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

public class CSVFormat_withSkipHeaderRecord_82658794085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13808;
     Object term13952;
     Object term50538;
     Object term50119;

    public CSVFormat_withSkipHeaderRecord_82658794085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13810 = new Character('T');
        Class<? extends Object> term50567 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50566 = ((Class) term50567).getDeclaredField((String) "MINIMAL");
        ((Field) term50566).setAccessible(true);
        Object enum130 = ((Field) term50566).get((Object) null);
        Character term13823 = new Character('s');
        Character term13825 = new Character('t');
        term13808 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13854 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term13808, term13808.getClass(), "delimiter", 'z');
        setField(term13808, term13808.getClass(), "quoteCharacter", term13810);
        setField(term13808, term13808.getClass(), "quoteMode", enum130);
        setField(term13808, term13808.getClass(), "commentMarker", term13823);
        setField(term13808, term13808.getClass(), "escapeCharacter", term13825);
        setBooleanField(term13808, term13808.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term13808, term13808.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term13808, term13808.getClass(), "ignoreEmptyLines", true);
        setField(term13808, term13808.getClass(), "recordSeparator", "WBAOTqErtm");
        setField(term13808, term13808.getClass(), "nullString", "PqtVXXZMqK");
        setElement(term13854, 0, "rYbtIDVdnd");
        setElement(term13854, 1, "UKAReurpHG");
        setElement(term13854, 2, "WVRMUmrljA");
        setElement(term13854, 3, "NTlKJDDWlk");
        setElement(term13854, 4, "vOuMEpOQAg");
        setElement(term13854, 5, "SIODFGaQhr");
        setElement(term13854, 6, "qYzsiuXOgS");
        setElement(term13854, 7, "bxrCBbrrct");
        setField(term13808, term13808.getClass(), "header", term13854);
        setBooleanField(term13808, term13808.getClass(), "skipHeaderRecord", false);
        term13952 = new Boolean(false);
        Character term50539 = new Character('T');
        Class<? extends Object> term50855 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50854 = ((Class) term50855).getDeclaredField((String) "MINIMAL");
        ((Field) term50854).setAccessible(true);
        Object enum131 = ((Field) term50854).get((Object) null);
        Character term50543 = new Character('s');
        Character term50544 = new Character('t');
        term50538 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50549 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term50538, term50538.getClass(), "delimiter", 'z');
        setField(term50538, term50538.getClass(), "quoteCharacter", term50539);
        setField(term50538, term50538.getClass(), "quoteMode", enum131);
        setField(term50538, term50538.getClass(), "commentMarker", term50543);
        setField(term50538, term50538.getClass(), "escapeCharacter", term50544);
        setBooleanField(term50538, term50538.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term50538, term50538.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term50538, term50538.getClass(), "ignoreEmptyLines", true);
        setField(term50538, term50538.getClass(), "recordSeparator", "WBAOTqErtm");
        setField(term50538, term50538.getClass(), "nullString", "PqtVXXZMqK");
        setElement(term50549, 0, "rYbtIDVdnd");
        setElement(term50549, 1, "UKAReurpHG");
        setElement(term50549, 2, "WVRMUmrljA");
        setElement(term50549, 3, "NTlKJDDWlk");
        setElement(term50549, 4, "vOuMEpOQAg");
        setElement(term50549, 5, "SIODFGaQhr");
        setElement(term50549, 6, "qYzsiuXOgS");
        setElement(term50549, 7, "bxrCBbrrct");
        setField(term50538, term50538.getClass(), "header", term50549);
        setBooleanField(term50538, term50538.getClass(), "skipHeaderRecord", false);
        Character term50121 = new Character('T');
        Class<? extends Object> term51143 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51142 = ((Class) term51143).getDeclaredField((String) "MINIMAL");
        ((Field) term51142).setAccessible(true);
        Object enum132 = ((Field) term51142).get((Object) null);
        Character term50134 = new Character('s');
        Character term50136 = new Character('t');
        term50119 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50165 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term50119, term50119.getClass(), "delimiter", 'z');
        setField(term50119, term50119.getClass(), "quoteCharacter", term50121);
        setField(term50119, term50119.getClass(), "quoteMode", enum132);
        setField(term50119, term50119.getClass(), "commentMarker", term50134);
        setField(term50119, term50119.getClass(), "escapeCharacter", term50136);
        setBooleanField(term50119, term50119.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term50119, term50119.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term50119, term50119.getClass(), "ignoreEmptyLines", true);
        setField(term50119, term50119.getClass(), "recordSeparator", "WBAOTqErtm");
        setField(term50119, term50119.getClass(), "nullString", "PqtVXXZMqK");
        setElement(term50165, 0, "rYbtIDVdnd");
        setElement(term50165, 1, "UKAReurpHG");
        setElement(term50165, 2, "WVRMUmrljA");
        setElement(term50165, 3, "NTlKJDDWlk");
        setElement(term50165, 4, "vOuMEpOQAg");
        setElement(term50165, 5, "SIODFGaQhr");
        setElement(term50165, 6, "qYzsiuXOgS");
        setElement(term50165, 7, "bxrCBbrrct");
        setField(term50119, term50119.getClass(), "header", term50165);
        setBooleanField(term50119, term50119.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term13952;
        Object retValue = callMethod(klass, "withSkipHeaderRecord", argTypes, term13808, args);
        assertTrue(recursiveEquals(term13808, term50538));
        assertTrue(recursiveEquals(term13952, false));
        assertTrue(recursiveEquals(retValue, term50119));
    }

};


