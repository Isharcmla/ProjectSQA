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

public class Tokeniser_emitTagPending_852254826127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115042;
     Object term115561;

    public Tokeniser_emitTagPending_852254826127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term115567 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term115566 = ((Class) term115567).getDeclaredField((String) "StartTag");
        ((Field) term115566).setAccessible(true);
        Object enum296 = ((Field) term115566).get((Object) null);
        term115042 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term115110 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term115284 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term115110, term115110.getClass(), "pendingAttributeName", null);
        setField(term115110, term115110.getClass(), "type", enum296);
        setBooleanField(term115110, term115110.getClass(), "selfClosing", true);
        setField(term115042, term115042.getClass(), "tagPending", term115110);
        setBooleanField(term115042, term115042.getClass(), "isEmitPending", false);
        setField(term115042, term115042.getClass(), "emitPending", term115284);
        setField(term115042, term115042.getClass(), "lastStartTag", null);
        Class<? extends Object> term115758 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term115757 = ((Class) term115758).getDeclaredField((String) "StartTag");
        ((Field) term115757).setAccessible(true);
        Object enum297 = ((Field) term115757).get((Object) null);
        term115561 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term115562 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term115561, term115561.getClass(), "reader", null);
        setField(term115561, term115561.getClass(), "errors", null);
        setField(term115561, term115561.getClass(), "state", null);
        setField(term115562, term115562.getClass(), "tagName", null);
        setField(term115562, term115562.getClass(), "pendingAttributeName", null);
        setField(term115562, term115562.getClass(), "pendingAttributeValue", null);
        setBooleanField(term115562, term115562.getClass(), "selfClosing", true);
        setField(term115562, term115562.getClass(), "attributes", null);
        setField(term115562, term115562.getClass(), "type", enum297);
        setField(term115561, term115561.getClass(), "emitPending", term115562);
        setBooleanField(term115561, term115561.getClass(), "isEmitPending", true);
        setField(term115561, term115561.getClass(), "charBuffer", null);
        setField(term115561, term115561.getClass(), "dataBuffer", null);
        setField(term115561, term115561.getClass(), "tagPending", term115562);
        setField(term115561, term115561.getClass(), "doctypePending", null);
        setField(term115561, term115561.getClass(), "commentPending", null);
        setField(term115561, term115561.getClass(), "lastStartTag", term115562);
        setBooleanField(term115561, term115561.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term115042, args);
        assertTrue(recursiveEquals(term115042, term115561));
    }

};


