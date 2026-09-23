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
import java.lang.Integer;
import java.lang.Boolean;

public class CSVFormat_printAndQuote_19052926108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14422;
     Object term14634;
     Object term14635;
     Object term14637;
     Object term14639;

    public CSVFormat_printAndQuote_19052926108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term14424 = new Character('z');
        Character term14427 = new Character('f');
        Character term14602 = new Character('L');
        Class<? extends Object> term64612 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term64611 = ((Class) term64612).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term64611).setAccessible(true);
        Object enum132 = ((Field) term64611).get((Object) null);
        term14422 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term14429 = (Object[]) newArray("java.lang.String", 7);
        Object[] term14514 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term14422, term14422.getClass(), "allowMissingColumnNames", false);
        setField(term14422, term14422.getClass(), "commentMarker", term14424);
        setCharField(term14422, term14422.getClass(), "delimiter", 'R');
        setField(term14422, term14422.getClass(), "escapeCharacter", term14427);
        setElement(term14429, 0, "VDokbsCuqq");
        setElement(term14429, 1, "xClUIcPECX");
        setElement(term14429, 2, "avhRaGZaBF");
        setElement(term14429, 3, "JkgoRtImdE");
        setElement(term14429, 4, "qFGKIJjlmV");
        setElement(term14429, 5, "IHqvyhMtuM");
        setElement(term14429, 6, "dAldIGYAXV");
        setField(term14422, term14422.getClass(), "header", term14429);
        setElement(term14514, 0, "mLwibAPEsa");
        setElement(term14514, 1, "zsWKWiTFuo");
        setElement(term14514, 2, "UPUbwyHQKN");
        setElement(term14514, 3, "lgQkrXANyI");
        setElement(term14514, 4, "MeTmRZXErV");
        setElement(term14514, 5, "jNxbVmoZgq");
        setField(term14422, term14422.getClass(), "headerComments", term14514);
        setBooleanField(term14422, term14422.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term14422, term14422.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term14422, term14422.getClass(), "ignoreSurroundingSpaces", true);
        setField(term14422, term14422.getClass(), "nullString", "PvmBHIXaMY");
        setField(term14422, term14422.getClass(), "quoteCharacter", term14602);
        setField(term14422, term14422.getClass(), "quoteMode", enum132);
        setField(term14422, term14422.getClass(), "recordSeparator", "hulYxtowxw");
        setBooleanField(term14422, term14422.getClass(), "skipHeaderRecord", true);
        setBooleanField(term14422, term14422.getClass(), "trailingDelimiter", true);
        setBooleanField(term14422, term14422.getClass(), "trim", true);
        term14634 = newInstance(Class.forName("java.lang.Object"));
        term14635 = new Integer(-616727354);
        term14637 = new Integer(-1955890973);
        term14639 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.Appendable");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term14634;
        args[1] = null;
        args[2] = term14635;
        args[3] = term14637;
        args[4] = null;
        args[5] = term14639;
        try {
            callMethod(klass, "printAndQuote", argTypes, term14422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


