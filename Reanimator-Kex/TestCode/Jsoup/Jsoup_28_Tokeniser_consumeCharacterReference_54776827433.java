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
import java.lang.Character;
import java.lang.Boolean;

public class Tokeniser_consumeCharacterReference_54776827433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11559;
     Object term11791;
     Object term11793;

    public Tokeniser_consumeCharacterReference_54776827433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45737 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term45736 = ((Class) term45737).getDeclaredField((String) "ScriptData");
        ((Field) term45736).setAccessible(true);
        Object enum154 = ((Field) term45736).get((Object) null);
        Class<? extends Object> term46009 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term46008 = ((Class) term46009).getDeclaredField((String) "Doctype");
        ((Field) term46008).setAccessible(true);
        Object enum155 = ((Field) term46008).get((Object) null);
        Class<? extends Object> term46213 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term46212 = ((Class) term46213).getDeclaredField((String) "Comment");
        ((Field) term46212).setAccessible(true);
        Object enum156 = ((Field) term46212).get((Object) null);
        Class<? extends Object> term46437 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term46436 = ((Class) term46437).getDeclaredField((String) "StartTag");
        ((Field) term46436).setAccessible(true);
        Object enum157 = ((Field) term46436).get((Object) null);
        term11559 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term11560 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term11561 = (char[]) newCharArray(2);
        Object term11567 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term11586 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11587 = (byte[]) newByteArray(16);
        Object term11606 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11607 = (byte[]) newByteArray(16);
        Object term11626 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term11627 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11628 = (byte[]) newByteArray(16);
        Object term11647 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11648 = (byte[]) newByteArray(16);
        Object term11667 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11668 = (byte[]) newByteArray(16);
        Object term11699 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term11700 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11701 = (byte[]) newByteArray(16);
        Object term11731 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term11756 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11757 = (byte[]) newByteArray(16);
        Object term11777 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term11561, 0, 'w');
        setCharElement(term11561, 1, 'D');
        setField(term11560, term11560.getClass(), "input", term11561);
        setIntField(term11560, term11560.getClass(), "length", 454281060);
        setIntField(term11560, term11560.getClass(), "pos", -1786399638);
        setIntField(term11560, term11560.getClass(), "mark", 2055867847);
        setField(term11559, term11559.getClass(), "reader", term11560);
        setIntField(term11567, term11567.getClass(), "maxSize", 0);
        setField(term11567, term11567.getClass(), "elementData", null);
        setIntField(term11567, term11567.getClass(), "size", 0);
        setIntField(term11567, term11567.getClass(), "modCount", 0);
        setField(term11559, term11559.getClass(), "errors", term11567);
        setField(term11559, term11559.getClass(), "state", enum154);
        setField(term11559, term11559.getClass(), "emitPending", null);
        setBooleanField(term11559, term11559.getClass(), "isEmitPending", true);
        setField(term11586, term11586.getClass(), "value", term11587);
        setByteField(term11586, term11586.getClass(), "coder", (byte) -112);
        setIntField(term11586, term11586.getClass(), "count", -1048298087);
        setField(term11559, term11559.getClass(), "charBuffer", term11586);
        setField(term11606, term11606.getClass(), "value", term11607);
        setByteField(term11606, term11606.getClass(), "coder", (byte) -111);
        setIntField(term11606, term11606.getClass(), "count", 292681826);
        setField(term11559, term11559.getClass(), "dataBuffer", term11606);
        setField(term11559, term11559.getClass(), "tagPending", null);
        setField(term11627, term11627.getClass(), "value", term11628);
        setByteField(term11627, term11627.getClass(), "coder", (byte) 0);
        setIntField(term11627, term11627.getClass(), "count", 0);
        setField(term11626, term11626.getClass(), "name", term11627);
        setField(term11647, term11647.getClass(), "value", term11648);
        setByteField(term11647, term11647.getClass(), "coder", (byte) 0);
        setIntField(term11647, term11647.getClass(), "count", 0);
        setField(term11626, term11626.getClass(), "publicIdentifier", term11647);
        setField(term11667, term11667.getClass(), "value", term11668);
        setByteField(term11667, term11667.getClass(), "coder", (byte) 0);
        setIntField(term11667, term11667.getClass(), "count", 0);
        setField(term11626, term11626.getClass(), "systemIdentifier", term11667);
        setBooleanField(term11626, term11626.getClass(), "forceQuirks", true);
        setField(term11626, term11626.getClass(), "type", enum155);
        setField(term11559, term11559.getClass(), "doctypePending", term11626);
        setField(term11700, term11700.getClass(), "value", term11701);
        setByteField(term11700, term11700.getClass(), "coder", (byte) 0);
        setIntField(term11700, term11700.getClass(), "count", 0);
        setField(term11699, term11699.getClass(), "data", term11700);
        setField(term11699, term11699.getClass(), "type", enum156);
        setField(term11559, term11559.getClass(), "commentPending", term11699);
        setField(term11731, term11731.getClass(), "tagName", "tbcdzjIfER");
        setField(term11731, term11731.getClass(), "pendingAttributeName", "HyxfbSQYBe");
        setField(term11756, term11756.getClass(), "value", term11757);
        setByteField(term11756, term11756.getClass(), "coder", (byte) 23);
        setIntField(term11756, term11756.getClass(), "count", 458147407);
        setField(term11731, term11731.getClass(), "pendingAttributeValue", term11756);
        setBooleanField(term11731, term11731.getClass(), "selfClosing", false);
        setField(term11777, term11777.getClass(), "attributes", null);
        setField(term11731, term11731.getClass(), "attributes", term11777);
        setField(term11731, term11731.getClass(), "type", enum157);
        setField(term11559, term11559.getClass(), "lastStartTag", term11731);
        setBooleanField(term11559, term11559.getClass(), "selfClosingFlagAcknowledged", true);
        term11791 = new Character('Y');
        term11793 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term11791;
        args[1] = term11793;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term11559, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


