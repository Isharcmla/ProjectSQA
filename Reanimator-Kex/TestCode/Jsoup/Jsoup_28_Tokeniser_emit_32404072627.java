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
import java.lang.OutOfMemoryError;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_32404072627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4007;

    public Tokeniser_emit_32404072627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33481 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term33480 = ((Class) term33481).getDeclaredField((String) "AttributeName");
        ((Field) term33480).setAccessible(true);
        Object enum109 = ((Field) term33480).get((Object) null);
        Class<? extends Object> term33762 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33761 = ((Class) term33762).getDeclaredField((String) "Doctype");
        ((Field) term33761).setAccessible(true);
        Object enum110 = ((Field) term33761).get((Object) null);
        Class<? extends Object> term33966 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33965 = ((Class) term33966).getDeclaredField((String) "Comment");
        ((Field) term33965).setAccessible(true);
        Object enum111 = ((Field) term33965).get((Object) null);
        Class<? extends Object> term34190 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term34189 = ((Class) term34190).getDeclaredField((String) "StartTag");
        ((Field) term34189).setAccessible(true);
        Object enum112 = ((Field) term34189).get((Object) null);
        term4007 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term4008 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4009 = (char[]) newCharArray(6);
        Object term4019 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term4041 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4042 = (byte[]) newByteArray(16);
        Object term4061 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4062 = (byte[]) newByteArray(16);
        Object term4081 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term4082 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4083 = (byte[]) newByteArray(16);
        Object term4102 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4103 = (byte[]) newByteArray(16);
        Object term4122 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4123 = (byte[]) newByteArray(16);
        Object term4154 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term4155 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4156 = (byte[]) newByteArray(16);
        Object term4186 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term4211 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4212 = (byte[]) newByteArray(16);
        Object term4232 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term4009, 0, 'J');
        setCharElement(term4009, 1, 'A');
        setCharElement(term4009, 2, 'E');
        setCharElement(term4009, 3, 't');
        setCharElement(term4009, 4, 'R');
        setCharElement(term4009, 5, 'r');
        setField(term4008, term4008.getClass(), "input", term4009);
        setIntField(term4008, term4008.getClass(), "length", 597278769);
        setIntField(term4008, term4008.getClass(), "pos", -1685132342);
        setIntField(term4008, term4008.getClass(), "mark", -1456670397);
        setField(term4007, term4007.getClass(), "reader", term4008);
        setIntField(term4019, term4019.getClass(), "maxSize", 0);
        setField(term4019, term4019.getClass(), "elementData", null);
        setIntField(term4019, term4019.getClass(), "size", 0);
        setIntField(term4019, term4019.getClass(), "modCount", 0);
        setField(term4007, term4007.getClass(), "errors", term4019);
        setField(term4007, term4007.getClass(), "state", enum109);
        setField(term4007, term4007.getClass(), "emitPending", null);
        setBooleanField(term4007, term4007.getClass(), "isEmitPending", false);
        setField(term4041, term4041.getClass(), "value", term4042);
        setByteField(term4041, term4041.getClass(), "coder", (byte) -29);
        setIntField(term4041, term4041.getClass(), "count", 1622346318);
        setField(term4007, term4007.getClass(), "charBuffer", term4041);
        setField(term4061, term4061.getClass(), "value", term4062);
        setByteField(term4061, term4061.getClass(), "coder", (byte) -54);
        setIntField(term4061, term4061.getClass(), "count", 1048535127);
        setField(term4007, term4007.getClass(), "dataBuffer", term4061);
        setField(term4007, term4007.getClass(), "tagPending", null);
        setField(term4082, term4082.getClass(), "value", term4083);
        setByteField(term4082, term4082.getClass(), "coder", (byte) 0);
        setIntField(term4082, term4082.getClass(), "count", 0);
        setField(term4081, term4081.getClass(), "name", term4082);
        setField(term4102, term4102.getClass(), "value", term4103);
        setByteField(term4102, term4102.getClass(), "coder", (byte) 0);
        setIntField(term4102, term4102.getClass(), "count", 0);
        setField(term4081, term4081.getClass(), "publicIdentifier", term4102);
        setField(term4122, term4122.getClass(), "value", term4123);
        setByteField(term4122, term4122.getClass(), "coder", (byte) 0);
        setIntField(term4122, term4122.getClass(), "count", 0);
        setField(term4081, term4081.getClass(), "systemIdentifier", term4122);
        setBooleanField(term4081, term4081.getClass(), "forceQuirks", true);
        setField(term4081, term4081.getClass(), "type", enum110);
        setField(term4007, term4007.getClass(), "doctypePending", term4081);
        setField(term4155, term4155.getClass(), "value", term4156);
        setByteField(term4155, term4155.getClass(), "coder", (byte) 0);
        setIntField(term4155, term4155.getClass(), "count", 0);
        setField(term4154, term4154.getClass(), "data", term4155);
        setField(term4154, term4154.getClass(), "type", enum111);
        setField(term4007, term4007.getClass(), "commentPending", term4154);
        setField(term4186, term4186.getClass(), "tagName", "jJCZpVmanW");
        setField(term4186, term4186.getClass(), "pendingAttributeName", "EGtDIRbSSb");
        setField(term4211, term4211.getClass(), "value", term4212);
        setByteField(term4211, term4211.getClass(), "coder", (byte) -10);
        setIntField(term4211, term4211.getClass(), "count", -655067527);
        setField(term4186, term4186.getClass(), "pendingAttributeValue", term4211);
        setBooleanField(term4186, term4186.getClass(), "selfClosing", false);
        setField(term4232, term4232.getClass(), "attributes", null);
        setField(term4186, term4186.getClass(), "attributes", term4232);
        setField(term4186, term4186.getClass(), "type", enum112);
        setField(term4007, term4007.getClass(), "lastStartTag", term4186);
        setBooleanField(term4007, term4007.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        try {
            callMethod(klass, "emit", argTypes, term4007, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


