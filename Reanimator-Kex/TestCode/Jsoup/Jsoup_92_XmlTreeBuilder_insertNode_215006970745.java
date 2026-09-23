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

public class XmlTreeBuilder_insertNode_215006970745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578005;
     Object term578267;

    public XmlTreeBuilder_insertNode_215006970745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term578095 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term578323 = new ArrayList();
        Object term578297 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term578297, term578297.getClass(), "childNodes", term578323);
        ArrayList term578057 = new ArrayList();
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578095);
        ((ArrayList) term578057).add(term578297);
        term578005 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term578005, term578005.getClass(), "stack", term578057);
        term578267 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term578267, term578267.getClass(), "parentNode", term578297);
        setIntField(term578267, term578267.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term578267;
        try {
            callMethod(klass, "insertNode", argTypes, term578005, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


