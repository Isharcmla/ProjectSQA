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

public class XmlTreeBuilder_insertNode_215006970269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307837;
     Object term308015;

    public XmlTreeBuilder_insertNode_215006970269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term307961 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term307889 = new ArrayList();
        ((ArrayList) term307889).add((Object)null);
        ((ArrayList) term307889).add(term307961);
        term307837 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term307837, term307837.getClass(), "stack", term307889);
        term308015 = newInstance(Class.forName("org.jsoup.nodes.Document"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term308015;
        try {
            callMethod(klass, "insertNode", argTypes, term307837, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


