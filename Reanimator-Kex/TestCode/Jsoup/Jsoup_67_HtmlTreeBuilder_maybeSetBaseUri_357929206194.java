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

public class HtmlTreeBuilder_maybeSetBaseUri_357929206194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195747;
     Object term195799;
     Object term195881;
     Object term195882;

    public HtmlTreeBuilder_maybeSetBaseUri_357929206194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195747 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setBooleanField(term195747, term195747.getClass(), "baseUriSetFromDoc", false);
        term195799 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term195881 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term195881, term195881.getClass(), "state", null);
        setField(term195881, term195881.getClass(), "originalState", null);
        setBooleanField(term195881, term195881.getClass(), "baseUriSetFromDoc", false);
        setField(term195881, term195881.getClass(), "headElement", null);
        setField(term195881, term195881.getClass(), "formElement", null);
        setField(term195881, term195881.getClass(), "contextElement", null);
        setField(term195881, term195881.getClass(), "formattingElements", null);
        setField(term195881, term195881.getClass(), "pendingTableCharacters", null);
        setField(term195881, term195881.getClass(), "emptyEnd", null);
        setBooleanField(term195881, term195881.getClass(), "framesetOk", false);
        setBooleanField(term195881, term195881.getClass(), "fosterInserts", false);
        setBooleanField(term195881, term195881.getClass(), "fragmentParsing", false);
        setField(term195881, term195881.getClass(), "specificScopeTarget", null);
        setField(term195881, term195881.getClass(), "reader", null);
        setField(term195881, term195881.getClass(), "tokeniser", null);
        setField(term195881, term195881.getClass(), "doc", null);
        setField(term195881, term195881.getClass(), "stack", null);
        setField(term195881, term195881.getClass(), "baseUri", null);
        setField(term195881, term195881.getClass(), "currentToken", null);
        setField(term195881, term195881.getClass(), "errors", null);
        setField(term195881, term195881.getClass(), "settings", null);
        setField(term195881, term195881.getClass(), "start", null);
        setField(term195881, term195881.getClass(), "end", null);
        term195882 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term195883 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term195884 = (Object[]) newArray("java.lang.String", 0);
        Object[] term195885 = (Object[]) newArray("java.lang.String", 0);
        setField(term195882, term195882.getClass(), "tag", null);
        setField(term195882, term195882.getClass(), "shadowChildrenRef", null);
        setField(term195882, term195882.getClass(), "childNodes", null);
        setIntField(term195883, term195883.getClass(), "size", 0);
        setField(term195883, term195883.getClass(), "keys", term195884);
        setField(term195883, term195883.getClass(), "vals", term195885);
        setField(term195882, term195882.getClass(), "attributes", term195883);
        setField(term195882, term195882.getClass(), "baseUri", null);
        setField(term195882, term195882.getClass(), "parentNode", null);
        setIntField(term195882, term195882.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term195799;
        callMethod(klass, "maybeSetBaseUri", argTypes, term195747, args);
        assertTrue(recursiveEquals(term195747, term195881));
        assertTrue(recursiveEquals(term195799, term195882));
    }

};


