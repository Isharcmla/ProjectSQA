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

public class Tokeniser_emitTagPending_852254826317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275522;
     Object term278702;

    public Tokeniser_emitTagPending_852254826317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term274396 = (char[]) newCharArray(489);
        setCharElement(term274396, 0, 'E');
        setCharElement(term274396, 1, 'O');
        setCharElement(term274396, 2, 'F');
        StringBuilder term275684 = new StringBuilder();
        ((StringBuilder) term275684).append(term274396);
        Class<? extends Object> term279210 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term279209 = ((Class) term279210).getDeclaredField((String) "EndTag");
        ((Field) term279209).setAccessible(true);
        Object enum525 = ((Field) term279209).get((Object) null);
        term275522 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term275586 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term275898 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term275586, term275586.getClass(), "pendingAttributeName", "");
        setField(term275586, term275586.getClass(), "attributes", null);
        setBooleanField(term275586, term275586.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term275586, term275586.getClass(), "hasPendingAttributeValue", false);
        setField(term275586, term275586.getClass(), "pendingAttributeValue", term275684);
        setField(term275586, term275586.getClass(), "pendingAttributeValueS", "Character");
        setField(term275586, term275586.getClass(), "type", enum525);
        setField(term275522, term275522.getClass(), "tagPending", term275586);
        setBooleanField(term275522, term275522.getClass(), "isEmitPending", false);
        setField(term275522, term275522.getClass(), "emitPending", null);
        setField(term275522, term275522.getClass(), "errors", term275898);
        Class<? extends Object> term279884 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term279883 = ((Class) term279884).getDeclaredField((String) "EndTag");
        ((Field) term279883).setAccessible(true);
        Object enum526 = ((Field) term279883).get((Object) null);
        term278702 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term278703 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term278704 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term278705 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term278706 = (byte[]) newByteArray(489);
        Object term278707 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term278702, term278702.getClass(), "reader", null);
        setIntField(term278703, term278703.getClass(), "maxSize", 0);
        setField(term278703, term278703.getClass(), "elementData", null);
        setIntField(term278703, term278703.getClass(), "size", 0);
        setIntField(term278703, term278703.getClass(), "modCount", 0);
        setField(term278702, term278702.getClass(), "errors", term278703);
        setField(term278702, term278702.getClass(), "state", null);
        setField(term278704, term278704.getClass(), "tagName", null);
        setField(term278704, term278704.getClass(), "normalName", null);
        setField(term278704, term278704.getClass(), "pendingAttributeName", null);
        setByteElement(term278706, 0, (byte) 69);
        setByteElement(term278706, 1, (byte) 79);
        setByteElement(term278706, 2, (byte) 70);
        setField(term278705, term278705.getClass(), "value", term278706);
        setByteField(term278705, term278705.getClass(), "coder", (byte) 0);
        setIntField(term278705, term278705.getClass(), "count", 0);
        setField(term278704, term278704.getClass(), "pendingAttributeValue", term278705);
        setField(term278704, term278704.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term278704, term278704.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term278704, term278704.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term278704, term278704.getClass(), "selfClosing", false);
        setField(term278707, term278707.getClass(), "attributes", null);
        setField(term278704, term278704.getClass(), "attributes", term278707);
        setField(term278704, term278704.getClass(), "type", enum526);
        setField(term278702, term278702.getClass(), "emitPending", term278704);
        setBooleanField(term278702, term278702.getClass(), "isEmitPending", true);
        setField(term278702, term278702.getClass(), "charsString", null);
        setField(term278702, term278702.getClass(), "charsBuilder", null);
        setField(term278702, term278702.getClass(), "dataBuffer", null);
        setField(term278702, term278702.getClass(), "tagPending", term278704);
        setField(term278702, term278702.getClass(), "startPending", null);
        setField(term278702, term278702.getClass(), "endPending", null);
        setField(term278702, term278702.getClass(), "charPending", null);
        setField(term278702, term278702.getClass(), "doctypePending", null);
        setField(term278702, term278702.getClass(), "commentPending", null);
        setField(term278702, term278702.getClass(), "lastStartTag", null);
        setBooleanField(term278702, term278702.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term278702, term278702.getClass(), "codepointHolder", null);
        setField(term278702, term278702.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term275522, args);
        assertTrue(recursiveEquals(term275522, term278702));
    }

};


