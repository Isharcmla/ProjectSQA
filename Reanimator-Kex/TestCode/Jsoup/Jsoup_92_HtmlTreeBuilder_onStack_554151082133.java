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

public class HtmlTreeBuilder_onStack_554151082133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40643;

    public HtmlTreeBuilder_onStack_554151082133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40643 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term40643, term40643.getClass(), "state", null);
        setField(term40643, term40643.getClass(), "originalState", null);
        setBooleanField(term40643, term40643.getClass(), "baseUriSetFromDoc", false);
        setField(term40643, term40643.getClass(), "headElement", null);
        setField(term40643, term40643.getClass(), "formElement", null);
        setField(term40643, term40643.getClass(), "contextElement", null);
        setField(term40643, term40643.getClass(), "formattingElements", null);
        setField(term40643, term40643.getClass(), "pendingTableCharacters", null);
        setField(term40643, term40643.getClass(), "emptyEnd", null);
        setBooleanField(term40643, term40643.getClass(), "framesetOk", false);
        setBooleanField(term40643, term40643.getClass(), "fosterInserts", false);
        setBooleanField(term40643, term40643.getClass(), "fragmentParsing", false);
        setField(term40643, term40643.getClass(), "specificScopeTarget", null);
        setField(term40643, term40643.getClass(), "parser", null);
        setField(term40643, term40643.getClass(), "reader", null);
        setField(term40643, term40643.getClass(), "tokeniser", null);
        setField(term40643, term40643.getClass(), "doc", null);
        setField(term40643, term40643.getClass(), "stack", null);
        setField(term40643, term40643.getClass(), "baseUri", null);
        setField(term40643, term40643.getClass(), "currentToken", null);
        setField(term40643, term40643.getClass(), "settings", null);
        setField(term40643, term40643.getClass(), "start", null);
        setField(term40643, term40643.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "onStack", argTypes, term40643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


