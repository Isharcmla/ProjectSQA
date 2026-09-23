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
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200269;
     Object term200337;
     Object term200635;
     Object term200636;

    public XmlTreeBuilder_process_14292257559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200269 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term200642 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200641 = ((Class) term200642).getDeclaredField((String) "EOF");
        ((Field) term200641).setAccessible(true);
        Object enum278 = ((Field) term200641).get((Object) null);
        term200337 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term200337, term200337.getClass(), "type", enum278);
        term200635 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term200635, term200635.getClass(), "parser", null);
        setField(term200635, term200635.getClass(), "reader", null);
        setField(term200635, term200635.getClass(), "tokeniser", null);
        setField(term200635, term200635.getClass(), "doc", null);
        setField(term200635, term200635.getClass(), "stack", null);
        setField(term200635, term200635.getClass(), "baseUri", null);
        setField(term200635, term200635.getClass(), "currentToken", null);
        setField(term200635, term200635.getClass(), "settings", null);
        setField(term200635, term200635.getClass(), "start", null);
        setField(term200635, term200635.getClass(), "end", null);
        Class<? extends Object> term200818 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200817 = ((Class) term200818).getDeclaredField((String) "EOF");
        ((Field) term200817).setAccessible(true);
        Object enum279 = ((Field) term200817).get((Object) null);
        term200636 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term200636, term200636.getClass(), "tagName", null);
        setField(term200636, term200636.getClass(), "normalName", null);
        setField(term200636, term200636.getClass(), "pendingAttributeName", null);
        setField(term200636, term200636.getClass(), "pendingAttributeValue", null);
        setField(term200636, term200636.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term200636, term200636.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term200636, term200636.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term200636, term200636.getClass(), "selfClosing", false);
        setField(term200636, term200636.getClass(), "attributes", null);
        setField(term200636, term200636.getClass(), "type", enum279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term200337;
        Object retValue = callMethod(klass, "process", argTypes, term200269, args);
        assertTrue(recursiveEquals(term200269, term200635));
        assertTrue(recursiveEquals(term200337, term200636));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


