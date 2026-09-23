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
import java.lang.Character;

public class Tokeniser_emit_17178667333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11543;
     Object term12055;

    public Tokeniser_emit_17178667333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68592 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term68591 = ((Class) term68592).getDeclaredField((String) "AfterDoctypePublicKeyword");
        ((Field) term68591).setAccessible(true);
        Object enum196 = ((Field) term68591).get((Object) null);
        Class<? extends Object> term68927 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term68926 = ((Class) term68927).getDeclaredField((String) "StartTag");
        ((Field) term68926).setAccessible(true);
        Object enum197 = ((Field) term68926).get((Object) null);
        LinkedHashMap term11870 = new LinkedHashMap();
        Class<? extends Object> term69174 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term69173 = ((Class) term69174).getDeclaredField((String) "EndTag");
        ((Field) term69173).setAccessible(true);
        Object enum198 = ((Field) term69173).get((Object) null);
        Class<? extends Object> term69369 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term69368 = ((Class) term69369).getDeclaredField((String) "Character");
        ((Field) term69368).setAccessible(true);
        Object enum199 = ((Field) term69368).get((Object) null);
        Class<? extends Object> term69656 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term69655 = ((Class) term69656).getDeclaredField((String) "Doctype");
        ((Field) term69655).setAccessible(true);
        Object enum200 = ((Field) term69655).get((Object) null);
        Class<? extends Object> term69860 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term69859 = ((Class) term69860).getDeclaredField((String) "Comment");
        ((Field) term69859).setAccessible(true);
        Object enum201 = ((Field) term69859).get((Object) null);
        term11543 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term11544 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term11545 = (char[]) newCharArray(2);
        Object[] term11553 = (Object[]) newArray("java.lang.String", 6);
        Object term11626 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term11672 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11673 = (byte[]) newByteArray(16);
        Object term11692 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11693 = (byte[]) newByteArray(16);
        Object term11712 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term11749 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11750 = (byte[]) newByteArray(16);
        Object term11784 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term11797 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term11834 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11835 = (byte[]) newByteArray(16);
        Object term11869 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term11889 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term11915 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term11916 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11917 = (byte[]) newByteArray(16);
        Object term11948 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11949 = (byte[]) newByteArray(16);
        Object term11968 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term11969 = (byte[]) newByteArray(16);
        Object term12000 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term12001 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term12002 = (byte[]) newByteArray(16);
        int[] term12046 = (int[]) newIntArray(2);
        int[] term12049 = (int[]) newIntArray(5);
        setCharElement(term11545, 0, 'l');
        setCharElement(term11545, 1, 'P');
        setField(term11544, term11544.getClass(), "charBuf", term11545);
        setField(term11544, term11544.getClass(), "reader", null);
        setIntField(term11544, term11544.getClass(), "bufLength", 1375330971);
        setIntField(term11544, term11544.getClass(), "bufSplitPoint", -478195677);
        setIntField(term11544, term11544.getClass(), "bufPos", 972867650);
        setIntField(term11544, term11544.getClass(), "readerPos", 1655935355);
        setIntField(term11544, term11544.getClass(), "bufMark", -481533957);
        setElement(term11553, 0, "xBsXSDjXYK");
        setElement(term11553, 1, "sEnIVFtZuQ");
        setElement(term11553, 2, "ZVecLZMLHF");
        setElement(term11553, 3, "fztQhjqwdP");
        setElement(term11553, 4, "eVpkWxjuki");
        setElement(term11553, 5, "SJiQaLvSKv");
        setField(term11544, term11544.getClass(), "stringCache", term11553);
        setField(term11543, term11543.getClass(), "reader", term11544);
        setIntField(term11626, term11626.getClass(), "maxSize", 0);
        setField(term11626, term11626.getClass(), "elementData", null);
        setIntField(term11626, term11626.getClass(), "size", 0);
        setIntField(term11626, term11626.getClass(), "modCount", 0);
        setField(term11543, term11543.getClass(), "errors", term11626);
        setField(term11543, term11543.getClass(), "state", enum196);
        setField(term11543, term11543.getClass(), "emitPending", null);
        setBooleanField(term11543, term11543.getClass(), "isEmitPending", false);
        setField(term11543, term11543.getClass(), "charsString", "OEXDRUKcFl");
        setField(term11672, term11672.getClass(), "value", term11673);
        setByteField(term11672, term11672.getClass(), "coder", (byte) -119);
        setIntField(term11672, term11672.getClass(), "count", 1240914516);
        setField(term11543, term11543.getClass(), "charsBuilder", term11672);
        setField(term11692, term11692.getClass(), "value", term11693);
        setByteField(term11692, term11692.getClass(), "coder", (byte) -66);
        setIntField(term11692, term11692.getClass(), "count", -1465035361);
        setField(term11543, term11543.getClass(), "dataBuffer", term11692);
        setField(term11543, term11543.getClass(), "tagPending", null);
        setField(term11712, term11712.getClass(), "tagName", "RYdKCNNMBR");
        setField(term11712, term11712.getClass(), "normalName", "yGtHPyvYiQ");
        setField(term11712, term11712.getClass(), "pendingAttributeName", "MvRIxilFMJ");
        setField(term11749, term11749.getClass(), "value", term11750);
        setByteField(term11749, term11749.getClass(), "coder", (byte) 0);
        setIntField(term11749, term11749.getClass(), "count", 0);
        setField(term11712, term11712.getClass(), "pendingAttributeValue", term11749);
        setField(term11712, term11712.getClass(), "pendingAttributeValueS", "iNwOJRBEjp");
        setBooleanField(term11712, term11712.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term11712, term11712.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term11712, term11712.getClass(), "selfClosing", false);
        setField(term11784, term11784.getClass(), "attributes", null);
        setField(term11712, term11712.getClass(), "attributes", term11784);
        setField(term11712, term11712.getClass(), "type", enum197);
        setField(term11543, term11543.getClass(), "startPending", term11712);
        setField(term11797, term11797.getClass(), "tagName", "XylxrMBraH");
        setField(term11797, term11797.getClass(), "normalName", "pORebkoRdD");
        setField(term11797, term11797.getClass(), "pendingAttributeName", "mXGCWJDOqA");
        setField(term11834, term11834.getClass(), "value", term11835);
        setByteField(term11834, term11834.getClass(), "coder", (byte) 0);
        setIntField(term11834, term11834.getClass(), "count", 0);
        setField(term11797, term11797.getClass(), "pendingAttributeValue", term11834);
        setField(term11797, term11797.getClass(), "pendingAttributeValueS", "dpNsDgfPso");
        setBooleanField(term11797, term11797.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term11797, term11797.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term11797, term11797.getClass(), "selfClosing", false);
        setField(term11869, term11869.getClass(), "attributes", term11870);
        setField(term11797, term11797.getClass(), "attributes", term11869);
        setField(term11797, term11797.getClass(), "type", enum198);
        setField(term11543, term11543.getClass(), "endPending", term11797);
        setField(term11889, term11889.getClass(), "data", "AdxvLJhNLe");
        setField(term11889, term11889.getClass(), "type", enum199);
        setField(term11543, term11543.getClass(), "charPending", term11889);
        setField(term11916, term11916.getClass(), "value", term11917);
        setByteField(term11916, term11916.getClass(), "coder", (byte) 0);
        setIntField(term11916, term11916.getClass(), "count", 0);
        setField(term11915, term11915.getClass(), "name", term11916);
        setField(term11915, term11915.getClass(), "pubSysKey", "lHfTrWKMPk");
        setField(term11948, term11948.getClass(), "value", term11949);
        setByteField(term11948, term11948.getClass(), "coder", (byte) 0);
        setIntField(term11948, term11948.getClass(), "count", 0);
        setField(term11915, term11915.getClass(), "publicIdentifier", term11948);
        setField(term11968, term11968.getClass(), "value", term11969);
        setByteField(term11968, term11968.getClass(), "coder", (byte) 0);
        setIntField(term11968, term11968.getClass(), "count", 0);
        setField(term11915, term11915.getClass(), "systemIdentifier", term11968);
        setBooleanField(term11915, term11915.getClass(), "forceQuirks", true);
        setField(term11915, term11915.getClass(), "type", enum200);
        setField(term11543, term11543.getClass(), "doctypePending", term11915);
        setField(term12001, term12001.getClass(), "value", term12002);
        setByteField(term12001, term12001.getClass(), "coder", (byte) 0);
        setIntField(term12001, term12001.getClass(), "count", 0);
        setField(term12000, term12000.getClass(), "data", term12001);
        setBooleanField(term12000, term12000.getClass(), "bogus", false);
        setField(term12000, term12000.getClass(), "type", enum201);
        setField(term11543, term11543.getClass(), "commentPending", term12000);
        setField(term11543, term11543.getClass(), "lastStartTag", "JDaAnsVTGV");
        setBooleanField(term11543, term11543.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term12046, 0, 1090617576);
        setIntElement(term12046, 1, -1547384488);
        setField(term11543, term11543.getClass(), "codepointHolder", term12046);
        setIntElement(term12049, 0, 1442160736);
        setIntElement(term12049, 1, 1114000454);
        setIntElement(term12049, 2, -556405712);
        setIntElement(term12049, 3, -1772434990);
        setIntElement(term12049, 4, -1845499264);
        setField(term11543, term11543.getClass(), "multipointHolder", term12049);
        term12055 = new Character('w');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term12055;
        try {
            callMethod(klass, "emit", argTypes, term11543, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


