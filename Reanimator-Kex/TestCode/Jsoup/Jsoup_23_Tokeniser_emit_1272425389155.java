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

public class Tokeniser_emit_1272425389155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123726;
     Object term123790;
     Object term124201;
     Object term124207;

    public Tokeniser_emit_1272425389155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123726 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term123726, term123726.getClass(), "isEmitPending", false);
        setField(term123726, term123726.getClass(), "emitPending", null);
        Class<? extends Object> term124213 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term124212 = ((Class) term124213).getDeclaredField((String) "EndTag");
        ((Field) term124212).setAccessible(true);
        Object enum311 = ((Field) term124212).get((Object) null);
        term123790 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term123956 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term123790, term123790.getClass(), "type", enum311);
        setField(term123790, term123790.getClass(), "attributes", term123956);
        Class<? extends Object> term124398 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term124397 = ((Class) term124398).getDeclaredField((String) "EndTag");
        ((Field) term124397).setAccessible(true);
        Object enum312 = ((Field) term124397).get((Object) null);
        term124201 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term124202 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term124203 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term124201, term124201.getClass(), "reader", null);
        setField(term124201, term124201.getClass(), "errors", null);
        setField(term124201, term124201.getClass(), "state", null);
        setField(term124202, term124202.getClass(), "tagName", null);
        setField(term124202, term124202.getClass(), "pendingAttributeName", null);
        setField(term124202, term124202.getClass(), "pendingAttributeValue", null);
        setBooleanField(term124202, term124202.getClass(), "selfClosing", false);
        setField(term124203, term124203.getClass(), "attributes", null);
        setField(term124202, term124202.getClass(), "attributes", term124203);
        setField(term124202, term124202.getClass(), "type", enum312);
        setField(term124201, term124201.getClass(), "emitPending", term124202);
        setBooleanField(term124201, term124201.getClass(), "isEmitPending", true);
        setField(term124201, term124201.getClass(), "charBuffer", null);
        setField(term124201, term124201.getClass(), "dataBuffer", null);
        setField(term124201, term124201.getClass(), "tagPending", null);
        setField(term124201, term124201.getClass(), "doctypePending", null);
        setField(term124201, term124201.getClass(), "commentPending", null);
        setField(term124201, term124201.getClass(), "lastStartTag", null);
        setBooleanField(term124201, term124201.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term124583 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term124582 = ((Class) term124583).getDeclaredField((String) "EndTag");
        ((Field) term124582).setAccessible(true);
        Object enum313 = ((Field) term124582).get((Object) null);
        term124207 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term124208 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term124207, term124207.getClass(), "tagName", null);
        setField(term124207, term124207.getClass(), "pendingAttributeName", null);
        setField(term124207, term124207.getClass(), "pendingAttributeValue", null);
        setBooleanField(term124207, term124207.getClass(), "selfClosing", false);
        setField(term124208, term124208.getClass(), "attributes", null);
        setField(term124207, term124207.getClass(), "attributes", term124208);
        setField(term124207, term124207.getClass(), "type", enum313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term123790;
        callMethod(klass, "emit", argTypes, term123726, args);
        assertTrue(recursiveEquals(term123726, term124201));
        assertTrue(recursiveEquals(term123790, term124207));
    }

};


