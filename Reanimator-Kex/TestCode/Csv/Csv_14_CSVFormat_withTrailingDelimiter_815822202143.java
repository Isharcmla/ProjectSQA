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
import java.lang.Boolean;

public class CSVFormat_withTrailingDelimiter_815822202143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30106;
     Object term30239;
     Object term113395;
     Object term112982;

    public CSVFormat_withTrailingDelimiter_815822202143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30108 = new Character('Y');
        Character term30111 = new Character('k');
        Character term30214 = new Character('c');
        Class<? extends Object> term113503 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term113502 = ((Class) term113503).getDeclaredField((String) "NONE");
        ((Field) term113502).setAccessible(true);
        Object enum231 = ((Field) term113502).get((Object) null);
        term30106 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30113 = (Object[]) newArray("java.lang.String", 2);
        Object[] term30138 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term30106, term30106.getClass(), "allowMissingColumnNames", true);
        setField(term30106, term30106.getClass(), "commentMarker", term30108);
        setCharField(term30106, term30106.getClass(), "delimiter", 'P');
        setField(term30106, term30106.getClass(), "escapeCharacter", term30111);
        setElement(term30113, 0, "SvGTualQPa");
        setElement(term30113, 1, "mdxcgZwsaP");
        setField(term30106, term30106.getClass(), "header", term30113);
        setElement(term30138, 0, "XildIRoZHG");
        setElement(term30138, 1, "lEcrFlxJXH");
        setElement(term30138, 2, "VNdDwXMYxR");
        setElement(term30138, 3, "bVbexZPmwW");
        setElement(term30138, 4, "tvxYdqiyGc");
        setField(term30106, term30106.getClass(), "headerComments", term30138);
        setBooleanField(term30106, term30106.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term30106, term30106.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term30106, term30106.getClass(), "ignoreSurroundingSpaces", false);
        setField(term30106, term30106.getClass(), "nullString", "ZEXFoMSKeG");
        setField(term30106, term30106.getClass(), "quoteCharacter", term30214);
        setField(term30106, term30106.getClass(), "quoteMode", enum231);
        setField(term30106, term30106.getClass(), "recordSeparator", "HvxahUfZcJ");
        setBooleanField(term30106, term30106.getClass(), "skipHeaderRecord", false);
        setBooleanField(term30106, term30106.getClass(), "trailingDelimiter", true);
        setBooleanField(term30106, term30106.getClass(), "trim", true);
        term30239 = new Boolean(true);
        Character term113396 = new Character('Y');
        Character term113397 = new Character('k');
        Character term113416 = new Character('c');
        Class<? extends Object> term113772 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term113771 = ((Class) term113772).getDeclaredField((String) "NONE");
        ((Field) term113771).setAccessible(true);
        Object enum232 = ((Field) term113771).get((Object) null);
        term113395 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term113398 = (Object[]) newArray("java.lang.String", 2);
        Object[] term113403 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term113395, term113395.getClass(), "allowMissingColumnNames", true);
        setField(term113395, term113395.getClass(), "commentMarker", term113396);
        setCharField(term113395, term113395.getClass(), "delimiter", 'P');
        setField(term113395, term113395.getClass(), "escapeCharacter", term113397);
        setElement(term113398, 0, "SvGTualQPa");
        setElement(term113398, 1, "mdxcgZwsaP");
        setField(term113395, term113395.getClass(), "header", term113398);
        setElement(term113403, 0, "XildIRoZHG");
        setElement(term113403, 1, "lEcrFlxJXH");
        setElement(term113403, 2, "VNdDwXMYxR");
        setElement(term113403, 3, "bVbexZPmwW");
        setElement(term113403, 4, "tvxYdqiyGc");
        setField(term113395, term113395.getClass(), "headerComments", term113403);
        setBooleanField(term113395, term113395.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term113395, term113395.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term113395, term113395.getClass(), "ignoreSurroundingSpaces", false);
        setField(term113395, term113395.getClass(), "nullString", "ZEXFoMSKeG");
        setField(term113395, term113395.getClass(), "quoteCharacter", term113416);
        setField(term113395, term113395.getClass(), "quoteMode", enum232);
        setField(term113395, term113395.getClass(), "recordSeparator", "HvxahUfZcJ");
        setBooleanField(term113395, term113395.getClass(), "skipHeaderRecord", false);
        setBooleanField(term113395, term113395.getClass(), "trailingDelimiter", true);
        setBooleanField(term113395, term113395.getClass(), "trim", true);
        Character term112984 = new Character('Y');
        Character term112987 = new Character('k');
        Character term113090 = new Character('c');
        Class<? extends Object> term114041 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term114040 = ((Class) term114041).getDeclaredField((String) "NONE");
        ((Field) term114040).setAccessible(true);
        Object enum233 = ((Field) term114040).get((Object) null);
        term112982 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term112989 = (Object[]) newArray("java.lang.String", 2);
        Object[] term113014 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term112982, term112982.getClass(), "allowMissingColumnNames", true);
        setField(term112982, term112982.getClass(), "commentMarker", term112984);
        setCharField(term112982, term112982.getClass(), "delimiter", 'P');
        setField(term112982, term112982.getClass(), "escapeCharacter", term112987);
        setElement(term112989, 0, "SvGTualQPa");
        setElement(term112989, 1, "mdxcgZwsaP");
        setField(term112982, term112982.getClass(), "header", term112989);
        setElement(term113014, 0, "XildIRoZHG");
        setElement(term113014, 1, "lEcrFlxJXH");
        setElement(term113014, 2, "VNdDwXMYxR");
        setElement(term113014, 3, "bVbexZPmwW");
        setElement(term113014, 4, "tvxYdqiyGc");
        setField(term112982, term112982.getClass(), "headerComments", term113014);
        setBooleanField(term112982, term112982.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term112982, term112982.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term112982, term112982.getClass(), "ignoreSurroundingSpaces", false);
        setField(term112982, term112982.getClass(), "nullString", "ZEXFoMSKeG");
        setField(term112982, term112982.getClass(), "quoteCharacter", term113090);
        setField(term112982, term112982.getClass(), "quoteMode", enum233);
        setField(term112982, term112982.getClass(), "recordSeparator", "HvxahUfZcJ");
        setBooleanField(term112982, term112982.getClass(), "skipHeaderRecord", false);
        setBooleanField(term112982, term112982.getClass(), "trailingDelimiter", true);
        setBooleanField(term112982, term112982.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30239;
        Object retValue = callMethod(klass, "withTrailingDelimiter", argTypes, term30106, args);
        assertTrue(recursiveEquals(term30106, term113395));
        assertTrue(recursiveEquals(term30239, true));
        assertTrue(recursiveEquals(retValue, term112982));
    }

};


