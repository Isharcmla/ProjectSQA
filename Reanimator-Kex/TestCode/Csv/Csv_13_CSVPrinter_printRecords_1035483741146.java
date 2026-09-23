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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecords_1035483741146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121948;
     Object term120013;

    public CSVPrinter_printRecords_1035483741146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term122070 = new Character((char) 0);
        Class<? extends Object> term122270 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term122269 = ((Class) term122270).getDeclaredField((String) "ALL");
        ((Field) term122269).setAccessible(true);
        Object enum123 = ((Field) term122269).get((Object) null);
        Character term122230 = new Character((char) 0);
        term121948 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term122018 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term121948, term121948.getClass(), "newRecord", true);
        setField(term122018, term122018.getClass(), "quoteCharacter", term122070);
        setCharField(term122018, term122018.getClass(), "delimiter", (char) 0);
        setField(term122018, term122018.getClass(), "quoteMode", enum123);
        setField(term122018, term122018.getClass(), "escapeCharacter", term122230);
        setField(term121948, term121948.getClass(), "format", term122018);
        term120013 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term120013, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term120013;
        callMethod(klass, "printRecords", argTypes, term121948, args);
    }

};


