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

public class CSVFormat_withCommentStart_70744564366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7388;
     Object term7492;
     Object term29865;
     Object term29887;
     Object term29565;

    public CSVFormat_withCommentStart_70744564366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7390 = new Character('g');
        Class<? extends Object> term29889 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term29888 = ((Class) term29889).getDeclaredField((String) "NONE");
        ((Field) term29888).setAccessible(true);
        Object enum86 = ((Field) term29888).get((Object) null);
        Character term7400 = new Character('n');
        Character term7402 = new Character('e');
        term7388 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7430 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term7388, term7388.getClass(), "delimiter", 'G');
        setField(term7388, term7388.getClass(), "quoteChar", term7390);
        setField(term7388, term7388.getClass(), "quotePolicy", enum86);
        setField(term7388, term7388.getClass(), "commentStart", term7400);
        setField(term7388, term7388.getClass(), "escape", term7402);
        setBooleanField(term7388, term7388.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term7388, term7388.getClass(), "ignoreEmptyLines", false);
        setField(term7388, term7388.getClass(), "recordSeparator", "gCWtLVKVVe");
        setField(term7388, term7388.getClass(), "nullString", "fWKJoSoCwE");
        setElement(term7430, 0, "wfaXBpWAUH");
        setElement(term7430, 1, "VMeAzAHwZj");
        setElement(term7430, 2, "PznxWXsZME");
        setElement(term7430, 3, "ZzIujlwVsw");
        setElement(term7430, 4, "LWyEaeIyAo");
        setField(term7388, term7388.getClass(), "header", term7430);
        setBooleanField(term7388, term7388.getClass(), "skipHeaderRecord", false);
        term7492 = new Character('N');
        Character term29866 = new Character('g');
        Class<? extends Object> term30118 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term30117 = ((Class) term30118).getDeclaredField((String) "NONE");
        ((Field) term30117).setAccessible(true);
        Object enum87 = ((Field) term30117).get((Object) null);
        Character term29870 = new Character('n');
        Character term29871 = new Character('e');
        term29865 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29876 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term29865, term29865.getClass(), "delimiter", 'G');
        setField(term29865, term29865.getClass(), "quoteChar", term29866);
        setField(term29865, term29865.getClass(), "quotePolicy", enum87);
        setField(term29865, term29865.getClass(), "commentStart", term29870);
        setField(term29865, term29865.getClass(), "escape", term29871);
        setBooleanField(term29865, term29865.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term29865, term29865.getClass(), "ignoreEmptyLines", false);
        setField(term29865, term29865.getClass(), "recordSeparator", "gCWtLVKVVe");
        setField(term29865, term29865.getClass(), "nullString", "fWKJoSoCwE");
        setElement(term29876, 0, "wfaXBpWAUH");
        setElement(term29876, 1, "VMeAzAHwZj");
        setElement(term29876, 2, "PznxWXsZME");
        setElement(term29876, 3, "ZzIujlwVsw");
        setElement(term29876, 4, "LWyEaeIyAo");
        setField(term29865, term29865.getClass(), "header", term29876);
        setBooleanField(term29865, term29865.getClass(), "skipHeaderRecord", false);
        term29887 = new Character('N');
        Character term29567 = new Character('g');
        Class<? extends Object> term30347 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term30346 = ((Class) term30347).getDeclaredField((String) "NONE");
        ((Field) term30346).setAccessible(true);
        Object enum88 = ((Field) term30346).get((Object) null);
        Character term29577 = new Character('N');
        Character term29579 = new Character('e');
        term29565 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29607 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term29565, term29565.getClass(), "delimiter", 'G');
        setField(term29565, term29565.getClass(), "quoteChar", term29567);
        setField(term29565, term29565.getClass(), "quotePolicy", enum88);
        setField(term29565, term29565.getClass(), "commentStart", term29577);
        setField(term29565, term29565.getClass(), "escape", term29579);
        setBooleanField(term29565, term29565.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term29565, term29565.getClass(), "ignoreEmptyLines", false);
        setField(term29565, term29565.getClass(), "recordSeparator", "gCWtLVKVVe");
        setField(term29565, term29565.getClass(), "nullString", "fWKJoSoCwE");
        setElement(term29607, 0, "wfaXBpWAUH");
        setElement(term29607, 1, "VMeAzAHwZj");
        setElement(term29607, 2, "PznxWXsZME");
        setElement(term29607, 3, "ZzIujlwVsw");
        setElement(term29607, 4, "LWyEaeIyAo");
        setField(term29565, term29565.getClass(), "header", term29607);
        setBooleanField(term29565, term29565.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term7492;
        Object retValue = callMethod(klass, "withCommentStart", argTypes, term7388, args);
        assertTrue(recursiveEquals(term7388, term29865));
        assertTrue(recursiveEquals(term7492, term29887));
        assertTrue(recursiveEquals(retValue, term29565));
    }

};


