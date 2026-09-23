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

public class XmlTreeBuilder_insertNode_215006970346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338668;
     Object term338872;

    public XmlTreeBuilder_insertNode_215006970346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term338758 = newInstance(Class.forName("java.lang.Object"));
        Object term338812 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term338720 = new ArrayList();
        ((ArrayList) term338720).add(term338758);
        ((ArrayList) term338720).add(term338812);
        term338668 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term338668, term338668.getClass(), "stack", term338720);
        term338872 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term338924 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term338924, term338924.getClass(), "childNodes", null);
        setField(term338872, term338872.getClass(), "parentNode", term338924);
        setIntField(term338872, term338872.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term338872;
        try {
            callMethod(klass, "insertNode", argTypes, term338668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


