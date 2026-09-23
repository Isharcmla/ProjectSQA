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

public class HtmlTreeBuilder_pushActiveFormattingElements_1504286735185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410475;
     Object term410584;

    public HtmlTreeBuilder_pushActiveFormattingElements_1504286735185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410475 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term410557 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term410475, term410475.getClass(), "formattingElements", term410557);
        term410584 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term410585 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        Object term410586 = newInstance(Class.forName("java.util.LinkedList$Node"));
        setField(term410584, term410584.getClass(), "state", null);
        setField(term410584, term410584.getClass(), "originalState", null);
        setBooleanField(term410584, term410584.getClass(), "baseUriSetFromDoc", false);
        setField(term410584, term410584.getClass(), "headElement", null);
        setField(term410584, term410584.getClass(), "formElement", null);
        setField(term410584, term410584.getClass(), "contextElement", null);
        setIntField(term410585, term410585.getClass(), "size", 1);
        setField(term410586, term410586.getClass(), "item", null);
        setField(term410586, term410586.getClass(), "next", null);
        setField(term410586, term410586.getClass(), "prev", null);
        setField(term410585, term410585.getClass(), "first", term410586);
        setField(term410585, term410585.getClass(), "last", term410586);
        setIntField(term410585, term410585.getClass(), "modCount", 1);
        setField(term410584, term410584.getClass(), "formattingElements", term410585);
        setField(term410584, term410584.getClass(), "pendingTableCharacters", null);
        setBooleanField(term410584, term410584.getClass(), "framesetOk", false);
        setBooleanField(term410584, term410584.getClass(), "fosterInserts", false);
        setBooleanField(term410584, term410584.getClass(), "fragmentParsing", false);
        setField(term410584, term410584.getClass(), "reader", null);
        setField(term410584, term410584.getClass(), "tokeniser", null);
        setField(term410584, term410584.getClass(), "doc", null);
        setField(term410584, term410584.getClass(), "stack", null);
        setField(term410584, term410584.getClass(), "baseUri", null);
        setField(term410584, term410584.getClass(), "currentToken", null);
        setField(term410584, term410584.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushActiveFormattingElements", argTypes, term410475, args);
        assertTrue(recursiveEquals(term410475, term410584));
    }

};


