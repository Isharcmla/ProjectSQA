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

public class CSVFormat_withCommentMarker_186172062887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12103;
     Object term12257;
     Object term60986;
     Object term60838;

    public CSVFormat_withCommentMarker_186172062887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12105 = new Character('a');
        Class<? extends Object> term61018 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term61017 = ((Class) term61018).getDeclaredField((String) "ALL");
        ((Field) term61017).setAccessible(true);
        Object enum107 = ((Field) term61017).get((Object) null);
        Character term12114 = new Character('P');
        Character term12116 = new Character('i');
        term12103 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12145 = (Object[]) newArray("java.lang.String", 7);
        Object[] term12230 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term12103, term12103.getClass(), "delimiter", 'u');
        setField(term12103, term12103.getClass(), "quoteCharacter", term12105);
        setField(term12103, term12103.getClass(), "quoteMode", enum107);
        setField(term12103, term12103.getClass(), "commentMarker", term12114);
        setField(term12103, term12103.getClass(), "escapeCharacter", term12116);
        setBooleanField(term12103, term12103.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term12103, term12103.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term12103, term12103.getClass(), "ignoreEmptyLines", false);
        setField(term12103, term12103.getClass(), "recordSeparator", "GJVkUrCVdD");
        setField(term12103, term12103.getClass(), "nullString", "zNdorvdUgu");
        setElement(term12145, 0, "oPxuZbkYio");
        setElement(term12145, 1, "vKitydDVnM");
        setElement(term12145, 2, "urCiQnUFBM");
        setElement(term12145, 3, "EKjQdtKxAM");
        setElement(term12145, 4, "TXZAIPQJHt");
        setElement(term12145, 5, "DIbeDHICho");
        setElement(term12145, 6, "dJGPlmSRnz");
        setField(term12103, term12103.getClass(), "header", term12145);
        setElement(term12230, 0, "DPskuFUobI");
        setElement(term12230, 1, "wBGfLpNNiZ");
        setField(term12103, term12103.getClass(), "headerComments", term12230);
        setBooleanField(term12103, term12103.getClass(), "skipHeaderRecord", true);
        setBooleanField(term12103, term12103.getClass(), "ignoreHeaderCase", true);
        term12257 = new Character('g');
        Character term60987 = new Character('a');
        Class<? extends Object> term61304 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term61303 = ((Class) term61304).getDeclaredField((String) "ALL");
        ((Field) term61303).setAccessible(true);
        Object enum108 = ((Field) term61303).get((Object) null);
        Character term60991 = new Character('P');
        Character term60992 = new Character('i');
        term60986 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term60997 = (Object[]) newArray("java.lang.String", 7);
        Object[] term61012 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term60986, term60986.getClass(), "delimiter", 'u');
        setField(term60986, term60986.getClass(), "quoteCharacter", term60987);
        setField(term60986, term60986.getClass(), "quoteMode", enum108);
        setField(term60986, term60986.getClass(), "commentMarker", term60991);
        setField(term60986, term60986.getClass(), "escapeCharacter", term60992);
        setBooleanField(term60986, term60986.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term60986, term60986.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term60986, term60986.getClass(), "ignoreEmptyLines", false);
        setField(term60986, term60986.getClass(), "recordSeparator", "GJVkUrCVdD");
        setField(term60986, term60986.getClass(), "nullString", "zNdorvdUgu");
        setElement(term60997, 0, "oPxuZbkYio");
        setElement(term60997, 1, "vKitydDVnM");
        setElement(term60997, 2, "urCiQnUFBM");
        setElement(term60997, 3, "EKjQdtKxAM");
        setElement(term60997, 4, "TXZAIPQJHt");
        setElement(term60997, 5, "DIbeDHICho");
        setElement(term60997, 6, "dJGPlmSRnz");
        setField(term60986, term60986.getClass(), "header", term60997);
        setElement(term61012, 0, "DPskuFUobI");
        setElement(term61012, 1, "wBGfLpNNiZ");
        setField(term60986, term60986.getClass(), "headerComments", term61012);
        setBooleanField(term60986, term60986.getClass(), "skipHeaderRecord", true);
        setBooleanField(term60986, term60986.getClass(), "ignoreHeaderCase", true);
        Character term60840 = new Character('a');
        Class<? extends Object> term61590 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term61589 = ((Class) term61590).getDeclaredField((String) "ALL");
        ((Field) term61589).setAccessible(true);
        Object enum109 = ((Field) term61589).get((Object) null);
        Character term60842 = new Character('g');
        Character term60844 = new Character('i');
        term60838 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term60873 = (Object[]) newArray("java.lang.String", 7);
        Object[] term60958 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term60838, term60838.getClass(), "delimiter", 'u');
        setField(term60838, term60838.getClass(), "quoteCharacter", term60840);
        setField(term60838, term60838.getClass(), "quoteMode", enum109);
        setField(term60838, term60838.getClass(), "commentMarker", term60842);
        setField(term60838, term60838.getClass(), "escapeCharacter", term60844);
        setBooleanField(term60838, term60838.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term60838, term60838.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term60838, term60838.getClass(), "ignoreEmptyLines", false);
        setField(term60838, term60838.getClass(), "recordSeparator", "GJVkUrCVdD");
        setField(term60838, term60838.getClass(), "nullString", "zNdorvdUgu");
        setElement(term60873, 0, "oPxuZbkYio");
        setElement(term60873, 1, "vKitydDVnM");
        setElement(term60873, 2, "urCiQnUFBM");
        setElement(term60873, 3, "EKjQdtKxAM");
        setElement(term60873, 4, "TXZAIPQJHt");
        setElement(term60873, 5, "DIbeDHICho");
        setElement(term60873, 6, "dJGPlmSRnz");
        setField(term60838, term60838.getClass(), "header", term60873);
        setElement(term60958, 0, "DPskuFUobI");
        setElement(term60958, 1, "wBGfLpNNiZ");
        setField(term60838, term60838.getClass(), "headerComments", term60958);
        setBooleanField(term60838, term60838.getClass(), "skipHeaderRecord", true);
        setBooleanField(term60838, term60838.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term12257;
        Object retValue = callMethod(klass, "withCommentMarker", argTypes, term12103, args);
        assertTrue(recursiveEquals(term12103, term60986));
        assertTrue(recursiveEquals(term12257, 'g'));
        assertTrue(recursiveEquals(retValue, term60838));
    }

};


