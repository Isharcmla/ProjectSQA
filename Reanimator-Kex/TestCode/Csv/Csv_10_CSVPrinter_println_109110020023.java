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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_println_109110020023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2659;

    public CSVPrinter_println_109110020023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2662 = new Character('l');
        Class<? extends Object> term10204 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term10203 = ((Class) term10204).getDeclaredField((String) "MINIMAL");
        ((Field) term10203).setAccessible(true);
        Object enum25 = ((Field) term10203).get((Object) null);
        Character term2675 = new Character('P');
        Character term2677 = new Character('w');
        term2659 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term2660 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2705 = (Object[]) newArray("java.lang.String", 7);
        setField(term2659, term2659.getClass(), "out", null);
        setCharField(term2660, term2660.getClass(), "delimiter", 't');
        setField(term2660, term2660.getClass(), "quoteChar", term2662);
        setField(term2660, term2660.getClass(), "quotePolicy", enum25);
        setField(term2660, term2660.getClass(), "commentStart", term2675);
        setField(term2660, term2660.getClass(), "escape", term2677);
        setBooleanField(term2660, term2660.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2660, term2660.getClass(), "ignoreEmptyLines", true);
        setField(term2660, term2660.getClass(), "recordSeparator", "xLbjWUgOIL");
        setField(term2660, term2660.getClass(), "nullString", "jDtqGUpnZN");
        setElement(term2705, 0, "nGKItKLYNC");
        setElement(term2705, 1, "UiUYnPrcCi");
        setElement(term2705, 2, "UoYtihxVaS");
        setElement(term2705, 3, "JDswTTCZHV");
        setElement(term2705, 4, "onpbIeEKoi");
        setElement(term2705, 5, "YRHGsAkhxb");
        setElement(term2705, 6, "ffYhPOzlUs");
        setField(term2660, term2660.getClass(), "header", term2705);
        setBooleanField(term2660, term2660.getClass(), "skipHeaderRecord", true);
        setField(term2659, term2659.getClass(), "format", term2660);
        setBooleanField(term2659, term2659.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "println", argTypes, term2659, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


