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
import java.lang.Boolean;

public class CSVFormat_withTrailingDelimiter_81582220272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31323;
     Object term31489;

    public CSVFormat_withTrailingDelimiter_81582220272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term31325 = new Character('l');
        Character term31328 = new Character('Y');
        Character term31455 = new Character('s');
        Class<? extends Object> term31592 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term31591 = ((Class) term31592).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term31591).setAccessible(true);
        Object enum70 = ((Field) term31591).get((Object) null);
        term31323 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term31330 = (Object[]) newArray("java.lang.String", 7);
        Object[] term31415 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term31323, term31323.getClass(), "allowMissingColumnNames", false);
        setField(term31323, term31323.getClass(), "commentMarker", term31325);
        setCharField(term31323, term31323.getClass(), "delimiter", 'm');
        setField(term31323, term31323.getClass(), "escapeCharacter", term31328);
        setElement(term31330, 0, "QVLresHoaP");
        setElement(term31330, 1, "IbxeAMwLVt");
        setElement(term31330, 2, "bShlAqoTmZ");
        setElement(term31330, 3, "nOKlKlNhtU");
        setElement(term31330, 4, "gXFNBHJSey");
        setElement(term31330, 5, "wUcSfItZgv");
        setElement(term31330, 6, "rOfPCPHmtJ");
        setField(term31323, term31323.getClass(), "header", term31330);
        setElement(term31415, 0, "EnmiAvfpJv");
        setElement(term31415, 1, "AdYzLPMcwe");
        setField(term31323, term31323.getClass(), "headerComments", term31415);
        setBooleanField(term31323, term31323.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term31323, term31323.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term31323, term31323.getClass(), "ignoreSurroundingSpaces", false);
        setField(term31323, term31323.getClass(), "nullString", "FrTZLybkKk");
        setField(term31323, term31323.getClass(), "quoteCharacter", term31455);
        setField(term31323, term31323.getClass(), "quoteMode", enum70);
        setField(term31323, term31323.getClass(), "recordSeparator", "FlxVmiMYKP");
        setBooleanField(term31323, term31323.getClass(), "skipHeaderRecord", false);
        setBooleanField(term31323, term31323.getClass(), "trailingDelimiter", true);
        setBooleanField(term31323, term31323.getClass(), "trim", false);
        setBooleanField(term31323, term31323.getClass(), "autoFlush", false);
        term31489 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term31489;
        callMethod(klass, "withTrailingDelimiter", argTypes, term31323, args);
    }

};


