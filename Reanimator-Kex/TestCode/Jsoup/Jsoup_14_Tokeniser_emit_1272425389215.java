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

public class Tokeniser_emit_1272425389215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318503;
     Object term318567;
     Object term319051;
     Object term319058;

    public Tokeniser_emit_1272425389215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318503 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term318503, term318503.getClass(), "isEmitPending", false);
        setField(term318503, term318503.getClass(), "emitPending", null);
        Class<? extends Object> term319065 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term319064 = ((Class) term319065).getDeclaredField((String) "EndTag");
        ((Field) term319064).setAccessible(true);
        Object enum884 = ((Field) term319064).get((Object) null);
        LinkedHashMap term318793 = new LinkedHashMap();
        term318567 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term318733 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term318567, term318567.getClass(), "type", enum884);
        setField(term318733, term318733.getClass(), "attributes", term318793);
        setField(term318567, term318567.getClass(), "attributes", term318733);
        LinkedHashMap term319054 = new LinkedHashMap();
        Class<? extends Object> term319250 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term319249 = ((Class) term319250).getDeclaredField((String) "EndTag");
        ((Field) term319249).setAccessible(true);
        Object enum885 = ((Field) term319249).get((Object) null);
        term319051 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term319052 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term319053 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term319051, term319051.getClass(), "reader", null);
        setBooleanField(term319051, term319051.getClass(), "trackErrors", false);
        setField(term319051, term319051.getClass(), "errors", null);
        setField(term319051, term319051.getClass(), "state", null);
        setField(term319052, term319052.getClass(), "tagName", null);
        setField(term319052, term319052.getClass(), "pendingAttributeName", null);
        setField(term319052, term319052.getClass(), "pendingAttributeValue", null);
        setBooleanField(term319052, term319052.getClass(), "selfClosing", false);
        setField(term319053, term319053.getClass(), "attributes", term319054);
        setField(term319052, term319052.getClass(), "attributes", term319053);
        setField(term319052, term319052.getClass(), "type", enum885);
        setField(term319051, term319051.getClass(), "emitPending", term319052);
        setBooleanField(term319051, term319051.getClass(), "isEmitPending", true);
        setField(term319051, term319051.getClass(), "charBuffer", null);
        setField(term319051, term319051.getClass(), "dataBuffer", null);
        setField(term319051, term319051.getClass(), "tagPending", null);
        setField(term319051, term319051.getClass(), "doctypePending", null);
        setField(term319051, term319051.getClass(), "commentPending", null);
        setField(term319051, term319051.getClass(), "lastStartTag", null);
        setBooleanField(term319051, term319051.getClass(), "selfClosingFlagAcknowledged", false);
        LinkedHashMap term319060 = new LinkedHashMap();
        Class<? extends Object> term319435 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term319434 = ((Class) term319435).getDeclaredField((String) "EndTag");
        ((Field) term319434).setAccessible(true);
        Object enum886 = ((Field) term319434).get((Object) null);
        term319058 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term319059 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term319058, term319058.getClass(), "tagName", null);
        setField(term319058, term319058.getClass(), "pendingAttributeName", null);
        setField(term319058, term319058.getClass(), "pendingAttributeValue", null);
        setBooleanField(term319058, term319058.getClass(), "selfClosing", false);
        setField(term319059, term319059.getClass(), "attributes", term319060);
        setField(term319058, term319058.getClass(), "attributes", term319059);
        setField(term319058, term319058.getClass(), "type", enum886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term318567;
        callMethod(klass, "emit", argTypes, term318503, args);
        assertTrue(recursiveEquals(term318503, term319051));
        assertTrue(recursiveEquals(term318567, term319058));
    }

};


