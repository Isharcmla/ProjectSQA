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

public class CSVFormat_withCommentStart_108143962665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7069;
     Object term7156;
     Object term28841;
     Object term28768;

    public CSVFormat_withCommentStart_108143962665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7071 = new Character('F');
        Class<? extends Object> term28860 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term28859 = ((Class) term28860).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term28859).setAccessible(true);
        Object enum83 = ((Field) term28859).get((Object) null);
        Character term7088 = new Character('I');
        Character term7090 = new Character('s');
        term7069 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7118 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term7069, term7069.getClass(), "delimiter", 'M');
        setField(term7069, term7069.getClass(), "quoteChar", term7071);
        setField(term7069, term7069.getClass(), "quotePolicy", enum83);
        setField(term7069, term7069.getClass(), "commentStart", term7088);
        setField(term7069, term7069.getClass(), "escape", term7090);
        setBooleanField(term7069, term7069.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term7069, term7069.getClass(), "ignoreEmptyLines", true);
        setField(term7069, term7069.getClass(), "recordSeparator", "SdCKLMIYnX");
        setField(term7069, term7069.getClass(), "nullString", "OJJtVNPyKZ");
        setElement(term7118, 0, "AKNapTAfmD");
        setElement(term7118, 1, "xJgPlLxpgC");
        setElement(term7118, 2, "EYtfuJaxiM");
        setField(term7069, term7069.getClass(), "header", term7118);
        setBooleanField(term7069, term7069.getClass(), "skipHeaderRecord", true);
        term7156 = new Character('Y');
        Character term28842 = new Character('F');
        Class<? extends Object> term29090 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term29089 = ((Class) term29090).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29089).setAccessible(true);
        Object enum84 = ((Field) term29089).get((Object) null);
        Character term28846 = new Character('I');
        Character term28847 = new Character('s');
        term28841 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28852 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term28841, term28841.getClass(), "delimiter", 'M');
        setField(term28841, term28841.getClass(), "quoteChar", term28842);
        setField(term28841, term28841.getClass(), "quotePolicy", enum84);
        setField(term28841, term28841.getClass(), "commentStart", term28846);
        setField(term28841, term28841.getClass(), "escape", term28847);
        setBooleanField(term28841, term28841.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term28841, term28841.getClass(), "ignoreEmptyLines", true);
        setField(term28841, term28841.getClass(), "recordSeparator", "SdCKLMIYnX");
        setField(term28841, term28841.getClass(), "nullString", "OJJtVNPyKZ");
        setElement(term28852, 0, "AKNapTAfmD");
        setElement(term28852, 1, "xJgPlLxpgC");
        setElement(term28852, 2, "EYtfuJaxiM");
        setField(term28841, term28841.getClass(), "header", term28852);
        setBooleanField(term28841, term28841.getClass(), "skipHeaderRecord", true);
        Character term28770 = new Character('F');
        Class<? extends Object> term29320 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term29319 = ((Class) term29320).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29319).setAccessible(true);
        Object enum85 = ((Field) term29319).get((Object) null);
        Character term28772 = new Character('Y');
        Character term28774 = new Character('s');
        term28768 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28802 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term28768, term28768.getClass(), "delimiter", 'M');
        setField(term28768, term28768.getClass(), "quoteChar", term28770);
        setField(term28768, term28768.getClass(), "quotePolicy", enum85);
        setField(term28768, term28768.getClass(), "commentStart", term28772);
        setField(term28768, term28768.getClass(), "escape", term28774);
        setBooleanField(term28768, term28768.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term28768, term28768.getClass(), "ignoreEmptyLines", true);
        setField(term28768, term28768.getClass(), "recordSeparator", "SdCKLMIYnX");
        setField(term28768, term28768.getClass(), "nullString", "OJJtVNPyKZ");
        setElement(term28802, 0, "AKNapTAfmD");
        setElement(term28802, 1, "xJgPlLxpgC");
        setElement(term28802, 2, "EYtfuJaxiM");
        setField(term28768, term28768.getClass(), "header", term28802);
        setBooleanField(term28768, term28768.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term7156;
        Object retValue = callMethod(klass, "withCommentStart", argTypes, term7069, args);
        assertTrue(recursiveEquals(term7069, term28841));
        assertTrue(recursiveEquals(term7156, 'Y'));
        assertTrue(recursiveEquals(retValue, term28768));
    }

};


