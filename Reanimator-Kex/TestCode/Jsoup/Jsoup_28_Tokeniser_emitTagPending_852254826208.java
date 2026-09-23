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

public class Tokeniser_emitTagPending_852254826208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183161;
     Object term188041;

    public Tokeniser_emitTagPending_852254826208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term181105 = (char[]) newCharArray(489);
        StringBuilder term183327 = new StringBuilder();
        ((StringBuilder) term183327).append(term181105);
        term183161 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term183229 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term183229, term183229.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term183229, term183229.getClass(), "attributes", null);
        setField(term183229, term183229.getClass(), "pendingAttributeValue", term183327);
        setField(term183161, term183161.getClass(), "tagPending", term183229);
        LinkedHashMap term188046 = new LinkedHashMap();
        term188041 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term188042 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term188043 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term188044 = (byte[]) newByteArray(489);
        Object term188045 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term188041, term188041.getClass(), "reader", null);
        setField(term188041, term188041.getClass(), "errors", null);
        setField(term188041, term188041.getClass(), "state", null);
        setField(term188042, term188042.getClass(), "tagName", null);
        setField(term188042, term188042.getClass(), "pendingAttributeName", null);
        setField(term188043, term188043.getClass(), "value", term188044);
        setByteField(term188043, term188043.getClass(), "coder", (byte) 0);
        setIntField(term188043, term188043.getClass(), "count", 0);
        setField(term188042, term188042.getClass(), "pendingAttributeValue", term188043);
        setBooleanField(term188042, term188042.getClass(), "selfClosing", false);
        setField(term188045, term188045.getClass(), "attributes", term188046);
        setField(term188042, term188042.getClass(), "attributes", term188045);
        setField(term188042, term188042.getClass(), "type", null);
        setField(term188041, term188041.getClass(), "emitPending", term188042);
        setBooleanField(term188041, term188041.getClass(), "isEmitPending", true);
        setField(term188041, term188041.getClass(), "charBuffer", null);
        setField(term188041, term188041.getClass(), "dataBuffer", null);
        setField(term188041, term188041.getClass(), "tagPending", term188042);
        setField(term188041, term188041.getClass(), "doctypePending", null);
        setField(term188041, term188041.getClass(), "commentPending", null);
        setField(term188041, term188041.getClass(), "lastStartTag", null);
        setBooleanField(term188041, term188041.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term183161, args);
        assertTrue(recursiveEquals(term183161, term188041));
    }

};


