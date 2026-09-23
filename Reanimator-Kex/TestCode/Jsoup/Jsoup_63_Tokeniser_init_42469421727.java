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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_init_42469421727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56044;

    public Tokeniser_init_42469421727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56088 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term56087 = ((Class) term56088).getDeclaredField((String) "Data");
        ((Field) term56087).setAccessible(true);
        Object enum160 = ((Field) term56087).get((Object) null);
        Class<? extends Object> term58326 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term58325 = ((Class) term58326).getDeclaredField((String) "StartTag");
        ((Field) term58325).setAccessible(true);
        Object enum161 = ((Field) term58325).get((Object) null);
        Class<? extends Object> term58533 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term58532 = ((Class) term58533).getDeclaredField((String) "EndTag");
        ((Field) term58532).setAccessible(true);
        Object enum162 = ((Field) term58532).get((Object) null);
        Class<? extends Object> term58718 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term58717 = ((Class) term58718).getDeclaredField((String) "Character");
        ((Field) term58717).setAccessible(true);
        Object enum163 = ((Field) term58717).get((Object) null);
        Class<? extends Object> term58960 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term58959 = ((Class) term58960).getDeclaredField((String) "Doctype");
        ((Field) term58959).setAccessible(true);
        Object enum164 = ((Field) term58959).get((Object) null);
        Class<? extends Object> term59164 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term59163 = ((Class) term59164).getDeclaredField((String) "Comment");
        ((Field) term59163).setAccessible(true);
        Object enum165 = ((Field) term59163).get((Object) null);
        term56044 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term56048 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56049 = (byte[]) newByteArray(1024);
        Object term56050 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56051 = (byte[]) newByteArray(1024);
        Object term56052 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term56053 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56054 = (byte[]) newByteArray(16);
        Object term56055 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term56059 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term56060 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56061 = (byte[]) newByteArray(16);
        Object term56065 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term56069 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term56070 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56071 = (byte[]) newByteArray(16);
        Object term56072 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56073 = (byte[]) newByteArray(16);
        Object term56074 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56075 = (byte[]) newByteArray(16);
        Object term56079 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term56080 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56081 = (byte[]) newByteArray(16);
        int[] term56085 = (int[]) newIntArray(1);
        int[] term56086 = (int[]) newIntArray(2);
        setField(term56044, term56044.getClass(), "reader", null);
        setField(term56044, term56044.getClass(), "errors", null);
        setField(term56044, term56044.getClass(), "state", enum160);
        setField(term56044, term56044.getClass(), "emitPending", null);
        setBooleanField(term56044, term56044.getClass(), "isEmitPending", false);
        setField(term56044, term56044.getClass(), "charsString", null);
        setField(term56048, term56048.getClass(), "value", term56049);
        setByteField(term56048, term56048.getClass(), "coder", (byte) 0);
        setIntField(term56048, term56048.getClass(), "count", 0);
        setField(term56044, term56044.getClass(), "charsBuilder", term56048);
        setField(term56050, term56050.getClass(), "value", term56051);
        setByteField(term56050, term56050.getClass(), "coder", (byte) 0);
        setIntField(term56050, term56050.getClass(), "count", 0);
        setField(term56044, term56044.getClass(), "dataBuffer", term56050);
        setField(term56044, term56044.getClass(), "tagPending", null);
        setField(term56052, term56052.getClass(), "tagName", null);
        setField(term56052, term56052.getClass(), "normalName", null);
        setField(term56052, term56052.getClass(), "pendingAttributeName", null);
        setField(term56053, term56053.getClass(), "value", term56054);
        setByteField(term56053, term56053.getClass(), "coder", (byte) 0);
        setIntField(term56053, term56053.getClass(), "count", 0);
        setField(term56052, term56052.getClass(), "pendingAttributeValue", term56053);
        setField(term56052, term56052.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term56052, term56052.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term56052, term56052.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term56052, term56052.getClass(), "selfClosing", false);
        setField(term56055, term56055.getClass(), "attributes", null);
        setField(term56052, term56052.getClass(), "attributes", term56055);
        setField(term56052, term56052.getClass(), "type", enum161);
        setField(term56044, term56044.getClass(), "startPending", term56052);
        setField(term56059, term56059.getClass(), "tagName", null);
        setField(term56059, term56059.getClass(), "normalName", null);
        setField(term56059, term56059.getClass(), "pendingAttributeName", null);
        setField(term56060, term56060.getClass(), "value", term56061);
        setByteField(term56060, term56060.getClass(), "coder", (byte) 0);
        setIntField(term56060, term56060.getClass(), "count", 0);
        setField(term56059, term56059.getClass(), "pendingAttributeValue", term56060);
        setField(term56059, term56059.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term56059, term56059.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term56059, term56059.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term56059, term56059.getClass(), "selfClosing", false);
        setField(term56059, term56059.getClass(), "attributes", null);
        setField(term56059, term56059.getClass(), "type", enum162);
        setField(term56044, term56044.getClass(), "endPending", term56059);
        setField(term56065, term56065.getClass(), "data", null);
        setField(term56065, term56065.getClass(), "type", enum163);
        setField(term56044, term56044.getClass(), "charPending", term56065);
        setField(term56070, term56070.getClass(), "value", term56071);
        setByteField(term56070, term56070.getClass(), "coder", (byte) 0);
        setIntField(term56070, term56070.getClass(), "count", 0);
        setField(term56069, term56069.getClass(), "name", term56070);
        setField(term56069, term56069.getClass(), "pubSysKey", null);
        setField(term56072, term56072.getClass(), "value", term56073);
        setByteField(term56072, term56072.getClass(), "coder", (byte) 0);
        setIntField(term56072, term56072.getClass(), "count", 0);
        setField(term56069, term56069.getClass(), "publicIdentifier", term56072);
        setField(term56074, term56074.getClass(), "value", term56075);
        setByteField(term56074, term56074.getClass(), "coder", (byte) 0);
        setIntField(term56074, term56074.getClass(), "count", 0);
        setField(term56069, term56069.getClass(), "systemIdentifier", term56074);
        setBooleanField(term56069, term56069.getClass(), "forceQuirks", false);
        setField(term56069, term56069.getClass(), "type", enum164);
        setField(term56044, term56044.getClass(), "doctypePending", term56069);
        setField(term56080, term56080.getClass(), "value", term56081);
        setByteField(term56080, term56080.getClass(), "coder", (byte) 0);
        setIntField(term56080, term56080.getClass(), "count", 0);
        setField(term56079, term56079.getClass(), "data", term56080);
        setBooleanField(term56079, term56079.getClass(), "bogus", false);
        setField(term56079, term56079.getClass(), "type", enum165);
        setField(term56044, term56044.getClass(), "commentPending", term56079);
        setField(term56044, term56044.getClass(), "lastStartTag", null);
        setBooleanField(term56044, term56044.getClass(), "selfClosingFlagAcknowledged", true);
        setField(term56044, term56044.getClass(), "codepointHolder", term56085);
        setField(term56044, term56044.getClass(), "multipointHolder", term56086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[1] = Class.forName("org.jsoup.parser.ParseErrorList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56044));
    }

};


