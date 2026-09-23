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

public class Tokeniser_emitTagPending_85225482689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97294;
     Object term97813;

    public Tokeniser_emitTagPending_85225482689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97819 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term97818 = ((Class) term97819).getDeclaredField((String) "StartTag");
        ((Field) term97818).setAccessible(true);
        Object enum289 = ((Field) term97818).get((Object) null);
        term97294 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term97362 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term97536 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term97362, term97362.getClass(), "pendingAttributeName", null);
        setField(term97362, term97362.getClass(), "type", enum289);
        setField(term97294, term97294.getClass(), "tagPending", term97362);
        setBooleanField(term97294, term97294.getClass(), "isEmitPending", false);
        setField(term97294, term97294.getClass(), "emitPending", term97536);
        Class<? extends Object> term98010 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term98009 = ((Class) term98010).getDeclaredField((String) "StartTag");
        ((Field) term98009).setAccessible(true);
        Object enum290 = ((Field) term98009).get((Object) null);
        term97813 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term97814 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term97813, term97813.getClass(), "reader", null);
        setField(term97813, term97813.getClass(), "errors", null);
        setField(term97813, term97813.getClass(), "state", null);
        setField(term97814, term97814.getClass(), "tagName", null);
        setField(term97814, term97814.getClass(), "pendingAttributeName", null);
        setField(term97814, term97814.getClass(), "pendingAttributeValue", null);
        setBooleanField(term97814, term97814.getClass(), "selfClosing", false);
        setField(term97814, term97814.getClass(), "attributes", null);
        setField(term97814, term97814.getClass(), "type", enum290);
        setField(term97813, term97813.getClass(), "emitPending", term97814);
        setBooleanField(term97813, term97813.getClass(), "isEmitPending", true);
        setField(term97813, term97813.getClass(), "charBuffer", null);
        setField(term97813, term97813.getClass(), "dataBuffer", null);
        setField(term97813, term97813.getClass(), "tagPending", term97814);
        setField(term97813, term97813.getClass(), "doctypePending", null);
        setField(term97813, term97813.getClass(), "commentPending", null);
        setField(term97813, term97813.getClass(), "lastStartTag", term97814);
        setBooleanField(term97813, term97813.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term97294, args);
        assertTrue(recursiveEquals(term97294, term97813));
    }

};


