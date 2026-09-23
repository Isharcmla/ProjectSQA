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
import java.lang.Object;

public class HtmlTreeBuilder_maybeSetBaseUri_357929206198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247087;
     Object term247139;
     Object term247463;
     Object term247464;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247087 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term247087, term247087.getClass(), "baseUriSetFromDoc", false);
        term247139 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term247463 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term247463, term247463.getClass(), "state", null);
        setField(term247463, term247463.getClass(), "originalState", null);
        setBooleanField(term247463, term247463.getClass(), "baseUriSetFromDoc", false);
        setField(term247463, term247463.getClass(), "headElement", null);
        setField(term247463, term247463.getClass(), "formElement", null);
        setField(term247463, term247463.getClass(), "contextElement", null);
        setField(term247463, term247463.getClass(), "formattingElements", null);
        setField(term247463, term247463.getClass(), "pendingTableCharacters", null);
        setField(term247463, term247463.getClass(), "emptyEnd", null);
        setBooleanField(term247463, term247463.getClass(), "framesetOk", false);
        setBooleanField(term247463, term247463.getClass(), "fosterInserts", false);
        setBooleanField(term247463, term247463.getClass(), "fragmentParsing", false);
        setField(term247463, term247463.getClass(), "specificScopeTarget", null);
        setField(term247463, term247463.getClass(), "reader", null);
        setField(term247463, term247463.getClass(), "tokeniser", null);
        setField(term247463, term247463.getClass(), "doc", null);
        setField(term247463, term247463.getClass(), "stack", null);
        setField(term247463, term247463.getClass(), "baseUri", null);
        setField(term247463, term247463.getClass(), "currentToken", null);
        setField(term247463, term247463.getClass(), "errors", null);
        setField(term247463, term247463.getClass(), "settings", null);
        setField(term247463, term247463.getClass(), "start", null);
        setField(term247463, term247463.getClass(), "end", null);
        term247464 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term247465 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term247466 = (Object[]) newArray("java.lang.String", 0);
        Object[] term247467 = (Object[]) newArray("java.lang.String", 0);
        setField(term247464, term247464.getClass(), "tag", null);
        setField(term247464, term247464.getClass(), "shadowChildrenRef", null);
        setField(term247464, term247464.getClass(), "childNodes", null);
        setIntField(term247465, term247465.getClass(), "size", 0);
        setField(term247465, term247465.getClass(), "keys", term247466);
        setField(term247465, term247465.getClass(), "vals", term247467);
        setField(term247464, term247464.getClass(), "attributes", term247465);
        setField(term247464, term247464.getClass(), "baseUri", null);
        setField(term247464, term247464.getClass(), "parentNode", null);
        setIntField(term247464, term247464.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term247139;
        callMethod(klass, "maybeSetBaseUri", argTypes, term247087, args);
        assertTrue(recursiveEquals(term247087, term247463));
        assertTrue(recursiveEquals(term247139, term247464));
    }

};


