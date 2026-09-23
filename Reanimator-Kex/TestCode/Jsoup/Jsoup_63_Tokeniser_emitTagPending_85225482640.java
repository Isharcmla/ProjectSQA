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

public class Tokeniser_emitTagPending_85225482640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25725;

    public Tokeniser_emitTagPending_85225482640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91999 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term91998 = ((Class) term91999).getDeclaredField((String) "DoctypeName");
        ((Field) term91998).setAccessible(true);
        Object enum278 = ((Field) term91998).get((Object) null);
        Class<? extends Object> term92292 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term92291 = ((Class) term92292).getDeclaredField((String) "StartTag");
        ((Field) term92291).setAccessible(true);
        Object enum279 = ((Field) term92291).get((Object) null);
        LinkedHashMap term26042 = new LinkedHashMap();
        Class<? extends Object> term92539 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term92538 = ((Class) term92539).getDeclaredField((String) "EndTag");
        ((Field) term92538).setAccessible(true);
        Object enum280 = ((Field) term92538).get((Object) null);
        Class<? extends Object> term92734 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term92733 = ((Class) term92734).getDeclaredField((String) "Character");
        ((Field) term92733).setAccessible(true);
        Object enum281 = ((Field) term92733).get((Object) null);
        Class<? extends Object> term92986 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term92985 = ((Class) term92986).getDeclaredField((String) "Doctype");
        ((Field) term92985).setAccessible(true);
        Object enum282 = ((Field) term92985).get((Object) null);
        Class<? extends Object> term93190 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term93189 = ((Class) term93190).getDeclaredField((String) "Comment");
        ((Field) term93189).setAccessible(true);
        Object enum283 = ((Field) term93189).get((Object) null);
        term25725 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term25726 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term25727 = (char[]) newCharArray(6);
        Object[] term25739 = (Object[]) newArray("java.lang.String", 6);
        Object term25812 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term25844 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term25845 = (byte[]) newByteArray(16);
        Object term25864 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term25865 = (byte[]) newByteArray(16);
        Object term25884 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term25921 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term25922 = (byte[]) newByteArray(16);
        Object term25956 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term25969 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term26006 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26007 = (byte[]) newByteArray(16);
        Object term26041 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term26061 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term26087 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term26088 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26089 = (byte[]) newByteArray(16);
        Object term26120 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26121 = (byte[]) newByteArray(16);
        Object term26140 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26141 = (byte[]) newByteArray(16);
        Object term26172 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term26173 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26174 = (byte[]) newByteArray(16);
        int[] term26218 = (int[]) newIntArray(6);
        int[] term26225 = (int[]) newIntArray(5);
        setCharElement(term25727, 0, 'j');
        setCharElement(term25727, 1, 'G');
        setCharElement(term25727, 2, 'Y');
        setCharElement(term25727, 3, 'S');
        setCharElement(term25727, 4, 'R');
        setCharElement(term25727, 5, 'K');
        setField(term25726, term25726.getClass(), "charBuf", term25727);
        setField(term25726, term25726.getClass(), "reader", null);
        setIntField(term25726, term25726.getClass(), "bufLength", -1882480155);
        setIntField(term25726, term25726.getClass(), "bufSplitPoint", -1410220680);
        setIntField(term25726, term25726.getClass(), "bufPos", 389427431);
        setIntField(term25726, term25726.getClass(), "readerPos", -1945706126);
        setIntField(term25726, term25726.getClass(), "bufMark", 1152356969);
        setElement(term25739, 0, "iIRsCSYqXH");
        setElement(term25739, 1, "nghfqDXyCG");
        setElement(term25739, 2, "WBAOTqErtm");
        setElement(term25739, 3, "PqtVXXZMqK");
        setElement(term25739, 4, "rYbtIDVdnd");
        setElement(term25739, 5, "UKAReurpHG");
        setField(term25726, term25726.getClass(), "stringCache", term25739);
        setField(term25725, term25725.getClass(), "reader", term25726);
        setIntField(term25812, term25812.getClass(), "maxSize", 0);
        setField(term25812, term25812.getClass(), "elementData", null);
        setIntField(term25812, term25812.getClass(), "size", 0);
        setIntField(term25812, term25812.getClass(), "modCount", 0);
        setField(term25725, term25725.getClass(), "errors", term25812);
        setField(term25725, term25725.getClass(), "state", enum278);
        setField(term25725, term25725.getClass(), "emitPending", null);
        setBooleanField(term25725, term25725.getClass(), "isEmitPending", false);
        setField(term25725, term25725.getClass(), "charsString", "WVRMUmrljA");
        setField(term25844, term25844.getClass(), "value", term25845);
        setByteField(term25844, term25844.getClass(), "coder", (byte) -112);
        setIntField(term25844, term25844.getClass(), "count", -1667990367);
        setField(term25725, term25725.getClass(), "charsBuilder", term25844);
        setField(term25864, term25864.getClass(), "value", term25865);
        setByteField(term25864, term25864.getClass(), "coder", (byte) -111);
        setIntField(term25864, term25864.getClass(), "count", -1214628358);
        setField(term25725, term25725.getClass(), "dataBuffer", term25864);
        setField(term25725, term25725.getClass(), "tagPending", null);
        setField(term25884, term25884.getClass(), "tagName", "NTlKJDDWlk");
        setField(term25884, term25884.getClass(), "normalName", "vOuMEpOQAg");
        setField(term25884, term25884.getClass(), "pendingAttributeName", "SIODFGaQhr");
        setField(term25921, term25921.getClass(), "value", term25922);
        setByteField(term25921, term25921.getClass(), "coder", (byte) 0);
        setIntField(term25921, term25921.getClass(), "count", 0);
        setField(term25884, term25884.getClass(), "pendingAttributeValue", term25921);
        setField(term25884, term25884.getClass(), "pendingAttributeValueS", "qYzsiuXOgS");
        setBooleanField(term25884, term25884.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term25884, term25884.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term25884, term25884.getClass(), "selfClosing", false);
        setField(term25956, term25956.getClass(), "attributes", null);
        setField(term25884, term25884.getClass(), "attributes", term25956);
        setField(term25884, term25884.getClass(), "type", enum279);
        setField(term25725, term25725.getClass(), "startPending", term25884);
        setField(term25969, term25969.getClass(), "tagName", "bxrCBbrrct");
        setField(term25969, term25969.getClass(), "normalName", "CKWpJaaaxX");
        setField(term25969, term25969.getClass(), "pendingAttributeName", "UBRmXJmfrt");
        setField(term26006, term26006.getClass(), "value", term26007);
        setByteField(term26006, term26006.getClass(), "coder", (byte) 0);
        setIntField(term26006, term26006.getClass(), "count", 0);
        setField(term25969, term25969.getClass(), "pendingAttributeValue", term26006);
        setField(term25969, term25969.getClass(), "pendingAttributeValueS", "WZzvmIHhzZ");
        setBooleanField(term25969, term25969.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term25969, term25969.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term25969, term25969.getClass(), "selfClosing", false);
        setField(term26041, term26041.getClass(), "attributes", term26042);
        setField(term25969, term25969.getClass(), "attributes", term26041);
        setField(term25969, term25969.getClass(), "type", enum280);
        setField(term25725, term25725.getClass(), "endPending", term25969);
        setField(term26061, term26061.getClass(), "data", "ypEdrstygY");
        setField(term26061, term26061.getClass(), "type", enum281);
        setField(term25725, term25725.getClass(), "charPending", term26061);
        setField(term26088, term26088.getClass(), "value", term26089);
        setByteField(term26088, term26088.getClass(), "coder", (byte) 0);
        setIntField(term26088, term26088.getClass(), "count", 0);
        setField(term26087, term26087.getClass(), "name", term26088);
        setField(term26087, term26087.getClass(), "pubSysKey", "sNQFlATEeQ");
        setField(term26120, term26120.getClass(), "value", term26121);
        setByteField(term26120, term26120.getClass(), "coder", (byte) 0);
        setIntField(term26120, term26120.getClass(), "count", 0);
        setField(term26087, term26087.getClass(), "publicIdentifier", term26120);
        setField(term26140, term26140.getClass(), "value", term26141);
        setByteField(term26140, term26140.getClass(), "coder", (byte) 0);
        setIntField(term26140, term26140.getClass(), "count", 0);
        setField(term26087, term26087.getClass(), "systemIdentifier", term26140);
        setBooleanField(term26087, term26087.getClass(), "forceQuirks", true);
        setField(term26087, term26087.getClass(), "type", enum282);
        setField(term25725, term25725.getClass(), "doctypePending", term26087);
        setField(term26173, term26173.getClass(), "value", term26174);
        setByteField(term26173, term26173.getClass(), "coder", (byte) 0);
        setIntField(term26173, term26173.getClass(), "count", 0);
        setField(term26172, term26172.getClass(), "data", term26173);
        setBooleanField(term26172, term26172.getClass(), "bogus", true);
        setField(term26172, term26172.getClass(), "type", enum283);
        setField(term25725, term25725.getClass(), "commentPending", term26172);
        setField(term25725, term25725.getClass(), "lastStartTag", "ZKMLioamsY");
        setBooleanField(term25725, term25725.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term26218, 0, 1102721075);
        setIntElement(term26218, 1, -426764678);
        setIntElement(term26218, 2, -1222614956);
        setIntElement(term26218, 3, -1870495012);
        setIntElement(term26218, 4, -1310015129);
        setIntElement(term26218, 5, -2104981311);
        setField(term25725, term25725.getClass(), "codepointHolder", term26218);
        setIntElement(term26225, 0, -571169753);
        setIntElement(term26225, 1, 318591690);
        setIntElement(term26225, 2, -165587447);
        setIntElement(term26225, 3, -1347358701);
        setIntElement(term26225, 4, 806595993);
        setField(term25725, term25725.getClass(), "multipointHolder", term26225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term25725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


