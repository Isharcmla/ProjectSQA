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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353284;
     Object term353564;
     Object term353703;
     Object term353709;

    public XmlTreeBuilder_insert_1967925292377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term353374 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term353498 = new ArrayList();
        Object term353446 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term353446, term353446.getClass(), "childNodes", term353498);
        ArrayList term353336 = new ArrayList();
        ((ArrayList) term353336).add(term353374);
        ((ArrayList) term353336).add(term353446);
        term353284 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term353284, term353284.getClass(), "stack", term353336);
        StringBuilder term353624 = new StringBuilder();
        term353564 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term353564, term353564.getClass(), "data", term353624);
        setBooleanField(term353564, term353564.getClass(), "bogus", false);
        Object term353706 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term353708 = new ArrayList();
        ((ArrayList) term353708).add((Object)null);
        Object term353707 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term353707, term353707.getClass(), "tag", null);
        setField(term353707, term353707.getClass(), "shadowChildrenRef", null);
        setField(term353707, term353707.getClass(), "childNodes", term353708);
        setField(term353707, term353707.getClass(), "attributes", null);
        setField(term353707, term353707.getClass(), "baseUri", null);
        setField(term353707, term353707.getClass(), "parentNode", null);
        setIntField(term353707, term353707.getClass(), "siblingIndex", 0);
        ArrayList term353704 = new ArrayList();
        ((ArrayList) term353704).add(term353706);
        ((ArrayList) term353704).add(term353707);
        term353703 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term353703, term353703.getClass(), "parser", null);
        setField(term353703, term353703.getClass(), "reader", null);
        setField(term353703, term353703.getClass(), "tokeniser", null);
        setField(term353703, term353703.getClass(), "doc", null);
        setField(term353703, term353703.getClass(), "stack", term353704);
        setField(term353703, term353703.getClass(), "baseUri", null);
        setField(term353703, term353703.getClass(), "currentToken", null);
        setField(term353703, term353703.getClass(), "settings", null);
        setField(term353703, term353703.getClass(), "start", null);
        setField(term353703, term353703.getClass(), "end", null);
        term353709 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term353710 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term353711 = (byte[]) newByteArray(16);
        setField(term353710, term353710.getClass(), "value", term353711);
        setByteField(term353710, term353710.getClass(), "coder", (byte) 0);
        setIntField(term353710, term353710.getClass(), "count", 0);
        setField(term353709, term353709.getClass(), "data", term353710);
        setBooleanField(term353709, term353709.getClass(), "bogus", false);
        setField(term353709, term353709.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term353564;
        callMethod(klass, "insert", argTypes, term353284, args);
        assertTrue(recursiveEquals(term353284, term353703));
        assertTrue(recursiveEquals(term353564, term353709));
    }

};


