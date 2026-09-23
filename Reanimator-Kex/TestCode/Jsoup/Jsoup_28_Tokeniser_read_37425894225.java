package org.jsoup.parser;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_read_37425894225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Tokeniser_read_37425894225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30184 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term30183 = ((Class) term30184).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term30183).setAccessible(true);
        Object enum97 = ((Field) term30183).get((Object) null);
        Class<? extends Object> term30483 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term30482 = ((Class) term30483).getDeclaredField((String) "Doctype");
        ((Field) term30482).setAccessible(true);
        Object enum98 = ((Field) term30482).get((Object) null);
        Class<? extends Object> term30687 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term30686 = ((Class) term30687).getDeclaredField((String) "Comment");
        ((Field) term30686).setAccessible(true);
        Object enum99 = ((Field) term30686).get((Object) null);
        Class<? extends Object> term30911 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term30910 = ((Class) term30911).getDeclaredField((String) "StartTag");
        ((Field) term30910).setAccessible(true);
        Object enum100 = ((Field) term30910).get((Object) null);
        term1 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term2 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3 = (char[]) newCharArray(4);
        Object term11 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term39 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term40 = (byte[]) newByteArray(16);
        Object term59 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term60 = (byte[]) newByteArray(16);
        Object term79 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term80 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term81 = (byte[]) newByteArray(16);
        Object term100 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term101 = (byte[]) newByteArray(16);
        Object term120 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term121 = (byte[]) newByteArray(16);
        Object term152 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term153 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term154 = (byte[]) newByteArray(16);
        Object term184 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term209 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term210 = (byte[]) newByteArray(16);
        Object term230 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term3, 0, 'n');
        setCharElement(term3, 1, 'Z');
        setCharElement(term3, 2, 't');
        setCharElement(term3, 3, 'T');
        setField(term2, term2.getClass(), "input", term3);
        setIntField(term2, term2.getClass(), "length", 391863371);
        setIntField(term2, term2.getClass(), "pos", -1922583790);
        setIntField(term2, term2.getClass(), "mark", -616727354);
        setField(term1, term1.getClass(), "reader", term2);
        setIntField(term11, term11.getClass(), "maxSize", 0);
        setField(term11, term11.getClass(), "elementData", null);
        setIntField(term11, term11.getClass(), "size", 0);
        setIntField(term11, term11.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "errors", term11);
        setField(term1, term1.getClass(), "state", enum97);
        setField(term1, term1.getClass(), "emitPending", null);
        setBooleanField(term1, term1.getClass(), "isEmitPending", false);
        setField(term39, term39.getClass(), "value", term40);
        setByteField(term39, term39.getClass(), "coder", (byte) 47);
        setIntField(term39, term39.getClass(), "count", -1955890973);
        setField(term1, term1.getClass(), "charBuffer", term39);
        setField(term59, term59.getClass(), "value", term60);
        setByteField(term59, term59.getClass(), "coder", (byte) 48);
        setIntField(term59, term59.getClass(), "count", -2038273078);
        setField(term1, term1.getClass(), "dataBuffer", term59);
        setField(term1, term1.getClass(), "tagPending", null);
        setField(term80, term80.getClass(), "value", term81);
        setByteField(term80, term80.getClass(), "coder", (byte) 0);
        setIntField(term80, term80.getClass(), "count", 0);
        setField(term79, term79.getClass(), "name", term80);
        setField(term100, term100.getClass(), "value", term101);
        setByteField(term100, term100.getClass(), "coder", (byte) 0);
        setIntField(term100, term100.getClass(), "count", 0);
        setField(term79, term79.getClass(), "publicIdentifier", term100);
        setField(term120, term120.getClass(), "value", term121);
        setByteField(term120, term120.getClass(), "coder", (byte) 0);
        setIntField(term120, term120.getClass(), "count", 0);
        setField(term79, term79.getClass(), "systemIdentifier", term120);
        setBooleanField(term79, term79.getClass(), "forceQuirks", false);
        setField(term79, term79.getClass(), "type", enum98);
        setField(term1, term1.getClass(), "doctypePending", term79);
        setField(term153, term153.getClass(), "value", term154);
        setByteField(term153, term153.getClass(), "coder", (byte) 0);
        setIntField(term153, term153.getClass(), "count", 0);
        setField(term152, term152.getClass(), "data", term153);
        setField(term152, term152.getClass(), "type", enum99);
        setField(term1, term1.getClass(), "commentPending", term152);
        setField(term184, term184.getClass(), "tagName", "PAEBtnZtTD");
        setField(term184, term184.getClass(), "pendingAttributeName", "sjlJAEtRrb");
        setField(term209, term209.getClass(), "value", term210);
        setByteField(term209, term209.getClass(), "coder", (byte) 89);
        setIntField(term209, term209.getClass(), "count", 1227103734);
        setField(term184, term184.getClass(), "pendingAttributeValue", term209);
        setBooleanField(term184, term184.getClass(), "selfClosing", false);
        setField(term230, term230.getClass(), "attributes", null);
        setField(term184, term184.getClass(), "attributes", term230);
        setField(term184, term184.getClass(), "type", enum100);
        setField(term1, term1.getClass(), "lastStartTag", term184);
        setBooleanField(term1, term1.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term1, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


