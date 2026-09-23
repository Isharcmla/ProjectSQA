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
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123653;
     Object term123925;
     Object term124022;
     Object term124029;

    public XmlTreeBuilder_insert_420854838113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term123855 = new ArrayList();
        Object term123803 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term123803, term123803.getClass(), "childNodes", term123855);
        ArrayList term123743 = new ArrayList();
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add((Object)null);
        ((ArrayList) term123743).add(term123803);
        term123653 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term123653, term123653.getClass(), "baseUri", "");
        setField(term123653, term123653.getClass(), "stack", term123743);
        term123925 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term123925, term123925.getClass(), "data", "");
        ArrayList term124026 = new ArrayList();
        ((ArrayList) term124026).add((Object)null);
        Object term124025 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term124025, term124025.getClass(), "elements", null);
        setField(term124025, term124025.getClass(), "tag", null);
        setField(term124025, term124025.getClass(), "parentNode", null);
        setField(term124025, term124025.getClass(), "childNodes", term124026);
        setField(term124025, term124025.getClass(), "attributes", null);
        setField(term124025, term124025.getClass(), "baseUri", null);
        setIntField(term124025, term124025.getClass(), "siblingIndex", 0);
        ArrayList term124023 = new ArrayList();
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add((Object)null);
        ((ArrayList) term124023).add(term124025);
        term124022 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term124022, term124022.getClass(), "reader", null);
        setField(term124022, term124022.getClass(), "tokeniser", null);
        setField(term124022, term124022.getClass(), "doc", null);
        setField(term124022, term124022.getClass(), "stack", term124023);
        setField(term124022, term124022.getClass(), "baseUri", "");
        setField(term124022, term124022.getClass(), "currentToken", null);
        setField(term124022, term124022.getClass(), "errors", null);
        setField(term124022, term124022.getClass(), "start", null);
        setField(term124022, term124022.getClass(), "end", null);
        term124029 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term124029, term124029.getClass(), "data", "");
        setField(term124029, term124029.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term123925;
        callMethod(klass, "insert", argTypes, term123653, args);
        assertTrue(recursiveEquals(term123653, term124022));
        assertTrue(recursiveEquals(term123925, term124029));
    }

};


