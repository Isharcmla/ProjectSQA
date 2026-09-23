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

public class XmlTreeBuilder_insertNode_215006970287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328119;
     Object term328335;

    public XmlTreeBuilder_insertNode_215006970287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term328209 = newInstance(Class.forName("java.lang.Object"));
        Object term328281 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term328281, term328281.getClass(), "childNodes", null);
        ArrayList term328171 = new ArrayList();
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328209);
        ((ArrayList) term328171).add(term328281);
        term328119 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term328119, term328119.getClass(), "stack", term328171);
        term328335 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        setField(term328335, term328335.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term328335;
        try {
            callMethod(klass, "insertNode", argTypes, term328119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


