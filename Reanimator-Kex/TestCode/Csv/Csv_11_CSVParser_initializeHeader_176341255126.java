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

public class CSVParser_initializeHeader_176341255126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6278;

    public CSVParser_initializeHeader_176341255126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6281 = new Character('F');
        Class<? extends Object> term154253 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term154252 = ((Class) term154253).getDeclaredField((String) "NONE");
        ((Field) term154252).setAccessible(true);
        Object enum57 = ((Field) term154252).get((Object) null);
        Character term6291 = new Character('p');
        Character term6293 = new Character('a');
        HashMap term6348 = new HashMap();
        ArrayList term6387 = new ArrayList();
        ((ArrayList) term6387).add("fztQhjqwdP");
        ((ArrayList) term6387).add("eVpkWxjuki");
        ((ArrayList) term6387).add("SJiQaLvSKv");
        ((ArrayList) term6387).add("OEXDRUKcFl");
        ((ArrayList) term6387).add("RYdKCNNMBR");
        Class<? extends Object> term154510 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term154509 = ((Class) term154510).getDeclaredField((String) "INVALID");
        ((Field) term154509).setAccessible(true);
        Object enum58 = ((Field) term154509).get((Object) null);
        term6278 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term6279 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6322 = (Object[]) newArray("java.lang.String", 2);
        Object term6359 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term6366 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term6370 = (char[]) newCharArray(5);
        Object term6382 = newInstance(Class.forName("java.lang.Object"));
        char[] term6383 = (char[]) newCharArray(3);
        Object term6452 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term6464 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6465 = (byte[]) newByteArray(50);
        setCharField(term6279, term6279.getClass(), "delimiter", 'Q');
        setField(term6279, term6279.getClass(), "quoteChar", term6281);
        setField(term6279, term6279.getClass(), "quotePolicy", enum57);
        setField(term6279, term6279.getClass(), "commentStart", term6291);
        setField(term6279, term6279.getClass(), "escape", term6293);
        setBooleanField(term6279, term6279.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6279, term6279.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term6279, term6279.getClass(), "ignoreEmptyLines", false);
        setField(term6279, term6279.getClass(), "recordSeparator", "QXzGXbEXMu");
        setField(term6279, term6279.getClass(), "nullString", "qxSDVejjiY");
        setElement(term6322, 0, "xBsXSDjXYK");
        setElement(term6322, 1, "sEnIVFtZuQ");
        setField(term6279, term6279.getClass(), "header", term6322);
        setBooleanField(term6279, term6279.getClass(), "skipHeaderRecord", true);
        setField(term6278, term6278.getClass(), "format", term6279);
        setField(term6278, term6278.getClass(), "headerMap", term6348);
        setCharField(term6359, term6359.getClass(), "delimiter", 'H');
        setCharField(term6359, term6359.getClass(), "escape", 'E');
        setCharField(term6359, term6359.getClass(), "quoteChar", 'w');
        setCharField(term6359, term6359.getClass(), "commentStart", 'X');
        setBooleanField(term6359, term6359.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6359, term6359.getClass(), "ignoreEmptyLines", true);
        setIntField(term6366, term6366.getClass(), "lastChar", -1530420153);
        setLongField(term6366, term6366.getClass(), "eolCounter", -5476826692763582090L);
        setBooleanField(term6366, term6366.getClass(), "closed", true);
        setField(term6366, term6366.getClass(), "in", null);
        setCharElement(term6370, 0, 'R');
        setCharElement(term6370, 1, 'o');
        setCharElement(term6370, 2, 'V');
        setCharElement(term6370, 3, 'c');
        setCharElement(term6370, 4, 'I');
        setField(term6366, term6366.getClass(), "cb", term6370);
        setIntField(term6366, term6366.getClass(), "nChars", -469968304);
        setIntField(term6366, term6366.getClass(), "nextChar", -1145578966);
        setIntField(term6366, term6366.getClass(), "markedChar", 679763016);
        setIntField(term6366, term6366.getClass(), "readAheadLimit", 1962444399);
        setBooleanField(term6366, term6366.getClass(), "skipLF", true);
        setBooleanField(term6366, term6366.getClass(), "markedSkipLF", false);
        setField(term6366, term6366.getClass(), "lock", term6382);
        setCharElement(term6383, 0, 'n');
        setCharElement(term6383, 1, 'Y');
        setCharElement(term6383, 2, 'n');
        setField(term6366, term6366.getClass(), "skipBuffer", term6383);
        setField(term6359, term6359.getClass(), "reader", term6366);
        setField(term6278, term6278.getClass(), "lexer", term6359);
        setField(term6278, term6278.getClass(), "record", term6387);
        setLongField(term6278, term6278.getClass(), "recordNumber", -872011222785455006L);
        setField(term6452, term6452.getClass(), "type", enum58);
        setField(term6464, term6464.getClass(), "value", term6465);
        setByteField(term6464, term6464.getClass(), "coder", (byte) 0);
        setIntField(term6464, term6464.getClass(), "count", 0);
        setField(term6452, term6452.getClass(), "content", term6464);
        setBooleanField(term6452, term6452.getClass(), "isReady", false);
        setField(term6278, term6278.getClass(), "reusableToken", term6452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term6278, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


