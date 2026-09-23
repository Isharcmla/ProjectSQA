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

public class Tokeniser_read_37425894297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202195;
     Object term202885;

    public Tokeniser_read_37425894297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term202255 = new StringBuilder();
        term202195 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term202195, term202195.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term202195, term202195.getClass(), "isEmitPending", true);
        setField(term202195, term202195.getClass(), "charBuffer", term202255);
        term202885 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term202886 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term202887 = (byte[]) newByteArray(16);
        setField(term202885, term202885.getClass(), "reader", null);
        setBooleanField(term202885, term202885.getClass(), "trackErrors", false);
        setField(term202885, term202885.getClass(), "errors", null);
        setField(term202885, term202885.getClass(), "state", null);
        setField(term202885, term202885.getClass(), "emitPending", null);
        setBooleanField(term202885, term202885.getClass(), "isEmitPending", false);
        setField(term202886, term202886.getClass(), "value", term202887);
        setByteField(term202886, term202886.getClass(), "coder", (byte) 0);
        setIntField(term202886, term202886.getClass(), "count", 0);
        setField(term202885, term202885.getClass(), "charBuffer", term202886);
        setField(term202885, term202885.getClass(), "dataBuffer", null);
        setField(term202885, term202885.getClass(), "tagPending", null);
        setField(term202885, term202885.getClass(), "doctypePending", null);
        setField(term202885, term202885.getClass(), "commentPending", null);
        setField(term202885, term202885.getClass(), "lastStartTag", null);
        setBooleanField(term202885, term202885.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term202195, args);
        assertTrue(recursiveEquals(term202195, term202885));
        assertTrue(recursiveEquals(retValue, null));
    }

};


