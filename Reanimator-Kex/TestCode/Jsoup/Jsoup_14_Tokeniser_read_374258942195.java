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
import java.lang.StringBuilder;

public class Tokeniser_read_374258942195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288857;
     Object term289467;
     Object term289341;

    public Tokeniser_read_374258942195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289479 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term289478 = ((Class) term289479).getDeclaredField((String) "AfterAttributeName");
        ((Field) term289478).setAccessible(true);
        Object enum856 = ((Field) term289478).get((Object) null);
        StringBuilder term289099 = new StringBuilder();
        term288857 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term289039 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term288857, term288857.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term288857, term288857.getClass(), "isEmitPending", false);
        setField(term288857, term288857.getClass(), "state", enum856);
        setIntField(term289039, term289039.getClass(), "pos", -2147483648);
        setIntField(term289039, term289039.getClass(), "length", -2147483648);
        setField(term288857, term288857.getClass(), "reader", term289039);
        setField(term288857, term288857.getClass(), "charBuffer", term289099);
        Class<? extends Object> term289695 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term289694 = ((Class) term289695).getDeclaredField((String) "Data");
        ((Field) term289694).setAccessible(true);
        Object enum857 = ((Field) term289694).get((Object) null);
        Class<? extends Object> term289869 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term289868 = ((Class) term289869).getDeclaredField((String) "EOF");
        ((Field) term289868).setAccessible(true);
        Object enum858 = ((Field) term289868).get((Object) null);
        term289467 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term289468 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term289472 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Object term289476 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term289477 = (byte[]) newByteArray(16);
        setField(term289468, term289468.getClass(), "input", null);
        setIntField(term289468, term289468.getClass(), "length", -2147483648);
        setIntField(term289468, term289468.getClass(), "pos", -2147483648);
        setIntField(term289468, term289468.getClass(), "mark", 0);
        setField(term289467, term289467.getClass(), "reader", term289468);
        setBooleanField(term289467, term289467.getClass(), "trackErrors", false);
        setField(term289467, term289467.getClass(), "errors", null);
        setField(term289467, term289467.getClass(), "state", enum857);
        setField(term289472, term289472.getClass(), "type", enum858);
        setField(term289467, term289467.getClass(), "emitPending", term289472);
        setBooleanField(term289467, term289467.getClass(), "isEmitPending", false);
        setField(term289476, term289476.getClass(), "value", term289477);
        setByteField(term289476, term289476.getClass(), "coder", (byte) 0);
        setIntField(term289476, term289476.getClass(), "count", 0);
        setField(term289467, term289467.getClass(), "charBuffer", term289476);
        setField(term289467, term289467.getClass(), "dataBuffer", null);
        setField(term289467, term289467.getClass(), "tagPending", null);
        setField(term289467, term289467.getClass(), "doctypePending", null);
        setField(term289467, term289467.getClass(), "commentPending", null);
        setField(term289467, term289467.getClass(), "lastStartTag", null);
        setBooleanField(term289467, term289467.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term290061 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term290060 = ((Class) term290061).getDeclaredField((String) "EOF");
        ((Field) term290060).setAccessible(true);
        Object enum859 = ((Field) term290060).get((Object) null);
        term289341 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term289341, term289341.getClass(), "type", enum859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term288857, args);
        assertTrue(recursiveEquals(term288857, term289467));
        assertTrue(recursiveEquals(retValue, term289341));
    }

};


