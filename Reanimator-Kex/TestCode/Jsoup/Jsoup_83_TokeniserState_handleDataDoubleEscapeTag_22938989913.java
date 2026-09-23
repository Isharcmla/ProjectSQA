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

public class TokeniserState_handleDataDoubleEscapeTag_22938989913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11029;
     Object term11490;
     Object enum139;
     Object enum140;

    public TokeniserState_handleDataDoubleEscapeTag_22938989913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40771 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term40770 = ((Class) term40771).getDeclaredField((String) "ScriptData");
        ((Field) term40770).setAccessible(true);
        Object enum133 = ((Field) term40770).get((Object) null);
        Class<? extends Object> term41061 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41060 = ((Class) term41061).getDeclaredField((String) "StartTag");
        ((Field) term41060).setAccessible(true);
        Object enum134 = ((Field) term41060).get((Object) null);
        Class<? extends Object> term41308 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41307 = ((Class) term41308).getDeclaredField((String) "EndTag");
        ((Field) term41307).setAccessible(true);
        Object enum135 = ((Field) term41307).get((Object) null);
        Class<? extends Object> term41503 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41502 = ((Class) term41503).getDeclaredField((String) "Character");
        ((Field) term41502).setAccessible(true);
        Object enum136 = ((Field) term41502).get((Object) null);
        Class<? extends Object> term41755 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41754 = ((Class) term41755).getDeclaredField((String) "Doctype");
        ((Field) term41754).setAccessible(true);
        Object enum137 = ((Field) term41754).get((Object) null);
        Class<? extends Object> term41959 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41958 = ((Class) term41959).getDeclaredField((String) "Comment");
        ((Field) term41958).setAccessible(true);
        Object enum138 = ((Field) term41958).get((Object) null);
        term11029 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term11030 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term11031 = (char[]) newCharArray(5);
        Object[] term11042 = (Object[]) newArray("java.lang.String", 3);
        Object term11079 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term11110 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11111 = (byte[]) newByteArray(16);
        Object term11130 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11131 = (byte[]) newByteArray(16);
        Object term11150 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term11187 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11188 = (byte[]) newByteArray(16);
        Object term11222 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11224 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11225 = (Object[]) newArray("java.lang.String", 0);
        Object term11238 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term11275 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11276 = (byte[]) newByteArray(16);
        Object term11310 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11312 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11313 = (Object[]) newArray("java.lang.String", 0);
        Object term11324 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term11350 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term11351 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11352 = (byte[]) newByteArray(16);
        Object term11383 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11384 = (byte[]) newByteArray(16);
        Object term11403 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11404 = (byte[]) newByteArray(16);
        Object term11435 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term11436 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11437 = (byte[]) newByteArray(16);
        int[] term11480 = (int[]) newIntArray(2);
        int[] term11483 = (int[]) newIntArray(6);
        setCharElement(term11031, 0, 'D');
        setCharElement(term11031, 1, 'Y');
        setCharElement(term11031, 2, 'F');
        setCharElement(term11031, 3, 's');
        setCharElement(term11031, 4, 'j');
        setField(term11030, term11030.getClass(), "charBuf", term11031);
        setField(term11030, term11030.getClass(), "reader", null);
        setIntField(term11030, term11030.getClass(), "bufLength", 1090617576);
        setIntField(term11030, term11030.getClass(), "bufSplitPoint", -1547384488);
        setIntField(term11030, term11030.getClass(), "bufPos", 1442160736);
        setIntField(term11030, term11030.getClass(), "readerPos", 1114000454);
        setIntField(term11030, term11030.getClass(), "bufMark", -556405712);
        setElement(term11042, 0, "KoyGrUJeJW");
        setElement(term11042, 1, "HqBOwkVqjD");
        setElement(term11042, 2, "MAcUBcBckh");
        setField(term11030, term11030.getClass(), "stringCache", term11042);
        setField(term11029, term11029.getClass(), "reader", term11030);
        setIntField(term11079, term11079.getClass(), "maxSize", 0);
        setField(term11079, term11079.getClass(), "elementData", null);
        setIntField(term11079, term11079.getClass(), "size", 0);
        setIntField(term11079, term11079.getClass(), "modCount", 0);
        setField(term11029, term11029.getClass(), "errors", term11079);
        setField(term11029, term11029.getClass(), "state", enum133);
        setField(term11029, term11029.getClass(), "emitPending", null);
        setBooleanField(term11029, term11029.getClass(), "isEmitPending", true);
        setField(term11029, term11029.getClass(), "charsString", "oVgzLbrsFr");
        setField(term11110, term11110.getClass(), "value", term11111);
        setByteField(term11110, term11110.getClass(), "coder", (byte) -10);
        setIntField(term11110, term11110.getClass(), "count", -1772434990);
        setField(term11029, term11029.getClass(), "charsBuilder", term11110);
        setField(term11130, term11130.getClass(), "value", term11131);
        setByteField(term11130, term11130.getClass(), "coder", (byte) 79);
        setIntField(term11130, term11130.getClass(), "count", -1845499264);
        setField(term11029, term11029.getClass(), "dataBuffer", term11130);
        setField(term11029, term11029.getClass(), "tagPending", null);
        setField(term11150, term11150.getClass(), "tagName", "vQVyKLdtaz");
        setField(term11150, term11150.getClass(), "normalName", "OWKQODBLzb");
        setField(term11150, term11150.getClass(), "pendingAttributeName", "wGmYcqUkgE");
        setField(term11187, term11187.getClass(), "value", term11188);
        setByteField(term11187, term11187.getClass(), "coder", (byte) 0);
        setIntField(term11187, term11187.getClass(), "count", 0);
        setField(term11150, term11150.getClass(), "pendingAttributeValue", term11187);
        setField(term11150, term11150.getClass(), "pendingAttributeValueS", "idgaQsnJpQ");
        setBooleanField(term11150, term11150.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term11150, term11150.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term11150, term11150.getClass(), "selfClosing", false);
        setIntField(term11222, term11222.getClass(), "size", 0);
        setField(term11222, term11222.getClass(), "keys", term11224);
        setField(term11222, term11222.getClass(), "vals", term11225);
        setField(term11150, term11150.getClass(), "attributes", term11222);
        setField(term11150, term11150.getClass(), "type", enum134);
        setField(term11029, term11029.getClass(), "startPending", term11150);
        setField(term11238, term11238.getClass(), "tagName", "VgZnGoIFwQ");
        setField(term11238, term11238.getClass(), "normalName", "jUbSRrkrYZ");
        setField(term11238, term11238.getClass(), "pendingAttributeName", "bWWfajKbEX");
        setField(term11275, term11275.getClass(), "value", term11276);
        setByteField(term11275, term11275.getClass(), "coder", (byte) 0);
        setIntField(term11275, term11275.getClass(), "count", 0);
        setField(term11238, term11238.getClass(), "pendingAttributeValue", term11275);
        setField(term11238, term11238.getClass(), "pendingAttributeValueS", "cAPeiZHKGJ");
        setBooleanField(term11238, term11238.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term11238, term11238.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term11238, term11238.getClass(), "selfClosing", true);
        setIntField(term11310, term11310.getClass(), "size", -505439934);
        setField(term11310, term11310.getClass(), "keys", term11312);
        setField(term11310, term11310.getClass(), "vals", term11313);
        setField(term11238, term11238.getClass(), "attributes", term11310);
        setField(term11238, term11238.getClass(), "type", enum135);
        setField(term11029, term11029.getClass(), "endPending", term11238);
        setField(term11324, term11324.getClass(), "data", "LvJFtLBaxj");
        setField(term11324, term11324.getClass(), "type", enum136);
        setField(term11029, term11029.getClass(), "charPending", term11324);
        setField(term11351, term11351.getClass(), "value", term11352);
        setByteField(term11351, term11351.getClass(), "coder", (byte) 0);
        setIntField(term11351, term11351.getClass(), "count", 0);
        setField(term11350, term11350.getClass(), "name", term11351);
        setField(term11350, term11350.getClass(), "pubSysKey", "PHvxnGHptP");
        setField(term11383, term11383.getClass(), "value", term11384);
        setByteField(term11383, term11383.getClass(), "coder", (byte) 0);
        setIntField(term11383, term11383.getClass(), "count", 0);
        setField(term11350, term11350.getClass(), "publicIdentifier", term11383);
        setField(term11403, term11403.getClass(), "value", term11404);
        setByteField(term11403, term11403.getClass(), "coder", (byte) 0);
        setIntField(term11403, term11403.getClass(), "count", 0);
        setField(term11350, term11350.getClass(), "systemIdentifier", term11403);
        setBooleanField(term11350, term11350.getClass(), "forceQuirks", true);
        setField(term11350, term11350.getClass(), "type", enum137);
        setField(term11029, term11029.getClass(), "doctypePending", term11350);
        setField(term11436, term11436.getClass(), "value", term11437);
        setByteField(term11436, term11436.getClass(), "coder", (byte) 0);
        setIntField(term11436, term11436.getClass(), "count", 0);
        setField(term11435, term11435.getClass(), "data", term11436);
        setBooleanField(term11435, term11435.getClass(), "bogus", false);
        setField(term11435, term11435.getClass(), "type", enum138);
        setField(term11029, term11029.getClass(), "commentPending", term11435);
        setField(term11029, term11029.getClass(), "lastStartTag", "TimdotUuNC");
        setIntElement(term11480, 0, -344842608);
        setIntElement(term11480, 1, 941650513);
        setField(term11029, term11029.getClass(), "codepointHolder", term11480);
        setIntElement(term11483, 0, 444029505);
        setIntElement(term11483, 1, -1034506028);
        setIntElement(term11483, 2, -1263114719);
        setIntElement(term11483, 3, -894662986);
        setIntElement(term11483, 4, 304775596);
        setIntElement(term11483, 5, -1347665717);
        setField(term11029, term11029.getClass(), "multipointHolder", term11483);
        term11490 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term11491 = (char[]) newCharArray(6);
        Object[] term11503 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term11491, 0, 'J');
        setCharElement(term11491, 1, 'C');
        setCharElement(term11491, 2, 'Z');
        setCharElement(term11491, 3, 'p');
        setCharElement(term11491, 4, 'V');
        setCharElement(term11491, 5, 'm');
        setField(term11490, term11490.getClass(), "charBuf", term11491);
        setField(term11490, term11490.getClass(), "reader", null);
        setIntField(term11490, term11490.getClass(), "bufLength", -1888585309);
        setIntField(term11490, term11490.getClass(), "bufSplitPoint", 683666002);
        setIntField(term11490, term11490.getClass(), "bufPos", 1596213415);
        setIntField(term11490, term11490.getClass(), "readerPos", -268815336);
        setIntField(term11490, term11490.getClass(), "bufMark", -1210583429);
        setElement(term11503, 0, "PkWMRdJcBb");
        setElement(term11503, 1, "jSpAteRute");
        setField(term11490, term11490.getClass(), "stringCache", term11503);
        Class<? extends Object> term42191 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term42190 = ((Class) term42191).getDeclaredField((String) "PLAINTEXT");
        ((Field) term42190).setAccessible(true);
        enum139 = ((Field) term42190).get((Object) null);
        Class<? extends Object> term42380 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term42379 = ((Class) term42380).getDeclaredField((String) "Rawtext");
        ((Field) term42379).setAccessible(true);
        enum140 = ((Field) term42379).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        argTypes[3] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[4];
        args[0] = term11029;
        args[1] = term11490;
        args[2] = enum139;
        args[3] = enum140;
        try {
            callMethod(klass, "handleDataDoubleEscapeTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


