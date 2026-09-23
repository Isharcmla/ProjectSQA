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

public class CSVFormat_withTrim_122299460174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32305;
     Object term32487;

    public CSVFormat_withTrim_122299460174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term32307 = new Character('E');
        Character term32310 = new Character('a');
        Character term32461 = new Character('r');
        Class<? extends Object> term32610 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32609 = ((Class) term32610).getDeclaredField((String) "NONE");
        ((Field) term32609).setAccessible(true);
        Object enum72 = ((Field) term32609).get((Object) null);
        term32305 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term32312 = (Object[]) newArray("java.lang.String", 5);
        Object[] term32373 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term32305, term32305.getClass(), "allowMissingColumnNames", true);
        setField(term32305, term32305.getClass(), "commentMarker", term32307);
        setCharField(term32305, term32305.getClass(), "delimiter", 'P');
        setField(term32305, term32305.getClass(), "escapeCharacter", term32310);
        setElement(term32312, 0, "ikTtOgdVYS");
        setElement(term32312, 1, "JptuwlirlS");
        setElement(term32312, 2, "TKOMaGswbU");
        setElement(term32312, 3, "YcTbglHiUq");
        setElement(term32312, 4, "TiUqHrjoEU");
        setField(term32305, term32305.getClass(), "header", term32312);
        setElement(term32373, 0, "eoEvZbdLjL");
        setElement(term32373, 1, "BkIxsyPkGy");
        setElement(term32373, 2, "mrMGwoRgVY");
        setElement(term32373, 3, "mxVLTgCwki");
        setElement(term32373, 4, "wCurppnDSA");
        setElement(term32373, 5, "JydxSNTMYt");
        setField(term32305, term32305.getClass(), "headerComments", term32373);
        setBooleanField(term32305, term32305.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term32305, term32305.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term32305, term32305.getClass(), "ignoreSurroundingSpaces", true);
        setField(term32305, term32305.getClass(), "nullString", "KpurAcrHYT");
        setField(term32305, term32305.getClass(), "quoteCharacter", term32461);
        setField(term32305, term32305.getClass(), "quoteMode", enum72);
        setField(term32305, term32305.getClass(), "recordSeparator", "QjvDwgKJGz");
        setBooleanField(term32305, term32305.getClass(), "skipHeaderRecord", false);
        setBooleanField(term32305, term32305.getClass(), "trailingDelimiter", false);
        setBooleanField(term32305, term32305.getClass(), "trim", false);
        setBooleanField(term32305, term32305.getClass(), "autoFlush", true);
        term32487 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term32487;
        callMethod(klass, "withTrim", argTypes, term32305, args);
    }

};


