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

public class CSVPrinter_printComment_167520956022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2252;

    public CSVPrinter_printComment_167520956022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2255 = new Character('z');
        Class<? extends Object> term9542 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term9541 = ((Class) term9542).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term9541).setAccessible(true);
        Object enum24 = ((Field) term9541).get((Object) null);
        Character term2272 = new Character('x');
        Character term2274 = new Character('x');
        term2252 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term2253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2302 = (Object[]) newArray("java.lang.String", 6);
        setField(term2252, term2252.getClass(), "out", null);
        setCharField(term2253, term2253.getClass(), "delimiter", 'q');
        setField(term2253, term2253.getClass(), "quoteChar", term2255);
        setField(term2253, term2253.getClass(), "quotePolicy", enum24);
        setField(term2253, term2253.getClass(), "commentStart", term2272);
        setField(term2253, term2253.getClass(), "escape", term2274);
        setBooleanField(term2253, term2253.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term2253, term2253.getClass(), "ignoreEmptyLines", true);
        setField(term2253, term2253.getClass(), "recordSeparator", "aKnKipADSo");
        setField(term2253, term2253.getClass(), "nullString", "wSQxaModmm");
        setElement(term2302, 0, "UlajhuVLaP");
        setElement(term2302, 1, "gGSMzuGICf");
        setElement(term2302, 2, "hxCBltsObl");
        setElement(term2302, 3, "BndsHwAFMv");
        setElement(term2302, 4, "GzFkzHGYFt");
        setElement(term2302, 5, "tShwQLRGNe");
        setField(term2253, term2253.getClass(), "header", term2302);
        setBooleanField(term2253, term2253.getClass(), "skipHeaderRecord", true);
        setField(term2252, term2252.getClass(), "format", term2253);
        setBooleanField(term2252, term2252.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvtrsXUliU";
        try {
            callMethod(klass, "printComment", argTypes, term2252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


