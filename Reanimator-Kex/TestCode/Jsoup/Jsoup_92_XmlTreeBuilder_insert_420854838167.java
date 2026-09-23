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

public class XmlTreeBuilder_insert_420854838167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257675;
     Object term257901;
     Object term257997;
     Object term258002;

    public XmlTreeBuilder_insert_420854838167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term257839 = new ArrayList();
        Object term257787 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term257787, term257787.getClass(), "childNodes", term257839);
        ArrayList term257727 = new ArrayList();
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add((Object)null);
        ((ArrayList) term257727).add(term257787);
        term257675 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term257675, term257675.getClass(), "stack", term257727);
        term257901 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term257901, term257901.getClass(), "data", "");
        ArrayList term258001 = new ArrayList();
        ((ArrayList) term258001).add((Object)null);
        Object term258000 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term258000, term258000.getClass(), "elements", null);
        setField(term258000, term258000.getClass(), "tag", null);
        setField(term258000, term258000.getClass(), "shadowChildrenRef", null);
        setField(term258000, term258000.getClass(), "childNodes", term258001);
        setField(term258000, term258000.getClass(), "attributes", null);
        setField(term258000, term258000.getClass(), "baseUri", null);
        setField(term258000, term258000.getClass(), "parentNode", null);
        setIntField(term258000, term258000.getClass(), "siblingIndex", 0);
        ArrayList term257998 = new ArrayList();
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add((Object)null);
        ((ArrayList) term257998).add(term258000);
        term257997 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term257997, term257997.getClass(), "parser", null);
        setField(term257997, term257997.getClass(), "reader", null);
        setField(term257997, term257997.getClass(), "tokeniser", null);
        setField(term257997, term257997.getClass(), "doc", null);
        setField(term257997, term257997.getClass(), "stack", term257998);
        setField(term257997, term257997.getClass(), "baseUri", null);
        setField(term257997, term257997.getClass(), "currentToken", null);
        setField(term257997, term257997.getClass(), "settings", null);
        setField(term257997, term257997.getClass(), "start", null);
        setField(term257997, term257997.getClass(), "end", null);
        term258002 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term258002, term258002.getClass(), "data", "");
        setField(term258002, term258002.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term257901;
        callMethod(klass, "insert", argTypes, term257675, args);
        assertTrue(recursiveEquals(term257675, term257997));
        assertTrue(recursiveEquals(term257901, term258002));
    }

};


