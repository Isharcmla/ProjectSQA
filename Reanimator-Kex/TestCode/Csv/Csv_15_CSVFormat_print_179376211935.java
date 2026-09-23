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

public class CSVFormat_print_179376211935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14567;
     Object term14776;
     Object term14777;
     Object term14779;
     Object term14781;

    public CSVFormat_print_179376211935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term14569 = new Character('z');
        Character term14572 = new Character('f');
        Character term14747 = new Character('L');
        Class<? extends Object> term14924 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14923 = ((Class) term14924).getDeclaredField((String) "MINIMAL");
        ((Field) term14923).setAccessible(true);
        Object enum32 = ((Field) term14923).get((Object) null);
        term14567 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term14574 = (Object[]) newArray("java.lang.String", 7);
        Object[] term14659 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term14567, term14567.getClass(), "allowMissingColumnNames", false);
        setField(term14567, term14567.getClass(), "commentMarker", term14569);
        setCharField(term14567, term14567.getClass(), "delimiter", 'R');
        setField(term14567, term14567.getClass(), "escapeCharacter", term14572);
        setElement(term14574, 0, "VDokbsCuqq");
        setElement(term14574, 1, "xClUIcPECX");
        setElement(term14574, 2, "avhRaGZaBF");
        setElement(term14574, 3, "JkgoRtImdE");
        setElement(term14574, 4, "qFGKIJjlmV");
        setElement(term14574, 5, "IHqvyhMtuM");
        setElement(term14574, 6, "dAldIGYAXV");
        setField(term14567, term14567.getClass(), "header", term14574);
        setElement(term14659, 0, "mLwibAPEsa");
        setElement(term14659, 1, "zsWKWiTFuo");
        setElement(term14659, 2, "UPUbwyHQKN");
        setElement(term14659, 3, "lgQkrXANyI");
        setElement(term14659, 4, "MeTmRZXErV");
        setElement(term14659, 5, "jNxbVmoZgq");
        setField(term14567, term14567.getClass(), "headerComments", term14659);
        setBooleanField(term14567, term14567.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term14567, term14567.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term14567, term14567.getClass(), "ignoreSurroundingSpaces", false);
        setField(term14567, term14567.getClass(), "nullString", "PvmBHIXaMY");
        setField(term14567, term14567.getClass(), "quoteCharacter", term14747);
        setField(term14567, term14567.getClass(), "quoteMode", enum32);
        setField(term14567, term14567.getClass(), "recordSeparator", "hulYxtowxw");
        setBooleanField(term14567, term14567.getClass(), "skipHeaderRecord", false);
        setBooleanField(term14567, term14567.getClass(), "trailingDelimiter", true);
        setBooleanField(term14567, term14567.getClass(), "trim", true);
        setBooleanField(term14567, term14567.getClass(), "autoFlush", true);
        term14776 = newInstance(Class.forName("java.lang.Object"));
        term14777 = new Integer(1162663216);
        term14779 = new Integer(1484323161);
        term14781 = new Boolean(false);
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
        args[0] = term14776;
        args[1] = null;
        args[2] = term14777;
        args[3] = term14779;
        args[4] = null;
        args[5] = term14781;
        callMethod(klass, "print", argTypes, term14567, args);
    }

};


