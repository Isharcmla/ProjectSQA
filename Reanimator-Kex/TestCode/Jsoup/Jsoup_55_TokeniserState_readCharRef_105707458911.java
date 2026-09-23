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
import java.util.LinkedHashMap;

public class TokeniserState_readCharRef_105707458911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6201;
     Object enum133;

    public TokeniserState_readCharRef_105707458911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39037 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term39036 = ((Class) term39037).getDeclaredField((String) "AfterDoctypePublicKeyword");
        ((Field) term39036).setAccessible(true);
        Object enum127 = ((Field) term39036).get((Object) null);
        Class<? extends Object> term39372 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term39371 = ((Class) term39372).getDeclaredField((String) "StartTag");
        ((Field) term39371).setAccessible(true);
        Object enum128 = ((Field) term39371).get((Object) null);
        LinkedHashMap term6467 = new LinkedHashMap();
        Class<? extends Object> term39619 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term39618 = ((Class) term39619).getDeclaredField((String) "EndTag");
        ((Field) term39618).setAccessible(true);
        Object enum129 = ((Field) term39618).get((Object) null);
        Class<? extends Object> term39814 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term39813 = ((Class) term39814).getDeclaredField((String) "Character");
        ((Field) term39813).setAccessible(true);
        Object enum130 = ((Field) term39813).get((Object) null);
        Class<? extends Object> term40056 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term40055 = ((Class) term40056).getDeclaredField((String) "Doctype");
        ((Field) term40055).setAccessible(true);
        Object enum131 = ((Field) term40055).get((Object) null);
        Class<? extends Object> term40260 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term40259 = ((Class) term40260).getDeclaredField((String) "Comment");
        ((Field) term40259).setAccessible(true);
        Object enum132 = ((Field) term40259).get((Object) null);
        term6201 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term6202 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6203 = (char[]) newCharArray(3);
        Object[] term6210 = (Object[]) newArray("java.lang.String", 1);
        Object term6223 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term6269 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6270 = (byte[]) newByteArray(16);
        Object term6289 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6290 = (byte[]) newByteArray(16);
        Object term6309 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term6346 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6347 = (byte[]) newByteArray(16);
        Object term6381 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term6394 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term6431 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6432 = (byte[]) newByteArray(16);
        Object term6466 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term6486 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term6512 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term6513 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6514 = (byte[]) newByteArray(16);
        Object term6533 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6534 = (byte[]) newByteArray(16);
        Object term6553 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6554 = (byte[]) newByteArray(16);
        Object term6585 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term6586 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6587 = (byte[]) newByteArray(16);
        int[] term6631 = (int[]) newIntArray(2);
        int[] term6634 = (int[]) newIntArray(8);
        setCharElement(term6203, 0, 'L');
        setCharElement(term6203, 1, 'c');
        setCharElement(term6203, 2, 'g');
        setField(term6202, term6202.getClass(), "input", term6203);
        setIntField(term6202, term6202.getClass(), "length", -73683645);
        setIntField(term6202, term6202.getClass(), "pos", -226514366);
        setIntField(term6202, term6202.getClass(), "mark", 1193880199);
        setElement(term6210, 0, "BndsHwAFMv");
        setField(term6202, term6202.getClass(), "stringCache", term6210);
        setField(term6201, term6201.getClass(), "reader", term6202);
        setIntField(term6223, term6223.getClass(), "maxSize", 0);
        setField(term6223, term6223.getClass(), "elementData", null);
        setIntField(term6223, term6223.getClass(), "size", 0);
        setIntField(term6223, term6223.getClass(), "modCount", 0);
        setField(term6201, term6201.getClass(), "errors", term6223);
        setField(term6201, term6201.getClass(), "state", enum127);
        setField(term6201, term6201.getClass(), "emitPending", null);
        setBooleanField(term6201, term6201.getClass(), "isEmitPending", true);
        setField(term6201, term6201.getClass(), "charsString", "GzFkzHGYFt");
        setField(term6269, term6269.getClass(), "value", term6270);
        setByteField(term6269, term6269.getClass(), "coder", (byte) 18);
        setIntField(term6269, term6269.getClass(), "count", -1087774327);
        setField(term6201, term6201.getClass(), "charsBuilder", term6269);
        setField(term6289, term6289.getClass(), "value", term6290);
        setByteField(term6289, term6289.getClass(), "coder", (byte) -58);
        setIntField(term6289, term6289.getClass(), "count", -1530420153);
        setField(term6201, term6201.getClass(), "dataBuffer", term6289);
        setField(term6201, term6201.getClass(), "tagPending", null);
        setField(term6309, term6309.getClass(), "tagName", "tShwQLRGNe");
        setField(term6309, term6309.getClass(), "normalName", "LvtrsXUliU");
        setField(term6309, term6309.getClass(), "pendingAttributeName", "xLbjWUgOIL");
        setField(term6346, term6346.getClass(), "value", term6347);
        setByteField(term6346, term6346.getClass(), "coder", (byte) 0);
        setIntField(term6346, term6346.getClass(), "count", 0);
        setField(term6309, term6309.getClass(), "pendingAttributeValue", term6346);
        setField(term6309, term6309.getClass(), "pendingAttributeValueS", "jDtqGUpnZN");
        setBooleanField(term6309, term6309.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term6309, term6309.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term6309, term6309.getClass(), "selfClosing", true);
        setField(term6381, term6381.getClass(), "attributes", null);
        setField(term6309, term6309.getClass(), "attributes", term6381);
        setField(term6309, term6309.getClass(), "type", enum128);
        setField(term6201, term6201.getClass(), "startPending", term6309);
        setField(term6394, term6394.getClass(), "tagName", "nGKItKLYNC");
        setField(term6394, term6394.getClass(), "normalName", "UiUYnPrcCi");
        setField(term6394, term6394.getClass(), "pendingAttributeName", "UoYtihxVaS");
        setField(term6431, term6431.getClass(), "value", term6432);
        setByteField(term6431, term6431.getClass(), "coder", (byte) 0);
        setIntField(term6431, term6431.getClass(), "count", 0);
        setField(term6394, term6394.getClass(), "pendingAttributeValue", term6431);
        setField(term6394, term6394.getClass(), "pendingAttributeValueS", "JDswTTCZHV");
        setBooleanField(term6394, term6394.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term6394, term6394.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term6394, term6394.getClass(), "selfClosing", false);
        setField(term6466, term6466.getClass(), "attributes", term6467);
        setField(term6394, term6394.getClass(), "attributes", term6466);
        setField(term6394, term6394.getClass(), "type", enum129);
        setField(term6201, term6201.getClass(), "endPending", term6394);
        setField(term6486, term6486.getClass(), "data", "MLqYREekMl");
        setField(term6486, term6486.getClass(), "type", enum130);
        setField(term6201, term6201.getClass(), "charPending", term6486);
        setField(term6513, term6513.getClass(), "value", term6514);
        setByteField(term6513, term6513.getClass(), "coder", (byte) 0);
        setIntField(term6513, term6513.getClass(), "count", 0);
        setField(term6512, term6512.getClass(), "name", term6513);
        setField(term6533, term6533.getClass(), "value", term6534);
        setByteField(term6533, term6533.getClass(), "coder", (byte) 0);
        setIntField(term6533, term6533.getClass(), "count", 0);
        setField(term6512, term6512.getClass(), "publicIdentifier", term6533);
        setField(term6553, term6553.getClass(), "value", term6554);
        setByteField(term6553, term6553.getClass(), "coder", (byte) 0);
        setIntField(term6553, term6553.getClass(), "count", 0);
        setField(term6512, term6512.getClass(), "systemIdentifier", term6553);
        setBooleanField(term6512, term6512.getClass(), "forceQuirks", false);
        setField(term6512, term6512.getClass(), "type", enum131);
        setField(term6201, term6201.getClass(), "doctypePending", term6512);
        setField(term6586, term6586.getClass(), "value", term6587);
        setByteField(term6586, term6586.getClass(), "coder", (byte) 0);
        setIntField(term6586, term6586.getClass(), "count", 0);
        setField(term6585, term6585.getClass(), "data", term6586);
        setBooleanField(term6585, term6585.getClass(), "bogus", true);
        setField(term6585, term6585.getClass(), "type", enum132);
        setField(term6201, term6201.getClass(), "commentPending", term6585);
        setField(term6201, term6201.getClass(), "lastStartTag", "ytSBIKXogI");
        setBooleanField(term6201, term6201.getClass(), "selfClosingFlagAcknowledged", true);
        setIntElement(term6631, 0, -469968304);
        setIntElement(term6631, 1, -1145578966);
        setField(term6201, term6201.getClass(), "codepointHolder", term6631);
        setIntElement(term6634, 0, 679763016);
        setIntElement(term6634, 1, 1962444399);
        setIntElement(term6634, 2, 767834723);
        setIntElement(term6634, 3, -602026508);
        setIntElement(term6634, 4, -157887805);
        setIntElement(term6634, 5, 1876565163);
        setIntElement(term6634, 6, -817164822);
        setIntElement(term6634, 7, -1016503459);
        setField(term6201, term6201.getClass(), "multipointHolder", term6634);
        Class<? extends Object> term40468 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term40467 = ((Class) term40468).getDeclaredField((String) "ScriptDataDoubleEscapedDashDash");
        ((Field) term40467).setAccessible(true);
        enum133 = ((Field) term40467).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term6201;
        args[1] = enum133;
        try {
            callMethod(klass, "readCharRef", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


