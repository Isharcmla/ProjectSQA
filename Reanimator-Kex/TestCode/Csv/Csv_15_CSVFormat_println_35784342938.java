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

public class CSVFormat_println_35784342938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15996;

    public CSVFormat_println_35784342938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15998 = new Character('R');
        Character term16001 = new Character('V');
        Character term16032 = new Character('c');
        Class<? extends Object> term16079 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term16078 = ((Class) term16079).getDeclaredField((String) "NONE");
        ((Field) term16078).setAccessible(true);
        Object enum35 = ((Field) term16078).get((Object) null);
        term15996 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16003 = (Object[]) newArray("java.lang.String", 1);
        Object[] term16016 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term15996, term15996.getClass(), "allowMissingColumnNames", false);
        setField(term15996, term15996.getClass(), "commentMarker", term15998);
        setCharField(term15996, term15996.getClass(), "delimiter", 'o');
        setField(term15996, term15996.getClass(), "escapeCharacter", term16001);
        setElement(term16003, 0, "KSJeYkkvpk");
        setField(term15996, term15996.getClass(), "header", term16003);
        setField(term15996, term15996.getClass(), "headerComments", term16016);
        setBooleanField(term15996, term15996.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term15996, term15996.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term15996, term15996.getClass(), "ignoreSurroundingSpaces", false);
        setField(term15996, term15996.getClass(), "nullString", "qUtkFGMNUV");
        setField(term15996, term15996.getClass(), "quoteCharacter", term16032);
        setField(term15996, term15996.getClass(), "quoteMode", enum35);
        setField(term15996, term15996.getClass(), "recordSeparator", "mGRiYhnMcR");
        setBooleanField(term15996, term15996.getClass(), "skipHeaderRecord", false);
        setBooleanField(term15996, term15996.getClass(), "trailingDelimiter", true);
        setBooleanField(term15996, term15996.getClass(), "trim", true);
        setBooleanField(term15996, term15996.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "println", argTypes, term15996, args);
    }

};


