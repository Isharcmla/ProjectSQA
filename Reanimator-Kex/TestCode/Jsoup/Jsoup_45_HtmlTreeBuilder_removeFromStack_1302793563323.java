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

public class HtmlTreeBuilder_removeFromStack_1302793563323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706954;
     Object term708001;

    public HtmlTreeBuilder_removeFromStack_1302793563323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term707058 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term707006 = new ArrayList();
        ((ArrayList) term707006).add(term707058);
        ((ArrayList) term707006).add(term707058);
        ((ArrayList) term707006).add(term707058);
        term706954 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term706954, term706954.getClass(), "stack", term707006);
        Object term708004 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term708004, term708004.getClass(), "tag", null);
        setField(term708004, term708004.getClass(), "parentNode", null);
        setField(term708004, term708004.getClass(), "childNodes", null);
        setField(term708004, term708004.getClass(), "attributes", null);
        setField(term708004, term708004.getClass(), "baseUri", null);
        setIntField(term708004, term708004.getClass(), "siblingIndex", 0);
        ArrayList term708002 = new ArrayList();
        ((ArrayList) term708002).add(term708004);
        ((ArrayList) term708002).add(term708004);
        ((ArrayList) term708002).add(term708004);
        term708001 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term708001, term708001.getClass(), "state", null);
        setField(term708001, term708001.getClass(), "originalState", null);
        setBooleanField(term708001, term708001.getClass(), "baseUriSetFromDoc", false);
        setField(term708001, term708001.getClass(), "headElement", null);
        setField(term708001, term708001.getClass(), "formElement", null);
        setField(term708001, term708001.getClass(), "contextElement", null);
        setField(term708001, term708001.getClass(), "formattingElements", null);
        setField(term708001, term708001.getClass(), "pendingTableCharacters", null);
        setField(term708001, term708001.getClass(), "emptyEnd", null);
        setBooleanField(term708001, term708001.getClass(), "framesetOk", false);
        setBooleanField(term708001, term708001.getClass(), "fosterInserts", false);
        setBooleanField(term708001, term708001.getClass(), "fragmentParsing", false);
        setField(term708001, term708001.getClass(), "specificScopeTarget", null);
        setField(term708001, term708001.getClass(), "reader", null);
        setField(term708001, term708001.getClass(), "tokeniser", null);
        setField(term708001, term708001.getClass(), "doc", null);
        setField(term708001, term708001.getClass(), "stack", term708002);
        setField(term708001, term708001.getClass(), "baseUri", null);
        setField(term708001, term708001.getClass(), "currentToken", null);
        setField(term708001, term708001.getClass(), "errors", null);
        setField(term708001, term708001.getClass(), "start", null);
        setField(term708001, term708001.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term706954, args);
        assertTrue(recursiveEquals(term706954, term708001));
        assertTrue(recursiveEquals(retValue, false));
    }

};


