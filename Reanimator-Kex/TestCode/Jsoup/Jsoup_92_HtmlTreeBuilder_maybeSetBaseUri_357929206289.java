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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332104;
     Object term332156;
     Object term332204;
     Object term332205;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332104 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term332104, term332104.getClass(), "baseUriSetFromDoc", false);
        term332156 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term332204 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term332204, term332204.getClass(), "state", null);
        setField(term332204, term332204.getClass(), "originalState", null);
        setBooleanField(term332204, term332204.getClass(), "baseUriSetFromDoc", false);
        setField(term332204, term332204.getClass(), "headElement", null);
        setField(term332204, term332204.getClass(), "formElement", null);
        setField(term332204, term332204.getClass(), "contextElement", null);
        setField(term332204, term332204.getClass(), "formattingElements", null);
        setField(term332204, term332204.getClass(), "pendingTableCharacters", null);
        setField(term332204, term332204.getClass(), "emptyEnd", null);
        setBooleanField(term332204, term332204.getClass(), "framesetOk", false);
        setBooleanField(term332204, term332204.getClass(), "fosterInserts", false);
        setBooleanField(term332204, term332204.getClass(), "fragmentParsing", false);
        setField(term332204, term332204.getClass(), "specificScopeTarget", null);
        setField(term332204, term332204.getClass(), "parser", null);
        setField(term332204, term332204.getClass(), "reader", null);
        setField(term332204, term332204.getClass(), "tokeniser", null);
        setField(term332204, term332204.getClass(), "doc", null);
        setField(term332204, term332204.getClass(), "stack", null);
        setField(term332204, term332204.getClass(), "baseUri", null);
        setField(term332204, term332204.getClass(), "currentToken", null);
        setField(term332204, term332204.getClass(), "settings", null);
        setField(term332204, term332204.getClass(), "start", null);
        setField(term332204, term332204.getClass(), "end", null);
        term332205 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term332206 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term332207 = (Object[]) newArray("java.lang.String", 0);
        Object[] term332208 = (Object[]) newArray("java.lang.String", 0);
        setField(term332205, term332205.getClass(), "tag", null);
        setField(term332205, term332205.getClass(), "shadowChildrenRef", null);
        setField(term332205, term332205.getClass(), "childNodes", null);
        setIntField(term332206, term332206.getClass(), "size", 0);
        setField(term332206, term332206.getClass(), "keys", term332207);
        setField(term332206, term332206.getClass(), "vals", term332208);
        setField(term332205, term332205.getClass(), "attributes", term332206);
        setField(term332205, term332205.getClass(), "baseUri", null);
        setField(term332205, term332205.getClass(), "parentNode", null);
        setIntField(term332205, term332205.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term332156;
        callMethod(klass, "maybeSetBaseUri", argTypes, term332104, args);
        assertTrue(recursiveEquals(term332104, term332204));
        assertTrue(recursiveEquals(term332156, term332205));
    }

};


