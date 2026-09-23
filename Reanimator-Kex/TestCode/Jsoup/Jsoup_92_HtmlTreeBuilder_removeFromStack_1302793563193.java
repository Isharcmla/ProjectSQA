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

public class HtmlTreeBuilder_removeFromStack_1302793563193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299715;
     Object term299779;

    public HtmlTreeBuilder_removeFromStack_1302793563193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term299767 = new ArrayList();
        term299715 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term299715, term299715.getClass(), "stack", term299767);
        ArrayList term299780 = new ArrayList();
        term299779 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term299779, term299779.getClass(), "state", null);
        setField(term299779, term299779.getClass(), "originalState", null);
        setBooleanField(term299779, term299779.getClass(), "baseUriSetFromDoc", false);
        setField(term299779, term299779.getClass(), "headElement", null);
        setField(term299779, term299779.getClass(), "formElement", null);
        setField(term299779, term299779.getClass(), "contextElement", null);
        setField(term299779, term299779.getClass(), "formattingElements", null);
        setField(term299779, term299779.getClass(), "pendingTableCharacters", null);
        setField(term299779, term299779.getClass(), "emptyEnd", null);
        setBooleanField(term299779, term299779.getClass(), "framesetOk", false);
        setBooleanField(term299779, term299779.getClass(), "fosterInserts", false);
        setBooleanField(term299779, term299779.getClass(), "fragmentParsing", false);
        setField(term299779, term299779.getClass(), "specificScopeTarget", null);
        setField(term299779, term299779.getClass(), "parser", null);
        setField(term299779, term299779.getClass(), "reader", null);
        setField(term299779, term299779.getClass(), "tokeniser", null);
        setField(term299779, term299779.getClass(), "doc", null);
        setField(term299779, term299779.getClass(), "stack", term299780);
        setField(term299779, term299779.getClass(), "baseUri", null);
        setField(term299779, term299779.getClass(), "currentToken", null);
        setField(term299779, term299779.getClass(), "settings", null);
        setField(term299779, term299779.getClass(), "start", null);
        setField(term299779, term299779.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term299715, args);
        assertTrue(recursiveEquals(term299715, term299779));
        assertTrue(recursiveEquals(retValue, false));
    }

};


