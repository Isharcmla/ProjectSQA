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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class Tokeniser_emit_1272425389181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140641;
     Object term140705;
     Object term141188;
     Object term141195;

    public Tokeniser_emit_1272425389181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140641 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term140641, term140641.getClass(), "isEmitPending", false);
        setField(term140641, term140641.getClass(), "emitPending", null);
        Class<? extends Object> term141202 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term141201 = ((Class) term141202).getDeclaredField((String) "EndTag");
        ((Field) term141201).setAccessible(true);
        Object enum327 = ((Field) term141201).get((Object) null);
        LinkedHashMap term140931 = new LinkedHashMap();
        term140705 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term140871 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term140705, term140705.getClass(), "type", enum327);
        setField(term140871, term140871.getClass(), "attributes", term140931);
        setField(term140705, term140705.getClass(), "attributes", term140871);
        LinkedHashMap term141191 = new LinkedHashMap();
        Class<? extends Object> term141387 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term141386 = ((Class) term141387).getDeclaredField((String) "EndTag");
        ((Field) term141386).setAccessible(true);
        Object enum328 = ((Field) term141386).get((Object) null);
        term141188 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term141189 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term141190 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term141188, term141188.getClass(), "reader", null);
        setField(term141188, term141188.getClass(), "errors", null);
        setField(term141188, term141188.getClass(), "state", null);
        setField(term141189, term141189.getClass(), "tagName", null);
        setField(term141189, term141189.getClass(), "pendingAttributeName", null);
        setField(term141189, term141189.getClass(), "pendingAttributeValue", null);
        setBooleanField(term141189, term141189.getClass(), "selfClosing", false);
        setField(term141190, term141190.getClass(), "attributes", term141191);
        setField(term141189, term141189.getClass(), "attributes", term141190);
        setField(term141189, term141189.getClass(), "type", enum328);
        setField(term141188, term141188.getClass(), "emitPending", term141189);
        setBooleanField(term141188, term141188.getClass(), "isEmitPending", true);
        setField(term141188, term141188.getClass(), "charBuffer", null);
        setField(term141188, term141188.getClass(), "dataBuffer", null);
        setField(term141188, term141188.getClass(), "tagPending", null);
        setField(term141188, term141188.getClass(), "doctypePending", null);
        setField(term141188, term141188.getClass(), "commentPending", null);
        setField(term141188, term141188.getClass(), "lastStartTag", null);
        setBooleanField(term141188, term141188.getClass(), "selfClosingFlagAcknowledged", false);
        LinkedHashMap term141197 = new LinkedHashMap();
        Class<? extends Object> term141572 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term141571 = ((Class) term141572).getDeclaredField((String) "EndTag");
        ((Field) term141571).setAccessible(true);
        Object enum329 = ((Field) term141571).get((Object) null);
        term141195 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term141196 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term141195, term141195.getClass(), "tagName", null);
        setField(term141195, term141195.getClass(), "pendingAttributeName", null);
        setField(term141195, term141195.getClass(), "pendingAttributeValue", null);
        setBooleanField(term141195, term141195.getClass(), "selfClosing", false);
        setField(term141196, term141196.getClass(), "attributes", term141197);
        setField(term141195, term141195.getClass(), "attributes", term141196);
        setField(term141195, term141195.getClass(), "type", enum329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term140705;
        callMethod(klass, "emit", argTypes, term140641, args);
        assertTrue(recursiveEquals(term140641, term141188));
        assertTrue(recursiveEquals(term140705, term141195));
    }

};


