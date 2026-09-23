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

public class Tokeniser_emitTagPending_852254826227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207961;
     Object term212165;

    public Tokeniser_emitTagPending_852254826227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term205905 = (char[]) newCharArray(489);
        StringBuilder term208123 = new StringBuilder();
        ((StringBuilder) term208123).append(term205905);
        term207961 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term208025 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term208025, term208025.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term208025, term208025.getClass(), "attributes", null);
        setField(term208025, term208025.getClass(), "pendingAttributeValue", term208123);
        setField(term207961, term207961.getClass(), "tagPending", term208025);
        LinkedHashMap term212170 = new LinkedHashMap();
        term212165 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term212166 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term212167 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term212168 = (byte[]) newByteArray(489);
        Object term212169 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term212165, term212165.getClass(), "reader", null);
        setField(term212165, term212165.getClass(), "errors", null);
        setField(term212165, term212165.getClass(), "state", null);
        setField(term212166, term212166.getClass(), "tagName", null);
        setField(term212166, term212166.getClass(), "pendingAttributeName", null);
        setField(term212167, term212167.getClass(), "value", term212168);
        setByteField(term212167, term212167.getClass(), "coder", (byte) 0);
        setIntField(term212167, term212167.getClass(), "count", 0);
        setField(term212166, term212166.getClass(), "pendingAttributeValue", term212167);
        setBooleanField(term212166, term212166.getClass(), "selfClosing", false);
        setField(term212169, term212169.getClass(), "attributes", term212170);
        setField(term212166, term212166.getClass(), "attributes", term212169);
        setField(term212166, term212166.getClass(), "type", null);
        setField(term212165, term212165.getClass(), "emitPending", term212166);
        setBooleanField(term212165, term212165.getClass(), "isEmitPending", true);
        setField(term212165, term212165.getClass(), "charBuffer", null);
        setField(term212165, term212165.getClass(), "dataBuffer", null);
        setField(term212165, term212165.getClass(), "tagPending", term212166);
        setField(term212165, term212165.getClass(), "doctypePending", null);
        setField(term212165, term212165.getClass(), "commentPending", null);
        setField(term212165, term212165.getClass(), "lastStartTag", null);
        setBooleanField(term212165, term212165.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term207961, args);
        assertTrue(recursiveEquals(term207961, term212165));
    }

};


