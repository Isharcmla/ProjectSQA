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

public class XmlTreeBuilder_insert_42085483863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199943;
     Object term200177;
     Object term200285;
     Object term200290;

    public XmlTreeBuilder_insert_42085483863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term200107 = new ArrayList();
        Object term200055 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term200055, term200055.getClass(), "childNodes", term200107);
        ArrayList term199995 = new ArrayList();
        ((ArrayList) term199995).add((Object)null);
        ((ArrayList) term199995).add(term200055);
        term199943 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term199943, term199943.getClass(), "stack", term199995);
        term200177 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term200177, term200177.getClass(), "data", "");
        ArrayList term200289 = new ArrayList();
        ((ArrayList) term200289).add((Object)null);
        Object term200288 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term200288, term200288.getClass(), "elements", null);
        setField(term200288, term200288.getClass(), "tag", null);
        setField(term200288, term200288.getClass(), "shadowChildrenRef", null);
        setField(term200288, term200288.getClass(), "childNodes", term200289);
        setField(term200288, term200288.getClass(), "attributes", null);
        setField(term200288, term200288.getClass(), "baseUri", null);
        setField(term200288, term200288.getClass(), "parentNode", null);
        setIntField(term200288, term200288.getClass(), "siblingIndex", 0);
        ArrayList term200286 = new ArrayList();
        ((ArrayList) term200286).add((Object)null);
        ((ArrayList) term200286).add(term200288);
        term200285 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term200285, term200285.getClass(), "reader", null);
        setField(term200285, term200285.getClass(), "tokeniser", null);
        setField(term200285, term200285.getClass(), "doc", null);
        setField(term200285, term200285.getClass(), "stack", term200286);
        setField(term200285, term200285.getClass(), "baseUri", null);
        setField(term200285, term200285.getClass(), "currentToken", null);
        setField(term200285, term200285.getClass(), "errors", null);
        setField(term200285, term200285.getClass(), "settings", null);
        setField(term200285, term200285.getClass(), "start", null);
        setField(term200285, term200285.getClass(), "end", null);
        term200290 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term200290, term200290.getClass(), "data", "");
        setField(term200290, term200290.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term200177;
        callMethod(klass, "insert", argTypes, term199943, args);
        assertTrue(recursiveEquals(term199943, term200285));
        assertTrue(recursiveEquals(term200177, term200290));
    }

};


