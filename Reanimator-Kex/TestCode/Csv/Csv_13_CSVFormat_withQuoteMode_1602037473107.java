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

public class CSVFormat_withQuoteMode_1602037473107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21656;
     Object enum164;
     Object term91631;
     Object enum166;
     Object term91176;

    public CSVFormat_withQuoteMode_1602037473107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21658 = new Character('c');
        Class<? extends Object> term91664 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term91663 = ((Class) term91664).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term91663).setAccessible(true);
        Object enum163 = ((Field) term91663).get((Object) null);
        Character term21675 = new Character('h');
        Character term21677 = new Character('N');
        term21656 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21706 = (Object[]) newArray("java.lang.String", 5);
        Object[] term21767 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term21656, term21656.getClass(), "delimiter", 'Y');
        setField(term21656, term21656.getClass(), "quoteCharacter", term21658);
        setField(term21656, term21656.getClass(), "quoteMode", enum163);
        setField(term21656, term21656.getClass(), "commentMarker", term21675);
        setField(term21656, term21656.getClass(), "escapeCharacter", term21677);
        setBooleanField(term21656, term21656.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term21656, term21656.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term21656, term21656.getClass(), "ignoreEmptyLines", true);
        setField(term21656, term21656.getClass(), "recordSeparator", "xeyjTOCOJb");
        setField(term21656, term21656.getClass(), "nullString", "DGRqjjdhzy");
        setElement(term21706, 0, "lQFkjJUPAR");
        setElement(term21706, 1, "BsuVlGUUjV");
        setElement(term21706, 2, "bHHjfDCntT");
        setElement(term21706, 3, "sEphiduvkv");
        setElement(term21706, 4, "PbLgCSAHce");
        setField(term21656, term21656.getClass(), "header", term21706);
        setElement(term21767, 0, "NWldOLAbqk");
        setElement(term21767, 1, "qnYaYSpDwO");
        setElement(term21767, 2, "dgbFDCdHtj");
        setField(term21656, term21656.getClass(), "headerComments", term21767);
        setBooleanField(term21656, term21656.getClass(), "skipHeaderRecord", false);
        setBooleanField(term21656, term21656.getClass(), "ignoreHeaderCase", false);
        Class<? extends Object> term91964 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term91963 = ((Class) term91964).getDeclaredField((String) "ALL");
        ((Field) term91963).setAccessible(true);
        enum164 = ((Field) term91963).get((Object) null);
        Character term91632 = new Character('c');
        Class<? extends Object> term92140 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92139 = ((Class) term92140).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term92139).setAccessible(true);
        Object enum165 = ((Field) term92139).get((Object) null);
        Character term91636 = new Character('h');
        Character term91637 = new Character('N');
        term91631 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term91642 = (Object[]) newArray("java.lang.String", 5);
        Object[] term91653 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term91631, term91631.getClass(), "delimiter", 'Y');
        setField(term91631, term91631.getClass(), "quoteCharacter", term91632);
        setField(term91631, term91631.getClass(), "quoteMode", enum165);
        setField(term91631, term91631.getClass(), "commentMarker", term91636);
        setField(term91631, term91631.getClass(), "escapeCharacter", term91637);
        setBooleanField(term91631, term91631.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term91631, term91631.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term91631, term91631.getClass(), "ignoreEmptyLines", true);
        setField(term91631, term91631.getClass(), "recordSeparator", "xeyjTOCOJb");
        setField(term91631, term91631.getClass(), "nullString", "DGRqjjdhzy");
        setElement(term91642, 0, "lQFkjJUPAR");
        setElement(term91642, 1, "BsuVlGUUjV");
        setElement(term91642, 2, "bHHjfDCntT");
        setElement(term91642, 3, "sEphiduvkv");
        setElement(term91642, 4, "PbLgCSAHce");
        setField(term91631, term91631.getClass(), "header", term91642);
        setElement(term91653, 0, "NWldOLAbqk");
        setElement(term91653, 1, "qnYaYSpDwO");
        setElement(term91653, 2, "dgbFDCdHtj");
        setField(term91631, term91631.getClass(), "headerComments", term91653);
        setBooleanField(term91631, term91631.getClass(), "skipHeaderRecord", false);
        setBooleanField(term91631, term91631.getClass(), "ignoreHeaderCase", false);
        Class<? extends Object> term92440 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92439 = ((Class) term92440).getDeclaredField((String) "ALL");
        ((Field) term92439).setAccessible(true);
        enum166 = ((Field) term92439).get((Object) null);
        Character term91178 = new Character('c');
        Class<? extends Object> term92616 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92615 = ((Class) term92616).getDeclaredField((String) "ALL");
        ((Field) term92615).setAccessible(true);
        Object enum167 = ((Field) term92615).get((Object) null);
        Character term91187 = new Character('h');
        Character term91189 = new Character('N');
        term91176 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term91218 = (Object[]) newArray("java.lang.String", 5);
        Object[] term91279 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term91176, term91176.getClass(), "delimiter", 'Y');
        setField(term91176, term91176.getClass(), "quoteCharacter", term91178);
        setField(term91176, term91176.getClass(), "quoteMode", enum167);
        setField(term91176, term91176.getClass(), "commentMarker", term91187);
        setField(term91176, term91176.getClass(), "escapeCharacter", term91189);
        setBooleanField(term91176, term91176.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term91176, term91176.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term91176, term91176.getClass(), "ignoreEmptyLines", true);
        setField(term91176, term91176.getClass(), "recordSeparator", "xeyjTOCOJb");
        setField(term91176, term91176.getClass(), "nullString", "DGRqjjdhzy");
        setElement(term91218, 0, "lQFkjJUPAR");
        setElement(term91218, 1, "BsuVlGUUjV");
        setElement(term91218, 2, "bHHjfDCntT");
        setElement(term91218, 3, "sEphiduvkv");
        setElement(term91218, 4, "PbLgCSAHce");
        setField(term91176, term91176.getClass(), "header", term91218);
        setElement(term91279, 0, "NWldOLAbqk");
        setElement(term91279, 1, "qnYaYSpDwO");
        setElement(term91279, 2, "dgbFDCdHtj");
        setField(term91176, term91176.getClass(), "headerComments", term91279);
        setBooleanField(term91176, term91176.getClass(), "skipHeaderRecord", false);
        setBooleanField(term91176, term91176.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.QuoteMode");
        Object[] args = new Object[1];
        args[0] = enum164;
        Object retValue = callMethod(klass, "withQuoteMode", argTypes, term21656, args);
        assertTrue(recursiveEquals(term21656, term91631));
        assertTrue(recursiveEquals(enum164, enum166));
        assertTrue(recursiveEquals(retValue, term91176));
    }

};


