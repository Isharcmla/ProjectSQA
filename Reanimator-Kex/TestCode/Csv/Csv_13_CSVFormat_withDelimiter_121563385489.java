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

public class CSVFormat_withDelimiter_121563385489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13173;
     Object term13376;
     Object term64665;
     Object term64035;

    public CSVFormat_withDelimiter_121563385489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13175 = new Character('l');
        Class<? extends Object> term64705 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term64704 = ((Class) term64705).getDeclaredField((String) "NONE");
        ((Field) term64704).setAccessible(true);
        Object enum113 = ((Field) term64704).get((Object) null);
        Character term13185 = new Character('s');
        Character term13187 = new Character('z');
        term13173 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13216 = (Object[]) newArray("java.lang.String", 6);
        Object[] term13289 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term13173, term13173.getClass(), "delimiter", 'x');
        setField(term13173, term13173.getClass(), "quoteCharacter", term13175);
        setField(term13173, term13173.getClass(), "quoteMode", enum113);
        setField(term13173, term13173.getClass(), "commentMarker", term13185);
        setField(term13173, term13173.getClass(), "escapeCharacter", term13187);
        setBooleanField(term13173, term13173.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term13173, term13173.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term13173, term13173.getClass(), "ignoreEmptyLines", false);
        setField(term13173, term13173.getClass(), "recordSeparator", "HHQcYMSBVc");
        setField(term13173, term13173.getClass(), "nullString", "wdoqITnaAP");
        setElement(term13216, 0, "rIPMBcrNqB");
        setElement(term13216, 1, "UDaboHZHhz");
        setElement(term13216, 2, "nRvKihUSPj");
        setElement(term13216, 3, "BbNeQJpYPr");
        setElement(term13216, 4, "riMtzCoxNj");
        setElement(term13216, 5, "YAXkVjQZcV");
        setField(term13173, term13173.getClass(), "header", term13216);
        setElement(term13289, 0, "pumvwBWvpy");
        setElement(term13289, 1, "HwLHeGLyhe");
        setElement(term13289, 2, "RDnkgWkcbz");
        setElement(term13289, 3, "IBpaxltauX");
        setElement(term13289, 4, "hePqROaplw");
        setElement(term13289, 5, "PJcSNDruWd");
        setElement(term13289, 6, "VVNNlAePXF");
        setField(term13173, term13173.getClass(), "headerComments", term13289);
        setBooleanField(term13173, term13173.getClass(), "skipHeaderRecord", false);
        setBooleanField(term13173, term13173.getClass(), "ignoreHeaderCase", true);
        term13376 = new Character('Y');
        Character term64666 = new Character('l');
        Class<? extends Object> term65034 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term65033 = ((Class) term65034).getDeclaredField((String) "NONE");
        ((Field) term65033).setAccessible(true);
        Object enum114 = ((Field) term65033).get((Object) null);
        Character term64670 = new Character('s');
        Character term64671 = new Character('z');
        term64665 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term64676 = (Object[]) newArray("java.lang.String", 6);
        Object[] term64689 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term64665, term64665.getClass(), "delimiter", 'x');
        setField(term64665, term64665.getClass(), "quoteCharacter", term64666);
        setField(term64665, term64665.getClass(), "quoteMode", enum114);
        setField(term64665, term64665.getClass(), "commentMarker", term64670);
        setField(term64665, term64665.getClass(), "escapeCharacter", term64671);
        setBooleanField(term64665, term64665.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term64665, term64665.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term64665, term64665.getClass(), "ignoreEmptyLines", false);
        setField(term64665, term64665.getClass(), "recordSeparator", "HHQcYMSBVc");
        setField(term64665, term64665.getClass(), "nullString", "wdoqITnaAP");
        setElement(term64676, 0, "rIPMBcrNqB");
        setElement(term64676, 1, "UDaboHZHhz");
        setElement(term64676, 2, "nRvKihUSPj");
        setElement(term64676, 3, "BbNeQJpYPr");
        setElement(term64676, 4, "riMtzCoxNj");
        setElement(term64676, 5, "YAXkVjQZcV");
        setField(term64665, term64665.getClass(), "header", term64676);
        setElement(term64689, 0, "pumvwBWvpy");
        setElement(term64689, 1, "HwLHeGLyhe");
        setElement(term64689, 2, "RDnkgWkcbz");
        setElement(term64689, 3, "IBpaxltauX");
        setElement(term64689, 4, "hePqROaplw");
        setElement(term64689, 5, "PJcSNDruWd");
        setElement(term64689, 6, "VVNNlAePXF");
        setField(term64665, term64665.getClass(), "headerComments", term64689);
        setBooleanField(term64665, term64665.getClass(), "skipHeaderRecord", false);
        setBooleanField(term64665, term64665.getClass(), "ignoreHeaderCase", true);
        Character term64037 = new Character('l');
        Class<? extends Object> term65363 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term65362 = ((Class) term65363).getDeclaredField((String) "NONE");
        ((Field) term65362).setAccessible(true);
        Object enum115 = ((Field) term65362).get((Object) null);
        Character term64047 = new Character('s');
        Character term64049 = new Character('z');
        term64035 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term64078 = (Object[]) newArray("java.lang.String", 6);
        Object[] term64151 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term64035, term64035.getClass(), "delimiter", 'Y');
        setField(term64035, term64035.getClass(), "quoteCharacter", term64037);
        setField(term64035, term64035.getClass(), "quoteMode", enum115);
        setField(term64035, term64035.getClass(), "commentMarker", term64047);
        setField(term64035, term64035.getClass(), "escapeCharacter", term64049);
        setBooleanField(term64035, term64035.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term64035, term64035.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term64035, term64035.getClass(), "ignoreEmptyLines", false);
        setField(term64035, term64035.getClass(), "recordSeparator", "HHQcYMSBVc");
        setField(term64035, term64035.getClass(), "nullString", "wdoqITnaAP");
        setElement(term64078, 0, "rIPMBcrNqB");
        setElement(term64078, 1, "UDaboHZHhz");
        setElement(term64078, 2, "nRvKihUSPj");
        setElement(term64078, 3, "BbNeQJpYPr");
        setElement(term64078, 4, "riMtzCoxNj");
        setElement(term64078, 5, "YAXkVjQZcV");
        setField(term64035, term64035.getClass(), "header", term64078);
        setElement(term64151, 0, "pumvwBWvpy");
        setElement(term64151, 1, "HwLHeGLyhe");
        setElement(term64151, 2, "RDnkgWkcbz");
        setElement(term64151, 3, "IBpaxltauX");
        setElement(term64151, 4, "hePqROaplw");
        setElement(term64151, 5, "PJcSNDruWd");
        setElement(term64151, 6, "VVNNlAePXF");
        setField(term64035, term64035.getClass(), "headerComments", term64151);
        setBooleanField(term64035, term64035.getClass(), "skipHeaderRecord", false);
        setBooleanField(term64035, term64035.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term13376;
        Object retValue = callMethod(klass, "withDelimiter", argTypes, term13173, args);
        assertTrue(recursiveEquals(term13173, term64665));
        assertTrue(recursiveEquals(term13376, 'Y'));
        assertTrue(recursiveEquals(retValue, term64035));
    }

};


