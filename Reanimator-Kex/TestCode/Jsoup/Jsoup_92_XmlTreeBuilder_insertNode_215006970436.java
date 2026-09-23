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

public class XmlTreeBuilder_insertNode_215006970436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373297;
     Object term373583;

    public XmlTreeBuilder_insertNode_215006970436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term373387 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term373645 = new ArrayList();
        Object term373619 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term373619, term373619.getClass(), "childNodes", term373645);
        ArrayList term373349 = new ArrayList();
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373387);
        ((ArrayList) term373349).add(term373619);
        term373297 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term373297, term373297.getClass(), "stack", term373349);
        term373583 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term373583, term373583.getClass(), "parentNode", term373619);
        setIntField(term373583, term373583.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term373583;
        try {
            callMethod(klass, "insertNode", argTypes, term373297, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


