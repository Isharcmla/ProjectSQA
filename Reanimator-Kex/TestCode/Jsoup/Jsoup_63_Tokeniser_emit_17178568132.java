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

public class Tokeniser_emit_17178568132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9562;
     Object term10057;

    public Tokeniser_emit_17178568132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66851 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term66850 = ((Class) term66851).getDeclaredField((String) "AfterAttributeName");
        ((Field) term66850).setAccessible(true);
        Object enum190 = ((Field) term66850).get((Object) null);
        Class<? extends Object> term67165 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term67164 = ((Class) term67165).getDeclaredField((String) "StartTag");
        ((Field) term67164).setAccessible(true);
        Object enum191 = ((Field) term67164).get((Object) null);
        LinkedHashMap term9871 = new LinkedHashMap();
        Class<? extends Object> term67412 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term67411 = ((Class) term67412).getDeclaredField((String) "EndTag");
        ((Field) term67411).setAccessible(true);
        Object enum192 = ((Field) term67411).get((Object) null);
        Class<? extends Object> term67607 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term67606 = ((Class) term67607).getDeclaredField((String) "Character");
        ((Field) term67606).setAccessible(true);
        Object enum193 = ((Field) term67606).get((Object) null);
        Class<? extends Object> term67859 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term67858 = ((Class) term67859).getDeclaredField((String) "Doctype");
        ((Field) term67858).setAccessible(true);
        Object enum194 = ((Field) term67858).get((Object) null);
        Class<? extends Object> term68063 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term68062 = ((Class) term68063).getDeclaredField((String) "Comment");
        ((Field) term68062).setAccessible(true);
        Object enum195 = ((Field) term68062).get((Object) null);
        term9562 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term9563 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term9564 = (char[]) newCharArray(3);
        Object[] term9573 = (Object[]) newArray("java.lang.String", 5);
        Object term9634 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term9673 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9674 = (byte[]) newByteArray(16);
        Object term9693 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9694 = (byte[]) newByteArray(16);
        Object term9713 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term9750 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9751 = (byte[]) newByteArray(16);
        Object term9785 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term9798 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term9835 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9836 = (byte[]) newByteArray(16);
        Object term9870 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term9890 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term9916 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term9917 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9918 = (byte[]) newByteArray(16);
        Object term9949 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9950 = (byte[]) newByteArray(16);
        Object term9969 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9970 = (byte[]) newByteArray(16);
        Object term10001 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term10002 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10003 = (byte[]) newByteArray(16);
        int[] term10047 = (int[]) newIntArray(5);
        int[] term10053 = (int[]) newIntArray(3);
        setCharElement(term9564, 0, 'x');
        setCharElement(term9564, 1, 'x');
        setCharElement(term9564, 2, 't');
        setField(term9563, term9563.getClass(), "charBuf", term9564);
        setField(term9563, term9563.getClass(), "reader", null);
        setIntField(term9563, term9563.getClass(), "bufLength", 458147407);
        setIntField(term9563, term9563.getClass(), "bufSplitPoint", -184153539);
        setIntField(term9563, term9563.getClass(), "bufPos", 493620644);
        setIntField(term9563, term9563.getClass(), "readerPos", 1328271830);
        setIntField(term9563, term9563.getClass(), "bufMark", 1596070772);
        setElement(term9573, 0, "PHvxnGHptP");
        setElement(term9573, 1, "TimdotUuNC");
        setElement(term9573, 2, "PkWMRdJcBb");
        setElement(term9573, 3, "jSpAteRute");
        setElement(term9573, 4, "swZVeJAxjt");
        setField(term9563, term9563.getClass(), "stringCache", term9573);
        setField(term9562, term9562.getClass(), "reader", term9563);
        setIntField(term9634, term9634.getClass(), "maxSize", 0);
        setField(term9634, term9634.getClass(), "elementData", null);
        setIntField(term9634, term9634.getClass(), "size", 0);
        setIntField(term9634, term9634.getClass(), "modCount", 0);
        setField(term9562, term9562.getClass(), "errors", term9634);
        setField(term9562, term9562.getClass(), "state", enum190);
        setField(term9562, term9562.getClass(), "emitPending", null);
        setBooleanField(term9562, term9562.getClass(), "isEmitPending", false);
        setField(term9562, term9562.getClass(), "charsString", "xOcJIiQQDu");
        setField(term9673, term9673.getClass(), "value", term9674);
        setByteField(term9673, term9673.getClass(), "coder", (byte) -10);
        setIntField(term9673, term9673.getClass(), "count", 97029295);
        setField(term9562, term9562.getClass(), "charsBuilder", term9673);
        setField(term9693, term9693.getClass(), "value", term9694);
        setByteField(term9693, term9693.getClass(), "coder", (byte) 79);
        setIntField(term9693, term9693.getClass(), "count", -1371869594);
        setField(term9562, term9562.getClass(), "dataBuffer", term9693);
        setField(term9562, term9562.getClass(), "tagPending", null);
        setField(term9713, term9713.getClass(), "tagName", "GVizqqzXpy");
        setField(term9713, term9713.getClass(), "normalName", "JqXGgAhZPl");
        setField(term9713, term9713.getClass(), "pendingAttributeName", "jiKYgYHqIS");
        setField(term9750, term9750.getClass(), "value", term9751);
        setByteField(term9750, term9750.getClass(), "coder", (byte) 0);
        setIntField(term9750, term9750.getClass(), "count", 0);
        setField(term9713, term9713.getClass(), "pendingAttributeValue", term9750);
        setField(term9713, term9713.getClass(), "pendingAttributeValueS", "DfISiziTgG");
        setBooleanField(term9713, term9713.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9713, term9713.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term9713, term9713.getClass(), "selfClosing", true);
        setField(term9785, term9785.getClass(), "attributes", null);
        setField(term9713, term9713.getClass(), "attributes", term9785);
        setField(term9713, term9713.getClass(), "type", enum191);
        setField(term9562, term9562.getClass(), "startPending", term9713);
        setField(term9798, term9798.getClass(), "tagName", "XqgfKFvPSD");
        setField(term9798, term9798.getClass(), "normalName", "JiVRgTZvKc");
        setField(term9798, term9798.getClass(), "pendingAttributeName", "XPKmummaqg");
        setField(term9835, term9835.getClass(), "value", term9836);
        setByteField(term9835, term9835.getClass(), "coder", (byte) 0);
        setIntField(term9835, term9835.getClass(), "count", 0);
        setField(term9798, term9798.getClass(), "pendingAttributeValue", term9835);
        setField(term9798, term9798.getClass(), "pendingAttributeValueS", "BKLfkLiZTH");
        setBooleanField(term9798, term9798.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term9798, term9798.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term9798, term9798.getClass(), "selfClosing", true);
        setField(term9870, term9870.getClass(), "attributes", term9871);
        setField(term9798, term9798.getClass(), "attributes", term9870);
        setField(term9798, term9798.getClass(), "type", enum192);
        setField(term9562, term9562.getClass(), "endPending", term9798);
        setField(term9890, term9890.getClass(), "data", "vjxIhXHxGR");
        setField(term9890, term9890.getClass(), "type", enum193);
        setField(term9562, term9562.getClass(), "charPending", term9890);
        setField(term9917, term9917.getClass(), "value", term9918);
        setByteField(term9917, term9917.getClass(), "coder", (byte) 0);
        setIntField(term9917, term9917.getClass(), "count", 0);
        setField(term9916, term9916.getClass(), "name", term9917);
        setField(term9916, term9916.getClass(), "pubSysKey", "QXzGXbEXMu");
        setField(term9949, term9949.getClass(), "value", term9950);
        setByteField(term9949, term9949.getClass(), "coder", (byte) 0);
        setIntField(term9949, term9949.getClass(), "count", 0);
        setField(term9916, term9916.getClass(), "publicIdentifier", term9949);
        setField(term9969, term9969.getClass(), "value", term9970);
        setByteField(term9969, term9969.getClass(), "coder", (byte) 0);
        setIntField(term9969, term9969.getClass(), "count", 0);
        setField(term9916, term9916.getClass(), "systemIdentifier", term9969);
        setBooleanField(term9916, term9916.getClass(), "forceQuirks", true);
        setField(term9916, term9916.getClass(), "type", enum194);
        setField(term9562, term9562.getClass(), "doctypePending", term9916);
        setField(term10002, term10002.getClass(), "value", term10003);
        setByteField(term10002, term10002.getClass(), "coder", (byte) 0);
        setIntField(term10002, term10002.getClass(), "count", 0);
        setField(term10001, term10001.getClass(), "data", term10002);
        setBooleanField(term10001, term10001.getClass(), "bogus", false);
        setField(term10001, term10001.getClass(), "type", enum195);
        setField(term9562, term9562.getClass(), "commentPending", term10001);
        setField(term9562, term9562.getClass(), "lastStartTag", "qxSDVejjiY");
        setBooleanField(term9562, term9562.getClass(), "selfClosingFlagAcknowledged", true);
        setIntElement(term10047, 0, -2095575670);
        setIntElement(term10047, 1, 1225272962);
        setIntElement(term10047, 2, 1324040357);
        setIntElement(term10047, 3, -1588772968);
        setIntElement(term10047, 4, -93135961);
        setField(term9562, term9562.getClass(), "codepointHolder", term10047);
        setIntElement(term10053, 0, -112921587);
        setIntElement(term10053, 1, 933028652);
        setIntElement(term10053, 2, 287287233);
        setField(term9562, term9562.getClass(), "multipointHolder", term10053);
        term10057 = (int[]) newIntArray(7);
        setIntElement(term10057, 0, 962840079);
        setIntElement(term10057, 1, 1540719661);
        setIntElement(term10057, 2, 1265463001);
        setIntElement(term10057, 3, 335112684);
        setIntElement(term10057, 4, 1551099402);
        setIntElement(term10057, 5, -2027534003);
        setIntElement(term10057, 6, 1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10057;
        try {
            callMethod(klass, "emit", argTypes, term9562, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


