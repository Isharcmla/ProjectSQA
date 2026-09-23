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

public class XmlTreeBuilder_insert_420854838221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291374;
     Object term291620;
     Object term291716;
     Object term291721;

    public XmlTreeBuilder_insert_420854838221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term291550 = new ArrayList();
        Object term291498 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term291498, term291498.getClass(), "childNodes", term291550);
        ArrayList term291426 = new ArrayList();
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add((Object)null);
        ((ArrayList) term291426).add(term291498);
        term291374 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term291374, term291374.getClass(), "stack", term291426);
        term291620 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term291620, term291620.getClass(), "data", "");
        ArrayList term291720 = new ArrayList();
        ((ArrayList) term291720).add((Object)null);
        Object term291719 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term291719, term291719.getClass(), "tag", null);
        setField(term291719, term291719.getClass(), "shadowChildrenRef", null);
        setField(term291719, term291719.getClass(), "childNodes", term291720);
        setField(term291719, term291719.getClass(), "attributes", null);
        setField(term291719, term291719.getClass(), "baseUri", null);
        setField(term291719, term291719.getClass(), "parentNode", null);
        setIntField(term291719, term291719.getClass(), "siblingIndex", 0);
        ArrayList term291717 = new ArrayList();
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add((Object)null);
        ((ArrayList) term291717).add(term291719);
        term291716 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term291716, term291716.getClass(), "reader", null);
        setField(term291716, term291716.getClass(), "tokeniser", null);
        setField(term291716, term291716.getClass(), "doc", null);
        setField(term291716, term291716.getClass(), "stack", term291717);
        setField(term291716, term291716.getClass(), "baseUri", null);
        setField(term291716, term291716.getClass(), "currentToken", null);
        setField(term291716, term291716.getClass(), "errors", null);
        setField(term291716, term291716.getClass(), "settings", null);
        setField(term291716, term291716.getClass(), "start", null);
        setField(term291716, term291716.getClass(), "end", null);
        term291721 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term291721, term291721.getClass(), "data", "");
        setField(term291721, term291721.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term291620;
        callMethod(klass, "insert", argTypes, term291374, args);
        assertTrue(recursiveEquals(term291374, term291716));
        assertTrue(recursiveEquals(term291620, term291721));
    }

};


