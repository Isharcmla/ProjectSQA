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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emitCommentPending_190650425142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29561;

    public Tokeniser_emitCommentPending_190650425142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97735 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term97734 = ((Class) term97735).getDeclaredField((String) "ScriptDataEndTagOpen");
        ((Field) term97734).setAccessible(true);
        Object enum298 = ((Field) term97734).get((Object) null);
        Class<? extends Object> term98055 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term98054 = ((Class) term98055).getDeclaredField((String) "StartTag");
        ((Field) term98054).setAccessible(true);
        Object enum299 = ((Field) term98054).get((Object) null);
        LinkedHashMap term29825 = new LinkedHashMap();
        Class<? extends Object> term98302 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term98301 = ((Class) term98302).getDeclaredField((String) "EndTag");
        ((Field) term98301).setAccessible(true);
        Object enum300 = ((Field) term98301).get((Object) null);
        Class<? extends Object> term98497 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term98496 = ((Class) term98497).getDeclaredField((String) "Character");
        ((Field) term98496).setAccessible(true);
        Object enum301 = ((Field) term98496).get((Object) null);
        Class<? extends Object> term98749 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term98748 = ((Class) term98749).getDeclaredField((String) "Doctype");
        ((Field) term98748).setAccessible(true);
        Object enum302 = ((Field) term98748).get((Object) null);
        Class<? extends Object> term98953 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term98952 = ((Class) term98953).getDeclaredField((String) "Comment");
        ((Field) term98952).setAccessible(true);
        Object enum303 = ((Field) term98952).get((Object) null);
        term29561 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term29562 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term29563 = (char[]) newCharArray(4);
        Object[] term29573 = (Object[]) newArray("java.lang.String", 1);
        Object term29586 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term29627 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29628 = (byte[]) newByteArray(16);
        Object term29647 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29648 = (byte[]) newByteArray(16);
        Object term29667 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term29704 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29705 = (byte[]) newByteArray(16);
        Object term29739 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term29752 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term29789 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29790 = (byte[]) newByteArray(16);
        Object term29824 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term29844 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term29870 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term29871 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29872 = (byte[]) newByteArray(16);
        Object term29903 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29904 = (byte[]) newByteArray(16);
        Object term29923 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29924 = (byte[]) newByteArray(16);
        Object term29955 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term29956 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29957 = (byte[]) newByteArray(16);
        int[] term30001 = (int[]) newIntArray(6);
        int[] term30008 = (int[]) newIntArray(7);
        setCharElement(term29563, 0, 'N');
        setCharElement(term29563, 1, 'F');
        setCharElement(term29563, 2, 'h');
        setCharElement(term29563, 3, 'R');
        setField(term29562, term29562.getClass(), "charBuf", term29563);
        setField(term29562, term29562.getClass(), "reader", null);
        setIntField(term29562, term29562.getClass(), "bufLength", -1747406163);
        setIntField(term29562, term29562.getClass(), "bufSplitPoint", 388157121);
        setIntField(term29562, term29562.getClass(), "bufPos", 1684998508);
        setIntField(term29562, term29562.getClass(), "readerPos", -1476644457);
        setIntField(term29562, term29562.getClass(), "bufMark", 1270666529);
        setElement(term29573, 0, "pXdglvyrQe");
        setField(term29562, term29562.getClass(), "stringCache", term29573);
        setField(term29561, term29561.getClass(), "reader", term29562);
        setIntField(term29586, term29586.getClass(), "maxSize", 0);
        setField(term29586, term29586.getClass(), "elementData", null);
        setIntField(term29586, term29586.getClass(), "size", 0);
        setIntField(term29586, term29586.getClass(), "modCount", 0);
        setField(term29561, term29561.getClass(), "errors", term29586);
        setField(term29561, term29561.getClass(), "state", enum298);
        setField(term29561, term29561.getClass(), "emitPending", null);
        setBooleanField(term29561, term29561.getClass(), "isEmitPending", true);
        setField(term29561, term29561.getClass(), "charsString", "OcfNzHYdki");
        setField(term29627, term29627.getClass(), "value", term29628);
        setByteField(term29627, term29627.getClass(), "coder", (byte) 36);
        setIntField(term29627, term29627.getClass(), "count", -1146679443);
        setField(term29561, term29561.getClass(), "charsBuilder", term29627);
        setField(term29647, term29647.getClass(), "value", term29648);
        setByteField(term29647, term29647.getClass(), "coder", (byte) 118);
        setIntField(term29647, term29647.getClass(), "count", -860131894);
        setField(term29561, term29561.getClass(), "dataBuffer", term29647);
        setField(term29561, term29561.getClass(), "tagPending", null);
        setField(term29667, term29667.getClass(), "tagName", "uPuCVuZYOI");
        setField(term29667, term29667.getClass(), "normalName", "TweMFhxNdj");
        setField(term29667, term29667.getClass(), "pendingAttributeName", "NBrvVzvQHe");
        setField(term29704, term29704.getClass(), "value", term29705);
        setByteField(term29704, term29704.getClass(), "coder", (byte) 0);
        setIntField(term29704, term29704.getClass(), "count", 0);
        setField(term29667, term29667.getClass(), "pendingAttributeValue", term29704);
        setField(term29667, term29667.getClass(), "pendingAttributeValueS", "FjOiNAfBOc");
        setBooleanField(term29667, term29667.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term29667, term29667.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term29667, term29667.getClass(), "selfClosing", true);
        setField(term29739, term29739.getClass(), "attributes", null);
        setField(term29667, term29667.getClass(), "attributes", term29739);
        setField(term29667, term29667.getClass(), "type", enum299);
        setField(term29561, term29561.getClass(), "startPending", term29667);
        setField(term29752, term29752.getClass(), "tagName", "iCCsaLHohG");
        setField(term29752, term29752.getClass(), "normalName", "NJhGgctbdj");
        setField(term29752, term29752.getClass(), "pendingAttributeName", "MYWYUeLGOp");
        setField(term29789, term29789.getClass(), "value", term29790);
        setByteField(term29789, term29789.getClass(), "coder", (byte) 0);
        setIntField(term29789, term29789.getClass(), "count", 0);
        setField(term29752, term29752.getClass(), "pendingAttributeValue", term29789);
        setField(term29752, term29752.getClass(), "pendingAttributeValueS", "tsTGdgQYUL");
        setBooleanField(term29752, term29752.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term29752, term29752.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term29752, term29752.getClass(), "selfClosing", false);
        setField(term29824, term29824.getClass(), "attributes", term29825);
        setField(term29752, term29752.getClass(), "attributes", term29824);
        setField(term29752, term29752.getClass(), "type", enum300);
        setField(term29561, term29561.getClass(), "endPending", term29752);
        setField(term29844, term29844.getClass(), "data", "oPxuZbkYio");
        setField(term29844, term29844.getClass(), "type", enum301);
        setField(term29561, term29561.getClass(), "charPending", term29844);
        setField(term29871, term29871.getClass(), "value", term29872);
        setByteField(term29871, term29871.getClass(), "coder", (byte) 0);
        setIntField(term29871, term29871.getClass(), "count", 0);
        setField(term29870, term29870.getClass(), "name", term29871);
        setField(term29870, term29870.getClass(), "pubSysKey", "vKitydDVnM");
        setField(term29903, term29903.getClass(), "value", term29904);
        setByteField(term29903, term29903.getClass(), "coder", (byte) 0);
        setIntField(term29903, term29903.getClass(), "count", 0);
        setField(term29870, term29870.getClass(), "publicIdentifier", term29903);
        setField(term29923, term29923.getClass(), "value", term29924);
        setByteField(term29923, term29923.getClass(), "coder", (byte) 0);
        setIntField(term29923, term29923.getClass(), "count", 0);
        setField(term29870, term29870.getClass(), "systemIdentifier", term29923);
        setBooleanField(term29870, term29870.getClass(), "forceQuirks", true);
        setField(term29870, term29870.getClass(), "type", enum302);
        setField(term29561, term29561.getClass(), "doctypePending", term29870);
        setField(term29956, term29956.getClass(), "value", term29957);
        setByteField(term29956, term29956.getClass(), "coder", (byte) 0);
        setIntField(term29956, term29956.getClass(), "count", 0);
        setField(term29955, term29955.getClass(), "data", term29956);
        setBooleanField(term29955, term29955.getClass(), "bogus", true);
        setField(term29955, term29955.getClass(), "type", enum303);
        setField(term29561, term29561.getClass(), "commentPending", term29955);
        setField(term29561, term29561.getClass(), "lastStartTag", "urCiQnUFBM");
        setBooleanField(term29561, term29561.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term30001, 0, -1022990421);
        setIntElement(term30001, 1, 1045547089);
        setIntElement(term30001, 2, -1122880881);
        setIntElement(term30001, 3, -542712742);
        setIntElement(term30001, 4, -1254072822);
        setIntElement(term30001, 5, -1111249833);
        setField(term29561, term29561.getClass(), "codepointHolder", term30001);
        setIntElement(term30008, 0, -1692331299);
        setIntElement(term30008, 1, 479531250);
        setIntElement(term30008, 2, 1320570890);
        setIntElement(term30008, 3, -130649791);
        setIntElement(term30008, 4, 534834644);
        setIntElement(term30008, 5, 1959097203);
        setIntElement(term30008, 6, -209654048);
        setField(term29561, term29561.getClass(), "multipointHolder", term30008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term29561, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


