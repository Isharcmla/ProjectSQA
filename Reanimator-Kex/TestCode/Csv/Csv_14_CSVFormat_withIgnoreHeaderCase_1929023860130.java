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

public class CSVFormat_withIgnoreHeaderCase_1929023860130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24223;
     Object term94226;
     Object term94077;

    public CSVFormat_withIgnoreHeaderCase_1929023860130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term24225 = new Character('x');
        Character term24228 = new Character('E');
        Character term24355 = new Character('q');
        Class<? extends Object> term94358 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term94357 = ((Class) term94358).getDeclaredField((String) "MINIMAL");
        ((Field) term94357).setAccessible(true);
        Object enum190 = ((Field) term94357).get((Object) null);
        term24223 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24230 = (Object[]) newArray("java.lang.String", 5);
        Object[] term24291 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term24223, term24223.getClass(), "allowMissingColumnNames", true);
        setField(term24223, term24223.getClass(), "commentMarker", term24225);
        setCharField(term24223, term24223.getClass(), "delimiter", 'O');
        setField(term24223, term24223.getClass(), "escapeCharacter", term24228);
        setElement(term24230, 0, "EkgprvqZlM");
        setElement(term24230, 1, "fbnKvthhOz");
        setElement(term24230, 2, "PGfCDJTBek");
        setElement(term24230, 3, "ZwjARhAtHC");
        setElement(term24230, 4, "XXvscsYBWv");
        setField(term24223, term24223.getClass(), "header", term24230);
        setElement(term24291, 0, "uePedtiAfL");
        setElement(term24291, 1, "AdSHvysxQB");
        setElement(term24291, 2, "jlraKkBWFA");
        setElement(term24291, 3, "mRBtFTxVdE");
        setField(term24223, term24223.getClass(), "headerComments", term24291);
        setBooleanField(term24223, term24223.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term24223, term24223.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term24223, term24223.getClass(), "ignoreSurroundingSpaces", false);
        setField(term24223, term24223.getClass(), "nullString", "IVacFDAZcj");
        setField(term24223, term24223.getClass(), "quoteCharacter", term24355);
        setField(term24223, term24223.getClass(), "quoteMode", enum190);
        setField(term24223, term24223.getClass(), "recordSeparator", "EEYmuwyVDP");
        setBooleanField(term24223, term24223.getClass(), "skipHeaderRecord", true);
        setBooleanField(term24223, term24223.getClass(), "trailingDelimiter", true);
        setBooleanField(term24223, term24223.getClass(), "trim", true);
        Character term94227 = new Character('x');
        Character term94228 = new Character('E');
        Character term94251 = new Character('q');
        Class<? extends Object> term94656 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term94655 = ((Class) term94656).getDeclaredField((String) "MINIMAL");
        ((Field) term94655).setAccessible(true);
        Object enum191 = ((Field) term94655).get((Object) null);
        term94226 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term94229 = (Object[]) newArray("java.lang.String", 5);
        Object[] term94240 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term94226, term94226.getClass(), "allowMissingColumnNames", true);
        setField(term94226, term94226.getClass(), "commentMarker", term94227);
        setCharField(term94226, term94226.getClass(), "delimiter", 'O');
        setField(term94226, term94226.getClass(), "escapeCharacter", term94228);
        setElement(term94229, 0, "EkgprvqZlM");
        setElement(term94229, 1, "fbnKvthhOz");
        setElement(term94229, 2, "PGfCDJTBek");
        setElement(term94229, 3, "ZwjARhAtHC");
        setElement(term94229, 4, "XXvscsYBWv");
        setField(term94226, term94226.getClass(), "header", term94229);
        setElement(term94240, 0, "uePedtiAfL");
        setElement(term94240, 1, "AdSHvysxQB");
        setElement(term94240, 2, "jlraKkBWFA");
        setElement(term94240, 3, "mRBtFTxVdE");
        setField(term94226, term94226.getClass(), "headerComments", term94240);
        setBooleanField(term94226, term94226.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term94226, term94226.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term94226, term94226.getClass(), "ignoreSurroundingSpaces", false);
        setField(term94226, term94226.getClass(), "nullString", "IVacFDAZcj");
        setField(term94226, term94226.getClass(), "quoteCharacter", term94251);
        setField(term94226, term94226.getClass(), "quoteMode", enum191);
        setField(term94226, term94226.getClass(), "recordSeparator", "EEYmuwyVDP");
        setBooleanField(term94226, term94226.getClass(), "skipHeaderRecord", true);
        setBooleanField(term94226, term94226.getClass(), "trailingDelimiter", true);
        setBooleanField(term94226, term94226.getClass(), "trim", true);
        Character term94079 = new Character('x');
        Character term94082 = new Character('E');
        Character term94209 = new Character('q');
        Class<? extends Object> term94954 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term94953 = ((Class) term94954).getDeclaredField((String) "MINIMAL");
        ((Field) term94953).setAccessible(true);
        Object enum192 = ((Field) term94953).get((Object) null);
        term94077 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term94084 = (Object[]) newArray("java.lang.String", 5);
        Object[] term94145 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term94077, term94077.getClass(), "allowMissingColumnNames", true);
        setField(term94077, term94077.getClass(), "commentMarker", term94079);
        setCharField(term94077, term94077.getClass(), "delimiter", 'O');
        setField(term94077, term94077.getClass(), "escapeCharacter", term94082);
        setElement(term94084, 0, "EkgprvqZlM");
        setElement(term94084, 1, "fbnKvthhOz");
        setElement(term94084, 2, "PGfCDJTBek");
        setElement(term94084, 3, "ZwjARhAtHC");
        setElement(term94084, 4, "XXvscsYBWv");
        setField(term94077, term94077.getClass(), "header", term94084);
        setElement(term94145, 0, "uePedtiAfL");
        setElement(term94145, 1, "AdSHvysxQB");
        setElement(term94145, 2, "jlraKkBWFA");
        setElement(term94145, 3, "mRBtFTxVdE");
        setField(term94077, term94077.getClass(), "headerComments", term94145);
        setBooleanField(term94077, term94077.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term94077, term94077.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term94077, term94077.getClass(), "ignoreSurroundingSpaces", false);
        setField(term94077, term94077.getClass(), "nullString", "IVacFDAZcj");
        setField(term94077, term94077.getClass(), "quoteCharacter", term94209);
        setField(term94077, term94077.getClass(), "quoteMode", enum192);
        setField(term94077, term94077.getClass(), "recordSeparator", "EEYmuwyVDP");
        setBooleanField(term94077, term94077.getClass(), "skipHeaderRecord", true);
        setBooleanField(term94077, term94077.getClass(), "trailingDelimiter", true);
        setBooleanField(term94077, term94077.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withIgnoreHeaderCase", argTypes, term24223, args);
        assertTrue(recursiveEquals(term24223, term94226));
        assertTrue(recursiveEquals(retValue, term94077));
    }

};


