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

public class XmlTreeBuilder_insertNode_215006970301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447429;
     Object term447589;

    public XmlTreeBuilder_insertNode_215006970301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term447535 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term447481 = new ArrayList();
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add((Object)null);
        ((ArrayList) term447481).add(term447535);
        term447429 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term447429, term447429.getClass(), "stack", term447481);
        ArrayList term447695 = new ArrayList();
        term447589 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        Object term447643 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term447643, term447643.getClass(), "childNodes", term447695);
        setField(term447589, term447589.getClass(), "parentNode", term447643);
        setIntField(term447589, term447589.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term447589;
        try {
            callMethod(klass, "insertNode", argTypes, term447429, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


