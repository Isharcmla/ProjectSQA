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

public class XmlTreeBuilder_insertNode_215006970317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458460;
     Object term458716;

    public XmlTreeBuilder_insertNode_215006970317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term458550 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term458769 = new ArrayList();
        Object term458743 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term458743, term458743.getClass(), "childNodes", term458769);
        ArrayList term458512 = new ArrayList();
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458550);
        ((ArrayList) term458512).add(term458743);
        term458460 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term458460, term458460.getClass(), "stack", term458512);
        term458716 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term458716, term458716.getClass(), "parentNode", term458743);
        setIntField(term458716, term458716.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term458716;
        try {
            callMethod(klass, "insertNode", argTypes, term458460, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


