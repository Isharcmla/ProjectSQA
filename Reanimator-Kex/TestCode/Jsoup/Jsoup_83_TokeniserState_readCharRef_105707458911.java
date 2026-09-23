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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TokeniserState_readCharRef_105707458911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6245;
     Object enum124;

    public TokeniserState_readCharRef_105707458911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36341 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term36340 = ((Class) term36341).getDeclaredField((String) "AfterDoctypePublicKeyword");
        ((Field) term36340).setAccessible(true);
        Object enum118 = ((Field) term36340).get((Object) null);
        Class<? extends Object> term36676 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term36675 = ((Class) term36676).getDeclaredField((String) "StartTag");
        ((Field) term36675).setAccessible(true);
        Object enum119 = ((Field) term36675).get((Object) null);
        Class<? extends Object> term36923 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term36922 = ((Class) term36923).getDeclaredField((String) "EndTag");
        ((Field) term36922).setAccessible(true);
        Object enum120 = ((Field) term36922).get((Object) null);
        Class<? extends Object> term37118 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term37117 = ((Class) term37118).getDeclaredField((String) "Character");
        ((Field) term37117).setAccessible(true);
        Object enum121 = ((Field) term37117).get((Object) null);
        Class<? extends Object> term37370 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term37369 = ((Class) term37370).getDeclaredField((String) "Doctype");
        ((Field) term37369).setAccessible(true);
        Object enum122 = ((Field) term37369).get((Object) null);
        Class<? extends Object> term37574 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term37573 = ((Class) term37574).getDeclaredField((String) "Comment");
        ((Field) term37573).setAccessible(true);
        Object enum123 = ((Field) term37573).get((Object) null);
        term6245 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term6246 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6247 = (char[]) newCharArray(3);
        Object[] term6256 = (Object[]) newArray("java.lang.String", 1);
        Object term6269 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term6315 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6316 = (byte[]) newByteArray(16);
        Object term6335 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6336 = (byte[]) newByteArray(16);
        Object term6355 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term6392 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6393 = (byte[]) newByteArray(16);
        Object term6427 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6429 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6430 = (Object[]) newArray("java.lang.String", 0);
        Object term6443 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term6480 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6481 = (byte[]) newByteArray(16);
        Object term6515 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6517 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6518 = (Object[]) newArray("java.lang.String", 0);
        Object term6529 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term6555 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term6556 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6557 = (byte[]) newByteArray(16);
        Object term6588 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6589 = (byte[]) newByteArray(16);
        Object term6608 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6609 = (byte[]) newByteArray(16);
        Object term6640 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term6641 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6642 = (byte[]) newByteArray(16);
        int[] term6685 = (int[]) newIntArray(2);
        int[] term6688 = (int[]) newIntArray(8);
        setCharElement(term6247, 0, 'L');
        setCharElement(term6247, 1, 'c');
        setCharElement(term6247, 2, 'g');
        setField(term6246, term6246.getClass(), "charBuf", term6247);
        setField(term6246, term6246.getClass(), "reader", null);
        setIntField(term6246, term6246.getClass(), "bufLength", -602026508);
        setIntField(term6246, term6246.getClass(), "bufSplitPoint", -157887805);
        setIntField(term6246, term6246.getClass(), "bufPos", 1876565163);
        setIntField(term6246, term6246.getClass(), "readerPos", -817164822);
        setIntField(term6246, term6246.getClass(), "bufMark", -1016503459);
        setElement(term6256, 0, "wSQxaModmm");
        setField(term6246, term6246.getClass(), "stringCache", term6256);
        setField(term6245, term6245.getClass(), "reader", term6246);
        setIntField(term6269, term6269.getClass(), "maxSize", 0);
        setField(term6269, term6269.getClass(), "elementData", null);
        setIntField(term6269, term6269.getClass(), "size", 0);
        setIntField(term6269, term6269.getClass(), "modCount", 0);
        setField(term6245, term6245.getClass(), "errors", term6269);
        setField(term6245, term6245.getClass(), "state", enum118);
        setField(term6245, term6245.getClass(), "emitPending", null);
        setBooleanField(term6245, term6245.getClass(), "isEmitPending", false);
        setField(term6245, term6245.getClass(), "charsString", "UlajhuVLaP");
        setField(term6315, term6315.getClass(), "value", term6316);
        setByteField(term6315, term6315.getClass(), "coder", (byte) 18);
        setIntField(term6315, term6315.getClass(), "count", -1968847291);
        setField(term6245, term6245.getClass(), "charsBuilder", term6315);
        setField(term6335, term6335.getClass(), "value", term6336);
        setByteField(term6335, term6335.getClass(), "coder", (byte) -58);
        setIntField(term6335, term6335.getClass(), "count", 579005622);
        setField(term6245, term6245.getClass(), "dataBuffer", term6335);
        setField(term6245, term6245.getClass(), "tagPending", null);
        setField(term6355, term6355.getClass(), "tagName", "gGSMzuGICf");
        setField(term6355, term6355.getClass(), "normalName", "hxCBltsObl");
        setField(term6355, term6355.getClass(), "pendingAttributeName", "BndsHwAFMv");
        setField(term6392, term6392.getClass(), "value", term6393);
        setByteField(term6392, term6392.getClass(), "coder", (byte) 0);
        setIntField(term6392, term6392.getClass(), "count", 0);
        setField(term6355, term6355.getClass(), "pendingAttributeValue", term6392);
        setField(term6355, term6355.getClass(), "pendingAttributeValueS", "GzFkzHGYFt");
        setBooleanField(term6355, term6355.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term6355, term6355.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term6355, term6355.getClass(), "selfClosing", true);
        setIntField(term6427, term6427.getClass(), "size", 0);
        setField(term6427, term6427.getClass(), "keys", term6429);
        setField(term6427, term6427.getClass(), "vals", term6430);
        setField(term6355, term6355.getClass(), "attributes", term6427);
        setField(term6355, term6355.getClass(), "type", enum119);
        setField(term6245, term6245.getClass(), "startPending", term6355);
        setField(term6443, term6443.getClass(), "tagName", "tShwQLRGNe");
        setField(term6443, term6443.getClass(), "normalName", "LvtrsXUliU");
        setField(term6443, term6443.getClass(), "pendingAttributeName", "xLbjWUgOIL");
        setField(term6480, term6480.getClass(), "value", term6481);
        setByteField(term6480, term6480.getClass(), "coder", (byte) 0);
        setIntField(term6480, term6480.getClass(), "count", 0);
        setField(term6443, term6443.getClass(), "pendingAttributeValue", term6480);
        setField(term6443, term6443.getClass(), "pendingAttributeValueS", "jDtqGUpnZN");
        setBooleanField(term6443, term6443.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term6443, term6443.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term6443, term6443.getClass(), "selfClosing", true);
        setIntField(term6515, term6515.getClass(), "size", -14890619);
        setField(term6515, term6515.getClass(), "keys", term6517);
        setField(term6515, term6515.getClass(), "vals", term6518);
        setField(term6443, term6443.getClass(), "attributes", term6515);
        setField(term6443, term6443.getClass(), "type", enum120);
        setField(term6245, term6245.getClass(), "endPending", term6443);
        setField(term6529, term6529.getClass(), "data", "nGKItKLYNC");
        setField(term6529, term6529.getClass(), "type", enum121);
        setField(term6245, term6245.getClass(), "charPending", term6529);
        setField(term6556, term6556.getClass(), "value", term6557);
        setByteField(term6556, term6556.getClass(), "coder", (byte) 0);
        setIntField(term6556, term6556.getClass(), "count", 0);
        setField(term6555, term6555.getClass(), "name", term6556);
        setField(term6555, term6555.getClass(), "pubSysKey", "UiUYnPrcCi");
        setField(term6588, term6588.getClass(), "value", term6589);
        setByteField(term6588, term6588.getClass(), "coder", (byte) 0);
        setIntField(term6588, term6588.getClass(), "count", 0);
        setField(term6555, term6555.getClass(), "publicIdentifier", term6588);
        setField(term6608, term6608.getClass(), "value", term6609);
        setByteField(term6608, term6608.getClass(), "coder", (byte) 0);
        setIntField(term6608, term6608.getClass(), "count", 0);
        setField(term6555, term6555.getClass(), "systemIdentifier", term6608);
        setBooleanField(term6555, term6555.getClass(), "forceQuirks", false);
        setField(term6555, term6555.getClass(), "type", enum122);
        setField(term6245, term6245.getClass(), "doctypePending", term6555);
        setField(term6641, term6641.getClass(), "value", term6642);
        setByteField(term6641, term6641.getClass(), "coder", (byte) 0);
        setIntField(term6641, term6641.getClass(), "count", 0);
        setField(term6640, term6640.getClass(), "data", term6641);
        setBooleanField(term6640, term6640.getClass(), "bogus", false);
        setField(term6640, term6640.getClass(), "type", enum123);
        setField(term6245, term6245.getClass(), "commentPending", term6640);
        setField(term6245, term6245.getClass(), "lastStartTag", "UoYtihxVaS");
        setIntElement(term6685, 0, 1632125673);
        setIntElement(term6685, 1, 454281060);
        setField(term6245, term6245.getClass(), "codepointHolder", term6685);
        setIntElement(term6688, 0, -1786399638);
        setIntElement(term6688, 1, 2055867847);
        setIntElement(term6688, 2, -1048298087);
        setIntElement(term6688, 3, 292681826);
        setIntElement(term6688, 4, 458147407);
        setIntElement(term6688, 5, -184153539);
        setIntElement(term6688, 6, 493620644);
        setIntElement(term6688, 7, 1328271830);
        setField(term6245, term6245.getClass(), "multipointHolder", term6688);
        Class<? extends Object> term37782 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term37781 = ((Class) term37782).getDeclaredField((String) "ScriptDataDoubleEscapedDashDash");
        ((Field) term37781).setAccessible(true);
        enum124 = ((Field) term37781).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term6245;
        args[1] = enum124;
        try {
            callMethod(klass, "readCharRef", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


