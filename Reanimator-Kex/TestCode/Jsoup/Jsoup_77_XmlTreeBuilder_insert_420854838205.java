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

public class XmlTreeBuilder_insert_420854838205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350482;
     Object term350702;
     Object term350802;
     Object term350807;

    public XmlTreeBuilder_insert_420854838205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term350640 = new ArrayList();
        Object term350588 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term350588, term350588.getClass(), "childNodes", term350640);
        ArrayList term350534 = new ArrayList();
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add((Object)null);
        ((ArrayList) term350534).add(term350588);
        term350482 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term350482, term350482.getClass(), "stack", term350534);
        term350702 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term350702, term350702.getClass(), "data", "");
        ArrayList term350806 = new ArrayList();
        ((ArrayList) term350806).add((Object)null);
        Object term350805 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term350805, term350805.getClass(), "outputSettings", null);
        setField(term350805, term350805.getClass(), "quirksMode", null);
        setField(term350805, term350805.getClass(), "location", null);
        setBooleanField(term350805, term350805.getClass(), "updateMetaCharset", false);
        setField(term350805, term350805.getClass(), "tag", null);
        setField(term350805, term350805.getClass(), "shadowChildrenRef", null);
        setField(term350805, term350805.getClass(), "childNodes", term350806);
        setField(term350805, term350805.getClass(), "attributes", null);
        setField(term350805, term350805.getClass(), "baseUri", null);
        setField(term350805, term350805.getClass(), "parentNode", null);
        setIntField(term350805, term350805.getClass(), "siblingIndex", 0);
        ArrayList term350803 = new ArrayList();
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add((Object)null);
        ((ArrayList) term350803).add(term350805);
        term350802 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term350802, term350802.getClass(), "reader", null);
        setField(term350802, term350802.getClass(), "tokeniser", null);
        setField(term350802, term350802.getClass(), "doc", null);
        setField(term350802, term350802.getClass(), "stack", term350803);
        setField(term350802, term350802.getClass(), "baseUri", null);
        setField(term350802, term350802.getClass(), "currentToken", null);
        setField(term350802, term350802.getClass(), "errors", null);
        setField(term350802, term350802.getClass(), "settings", null);
        setField(term350802, term350802.getClass(), "start", null);
        setField(term350802, term350802.getClass(), "end", null);
        term350807 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term350807, term350807.getClass(), "data", "");
        setField(term350807, term350807.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term350702;
        callMethod(klass, "insert", argTypes, term350482, args);
        assertTrue(recursiveEquals(term350482, term350802));
        assertTrue(recursiveEquals(term350702, term350807));
    }

};


