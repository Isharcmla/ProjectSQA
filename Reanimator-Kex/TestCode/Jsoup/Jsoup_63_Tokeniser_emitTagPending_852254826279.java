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
import java.lang.String;

public class Tokeniser_emitTagPending_852254826279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241272;
     Object term241992;

    public Tokeniser_emitTagPending_852254826279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term242000 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term241999 = ((Class) term242000).getDeclaredField((String) "EndTag");
        ((Field) term241999).setAccessible(true);
        Object enum500 = ((Field) term241999).get((Object) null);
        term241272 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term241336 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term241590 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term241658 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term241336, term241336.getClass(), "pendingAttributeName", "");
        setField(term241336, term241336.getClass(), "attributes", null);
        setBooleanField(term241336, term241336.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term241336, term241336.getClass(), "hasPendingAttributeValue", false);
        setField(term241336, term241336.getClass(), "pendingAttributeValue", null);
        setField(term241336, term241336.getClass(), "pendingAttributeValueS", "");
        setField(term241336, term241336.getClass(), "type", enum500);
        setField(term241272, term241272.getClass(), "tagPending", term241336);
        setBooleanField(term241272, term241272.getClass(), "isEmitPending", false);
        setField(term241272, term241272.getClass(), "emitPending", term241590);
        setField(term241272, term241272.getClass(), "errors", term241658);
        Class<? extends Object> term242185 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term242184 = ((Class) term242185).getDeclaredField((String) "EndTag");
        ((Field) term242184).setAccessible(true);
        Object enum501 = ((Field) term242184).get((Object) null);
        term241992 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term241993 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term241994 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term241995 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term241992, term241992.getClass(), "reader", null);
        setIntField(term241993, term241993.getClass(), "maxSize", 0);
        setField(term241993, term241993.getClass(), "elementData", null);
        setIntField(term241993, term241993.getClass(), "size", 0);
        setIntField(term241993, term241993.getClass(), "modCount", 0);
        setField(term241992, term241992.getClass(), "errors", term241993);
        setField(term241992, term241992.getClass(), "state", null);
        setField(term241994, term241994.getClass(), "tagName", null);
        setField(term241994, term241994.getClass(), "normalName", null);
        setField(term241994, term241994.getClass(), "pendingAttributeName", null);
        setField(term241994, term241994.getClass(), "pendingAttributeValue", null);
        setField(term241994, term241994.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term241994, term241994.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term241994, term241994.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term241994, term241994.getClass(), "selfClosing", false);
        setField(term241995, term241995.getClass(), "attributes", null);
        setField(term241994, term241994.getClass(), "attributes", term241995);
        setField(term241994, term241994.getClass(), "type", enum501);
        setField(term241992, term241992.getClass(), "emitPending", term241994);
        setBooleanField(term241992, term241992.getClass(), "isEmitPending", true);
        setField(term241992, term241992.getClass(), "charsString", null);
        setField(term241992, term241992.getClass(), "charsBuilder", null);
        setField(term241992, term241992.getClass(), "dataBuffer", null);
        setField(term241992, term241992.getClass(), "tagPending", term241994);
        setField(term241992, term241992.getClass(), "startPending", null);
        setField(term241992, term241992.getClass(), "endPending", null);
        setField(term241992, term241992.getClass(), "charPending", null);
        setField(term241992, term241992.getClass(), "doctypePending", null);
        setField(term241992, term241992.getClass(), "commentPending", null);
        setField(term241992, term241992.getClass(), "lastStartTag", null);
        setBooleanField(term241992, term241992.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term241992, term241992.getClass(), "codepointHolder", null);
        setField(term241992, term241992.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term241272, args);
        assertTrue(recursiveEquals(term241272, term241992));
    }

};


