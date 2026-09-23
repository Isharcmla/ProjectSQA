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
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_read_374258942167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131355;
     Object term131480;
     Object term131440;

    public Tokeniser_read_374258942167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term131275 = (char[]) newCharArray(1);
        StringBuilder term131415 = new StringBuilder();
        ((StringBuilder) term131415).append(term131275);
        term131355 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term131355, term131355.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term131355, term131355.getClass(), "isEmitPending", true);
        setField(term131355, term131355.getClass(), "charBuffer", term131415);
        term131480 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term131481 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term131482 = (byte[]) newByteArray(16);
        setField(term131480, term131480.getClass(), "reader", null);
        setField(term131480, term131480.getClass(), "errors", null);
        setField(term131480, term131480.getClass(), "state", null);
        setField(term131480, term131480.getClass(), "emitPending", null);
        setBooleanField(term131480, term131480.getClass(), "isEmitPending", true);
        setField(term131481, term131481.getClass(), "value", term131482);
        setByteField(term131481, term131481.getClass(), "coder", (byte) 0);
        setIntField(term131481, term131481.getClass(), "count", 0);
        setField(term131480, term131480.getClass(), "charBuffer", term131481);
        setField(term131480, term131480.getClass(), "dataBuffer", null);
        setField(term131480, term131480.getClass(), "tagPending", null);
        setField(term131480, term131480.getClass(), "doctypePending", null);
        setField(term131480, term131480.getClass(), "commentPending", null);
        setField(term131480, term131480.getClass(), "lastStartTag", null);
        setBooleanField(term131480, term131480.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term131502 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term131501 = ((Class) term131502).getDeclaredField((String) "Character");
        ((Field) term131501).setAccessible(true);
        Object enum323 = ((Field) term131501).get((Object) null);
        term131440 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term131440, term131440.getClass(), "data", " ");
        setField(term131440, term131440.getClass(), "type", enum323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term131355, args);
        assertTrue(recursiveEquals(term131355, term131480));
        assertTrue(recursiveEquals(retValue, term131440));
    }

};


