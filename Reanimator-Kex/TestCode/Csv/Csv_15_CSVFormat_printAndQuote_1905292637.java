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
import java.lang.Integer;
import java.lang.Boolean;

public class CSVFormat_printAndQuote_1905292637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15502;
     Object term15683;
     Object term15684;
     Object term15686;
     Object term15688;

    public CSVFormat_printAndQuote_1905292637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15504 = new Character('H');
        Character term15507 = new Character('w');
        Character term15658 = new Character('X');
        Class<? extends Object> term15811 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15810 = ((Class) term15811).getDeclaredField((String) "ALL");
        ((Field) term15810).setAccessible(true);
        Object enum34 = ((Field) term15810).get((Object) null);
        term15502 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15509 = (Object[]) newArray("java.lang.String", 6);
        Object[] term15582 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term15502, term15502.getClass(), "allowMissingColumnNames", false);
        setField(term15502, term15502.getClass(), "commentMarker", term15504);
        setCharField(term15502, term15502.getClass(), "delimiter", 'E');
        setField(term15502, term15502.getClass(), "escapeCharacter", term15507);
        setElement(term15509, 0, "nKZKnxWYCK");
        setElement(term15509, 1, "JOqQxuzRuZ");
        setElement(term15509, 2, "RSaoipUlsg");
        setElement(term15509, 3, "cSHGbqKqlN");
        setElement(term15509, 4, "pFAfANnxup");
        setElement(term15509, 5, "FbSIUZyBXZ");
        setField(term15502, term15502.getClass(), "header", term15509);
        setElement(term15582, 0, "mhQDwIyrRi");
        setElement(term15582, 1, "HpZXWDPhlg");
        setElement(term15582, 2, "lBOokzEPfe");
        setElement(term15582, 3, "dtGZCsKXbW");
        setElement(term15582, 4, "bdyhHbDAmJ");
        setField(term15502, term15502.getClass(), "headerComments", term15582);
        setBooleanField(term15502, term15502.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term15502, term15502.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term15502, term15502.getClass(), "ignoreSurroundingSpaces", true);
        setField(term15502, term15502.getClass(), "nullString", "BBXiTNHqGE");
        setField(term15502, term15502.getClass(), "quoteCharacter", term15658);
        setField(term15502, term15502.getClass(), "quoteMode", enum34);
        setField(term15502, term15502.getClass(), "recordSeparator", "IEYhJmgCVd");
        setBooleanField(term15502, term15502.getClass(), "skipHeaderRecord", false);
        setBooleanField(term15502, term15502.getClass(), "trailingDelimiter", true);
        setBooleanField(term15502, term15502.getClass(), "trim", true);
        setBooleanField(term15502, term15502.getClass(), "autoFlush", false);
        term15683 = newInstance(Class.forName("java.lang.Object"));
        term15684 = new Integer(-616727354);
        term15686 = new Integer(-1955890973);
        term15688 = new Boolean(false);
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
        args[0] = term15683;
        args[1] = null;
        args[2] = term15684;
        args[3] = term15686;
        args[4] = null;
        args[5] = term15688;
        callMethod(klass, "printAndQuote", argTypes, term15502, args);
    }

};


