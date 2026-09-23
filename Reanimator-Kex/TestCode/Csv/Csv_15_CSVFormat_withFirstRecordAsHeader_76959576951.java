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

public class CSVFormat_withFirstRecordAsHeader_76959576951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21885;

    public CSVFormat_withFirstRecordAsHeader_76959576951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21887 = new Character('b');
        Character term21890 = new Character('Y');
        Character term22041 = new Character('c');
        Class<? extends Object> term22191 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term22190 = ((Class) term22191).getDeclaredField((String) "MINIMAL");
        ((Field) term22190).setAccessible(true);
        Object enum48 = ((Field) term22190).get((Object) null);
        term21885 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21892 = (Object[]) newArray("java.lang.String", 6);
        Object[] term21965 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term21885, term21885.getClass(), "allowMissingColumnNames", true);
        setField(term21885, term21885.getClass(), "commentMarker", term21887);
        setCharField(term21885, term21885.getClass(), "delimiter", 'l');
        setField(term21885, term21885.getClass(), "escapeCharacter", term21890);
        setElement(term21892, 0, "LrqwfrKKtS");
        setElement(term21892, 1, "ZUdnQXfzCI");
        setElement(term21892, 2, "EULDrUNQvw");
        setElement(term21892, 3, "BtvAvsJSei");
        setElement(term21892, 4, "vqnBkkxoIa");
        setElement(term21892, 5, "bycpZjxXFn");
        setField(term21885, term21885.getClass(), "header", term21892);
        setElement(term21965, 0, "jQWttOAiwL");
        setElement(term21965, 1, "DzKFxEuEEC");
        setElement(term21965, 2, "CAMnvfDLJL");
        setElement(term21965, 3, "mfHtgSbdjD");
        setElement(term21965, 4, "cmuaUiHMVL");
        setField(term21885, term21885.getClass(), "headerComments", term21965);
        setBooleanField(term21885, term21885.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term21885, term21885.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term21885, term21885.getClass(), "ignoreSurroundingSpaces", false);
        setField(term21885, term21885.getClass(), "nullString", "xjoSGPWUgu");
        setField(term21885, term21885.getClass(), "quoteCharacter", term22041);
        setField(term21885, term21885.getClass(), "quoteMode", enum48);
        setField(term21885, term21885.getClass(), "recordSeparator", "uzmqjnOUXu");
        setBooleanField(term21885, term21885.getClass(), "skipHeaderRecord", false);
        setBooleanField(term21885, term21885.getClass(), "trailingDelimiter", true);
        setBooleanField(term21885, term21885.getClass(), "trim", false);
        setBooleanField(term21885, term21885.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withFirstRecordAsHeader", argTypes, term21885, args);
    }

};


