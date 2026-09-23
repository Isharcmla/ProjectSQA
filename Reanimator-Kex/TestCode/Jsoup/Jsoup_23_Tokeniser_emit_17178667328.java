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
     Object term5167;
     Object term5403;

    public Tokeniser_emit_17178667328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34814 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term34813 = ((Class) term34814).getDeclaredField((String) "AttributeName");
        ((Field) term34813).setAccessible(true);
        Object enum113 = ((Field) term34813).get((Object) null);
        Class<? extends Object> term35095 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term35094 = ((Class) term35095).getDeclaredField((String) "Doctype");
        ((Field) term35094).setAccessible(true);
        Object enum114 = ((Field) term35094).get((Object) null);
        Class<? extends Object> term35299 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term35298 = ((Class) term35299).getDeclaredField((String) "Comment");
        ((Field) term35298).setAccessible(true);
        Object enum115 = ((Field) term35298).get((Object) null);
        Class<? extends Object> term35517 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term35516 = ((Class) term35517).getDeclaredField((String) "StartTag");
        ((Field) term35516).setAccessible(true);
        Object enum116 = ((Field) term35516).get((Object) null);
        term5167 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term5168 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term5184 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term5206 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5207 = (byte[]) newByteArray(16);
        Object term5226 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5227 = (byte[]) newByteArray(16);
        Object term5246 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term5247 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5248 = (byte[]) newByteArray(16);
        Object term5267 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5268 = (byte[]) newByteArray(16);
        Object term5287 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5288 = (byte[]) newByteArray(16);
        Object term5319 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term5320 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5321 = (byte[]) newByteArray(16);
        Object term5351 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term5389 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5168, term5168.getClass(), "input", "oVcInYnLWB");
        setIntField(term5168, term5168.getClass(), "length", 1622346318);
        setIntField(term5168, term5168.getClass(), "pos", 1048535127);
        setIntField(term5168, term5168.getClass(), "mark", -655067527);
        setField(term5167, term5167.getClass(), "reader", term5168);
        setIntField(term5184, term5184.getClass(), "maxSize", 0);
        setField(term5184, term5184.getClass(), "elementData", null);
        setIntField(term5184, term5184.getClass(), "size", 0);
        setIntField(term5184, term5184.getClass(), "modCount", 0);
        setField(term5167, term5167.getClass(), "errors", term5184);
        setField(term5167, term5167.getClass(), "state", enum113);
        setField(term5167, term5167.getClass(), "emitPending", null);
        setBooleanField(term5167, term5167.getClass(), "isEmitPending", false);
        setField(term5206, term5206.getClass(), "value", term5207);
        setByteField(term5206, term5206.getClass(), "coder", (byte) -29);
        setIntField(term5206, term5206.getClass(), "count", -6029667);
        setField(term5167, term5167.getClass(), "charBuffer", term5206);
        setField(term5226, term5226.getClass(), "value", term5227);
        setByteField(term5226, term5226.getClass(), "coder", (byte) -54);
        setIntField(term5226, term5226.getClass(), "count", -2068769794);
        setField(term5167, term5167.getClass(), "dataBuffer", term5226);
        setField(term5167, term5167.getClass(), "tagPending", null);
        setField(term5247, term5247.getClass(), "value", term5248);
        setByteField(term5247, term5247.getClass(), "coder", (byte) 0);
        setIntField(term5247, term5247.getClass(), "count", 0);
        setField(term5246, term5246.getClass(), "name", term5247);
        setField(term5267, term5267.getClass(), "value", term5268);
        setByteField(term5267, term5267.getClass(), "coder", (byte) 0);
        setIntField(term5267, term5267.getClass(), "count", 0);
        setField(term5246, term5246.getClass(), "publicIdentifier", term5267);
        setField(term5287, term5287.getClass(), "value", term5288);
        setByteField(term5287, term5287.getClass(), "coder", (byte) 0);
        setIntField(term5287, term5287.getClass(), "count", 0);
        setField(term5246, term5246.getClass(), "systemIdentifier", term5287);
        setBooleanField(term5246, term5246.getClass(), "forceQuirks", true);
        setField(term5246, term5246.getClass(), "type", enum114);
        setField(term5167, term5167.getClass(), "doctypePending", term5246);
        setField(term5320, term5320.getClass(), "value", term5321);
        setByteField(term5320, term5320.getClass(), "coder", (byte) 0);
        setIntField(term5320, term5320.getClass(), "count", 0);
        setField(term5319, term5319.getClass(), "data", term5320);
        setField(term5319, term5319.getClass(), "type", enum115);
        setField(term5167, term5167.getClass(), "commentPending", term5319);
        setField(term5351, term5351.getClass(), "tagName", "aJlieCFVtF");
        setField(term5351, term5351.getClass(), "pendingAttributeName", "ZiaGIbnzTs");
        setField(term5351, term5351.getClass(), "pendingAttributeValue", "tbcdzjIfER");
        setBooleanField(term5351, term5351.getClass(), "selfClosing", false);
        setField(term5389, term5389.getClass(), "attributes", null);
        setField(term5351, term5351.getClass(), "attributes", term5389);
        setField(term5351, term5351.getClass(), "type", enum116);
        setField(term5167, term5167.getClass(), "lastStartTag", term5351);
        setBooleanField(term5167, term5167.getClass(), "selfClosingFlagAcknowledged", false);
        term5403 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term5403;
        try {
            callMethod(klass, "emit", argTypes, term5167, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


