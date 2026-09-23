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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_removeFromStack_1302793563136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43795;

    public HtmlTreeBuilder_removeFromStack_1302793563136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43795 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term43795, term43795.getClass(), "state", null);
        setField(term43795, term43795.getClass(), "originalState", null);
        setBooleanField(term43795, term43795.getClass(), "baseUriSetFromDoc", false);
        setField(term43795, term43795.getClass(), "headElement", null);
        setField(term43795, term43795.getClass(), "formElement", null);
        setField(term43795, term43795.getClass(), "contextElement", null);
        setField(term43795, term43795.getClass(), "formattingElements", null);
        setField(term43795, term43795.getClass(), "pendingTableCharacters", null);
        setField(term43795, term43795.getClass(), "emptyEnd", null);
        setBooleanField(term43795, term43795.getClass(), "framesetOk", false);
        setBooleanField(term43795, term43795.getClass(), "fosterInserts", false);
        setBooleanField(term43795, term43795.getClass(), "fragmentParsing", false);
        setField(term43795, term43795.getClass(), "specificScopeTarget", null);
        setField(term43795, term43795.getClass(), "parser", null);
        setField(term43795, term43795.getClass(), "reader", null);
        setField(term43795, term43795.getClass(), "tokeniser", null);
        setField(term43795, term43795.getClass(), "doc", null);
        setField(term43795, term43795.getClass(), "stack", null);
        setField(term43795, term43795.getClass(), "baseUri", null);
        setField(term43795, term43795.getClass(), "currentToken", null);
        setField(term43795, term43795.getClass(), "settings", null);
        setField(term43795, term43795.getClass(), "start", null);
        setField(term43795, term43795.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromStack", argTypes, term43795, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


