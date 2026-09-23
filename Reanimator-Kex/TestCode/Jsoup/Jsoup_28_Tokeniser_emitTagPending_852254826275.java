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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276183;
     Object term280448;

    public Tokeniser_emitTagPending_852254826275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term274129 = (char[]) newCharArray(489);
        StringBuilder term276407 = new StringBuilder();
        ((StringBuilder) term276407).append(term274129);
        term276183 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term276251 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term276347 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term276251, term276251.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term276251, term276251.getClass(), "attributes", term276347);
        setField(term276251, term276251.getClass(), "pendingAttributeValue", term276407);
        setField(term276183, term276183.getClass(), "tagPending", term276251);
        LinkedHashMap term280453 = new LinkedHashMap();
        term280448 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term280449 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term280450 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term280451 = (byte[]) newByteArray(489);
        Object term280452 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term280448, term280448.getClass(), "reader", null);
        setField(term280448, term280448.getClass(), "errors", null);
        setField(term280448, term280448.getClass(), "state", null);
        setField(term280449, term280449.getClass(), "tagName", null);
        setField(term280449, term280449.getClass(), "pendingAttributeName", null);
        setField(term280450, term280450.getClass(), "value", term280451);
        setByteField(term280450, term280450.getClass(), "coder", (byte) 0);
        setIntField(term280450, term280450.getClass(), "count", 0);
        setField(term280449, term280449.getClass(), "pendingAttributeValue", term280450);
        setBooleanField(term280449, term280449.getClass(), "selfClosing", false);
        setField(term280452, term280452.getClass(), "attributes", term280453);
        setField(term280449, term280449.getClass(), "attributes", term280452);
        setField(term280449, term280449.getClass(), "type", null);
        setField(term280448, term280448.getClass(), "emitPending", term280449);
        setBooleanField(term280448, term280448.getClass(), "isEmitPending", true);
        setField(term280448, term280448.getClass(), "charBuffer", null);
        setField(term280448, term280448.getClass(), "dataBuffer", null);
        setField(term280448, term280448.getClass(), "tagPending", term280449);
        setField(term280448, term280448.getClass(), "doctypePending", null);
        setField(term280448, term280448.getClass(), "commentPending", null);
        setField(term280448, term280448.getClass(), "lastStartTag", null);
        setBooleanField(term280448, term280448.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term276183, args);
        assertTrue(recursiveEquals(term276183, term280448));
    }

};


