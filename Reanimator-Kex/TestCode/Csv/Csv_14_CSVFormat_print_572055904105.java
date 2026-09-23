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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CSVFormat_print_572055904105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12756;
     Object term12944;
     Object term12945;

    public CSVFormat_print_572055904105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12758 = new Character('g');
        Character term12761 = new Character('T');
        Character term12912 = new Character('m');
        Class<? extends Object> term61264 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term61263 = ((Class) term61264).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term61263).setAccessible(true);
        Object enum126 = ((Field) term61263).get((Object) null);
        term12756 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12763 = (Object[]) newArray("java.lang.String", 2);
        Object[] term12788 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term12756, term12756.getClass(), "allowMissingColumnNames", false);
        setField(term12756, term12756.getClass(), "commentMarker", term12758);
        setCharField(term12756, term12756.getClass(), "delimiter", 'E');
        setField(term12756, term12756.getClass(), "escapeCharacter", term12761);
        setElement(term12763, 0, "wBGfLpNNiZ");
        setElement(term12763, 1, "yUGCjlqgJE");
        setField(term12756, term12756.getClass(), "header", term12763);
        setElement(term12788, 0, "PXdVZyoJyC");
        setElement(term12788, 1, "vLerpqavFM");
        setElement(term12788, 2, "qnvxzwuGKX");
        setElement(term12788, 3, "EdPAvpluZg");
        setElement(term12788, 4, "DzHVBMqWtE");
        setElement(term12788, 5, "THZSpzBRYP");
        setElement(term12788, 6, "ZfBIVGBQOE");
        setElement(term12788, 7, "QSrDQfEsTR");
        setElement(term12788, 8, "PsqusYmejD");
        setField(term12756, term12756.getClass(), "headerComments", term12788);
        setBooleanField(term12756, term12756.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term12756, term12756.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term12756, term12756.getClass(), "ignoreSurroundingSpaces", true);
        setField(term12756, term12756.getClass(), "nullString", "NTWMiBEaDF");
        setField(term12756, term12756.getClass(), "quoteCharacter", term12912);
        setField(term12756, term12756.getClass(), "quoteMode", enum126);
        setField(term12756, term12756.getClass(), "recordSeparator", "SPBstwKFVr");
        setBooleanField(term12756, term12756.getClass(), "skipHeaderRecord", true);
        setBooleanField(term12756, term12756.getClass(), "trailingDelimiter", false);
        setBooleanField(term12756, term12756.getClass(), "trim", true);
        term12944 = newInstance(Class.forName("java.lang.Object"));
        term12945 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Appendable");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term12944;
        args[1] = null;
        args[2] = term12945;
        try {
            callMethod(klass, "print", argTypes, term12756, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


