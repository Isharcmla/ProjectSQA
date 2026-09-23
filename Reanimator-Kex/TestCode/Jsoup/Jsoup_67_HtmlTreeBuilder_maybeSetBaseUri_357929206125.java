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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16897;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16897 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term16897, term16897.getClass(), "state", null);
        setField(term16897, term16897.getClass(), "originalState", null);
        setBooleanField(term16897, term16897.getClass(), "baseUriSetFromDoc", false);
        setField(term16897, term16897.getClass(), "headElement", null);
        setField(term16897, term16897.getClass(), "formElement", null);
        setField(term16897, term16897.getClass(), "contextElement", null);
        setField(term16897, term16897.getClass(), "formattingElements", null);
        setField(term16897, term16897.getClass(), "pendingTableCharacters", null);
        setField(term16897, term16897.getClass(), "emptyEnd", null);
        setBooleanField(term16897, term16897.getClass(), "framesetOk", false);
        setBooleanField(term16897, term16897.getClass(), "fosterInserts", false);
        setBooleanField(term16897, term16897.getClass(), "fragmentParsing", false);
        setField(term16897, term16897.getClass(), "specificScopeTarget", null);
        setField(term16897, term16897.getClass(), "reader", null);
        setField(term16897, term16897.getClass(), "tokeniser", null);
        setField(term16897, term16897.getClass(), "doc", null);
        setField(term16897, term16897.getClass(), "stack", null);
        setField(term16897, term16897.getClass(), "baseUri", null);
        setField(term16897, term16897.getClass(), "currentToken", null);
        setField(term16897, term16897.getClass(), "errors", null);
        setField(term16897, term16897.getClass(), "settings", null);
        setField(term16897, term16897.getClass(), "start", null);
        setField(term16897, term16897.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "maybeSetBaseUri", argTypes, term16897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


