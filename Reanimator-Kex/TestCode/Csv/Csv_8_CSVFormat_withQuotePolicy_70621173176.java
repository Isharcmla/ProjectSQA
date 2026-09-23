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

public class CSVFormat_withQuotePolicy_70621173176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10817;
     Object enum117;
     Object term40223;
     Object enum119;
     Object term39918;

    public CSVFormat_withQuotePolicy_70621173176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10819 = new Character('I');
        Class<? extends Object> term40249 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term40248 = ((Class) term40249).getDeclaredField((String) "NONE");
        ((Field) term40248).setAccessible(true);
        Object enum116 = ((Field) term40248).get((Object) null);
        Character term10829 = new Character('n');
        Character term10831 = new Character('Y');
        term10817 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10859 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term10817, term10817.getClass(), "delimiter", 'c');
        setField(term10817, term10817.getClass(), "quoteChar", term10819);
        setField(term10817, term10817.getClass(), "quotePolicy", enum116);
        setField(term10817, term10817.getClass(), "commentStart", term10829);
        setField(term10817, term10817.getClass(), "escape", term10831);
        setBooleanField(term10817, term10817.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term10817, term10817.getClass(), "ignoreEmptyLines", false);
        setField(term10817, term10817.getClass(), "recordSeparator", "vGiuZVPJNH");
        setField(term10817, term10817.getClass(), "nullString", "tlzpzIjMib");
        setElement(term10859, 0, "AZdLeSugwv");
        setElement(term10859, 1, "RMsXuyzKJV");
        setElement(term10859, 2, "FwPbDZcHmB");
        setElement(term10859, 3, "hOncybyCAH");
        setElement(term10859, 4, "QduALnDSVo");
        setField(term10817, term10817.getClass(), "header", term10859);
        setBooleanField(term10817, term10817.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term40478 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term40477 = ((Class) term40478).getDeclaredField((String) "MINIMAL");
        ((Field) term40477).setAccessible(true);
        enum117 = ((Field) term40477).get((Object) null);
        Character term40224 = new Character('I');
        Class<? extends Object> term40646 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term40645 = ((Class) term40646).getDeclaredField((String) "NONE");
        ((Field) term40645).setAccessible(true);
        Object enum118 = ((Field) term40645).get((Object) null);
        Character term40228 = new Character('n');
        Character term40229 = new Character('Y');
        term40223 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term40234 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term40223, term40223.getClass(), "delimiter", 'c');
        setField(term40223, term40223.getClass(), "quoteChar", term40224);
        setField(term40223, term40223.getClass(), "quotePolicy", enum118);
        setField(term40223, term40223.getClass(), "commentStart", term40228);
        setField(term40223, term40223.getClass(), "escape", term40229);
        setBooleanField(term40223, term40223.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term40223, term40223.getClass(), "ignoreEmptyLines", false);
        setField(term40223, term40223.getClass(), "recordSeparator", "vGiuZVPJNH");
        setField(term40223, term40223.getClass(), "nullString", "tlzpzIjMib");
        setElement(term40234, 0, "AZdLeSugwv");
        setElement(term40234, 1, "RMsXuyzKJV");
        setElement(term40234, 2, "FwPbDZcHmB");
        setElement(term40234, 3, "hOncybyCAH");
        setElement(term40234, 4, "QduALnDSVo");
        setField(term40223, term40223.getClass(), "header", term40234);
        setBooleanField(term40223, term40223.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term40875 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term40874 = ((Class) term40875).getDeclaredField((String) "MINIMAL");
        ((Field) term40874).setAccessible(true);
        enum119 = ((Field) term40874).get((Object) null);
        Character term39920 = new Character('I');
        Class<? extends Object> term41043 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term41042 = ((Class) term41043).getDeclaredField((String) "MINIMAL");
        ((Field) term41042).setAccessible(true);
        Object enum120 = ((Field) term41042).get((Object) null);
        Character term39933 = new Character('n');
        Character term39935 = new Character('Y');
        term39918 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term39963 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term39918, term39918.getClass(), "delimiter", 'c');
        setField(term39918, term39918.getClass(), "quoteChar", term39920);
        setField(term39918, term39918.getClass(), "quotePolicy", enum120);
        setField(term39918, term39918.getClass(), "commentStart", term39933);
        setField(term39918, term39918.getClass(), "escape", term39935);
        setBooleanField(term39918, term39918.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term39918, term39918.getClass(), "ignoreEmptyLines", false);
        setField(term39918, term39918.getClass(), "recordSeparator", "vGiuZVPJNH");
        setField(term39918, term39918.getClass(), "nullString", "tlzpzIjMib");
        setElement(term39963, 0, "AZdLeSugwv");
        setElement(term39963, 1, "RMsXuyzKJV");
        setElement(term39963, 2, "FwPbDZcHmB");
        setElement(term39963, 3, "hOncybyCAH");
        setElement(term39963, 4, "QduALnDSVo");
        setField(term39918, term39918.getClass(), "header", term39963);
        setBooleanField(term39918, term39918.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.Quote");
        Object[] args = new Object[1];
        args[0] = enum117;
        Object retValue = callMethod(klass, "withQuotePolicy", argTypes, term10817, args);
        assertTrue(recursiveEquals(term10817, term40223));
        assertTrue(recursiveEquals(enum117, enum119));
        assertTrue(recursiveEquals(retValue, term39918));
    }

};


