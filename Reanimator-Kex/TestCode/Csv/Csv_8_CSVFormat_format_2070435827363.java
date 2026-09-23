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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261312;
     Object term259341;

    public CSVFormat_format_2070435827363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term261364 = new Character((char) 0);
        Character term261416 = new Character((char) 0);
        Character term261468 = new Character((char) 4);
        Class<? extends Object> term261700 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term261699 = ((Class) term261700).getDeclaredField((String) "ALL");
        ((Field) term261699).setAccessible(true);
        Object enum411 = ((Field) term261699).get((Object) null);
        term261312 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term259669 = (Object[]) newArray("java.lang.String", 0);
        setField(term261312, term261312.getClass(), "quoteChar", term261364);
        setCharField(term261312, term261312.getClass(), "delimiter", 'p');
        setField(term261312, term261312.getClass(), "escape", term261416);
        setField(term261312, term261312.getClass(), "commentStart", term261468);
        setField(term261312, term261312.getClass(), "header", term259669);
        setField(term261312, term261312.getClass(), "quotePolicy", enum411);
        StringBuffer term261698 = new StringBuffer();
        term259341 = (Object[]) newArray("java.lang.String", 2);
        Object term261640 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term259341, 0, term261640);
        setElement(term259341, 1, term261698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term259341;
        callMethod(klass, "format", argTypes, term261312, args);
    }

};


