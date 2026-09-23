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

public class CSVFormat_getDelimiter_155525069547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1251;
     Object term17560;

    public CSVFormat_getDelimiter_155525069547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1253 = new Character('M');
        Class<? extends Object> term17585 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term17584 = ((Class) term17585).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term17584).setAccessible(true);
        Object enum47 = ((Field) term17584).get((Object) null);
        Character term1270 = new Character('u');
        Character term1272 = new Character('L');
        term1251 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1300 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term1251, term1251.getClass(), "delimiter", 'b');
        setField(term1251, term1251.getClass(), "quoteChar", term1253);
        setField(term1251, term1251.getClass(), "quotePolicy", enum47);
        setField(term1251, term1251.getClass(), "commentStart", term1270);
        setField(term1251, term1251.getClass(), "escape", term1272);
        setBooleanField(term1251, term1251.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1251, term1251.getClass(), "ignoreEmptyLines", true);
        setField(term1251, term1251.getClass(), "recordSeparator", "RkybSrpybU");
        setField(term1251, term1251.getClass(), "nullString", "xOEqzGAmDU");
        setElement(term1300, 0, "eZFUvlxvGV");
        setElement(term1300, 1, "BYqFIqCKAV");
        setElement(term1300, 2, "vrQLuWIDJX");
        setElement(term1300, 3, "flxyYxBRtu");
        setElement(term1300, 4, "OclPbYPkcH");
        setElement(term1300, 5, "IoAlmYsBwc");
        setField(term1251, term1251.getClass(), "header", term1300);
        setBooleanField(term1251, term1251.getClass(), "skipHeaderRecord", false);
        Character term17561 = new Character('M');
        Class<? extends Object> term17847 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term17846 = ((Class) term17847).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term17846).setAccessible(true);
        Object enum48 = ((Field) term17846).get((Object) null);
        Character term17565 = new Character('u');
        Character term17566 = new Character('L');
        term17560 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17571 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term17560, term17560.getClass(), "delimiter", 'b');
        setField(term17560, term17560.getClass(), "quoteChar", term17561);
        setField(term17560, term17560.getClass(), "quotePolicy", enum48);
        setField(term17560, term17560.getClass(), "commentStart", term17565);
        setField(term17560, term17560.getClass(), "escape", term17566);
        setBooleanField(term17560, term17560.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term17560, term17560.getClass(), "ignoreEmptyLines", true);
        setField(term17560, term17560.getClass(), "recordSeparator", "RkybSrpybU");
        setField(term17560, term17560.getClass(), "nullString", "xOEqzGAmDU");
        setElement(term17571, 0, "eZFUvlxvGV");
        setElement(term17571, 1, "BYqFIqCKAV");
        setElement(term17571, 2, "vrQLuWIDJX");
        setElement(term17571, 3, "flxyYxBRtu");
        setElement(term17571, 4, "OclPbYPkcH");
        setElement(term17571, 5, "IoAlmYsBwc");
        setField(term17560, term17560.getClass(), "header", term17571);
        setBooleanField(term17560, term17560.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelimiter", argTypes, term1251, args);
        assertTrue(recursiveEquals(term1251, term17560));
        assertTrue(recursiveEquals(retValue, 'b'));
    }

};


