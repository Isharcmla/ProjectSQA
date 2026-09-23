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

public class CSVFormat_withIgnoreHeaderCase_1929023860102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19220;
     Object term83751;
     Object term83544;

    public CSVFormat_withIgnoreHeaderCase_1929023860102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19222 = new Character('f');
        Class<? extends Object> term83793 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term83792 = ((Class) term83793).getDeclaredField((String) "NONE");
        ((Field) term83792).setAccessible(true);
        Object enum148 = ((Field) term83792).get((Object) null);
        Character term19232 = new Character('E');
        Character term19234 = new Character('R');
        term19220 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19263 = (Object[]) newArray("java.lang.String", 6);
        Object[] term19336 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term19220, term19220.getClass(), "delimiter", 'I');
        setField(term19220, term19220.getClass(), "quoteCharacter", term19222);
        setField(term19220, term19220.getClass(), "quoteMode", enum148);
        setField(term19220, term19220.getClass(), "commentMarker", term19232);
        setField(term19220, term19220.getClass(), "escapeCharacter", term19234);
        setBooleanField(term19220, term19220.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term19220, term19220.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term19220, term19220.getClass(), "ignoreEmptyLines", false);
        setField(term19220, term19220.getClass(), "recordSeparator", "vBnWPlsZMk");
        setField(term19220, term19220.getClass(), "nullString", "fIZsWucfXz");
        setElement(term19263, 0, "IApvtmfhnq");
        setElement(term19263, 1, "VSaNnhMpRc");
        setElement(term19263, 2, "QNjNTLlUaV");
        setElement(term19263, 3, "hIYsRyOZxk");
        setElement(term19263, 4, "RjNoEywJbC");
        setElement(term19263, 5, "RTTvrwwhou");
        setField(term19220, term19220.getClass(), "header", term19263);
        setElement(term19336, 0, "lRORwXipuk");
        setElement(term19336, 1, "fVdTcjgHdw");
        setElement(term19336, 2, "wwAwLLcLPp");
        setElement(term19336, 3, "nHpMKOmlpQ");
        setElement(term19336, 4, "fKhrQsJToZ");
        setElement(term19336, 5, "wsysQLGFnl");
        setElement(term19336, 6, "ckQLZGFjMX");
        setElement(term19336, 7, "qphdrqUtNx");
        setField(term19220, term19220.getClass(), "headerComments", term19336);
        setBooleanField(term19220, term19220.getClass(), "skipHeaderRecord", true);
        setBooleanField(term19220, term19220.getClass(), "ignoreHeaderCase", true);
        Character term83752 = new Character('f');
        Class<? extends Object> term84132 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term84131 = ((Class) term84132).getDeclaredField((String) "NONE");
        ((Field) term84131).setAccessible(true);
        Object enum149 = ((Field) term84131).get((Object) null);
        Character term83756 = new Character('E');
        Character term83757 = new Character('R');
        term83751 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term83762 = (Object[]) newArray("java.lang.String", 6);
        Object[] term83775 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term83751, term83751.getClass(), "delimiter", 'I');
        setField(term83751, term83751.getClass(), "quoteCharacter", term83752);
        setField(term83751, term83751.getClass(), "quoteMode", enum149);
        setField(term83751, term83751.getClass(), "commentMarker", term83756);
        setField(term83751, term83751.getClass(), "escapeCharacter", term83757);
        setBooleanField(term83751, term83751.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term83751, term83751.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term83751, term83751.getClass(), "ignoreEmptyLines", false);
        setField(term83751, term83751.getClass(), "recordSeparator", "vBnWPlsZMk");
        setField(term83751, term83751.getClass(), "nullString", "fIZsWucfXz");
        setElement(term83762, 0, "IApvtmfhnq");
        setElement(term83762, 1, "VSaNnhMpRc");
        setElement(term83762, 2, "QNjNTLlUaV");
        setElement(term83762, 3, "hIYsRyOZxk");
        setElement(term83762, 4, "RjNoEywJbC");
        setElement(term83762, 5, "RTTvrwwhou");
        setField(term83751, term83751.getClass(), "header", term83762);
        setElement(term83775, 0, "lRORwXipuk");
        setElement(term83775, 1, "fVdTcjgHdw");
        setElement(term83775, 2, "wwAwLLcLPp");
        setElement(term83775, 3, "nHpMKOmlpQ");
        setElement(term83775, 4, "fKhrQsJToZ");
        setElement(term83775, 5, "wsysQLGFnl");
        setElement(term83775, 6, "ckQLZGFjMX");
        setElement(term83775, 7, "qphdrqUtNx");
        setField(term83751, term83751.getClass(), "headerComments", term83775);
        setBooleanField(term83751, term83751.getClass(), "skipHeaderRecord", true);
        setBooleanField(term83751, term83751.getClass(), "ignoreHeaderCase", true);
        Character term83546 = new Character('f');
        Class<? extends Object> term84471 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term84470 = ((Class) term84471).getDeclaredField((String) "NONE");
        ((Field) term84470).setAccessible(true);
        Object enum150 = ((Field) term84470).get((Object) null);
        Character term83548 = new Character('E');
        Character term83550 = new Character('R');
        term83544 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term83579 = (Object[]) newArray("java.lang.String", 6);
        Object[] term83652 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term83544, term83544.getClass(), "delimiter", 'I');
        setField(term83544, term83544.getClass(), "quoteCharacter", term83546);
        setField(term83544, term83544.getClass(), "quoteMode", enum150);
        setField(term83544, term83544.getClass(), "commentMarker", term83548);
        setField(term83544, term83544.getClass(), "escapeCharacter", term83550);
        setBooleanField(term83544, term83544.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term83544, term83544.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term83544, term83544.getClass(), "ignoreEmptyLines", false);
        setField(term83544, term83544.getClass(), "recordSeparator", "vBnWPlsZMk");
        setField(term83544, term83544.getClass(), "nullString", "fIZsWucfXz");
        setElement(term83579, 0, "IApvtmfhnq");
        setElement(term83579, 1, "VSaNnhMpRc");
        setElement(term83579, 2, "QNjNTLlUaV");
        setElement(term83579, 3, "hIYsRyOZxk");
        setElement(term83579, 4, "RjNoEywJbC");
        setElement(term83579, 5, "RTTvrwwhou");
        setField(term83544, term83544.getClass(), "header", term83579);
        setElement(term83652, 0, "lRORwXipuk");
        setElement(term83652, 1, "fVdTcjgHdw");
        setElement(term83652, 2, "wwAwLLcLPp");
        setElement(term83652, 3, "nHpMKOmlpQ");
        setElement(term83652, 4, "fKhrQsJToZ");
        setElement(term83652, 5, "wsysQLGFnl");
        setElement(term83652, 6, "ckQLZGFjMX");
        setElement(term83652, 7, "qphdrqUtNx");
        setField(term83544, term83544.getClass(), "headerComments", term83652);
        setBooleanField(term83544, term83544.getClass(), "skipHeaderRecord", true);
        setBooleanField(term83544, term83544.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withIgnoreHeaderCase", argTypes, term19220, args);
        assertTrue(recursiveEquals(term19220, term83751));
        assertTrue(recursiveEquals(retValue, term83544));
    }

};


