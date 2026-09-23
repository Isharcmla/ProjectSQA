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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270817;
     Object term270976;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270817 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term270817, term270817.getClass(), "baseUriSetFromDoc", true);
        term270976 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term270976, term270976.getClass(), "state", null);
        setField(term270976, term270976.getClass(), "originalState", null);
        setBooleanField(term270976, term270976.getClass(), "baseUriSetFromDoc", true);
        setField(term270976, term270976.getClass(), "headElement", null);
        setField(term270976, term270976.getClass(), "formElement", null);
        setField(term270976, term270976.getClass(), "contextElement", null);
        setField(term270976, term270976.getClass(), "formattingElements", null);
        setField(term270976, term270976.getClass(), "pendingTableCharacters", null);
        setField(term270976, term270976.getClass(), "emptyEnd", null);
        setBooleanField(term270976, term270976.getClass(), "framesetOk", false);
        setBooleanField(term270976, term270976.getClass(), "fosterInserts", false);
        setBooleanField(term270976, term270976.getClass(), "fragmentParsing", false);
        setField(term270976, term270976.getClass(), "specificScopeTarget", null);
        setField(term270976, term270976.getClass(), "reader", null);
        setField(term270976, term270976.getClass(), "tokeniser", null);
        setField(term270976, term270976.getClass(), "doc", null);
        setField(term270976, term270976.getClass(), "stack", null);
        setField(term270976, term270976.getClass(), "baseUri", null);
        setField(term270976, term270976.getClass(), "currentToken", null);
        setField(term270976, term270976.getClass(), "errors", null);
        setField(term270976, term270976.getClass(), "settings", null);
        setField(term270976, term270976.getClass(), "start", null);
        setField(term270976, term270976.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maybeSetBaseUri", argTypes, term270817, args);
        assertTrue(recursiveEquals(term270817, term270976));
    }

};


