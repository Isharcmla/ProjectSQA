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

public class TokeniserState_handleDataEndTag_3168132309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term492;
     Object enum110;

    public TokeniserState_handleDataEndTag_3168132309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32151 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term32150 = ((Class) term32151).getDeclaredField((String) "BeforeAttributeName");
        ((Field) term32150).setAccessible(true);
        Object enum104 = ((Field) term32150).get((Object) null);
        Class<? extends Object> term32468 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32467 = ((Class) term32468).getDeclaredField((String) "StartTag");
        ((Field) term32467).setAccessible(true);
        Object enum105 = ((Field) term32467).get((Object) null);
        LinkedHashMap term321 = new LinkedHashMap();
        Class<? extends Object> term32715 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32714 = ((Class) term32715).getDeclaredField((String) "EndTag");
        ((Field) term32714).setAccessible(true);
        Object enum106 = ((Field) term32714).get((Object) null);
        Class<? extends Object> term32910 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32909 = ((Class) term32910).getDeclaredField((String) "Character");
        ((Field) term32909).setAccessible(true);
        Object enum107 = ((Field) term32909).get((Object) null);
        Class<? extends Object> term33152 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33151 = ((Class) term33152).getDeclaredField((String) "Doctype");
        ((Field) term33151).setAccessible(true);
        Object enum108 = ((Field) term33151).get((Object) null);
        Class<? extends Object> term33356 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33355 = ((Class) term33356).getDeclaredField((String) "Comment");
        ((Field) term33355).setAccessible(true);
        Object enum109 = ((Field) term33355).get((Object) null);
        term23 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term24 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term25 = (char[]) newCharArray(5);
        Object[] term34 = (Object[]) newArray("java.lang.String", 4);
        Object term83 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term123 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term124 = (byte[]) newByteArray(16);
        Object term143 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term144 = (byte[]) newByteArray(16);
        Object term163 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term200 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term201 = (byte[]) newByteArray(16);
        Object term235 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term248 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term285 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term286 = (byte[]) newByteArray(16);
        Object term320 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term340 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term366 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term367 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term368 = (byte[]) newByteArray(16);
        Object term387 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term388 = (byte[]) newByteArray(16);
        Object term407 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term408 = (byte[]) newByteArray(16);
        Object term439 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term440 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term441 = (byte[]) newByteArray(16);
        int[] term485 = (int[]) newIntArray(4);
        int[] term490 = (int[]) newIntArray(1);
        setCharElement(term25, 0, 'P');
        setCharElement(term25, 1, 'A');
        setCharElement(term25, 2, 'E');
        setCharElement(term25, 3, 'B');
        setCharElement(term25, 4, 't');
        setField(term24, term24.getClass(), "input", term25);
        setIntField(term24, term24.getClass(), "length", 568599855);
        setIntField(term24, term24.getClass(), "pos", 1162663216);
        setIntField(term24, term24.getClass(), "mark", 1484323161);
        setElement(term34, 0, "sjlJAEtRrb");
        setElement(term34, 1, "MuLcgQHgqz");
        setElement(term34, 2, "xxtlPwDYFs");
        setElement(term34, 3, "jJCZpVmanW");
        setField(term24, term24.getClass(), "stringCache", term34);
        setField(term23, term23.getClass(), "reader", term24);
        setIntField(term83, term83.getClass(), "maxSize", 0);
        setField(term83, term83.getClass(), "elementData", null);
        setIntField(term83, term83.getClass(), "size", 0);
        setIntField(term83, term83.getClass(), "modCount", 0);
        setField(term23, term23.getClass(), "errors", term83);
        setField(term23, term23.getClass(), "state", enum104);
        setField(term23, term23.getClass(), "emitPending", null);
        setBooleanField(term23, term23.getClass(), "isEmitPending", false);
        setField(term23, term23.getClass(), "charsString", "EGtDIRbSSb");
        setField(term123, term123.getClass(), "value", term124);
        setByteField(term123, term123.getClass(), "coder", (byte) 47);
        setIntField(term123, term123.getClass(), "count", 391863371);
        setField(term23, term23.getClass(), "charsBuilder", term123);
        setField(term143, term143.getClass(), "value", term144);
        setByteField(term143, term143.getClass(), "coder", (byte) 48);
        setIntField(term143, term143.getClass(), "count", -1922583790);
        setField(term23, term23.getClass(), "dataBuffer", term143);
        setField(term23, term23.getClass(), "tagPending", null);
        setField(term163, term163.getClass(), "tagName", "SzjVpOQTyS");
        setField(term163, term163.getClass(), "normalName", "MjGYSRKTNF");
        setField(term163, term163.getClass(), "pendingAttributeName", "hRNSzYYIrc");
        setField(term200, term200.getClass(), "value", term201);
        setByteField(term200, term200.getClass(), "coder", (byte) 0);
        setIntField(term200, term200.getClass(), "count", 0);
        setField(term163, term163.getClass(), "pendingAttributeValue", term200);
        setField(term163, term163.getClass(), "pendingAttributeValueS", "RMFIsYGgne");
        setBooleanField(term163, term163.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term163, term163.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term163, term163.getClass(), "selfClosing", false);
        setField(term235, term235.getClass(), "attributes", null);
        setField(term163, term163.getClass(), "attributes", term235);
        setField(term163, term163.getClass(), "type", enum105);
        setField(term23, term23.getClass(), "startPending", term163);
        setField(term248, term248.getClass(), "tagName", "NRdvgJlhkX");
        setField(term248, term248.getClass(), "normalName", "uuaPigETmJ");
        setField(term248, term248.getClass(), "pendingAttributeName", "MxlszYVzRf");
        setField(term285, term285.getClass(), "value", term286);
        setByteField(term285, term285.getClass(), "coder", (byte) 0);
        setIntField(term285, term285.getClass(), "count", 0);
        setField(term248, term248.getClass(), "pendingAttributeValue", term285);
        setField(term248, term248.getClass(), "pendingAttributeValueS", "LQFpaHEwXR");
        setBooleanField(term248, term248.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term248, term248.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term248, term248.getClass(), "selfClosing", true);
        setField(term320, term320.getClass(), "attributes", term321);
        setField(term248, term248.getClass(), "attributes", term320);
        setField(term248, term248.getClass(), "type", enum106);
        setField(term23, term23.getClass(), "endPending", term248);
        setField(term340, term340.getClass(), "data", "tbcdzjIfER");
        setField(term340, term340.getClass(), "type", enum107);
        setField(term23, term23.getClass(), "charPending", term340);
        setField(term367, term367.getClass(), "value", term368);
        setByteField(term367, term367.getClass(), "coder", (byte) 0);
        setIntField(term367, term367.getClass(), "count", 0);
        setField(term366, term366.getClass(), "name", term367);
        setField(term387, term387.getClass(), "value", term388);
        setByteField(term387, term387.getClass(), "coder", (byte) 0);
        setIntField(term387, term387.getClass(), "count", 0);
        setField(term366, term366.getClass(), "publicIdentifier", term387);
        setField(term407, term407.getClass(), "value", term408);
        setByteField(term407, term407.getClass(), "coder", (byte) 0);
        setIntField(term407, term407.getClass(), "count", 0);
        setField(term366, term366.getClass(), "systemIdentifier", term407);
        setBooleanField(term366, term366.getClass(), "forceQuirks", true);
        setField(term366, term366.getClass(), "type", enum108);
        setField(term23, term23.getClass(), "doctypePending", term366);
        setField(term440, term440.getClass(), "value", term441);
        setByteField(term440, term440.getClass(), "coder", (byte) 0);
        setIntField(term440, term440.getClass(), "count", 0);
        setField(term439, term439.getClass(), "data", term440);
        setBooleanField(term439, term439.getClass(), "bogus", false);
        setField(term439, term439.getClass(), "type", enum109);
        setField(term23, term23.getClass(), "commentPending", term439);
        setField(term23, term23.getClass(), "lastStartTag", "HyxfbSQYBe");
        setBooleanField(term23, term23.getClass(), "selfClosingFlagAcknowledged", true);
        setIntElement(term485, 0, -616727354);
        setIntElement(term485, 1, -1955890973);
        setIntElement(term485, 2, -2038273078);
        setIntElement(term485, 3, 1227103734);
        setField(term23, term23.getClass(), "codepointHolder", term485);
        setIntElement(term490, 0, -1339778481);
        setField(term23, term23.getClass(), "multipointHolder", term490);
        term492 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term493 = (char[]) newCharArray(6);
        Object[] term503 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term493, 0, 'n');
        setCharElement(term493, 1, 'Z');
        setCharElement(term493, 2, 't');
        setCharElement(term493, 3, 'T');
        setCharElement(term493, 4, 'D');
        setCharElement(term493, 5, 's');
        setField(term492, term492.getClass(), "input", term493);
        setIntField(term492, term492.getClass(), "length", 1725571209);
        setIntField(term492, term492.getClass(), "pos", -522618178);
        setIntField(term492, term492.getClass(), "mark", 1134449235);
        setElement(term503, 0, "pCTimMblYc");
        setElement(term503, 1, "hNxWaHcfhY");
        setField(term492, term492.getClass(), "stringCache", term503);
        Class<? extends Object> term33585 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term33584 = ((Class) term33585).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term33584).setAccessible(true);
        enum110 = ((Field) term33584).get((Object) null);
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
        args[1] = term492;
        args[2] = enum110;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


