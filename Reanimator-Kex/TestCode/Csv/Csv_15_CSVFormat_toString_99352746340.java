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

public class CSVFormat_toString_99352746340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16760;

    public CSVFormat_toString_99352746340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16762 = new Character('L');
        Character term16765 = new Character('B');
        Character term16844 = new Character('a');
        Class<? extends Object> term16939 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term16938 = ((Class) term16939).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term16938).setAccessible(true);
        Object enum37 = ((Field) term16938).get((Object) null);
        term16760 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16767 = (Object[]) newArray("java.lang.String", 4);
        Object[] term16816 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term16760, term16760.getClass(), "allowMissingColumnNames", false);
        setField(term16760, term16760.getClass(), "commentMarker", term16762);
        setCharField(term16760, term16760.getClass(), "delimiter", 'W');
        setField(term16760, term16760.getClass(), "escapeCharacter", term16765);
        setElement(term16767, 0, "OUeBWNTQDh");
        setElement(term16767, 1, "gltJarNuUk");
        setElement(term16767, 2, "ZwZIDwYcSW");
        setElement(term16767, 3, "sOdkipUKRu");
        setField(term16760, term16760.getClass(), "header", term16767);
        setElement(term16816, 0, "oKwCDqywym");
        setField(term16760, term16760.getClass(), "headerComments", term16816);
        setBooleanField(term16760, term16760.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term16760, term16760.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term16760, term16760.getClass(), "ignoreSurroundingSpaces", true);
        setField(term16760, term16760.getClass(), "nullString", "zjZYTddemL");
        setField(term16760, term16760.getClass(), "quoteCharacter", term16844);
        setField(term16760, term16760.getClass(), "quoteMode", enum37);
        setField(term16760, term16760.getClass(), "recordSeparator", "QtrylgCLiF");
        setBooleanField(term16760, term16760.getClass(), "skipHeaderRecord", true);
        setBooleanField(term16760, term16760.getClass(), "trailingDelimiter", false);
        setBooleanField(term16760, term16760.getClass(), "trim", false);
        setBooleanField(term16760, term16760.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term16760, args);
    }

};


