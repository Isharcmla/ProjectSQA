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
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_getQuoteMode_56885578675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6701;
     Object term50089;
     Object enum84;

    public CSVFormat_getQuoteMode_56885578675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6703 = new Character('p');
        Class<? extends Object> term50117 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50116 = ((Class) term50117).getDeclaredField((String) "ALL");
        ((Field) term50116).setAccessible(true);
        Object enum82 = ((Field) term50116).get((Object) null);
        Character term6712 = new Character('O');
        Character term6714 = new Character('Q');
        term6701 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6743 = (Object[]) newArray("java.lang.String", 2);
        Object[] term6768 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term6701, term6701.getClass(), "delimiter", 'V');
        setField(term6701, term6701.getClass(), "quoteCharacter", term6703);
        setField(term6701, term6701.getClass(), "quoteMode", enum82);
        setField(term6701, term6701.getClass(), "commentMarker", term6712);
        setField(term6701, term6701.getClass(), "escapeCharacter", term6714);
        setBooleanField(term6701, term6701.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6701, term6701.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term6701, term6701.getClass(), "ignoreEmptyLines", false);
        setField(term6701, term6701.getClass(), "recordSeparator", "HHmNoYxIGj");
        setField(term6701, term6701.getClass(), "nullString", "PtirvZmsGt");
        setElement(term6743, 0, "HWkpTmtlrc");
        setElement(term6743, 1, "hMmaoREuCK");
        setField(term6701, term6701.getClass(), "header", term6743);
        setElement(term6768, 0, "VeDtgDzGAN");
        setElement(term6768, 1, "aWYOWZFyaX");
        setElement(term6768, 2, "BRIVNtfUWU");
        setElement(term6768, 3, "DbiCVtPPCT");
        setElement(term6768, 4, "WzFopsaDuG");
        setField(term6701, term6701.getClass(), "headerComments", term6768);
        setBooleanField(term6701, term6701.getClass(), "skipHeaderRecord", false);
        setBooleanField(term6701, term6701.getClass(), "ignoreHeaderCase", true);
        Character term50090 = new Character('p');
        Class<? extends Object> term50383 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50382 = ((Class) term50383).getDeclaredField((String) "ALL");
        ((Field) term50382).setAccessible(true);
        Object enum83 = ((Field) term50382).get((Object) null);
        Character term50094 = new Character('O');
        Character term50095 = new Character('Q');
        term50089 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50100 = (Object[]) newArray("java.lang.String", 2);
        Object[] term50105 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term50089, term50089.getClass(), "delimiter", 'V');
        setField(term50089, term50089.getClass(), "quoteCharacter", term50090);
        setField(term50089, term50089.getClass(), "quoteMode", enum83);
        setField(term50089, term50089.getClass(), "commentMarker", term50094);
        setField(term50089, term50089.getClass(), "escapeCharacter", term50095);
        setBooleanField(term50089, term50089.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term50089, term50089.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term50089, term50089.getClass(), "ignoreEmptyLines", false);
        setField(term50089, term50089.getClass(), "recordSeparator", "HHmNoYxIGj");
        setField(term50089, term50089.getClass(), "nullString", "PtirvZmsGt");
        setElement(term50100, 0, "HWkpTmtlrc");
        setElement(term50100, 1, "hMmaoREuCK");
        setField(term50089, term50089.getClass(), "header", term50100);
        setElement(term50105, 0, "VeDtgDzGAN");
        setElement(term50105, 1, "aWYOWZFyaX");
        setElement(term50105, 2, "BRIVNtfUWU");
        setElement(term50105, 3, "DbiCVtPPCT");
        setElement(term50105, 4, "WzFopsaDuG");
        setField(term50089, term50089.getClass(), "headerComments", term50105);
        setBooleanField(term50089, term50089.getClass(), "skipHeaderRecord", false);
        setBooleanField(term50089, term50089.getClass(), "ignoreHeaderCase", true);
        Class<? extends Object> term50649 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50648 = ((Class) term50649).getDeclaredField((String) "ALL");
        ((Field) term50648).setAccessible(true);
        enum84 = ((Field) term50648).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteMode", argTypes, term6701, args);
        assertTrue(recursiveEquals(term6701, term50089));
        assertTrue(recursiveEquals(retValue, enum84));
    }

};


