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

public class XmlTreeBuilder_insert_420854838172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258798;
     Object term259024;
     Object term259335;
     Object term259340;

    public XmlTreeBuilder_insert_420854838172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term258962 = new ArrayList();
        Object term258910 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term258910, term258910.getClass(), "childNodes", term258962);
        ArrayList term258850 = new ArrayList();
        ((ArrayList) term258850).add(term258910);
        term258798 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term258798, term258798.getClass(), "stack", term258850);
        term259024 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term259024, term259024.getClass(), "data", null);
        ArrayList term259339 = new ArrayList();
        ((ArrayList) term259339).add((Object)null);
        Object term259338 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term259338, term259338.getClass(), "elements", null);
        setField(term259338, term259338.getClass(), "tag", null);
        setField(term259338, term259338.getClass(), "shadowChildrenRef", null);
        setField(term259338, term259338.getClass(), "childNodes", term259339);
        setField(term259338, term259338.getClass(), "attributes", null);
        setField(term259338, term259338.getClass(), "baseUri", null);
        setField(term259338, term259338.getClass(), "parentNode", null);
        setIntField(term259338, term259338.getClass(), "siblingIndex", 0);
        ArrayList term259336 = new ArrayList();
        ((ArrayList) term259336).add(term259338);
        term259335 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term259335, term259335.getClass(), "parser", null);
        setField(term259335, term259335.getClass(), "reader", null);
        setField(term259335, term259335.getClass(), "tokeniser", null);
        setField(term259335, term259335.getClass(), "doc", null);
        setField(term259335, term259335.getClass(), "stack", term259336);
        setField(term259335, term259335.getClass(), "baseUri", null);
        setField(term259335, term259335.getClass(), "currentToken", null);
        setField(term259335, term259335.getClass(), "settings", null);
        setField(term259335, term259335.getClass(), "start", null);
        setField(term259335, term259335.getClass(), "end", null);
        term259340 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term259340, term259340.getClass(), "data", null);
        setField(term259340, term259340.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term259024;
        callMethod(klass, "insert", argTypes, term258798, args);
        assertTrue(recursiveEquals(term258798, term259335));
        assertTrue(recursiveEquals(term259024, term259340));
    }

};


