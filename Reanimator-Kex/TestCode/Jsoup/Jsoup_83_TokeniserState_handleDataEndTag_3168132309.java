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

public class TokeniserState_handleDataEndTag_3168132309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term502;
     Object enum110;

    public TokeniserState_handleDataEndTag_3168132309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32220 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term32219 = ((Class) term32220).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term32219).setAccessible(true);
        Object enum104 = ((Field) term32219).get((Object) null);
        Class<? extends Object> term32537 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32536 = ((Class) term32537).getDeclaredField((String) "StartTag");
        ((Field) term32536).setAccessible(true);
        Object enum105 = ((Field) term32536).get((Object) null);
        Class<? extends Object> term32784 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32783 = ((Class) term32784).getDeclaredField((String) "EndTag");
        ((Field) term32783).setAccessible(true);
        Object enum106 = ((Field) term32783).get((Object) null);
        Class<? extends Object> term32979 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32978 = ((Class) term32979).getDeclaredField((String) "Character");
        ((Field) term32978).setAccessible(true);
        Object enum107 = ((Field) term32978).get((Object) null);
        Class<? extends Object> term33231 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33230 = ((Class) term33231).getDeclaredField((String) "Doctype");
        ((Field) term33230).setAccessible(true);
        Object enum108 = ((Field) term33230).get((Object) null);
        Class<? extends Object> term33435 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33434 = ((Class) term33435).getDeclaredField((String) "Comment");
        ((Field) term33434).setAccessible(true);
        Object enum109 = ((Field) term33434).get((Object) null);
        term23 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term24 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term25 = (char[]) newCharArray(5);
        Object[] term36 = (Object[]) newArray("java.lang.String", 4);
        Object term85 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term125 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term126 = (byte[]) newByteArray(16);
        Object term145 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term146 = (byte[]) newByteArray(16);
        Object term165 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term202 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term203 = (byte[]) newByteArray(16);
        Object term237 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term239 = (Object[]) newArray("java.lang.String", 0);
        Object[] term240 = (Object[]) newArray("java.lang.String", 0);
        Object term253 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term290 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term291 = (byte[]) newByteArray(16);
        Object term325 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term327 = (Object[]) newArray("java.lang.String", 0);
        Object[] term328 = (Object[]) newArray("java.lang.String", 0);
        Object term339 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term365 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term366 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term367 = (byte[]) newByteArray(16);
        Object term398 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term399 = (byte[]) newByteArray(16);
        Object term418 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term419 = (byte[]) newByteArray(16);
        Object term450 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term451 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term452 = (byte[]) newByteArray(16);
        int[] term495 = (int[]) newIntArray(4);
        int[] term500 = (int[]) newIntArray(1);
        setCharElement(term25, 0, 'P');
        setCharElement(term25, 1, 'A');
        setCharElement(term25, 2, 'E');
        setCharElement(term25, 3, 'B');
        setCharElement(term25, 4, 't');
        setField(term24, term24.getClass(), "charBuf", term25);
        setField(term24, term24.getClass(), "reader", null);
        setIntField(term24, term24.getClass(), "bufLength", 568599855);
        setIntField(term24, term24.getClass(), "bufSplitPoint", 1162663216);
        setIntField(term24, term24.getClass(), "bufPos", 1484323161);
        setIntField(term24, term24.getClass(), "readerPos", 391863371);
        setIntField(term24, term24.getClass(), "bufMark", -1922583790);
        setElement(term36, 0, "sjlJAEtRrb");
        setElement(term36, 1, "MuLcgQHgqz");
        setElement(term36, 2, "xxtlPwDYFs");
        setElement(term36, 3, "jJCZpVmanW");
        setField(term24, term24.getClass(), "stringCache", term36);
        setField(term23, term23.getClass(), "reader", term24);
        setIntField(term85, term85.getClass(), "maxSize", 0);
        setField(term85, term85.getClass(), "elementData", null);
        setIntField(term85, term85.getClass(), "size", 0);
        setIntField(term85, term85.getClass(), "modCount", 0);
        setField(term23, term23.getClass(), "errors", term85);
        setField(term23, term23.getClass(), "state", enum104);
        setField(term23, term23.getClass(), "emitPending", null);
        setBooleanField(term23, term23.getClass(), "isEmitPending", false);
        setField(term23, term23.getClass(), "charsString", "EGtDIRbSSb");
        setField(term125, term125.getClass(), "value", term126);
        setByteField(term125, term125.getClass(), "coder", (byte) 47);
        setIntField(term125, term125.getClass(), "count", -616727354);
        setField(term23, term23.getClass(), "charsBuilder", term125);
        setField(term145, term145.getClass(), "value", term146);
        setByteField(term145, term145.getClass(), "coder", (byte) 48);
        setIntField(term145, term145.getClass(), "count", -1955890973);
        setField(term23, term23.getClass(), "dataBuffer", term145);
        setField(term23, term23.getClass(), "tagPending", null);
        setField(term165, term165.getClass(), "tagName", "SzjVpOQTyS");
        setField(term165, term165.getClass(), "normalName", "MjGYSRKTNF");
        setField(term165, term165.getClass(), "pendingAttributeName", "hRNSzYYIrc");
        setField(term202, term202.getClass(), "value", term203);
        setByteField(term202, term202.getClass(), "coder", (byte) 0);
        setIntField(term202, term202.getClass(), "count", 0);
        setField(term165, term165.getClass(), "pendingAttributeValue", term202);
        setField(term165, term165.getClass(), "pendingAttributeValueS", "RMFIsYGgne");
        setBooleanField(term165, term165.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term165, term165.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term165, term165.getClass(), "selfClosing", false);
        setIntField(term237, term237.getClass(), "size", 0);
        setField(term237, term237.getClass(), "keys", term239);
        setField(term237, term237.getClass(), "vals", term240);
        setField(term165, term165.getClass(), "attributes", term237);
        setField(term165, term165.getClass(), "type", enum105);
        setField(term23, term23.getClass(), "startPending", term165);
        setField(term253, term253.getClass(), "tagName", "NRdvgJlhkX");
        setField(term253, term253.getClass(), "normalName", "uuaPigETmJ");
        setField(term253, term253.getClass(), "pendingAttributeName", "MxlszYVzRf");
        setField(term290, term290.getClass(), "value", term291);
        setByteField(term290, term290.getClass(), "coder", (byte) 0);
        setIntField(term290, term290.getClass(), "count", 0);
        setField(term253, term253.getClass(), "pendingAttributeValue", term290);
        setField(term253, term253.getClass(), "pendingAttributeValueS", "LQFpaHEwXR");
        setBooleanField(term253, term253.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term253, term253.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term253, term253.getClass(), "selfClosing", true);
        setIntField(term325, term325.getClass(), "size", -2038273078);
        setField(term325, term325.getClass(), "keys", term327);
        setField(term325, term325.getClass(), "vals", term328);
        setField(term253, term253.getClass(), "attributes", term325);
        setField(term253, term253.getClass(), "type", enum106);
        setField(term23, term23.getClass(), "endPending", term253);
        setField(term339, term339.getClass(), "data", "oVcInYnLWB");
        setField(term339, term339.getClass(), "type", enum107);
        setField(term23, term23.getClass(), "charPending", term339);
        setField(term366, term366.getClass(), "value", term367);
        setByteField(term366, term366.getClass(), "coder", (byte) 0);
        setIntField(term366, term366.getClass(), "count", 0);
        setField(term365, term365.getClass(), "name", term366);
        setField(term365, term365.getClass(), "pubSysKey", "aJlieCFVtF");
        setField(term398, term398.getClass(), "value", term399);
        setByteField(term398, term398.getClass(), "coder", (byte) 0);
        setIntField(term398, term398.getClass(), "count", 0);
        setField(term365, term365.getClass(), "publicIdentifier", term398);
        setField(term418, term418.getClass(), "value", term419);
        setByteField(term418, term418.getClass(), "coder", (byte) 0);
        setIntField(term418, term418.getClass(), "count", 0);
        setField(term365, term365.getClass(), "systemIdentifier", term418);
        setBooleanField(term365, term365.getClass(), "forceQuirks", true);
        setField(term365, term365.getClass(), "type", enum108);
        setField(term23, term23.getClass(), "doctypePending", term365);
        setField(term451, term451.getClass(), "value", term452);
        setByteField(term451, term451.getClass(), "coder", (byte) 0);
        setIntField(term451, term451.getClass(), "count", 0);
        setField(term450, term450.getClass(), "data", term451);
        setBooleanField(term450, term450.getClass(), "bogus", false);
        setField(term450, term450.getClass(), "type", enum109);
        setField(term23, term23.getClass(), "commentPending", term450);
        setField(term23, term23.getClass(), "lastStartTag", "ZiaGIbnzTs");
        setIntElement(term495, 0, 1227103734);
        setIntElement(term495, 1, -1339778481);
        setIntElement(term495, 2, 1725571209);
        setIntElement(term495, 3, -522618178);
        setField(term23, term23.getClass(), "codepointHolder", term495);
        setIntElement(term500, 0, 1134449235);
        setField(term23, term23.getClass(), "multipointHolder", term500);
        term502 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term503 = (char[]) newCharArray(6);
        Object[] term515 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term503, 0, 'n');
        setCharElement(term503, 1, 'Z');
        setCharElement(term503, 2, 't');
        setCharElement(term503, 3, 'T');
        setCharElement(term503, 4, 'D');
        setCharElement(term503, 5, 's');
        setField(term502, term502.getClass(), "charBuf", term503);
        setField(term502, term502.getClass(), "reader", null);
        setIntField(term502, term502.getClass(), "bufLength", -883034806);
        setIntField(term502, term502.getClass(), "bufSplitPoint", 1585847225);
        setIntField(term502, term502.getClass(), "bufPos", 597278769);
        setIntField(term502, term502.getClass(), "readerPos", -1685132342);
        setIntField(term502, term502.getClass(), "bufMark", -1456670397);
        setElement(term515, 0, "tbcdzjIfER");
        setElement(term515, 1, "HyxfbSQYBe");
        setField(term502, term502.getClass(), "stringCache", term515);
        Class<? extends Object> term33664 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term33663 = ((Class) term33664).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term33663).setAccessible(true);
        enum110 = ((Field) term33663).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term23;
        args[1] = term502;
        args[2] = enum110;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


