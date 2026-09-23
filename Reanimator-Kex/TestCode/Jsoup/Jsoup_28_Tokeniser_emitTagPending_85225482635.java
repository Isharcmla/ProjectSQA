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

public class Tokeniser_emitTagPending_85225482635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13819;

    public Tokeniser_emitTagPending_85225482635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49334 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term49333 = ((Class) term49334).getDeclaredField((String) "Rawtext");
        ((Field) term49333).setAccessible(true);
        Object enum168 = ((Field) term49333).get((Object) null);
        Class<? extends Object> term49597 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term49596 = ((Class) term49597).getDeclaredField((String) "Doctype");
        ((Field) term49596).setAccessible(true);
        Object enum169 = ((Field) term49596).get((Object) null);
        Class<? extends Object> term49801 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term49800 = ((Class) term49801).getDeclaredField((String) "Comment");
        ((Field) term49800).setAccessible(true);
        Object enum170 = ((Field) term49800).get((Object) null);
        Class<? extends Object> term50025 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term50024 = ((Class) term50025).getDeclaredField((String) "StartTag");
        ((Field) term50024).setAccessible(true);
        Object enum171 = ((Field) term50024).get((Object) null);
        term13819 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term13820 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term13821 = (char[]) newCharArray(1);
        Object term13826 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term13842 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13843 = (byte[]) newByteArray(16);
        Object term13862 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13863 = (byte[]) newByteArray(16);
        Object term13882 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term13883 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13884 = (byte[]) newByteArray(16);
        Object term13903 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13904 = (byte[]) newByteArray(16);
        Object term13923 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13924 = (byte[]) newByteArray(16);
        Object term13955 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term13956 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13957 = (byte[]) newByteArray(16);
        Object term13987 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term14012 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term14013 = (byte[]) newByteArray(16);
        Object term14033 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setCharElement(term13821, 0, 'p');
        setField(term13820, term13820.getClass(), "input", term13821);
        setIntField(term13820, term13820.getClass(), "length", -2095575670);
        setIntField(term13820, term13820.getClass(), "pos", 1225272962);
        setIntField(term13820, term13820.getClass(), "mark", 1324040357);
        setField(term13819, term13819.getClass(), "reader", term13820);
        setIntField(term13826, term13826.getClass(), "maxSize", 0);
        setField(term13826, term13826.getClass(), "elementData", null);
        setIntField(term13826, term13826.getClass(), "size", 0);
        setIntField(term13826, term13826.getClass(), "modCount", 0);
        setField(term13819, term13819.getClass(), "errors", term13826);
        setField(term13819, term13819.getClass(), "state", enum168);
        setField(term13819, term13819.getClass(), "emitPending", null);
        setBooleanField(term13819, term13819.getClass(), "isEmitPending", true);
        setField(term13842, term13842.getClass(), "value", term13843);
        setByteField(term13842, term13842.getClass(), "coder", (byte) 106);
        setIntField(term13842, term13842.getClass(), "count", -1588772968);
        setField(term13819, term13819.getClass(), "charBuffer", term13842);
        setField(term13862, term13862.getClass(), "value", term13863);
        setByteField(term13862, term13862.getClass(), "coder", (byte) 98);
        setIntField(term13862, term13862.getClass(), "count", -93135961);
        setField(term13819, term13819.getClass(), "dataBuffer", term13862);
        setField(term13819, term13819.getClass(), "tagPending", null);
        setField(term13883, term13883.getClass(), "value", term13884);
        setByteField(term13883, term13883.getClass(), "coder", (byte) 0);
        setIntField(term13883, term13883.getClass(), "count", 0);
        setField(term13882, term13882.getClass(), "name", term13883);
        setField(term13903, term13903.getClass(), "value", term13904);
        setByteField(term13903, term13903.getClass(), "coder", (byte) 0);
        setIntField(term13903, term13903.getClass(), "count", 0);
        setField(term13882, term13882.getClass(), "publicIdentifier", term13903);
        setField(term13923, term13923.getClass(), "value", term13924);
        setByteField(term13923, term13923.getClass(), "coder", (byte) 0);
        setIntField(term13923, term13923.getClass(), "count", 0);
        setField(term13882, term13882.getClass(), "systemIdentifier", term13923);
        setBooleanField(term13882, term13882.getClass(), "forceQuirks", true);
        setField(term13882, term13882.getClass(), "type", enum169);
        setField(term13819, term13819.getClass(), "doctypePending", term13882);
        setField(term13956, term13956.getClass(), "value", term13957);
        setByteField(term13956, term13956.getClass(), "coder", (byte) 0);
        setIntField(term13956, term13956.getClass(), "count", 0);
        setField(term13955, term13955.getClass(), "data", term13956);
        setField(term13955, term13955.getClass(), "type", enum170);
        setField(term13819, term13819.getClass(), "commentPending", term13955);
        setField(term13987, term13987.getClass(), "tagName", "RkybSrpybU");
        setField(term13987, term13987.getClass(), "pendingAttributeName", "xOEqzGAmDU");
        setField(term14012, term14012.getClass(), "value", term14013);
        setByteField(term14012, term14012.getClass(), "coder", (byte) 67);
        setIntField(term14012, term14012.getClass(), "count", -112921587);
        setField(term13987, term13987.getClass(), "pendingAttributeValue", term14012);
        setBooleanField(term13987, term13987.getClass(), "selfClosing", false);
        setField(term14033, term14033.getClass(), "attributes", null);
        setField(term13987, term13987.getClass(), "attributes", term14033);
        setField(term13987, term13987.getClass(), "type", enum171);
        setField(term13819, term13819.getClass(), "lastStartTag", term13987);
        setBooleanField(term13819, term13819.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term13819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


