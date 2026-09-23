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

public class CSVParser_parse_156507206439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179594;
     Object term180289;
     Object term180173;

    public CSVParser_parse_156507206439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term179646 = new Character((char) 17448);
        Character term179698 = new Character((char) 0);
        Character term179750 = new Character((char) 17448);
        term179594 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term177016 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term179594, term179594.getClass(), "delimiter", (char) 17448);
        setField(term179594, term179594.getClass(), "escape", term179646);
        setField(term179594, term179594.getClass(), "quoteChar", term179698);
        setField(term179594, term179594.getClass(), "commentStart", term179750);
        setBooleanField(term179594, term179594.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term179594, term179594.getClass(), "ignoreEmptyLines", true);
        setField(term179594, term179594.getClass(), "header", term177016);
        setBooleanField(term179594, term179594.getClass(), "skipHeaderRecord", true);
        setIntField(null, Class.forName("java.io.BufferedReader"), "defaultCharBufferSize", 8);
        Character term180290 = new Character((char) 0);
        Character term180291 = new Character((char) 17448);
        Character term180292 = new Character((char) 17448);
        term180289 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term180293 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term180289, term180289.getClass(), "delimiter", (char) 17448);
        setField(term180289, term180289.getClass(), "quoteChar", term180290);
        setField(term180289, term180289.getClass(), "quotePolicy", null);
        setField(term180289, term180289.getClass(), "commentStart", term180291);
        setField(term180289, term180289.getClass(), "escape", term180292);
        setBooleanField(term180289, term180289.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term180289, term180289.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term180289, term180289.getClass(), "ignoreEmptyLines", true);
        setField(term180289, term180289.getClass(), "recordSeparator", null);
        setField(term180289, term180289.getClass(), "nullString", null);
        setField(term180289, term180289.getClass(), "header", term180293);
        setBooleanField(term180289, term180289.getClass(), "skipHeaderRecord", true);
        Character term179765 = new Character((char) 0);
        Character term179767 = new Character((char) 17448);
        Character term179769 = new Character((char) 17448);
        LinkedHashMap term180174 = new LinkedHashMap();
        ArrayList term180211 = new ArrayList();
        Class<? extends Object> term180303 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term180302 = ((Class) term180303).getDeclaredField((String) "EOF");
        ((Field) term180302).setAccessible(true);
        Object enum74 = ((Field) term180302).get((Object) null);
        term180173 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term179763 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term179774 = (Object[]) newArray("java.lang.String", 0);
        Object term180180 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term180187 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        Object term180191 = newInstance(Class.forName("java.io.StringReader"));
        char[] term180196 = (char[]) newCharArray(8);
        Object term180216 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term180224 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term180225 = (byte[]) newByteArray(50);
        setCharField(term179763, term179763.getClass(), "delimiter", (char) 17448);
        setField(term179763, term179763.getClass(), "quoteChar", term179765);
        setField(term179763, term179763.getClass(), "quotePolicy", null);
        setField(term179763, term179763.getClass(), "commentStart", term179767);
        setField(term179763, term179763.getClass(), "escape", term179769);
        setBooleanField(term179763, term179763.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term179763, term179763.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term179763, term179763.getClass(), "ignoreEmptyLines", true);
        setField(term179763, term179763.getClass(), "recordSeparator", null);
        setField(term179763, term179763.getClass(), "nullString", null);
        setField(term179763, term179763.getClass(), "header", term179774);
        setBooleanField(term179763, term179763.getClass(), "skipHeaderRecord", true);
        setField(term180173, term180173.getClass(), "format", term179763);
        setField(term180173, term180173.getClass(), "headerMap", term180174);
        setCharField(term180180, term180180.getClass(), "delimiter", (char) 17448);
        setCharField(term180180, term180180.getClass(), "escape", (char) 17448);
        setCharField(term180180, term180180.getClass(), "quoteChar", (char) 0);
        setCharField(term180180, term180180.getClass(), "commentStart", (char) 17448);
        setBooleanField(term180180, term180180.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term180180, term180180.getClass(), "ignoreEmptyLines", true);
        setIntField(term180187, term180187.getClass(), "lastChar", -1);
        setLongField(term180187, term180187.getClass(), "eolCounter", 0L);
        setBooleanField(term180187, term180187.getClass(), "closed", false);
        setField(term180191, term180191.getClass(), "str", "");
        setIntField(term180191, term180191.getClass(), "length", 0);
        setIntField(term180191, term180191.getClass(), "next", 0);
        setIntField(term180191, term180191.getClass(), "mark", 0);
        setField(term180191, term180191.getClass(), "lock", term180191);
        setField(term180191, term180191.getClass(), "skipBuffer", null);
        setField(term180187, term180187.getClass(), "in", term180191);
        setField(term180187, term180187.getClass(), "cb", term180196);
        setIntField(term180187, term180187.getClass(), "nChars", 0);
        setIntField(term180187, term180187.getClass(), "nextChar", 0);
        setIntField(term180187, term180187.getClass(), "markedChar", -1);
        setIntField(term180187, term180187.getClass(), "readAheadLimit", 0);
        setBooleanField(term180187, term180187.getClass(), "skipLF", false);
        setBooleanField(term180187, term180187.getClass(), "markedSkipLF", false);
        setField(term180187, term180187.getClass(), "lock", term180191);
        setField(term180187, term180187.getClass(), "skipBuffer", null);
        setField(term180180, term180180.getClass(), "reader", term180187);
        setField(term180173, term180173.getClass(), "lexer", term180180);
        setField(term180173, term180173.getClass(), "record", term180211);
        setLongField(term180173, term180173.getClass(), "recordNumber", 0L);
        setField(term180216, term180216.getClass(), "type", enum74);
        setField(term180224, term180224.getClass(), "value", term180225);
        setByteField(term180224, term180224.getClass(), "coder", (byte) 0);
        setIntField(term180224, term180224.getClass(), "count", 0);
        setField(term180216, term180216.getClass(), "content", term180224);
        setBooleanField(term180216, term180216.getClass(), "isReady", false);
        setField(term180173, term180173.getClass(), "reusableToken", term180216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term179594;
        Object retValue = callMethod(klass, "parse", argTypes, null, args);
        assertTrue(recursiveEquals(term179594, term180289));
        assertTrue(recursiveEquals(retValue, term180173));
    }

};


