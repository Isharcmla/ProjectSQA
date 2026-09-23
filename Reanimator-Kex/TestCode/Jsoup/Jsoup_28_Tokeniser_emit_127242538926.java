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

public class Tokeniser_emit_127242538926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2854;

    public Tokeniser_emit_127242538926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32314 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term32313 = ((Class) term32314).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term32313).setAccessible(true);
        Object enum105 = ((Field) term32313).get((Object) null);
        Class<? extends Object> term32604 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32603 = ((Class) term32604).getDeclaredField((String) "Doctype");
        ((Field) term32603).setAccessible(true);
        Object enum106 = ((Field) term32603).get((Object) null);
        Class<? extends Object> term32808 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32807 = ((Class) term32808).getDeclaredField((String) "Comment");
        ((Field) term32807).setAccessible(true);
        Object enum107 = ((Field) term32807).get((Object) null);
        Class<? extends Object> term33032 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33031 = ((Class) term33032).getDeclaredField((String) "StartTag");
        ((Field) term33031).setAccessible(true);
        Object enum108 = ((Field) term33031).get((Object) null);
        term2854 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term2855 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2856 = (char[]) newCharArray(4);
        Object term2864 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term2889 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2890 = (byte[]) newByteArray(16);
        Object term2909 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2910 = (byte[]) newByteArray(16);
        Object term2929 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term2930 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2931 = (byte[]) newByteArray(16);
        Object term2950 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2951 = (byte[]) newByteArray(16);
        Object term2970 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2971 = (byte[]) newByteArray(16);
        Object term3002 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term3003 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3004 = (byte[]) newByteArray(16);
        Object term3034 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term3059 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3060 = (byte[]) newByteArray(16);
        Object term3080 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term2856, 0, 'D');
        setCharElement(term2856, 1, 's');
        setCharElement(term2856, 2, 'j');
        setCharElement(term2856, 3, 'l');
        setField(term2855, term2855.getClass(), "input", term2856);
        setIntField(term2855, term2855.getClass(), "length", -1339778481);
        setIntField(term2855, term2855.getClass(), "pos", 1725571209);
        setIntField(term2855, term2855.getClass(), "mark", -522618178);
        setField(term2854, term2854.getClass(), "reader", term2855);
        setIntField(term2864, term2864.getClass(), "maxSize", 0);
        setField(term2864, term2864.getClass(), "elementData", null);
        setIntField(term2864, term2864.getClass(), "size", 0);
        setIntField(term2864, term2864.getClass(), "modCount", 0);
        setField(term2854, term2854.getClass(), "errors", term2864);
        setField(term2854, term2854.getClass(), "state", enum105);
        setField(term2854, term2854.getClass(), "emitPending", null);
        setBooleanField(term2854, term2854.getClass(), "isEmitPending", true);
        setField(term2889, term2889.getClass(), "value", term2890);
        setByteField(term2889, term2889.getClass(), "coder", (byte) 75);
        setIntField(term2889, term2889.getClass(), "count", 1134449235);
        setField(term2854, term2854.getClass(), "charBuffer", term2889);
        setField(term2909, term2909.getClass(), "value", term2910);
        setByteField(term2909, term2909.getClass(), "coder", (byte) 18);
        setIntField(term2909, term2909.getClass(), "count", -883034806);
        setField(term2854, term2854.getClass(), "dataBuffer", term2909);
        setField(term2854, term2854.getClass(), "tagPending", null);
        setField(term2930, term2930.getClass(), "value", term2931);
        setByteField(term2930, term2930.getClass(), "coder", (byte) 0);
        setIntField(term2930, term2930.getClass(), "count", 0);
        setField(term2929, term2929.getClass(), "name", term2930);
        setField(term2950, term2950.getClass(), "value", term2951);
        setByteField(term2950, term2950.getClass(), "coder", (byte) 0);
        setIntField(term2950, term2950.getClass(), "count", 0);
        setField(term2929, term2929.getClass(), "publicIdentifier", term2950);
        setField(term2970, term2970.getClass(), "value", term2971);
        setByteField(term2970, term2970.getClass(), "coder", (byte) 0);
        setIntField(term2970, term2970.getClass(), "count", 0);
        setField(term2929, term2929.getClass(), "systemIdentifier", term2970);
        setBooleanField(term2929, term2929.getClass(), "forceQuirks", true);
        setField(term2929, term2929.getClass(), "type", enum106);
        setField(term2854, term2854.getClass(), "doctypePending", term2929);
        setField(term3003, term3003.getClass(), "value", term3004);
        setByteField(term3003, term3003.getClass(), "coder", (byte) 0);
        setIntField(term3003, term3003.getClass(), "count", 0);
        setField(term3002, term3002.getClass(), "data", term3003);
        setField(term3002, term3002.getClass(), "type", enum107);
        setField(term2854, term2854.getClass(), "commentPending", term3002);
        setField(term3034, term3034.getClass(), "tagName", "MuLcgQHgqz");
        setField(term3034, term3034.getClass(), "pendingAttributeName", "xxtlPwDYFs");
        setField(term3059, term3059.getClass(), "value", term3060);
        setByteField(term3059, term3059.getClass(), "coder", (byte) -58);
        setIntField(term3059, term3059.getClass(), "count", 1585847225);
        setField(term3034, term3034.getClass(), "pendingAttributeValue", term3059);
        setBooleanField(term3034, term3034.getClass(), "selfClosing", true);
        setField(term3080, term3080.getClass(), "attributes", null);
        setField(term3034, term3034.getClass(), "attributes", term3080);
        setField(term3034, term3034.getClass(), "type", enum108);
        setField(term2854, term2854.getClass(), "lastStartTag", term3034);
        setBooleanField(term2854, term2854.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "emit", argTypes, term2854, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


