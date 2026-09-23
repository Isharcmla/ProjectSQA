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
import java.io.IOException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;

public class CSVParser_initializeHeader_176341255124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6266;

    public CSVParser_initializeHeader_176341255124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6269 = new Character('E');
        Class<? extends Object> term21431 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term21430 = ((Class) term21431).getDeclaredField((String) "MINIMAL");
        ((Field) term21430).setAccessible(true);
        Object enum55 = ((Field) term21430).get((Object) null);
        Character term6282 = new Character('T');
        Character term6284 = new Character('m');
        HashMap term6398 = new HashMap();
        ArrayList term6437 = new ArrayList();
        ((ArrayList) term6437).add("XPKmummaqg");
        ((ArrayList) term6437).add("BKLfkLiZTH");
        ((ArrayList) term6437).add("SPpkrGcPRr");
        ((ArrayList) term6437).add("sEccwbJKYE");
        ((ArrayList) term6437).add("AWRooQKkdW");
        ((ArrayList) term6437).add("vjxIhXHxGR");
        Class<? extends Object> term21757 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term21756 = ((Class) term21757).getDeclaredField((String) "INVALID");
        ((Field) term21756).setAccessible(true);
        Object enum56 = ((Field) term21756).get((Object) null);
        term6266 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term6267 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6312 = (Object[]) newArray("java.lang.String", 7);
        Object term6409 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term6416 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term6420 = (char[]) newCharArray(2);
        Object term6429 = newInstance(Class.forName("java.lang.Object"));
        char[] term6430 = (char[]) newCharArray(6);
        Object term6514 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term6526 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6527 = (byte[]) newByteArray(50);
        setCharField(term6267, term6267.getClass(), "delimiter", 'g');
        setField(term6267, term6267.getClass(), "quoteChar", term6269);
        setField(term6267, term6267.getClass(), "quotePolicy", enum55);
        setField(term6267, term6267.getClass(), "commentStart", term6282);
        setField(term6267, term6267.getClass(), "escape", term6284);
        setBooleanField(term6267, term6267.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6267, term6267.getClass(), "ignoreEmptyLines", true);
        setField(term6267, term6267.getClass(), "recordSeparator", "PkWMRdJcBb");
        setField(term6267, term6267.getClass(), "nullString", "jSpAteRute");
        setElement(term6312, 0, "swZVeJAxjt");
        setElement(term6312, 1, "xOcJIiQQDu");
        setElement(term6312, 2, "GVizqqzXpy");
        setElement(term6312, 3, "JqXGgAhZPl");
        setElement(term6312, 4, "jiKYgYHqIS");
        setElement(term6312, 5, "DfISiziTgG");
        setElement(term6312, 6, "XqgfKFvPSD");
        setField(term6267, term6267.getClass(), "header", term6312);
        setBooleanField(term6267, term6267.getClass(), "skipHeaderRecord", true);
        setField(term6266, term6266.getClass(), "format", term6267);
        setField(term6266, term6266.getClass(), "headerMap", term6398);
        setCharField(term6409, term6409.getClass(), "delimiter", 'J');
        setCharField(term6409, term6409.getClass(), "escape", 'M');
        setCharField(term6409, term6409.getClass(), "quoteChar", 'x');
        setCharField(term6409, term6409.getClass(), "commentStart", 'l');
        setBooleanField(term6409, term6409.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6409, term6409.getClass(), "ignoreEmptyLines", false);
        setIntField(term6416, term6416.getClass(), "lastChar", -1179120542);
        setLongField(term6416, term6416.getClass(), "eolCounter", -4325723315152823407L);
        setBooleanField(term6416, term6416.getClass(), "closed", false);
        setField(term6416, term6416.getClass(), "in", null);
        setCharElement(term6420, 0, 's');
        setCharElement(term6420, 1, 'z');
        setField(term6416, term6416.getClass(), "cb", term6420);
        setIntField(term6416, term6416.getClass(), "nChars", -73683645);
        setIntField(term6416, term6416.getClass(), "nextChar", -226514366);
        setIntField(term6416, term6416.getClass(), "markedChar", 1193880199);
        setIntField(term6416, term6416.getClass(), "readAheadLimit", -1087774327);
        setBooleanField(term6416, term6416.getClass(), "skipLF", false);
        setBooleanField(term6416, term6416.getClass(), "markedSkipLF", false);
        setField(term6416, term6416.getClass(), "lock", term6429);
        setCharElement(term6430, 0, 'Y');
        setCharElement(term6430, 1, 'V');
        setCharElement(term6430, 2, 'z');
        setCharElement(term6430, 3, 'R');
        setCharElement(term6430, 4, 'f');
        setCharElement(term6430, 5, 'L');
        setField(term6416, term6416.getClass(), "skipBuffer", term6430);
        setField(term6409, term6409.getClass(), "in", term6416);
        setField(term6266, term6266.getClass(), "lexer", term6409);
        setField(term6266, term6266.getClass(), "record", term6437);
        setLongField(term6266, term6266.getClass(), "recordNumber", 2535595959091595249L);
        setField(term6514, term6514.getClass(), "type", enum56);
        setField(term6526, term6526.getClass(), "value", term6527);
        setByteField(term6526, term6526.getClass(), "coder", (byte) 0);
        setIntField(term6526, term6526.getClass(), "count", 0);
        setField(term6514, term6514.getClass(), "content", term6526);
        setBooleanField(term6514, term6514.getClass(), "isReady", false);
        setField(term6266, term6266.getClass(), "reusableToken", term6514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term6266, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


