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

public class HtmlTreeBuilder_aboveOnStack_665381070211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418901;
     Object term419035;
     Object term419064;
     Object term419066;

    public HtmlTreeBuilder_aboveOnStack_665381070211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418901 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term418983 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term418901, term418901.getClass(), "stack", term418983);
        term419035 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term419064 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term419065 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term419064, term419064.getClass(), "state", null);
        setField(term419064, term419064.getClass(), "originalState", null);
        setBooleanField(term419064, term419064.getClass(), "baseUriSetFromDoc", false);
        setField(term419064, term419064.getClass(), "headElement", null);
        setField(term419064, term419064.getClass(), "formElement", null);
        setField(term419064, term419064.getClass(), "contextElement", null);
        setField(term419064, term419064.getClass(), "formattingElements", null);
        setField(term419064, term419064.getClass(), "pendingTableCharacters", null);
        setBooleanField(term419064, term419064.getClass(), "framesetOk", false);
        setBooleanField(term419064, term419064.getClass(), "fosterInserts", false);
        setBooleanField(term419064, term419064.getClass(), "fragmentParsing", false);
        setField(term419064, term419064.getClass(), "reader", null);
        setField(term419064, term419064.getClass(), "tokeniser", null);
        setField(term419064, term419064.getClass(), "doc", null);
        setIntField(term419065, term419065.getClass(), "size", 0);
        setField(term419065, term419065.getClass(), "first", null);
        setField(term419065, term419065.getClass(), "last", null);
        setIntField(term419065, term419065.getClass(), "modCount", 0);
        setField(term419064, term419064.getClass(), "stack", term419065);
        setField(term419064, term419064.getClass(), "baseUri", null);
        setField(term419064, term419064.getClass(), "currentToken", null);
        setField(term419064, term419064.getClass(), "errors", null);
        term419066 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term419066, term419066.getClass(), "tag", null);
        setField(term419066, term419066.getClass(), "classNames", null);
        setField(term419066, term419066.getClass(), "parentNode", null);
        setField(term419066, term419066.getClass(), "childNodes", null);
        setField(term419066, term419066.getClass(), "attributes", null);
        setField(term419066, term419066.getClass(), "baseUri", null);
        setIntField(term419066, term419066.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term419035;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term418901, args);
        assertTrue(recursiveEquals(term418901, term419064));
        assertTrue(recursiveEquals(term419035, term419066));
        assertTrue(recursiveEquals(retValue, null));
    }

};


