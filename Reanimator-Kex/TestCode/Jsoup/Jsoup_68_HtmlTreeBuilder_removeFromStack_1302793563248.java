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

public class HtmlTreeBuilder_removeFromStack_1302793563248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254712;
     Object term254776;

    public HtmlTreeBuilder_removeFromStack_1302793563248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term254764 = new ArrayList();
        term254712 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term254712, term254712.getClass(), "stack", term254764);
        ArrayList term254777 = new ArrayList();
        term254776 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term254776, term254776.getClass(), "state", null);
        setField(term254776, term254776.getClass(), "originalState", null);
        setBooleanField(term254776, term254776.getClass(), "baseUriSetFromDoc", false);
        setField(term254776, term254776.getClass(), "headElement", null);
        setField(term254776, term254776.getClass(), "formElement", null);
        setField(term254776, term254776.getClass(), "contextElement", null);
        setField(term254776, term254776.getClass(), "formattingElements", null);
        setField(term254776, term254776.getClass(), "pendingTableCharacters", null);
        setField(term254776, term254776.getClass(), "emptyEnd", null);
        setBooleanField(term254776, term254776.getClass(), "framesetOk", false);
        setBooleanField(term254776, term254776.getClass(), "fosterInserts", false);
        setBooleanField(term254776, term254776.getClass(), "fragmentParsing", false);
        setField(term254776, term254776.getClass(), "specificScopeTarget", null);
        setField(term254776, term254776.getClass(), "reader", null);
        setField(term254776, term254776.getClass(), "tokeniser", null);
        setField(term254776, term254776.getClass(), "doc", null);
        setField(term254776, term254776.getClass(), "stack", term254777);
        setField(term254776, term254776.getClass(), "baseUri", null);
        setField(term254776, term254776.getClass(), "currentToken", null);
        setField(term254776, term254776.getClass(), "errors", null);
        setField(term254776, term254776.getClass(), "settings", null);
        setField(term254776, term254776.getClass(), "start", null);
        setField(term254776, term254776.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term254712, args);
        assertTrue(recursiveEquals(term254712, term254776));
        assertTrue(recursiveEquals(retValue, false));
    }

};


