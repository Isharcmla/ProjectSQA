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

public class CSVFormat_withCommentMarker_7283535988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12545;
     Object term12791;
     Object term62743;
     Object term62788;
     Object term61986;

    public CSVFormat_withCommentMarker_7283535988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12547 = new Character('T');
        Class<? extends Object> term62790 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term62789 = ((Class) term62790).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term62789).setAccessible(true);
        Object enum110 = ((Field) term62789).get((Object) null);
        Character term12564 = new Character('m');
        Character term12566 = new Character('J');
        term12545 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12595 = (Object[]) newArray("java.lang.String", 9);
        Object[] term12704 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term12545, term12545.getClass(), "delimiter", 'E');
        setField(term12545, term12545.getClass(), "quoteCharacter", term12547);
        setField(term12545, term12545.getClass(), "quoteMode", enum110);
        setField(term12545, term12545.getClass(), "commentMarker", term12564);
        setField(term12545, term12545.getClass(), "escapeCharacter", term12566);
        setBooleanField(term12545, term12545.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term12545, term12545.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term12545, term12545.getClass(), "ignoreEmptyLines", true);
        setField(term12545, term12545.getClass(), "recordSeparator", "yUGCjlqgJE");
        setField(term12545, term12545.getClass(), "nullString", "PXdVZyoJyC");
        setElement(term12595, 0, "vLerpqavFM");
        setElement(term12595, 1, "qnvxzwuGKX");
        setElement(term12595, 2, "EdPAvpluZg");
        setElement(term12595, 3, "DzHVBMqWtE");
        setElement(term12595, 4, "THZSpzBRYP");
        setElement(term12595, 5, "ZfBIVGBQOE");
        setElement(term12595, 6, "QSrDQfEsTR");
        setElement(term12595, 7, "PsqusYmejD");
        setElement(term12595, 8, "NTWMiBEaDF");
        setField(term12545, term12545.getClass(), "header", term12595);
        setElement(term12704, 0, "SPBstwKFVr");
        setElement(term12704, 1, "WxYUTuqmIq");
        setElement(term12704, 2, "OeQLvhVERT");
        setElement(term12704, 3, "IlvgFINwIa");
        setElement(term12704, 4, "GEJABPlHSI");
        setElement(term12704, 5, "aQFUvuaYxd");
        setElement(term12704, 6, "zNFLXMifnS");
        setField(term12545, term12545.getClass(), "headerComments", term12704);
        setBooleanField(term12545, term12545.getClass(), "skipHeaderRecord", false);
        setBooleanField(term12545, term12545.getClass(), "ignoreHeaderCase", false);
        term12791 = new Character('M');
        Character term62744 = new Character('T');
        Class<? extends Object> term63170 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term63169 = ((Class) term63170).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term63169).setAccessible(true);
        Object enum111 = ((Field) term63169).get((Object) null);
        Character term62748 = new Character('m');
        Character term62749 = new Character('J');
        term62743 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term62754 = (Object[]) newArray("java.lang.String", 9);
        Object[] term62773 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term62743, term62743.getClass(), "delimiter", 'E');
        setField(term62743, term62743.getClass(), "quoteCharacter", term62744);
        setField(term62743, term62743.getClass(), "quoteMode", enum111);
        setField(term62743, term62743.getClass(), "commentMarker", term62748);
        setField(term62743, term62743.getClass(), "escapeCharacter", term62749);
        setBooleanField(term62743, term62743.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term62743, term62743.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term62743, term62743.getClass(), "ignoreEmptyLines", true);
        setField(term62743, term62743.getClass(), "recordSeparator", "yUGCjlqgJE");
        setField(term62743, term62743.getClass(), "nullString", "PXdVZyoJyC");
        setElement(term62754, 0, "vLerpqavFM");
        setElement(term62754, 1, "qnvxzwuGKX");
        setElement(term62754, 2, "EdPAvpluZg");
        setElement(term62754, 3, "DzHVBMqWtE");
        setElement(term62754, 4, "THZSpzBRYP");
        setElement(term62754, 5, "ZfBIVGBQOE");
        setElement(term62754, 6, "QSrDQfEsTR");
        setElement(term62754, 7, "PsqusYmejD");
        setElement(term62754, 8, "NTWMiBEaDF");
        setField(term62743, term62743.getClass(), "header", term62754);
        setElement(term62773, 0, "SPBstwKFVr");
        setElement(term62773, 1, "WxYUTuqmIq");
        setElement(term62773, 2, "OeQLvhVERT");
        setElement(term62773, 3, "IlvgFINwIa");
        setElement(term62773, 4, "GEJABPlHSI");
        setElement(term62773, 5, "aQFUvuaYxd");
        setElement(term62773, 6, "zNFLXMifnS");
        setField(term62743, term62743.getClass(), "headerComments", term62773);
        setBooleanField(term62743, term62743.getClass(), "skipHeaderRecord", false);
        setBooleanField(term62743, term62743.getClass(), "ignoreHeaderCase", false);
        term62788 = new Character('M');
        Character term61988 = new Character('T');
        Class<? extends Object> term63550 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term63549 = ((Class) term63550).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term63549).setAccessible(true);
        Object enum112 = ((Field) term63549).get((Object) null);
        Character term62005 = new Character('M');
        Character term62007 = new Character('J');
        term61986 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term62036 = (Object[]) newArray("java.lang.String", 9);
        Object[] term62145 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term61986, term61986.getClass(), "delimiter", 'E');
        setField(term61986, term61986.getClass(), "quoteCharacter", term61988);
        setField(term61986, term61986.getClass(), "quoteMode", enum112);
        setField(term61986, term61986.getClass(), "commentMarker", term62005);
        setField(term61986, term61986.getClass(), "escapeCharacter", term62007);
        setBooleanField(term61986, term61986.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term61986, term61986.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term61986, term61986.getClass(), "ignoreEmptyLines", true);
        setField(term61986, term61986.getClass(), "recordSeparator", "yUGCjlqgJE");
        setField(term61986, term61986.getClass(), "nullString", "PXdVZyoJyC");
        setElement(term62036, 0, "vLerpqavFM");
        setElement(term62036, 1, "qnvxzwuGKX");
        setElement(term62036, 2, "EdPAvpluZg");
        setElement(term62036, 3, "DzHVBMqWtE");
        setElement(term62036, 4, "THZSpzBRYP");
        setElement(term62036, 5, "ZfBIVGBQOE");
        setElement(term62036, 6, "QSrDQfEsTR");
        setElement(term62036, 7, "PsqusYmejD");
        setElement(term62036, 8, "NTWMiBEaDF");
        setField(term61986, term61986.getClass(), "header", term62036);
        setElement(term62145, 0, "SPBstwKFVr");
        setElement(term62145, 1, "WxYUTuqmIq");
        setElement(term62145, 2, "OeQLvhVERT");
        setElement(term62145, 3, "IlvgFINwIa");
        setElement(term62145, 4, "GEJABPlHSI");
        setElement(term62145, 5, "aQFUvuaYxd");
        setElement(term62145, 6, "zNFLXMifnS");
        setField(term61986, term61986.getClass(), "headerComments", term62145);
        setBooleanField(term61986, term61986.getClass(), "skipHeaderRecord", false);
        setBooleanField(term61986, term61986.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term12791;
        Object retValue = callMethod(klass, "withCommentMarker", argTypes, term12545, args);
        assertTrue(recursiveEquals(term12545, term62743));
        assertTrue(recursiveEquals(term12791, term62788));
        assertTrue(recursiveEquals(retValue, term61986));
    }

};


