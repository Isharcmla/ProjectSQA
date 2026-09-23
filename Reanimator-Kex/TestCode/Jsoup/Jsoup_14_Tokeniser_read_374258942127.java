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

public class Tokeniser_read_374258942127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219798;
     Object term219924;
     Object term219883;

    public Tokeniser_read_374258942127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term219718 = (char[]) newCharArray(1);
        StringBuilder term219858 = new StringBuilder();
        ((StringBuilder) term219858).append(term219718);
        term219798 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term219798, term219798.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term219798, term219798.getClass(), "isEmitPending", true);
        setField(term219798, term219798.getClass(), "charBuffer", term219858);
        term219924 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term219925 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term219926 = (byte[]) newByteArray(16);
        setField(term219924, term219924.getClass(), "reader", null);
        setBooleanField(term219924, term219924.getClass(), "trackErrors", false);
        setField(term219924, term219924.getClass(), "errors", null);
        setField(term219924, term219924.getClass(), "state", null);
        setField(term219924, term219924.getClass(), "emitPending", null);
        setBooleanField(term219924, term219924.getClass(), "isEmitPending", true);
        setField(term219925, term219925.getClass(), "value", term219926);
        setByteField(term219925, term219925.getClass(), "coder", (byte) 0);
        setIntField(term219925, term219925.getClass(), "count", 0);
        setField(term219924, term219924.getClass(), "charBuffer", term219925);
        setField(term219924, term219924.getClass(), "dataBuffer", null);
        setField(term219924, term219924.getClass(), "tagPending", null);
        setField(term219924, term219924.getClass(), "doctypePending", null);
        setField(term219924, term219924.getClass(), "commentPending", null);
        setField(term219924, term219924.getClass(), "lastStartTag", null);
        setBooleanField(term219924, term219924.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term219946 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term219945 = ((Class) term219946).getDeclaredField((String) "Character");
        ((Field) term219945).setAccessible(true);
        Object enum788 = ((Field) term219945).get((Object) null);
        term219883 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term219883, term219883.getClass(), "data", " ");
        setField(term219883, term219883.getClass(), "type", enum788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term219798, args);
        assertTrue(recursiveEquals(term219798, term219924));
        assertTrue(recursiveEquals(retValue, term219883));
    }

};


