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

public class CSVFormat_isCommentMarkerSet_206455644397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8780;
     Object term54805;

    public CSVFormat_isCommentMarkerSet_206455644397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8782 = new Character('S');
        Character term8785 = new Character('Y');
        Character term8972 = new Character('Y');
        Class<? extends Object> term54998 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54997 = ((Class) term54998).getDeclaredField((String) "NONE");
        ((Field) term54997).setAccessible(true);
        Object enum113 = ((Field) term54997).get((Object) null);
        term8780 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8787 = (Object[]) newArray("java.lang.String", 8);
        Object[] term8884 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term8780, term8780.getClass(), "allowMissingColumnNames", true);
        setField(term8780, term8780.getClass(), "commentMarker", term8782);
        setCharField(term8780, term8780.getClass(), "delimiter", 'z');
        setField(term8780, term8780.getClass(), "escapeCharacter", term8785);
        setElement(term8787, 0, "iikZEapDlu");
        setElement(term8787, 1, "nhoHrZfnIN");
        setElement(term8787, 2, "ZkMALXpEAZ");
        setElement(term8787, 3, "tXfQjSqDzN");
        setElement(term8787, 4, "BjugTaMcxJ");
        setElement(term8787, 5, "vGiuZVPJNH");
        setElement(term8787, 6, "tlzpzIjMib");
        setElement(term8787, 7, "AZdLeSugwv");
        setField(term8780, term8780.getClass(), "header", term8787);
        setElement(term8884, 0, "RMsXuyzKJV");
        setElement(term8884, 1, "FwPbDZcHmB");
        setElement(term8884, 2, "hOncybyCAH");
        setElement(term8884, 3, "QduALnDSVo");
        setElement(term8884, 4, "izPpKDErnQ");
        setElement(term8884, 5, "NnpwZBUTvx");
        setField(term8780, term8780.getClass(), "headerComments", term8884);
        setBooleanField(term8780, term8780.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term8780, term8780.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term8780, term8780.getClass(), "ignoreSurroundingSpaces", false);
        setField(term8780, term8780.getClass(), "nullString", "tlQSNgTkQX");
        setField(term8780, term8780.getClass(), "quoteCharacter", term8972);
        setField(term8780, term8780.getClass(), "quoteMode", enum113);
        setField(term8780, term8780.getClass(), "recordSeparator", "PCipZnmBOF");
        setBooleanField(term8780, term8780.getClass(), "skipHeaderRecord", false);
        setBooleanField(term8780, term8780.getClass(), "trailingDelimiter", true);
        setBooleanField(term8780, term8780.getClass(), "trim", false);
        Character term54806 = new Character('S');
        Character term54807 = new Character('Y');
        Character term54840 = new Character('Y');
        Class<? extends Object> term55510 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55509 = ((Class) term55510).getDeclaredField((String) "NONE");
        ((Field) term55509).setAccessible(true);
        Object enum114 = ((Field) term55509).get((Object) null);
        term54805 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term54808 = (Object[]) newArray("java.lang.String", 8);
        Object[] term54825 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term54805, term54805.getClass(), "allowMissingColumnNames", true);
        setField(term54805, term54805.getClass(), "commentMarker", term54806);
        setCharField(term54805, term54805.getClass(), "delimiter", 'z');
        setField(term54805, term54805.getClass(), "escapeCharacter", term54807);
        setElement(term54808, 0, "iikZEapDlu");
        setElement(term54808, 1, "nhoHrZfnIN");
        setElement(term54808, 2, "ZkMALXpEAZ");
        setElement(term54808, 3, "tXfQjSqDzN");
        setElement(term54808, 4, "BjugTaMcxJ");
        setElement(term54808, 5, "vGiuZVPJNH");
        setElement(term54808, 6, "tlzpzIjMib");
        setElement(term54808, 7, "AZdLeSugwv");
        setField(term54805, term54805.getClass(), "header", term54808);
        setElement(term54825, 0, "RMsXuyzKJV");
        setElement(term54825, 1, "FwPbDZcHmB");
        setElement(term54825, 2, "hOncybyCAH");
        setElement(term54825, 3, "QduALnDSVo");
        setElement(term54825, 4, "izPpKDErnQ");
        setElement(term54825, 5, "NnpwZBUTvx");
        setField(term54805, term54805.getClass(), "headerComments", term54825);
        setBooleanField(term54805, term54805.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term54805, term54805.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term54805, term54805.getClass(), "ignoreSurroundingSpaces", false);
        setField(term54805, term54805.getClass(), "nullString", "tlQSNgTkQX");
        setField(term54805, term54805.getClass(), "quoteCharacter", term54840);
        setField(term54805, term54805.getClass(), "quoteMode", enum114);
        setField(term54805, term54805.getClass(), "recordSeparator", "PCipZnmBOF");
        setBooleanField(term54805, term54805.getClass(), "skipHeaderRecord", false);
        setBooleanField(term54805, term54805.getClass(), "trailingDelimiter", true);
        setBooleanField(term54805, term54805.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCommentMarkerSet", argTypes, term8780, args);
        assertTrue(recursiveEquals(term8780, term54805));
        assertTrue(recursiveEquals(retValue, true));
    }

};


