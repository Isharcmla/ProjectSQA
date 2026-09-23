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

public class XmlTreeBuilder_insert_420854838245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378045;
     Object term378283;
     Object term378379;
     Object term378384;

    public XmlTreeBuilder_insert_420854838245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term378221 = new ArrayList();
        Object term378169 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term378169, term378169.getClass(), "childNodes", term378221);
        ArrayList term378097 = new ArrayList();
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add((Object)null);
        ((ArrayList) term378097).add(term378169);
        term378045 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term378045, term378045.getClass(), "stack", term378097);
        term378283 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term378283, term378283.getClass(), "data", "");
        ArrayList term378383 = new ArrayList();
        ((ArrayList) term378383).add((Object)null);
        Object term378382 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term378382, term378382.getClass(), "tag", null);
        setField(term378382, term378382.getClass(), "shadowChildrenRef", null);
        setField(term378382, term378382.getClass(), "childNodes", term378383);
        setField(term378382, term378382.getClass(), "attributes", null);
        setField(term378382, term378382.getClass(), "baseUri", null);
        setField(term378382, term378382.getClass(), "parentNode", null);
        setIntField(term378382, term378382.getClass(), "siblingIndex", 0);
        ArrayList term378380 = new ArrayList();
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add((Object)null);
        ((ArrayList) term378380).add(term378382);
        term378379 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term378379, term378379.getClass(), "reader", null);
        setField(term378379, term378379.getClass(), "tokeniser", null);
        setField(term378379, term378379.getClass(), "doc", null);
        setField(term378379, term378379.getClass(), "stack", term378380);
        setField(term378379, term378379.getClass(), "baseUri", null);
        setField(term378379, term378379.getClass(), "currentToken", null);
        setField(term378379, term378379.getClass(), "errors", null);
        setField(term378379, term378379.getClass(), "settings", null);
        setField(term378379, term378379.getClass(), "start", null);
        setField(term378379, term378379.getClass(), "end", null);
        term378384 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term378384, term378384.getClass(), "data", "");
        setField(term378384, term378384.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term378283;
        callMethod(klass, "insert", argTypes, term378045, args);
        assertTrue(recursiveEquals(term378045, term378379));
        assertTrue(recursiveEquals(term378283, term378384));
    }

};


