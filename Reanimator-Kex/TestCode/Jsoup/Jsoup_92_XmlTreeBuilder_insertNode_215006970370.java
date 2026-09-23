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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349788;
     Object term350062;

    public XmlTreeBuilder_insertNode_215006970370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term349878 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term350124 = new ArrayList();
        Object term350098 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term350098, term350098.getClass(), "childNodes", term350124);
        ArrayList term349840 = new ArrayList();
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term349878);
        ((ArrayList) term349840).add(term350098);
        term349788 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term349788, term349788.getClass(), "stack", term349840);
        term350062 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term350062, term350062.getClass(), "parentNode", term350098);
        setIntField(term350062, term350062.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term350062;
        try {
            callMethod(klass, "insertNode", argTypes, term349788, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


