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

public class CSVFormat_parse_76031632383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10407;

    public CSVFormat_parse_76031632383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10409 = new Character('G');
        Class<? extends Object> term57585 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57584 = ((Class) term57585).getDeclaredField((String) "NONE");
        ((Field) term57584).setAccessible(true);
        Object enum101 = ((Field) term57584).get((Object) null);
        Character term10419 = new Character('g');
        Character term10421 = new Character('n');
        term10407 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10450 = (Object[]) newArray("java.lang.String", 9);
        Object[] term10559 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term10407, term10407.getClass(), "delimiter", 'Y');
        setField(term10407, term10407.getClass(), "quoteCharacter", term10409);
        setField(term10407, term10407.getClass(), "quoteMode", enum101);
        setField(term10407, term10407.getClass(), "commentMarker", term10419);
        setField(term10407, term10407.getClass(), "escapeCharacter", term10421);
        setBooleanField(term10407, term10407.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term10407, term10407.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term10407, term10407.getClass(), "ignoreEmptyLines", true);
        setField(term10407, term10407.getClass(), "recordSeparator", "NTlKJDDWlk");
        setField(term10407, term10407.getClass(), "nullString", "vOuMEpOQAg");
        setElement(term10450, 0, "SIODFGaQhr");
        setElement(term10450, 1, "qYzsiuXOgS");
        setElement(term10450, 2, "bxrCBbrrct");
        setElement(term10450, 3, "CKWpJaaaxX");
        setElement(term10450, 4, "UBRmXJmfrt");
        setElement(term10450, 5, "WZzvmIHhzZ");
        setElement(term10450, 6, "doQLHkjpNm");
        setElement(term10450, 7, "lCyLIcSuom");
        setElement(term10450, 8, "CGOpQSZZwI");
        setField(term10407, term10407.getClass(), "header", term10450);
        setElement(term10559, 0, "ypEdrstygY");
        setElement(term10559, 1, "sNQFlATEeQ");
        setElement(term10559, 2, "ZKMLioamsY");
        setElement(term10559, 3, "WVbxuoDBcn");
        setElement(term10559, 4, "pvDEABOxLt");
        setElement(term10559, 5, "beAMpkroCQ");
        setElement(term10559, 6, "uSUvKAyuvd");
        setField(term10407, term10407.getClass(), "headerComments", term10559);
        setBooleanField(term10407, term10407.getClass(), "skipHeaderRecord", false);
        setBooleanField(term10407, term10407.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term10407, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


