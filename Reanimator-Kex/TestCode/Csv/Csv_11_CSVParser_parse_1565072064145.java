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
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.String;

public class CSVParser_parse_1565072064145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355422;
     Object term356081;
     Object term355972;

    public CSVParser_parse_1565072064145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term355474 = new Character((char) 0);
        Character term355526 = new Character((char) 0);
        Character term355578 = new Character((char) 0);
        term355422 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term355180 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term355422, term355422.getClass(), "delimiter", (char) 0);
        setField(term355422, term355422.getClass(), "escape", term355474);
        setField(term355422, term355422.getClass(), "quoteChar", term355526);
        setField(term355422, term355422.getClass(), "commentStart", term355578);
        setBooleanField(term355422, term355422.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term355422, term355422.getClass(), "ignoreEmptyLines", false);
        setField(term355422, term355422.getClass(), "header", term355180);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 1);
        Character term356082 = new Character((char) 0);
        Character term356083 = new Character((char) 0);
        Character term356084 = new Character((char) 0);
        term356081 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term356085 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term356081, term356081.getClass(), "delimiter", (char) 0);
        setField(term356081, term356081.getClass(), "quoteChar", term356082);
        setField(term356081, term356081.getClass(), "quotePolicy", null);
        setField(term356081, term356081.getClass(), "commentStart", term356083);
        setField(term356081, term356081.getClass(), "escape", term356084);
        setBooleanField(term356081, term356081.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term356081, term356081.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term356081, term356081.getClass(), "ignoreEmptyLines", false);
        setField(term356081, term356081.getClass(), "recordSeparator", null);
        setField(term356081, term356081.getClass(), "nullString", null);
        setField(term356081, term356081.getClass(), "header", term356085);
        setBooleanField(term356081, term356081.getClass(), "skipHeaderRecord", false);
        Character term355593 = new Character((char) 0);
        Character term355595 = new Character((char) 0);
        Character term355597 = new Character((char) 0);
        LinkedHashMap term355973 = new LinkedHashMap();
        ArrayList term356003 = new ArrayList();
        Class<? extends Object> term356088 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term356087 = ((Class) term356088).getDeclaredField((String) "EOF");
        ((Field) term356087).setAccessible(true);
        Object enum115 = ((Field) term356087).get((Object) null);
        term355972 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term355591 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term355602 = (Object[]) newArray("java.lang.String", 0);
        Object term355979 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term355986 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term355990 = newInstance(Class.forName("java.io.StringReader"));
        char[] term355995 = (char[]) newCharArray(1);
        Object term356008 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term356016 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term356017 = (byte[]) newByteArray(50);
        setCharField(term355591, term355591.getClass(), "delimiter", (char) 0);
        setField(term355591, term355591.getClass(), "quoteChar", term355593);
        setField(term355591, term355591.getClass(), "quotePolicy", null);
        setField(term355591, term355591.getClass(), "commentStart", term355595);
        setField(term355591, term355591.getClass(), "escape", term355597);
        setBooleanField(term355591, term355591.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term355591, term355591.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term355591, term355591.getClass(), "ignoreEmptyLines", false);
        setField(term355591, term355591.getClass(), "recordSeparator", null);
        setField(term355591, term355591.getClass(), "nullString", null);
        setField(term355591, term355591.getClass(), "header", term355602);
        setBooleanField(term355591, term355591.getClass(), "skipHeaderRecord", false);
        setField(term355972, term355972.getClass(), "format", term355591);
        setField(term355972, term355972.getClass(), "headerMap", term355973);
        setCharField(term355979, term355979.getClass(), "delimiter", (char) 0);
        setCharField(term355979, term355979.getClass(), "escape", (char) 0);
        setCharField(term355979, term355979.getClass(), "quoteChar", (char) 0);
        setCharField(term355979, term355979.getClass(), "commentStart", (char) 0);
        setBooleanField(term355979, term355979.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term355979, term355979.getClass(), "ignoreEmptyLines", false);
        setIntField(term355986, term355986.getClass(), "lastChar", -1);
        setLongField(term355986, term355986.getClass(), "eolCounter", 0L);
        setBooleanField(term355986, term355986.getClass(), "closed", false);
        setField(term355990, term355990.getClass(), "str", "");
        setIntField(term355990, term355990.getClass(), "length", 0);
        setIntField(term355990, term355990.getClass(), "next", 0);
        setIntField(term355990, term355990.getClass(), "mark", 0);
        setField(term355990, term355990.getClass(), "lock", term355990);
        setField(term355990, term355990.getClass(), "skipBuffer", null);
        setField(term355986, term355986.getClass(), "in", term355990);
        setField(term355986, term355986.getClass(), "cb", term355995);
        setIntField(term355986, term355986.getClass(), "nChars", 0);
        setIntField(term355986, term355986.getClass(), "nextChar", 0);
        setIntField(term355986, term355986.getClass(), "markedChar", -1);
        setIntField(term355986, term355986.getClass(), "readAheadLimit", 0);
        setBooleanField(term355986, term355986.getClass(), "skipLF", false);
        setBooleanField(term355986, term355986.getClass(), "markedSkipLF", false);
        setField(term355986, term355986.getClass(), "lock", term355990);
        setField(term355986, term355986.getClass(), "skipBuffer", null);
        setField(term355979, term355979.getClass(), "reader", term355986);
        setField(term355972, term355972.getClass(), "lexer", term355979);
        setField(term355972, term355972.getClass(), "record", term356003);
        setLongField(term355972, term355972.getClass(), "recordNumber", 0L);
        setField(term356008, term356008.getClass(), "type", enum115);
        setField(term356016, term356016.getClass(), "value", term356017);
        setByteField(term356016, term356016.getClass(), "coder", (byte) 0);
        setIntField(term356016, term356016.getClass(), "count", 0);
        setField(term356008, term356008.getClass(), "content", term356016);
        setBooleanField(term356008, term356008.getClass(), "isReady", false);
        setField(term355972, term355972.getClass(), "reusableToken", term356008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term355422;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term355422, term356081));
        assertTrue(recursiveEquals(retValue, term355972));
    }

};


