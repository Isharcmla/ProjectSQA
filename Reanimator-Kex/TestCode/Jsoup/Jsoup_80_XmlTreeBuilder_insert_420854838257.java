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
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312689;
     Object term312909;
     Object term312960;
     Object term312965;

    public XmlTreeBuilder_insert_420854838257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term312847 = new ArrayList();
        Object term312795 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term312795, term312795.getClass(), "childNodes", term312847);
        ArrayList term312741 = new ArrayList();
        ((ArrayList) term312741).add(term312795);
        term312689 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term312689, term312689.getClass(), "stack", term312741);
        term312909 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term312909, term312909.getClass(), "data", null);
        ArrayList term312964 = new ArrayList();
        ((ArrayList) term312964).add((Object)null);
        Object term312963 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term312963, term312963.getClass(), "outputSettings", null);
        setField(term312963, term312963.getClass(), "quirksMode", null);
        setField(term312963, term312963.getClass(), "location", null);
        setBooleanField(term312963, term312963.getClass(), "updateMetaCharset", false);
        setField(term312963, term312963.getClass(), "tag", null);
        setField(term312963, term312963.getClass(), "shadowChildrenRef", null);
        setField(term312963, term312963.getClass(), "childNodes", term312964);
        setField(term312963, term312963.getClass(), "attributes", null);
        setField(term312963, term312963.getClass(), "baseUri", null);
        setField(term312963, term312963.getClass(), "parentNode", null);
        setIntField(term312963, term312963.getClass(), "siblingIndex", 0);
        ArrayList term312961 = new ArrayList();
        ((ArrayList) term312961).add(term312963);
        term312960 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term312960, term312960.getClass(), "reader", null);
        setField(term312960, term312960.getClass(), "tokeniser", null);
        setField(term312960, term312960.getClass(), "doc", null);
        setField(term312960, term312960.getClass(), "stack", term312961);
        setField(term312960, term312960.getClass(), "baseUri", null);
        setField(term312960, term312960.getClass(), "currentToken", null);
        setField(term312960, term312960.getClass(), "errors", null);
        setField(term312960, term312960.getClass(), "settings", null);
        setField(term312960, term312960.getClass(), "start", null);
        setField(term312960, term312960.getClass(), "end", null);
        term312965 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term312965, term312965.getClass(), "data", null);
        setField(term312965, term312965.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term312909;
        callMethod(klass, "insert", argTypes, term312689, args);
        assertTrue(recursiveEquals(term312689, term312960));
        assertTrue(recursiveEquals(term312909, term312965));
    }

};


