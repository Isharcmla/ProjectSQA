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

public class Tokeniser_read_374258942141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120894;
     Object term121161;

    public Tokeniser_read_374258942141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term120954 = new StringBuilder();
        term120894 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term120894, term120894.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term120894, term120894.getClass(), "isEmitPending", true);
        setField(term120894, term120894.getClass(), "charBuffer", term120954);
        term121161 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term121162 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term121163 = (byte[]) newByteArray(16);
        setField(term121161, term121161.getClass(), "reader", null);
        setField(term121161, term121161.getClass(), "errors", null);
        setField(term121161, term121161.getClass(), "state", null);
        setField(term121161, term121161.getClass(), "emitPending", null);
        setBooleanField(term121161, term121161.getClass(), "isEmitPending", false);
        setField(term121162, term121162.getClass(), "value", term121163);
        setByteField(term121162, term121162.getClass(), "coder", (byte) 0);
        setIntField(term121162, term121162.getClass(), "count", 0);
        setField(term121161, term121161.getClass(), "charBuffer", term121162);
        setField(term121161, term121161.getClass(), "dataBuffer", null);
        setField(term121161, term121161.getClass(), "tagPending", null);
        setField(term121161, term121161.getClass(), "doctypePending", null);
        setField(term121161, term121161.getClass(), "commentPending", null);
        setField(term121161, term121161.getClass(), "lastStartTag", null);
        setBooleanField(term121161, term121161.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term120894, args);
        assertTrue(recursiveEquals(term120894, term121161));
        assertTrue(recursiveEquals(retValue, null));
    }

};


