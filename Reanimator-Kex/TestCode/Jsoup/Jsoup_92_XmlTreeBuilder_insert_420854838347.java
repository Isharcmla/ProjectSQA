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

public class XmlTreeBuilder_insert_420854838347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339079;
     Object term339313;
     Object term339698;
     Object term339703;

    public XmlTreeBuilder_insert_420854838347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term339243 = new ArrayList();
        Object term339191 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term339191, term339191.getClass(), "childNodes", term339243);
        ArrayList term339131 = new ArrayList();
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add((Object)null);
        ((ArrayList) term339131).add(term339191);
        term339079 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term339079, term339079.getClass(), "stack", term339131);
        term339313 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term339313, term339313.getClass(), "data", "");
        ArrayList term339702 = new ArrayList();
        ((ArrayList) term339702).add((Object)null);
        Object term339701 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term339701, term339701.getClass(), "elements", null);
        setField(term339701, term339701.getClass(), "tag", null);
        setField(term339701, term339701.getClass(), "shadowChildrenRef", null);
        setField(term339701, term339701.getClass(), "childNodes", term339702);
        setField(term339701, term339701.getClass(), "attributes", null);
        setField(term339701, term339701.getClass(), "baseUri", null);
        setField(term339701, term339701.getClass(), "parentNode", null);
        setIntField(term339701, term339701.getClass(), "siblingIndex", 0);
        ArrayList term339699 = new ArrayList();
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add((Object)null);
        ((ArrayList) term339699).add(term339701);
        term339698 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term339698, term339698.getClass(), "parser", null);
        setField(term339698, term339698.getClass(), "reader", null);
        setField(term339698, term339698.getClass(), "tokeniser", null);
        setField(term339698, term339698.getClass(), "doc", null);
        setField(term339698, term339698.getClass(), "stack", term339699);
        setField(term339698, term339698.getClass(), "baseUri", null);
        setField(term339698, term339698.getClass(), "currentToken", null);
        setField(term339698, term339698.getClass(), "settings", null);
        setField(term339698, term339698.getClass(), "start", null);
        setField(term339698, term339698.getClass(), "end", null);
        term339703 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term339703, term339703.getClass(), "data", "");
        setField(term339703, term339703.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term339313;
        callMethod(klass, "insert", argTypes, term339079, args);
        assertTrue(recursiveEquals(term339079, term339698));
        assertTrue(recursiveEquals(term339313, term339703));
    }

};


