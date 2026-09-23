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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class Tokeniser_emitTagPending_852254826375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346714;
     Object term349904;

    public Tokeniser_emitTagPending_852254826375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term345594 = (char[]) newCharArray(489);
        setCharElement(term345594, 0, 'S');
        setCharElement(term345594, 1, 't');
        setCharElement(term345594, 2, 'a');
        setCharElement(term345594, 3, 'r');
        setCharElement(term345594, 4, 't');
        setCharElement(term345594, 5, 'T');
        setCharElement(term345594, 6, 'a');
        setCharElement(term345594, 7, 'g');
        StringBuilder term346934 = new StringBuilder();
        ((StringBuilder) term346934).append(term345594);
        Class<? extends Object> term350403 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term350402 = ((Class) term350403).getDeclaredField((String) "EndTag");
        ((Field) term350402).setAccessible(true);
        Object enum570 = ((Field) term350402).get((Object) null);
        term346714 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term346778 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term346874 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term347110 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term346778, term346778.getClass(), "pendingAttributeName", "");
        setField(term346778, term346778.getClass(), "attributes", term346874);
        setBooleanField(term346778, term346778.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term346778, term346778.getClass(), "hasPendingAttributeValue", false);
        setField(term346778, term346778.getClass(), "pendingAttributeValue", term346934);
        setField(term346778, term346778.getClass(), "pendingAttributeValueS", null);
        setField(term346778, term346778.getClass(), "type", enum570);
        setField(term346714, term346714.getClass(), "tagPending", term346778);
        setBooleanField(term346714, term346714.getClass(), "isEmitPending", false);
        setField(term346714, term346714.getClass(), "emitPending", null);
        setField(term346714, term346714.getClass(), "errors", term347110);
        Class<? extends Object> term351077 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term351076 = ((Class) term351077).getDeclaredField((String) "EndTag");
        ((Field) term351076).setAccessible(true);
        Object enum571 = ((Field) term351076).get((Object) null);
        term349904 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term349905 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term349906 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term349907 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term349908 = (byte[]) newByteArray(489);
        Object term349909 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term349904, term349904.getClass(), "reader", null);
        setIntField(term349905, term349905.getClass(), "maxSize", 0);
        setField(term349905, term349905.getClass(), "elementData", null);
        setIntField(term349905, term349905.getClass(), "size", 0);
        setIntField(term349905, term349905.getClass(), "modCount", 0);
        setField(term349904, term349904.getClass(), "errors", term349905);
        setField(term349904, term349904.getClass(), "state", null);
        setField(term349906, term349906.getClass(), "tagName", null);
        setField(term349906, term349906.getClass(), "normalName", null);
        setField(term349906, term349906.getClass(), "pendingAttributeName", null);
        setByteElement(term349908, 0, (byte) 83);
        setByteElement(term349908, 1, (byte) 116);
        setByteElement(term349908, 2, (byte) 97);
        setByteElement(term349908, 3, (byte) 114);
        setByteElement(term349908, 4, (byte) 116);
        setByteElement(term349908, 5, (byte) 84);
        setByteElement(term349908, 6, (byte) 97);
        setByteElement(term349908, 7, (byte) 103);
        setField(term349907, term349907.getClass(), "value", term349908);
        setByteField(term349907, term349907.getClass(), "coder", (byte) 0);
        setIntField(term349907, term349907.getClass(), "count", 0);
        setField(term349906, term349906.getClass(), "pendingAttributeValue", term349907);
        setField(term349906, term349906.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term349906, term349906.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term349906, term349906.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term349906, term349906.getClass(), "selfClosing", false);
        setField(term349909, term349909.getClass(), "attributes", null);
        setField(term349906, term349906.getClass(), "attributes", term349909);
        setField(term349906, term349906.getClass(), "type", enum571);
        setField(term349904, term349904.getClass(), "emitPending", term349906);
        setBooleanField(term349904, term349904.getClass(), "isEmitPending", true);
        setField(term349904, term349904.getClass(), "charsString", null);
        setField(term349904, term349904.getClass(), "charsBuilder", null);
        setField(term349904, term349904.getClass(), "dataBuffer", null);
        setField(term349904, term349904.getClass(), "tagPending", term349906);
        setField(term349904, term349904.getClass(), "startPending", null);
        setField(term349904, term349904.getClass(), "endPending", null);
        setField(term349904, term349904.getClass(), "charPending", null);
        setField(term349904, term349904.getClass(), "doctypePending", null);
        setField(term349904, term349904.getClass(), "commentPending", null);
        setField(term349904, term349904.getClass(), "lastStartTag", null);
        setBooleanField(term349904, term349904.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term349904, term349904.getClass(), "codepointHolder", null);
        setField(term349904, term349904.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term346714, args);
        assertTrue(recursiveEquals(term346714, term349904));
    }

};


