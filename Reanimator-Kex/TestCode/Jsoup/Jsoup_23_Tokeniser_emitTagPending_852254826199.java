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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162083;
     Object term163335;

    public Tokeniser_emitTagPending_852254826199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162083 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term162151 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term162247 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term162151, term162151.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term162151, term162151.getClass(), "pendingAttributeValue", null);
        setField(term162151, term162151.getClass(), "attributes", term162247);
        setField(term162083, term162083.getClass(), "tagPending", term162151);
        LinkedHashMap term163338 = new LinkedHashMap();
        term163335 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term163336 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term163337 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term163335, term163335.getClass(), "reader", null);
        setField(term163335, term163335.getClass(), "errors", null);
        setField(term163335, term163335.getClass(), "state", null);
        setField(term163336, term163336.getClass(), "tagName", null);
        setField(term163336, term163336.getClass(), "pendingAttributeName", null);
        setField(term163336, term163336.getClass(), "pendingAttributeValue", null);
        setBooleanField(term163336, term163336.getClass(), "selfClosing", false);
        setField(term163337, term163337.getClass(), "attributes", term163338);
        setField(term163336, term163336.getClass(), "attributes", term163337);
        setField(term163336, term163336.getClass(), "type", null);
        setField(term163335, term163335.getClass(), "emitPending", term163336);
        setBooleanField(term163335, term163335.getClass(), "isEmitPending", true);
        setField(term163335, term163335.getClass(), "charBuffer", null);
        setField(term163335, term163335.getClass(), "dataBuffer", null);
        setField(term163335, term163335.getClass(), "tagPending", term163336);
        setField(term163335, term163335.getClass(), "doctypePending", null);
        setField(term163335, term163335.getClass(), "commentPending", null);
        setField(term163335, term163335.getClass(), "lastStartTag", null);
        setBooleanField(term163335, term163335.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term162083, args);
        assertTrue(recursiveEquals(term162083, term163335));
    }

};


