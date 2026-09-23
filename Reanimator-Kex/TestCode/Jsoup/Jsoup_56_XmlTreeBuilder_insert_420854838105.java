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

public class XmlTreeBuilder_insert_420854838105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131406;
     Object term131672;
     Object term131767;
     Object term131773;

    public XmlTreeBuilder_insert_420854838105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term131496 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term131602 = new ArrayList();
        Object term131550 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term131550, term131550.getClass(), "childNodes", term131602);
        ArrayList term131458 = new ArrayList();
        ((ArrayList) term131458).add(term131496);
        ((ArrayList) term131458).add(term131550);
        term131406 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term131406, term131406.getClass(), "baseUri", null);
        setField(term131406, term131406.getClass(), "stack", term131458);
        term131672 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term131672, term131672.getClass(), "data", "");
        Object term131770 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term131772 = new ArrayList();
        ((ArrayList) term131772).add((Object)null);
        Object term131771 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term131771, term131771.getClass(), "outputSettings", null);
        setField(term131771, term131771.getClass(), "quirksMode", null);
        setField(term131771, term131771.getClass(), "location", null);
        setBooleanField(term131771, term131771.getClass(), "updateMetaCharset", false);
        setField(term131771, term131771.getClass(), "tag", null);
        setField(term131771, term131771.getClass(), "parentNode", null);
        setField(term131771, term131771.getClass(), "childNodes", term131772);
        setField(term131771, term131771.getClass(), "attributes", null);
        setField(term131771, term131771.getClass(), "baseUri", null);
        setIntField(term131771, term131771.getClass(), "siblingIndex", 0);
        ArrayList term131768 = new ArrayList();
        ((ArrayList) term131768).add(term131770);
        ((ArrayList) term131768).add(term131771);
        term131767 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term131767, term131767.getClass(), "reader", null);
        setField(term131767, term131767.getClass(), "tokeniser", null);
        setField(term131767, term131767.getClass(), "doc", null);
        setField(term131767, term131767.getClass(), "stack", term131768);
        setField(term131767, term131767.getClass(), "baseUri", null);
        setField(term131767, term131767.getClass(), "currentToken", null);
        setField(term131767, term131767.getClass(), "errors", null);
        setField(term131767, term131767.getClass(), "settings", null);
        setField(term131767, term131767.getClass(), "start", null);
        setField(term131767, term131767.getClass(), "end", null);
        term131773 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term131773, term131773.getClass(), "data", "");
        setField(term131773, term131773.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term131672;
        callMethod(klass, "insert", argTypes, term131406, args);
        assertTrue(recursiveEquals(term131406, term131767));
        assertTrue(recursiveEquals(term131672, term131773));
    }

};


