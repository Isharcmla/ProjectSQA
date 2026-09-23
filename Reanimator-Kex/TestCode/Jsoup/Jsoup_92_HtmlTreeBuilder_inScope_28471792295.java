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

public class HtmlTreeBuilder_inScope_28471792295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334172;
     Object term334294;

    public HtmlTreeBuilder_inScope_28471792295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term334224 = new ArrayList();
        term334172 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term334172, term334172.getClass(), "stack", term334224);
        ArrayList term334295 = new ArrayList();
        term334294 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term334294, term334294.getClass(), "state", null);
        setField(term334294, term334294.getClass(), "originalState", null);
        setBooleanField(term334294, term334294.getClass(), "baseUriSetFromDoc", false);
        setField(term334294, term334294.getClass(), "headElement", null);
        setField(term334294, term334294.getClass(), "formElement", null);
        setField(term334294, term334294.getClass(), "contextElement", null);
        setField(term334294, term334294.getClass(), "formattingElements", null);
        setField(term334294, term334294.getClass(), "pendingTableCharacters", null);
        setField(term334294, term334294.getClass(), "emptyEnd", null);
        setBooleanField(term334294, term334294.getClass(), "framesetOk", false);
        setBooleanField(term334294, term334294.getClass(), "fosterInserts", false);
        setBooleanField(term334294, term334294.getClass(), "fragmentParsing", false);
        setField(term334294, term334294.getClass(), "specificScopeTarget", null);
        setField(term334294, term334294.getClass(), "parser", null);
        setField(term334294, term334294.getClass(), "reader", null);
        setField(term334294, term334294.getClass(), "tokeniser", null);
        setField(term334294, term334294.getClass(), "doc", null);
        setField(term334294, term334294.getClass(), "stack", term334295);
        setField(term334294, term334294.getClass(), "baseUri", null);
        setField(term334294, term334294.getClass(), "currentToken", null);
        setField(term334294, term334294.getClass(), "settings", null);
        setField(term334294, term334294.getClass(), "start", null);
        setField(term334294, term334294.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inScope", argTypes, term334172, args);
        assertTrue(recursiveEquals(term334172, term334294));
    }

};


