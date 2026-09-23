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

public class Tokeniser_emitTagPending_852254826205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179188;
     Object term181080;

    public Tokeniser_emitTagPending_852254826205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179188 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term179256 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term179352 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term179256, term179256.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                ");
        setField(term179256, term179256.getClass(), "attributes", term179352);
        setField(term179256, term179256.getClass(), "pendingAttributeValue", null);
        setField(term179188, term179188.getClass(), "tagPending", term179256);
        LinkedHashMap term181083 = new LinkedHashMap();
        term181080 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term181081 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term181082 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term181080, term181080.getClass(), "reader", null);
        setField(term181080, term181080.getClass(), "errors", null);
        setField(term181080, term181080.getClass(), "state", null);
        setField(term181081, term181081.getClass(), "tagName", null);
        setField(term181081, term181081.getClass(), "pendingAttributeName", null);
        setField(term181081, term181081.getClass(), "pendingAttributeValue", null);
        setBooleanField(term181081, term181081.getClass(), "selfClosing", false);
        setField(term181082, term181082.getClass(), "attributes", term181083);
        setField(term181081, term181081.getClass(), "attributes", term181082);
        setField(term181081, term181081.getClass(), "type", null);
        setField(term181080, term181080.getClass(), "emitPending", term181081);
        setBooleanField(term181080, term181080.getClass(), "isEmitPending", true);
        setField(term181080, term181080.getClass(), "charBuffer", null);
        setField(term181080, term181080.getClass(), "dataBuffer", null);
        setField(term181080, term181080.getClass(), "tagPending", term181081);
        setField(term181080, term181080.getClass(), "doctypePending", null);
        setField(term181080, term181080.getClass(), "commentPending", null);
        setField(term181080, term181080.getClass(), "lastStartTag", null);
        setBooleanField(term181080, term181080.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term179188, args);
        assertTrue(recursiveEquals(term179188, term181080));
    }

};


