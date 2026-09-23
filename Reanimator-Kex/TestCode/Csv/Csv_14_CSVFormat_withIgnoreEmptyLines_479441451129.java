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

public class CSVFormat_withIgnoreEmptyLines_479441451129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23857;
     Object term23961;
     Object term92709;
     Object term92390;

    public CSVFormat_withIgnoreEmptyLines_479441451129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23859 = new Character('p');
        Character term23862 = new Character('b');
        Character term23929 = new Character('U');
        Class<? extends Object> term92781 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92780 = ((Class) term92781).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term92780).setAccessible(true);
        Object enum187 = ((Field) term92780).get((Object) null);
        term23857 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23864 = (Object[]) newArray("java.lang.String", 2);
        Object[] term23889 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term23857, term23857.getClass(), "allowMissingColumnNames", true);
        setField(term23857, term23857.getClass(), "commentMarker", term23859);
        setCharField(term23857, term23857.getClass(), "delimiter", 'y');
        setField(term23857, term23857.getClass(), "escapeCharacter", term23862);
        setElement(term23864, 0, "FftYCNbnks");
        setElement(term23864, 1, "lJoltmsadS");
        setField(term23857, term23857.getClass(), "header", term23864);
        setElement(term23889, 0, "mvfDtZNEHr");
        setElement(term23889, 1, "bvSgmFUDOU");
        setField(term23857, term23857.getClass(), "headerComments", term23889);
        setBooleanField(term23857, term23857.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term23857, term23857.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term23857, term23857.getClass(), "ignoreSurroundingSpaces", false);
        setField(term23857, term23857.getClass(), "nullString", "XMHwbfiHRl");
        setField(term23857, term23857.getClass(), "quoteCharacter", term23929);
        setField(term23857, term23857.getClass(), "quoteMode", enum187);
        setField(term23857, term23857.getClass(), "recordSeparator", "bucTnYicnp");
        setBooleanField(term23857, term23857.getClass(), "skipHeaderRecord", false);
        setBooleanField(term23857, term23857.getClass(), "trailingDelimiter", true);
        setBooleanField(term23857, term23857.getClass(), "trim", false);
        term23961 = new Boolean(false);
        Character term92710 = new Character('p');
        Character term92711 = new Character('b');
        Character term92724 = new Character('U');
        Class<? extends Object> term93041 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term93040 = ((Class) term93041).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term93040).setAccessible(true);
        Object enum188 = ((Field) term93040).get((Object) null);
        term92709 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term92712 = (Object[]) newArray("java.lang.String", 2);
        Object[] term92717 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term92709, term92709.getClass(), "allowMissingColumnNames", true);
        setField(term92709, term92709.getClass(), "commentMarker", term92710);
        setCharField(term92709, term92709.getClass(), "delimiter", 'y');
        setField(term92709, term92709.getClass(), "escapeCharacter", term92711);
        setElement(term92712, 0, "FftYCNbnks");
        setElement(term92712, 1, "lJoltmsadS");
        setField(term92709, term92709.getClass(), "header", term92712);
        setElement(term92717, 0, "mvfDtZNEHr");
        setElement(term92717, 1, "bvSgmFUDOU");
        setField(term92709, term92709.getClass(), "headerComments", term92717);
        setBooleanField(term92709, term92709.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term92709, term92709.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term92709, term92709.getClass(), "ignoreSurroundingSpaces", false);
        setField(term92709, term92709.getClass(), "nullString", "XMHwbfiHRl");
        setField(term92709, term92709.getClass(), "quoteCharacter", term92724);
        setField(term92709, term92709.getClass(), "quoteMode", enum188);
        setField(term92709, term92709.getClass(), "recordSeparator", "bucTnYicnp");
        setBooleanField(term92709, term92709.getClass(), "skipHeaderRecord", false);
        setBooleanField(term92709, term92709.getClass(), "trailingDelimiter", true);
        setBooleanField(term92709, term92709.getClass(), "trim", false);
        Character term92392 = new Character('p');
        Character term92395 = new Character('b');
        Character term92462 = new Character('U');
        Class<? extends Object> term93301 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term93300 = ((Class) term93301).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term93300).setAccessible(true);
        Object enum189 = ((Field) term93300).get((Object) null);
        term92390 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term92397 = (Object[]) newArray("java.lang.String", 2);
        Object[] term92422 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term92390, term92390.getClass(), "allowMissingColumnNames", true);
        setField(term92390, term92390.getClass(), "commentMarker", term92392);
        setCharField(term92390, term92390.getClass(), "delimiter", 'y');
        setField(term92390, term92390.getClass(), "escapeCharacter", term92395);
        setElement(term92397, 0, "FftYCNbnks");
        setElement(term92397, 1, "lJoltmsadS");
        setField(term92390, term92390.getClass(), "header", term92397);
        setElement(term92422, 0, "mvfDtZNEHr");
        setElement(term92422, 1, "bvSgmFUDOU");
        setField(term92390, term92390.getClass(), "headerComments", term92422);
        setBooleanField(term92390, term92390.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term92390, term92390.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term92390, term92390.getClass(), "ignoreSurroundingSpaces", false);
        setField(term92390, term92390.getClass(), "nullString", "XMHwbfiHRl");
        setField(term92390, term92390.getClass(), "quoteCharacter", term92462);
        setField(term92390, term92390.getClass(), "quoteMode", enum189);
        setField(term92390, term92390.getClass(), "recordSeparator", "bucTnYicnp");
        setBooleanField(term92390, term92390.getClass(), "skipHeaderRecord", false);
        setBooleanField(term92390, term92390.getClass(), "trailingDelimiter", true);
        setBooleanField(term92390, term92390.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23961;
        Object retValue = callMethod(klass, "withIgnoreEmptyLines", argTypes, term23857, args);
        assertTrue(recursiveEquals(term23857, term92709));
        assertTrue(recursiveEquals(term23961, false));
        assertTrue(recursiveEquals(retValue, term92390));
    }

};


