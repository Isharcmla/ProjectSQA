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
import java.util.LinkedHashMap;

public class Tokeniser_isAppropriateEndTagToken_151432047946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37359;

    public Tokeniser_isAppropriateEndTagToken_151432047946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108549 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term108548 = ((Class) term108549).getDeclaredField((String) "TagOpen");
        ((Field) term108548).setAccessible(true);
        Object enum334 = ((Field) term108548).get((Object) null);
        Class<? extends Object> term108830 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term108829 = ((Class) term108830).getDeclaredField((String) "StartTag");
        ((Field) term108829).setAccessible(true);
        Object enum335 = ((Field) term108829).get((Object) null);
        LinkedHashMap term37705 = new LinkedHashMap();
        Class<? extends Object> term109077 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term109076 = ((Class) term109077).getDeclaredField((String) "EndTag");
        ((Field) term109076).setAccessible(true);
        Object enum336 = ((Field) term109076).get((Object) null);
        Class<? extends Object> term109272 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term109271 = ((Class) term109272).getDeclaredField((String) "Character");
        ((Field) term109271).setAccessible(true);
        Object enum337 = ((Field) term109271).get((Object) null);
        Class<? extends Object> term109524 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term109523 = ((Class) term109524).getDeclaredField((String) "Doctype");
        ((Field) term109523).setAccessible(true);
        Object enum338 = ((Field) term109523).get((Object) null);
        Class<? extends Object> term109728 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term109727 = ((Class) term109728).getDeclaredField((String) "Comment");
        ((Field) term109727).setAccessible(true);
        Object enum339 = ((Field) term109727).get((Object) null);
        term37359 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term37360 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term37361 = (char[]) newCharArray(3);
        Object[] term37370 = (Object[]) newArray("java.lang.String", 9);
        Object term37479 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term37507 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37508 = (byte[]) newByteArray(16);
        Object term37527 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37528 = (byte[]) newByteArray(16);
        Object term37547 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term37584 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37585 = (byte[]) newByteArray(16);
        Object term37619 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term37632 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term37669 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37670 = (byte[]) newByteArray(16);
        Object term37704 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term37724 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term37750 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term37751 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37752 = (byte[]) newByteArray(16);
        Object term37783 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37784 = (byte[]) newByteArray(16);
        Object term37803 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37804 = (byte[]) newByteArray(16);
        Object term37835 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term37836 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term37837 = (byte[]) newByteArray(16);
        int[] term37881 = (int[]) newIntArray(6);
        int[] term37888 = (int[]) newIntArray(5);
        setCharElement(term37361, 0, 'G');
        setCharElement(term37361, 1, 'g');
        setCharElement(term37361, 2, 'n');
        setField(term37360, term37360.getClass(), "charBuf", term37361);
        setField(term37360, term37360.getClass(), "reader", null);
        setIntField(term37360, term37360.getClass(), "bufLength", 1768204942);
        setIntField(term37360, term37360.getClass(), "bufSplitPoint", 1252951645);
        setIntField(term37360, term37360.getClass(), "bufPos", 574481092);
        setIntField(term37360, term37360.getClass(), "readerPos", -310528004);
        setIntField(term37360, term37360.getClass(), "bufMark", -634976996);
        setElement(term37370, 0, "hulYxtowxw");
        setElement(term37370, 1, "GNEmuHPNcU");
        setElement(term37370, 2, "IoSfuKDFRe");
        setElement(term37370, 3, "AWYyZiNfsm");
        setElement(term37370, 4, "ITRRYiuDwH");
        setElement(term37370, 5, "llRfwANcVF");
        setElement(term37370, 6, "sUEeHQTWkA");
        setElement(term37370, 7, "BDIRCxAWLA");
        setElement(term37370, 8, "eOJfbiZLnb");
        setField(term37360, term37360.getClass(), "stringCache", term37370);
        setField(term37359, term37359.getClass(), "reader", term37360);
        setIntField(term37479, term37479.getClass(), "maxSize", 0);
        setField(term37479, term37479.getClass(), "elementData", null);
        setIntField(term37479, term37479.getClass(), "size", 0);
        setIntField(term37479, term37479.getClass(), "modCount", 0);
        setField(term37359, term37359.getClass(), "errors", term37479);
        setField(term37359, term37359.getClass(), "state", enum334);
        setField(term37359, term37359.getClass(), "emitPending", null);
        setBooleanField(term37359, term37359.getClass(), "isEmitPending", false);
        setField(term37359, term37359.getClass(), "charsString", "nKZKnxWYCK");
        setField(term37507, term37507.getClass(), "value", term37508);
        setByteField(term37507, term37507.getClass(), "coder", (byte) 71);
        setIntField(term37507, term37507.getClass(), "count", -1015274146);
        setField(term37359, term37359.getClass(), "charsBuilder", term37507);
        setField(term37527, term37527.getClass(), "value", term37528);
        setByteField(term37527, term37527.getClass(), "coder", (byte) 80);
        setIntField(term37527, term37527.getClass(), "count", -49052672);
        setField(term37359, term37359.getClass(), "dataBuffer", term37527);
        setField(term37359, term37359.getClass(), "tagPending", null);
        setField(term37547, term37547.getClass(), "tagName", "JOqQxuzRuZ");
        setField(term37547, term37547.getClass(), "normalName", "RSaoipUlsg");
        setField(term37547, term37547.getClass(), "pendingAttributeName", "cSHGbqKqlN");
        setField(term37584, term37584.getClass(), "value", term37585);
        setByteField(term37584, term37584.getClass(), "coder", (byte) 0);
        setIntField(term37584, term37584.getClass(), "count", 0);
        setField(term37547, term37547.getClass(), "pendingAttributeValue", term37584);
        setField(term37547, term37547.getClass(), "pendingAttributeValueS", "pFAfANnxup");
        setBooleanField(term37547, term37547.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term37547, term37547.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term37547, term37547.getClass(), "selfClosing", true);
        setField(term37619, term37619.getClass(), "attributes", null);
        setField(term37547, term37547.getClass(), "attributes", term37619);
        setField(term37547, term37547.getClass(), "type", enum335);
        setField(term37359, term37359.getClass(), "startPending", term37547);
        setField(term37632, term37632.getClass(), "tagName", "FbSIUZyBXZ");
        setField(term37632, term37632.getClass(), "normalName", "mhQDwIyrRi");
        setField(term37632, term37632.getClass(), "pendingAttributeName", "HpZXWDPhlg");
        setField(term37669, term37669.getClass(), "value", term37670);
        setByteField(term37669, term37669.getClass(), "coder", (byte) 0);
        setIntField(term37669, term37669.getClass(), "count", 0);
        setField(term37632, term37632.getClass(), "pendingAttributeValue", term37669);
        setField(term37632, term37632.getClass(), "pendingAttributeValueS", "lBOokzEPfe");
        setBooleanField(term37632, term37632.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term37632, term37632.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term37632, term37632.getClass(), "selfClosing", false);
        setField(term37704, term37704.getClass(), "attributes", term37705);
        setField(term37632, term37632.getClass(), "attributes", term37704);
        setField(term37632, term37632.getClass(), "type", enum336);
        setField(term37359, term37359.getClass(), "endPending", term37632);
        setField(term37724, term37724.getClass(), "data", "IEYhJmgCVd");
        setField(term37724, term37724.getClass(), "type", enum337);
        setField(term37359, term37359.getClass(), "charPending", term37724);
        setField(term37751, term37751.getClass(), "value", term37752);
        setByteField(term37751, term37751.getClass(), "coder", (byte) 0);
        setIntField(term37751, term37751.getClass(), "count", 0);
        setField(term37750, term37750.getClass(), "name", term37751);
        setField(term37750, term37750.getClass(), "pubSysKey", "KSJeYkkvpk");
        setField(term37783, term37783.getClass(), "value", term37784);
        setByteField(term37783, term37783.getClass(), "coder", (byte) 0);
        setIntField(term37783, term37783.getClass(), "count", 0);
        setField(term37750, term37750.getClass(), "publicIdentifier", term37783);
        setField(term37803, term37803.getClass(), "value", term37804);
        setByteField(term37803, term37803.getClass(), "coder", (byte) 0);
        setIntField(term37803, term37803.getClass(), "count", 0);
        setField(term37750, term37750.getClass(), "systemIdentifier", term37803);
        setBooleanField(term37750, term37750.getClass(), "forceQuirks", false);
        setField(term37750, term37750.getClass(), "type", enum338);
        setField(term37359, term37359.getClass(), "doctypePending", term37750);
        setField(term37836, term37836.getClass(), "value", term37837);
        setByteField(term37836, term37836.getClass(), "coder", (byte) 0);
        setIntField(term37836, term37836.getClass(), "count", 0);
        setField(term37835, term37835.getClass(), "data", term37836);
        setBooleanField(term37835, term37835.getClass(), "bogus", false);
        setField(term37835, term37835.getClass(), "type", enum339);
        setField(term37359, term37359.getClass(), "commentPending", term37835);
        setField(term37359, term37359.getClass(), "lastStartTag", "qUtkFGMNUV");
        setBooleanField(term37359, term37359.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term37881, 0, 339372704);
        setIntElement(term37881, 1, -851097944);
        setIntElement(term37881, 2, 803925431);
        setIntElement(term37881, 3, 76929641);
        setIntElement(term37881, 4, -2003192918);
        setIntElement(term37881, 5, -1362856620);
        setField(term37359, term37359.getClass(), "codepointHolder", term37881);
        setIntElement(term37888, 0, -1835839814);
        setIntElement(term37888, 1, -1404350380);
        setIntElement(term37888, 2, -2013924238);
        setIntElement(term37888, 3, 579006268);
        setIntElement(term37888, 4, -1694747156);
        setField(term37359, term37359.getClass(), "multipointHolder", term37888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term37359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


