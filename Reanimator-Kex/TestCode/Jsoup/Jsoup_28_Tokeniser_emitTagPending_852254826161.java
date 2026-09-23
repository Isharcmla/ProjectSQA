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

public class Tokeniser_emitTagPending_852254826161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140854;
     Object term141362;

    public Tokeniser_emitTagPending_852254826161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141368 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term141367 = ((Class) term141368).getDeclaredField((String) "EndTag");
        ((Field) term141367).setAccessible(true);
        Object enum319 = ((Field) term141367).get((Object) null);
        term140854 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term140918 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term141096 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term140918, term140918.getClass(), "pendingAttributeName", null);
        setField(term140918, term140918.getClass(), "type", enum319);
        setField(term140854, term140854.getClass(), "tagPending", term140918);
        setBooleanField(term140854, term140854.getClass(), "isEmitPending", false);
        setField(term140854, term140854.getClass(), "emitPending", term141096);
        Class<? extends Object> term141553 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term141552 = ((Class) term141553).getDeclaredField((String) "EndTag");
        ((Field) term141552).setAccessible(true);
        Object enum320 = ((Field) term141552).get((Object) null);
        term141362 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term141363 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term141362, term141362.getClass(), "reader", null);
        setField(term141362, term141362.getClass(), "errors", null);
        setField(term141362, term141362.getClass(), "state", null);
        setField(term141363, term141363.getClass(), "tagName", null);
        setField(term141363, term141363.getClass(), "pendingAttributeName", null);
        setField(term141363, term141363.getClass(), "pendingAttributeValue", null);
        setBooleanField(term141363, term141363.getClass(), "selfClosing", false);
        setField(term141363, term141363.getClass(), "attributes", null);
        setField(term141363, term141363.getClass(), "type", enum320);
        setField(term141362, term141362.getClass(), "emitPending", term141363);
        setBooleanField(term141362, term141362.getClass(), "isEmitPending", true);
        setField(term141362, term141362.getClass(), "charBuffer", null);
        setField(term141362, term141362.getClass(), "dataBuffer", null);
        setField(term141362, term141362.getClass(), "tagPending", term141363);
        setField(term141362, term141362.getClass(), "doctypePending", null);
        setField(term141362, term141362.getClass(), "commentPending", null);
        setField(term141362, term141362.getClass(), "lastStartTag", null);
        setBooleanField(term141362, term141362.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term140854, args);
        assertTrue(recursiveEquals(term140854, term141362));
    }

};


