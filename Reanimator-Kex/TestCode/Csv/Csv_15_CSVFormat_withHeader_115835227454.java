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

public class CSVFormat_withHeader_115835227454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23276;

    public CSVFormat_withHeader_115835227454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23278 = new Character('h');
        Character term23281 = new Character('R');
        Character term23360 = new Character('k');
        Class<? extends Object> term23455 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term23454 = ((Class) term23455).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term23454).setAccessible(true);
        Object enum51 = ((Field) term23454).get((Object) null);
        term23276 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23283 = (Object[]) newArray("java.lang.String", 4);
        Object[] term23332 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term23276, term23276.getClass(), "allowMissingColumnNames", false);
        setField(term23276, term23276.getClass(), "commentMarker", term23278);
        setCharField(term23276, term23276.getClass(), "delimiter", 'Y');
        setField(term23276, term23276.getClass(), "escapeCharacter", term23281);
        setElement(term23283, 0, "jcWKHRWhyj");
        setElement(term23283, 1, "nrQjODRMLD");
        setElement(term23283, 2, "PNoWXrsFic");
        setElement(term23283, 3, "QZBHZqZope");
        setField(term23276, term23276.getClass(), "header", term23283);
        setElement(term23332, 0, "VBUahCvyxC");
        setField(term23276, term23276.getClass(), "headerComments", term23332);
        setBooleanField(term23276, term23276.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term23276, term23276.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term23276, term23276.getClass(), "ignoreSurroundingSpaces", true);
        setField(term23276, term23276.getClass(), "nullString", "MlzTkzKMCX");
        setField(term23276, term23276.getClass(), "quoteCharacter", term23360);
        setField(term23276, term23276.getClass(), "quoteMode", enum51);
        setField(term23276, term23276.getClass(), "recordSeparator", "UqKUbMyPMJ");
        setBooleanField(term23276, term23276.getClass(), "skipHeaderRecord", false);
        setBooleanField(term23276, term23276.getClass(), "trailingDelimiter", false);
        setBooleanField(term23276, term23276.getClass(), "trim", false);
        setBooleanField(term23276, term23276.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSetMetaData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withHeader", argTypes, term23276, args);
    }

};


