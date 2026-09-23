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

public class CSVFormat_isQuoteCharacterSet_196898539582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9825;
     Object term56754;

    public CSVFormat_isQuoteCharacterSet_196898539582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9827 = new Character('F');
        Class<? extends Object> term56797 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term56796 = ((Class) term56797).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term56796).setAccessible(true);
        Object enum99 = ((Field) term56796).get((Object) null);
        Character term9844 = new Character('I');
        Character term9846 = new Character('s');
        term9825 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9875 = (Object[]) newArray("java.lang.String", 6);
        Object[] term9948 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term9825, term9825.getClass(), "delimiter", 'M');
        setField(term9825, term9825.getClass(), "quoteCharacter", term9827);
        setField(term9825, term9825.getClass(), "quoteMode", enum99);
        setField(term9825, term9825.getClass(), "commentMarker", term9844);
        setField(term9825, term9825.getClass(), "escapeCharacter", term9846);
        setBooleanField(term9825, term9825.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9825, term9825.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term9825, term9825.getClass(), "ignoreEmptyLines", true);
        setField(term9825, term9825.getClass(), "recordSeparator", "xvkbvaEGYd");
        setField(term9825, term9825.getClass(), "nullString", "HBGNxdNURv");
        setElement(term9875, 0, "mfCpTPPQQm");
        setElement(term9875, 1, "OcJCIDNIXA");
        setElement(term9875, 2, "XfRABIFVEp");
        setElement(term9875, 3, "MHGKyEnwKc");
        setElement(term9875, 4, "ShIELyuULw");
        setElement(term9875, 5, "IpQuOGMgmj");
        setField(term9825, term9825.getClass(), "header", term9875);
        setElement(term9948, 0, "pJbnHTYrxn");
        setElement(term9948, 1, "iIRsCSYqXH");
        setElement(term9948, 2, "nghfqDXyCG");
        setElement(term9948, 3, "WBAOTqErtm");
        setElement(term9948, 4, "PqtVXXZMqK");
        setElement(term9948, 5, "rYbtIDVdnd");
        setElement(term9948, 6, "UKAReurpHG");
        setElement(term9948, 7, "WVRMUmrljA");
        setField(term9825, term9825.getClass(), "headerComments", term9948);
        setBooleanField(term9825, term9825.getClass(), "skipHeaderRecord", false);
        setBooleanField(term9825, term9825.getClass(), "ignoreHeaderCase", false);
        Character term56755 = new Character('F');
        Class<? extends Object> term57157 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57156 = ((Class) term57157).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term57156).setAccessible(true);
        Object enum100 = ((Field) term57156).get((Object) null);
        Character term56759 = new Character('I');
        Character term56760 = new Character('s');
        term56754 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term56765 = (Object[]) newArray("java.lang.String", 6);
        Object[] term56778 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term56754, term56754.getClass(), "delimiter", 'M');
        setField(term56754, term56754.getClass(), "quoteCharacter", term56755);
        setField(term56754, term56754.getClass(), "quoteMode", enum100);
        setField(term56754, term56754.getClass(), "commentMarker", term56759);
        setField(term56754, term56754.getClass(), "escapeCharacter", term56760);
        setBooleanField(term56754, term56754.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term56754, term56754.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term56754, term56754.getClass(), "ignoreEmptyLines", true);
        setField(term56754, term56754.getClass(), "recordSeparator", "xvkbvaEGYd");
        setField(term56754, term56754.getClass(), "nullString", "HBGNxdNURv");
        setElement(term56765, 0, "mfCpTPPQQm");
        setElement(term56765, 1, "OcJCIDNIXA");
        setElement(term56765, 2, "XfRABIFVEp");
        setElement(term56765, 3, "MHGKyEnwKc");
        setElement(term56765, 4, "ShIELyuULw");
        setElement(term56765, 5, "IpQuOGMgmj");
        setField(term56754, term56754.getClass(), "header", term56765);
        setElement(term56778, 0, "pJbnHTYrxn");
        setElement(term56778, 1, "iIRsCSYqXH");
        setElement(term56778, 2, "nghfqDXyCG");
        setElement(term56778, 3, "WBAOTqErtm");
        setElement(term56778, 4, "PqtVXXZMqK");
        setElement(term56778, 5, "rYbtIDVdnd");
        setElement(term56778, 6, "UKAReurpHG");
        setElement(term56778, 7, "WVRMUmrljA");
        setField(term56754, term56754.getClass(), "headerComments", term56778);
        setBooleanField(term56754, term56754.getClass(), "skipHeaderRecord", false);
        setBooleanField(term56754, term56754.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isQuoteCharacterSet", argTypes, term9825, args);
        assertTrue(recursiveEquals(term9825, term56754));
        assertTrue(recursiveEquals(retValue, true));
    }

};


