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
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364743;
     Object term364961;

    public XmlTreeBuilder_insertNode_215006970221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term364833 = newInstance(Class.forName("java.lang.Object"));
        Object term364905 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term364905, term364905.getClass(), "childNodes", null);
        ArrayList term364795 = new ArrayList();
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364833);
        ((ArrayList) term364795).add(term364905);
        term364743 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term364743, term364743.getClass(), "stack", term364795);
        term364961 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        setField(term364961, term364961.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term364961;
        try {
            callMethod(klass, "insertNode", argTypes, term364743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


