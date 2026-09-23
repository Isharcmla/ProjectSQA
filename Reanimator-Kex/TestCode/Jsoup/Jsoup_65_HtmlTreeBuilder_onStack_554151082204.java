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

public class HtmlTreeBuilder_onStack_554151082204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201695;
     Object term202049;

    public HtmlTreeBuilder_onStack_554151082204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term201747 = new ArrayList();
        term201695 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term201695, term201695.getClass(), "stack", term201747);
        ArrayList term202050 = new ArrayList();
        term202049 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term202049, term202049.getClass(), "state", null);
        setField(term202049, term202049.getClass(), "originalState", null);
        setBooleanField(term202049, term202049.getClass(), "baseUriSetFromDoc", false);
        setField(term202049, term202049.getClass(), "headElement", null);
        setField(term202049, term202049.getClass(), "formElement", null);
        setField(term202049, term202049.getClass(), "contextElement", null);
        setField(term202049, term202049.getClass(), "formattingElements", null);
        setField(term202049, term202049.getClass(), "pendingTableCharacters", null);
        setField(term202049, term202049.getClass(), "emptyEnd", null);
        setBooleanField(term202049, term202049.getClass(), "framesetOk", false);
        setBooleanField(term202049, term202049.getClass(), "fosterInserts", false);
        setBooleanField(term202049, term202049.getClass(), "fragmentParsing", false);
        setField(term202049, term202049.getClass(), "specificScopeTarget", null);
        setField(term202049, term202049.getClass(), "reader", null);
        setField(term202049, term202049.getClass(), "tokeniser", null);
        setField(term202049, term202049.getClass(), "doc", null);
        setField(term202049, term202049.getClass(), "stack", term202050);
        setField(term202049, term202049.getClass(), "baseUri", null);
        setField(term202049, term202049.getClass(), "currentToken", null);
        setField(term202049, term202049.getClass(), "errors", null);
        setField(term202049, term202049.getClass(), "settings", null);
        setField(term202049, term202049.getClass(), "start", null);
        setField(term202049, term202049.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStack", argTypes, term201695, args);
        assertTrue(recursiveEquals(term201695, term202049));
    }

};


