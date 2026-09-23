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

public class HtmlTreeBuilder_removeFromStack_1302793563290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227410;
     Object term227474;

    public HtmlTreeBuilder_removeFromStack_1302793563290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term227462 = new ArrayList();
        term227410 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227410, term227410.getClass(), "stack", term227462);
        ArrayList term227475 = new ArrayList();
        term227474 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227474, term227474.getClass(), "state", null);
        setField(term227474, term227474.getClass(), "originalState", null);
        setBooleanField(term227474, term227474.getClass(), "baseUriSetFromDoc", false);
        setField(term227474, term227474.getClass(), "headElement", null);
        setField(term227474, term227474.getClass(), "formElement", null);
        setField(term227474, term227474.getClass(), "contextElement", null);
        setField(term227474, term227474.getClass(), "formattingElements", null);
        setField(term227474, term227474.getClass(), "pendingTableCharacters", null);
        setField(term227474, term227474.getClass(), "emptyEnd", null);
        setBooleanField(term227474, term227474.getClass(), "framesetOk", false);
        setBooleanField(term227474, term227474.getClass(), "fosterInserts", false);
        setBooleanField(term227474, term227474.getClass(), "fragmentParsing", false);
        setField(term227474, term227474.getClass(), "specificScopeTarget", null);
        setField(term227474, term227474.getClass(), "reader", null);
        setField(term227474, term227474.getClass(), "tokeniser", null);
        setField(term227474, term227474.getClass(), "doc", null);
        setField(term227474, term227474.getClass(), "stack", term227475);
        setField(term227474, term227474.getClass(), "baseUri", null);
        setField(term227474, term227474.getClass(), "currentToken", null);
        setField(term227474, term227474.getClass(), "errors", null);
        setField(term227474, term227474.getClass(), "settings", null);
        setField(term227474, term227474.getClass(), "start", null);
        setField(term227474, term227474.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term227410, args);
        assertTrue(recursiveEquals(term227410, term227474));
        assertTrue(recursiveEquals(retValue, false));
    }

};


