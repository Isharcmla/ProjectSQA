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

public class Tokeniser_createDoctypePending_128132921199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142510;
     Object term142707;

    public Tokeniser_createDoctypePending_128132921199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term142431 = (char[]) newCharArray(0);
        StringBuilder term142636 = new StringBuilder();
        ((StringBuilder) term142636).append(term142431);
        term142510 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term142576 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term142576, term142576.getClass(), "name", term142636);
        setField(term142576, term142576.getClass(), "pubSysKey", null);
        setField(term142576, term142576.getClass(), "publicIdentifier", null);
        setField(term142510, term142510.getClass(), "doctypePending", term142576);
        term142707 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term142708 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term142709 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term142710 = (byte[]) newByteArray(16);
        setField(term142707, term142707.getClass(), "reader", null);
        setField(term142707, term142707.getClass(), "errors", null);
        setField(term142707, term142707.getClass(), "state", null);
        setField(term142707, term142707.getClass(), "emitPending", null);
        setBooleanField(term142707, term142707.getClass(), "isEmitPending", false);
        setField(term142707, term142707.getClass(), "charsString", null);
        setField(term142707, term142707.getClass(), "charsBuilder", null);
        setField(term142707, term142707.getClass(), "dataBuffer", null);
        setField(term142707, term142707.getClass(), "tagPending", null);
        setField(term142707, term142707.getClass(), "startPending", null);
        setField(term142707, term142707.getClass(), "endPending", null);
        setField(term142707, term142707.getClass(), "charPending", null);
        setField(term142709, term142709.getClass(), "value", term142710);
        setByteField(term142709, term142709.getClass(), "coder", (byte) 0);
        setIntField(term142709, term142709.getClass(), "count", 0);
        setField(term142708, term142708.getClass(), "name", term142709);
        setField(term142708, term142708.getClass(), "pubSysKey", null);
        setField(term142708, term142708.getClass(), "publicIdentifier", null);
        setField(term142708, term142708.getClass(), "systemIdentifier", null);
        setBooleanField(term142708, term142708.getClass(), "forceQuirks", false);
        setField(term142708, term142708.getClass(), "type", null);
        setField(term142707, term142707.getClass(), "doctypePending", term142708);
        setField(term142707, term142707.getClass(), "commentPending", null);
        setField(term142707, term142707.getClass(), "lastStartTag", null);
        setBooleanField(term142707, term142707.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term142707, term142707.getClass(), "codepointHolder", null);
        setField(term142707, term142707.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDoctypePending", argTypes, term142510, args);
        assertTrue(recursiveEquals(term142510, term142707));
    }

};


