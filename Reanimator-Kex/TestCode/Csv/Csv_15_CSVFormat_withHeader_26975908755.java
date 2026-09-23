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

public class CSVFormat_withHeader_26975908755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23667;
     Object term23728;

    public CSVFormat_withHeader_26975908755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23669 = new Character('y');
        Character term23672 = new Character('S');
        Character term23703 = new Character('r');
        Class<? extends Object> term23810 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term23809 = ((Class) term23810).getDeclaredField((String) "ALL");
        ((Field) term23809).setAccessible(true);
        Object enum52 = ((Field) term23809).get((Object) null);
        term23667 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23674 = (Object[]) newArray("java.lang.String", 0);
        Object[] term23675 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term23667, term23667.getClass(), "allowMissingColumnNames", true);
        setField(term23667, term23667.getClass(), "commentMarker", term23669);
        setCharField(term23667, term23667.getClass(), "delimiter", 'b');
        setField(term23667, term23667.getClass(), "escapeCharacter", term23672);
        setField(term23667, term23667.getClass(), "header", term23674);
        setElement(term23675, 0, "QpYltHAdyY");
        setField(term23667, term23667.getClass(), "headerComments", term23675);
        setBooleanField(term23667, term23667.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term23667, term23667.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term23667, term23667.getClass(), "ignoreSurroundingSpaces", true);
        setField(term23667, term23667.getClass(), "nullString", "lbmSGBwIiV");
        setField(term23667, term23667.getClass(), "quoteCharacter", term23703);
        setField(term23667, term23667.getClass(), "quoteMode", enum52);
        setField(term23667, term23667.getClass(), "recordSeparator", "DAxyHoTLzZ");
        setBooleanField(term23667, term23667.getClass(), "skipHeaderRecord", false);
        setBooleanField(term23667, term23667.getClass(), "trailingDelimiter", true);
        setBooleanField(term23667, term23667.getClass(), "trim", true);
        setBooleanField(term23667, term23667.getClass(), "autoFlush", false);
        term23728 = (Object[]) newArray("java.lang.String", 5);
        setElement(term23728, 0, "fhZgTouhCC");
        setElement(term23728, 1, "wrikqJwXvL");
        setElement(term23728, 2, "UiWhvbypdr");
        setElement(term23728, 3, "CgleElJNje");
        setElement(term23728, 4, "ZrchvNGMtd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23728;
        callMethod(klass, "withHeader", argTypes, term23667, args);
    }

};


