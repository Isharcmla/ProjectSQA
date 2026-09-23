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
import java.util.LinkedHashMap;

public class Tokeniser_createTempBuffer_213098673045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35421;

    public Tokeniser_createTempBuffer_213098673045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107081 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term107080 = ((Class) term107081).getDeclaredField((String) "Data");
        ((Field) term107080).setAccessible(true);
        Object enum328 = ((Field) term107080).get((Object) null);
        Class<? extends Object> term107353 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term107352 = ((Class) term107353).getDeclaredField((String) "StartTag");
        ((Field) term107352).setAccessible(true);
        Object enum329 = ((Field) term107352).get((Object) null);
        LinkedHashMap term35733 = new LinkedHashMap();
        Class<? extends Object> term107600 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term107599 = ((Class) term107600).getDeclaredField((String) "EndTag");
        ((Field) term107599).setAccessible(true);
        Object enum330 = ((Field) term107599).get((Object) null);
        Class<? extends Object> term107795 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term107794 = ((Class) term107795).getDeclaredField((String) "Character");
        ((Field) term107794).setAccessible(true);
        Object enum331 = ((Field) term107794).get((Object) null);
        Class<? extends Object> term108047 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term108046 = ((Class) term108047).getDeclaredField((String) "Doctype");
        ((Field) term108046).setAccessible(true);
        Object enum332 = ((Field) term108046).get((Object) null);
        Class<? extends Object> term108251 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term108250 = ((Class) term108251).getDeclaredField((String) "Comment");
        ((Field) term108250).setAccessible(true);
        Object enum333 = ((Field) term108250).get((Object) null);
        term35421 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term35422 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term35423 = (char[]) newCharArray(8);
        Object[] term35437 = (Object[]) newArray("java.lang.String", 6);
        Object term35510 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term35535 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35536 = (byte[]) newByteArray(16);
        Object term35555 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35556 = (byte[]) newByteArray(16);
        Object term35575 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term35612 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35613 = (byte[]) newByteArray(16);
        Object term35647 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term35660 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term35697 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35698 = (byte[]) newByteArray(16);
        Object term35732 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term35752 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term35778 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term35779 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35780 = (byte[]) newByteArray(16);
        Object term35811 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35812 = (byte[]) newByteArray(16);
        Object term35831 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35832 = (byte[]) newByteArray(16);
        Object term35863 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term35864 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35865 = (byte[]) newByteArray(16);
        int[] term35909 = (int[]) newIntArray(1);
        int[] term35911 = (int[]) newIntArray(5);
        setCharElement(term35423, 0, 'r');
        setCharElement(term35423, 1, 'c');
        setCharElement(term35423, 2, 'R');
        setCharElement(term35423, 3, 'M');
        setCharElement(term35423, 4, 'F');
        setCharElement(term35423, 5, 'I');
        setCharElement(term35423, 6, 's');
        setCharElement(term35423, 7, 'Y');
        setField(term35422, term35422.getClass(), "charBuf", term35423);
        setField(term35422, term35422.getClass(), "reader", null);
        setIntField(term35422, term35422.getClass(), "bufLength", -680920524);
        setIntField(term35422, term35422.getClass(), "bufSplitPoint", -916335264);
        setIntField(term35422, term35422.getClass(), "bufPos", -919416536);
        setIntField(term35422, term35422.getClass(), "readerPos", -43417861);
        setIntField(term35422, term35422.getClass(), "bufMark", -1533843432);
        setElement(term35437, 0, "RCOqfVsRHt");
        setElement(term35437, 1, "TSyCeEZPaT");
        setElement(term35437, 2, "JeZFtaqkzW");
        setElement(term35437, 3, "vOVuNSCCLe");
        setElement(term35437, 4, "fzeqPnzpnt");
        setElement(term35437, 5, "RxbhrFBjkO");
        setField(term35422, term35422.getClass(), "stringCache", term35437);
        setField(term35421, term35421.getClass(), "reader", term35422);
        setIntField(term35510, term35510.getClass(), "maxSize", 0);
        setField(term35510, term35510.getClass(), "elementData", null);
        setIntField(term35510, term35510.getClass(), "size", 0);
        setIntField(term35510, term35510.getClass(), "modCount", 0);
        setField(term35421, term35421.getClass(), "errors", term35510);
        setField(term35421, term35421.getClass(), "state", enum328);
        setField(term35421, term35421.getClass(), "emitPending", null);
        setBooleanField(term35421, term35421.getClass(), "isEmitPending", false);
        setField(term35421, term35421.getClass(), "charsString", "aanyiAOJCl");
        setField(term35535, term35535.getClass(), "value", term35536);
        setByteField(term35535, term35535.getClass(), "coder", (byte) -121);
        setIntField(term35535, term35535.getClass(), "count", -123338791);
        setField(term35421, term35421.getClass(), "charsBuilder", term35535);
        setField(term35555, term35555.getClass(), "value", term35556);
        setByteField(term35555, term35555.getClass(), "coder", (byte) -119);
        setIntField(term35555, term35555.getClass(), "count", -1467089634);
        setField(term35421, term35421.getClass(), "dataBuffer", term35555);
        setField(term35421, term35421.getClass(), "tagPending", null);
        setField(term35575, term35575.getClass(), "tagName", "VDokbsCuqq");
        setField(term35575, term35575.getClass(), "normalName", "xClUIcPECX");
        setField(term35575, term35575.getClass(), "pendingAttributeName", "avhRaGZaBF");
        setField(term35612, term35612.getClass(), "value", term35613);
        setByteField(term35612, term35612.getClass(), "coder", (byte) 0);
        setIntField(term35612, term35612.getClass(), "count", 0);
        setField(term35575, term35575.getClass(), "pendingAttributeValue", term35612);
        setField(term35575, term35575.getClass(), "pendingAttributeValueS", "JkgoRtImdE");
        setBooleanField(term35575, term35575.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term35575, term35575.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term35575, term35575.getClass(), "selfClosing", true);
        setField(term35647, term35647.getClass(), "attributes", null);
        setField(term35575, term35575.getClass(), "attributes", term35647);
        setField(term35575, term35575.getClass(), "type", enum329);
        setField(term35421, term35421.getClass(), "startPending", term35575);
        setField(term35660, term35660.getClass(), "tagName", "qFGKIJjlmV");
        setField(term35660, term35660.getClass(), "normalName", "IHqvyhMtuM");
        setField(term35660, term35660.getClass(), "pendingAttributeName", "dAldIGYAXV");
        setField(term35697, term35697.getClass(), "value", term35698);
        setByteField(term35697, term35697.getClass(), "coder", (byte) 0);
        setIntField(term35697, term35697.getClass(), "count", 0);
        setField(term35660, term35660.getClass(), "pendingAttributeValue", term35697);
        setField(term35660, term35660.getClass(), "pendingAttributeValueS", "mLwibAPEsa");
        setBooleanField(term35660, term35660.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term35660, term35660.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term35660, term35660.getClass(), "selfClosing", false);
        setField(term35732, term35732.getClass(), "attributes", term35733);
        setField(term35660, term35660.getClass(), "attributes", term35732);
        setField(term35660, term35660.getClass(), "type", enum330);
        setField(term35421, term35421.getClass(), "endPending", term35660);
        setField(term35752, term35752.getClass(), "data", "MeTmRZXErV");
        setField(term35752, term35752.getClass(), "type", enum331);
        setField(term35421, term35421.getClass(), "charPending", term35752);
        setField(term35779, term35779.getClass(), "value", term35780);
        setByteField(term35779, term35779.getClass(), "coder", (byte) 0);
        setIntField(term35779, term35779.getClass(), "count", 0);
        setField(term35778, term35778.getClass(), "name", term35779);
        setField(term35778, term35778.getClass(), "pubSysKey", "jNxbVmoZgq");
        setField(term35811, term35811.getClass(), "value", term35812);
        setByteField(term35811, term35811.getClass(), "coder", (byte) 0);
        setIntField(term35811, term35811.getClass(), "count", 0);
        setField(term35778, term35778.getClass(), "publicIdentifier", term35811);
        setField(term35831, term35831.getClass(), "value", term35832);
        setByteField(term35831, term35831.getClass(), "coder", (byte) 0);
        setIntField(term35831, term35831.getClass(), "count", 0);
        setField(term35778, term35778.getClass(), "systemIdentifier", term35831);
        setBooleanField(term35778, term35778.getClass(), "forceQuirks", true);
        setField(term35778, term35778.getClass(), "type", enum332);
        setField(term35421, term35421.getClass(), "doctypePending", term35778);
        setField(term35864, term35864.getClass(), "value", term35865);
        setByteField(term35864, term35864.getClass(), "coder", (byte) 0);
        setIntField(term35864, term35864.getClass(), "count", 0);
        setField(term35863, term35863.getClass(), "data", term35864);
        setBooleanField(term35863, term35863.getClass(), "bogus", false);
        setField(term35863, term35863.getClass(), "type", enum333);
        setField(term35421, term35421.getClass(), "commentPending", term35863);
        setField(term35421, term35421.getClass(), "lastStartTag", "PvmBHIXaMY");
        setBooleanField(term35421, term35421.getClass(), "selfClosingFlagAcknowledged", true);
        setIntElement(term35909, 0, 413548937);
        setField(term35421, term35421.getClass(), "codepointHolder", term35909);
        setIntElement(term35911, 0, 1901317214);
        setIntElement(term35911, 1, 1166710220);
        setIntElement(term35911, 2, -1070592289);
        setIntElement(term35911, 3, -1464172784);
        setIntElement(term35911, 4, 32185364);
        setField(term35421, term35421.getClass(), "multipointHolder", term35911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createTempBuffer", argTypes, term35421, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


