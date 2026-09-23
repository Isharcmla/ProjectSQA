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

public class Tokeniser_emitTagPending_852254826209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184494;
     Object term189298;

    public Tokeniser_emitTagPending_852254826209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term189306 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term189305 = ((Class) term189306).getDeclaredField((String) "EndTag");
        ((Field) term189305).setAccessible(true);
        Object enum351 = ((Field) term189305).get((Object) null);
        term184494 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term184558 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term184724 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term184792 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term184558, term184558.getClass(), "pendingAttributeName", null);
        setField(term184558, term184558.getClass(), "type", enum351);
        setField(term184558, term184558.getClass(), "attributes", term184724);
        setField(term184494, term184494.getClass(), "tagPending", term184558);
        setBooleanField(term184494, term184494.getClass(), "isEmitPending", false);
        setField(term184494, term184494.getClass(), "emitPending", null);
        setField(term184494, term184494.getClass(), "errors", term184792);
        Class<? extends Object> term189491 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term189490 = ((Class) term189491).getDeclaredField((String) "EndTag");
        ((Field) term189490).setAccessible(true);
        Object enum352 = ((Field) term189490).get((Object) null);
        term189298 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term189299 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term189300 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term189301 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term189298, term189298.getClass(), "reader", null);
        setIntField(term189299, term189299.getClass(), "maxSize", 0);
        setField(term189299, term189299.getClass(), "elementData", null);
        setIntField(term189299, term189299.getClass(), "size", 0);
        setIntField(term189299, term189299.getClass(), "modCount", 0);
        setField(term189298, term189298.getClass(), "errors", term189299);
        setField(term189298, term189298.getClass(), "state", null);
        setField(term189300, term189300.getClass(), "tagName", null);
        setField(term189300, term189300.getClass(), "pendingAttributeName", null);
        setField(term189300, term189300.getClass(), "pendingAttributeValue", null);
        setBooleanField(term189300, term189300.getClass(), "selfClosing", false);
        setField(term189301, term189301.getClass(), "attributes", null);
        setField(term189300, term189300.getClass(), "attributes", term189301);
        setField(term189300, term189300.getClass(), "type", enum352);
        setField(term189298, term189298.getClass(), "emitPending", term189300);
        setBooleanField(term189298, term189298.getClass(), "isEmitPending", true);
        setField(term189298, term189298.getClass(), "charBuffer", null);
        setField(term189298, term189298.getClass(), "dataBuffer", null);
        setField(term189298, term189298.getClass(), "tagPending", term189300);
        setField(term189298, term189298.getClass(), "doctypePending", null);
        setField(term189298, term189298.getClass(), "commentPending", null);
        setField(term189298, term189298.getClass(), "lastStartTag", null);
        setBooleanField(term189298, term189298.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term184494, args);
        assertTrue(recursiveEquals(term184494, term189298));
    }

};


