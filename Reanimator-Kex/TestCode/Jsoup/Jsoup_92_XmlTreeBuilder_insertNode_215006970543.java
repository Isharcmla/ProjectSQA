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

public class XmlTreeBuilder_insertNode_215006970543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420734;
     Object term421008;

    public XmlTreeBuilder_insertNode_215006970543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term420824 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term421064 = new ArrayList();
        Object term421038 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term421038, term421038.getClass(), "childNodes", term421064);
        ArrayList term420786 = new ArrayList();
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term420824);
        ((ArrayList) term420786).add(term421038);
        term420734 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term420734, term420734.getClass(), "stack", term420786);
        term421008 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term421008, term421008.getClass(), "parentNode", term421038);
        setIntField(term421008, term421008.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term421008;
        try {
            callMethod(klass, "insertNode", argTypes, term420734, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


