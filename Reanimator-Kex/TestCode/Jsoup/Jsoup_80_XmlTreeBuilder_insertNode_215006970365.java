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

public class XmlTreeBuilder_insertNode_215006970365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360364;
     Object term360560;

    public XmlTreeBuilder_insertNode_215006970365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term360488 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term360416 = new ArrayList();
        ((ArrayList) term360416).add((Object)null);
        ((ArrayList) term360416).add(term360488);
        term360364 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term360364, term360364.getClass(), "stack", term360416);
        term360560 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term360560;
        try {
            callMethod(klass, "insertNode", argTypes, term360364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


