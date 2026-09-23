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

public class CSVFormat_print_34244010232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12677;
     Object term12867;

    public CSVFormat_print_34244010232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12679 = new Character('g');
        Character term12682 = new Character('T');
        Character term12833 = new Character('m');
        Class<? extends Object> term13013 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term13012 = ((Class) term13013).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term13012).setAccessible(true);
        Object enum28 = ((Field) term13012).get((Object) null);
        term12677 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12684 = (Object[]) newArray("java.lang.String", 2);
        Object[] term12709 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term12677, term12677.getClass(), "allowMissingColumnNames", true);
        setField(term12677, term12677.getClass(), "commentMarker", term12679);
        setCharField(term12677, term12677.getClass(), "delimiter", 'E');
        setField(term12677, term12677.getClass(), "escapeCharacter", term12682);
        setElement(term12684, 0, "DPskuFUobI");
        setElement(term12684, 1, "wBGfLpNNiZ");
        setField(term12677, term12677.getClass(), "header", term12684);
        setElement(term12709, 0, "yUGCjlqgJE");
        setElement(term12709, 1, "PXdVZyoJyC");
        setElement(term12709, 2, "vLerpqavFM");
        setElement(term12709, 3, "qnvxzwuGKX");
        setElement(term12709, 4, "EdPAvpluZg");
        setElement(term12709, 5, "DzHVBMqWtE");
        setElement(term12709, 6, "THZSpzBRYP");
        setElement(term12709, 7, "ZfBIVGBQOE");
        setElement(term12709, 8, "QSrDQfEsTR");
        setField(term12677, term12677.getClass(), "headerComments", term12709);
        setBooleanField(term12677, term12677.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term12677, term12677.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term12677, term12677.getClass(), "ignoreSurroundingSpaces", false);
        setField(term12677, term12677.getClass(), "nullString", "PsqusYmejD");
        setField(term12677, term12677.getClass(), "quoteCharacter", term12833);
        setField(term12677, term12677.getClass(), "quoteMode", enum28);
        setField(term12677, term12677.getClass(), "recordSeparator", "NTWMiBEaDF");
        setBooleanField(term12677, term12677.getClass(), "skipHeaderRecord", true);
        setBooleanField(term12677, term12677.getClass(), "trailingDelimiter", false);
        setBooleanField(term12677, term12677.getClass(), "trim", true);
        setBooleanField(term12677, term12677.getClass(), "autoFlush", true);
        Class<? extends Object> term13258 = Class.forName((String) "java.io.File$PathStatus");
        Field term13257 = ((Class) term13258).getDeclaredField((String) "INVALID");
        ((Field) term13257).setAccessible(true);
        Object enum29 = ((Field) term13257).get((Object) null);
        term12867 = newInstance(Class.forName("java.io.File"));
        setField(term12867, term12867.getClass(), "path", "SPBstwKFVr");
        setField(term12867, term12867.getClass(), "status", enum29);
        setIntField(term12867, term12867.getClass(), "prefixLength", 568599855);
        setField(term12867, term12867.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = term12867;
        args[1] = null;
        callMethod(klass, "print", argTypes, term12677, args);
    }

};


