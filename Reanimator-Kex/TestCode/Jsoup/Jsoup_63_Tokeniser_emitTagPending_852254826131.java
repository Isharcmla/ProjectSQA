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

public class Tokeniser_emitTagPending_852254826131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158924;
     Object term159426;

    public Tokeniser_emitTagPending_852254826131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term159432 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term159431 = ((Class) term159432).getDeclaredField((String) "EndTag");
        ((Field) term159431).setAccessible(true);
        Object enum441 = ((Field) term159431).get((Object) null);
        term158924 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term158988 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term159154 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term158988, term158988.getClass(), "pendingAttributeName", null);
        setField(term158988, term158988.getClass(), "type", enum441);
        setField(term158924, term158924.getClass(), "tagPending", term158988);
        setBooleanField(term158924, term158924.getClass(), "isEmitPending", false);
        setField(term158924, term158924.getClass(), "emitPending", term159154);
        Class<? extends Object> term159617 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term159616 = ((Class) term159617).getDeclaredField((String) "EndTag");
        ((Field) term159616).setAccessible(true);
        Object enum442 = ((Field) term159616).get((Object) null);
        term159426 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term159427 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term159426, term159426.getClass(), "reader", null);
        setField(term159426, term159426.getClass(), "errors", null);
        setField(term159426, term159426.getClass(), "state", null);
        setField(term159427, term159427.getClass(), "tagName", null);
        setField(term159427, term159427.getClass(), "normalName", null);
        setField(term159427, term159427.getClass(), "pendingAttributeName", null);
        setField(term159427, term159427.getClass(), "pendingAttributeValue", null);
        setField(term159427, term159427.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term159427, term159427.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term159427, term159427.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term159427, term159427.getClass(), "selfClosing", false);
        setField(term159427, term159427.getClass(), "attributes", null);
        setField(term159427, term159427.getClass(), "type", enum442);
        setField(term159426, term159426.getClass(), "emitPending", term159427);
        setBooleanField(term159426, term159426.getClass(), "isEmitPending", true);
        setField(term159426, term159426.getClass(), "charsString", null);
        setField(term159426, term159426.getClass(), "charsBuilder", null);
        setField(term159426, term159426.getClass(), "dataBuffer", null);
        setField(term159426, term159426.getClass(), "tagPending", term159427);
        setField(term159426, term159426.getClass(), "startPending", null);
        setField(term159426, term159426.getClass(), "endPending", null);
        setField(term159426, term159426.getClass(), "charPending", null);
        setField(term159426, term159426.getClass(), "doctypePending", null);
        setField(term159426, term159426.getClass(), "commentPending", null);
        setField(term159426, term159426.getClass(), "lastStartTag", null);
        setBooleanField(term159426, term159426.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term159426, term159426.getClass(), "codepointHolder", null);
        setField(term159426, term159426.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term158924, args);
        assertTrue(recursiveEquals(term158924, term159426));
    }

};


