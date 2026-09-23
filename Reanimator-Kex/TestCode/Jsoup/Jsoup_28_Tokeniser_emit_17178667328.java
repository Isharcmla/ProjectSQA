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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Character;

public class Tokeniser_emit_17178667328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5174;
     Object term5413;

    public Tokeniser_emit_17178667328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34681 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term34680 = ((Class) term34681).getDeclaredField((String) "AttributeName");
        ((Field) term34680).setAccessible(true);
        Object enum113 = ((Field) term34680).get((Object) null);
        Class<? extends Object> term34962 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term34961 = ((Class) term34962).getDeclaredField((String) "Doctype");
        ((Field) term34961).setAccessible(true);
        Object enum114 = ((Field) term34961).get((Object) null);
        Class<? extends Object> term35166 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term35165 = ((Class) term35166).getDeclaredField((String) "Comment");
        ((Field) term35165).setAccessible(true);
        Object enum115 = ((Field) term35165).get((Object) null);
        Class<? extends Object> term35390 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term35389 = ((Class) term35390).getDeclaredField((String) "StartTag");
        ((Field) term35389).setAccessible(true);
        Object enum116 = ((Field) term35389).get((Object) null);
        term5174 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term5175 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5176 = (char[]) newCharArray(6);
        Object term5186 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term5208 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5209 = (byte[]) newByteArray(16);
        Object term5228 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5229 = (byte[]) newByteArray(16);
        Object term5248 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term5249 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5250 = (byte[]) newByteArray(16);
        Object term5269 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5270 = (byte[]) newByteArray(16);
        Object term5289 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5290 = (byte[]) newByteArray(16);
        Object term5321 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term5322 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5323 = (byte[]) newByteArray(16);
        Object term5353 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term5378 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5379 = (byte[]) newByteArray(16);
        Object term5399 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term5176, 0, 'b');
        setCharElement(term5176, 1, 'M');
        setCharElement(term5176, 2, 'u');
        setCharElement(term5176, 3, 'L');
        setCharElement(term5176, 4, 'c');
        setCharElement(term5176, 5, 'g');
        setField(term5175, term5175.getClass(), "input", term5176);
        setIntField(term5175, term5175.getClass(), "length", -6029667);
        setIntField(term5175, term5175.getClass(), "pos", -2068769794);
        setIntField(term5175, term5175.getClass(), "mark", -117576464);
        setField(term5174, term5174.getClass(), "reader", term5175);
        setIntField(term5186, term5186.getClass(), "maxSize", 0);
        setField(term5186, term5186.getClass(), "elementData", null);
        setIntField(term5186, term5186.getClass(), "size", 0);
        setIntField(term5186, term5186.getClass(), "modCount", 0);
        setField(term5174, term5174.getClass(), "errors", term5186);
        setField(term5174, term5174.getClass(), "state", enum113);
        setField(term5174, term5174.getClass(), "emitPending", null);
        setBooleanField(term5174, term5174.getClass(), "isEmitPending", false);
        setField(term5208, term5208.getClass(), "value", term5209);
        setByteField(term5208, term5208.getClass(), "coder", (byte) 79);
        setIntField(term5208, term5208.getClass(), "count", -1007160944);
        setField(term5174, term5174.getClass(), "charBuffer", term5208);
        setField(term5228, term5228.getClass(), "value", term5229);
        setByteField(term5228, term5228.getClass(), "coder", (byte) -119);
        setIntField(term5228, term5228.getClass(), "count", 1135664017);
        setField(term5174, term5174.getClass(), "dataBuffer", term5228);
        setField(term5174, term5174.getClass(), "tagPending", null);
        setField(term5249, term5249.getClass(), "value", term5250);
        setByteField(term5249, term5249.getClass(), "coder", (byte) 0);
        setIntField(term5249, term5249.getClass(), "count", 0);
        setField(term5248, term5248.getClass(), "name", term5249);
        setField(term5269, term5269.getClass(), "value", term5270);
        setByteField(term5269, term5269.getClass(), "coder", (byte) 0);
        setIntField(term5269, term5269.getClass(), "count", 0);
        setField(term5248, term5248.getClass(), "publicIdentifier", term5269);
        setField(term5289, term5289.getClass(), "value", term5290);
        setByteField(term5289, term5289.getClass(), "coder", (byte) 0);
        setIntField(term5289, term5289.getClass(), "count", 0);
        setField(term5248, term5248.getClass(), "systemIdentifier", term5289);
        setBooleanField(term5248, term5248.getClass(), "forceQuirks", true);
        setField(term5248, term5248.getClass(), "type", enum114);
        setField(term5174, term5174.getClass(), "doctypePending", term5248);
        setField(term5322, term5322.getClass(), "value", term5323);
        setByteField(term5322, term5322.getClass(), "coder", (byte) 0);
        setIntField(term5322, term5322.getClass(), "count", 0);
        setField(term5321, term5321.getClass(), "data", term5322);
        setField(term5321, term5321.getClass(), "type", enum115);
        setField(term5174, term5174.getClass(), "commentPending", term5321);
        setField(term5353, term5353.getClass(), "tagName", "MjGYSRKTNF");
        setField(term5353, term5353.getClass(), "pendingAttributeName", "hRNSzYYIrc");
        setField(term5378, term5378.getClass(), "value", term5379);
        setByteField(term5378, term5378.getClass(), "coder", (byte) -66);
        setIntField(term5378, term5378.getClass(), "count", 590364439);
        setField(term5353, term5353.getClass(), "pendingAttributeValue", term5378);
        setBooleanField(term5353, term5353.getClass(), "selfClosing", false);
        setField(term5399, term5399.getClass(), "attributes", null);
        setField(term5353, term5353.getClass(), "attributes", term5399);
        setField(term5353, term5353.getClass(), "type", enum116);
        setField(term5174, term5174.getClass(), "lastStartTag", term5353);
        setBooleanField(term5174, term5174.getClass(), "selfClosingFlagAcknowledged", false);
        term5413 = new Character('Q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term5413;
        try {
            callMethod(klass, "emit", argTypes, term5174, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


