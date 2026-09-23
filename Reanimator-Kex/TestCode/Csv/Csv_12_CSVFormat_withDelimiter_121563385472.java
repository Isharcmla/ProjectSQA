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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withDelimiter_121563385472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8970;
     Object term9050;

    public CSVFormat_withDelimiter_121563385472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8972 = new Character('u');
        Class<? extends Object> term37287 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term37286 = ((Class) term37287).getDeclaredField((String) "ALL");
        ((Field) term37286).setAccessible(true);
        Object enum95 = ((Field) term37286).get((Object) null);
        Character term8981 = new Character('u');
        Character term8983 = new Character('a');
        term8970 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9012 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term8970, term8970.getClass(), "delimiter", 'X');
        setField(term8970, term8970.getClass(), "quoteCharacter", term8972);
        setField(term8970, term8970.getClass(), "quoteMode", enum95);
        setField(term8970, term8970.getClass(), "commentMarker", term8981);
        setField(term8970, term8970.getClass(), "escapeCharacter", term8983);
        setBooleanField(term8970, term8970.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8970, term8970.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term8970, term8970.getClass(), "ignoreEmptyLines", true);
        setField(term8970, term8970.getClass(), "recordSeparator", "HHmNoYxIGj");
        setField(term8970, term8970.getClass(), "nullString", "PtirvZmsGt");
        setElement(term9012, 0, "HWkpTmtlrc");
        setElement(term9012, 1, "hMmaoREuCK");
        setElement(term9012, 2, "VeDtgDzGAN");
        setField(term8970, term8970.getClass(), "header", term9012);
        setBooleanField(term8970, term8970.getClass(), "skipHeaderRecord", false);
        term9050 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term9050;
        try {
            callMethod(klass, "withDelimiter", argTypes, term8970, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


