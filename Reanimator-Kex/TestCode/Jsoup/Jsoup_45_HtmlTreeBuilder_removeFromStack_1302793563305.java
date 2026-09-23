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

public class HtmlTreeBuilder_removeFromStack_1302793563305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675745;
     Object term675871;

    public HtmlTreeBuilder_removeFromStack_1302793563305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term675849 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term675797 = new ArrayList();
        ((ArrayList) term675797).add(term675849);
        ((ArrayList) term675797).add(term675849);
        ((ArrayList) term675797).add(term675849);
        ((ArrayList) term675797).add(term675849);
        term675745 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term675745, term675745.getClass(), "stack", term675797);
        Object term675874 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term675874, term675874.getClass(), "tag", null);
        setField(term675874, term675874.getClass(), "parentNode", null);
        setField(term675874, term675874.getClass(), "childNodes", null);
        setField(term675874, term675874.getClass(), "attributes", null);
        setField(term675874, term675874.getClass(), "baseUri", null);
        setIntField(term675874, term675874.getClass(), "siblingIndex", 0);
        ArrayList term675872 = new ArrayList();
        ((ArrayList) term675872).add(term675874);
        ((ArrayList) term675872).add(term675874);
        ((ArrayList) term675872).add(term675874);
        ((ArrayList) term675872).add(term675874);
        term675871 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term675871, term675871.getClass(), "state", null);
        setField(term675871, term675871.getClass(), "originalState", null);
        setBooleanField(term675871, term675871.getClass(), "baseUriSetFromDoc", false);
        setField(term675871, term675871.getClass(), "headElement", null);
        setField(term675871, term675871.getClass(), "formElement", null);
        setField(term675871, term675871.getClass(), "contextElement", null);
        setField(term675871, term675871.getClass(), "formattingElements", null);
        setField(term675871, term675871.getClass(), "pendingTableCharacters", null);
        setField(term675871, term675871.getClass(), "emptyEnd", null);
        setBooleanField(term675871, term675871.getClass(), "framesetOk", false);
        setBooleanField(term675871, term675871.getClass(), "fosterInserts", false);
        setBooleanField(term675871, term675871.getClass(), "fragmentParsing", false);
        setField(term675871, term675871.getClass(), "specificScopeTarget", null);
        setField(term675871, term675871.getClass(), "reader", null);
        setField(term675871, term675871.getClass(), "tokeniser", null);
        setField(term675871, term675871.getClass(), "doc", null);
        setField(term675871, term675871.getClass(), "stack", term675872);
        setField(term675871, term675871.getClass(), "baseUri", null);
        setField(term675871, term675871.getClass(), "currentToken", null);
        setField(term675871, term675871.getClass(), "errors", null);
        setField(term675871, term675871.getClass(), "start", null);
        setField(term675871, term675871.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term675745, args);
        assertTrue(recursiveEquals(term675745, term675871));
        assertTrue(recursiveEquals(retValue, false));
    }

};


