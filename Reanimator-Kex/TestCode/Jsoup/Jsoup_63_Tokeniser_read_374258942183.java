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

public class Tokeniser_read_374258942183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178468;
     Object term178672;
     Object term178646;

    public Tokeniser_read_374258942183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term178382 = (char[]) newCharArray(0);
        StringBuilder term178528 = new StringBuilder();
        ((StringBuilder) term178528).append(term178382);
        term178468 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term178636 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setBooleanField(term178468, term178468.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term178468, term178468.getClass(), "isEmitPending", true);
        setField(term178468, term178468.getClass(), "charsBuilder", term178528);
        setField(term178468, term178468.getClass(), "charsString", "");
        setField(term178468, term178468.getClass(), "charPending", term178636);
        term178672 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term178673 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term178674 = (byte[]) newByteArray(16);
        Object term178675 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term178672, term178672.getClass(), "reader", null);
        setField(term178672, term178672.getClass(), "errors", null);
        setField(term178672, term178672.getClass(), "state", null);
        setField(term178672, term178672.getClass(), "emitPending", null);
        setBooleanField(term178672, term178672.getClass(), "isEmitPending", true);
        setField(term178672, term178672.getClass(), "charsString", null);
        setField(term178673, term178673.getClass(), "value", term178674);
        setByteField(term178673, term178673.getClass(), "coder", (byte) 0);
        setIntField(term178673, term178673.getClass(), "count", 0);
        setField(term178672, term178672.getClass(), "charsBuilder", term178673);
        setField(term178672, term178672.getClass(), "dataBuffer", null);
        setField(term178672, term178672.getClass(), "tagPending", null);
        setField(term178672, term178672.getClass(), "startPending", null);
        setField(term178672, term178672.getClass(), "endPending", null);
        setField(term178675, term178675.getClass(), "data", "");
        setField(term178675, term178675.getClass(), "type", null);
        setField(term178672, term178672.getClass(), "charPending", term178675);
        setField(term178672, term178672.getClass(), "doctypePending", null);
        setField(term178672, term178672.getClass(), "commentPending", null);
        setField(term178672, term178672.getClass(), "lastStartTag", null);
        setBooleanField(term178672, term178672.getClass(), "selfClosingFlagAcknowledged", true);
        setField(term178672, term178672.getClass(), "codepointHolder", null);
        setField(term178672, term178672.getClass(), "multipointHolder", null);
        term178646 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term178646, term178646.getClass(), "data", "");
        setField(term178646, term178646.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term178468, args);
        assertTrue(recursiveEquals(term178468, term178672));
        assertTrue(recursiveEquals(retValue, term178646));
    }

};


