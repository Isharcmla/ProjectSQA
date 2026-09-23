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
import java.util.LinkedHashMap;

public class Tokeniser_emit_17178667331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7543;
     Object term8063;

    public Tokeniser_emit_17178667331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65128 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term65127 = ((Class) term65128).getDeclaredField((String) "AttributeName");
        ((Field) term65127).setAccessible(true);
        Object enum184 = ((Field) term65127).get((Object) null);
        Class<? extends Object> term65427 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term65426 = ((Class) term65427).getDeclaredField((String) "StartTag");
        ((Field) term65426).setAccessible(true);
        Object enum185 = ((Field) term65426).get((Object) null);
        LinkedHashMap term7882 = new LinkedHashMap();
        Class<? extends Object> term65674 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term65673 = ((Class) term65674).getDeclaredField((String) "EndTag");
        ((Field) term65673).setAccessible(true);
        Object enum186 = ((Field) term65673).get((Object) null);
        Class<? extends Object> term65869 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term65868 = ((Class) term65869).getDeclaredField((String) "Character");
        ((Field) term65868).setAccessible(true);
        Object enum187 = ((Field) term65868).get((Object) null);
        Class<? extends Object> term66121 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term66120 = ((Class) term66121).getDeclaredField((String) "Doctype");
        ((Field) term66120).setAccessible(true);
        Object enum188 = ((Field) term66120).get((Object) null);
        Class<? extends Object> term66325 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term66324 = ((Class) term66325).getDeclaredField((String) "Comment");
        ((Field) term66324).setAccessible(true);
        Object enum189 = ((Field) term66324).get((Object) null);
        term7543 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term7544 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term7545 = (char[]) newCharArray(2);
        Object[] term7553 = (Object[]) newArray("java.lang.String", 8);
        Object term7650 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term7684 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7685 = (byte[]) newByteArray(16);
        Object term7704 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7705 = (byte[]) newByteArray(16);
        Object term7724 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term7761 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7762 = (byte[]) newByteArray(16);
        Object term7796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term7809 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7846 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7847 = (byte[]) newByteArray(16);
        Object term7881 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term7901 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term7927 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term7928 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7929 = (byte[]) newByteArray(16);
        Object term7960 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7961 = (byte[]) newByteArray(16);
        Object term7980 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7981 = (byte[]) newByteArray(16);
        Object term8012 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term8013 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8014 = (byte[]) newByteArray(16);
        int[] term8058 = (int[]) newIntArray(2);
        int[] term8061 = (int[]) newIntArray(1);
        setCharElement(term7545, 0, 'b');
        setCharElement(term7545, 1, 'M');
        setField(term7544, term7544.getClass(), "charBuf", term7545);
        setField(term7544, term7544.getClass(), "reader", null);
        setIntField(term7544, term7544.getClass(), "bufLength", -1016503459);
        setIntField(term7544, term7544.getClass(), "bufSplitPoint", -1968847291);
        setIntField(term7544, term7544.getClass(), "bufPos", 579005622);
        setIntField(term7544, term7544.getClass(), "readerPos", -14890619);
        setIntField(term7544, term7544.getClass(), "bufMark", 1632125673);
        setElement(term7553, 0, "eqJfYWRaEL");
        setElement(term7553, 1, "fhkbdRViHi");
        setElement(term7553, 2, "uWHnvSvaPl");
        setElement(term7553, 3, "kBdSllIBVz");
        setElement(term7553, 4, "TJmVBGfTML");
        setElement(term7553, 5, "tPlsykYBqO");
        setElement(term7553, 6, "bLPjGVBhlX");
        setElement(term7553, 7, "whBvTVIIlC");
        setField(term7544, term7544.getClass(), "stringCache", term7553);
        setField(term7543, term7543.getClass(), "reader", term7544);
        setIntField(term7650, term7650.getClass(), "maxSize", 0);
        setField(term7650, term7650.getClass(), "elementData", null);
        setIntField(term7650, term7650.getClass(), "size", 0);
        setIntField(term7650, term7650.getClass(), "modCount", 0);
        setField(term7543, term7543.getClass(), "errors", term7650);
        setField(term7543, term7543.getClass(), "state", enum184);
        setField(term7543, term7543.getClass(), "emitPending", null);
        setBooleanField(term7543, term7543.getClass(), "isEmitPending", true);
        setField(term7543, term7543.getClass(), "charsString", "IgRJUzaCwW");
        setField(term7684, term7684.getClass(), "value", term7685);
        setByteField(term7684, term7684.getClass(), "coder", (byte) -29);
        setIntField(term7684, term7684.getClass(), "count", 454281060);
        setField(term7543, term7543.getClass(), "charsBuilder", term7684);
        setField(term7704, term7704.getClass(), "value", term7705);
        setByteField(term7704, term7704.getClass(), "coder", (byte) -54);
        setIntField(term7704, term7704.getClass(), "count", -1786399638);
        setField(term7543, term7543.getClass(), "dataBuffer", term7704);
        setField(term7543, term7543.getClass(), "tagPending", null);
        setField(term7724, term7724.getClass(), "tagName", "JUmudUmaaV");
        setField(term7724, term7724.getClass(), "normalName", "KoyGrUJeJW");
        setField(term7724, term7724.getClass(), "pendingAttributeName", "HqBOwkVqjD");
        setField(term7761, term7761.getClass(), "value", term7762);
        setByteField(term7761, term7761.getClass(), "coder", (byte) 0);
        setIntField(term7761, term7761.getClass(), "count", 0);
        setField(term7724, term7724.getClass(), "pendingAttributeValue", term7761);
        setField(term7724, term7724.getClass(), "pendingAttributeValueS", "MAcUBcBckh");
        setBooleanField(term7724, term7724.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term7724, term7724.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term7724, term7724.getClass(), "selfClosing", true);
        setField(term7796, term7796.getClass(), "attributes", null);
        setField(term7724, term7724.getClass(), "attributes", term7796);
        setField(term7724, term7724.getClass(), "type", enum185);
        setField(term7543, term7543.getClass(), "startPending", term7724);
        setField(term7809, term7809.getClass(), "tagName", "oVgzLbrsFr");
        setField(term7809, term7809.getClass(), "normalName", "vQVyKLdtaz");
        setField(term7809, term7809.getClass(), "pendingAttributeName", "OWKQODBLzb");
        setField(term7846, term7846.getClass(), "value", term7847);
        setByteField(term7846, term7846.getClass(), "coder", (byte) 0);
        setIntField(term7846, term7846.getClass(), "count", 0);
        setField(term7809, term7809.getClass(), "pendingAttributeValue", term7846);
        setField(term7809, term7809.getClass(), "pendingAttributeValueS", "wGmYcqUkgE");
        setBooleanField(term7809, term7809.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7809, term7809.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term7809, term7809.getClass(), "selfClosing", true);
        setField(term7881, term7881.getClass(), "attributes", term7882);
        setField(term7809, term7809.getClass(), "attributes", term7881);
        setField(term7809, term7809.getClass(), "type", enum186);
        setField(term7543, term7543.getClass(), "endPending", term7809);
        setField(term7901, term7901.getClass(), "data", "bWWfajKbEX");
        setField(term7901, term7901.getClass(), "type", enum187);
        setField(term7543, term7543.getClass(), "charPending", term7901);
        setField(term7928, term7928.getClass(), "value", term7929);
        setByteField(term7928, term7928.getClass(), "coder", (byte) 0);
        setIntField(term7928, term7928.getClass(), "count", 0);
        setField(term7927, term7927.getClass(), "name", term7928);
        setField(term7927, term7927.getClass(), "pubSysKey", "cAPeiZHKGJ");
        setField(term7960, term7960.getClass(), "value", term7961);
        setByteField(term7960, term7960.getClass(), "coder", (byte) 0);
        setIntField(term7960, term7960.getClass(), "count", 0);
        setField(term7927, term7927.getClass(), "publicIdentifier", term7960);
        setField(term7980, term7980.getClass(), "value", term7981);
        setByteField(term7980, term7980.getClass(), "coder", (byte) 0);
        setIntField(term7980, term7980.getClass(), "count", 0);
        setField(term7927, term7927.getClass(), "systemIdentifier", term7980);
        setBooleanField(term7927, term7927.getClass(), "forceQuirks", true);
        setField(term7927, term7927.getClass(), "type", enum188);
        setField(term7543, term7543.getClass(), "doctypePending", term7927);
        setField(term8013, term8013.getClass(), "value", term8014);
        setByteField(term8013, term8013.getClass(), "coder", (byte) 0);
        setIntField(term8013, term8013.getClass(), "count", 0);
        setField(term8012, term8012.getClass(), "data", term8013);
        setBooleanField(term8012, term8012.getClass(), "bogus", true);
        setField(term8012, term8012.getClass(), "type", enum189);
        setField(term7543, term7543.getClass(), "commentPending", term8012);
        setField(term7543, term7543.getClass(), "lastStartTag", "LvJFtLBaxj");
        setBooleanField(term7543, term7543.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term8058, 0, 2055867847);
        setIntElement(term8058, 1, -1048298087);
        setField(term7543, term7543.getClass(), "codepointHolder", term8058);
        setIntElement(term8061, 0, 292681826);
        setField(term7543, term7543.getClass(), "multipointHolder", term8061);
        term8063 = (char[]) newCharArray(9);
        setCharElement(term8063, 0, 'u');
        setCharElement(term8063, 1, 'L');
        setCharElement(term8063, 2, 'c');
        setCharElement(term8063, 3, 'g');
        setCharElement(term8063, 4, 'Q');
        setCharElement(term8063, 5, 'H');
        setCharElement(term8063, 6, 'g');
        setCharElement(term8063, 7, 'q');
        setCharElement(term8063, 8, 'z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8063;
        try {
            callMethod(klass, "emit", argTypes, term7543, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


