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

public class Tokeniser_emit_32404072630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5651;

    public Tokeniser_emit_32404072630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63386 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term63385 = ((Class) term63386).getDeclaredField((String) "AttributeName");
        ((Field) term63385).setAccessible(true);
        Object enum178 = ((Field) term63385).get((Object) null);
        Class<? extends Object> term63685 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term63684 = ((Class) term63685).getDeclaredField((String) "StartTag");
        ((Field) term63684).setAccessible(true);
        Object enum179 = ((Field) term63684).get((Object) null);
        LinkedHashMap term5921 = new LinkedHashMap();
        Class<? extends Object> term63932 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term63931 = ((Class) term63932).getDeclaredField((String) "EndTag");
        ((Field) term63931).setAccessible(true);
        Object enum180 = ((Field) term63931).get((Object) null);
        Class<? extends Object> term64127 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term64126 = ((Class) term64127).getDeclaredField((String) "Character");
        ((Field) term64126).setAccessible(true);
        Object enum181 = ((Field) term64126).get((Object) null);
        Class<? extends Object> term64379 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term64378 = ((Class) term64379).getDeclaredField((String) "Doctype");
        ((Field) term64378).setAccessible(true);
        Object enum182 = ((Field) term64378).get((Object) null);
        Class<? extends Object> term64583 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term64582 = ((Class) term64583).getDeclaredField((String) "Comment");
        ((Field) term64582).setAccessible(true);
        Object enum183 = ((Field) term64582).get((Object) null);
        term5651 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term5652 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5653 = (char[]) newCharArray(5);
        Object[] term5664 = (Object[]) newArray("java.lang.String", 2);
        Object term5689 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term5723 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5724 = (byte[]) newByteArray(16);
        Object term5743 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5744 = (byte[]) newByteArray(16);
        Object term5763 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term5800 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5801 = (byte[]) newByteArray(16);
        Object term5835 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term5848 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term5885 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5886 = (byte[]) newByteArray(16);
        Object term5920 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term5940 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term5966 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term5967 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5968 = (byte[]) newByteArray(16);
        Object term5999 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6000 = (byte[]) newByteArray(16);
        Object term6019 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6020 = (byte[]) newByteArray(16);
        Object term6051 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term6052 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6053 = (byte[]) newByteArray(16);
        int[] term6097 = (int[]) newIntArray(1);
        int[] term6099 = (int[]) newIntArray(0);
        setCharElement(term5653, 0, 'A');
        setCharElement(term5653, 1, 'E');
        setCharElement(term5653, 2, 't');
        setCharElement(term5653, 3, 'R');
        setCharElement(term5653, 4, 'r');
        setField(term5652, term5652.getClass(), "charBuf", term5653);
        setField(term5652, term5652.getClass(), "reader", null);
        setIntField(term5652, term5652.getClass(), "bufLength", -1145578966);
        setIntField(term5652, term5652.getClass(), "bufSplitPoint", 679763016);
        setIntField(term5652, term5652.getClass(), "bufPos", 1962444399);
        setIntField(term5652, term5652.getClass(), "readerPos", 767834723);
        setIntField(term5652, term5652.getClass(), "bufMark", -602026508);
        setElement(term5664, 0, "GzFkzHGYFt");
        setElement(term5664, 1, "tShwQLRGNe");
        setField(term5652, term5652.getClass(), "stringCache", term5664);
        setField(term5651, term5651.getClass(), "reader", term5652);
        setIntField(term5689, term5689.getClass(), "maxSize", 0);
        setField(term5689, term5689.getClass(), "elementData", null);
        setIntField(term5689, term5689.getClass(), "size", 0);
        setIntField(term5689, term5689.getClass(), "modCount", 0);
        setField(term5651, term5651.getClass(), "errors", term5689);
        setField(term5651, term5651.getClass(), "state", enum178);
        setField(term5651, term5651.getClass(), "emitPending", null);
        setBooleanField(term5651, term5651.getClass(), "isEmitPending", true);
        setField(term5651, term5651.getClass(), "charsString", "LvtrsXUliU");
        setField(term5723, term5723.getClass(), "value", term5724);
        setByteField(term5723, term5723.getClass(), "coder", (byte) 18);
        setIntField(term5723, term5723.getClass(), "count", -157887805);
        setField(term5651, term5651.getClass(), "charsBuilder", term5723);
        setField(term5743, term5743.getClass(), "value", term5744);
        setByteField(term5743, term5743.getClass(), "coder", (byte) -58);
        setIntField(term5743, term5743.getClass(), "count", 1876565163);
        setField(term5651, term5651.getClass(), "dataBuffer", term5743);
        setField(term5651, term5651.getClass(), "tagPending", null);
        setField(term5763, term5763.getClass(), "tagName", "xLbjWUgOIL");
        setField(term5763, term5763.getClass(), "normalName", "jDtqGUpnZN");
        setField(term5763, term5763.getClass(), "pendingAttributeName", "nGKItKLYNC");
        setField(term5800, term5800.getClass(), "value", term5801);
        setByteField(term5800, term5800.getClass(), "coder", (byte) 0);
        setIntField(term5800, term5800.getClass(), "count", 0);
        setField(term5763, term5763.getClass(), "pendingAttributeValue", term5800);
        setField(term5763, term5763.getClass(), "pendingAttributeValueS", "UiUYnPrcCi");
        setBooleanField(term5763, term5763.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term5763, term5763.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term5763, term5763.getClass(), "selfClosing", true);
        setField(term5835, term5835.getClass(), "attributes", null);
        setField(term5763, term5763.getClass(), "attributes", term5835);
        setField(term5763, term5763.getClass(), "type", enum179);
        setField(term5651, term5651.getClass(), "startPending", term5763);
        setField(term5848, term5848.getClass(), "tagName", "UoYtihxVaS");
        setField(term5848, term5848.getClass(), "normalName", "JDswTTCZHV");
        setField(term5848, term5848.getClass(), "pendingAttributeName", "onpbIeEKoi");
        setField(term5885, term5885.getClass(), "value", term5886);
        setByteField(term5885, term5885.getClass(), "coder", (byte) 0);
        setIntField(term5885, term5885.getClass(), "count", 0);
        setField(term5848, term5848.getClass(), "pendingAttributeValue", term5885);
        setField(term5848, term5848.getClass(), "pendingAttributeValueS", "YRHGsAkhxb");
        setBooleanField(term5848, term5848.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term5848, term5848.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term5848, term5848.getClass(), "selfClosing", false);
        setField(term5920, term5920.getClass(), "attributes", term5921);
        setField(term5848, term5848.getClass(), "attributes", term5920);
        setField(term5848, term5848.getClass(), "type", enum180);
        setField(term5651, term5651.getClass(), "endPending", term5848);
        setField(term5940, term5940.getClass(), "data", "nHXjMycHlU");
        setField(term5940, term5940.getClass(), "type", enum181);
        setField(term5651, term5651.getClass(), "charPending", term5940);
        setField(term5967, term5967.getClass(), "value", term5968);
        setByteField(term5967, term5967.getClass(), "coder", (byte) 0);
        setIntField(term5967, term5967.getClass(), "count", 0);
        setField(term5966, term5966.getClass(), "name", term5967);
        setField(term5966, term5966.getClass(), "pubSysKey", "ieCtQFdkii");
        setField(term5999, term5999.getClass(), "value", term6000);
        setByteField(term5999, term5999.getClass(), "coder", (byte) 0);
        setIntField(term5999, term5999.getClass(), "count", 0);
        setField(term5966, term5966.getClass(), "publicIdentifier", term5999);
        setField(term6019, term6019.getClass(), "value", term6020);
        setByteField(term6019, term6019.getClass(), "coder", (byte) 0);
        setIntField(term6019, term6019.getClass(), "count", 0);
        setField(term5966, term5966.getClass(), "systemIdentifier", term6019);
        setBooleanField(term5966, term5966.getClass(), "forceQuirks", false);
        setField(term5966, term5966.getClass(), "type", enum182);
        setField(term5651, term5651.getClass(), "doctypePending", term5966);
        setField(term6052, term6052.getClass(), "value", term6053);
        setByteField(term6052, term6052.getClass(), "coder", (byte) 0);
        setIntField(term6052, term6052.getClass(), "count", 0);
        setField(term6051, term6051.getClass(), "data", term6052);
        setBooleanField(term6051, term6051.getClass(), "bogus", true);
        setField(term6051, term6051.getClass(), "type", enum183);
        setField(term5651, term5651.getClass(), "commentPending", term6051);
        setField(term5651, term5651.getClass(), "lastStartTag", "dEnhdmILtU");
        setBooleanField(term5651, term5651.getClass(), "selfClosingFlagAcknowledged", true);
        setIntElement(term6097, 0, -817164822);
        setField(term5651, term5651.getClass(), "codepointHolder", term6097);
        setField(term5651, term5651.getClass(), "multipointHolder", term6099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        try {
            callMethod(klass, "emit", argTypes, term5651, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


