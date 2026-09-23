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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_209248393026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4717;
     Object term4910;

    public CSVPrinter_printRecord_209248393026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4720 = new Character('V');
        Class<? extends Object> term15526 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15525 = ((Class) term15526).getDeclaredField((String) "NONE");
        ((Field) term15525).setAccessible(true);
        Object enum29 = ((Field) term15525).get((Object) null);
        Character term4730 = new Character('m');
        Character term4732 = new Character('a');
        term4717 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term4718 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4761 = (Object[]) newArray("java.lang.String", 9);
        Object[] term4870 = (Object[]) newArray("java.lang.String", 3);
        setField(term4717, term4717.getClass(), "out", null);
        setCharField(term4718, term4718.getClass(), "delimiter", 'p');
        setField(term4718, term4718.getClass(), "quoteCharacter", term4720);
        setField(term4718, term4718.getClass(), "quoteMode", enum29);
        setField(term4718, term4718.getClass(), "commentMarker", term4730);
        setField(term4718, term4718.getClass(), "escapeCharacter", term4732);
        setBooleanField(term4718, term4718.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4718, term4718.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term4718, term4718.getClass(), "ignoreEmptyLines", true);
        setField(term4718, term4718.getClass(), "recordSeparator", "vjxIhXHxGR");
        setField(term4718, term4718.getClass(), "nullString", "QXzGXbEXMu");
        setElement(term4761, 0, "qxSDVejjiY");
        setElement(term4761, 1, "xBsXSDjXYK");
        setElement(term4761, 2, "sEnIVFtZuQ");
        setElement(term4761, 3, "ZVecLZMLHF");
        setElement(term4761, 4, "fztQhjqwdP");
        setElement(term4761, 5, "eVpkWxjuki");
        setElement(term4761, 6, "SJiQaLvSKv");
        setElement(term4761, 7, "OEXDRUKcFl");
        setElement(term4761, 8, "RYdKCNNMBR");
        setField(term4718, term4718.getClass(), "header", term4761);
        setElement(term4870, 0, "yGtHPyvYiQ");
        setElement(term4870, 1, "MvRIxilFMJ");
        setElement(term4870, 2, "iNwOJRBEjp");
        setField(term4718, term4718.getClass(), "headerComments", term4870);
        setBooleanField(term4718, term4718.getClass(), "skipHeaderRecord", true);
        setBooleanField(term4718, term4718.getClass(), "ignoreHeaderCase", false);
        setField(term4717, term4717.getClass(), "format", term4718);
        setBooleanField(term4717, term4717.getClass(), "newRecord", false);
        term4910 = (Object[]) newArray("java.lang.Object", 5);
        Object term4911 = newInstance(Class.forName("java.lang.Object"));
        Object term4912 = newInstance(Class.forName("java.lang.Object"));
        Object term4913 = newInstance(Class.forName("java.lang.Object"));
        Object term4914 = newInstance(Class.forName("java.lang.Object"));
        Object term4915 = newInstance(Class.forName("java.lang.Object"));
        setElement(term4910, 0, term4911);
        setElement(term4910, 1, term4912);
        setElement(term4910, 2, term4913);
        setElement(term4910, 3, term4914);
        setElement(term4910, 4, term4915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4910;
        try {
            callMethod(klass, "printRecord", argTypes, term4717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


