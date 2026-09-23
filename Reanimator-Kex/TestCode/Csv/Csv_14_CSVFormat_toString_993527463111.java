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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_toString_993527463111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15863;
     Object term67723;

    public CSVFormat_toString_993527463111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15865 = new Character('R');
        Character term15868 = new Character('V');
        Character term15959 = new Character('c');
        Class<? extends Object> term67819 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term67818 = ((Class) term67819).getDeclaredField((String) "MINIMAL");
        ((Field) term67818).setAccessible(true);
        Object enum138 = ((Field) term67818).get((Object) null);
        term15863 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15870 = (Object[]) newArray("java.lang.String", 0);
        Object[] term15871 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term15863, term15863.getClass(), "allowMissingColumnNames", true);
        setField(term15863, term15863.getClass(), "commentMarker", term15865);
        setCharField(term15863, term15863.getClass(), "delimiter", 'o');
        setField(term15863, term15863.getClass(), "escapeCharacter", term15868);
        setField(term15863, term15863.getClass(), "header", term15870);
        setElement(term15871, 0, "KSJeYkkvpk");
        setElement(term15871, 1, "qUtkFGMNUV");
        setElement(term15871, 2, "mGRiYhnMcR");
        setElement(term15871, 3, "NFlvfJCVPO");
        setElement(term15871, 4, "KarbTXFmUU");
        setElement(term15871, 5, "jiUSjqwSIQ");
        setField(term15863, term15863.getClass(), "headerComments", term15871);
        setBooleanField(term15863, term15863.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term15863, term15863.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term15863, term15863.getClass(), "ignoreSurroundingSpaces", true);
        setField(term15863, term15863.getClass(), "nullString", "MgLCedQfoj");
        setField(term15863, term15863.getClass(), "quoteCharacter", term15959);
        setField(term15863, term15863.getClass(), "quoteMode", enum138);
        setField(term15863, term15863.getClass(), "recordSeparator", "zgKiINdgNu");
        setBooleanField(term15863, term15863.getClass(), "skipHeaderRecord", false);
        setBooleanField(term15863, term15863.getClass(), "trailingDelimiter", false);
        setBooleanField(term15863, term15863.getClass(), "trim", false);
        Character term67724 = new Character('R');
        Character term67725 = new Character('V');
        Character term67742 = new Character('c');
        Class<? extends Object> term68087 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term68086 = ((Class) term68087).getDeclaredField((String) "MINIMAL");
        ((Field) term68086).setAccessible(true);
        Object enum139 = ((Field) term68086).get((Object) null);
        term67723 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term67726 = (Object[]) newArray("java.lang.String", 0);
        Object[] term67727 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term67723, term67723.getClass(), "allowMissingColumnNames", true);
        setField(term67723, term67723.getClass(), "commentMarker", term67724);
        setCharField(term67723, term67723.getClass(), "delimiter", 'o');
        setField(term67723, term67723.getClass(), "escapeCharacter", term67725);
        setField(term67723, term67723.getClass(), "header", term67726);
        setElement(term67727, 0, "KSJeYkkvpk");
        setElement(term67727, 1, "qUtkFGMNUV");
        setElement(term67727, 2, "mGRiYhnMcR");
        setElement(term67727, 3, "NFlvfJCVPO");
        setElement(term67727, 4, "KarbTXFmUU");
        setElement(term67727, 5, "jiUSjqwSIQ");
        setField(term67723, term67723.getClass(), "headerComments", term67727);
        setBooleanField(term67723, term67723.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term67723, term67723.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term67723, term67723.getClass(), "ignoreSurroundingSpaces", true);
        setField(term67723, term67723.getClass(), "nullString", "MgLCedQfoj");
        setField(term67723, term67723.getClass(), "quoteCharacter", term67742);
        setField(term67723, term67723.getClass(), "quoteMode", enum139);
        setField(term67723, term67723.getClass(), "recordSeparator", "zgKiINdgNu");
        setBooleanField(term67723, term67723.getClass(), "skipHeaderRecord", false);
        setBooleanField(term67723, term67723.getClass(), "trailingDelimiter", false);
        setBooleanField(term67723, term67723.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term15863, args);
        assertTrue(recursiveEquals(term15863, term67723));
        assertTrue(recursiveEquals(retValue, "Delimiter=<o> Escape=<V> QuoteChar=<c> CommentStart=<R> NullString=<MgLCedQfoj> RecordSeparator=<zgKiINdgNu> SurroundingSpaces:ignored SkipHeaderRecord:false HeaderComments:[KSJeYkkvpk, qUtkFGMNUV, mGRiYhnMcR, NFlvfJCVPO, KarbTXFmUU, jiUSjqwSIQ] Header:[]"));
    }

};


