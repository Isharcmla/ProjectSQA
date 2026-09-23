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

public class Tokeniser_read_37425894228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Tokeniser_read_37425894228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59761 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term59760 = ((Class) term59761).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term59760).setAccessible(true);
        Object enum166 = ((Field) term59760).get((Object) null);
        Class<? extends Object> term60078 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term60077 = ((Class) term60078).getDeclaredField((String) "StartTag");
        ((Field) term60077).setAccessible(true);
        Object enum167 = ((Field) term60077).get((Object) null);
        LinkedHashMap term299 = new LinkedHashMap();
        Class<? extends Object> term60325 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term60324 = ((Class) term60325).getDeclaredField((String) "EndTag");
        ((Field) term60324).setAccessible(true);
        Object enum168 = ((Field) term60324).get((Object) null);
        Class<? extends Object> term60520 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term60519 = ((Class) term60520).getDeclaredField((String) "Character");
        ((Field) term60519).setAccessible(true);
        Object enum169 = ((Field) term60519).get((Object) null);
        Class<? extends Object> term60772 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term60771 = ((Class) term60772).getDeclaredField((String) "Doctype");
        ((Field) term60771).setAccessible(true);
        Object enum170 = ((Field) term60771).get((Object) null);
        Class<? extends Object> term60976 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term60975 = ((Class) term60976).getDeclaredField((String) "Comment");
        ((Field) term60975).setAccessible(true);
        Object enum171 = ((Field) term60975).get((Object) null);
        term1 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term2 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3 = (char[]) newCharArray(3);
        Object[] term12 = (Object[]) newArray("java.lang.String", 4);
        Object term61 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term101 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term102 = (byte[]) newByteArray(16);
        Object term121 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term122 = (byte[]) newByteArray(16);
        Object term141 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term178 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term179 = (byte[]) newByteArray(16);
        Object term213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term226 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term263 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term264 = (byte[]) newByteArray(16);
        Object term298 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term318 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term344 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term345 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term346 = (byte[]) newByteArray(16);
        Object term377 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term378 = (byte[]) newByteArray(16);
        Object term397 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term398 = (byte[]) newByteArray(16);
        Object term429 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term430 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term431 = (byte[]) newByteArray(16);
        int[] term475 = (int[]) newIntArray(6);
        int[] term482 = (int[]) newIntArray(2);
        setCharElement(term3, 0, 'n');
        setCharElement(term3, 1, 'Z');
        setCharElement(term3, 2, 't');
        setField(term2, term2.getClass(), "charBuf", term3);
        setField(term2, term2.getClass(), "reader", null);
        setIntField(term2, term2.getClass(), "bufLength", -616727354);
        setIntField(term2, term2.getClass(), "bufSplitPoint", -1955890973);
        setIntField(term2, term2.getClass(), "bufPos", -2038273078);
        setIntField(term2, term2.getClass(), "readerPos", 1227103734);
        setIntField(term2, term2.getClass(), "bufMark", -1339778481);
        setElement(term12, 0, "jJCZpVmanW");
        setElement(term12, 1, "EGtDIRbSSb");
        setElement(term12, 2, "SzjVpOQTyS");
        setElement(term12, 3, "MjGYSRKTNF");
        setField(term2, term2.getClass(), "stringCache", term12);
        setField(term1, term1.getClass(), "reader", term2);
        setIntField(term61, term61.getClass(), "maxSize", 0);
        setField(term61, term61.getClass(), "elementData", null);
        setIntField(term61, term61.getClass(), "size", 0);
        setIntField(term61, term61.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "errors", term61);
        setField(term1, term1.getClass(), "state", enum166);
        setField(term1, term1.getClass(), "emitPending", null);
        setBooleanField(term1, term1.getClass(), "isEmitPending", false);
        setField(term1, term1.getClass(), "charsString", "hRNSzYYIrc");
        setField(term101, term101.getClass(), "value", term102);
        setByteField(term101, term101.getClass(), "coder", (byte) 47);
        setIntField(term101, term101.getClass(), "count", 1725571209);
        setField(term1, term1.getClass(), "charsBuilder", term101);
        setField(term121, term121.getClass(), "value", term122);
        setByteField(term121, term121.getClass(), "coder", (byte) 48);
        setIntField(term121, term121.getClass(), "count", -522618178);
        setField(term1, term1.getClass(), "dataBuffer", term121);
        setField(term1, term1.getClass(), "tagPending", null);
        setField(term141, term141.getClass(), "tagName", "RMFIsYGgne");
        setField(term141, term141.getClass(), "normalName", "NRdvgJlhkX");
        setField(term141, term141.getClass(), "pendingAttributeName", "uuaPigETmJ");
        setField(term178, term178.getClass(), "value", term179);
        setByteField(term178, term178.getClass(), "coder", (byte) 0);
        setIntField(term178, term178.getClass(), "count", 0);
        setField(term141, term141.getClass(), "pendingAttributeValue", term178);
        setField(term141, term141.getClass(), "pendingAttributeValueS", "MxlszYVzRf");
        setBooleanField(term141, term141.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term141, term141.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term141, term141.getClass(), "selfClosing", false);
        setField(term213, term213.getClass(), "attributes", null);
        setField(term141, term141.getClass(), "attributes", term213);
        setField(term141, term141.getClass(), "type", enum167);
        setField(term1, term1.getClass(), "startPending", term141);
        setField(term226, term226.getClass(), "tagName", "LQFpaHEwXR");
        setField(term226, term226.getClass(), "normalName", "oVcInYnLWB");
        setField(term226, term226.getClass(), "pendingAttributeName", "aJlieCFVtF");
        setField(term263, term263.getClass(), "value", term264);
        setByteField(term263, term263.getClass(), "coder", (byte) 0);
        setIntField(term263, term263.getClass(), "count", 0);
        setField(term226, term226.getClass(), "pendingAttributeValue", term263);
        setField(term226, term226.getClass(), "pendingAttributeValueS", "ZiaGIbnzTs");
        setBooleanField(term226, term226.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term226, term226.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term226, term226.getClass(), "selfClosing", true);
        setField(term298, term298.getClass(), "attributes", term299);
        setField(term226, term226.getClass(), "attributes", term298);
        setField(term226, term226.getClass(), "type", enum168);
        setField(term1, term1.getClass(), "endPending", term226);
        setField(term318, term318.getClass(), "data", "hNxWaHcfhY");
        setField(term318, term318.getClass(), "type", enum169);
        setField(term1, term1.getClass(), "charPending", term318);
        setField(term345, term345.getClass(), "value", term346);
        setByteField(term345, term345.getClass(), "coder", (byte) 0);
        setIntField(term345, term345.getClass(), "count", 0);
        setField(term344, term344.getClass(), "name", term345);
        setField(term344, term344.getClass(), "pubSysKey", "RkybSrpybU");
        setField(term377, term377.getClass(), "value", term378);
        setByteField(term377, term377.getClass(), "coder", (byte) 0);
        setIntField(term377, term377.getClass(), "count", 0);
        setField(term344, term344.getClass(), "publicIdentifier", term377);
        setField(term397, term397.getClass(), "value", term398);
        setByteField(term397, term397.getClass(), "coder", (byte) 0);
        setIntField(term397, term397.getClass(), "count", 0);
        setField(term344, term344.getClass(), "systemIdentifier", term397);
        setBooleanField(term344, term344.getClass(), "forceQuirks", true);
        setField(term344, term344.getClass(), "type", enum170);
        setField(term1, term1.getClass(), "doctypePending", term344);
        setField(term430, term430.getClass(), "value", term431);
        setByteField(term430, term430.getClass(), "coder", (byte) 0);
        setIntField(term430, term430.getClass(), "count", 0);
        setField(term429, term429.getClass(), "data", term430);
        setBooleanField(term429, term429.getClass(), "bogus", false);
        setField(term429, term429.getClass(), "type", enum171);
        setField(term1, term1.getClass(), "commentPending", term429);
        setField(term1, term1.getClass(), "lastStartTag", "xOEqzGAmDU");
        setBooleanField(term1, term1.getClass(), "selfClosingFlagAcknowledged", true);
        setIntElement(term475, 0, 1134449235);
        setIntElement(term475, 1, -883034806);
        setIntElement(term475, 2, 1585847225);
        setIntElement(term475, 3, 597278769);
        setIntElement(term475, 4, -1685132342);
        setIntElement(term475, 5, -1456670397);
        setField(term1, term1.getClass(), "codepointHolder", term475);
        setIntElement(term482, 0, 1622346318);
        setIntElement(term482, 1, 1048535127);
        setField(term1, term1.getClass(), "multipointHolder", term482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term1, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


